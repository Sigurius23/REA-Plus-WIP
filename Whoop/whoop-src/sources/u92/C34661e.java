package u92;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.gson.Gson;
import com.whoop.service.network.model.Sport;
import java.util.ArrayList;
import java.util.List;
import or2.C28169i0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: u92.e */
/* JADX INFO: loaded from: classes4.dex */
public class C34661e extends AbstractC34657a {

    /* JADX INFO: renamed from: d */
    private final InterfaceC34116n f146022d;

    /* JADX INFO: renamed from: e */
    private Gson f146023e;

    /* JADX INFO: renamed from: u92.e$a */
    public static class a implements C34663g.a {
        public /* synthetic */ a(int i13) {
            this();
        }

        @Override // u92.C34663g.a
        /* JADX INFO: renamed from: a */
        public void mo109548a(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        }

        @Override // u92.C34663g.a
        /* JADX INFO: renamed from: b */
        public void mo109549b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE sports (id INTEGER, sport_data TEXT NOT NULL, PRIMARY KEY (id) ON CONFLICT REPLACE )");
        }

        private a() {
        }
    }

    public C34661e(C34663g c34663g) {
        super(c34663g, "sports");
        this.f146022d = InterfaceC34116n.m107846d("Sports");
        this.f146023e = C28169i0.m85274d();
        c34663g.m109552b(new a(0));
    }

    @Override // u92.AbstractC34657a
    /* JADX INFO: renamed from: b */
    public void mo109511b(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX INFO: renamed from: c */
    public synchronized List<Sport> m109546c() {
        ArrayList arrayList;
        try {
            Cursor cursorRawQuery = m109510a().rawQuery("SELECT * from sports", null);
            arrayList = new ArrayList(cursorRawQuery.getCount());
            if (cursorRawQuery.getCount() != 0) {
                int columnIndex = cursorRawQuery.getColumnIndex("sport_data");
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add((Sport) this.f146023e.fromJson(cursorRawQuery.getString(columnIndex), Sport.class));
                }
            }
            cursorRawQuery.close();
            this.f146022d.mo85212b(".getAllSports", "Returning " + arrayList.size() + " sports", new AbstractC30556a.a[0]);
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m109547d(List<Sport> list) {
        this.f146022d.mo85212b(".save", "Inserting " + list.size() + " sports", new AbstractC30556a.a[0]);
        m109510a().beginTransaction();
        m109510a().execSQL("DELETE from sports");
        SQLiteStatement sQLiteStatementCompileStatement = m109510a().compileStatement("INSERT INTO sports VALUES (?,?)");
        try {
            for (Sport sport : list) {
                sQLiteStatementCompileStatement.clearBindings();
                sQLiteStatementCompileStatement.bindLong(1, sport.getId());
                sQLiteStatementCompileStatement.bindString(2, this.f146023e.toJson(sport));
                sQLiteStatementCompileStatement.execute();
            }
            m109510a().setTransactionSuccessful();
            m109510a().endTransaction();
        } catch (Throwable th3) {
            m109510a().endTransaction();
            throw th3;
        }
    }
}
