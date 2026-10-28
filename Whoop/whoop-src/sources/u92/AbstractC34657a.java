package u92;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: u92.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC34657a {

    /* JADX INFO: renamed from: a */
    private SQLiteDatabase f145990a;

    /* JADX INFO: renamed from: b */
    private C34663g f145991b;

    /* JADX INFO: renamed from: c */
    private String f145992c;

    public AbstractC34657a(C34663g c34663g, String str) {
        this.f145991b = c34663g;
        this.f145992c = str;
    }

    /* JADX INFO: renamed from: a */
    public SQLiteDatabase m109510a() {
        if (this.f145990a == null) {
            SQLiteDatabase writableDatabase = this.f145991b.getWritableDatabase();
            this.f145990a = writableDatabase;
            mo109511b(writableDatabase);
        }
        return this.f145990a;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo109511b(SQLiteDatabase sQLiteDatabase);
}
