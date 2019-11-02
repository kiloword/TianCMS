/**
 * @copyright kiloword.cn
 */
package cn.kiloword.tiancms.mbg;

/**
 * @author 方云 (fangyuncn@163.com)
 *
 */
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于产生MyBatis相关的代码
 */
public class Generator {
	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<>();
		boolean overwrite = true;
		Configuration config;
		try (InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");) {
			ConfigurationParser cp = new ConfigurationParser(warnings);
			config = cp.parseConfiguration(is);
		}
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			System.out.println(warning);
		}
		System.exit(0);
	}
}
