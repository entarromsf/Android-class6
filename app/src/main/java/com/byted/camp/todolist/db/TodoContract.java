package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量
    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + MyContract.TABLE_NAME +" ("+MyContract._ID+ " INTEGER PRIMARY KEY AUTOINCREMENT,"+MyContract.TIME+" INTEGER,"+MyContract.STATE+" INTEGER,"+MyContract.CONTENT+" TEXT);";
    public static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS "+MyContract.TABLE_NAME;

    private TodoContract() { }

    public static class MyContract implements BaseColumns{
        public static final String TABLE_NAME = "entry";
        public static final String TIME = "time";
        public static final String STATE = "state";
        public static final String CONTENT = "content";
    }

}
