package cn.kiloword.tiancms.data;

import java.util.List;

public interface IDatabase {
	boolean isConnectionWorks();

	List<String> getDatabaseNames();
}
