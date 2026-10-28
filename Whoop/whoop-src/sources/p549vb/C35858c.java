package p549vb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.room.C1810m1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l80.C23436m;
import l83.EnumC23463i;
import p389p0.C28539n0;
import p518ub.InterfaceC34728a;
import p518ub.InterfaceC34734g;
import p518ub.InterfaceC34735h;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import un1.C35100f;

/* JADX INFO: renamed from: vb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C35858c implements InterfaceC34728a {

    /* JADX INFO: renamed from: E */
    public static final Object f152664E;

    /* JADX INFO: renamed from: x */
    public static final String[] f152665x = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: y */
    public static final String[] f152666y = new String[0];

    /* JADX INFO: renamed from: z */
    public static final Object f152667z;

    /* JADX INFO: renamed from: w */
    public final SQLiteDatabase f152668w;

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        f152667z = AbstractC30060g.m92087G(enumC23463i, new C35100f(2));
        f152664E = AbstractC30060g.m92087G(enumC23463i, new C35100f(3));
    }

    public C35858c(SQLiteDatabase sQLiteDatabase) {
        this.f152668w = sQLiteDatabase;
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: C0 */
    public final void mo109658C0(Object[] objArr) {
        this.f152668w.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: D */
    public final void mo109659D() {
        this.f152668w.disableWriteAheadLogging();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: E */
    public final void mo109660E(String sql) {
        AbstractC22676k.m65750j(sql, "sql");
        this.f152668w.execSQL(sql);
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: G0 */
    public final Cursor mo109661G0(String str) {
        return mo109669l0(new C28539n0(str));
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: N */
    public final boolean mo109662N() {
        return this.f152668w.enableWriteAheadLogging();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: O */
    public final void mo109663O() {
        this.f152668w.setTransactionSuccessful();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: P */
    public final void mo109664P() {
        this.f152668w.beginTransactionNonExclusive();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: V */
    public final void mo109665V() {
        this.f152668w.endTransaction();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo109666Z0() {
        return this.f152668w.isWriteAheadLoggingEnabled();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: b1 */
    public final Cursor mo109667b1(final InterfaceC34734g interfaceC34734g, CancellationSignal cancellationSignal) {
        Cursor cursorRawQueryWithFactory = this.f152668w.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: vb.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                AbstractC22676k.m65747g(sQLiteQuery);
                interfaceC34734g.mo5447i(new C1810m1(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC34734g.mo5446h(), f152666y, null, cancellationSignal);
        AbstractC22676k.m65749i(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f152668w.close();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: f1 */
    public final int mo109668f1(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb4 = new StringBuilder("UPDATE ");
        sb4.append(f152665x[3]);
        sb4.append("WorkSpec SET ");
        int i13 = 0;
        for (String str : contentValues.keySet()) {
            sb4.append(i13 > 0 ? "," : "");
            sb4.append(str);
            objArr2[i13] = contentValues.get(str);
            sb4.append("=?");
            i13++;
        }
        for (int i14 = size; i14 < length; i14++) {
            objArr2[i14] = objArr[i14 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb4.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        InterfaceC34735h interfaceC34735hMo109670r0 = mo109670r0(sb4.toString());
        AbstractC29125c.m88535l(interfaceC34735hMo109670r0, objArr2);
        return ((C35865j) interfaceC34735hMo109670r0).f152694y.executeUpdateDelete();
    }

    @Override // p518ub.InterfaceC34728a
    public final boolean isOpen() {
        return this.f152668w.isOpen();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: l0 */
    public final Cursor mo109669l0(InterfaceC34734g interfaceC34734g) {
        final C23436m c23436m = new C23436m(interfaceC34734g, 2);
        Cursor cursorRawQueryWithFactory = this.f152668w.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: vb.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) c23436m.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC34734g.mo5446h(), f152666y, null);
        AbstractC22676k.m65749i(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC34735h mo109670r0(String sql) {
        AbstractC22676k.m65750j(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f152668w.compileStatement(sql);
        AbstractC22676k.m65749i(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new C35865j(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, l83.h] */
    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: u0 */
    public final void mo109671u0() throws IllegalAccessException, InvocationTargetException {
        ?? r10 = f152664E;
        if (((Method) r10.getValue()) != null) {
            ?? r14 = f152667z;
            if (((Method) r14.getValue()) != null) {
                Method method = (Method) r10.getValue();
                AbstractC22676k.m65747g(method);
                Method method2 = (Method) r14.getValue();
                AbstractC22676k.m65747g(method2);
                Object objInvoke = method2.invoke(this.f152668w, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        mo109673y();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: v */
    public final boolean mo109672v() {
        return this.f152668w.inTransaction();
    }

    @Override // p518ub.InterfaceC34728a
    /* JADX INFO: renamed from: y */
    public final void mo109673y() {
        this.f152668w.beginTransaction();
    }
}
