/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kiloword.tiancms.common.api.ActionResult;
import cn.kiloword.tiancms.controller.model.InfoResponse;
import cn.kiloword.tiancms.controller.model.TryDatabaseRequest;
import cn.kiloword.tiancms.controller.model.TryDatabaseResponse;
import cn.kiloword.tiancms.data.Database;
import cn.kiloword.tiancms.data.DatabaseType;
import cn.kiloword.tiancms.data.IDatabase;
import cn.kiloword.tiancms.framework.ControllerBase;
import cn.kiloword.tiancms.repository.ConfigRepository;
import cn.kiloword.tiancms.service.SettingsService;
import cn.kiloword.tiancms.service.UserService;
import cn.kiloword.tiancms.util.Constants;

/**
 * @author Yun Fang
 */
@RestController
@RequestMapping("/cms")
public class CmsController extends ControllerBase {
	@Autowired
	private SettingsService settingsService;
	@Autowired
	private UserService userService;
	@Autowired
	private ConfigRepository configRepository;

	@GetMapping
	public ActionResult<InfoResponse> getInfo(HttpServletRequest request) {
		boolean installed = !StringUtils.isEmpty(settingsService.getDatabaseConnectionString());
		boolean contentRootPathWritable = false;
		boolean webRootPathWritable = false;
		if (!installed) {
			contentRootPathWritable = true;
			webRootPathWritable = true;
		}
		String apiUrl = request.getRemoteHost() + File.separator + Constants.API_PREFIX;
		String apiServerName = request.getServerName().toUpperCase();
		String productVersion = settingsService.getProductVersion();
		String contentRootPath = settingsService.getContentRootPath();
		String javaVersion = settingsService.getJavaVersion();
		String remoteIpAddress = request.getRemoteAddr();
		String pluginVersion = settingsService.getPluginVersion();
		String databaseType = settingsService.getDatabaseType().getValue();
		String database = configRepository.getDatabase().getDatabaseName();
		String cacheType = settingsService.getCacheType().getValue();
		InfoResponse ir = new InfoResponse(installed, apiUrl, apiServerName, productVersion, javaVersion,
				contentRootPath, null, contentRootPathWritable, webRootPathWritable, remoteIpAddress, pluginVersion,
				new Date(), databaseType, database, cacheType);
		return ActionResult.success(ir);
	}

	@PostMapping(path = "/install/tryDatabase")
	public ActionResult<TryDatabaseResponse> tryDatabase(@RequestBody TryDatabaseRequest database) {
		boolean installed = !StringUtils.isEmpty(settingsService.getDatabaseConnectionString());
		if (installed)
			return ActionResult.forbidden(null);

		DatabaseType databaseType = DatabaseType.parse(database.getDatabaseType());
		String connectionString = database.getConnectionString();
		if (StringUtils.isEmpty(connectionString)) {
			connectionString = getDatabaseConnectionString(databaseType, database.getServer(), database.getPort(),
					database.getUid(), database.getPwd());
		}

		IDatabase db = new Database(databaseType, connectionString);
		boolean connectionWorks = db.isConnectionWorks();

		List<String> databaseNames = null;
		if (connectionWorks) {
			databaseNames = db.getDatabaseNames();
		}

		return ActionResult.success(new TryDatabaseResponse(connectionWorks, databaseNames, null));
	}

	private String getDatabaseConnectionString(DatabaseType databaseType, String server, int port, String uid,
			String pwd) {
		// TODO Auto-generated method stub
		return null;
	}
}
