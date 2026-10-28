package com.iterable.iterableapi;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.iterable.iterableapi.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5302a0 extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS OfflineTask (task_id TEXT PRIMARY KEY,name TEXT,version INTEGER,created BIGINT,modified BIGINT,last_attempt BIGINT,scheduled BIGINT,requested BIGINT,processing BOOLEAN,failed BOOLEAN,blocking BOOLEAN,data TEXT,error TEXT,type TEXT,attempts INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
    }
}
