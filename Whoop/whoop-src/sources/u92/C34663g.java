package u92;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: u92.g */
/* JADX INFO: loaded from: classes4.dex */
public class C34663g extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: w */
    private List<a> f146024w;

    /* JADX INFO: renamed from: u92.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo109548a(SQLiteDatabase sQLiteDatabase, int i13, int i14);

        /* JADX INFO: renamed from: b */
        void mo109549b(SQLiteDatabase sQLiteDatabase);
    }

    public C34663g(Context context, String str, int i13) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i13);
        this.f146024w = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public void m109552b(a aVar) {
        this.f146024w.add(aVar);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Iterator<a> it = this.f146024w.iterator();
        while (it.hasNext()) {
            it.next().mo109549b(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        Iterator<a> it = this.f146024w.iterator();
        while (it.hasNext()) {
            it.next().mo109548a(sQLiteDatabase, i13, i14);
        }
    }
}
