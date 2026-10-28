package p033bk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.amplitude.android.migration.CursorWindowAllocationException;
import fk.InterfaceC14544a;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONObject;
import p108e4.AbstractC12682p;
import p174gk.C15923b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: bk.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C3337e extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: w */
    public final InterfaceC14544a f12952w;

    /* JADX INFO: renamed from: x */
    public final File f12953x;

    /* JADX INFO: renamed from: y */
    public boolean f12954y;

    /* JADX INFO: renamed from: z */
    public int f12955z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3337e(Context context, String databaseName, InterfaceC14544a logger) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 4);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(databaseName, "databaseName");
        AbstractC22676k.m65750j(logger, "logger");
        this.f12952w = logger;
        File databasePath = context.getDatabasePath(databaseName);
        AbstractC22676k.m65749i(databasePath, "context.getDatabasePath(databaseName)");
        this.f12953x = databasePath;
        this.f12954y = true;
        this.f12955z = 4;
    }

    /* JADX INFO: renamed from: h */
    public static void m9640h(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null || message.length() == 0) {
            throw runtimeException;
        }
        if (!AbstractC39421y.m125930O(message, "Cursor window allocation of", false) && !AbstractC39421y.m125930O(message, "Could not allocate CursorWindow", false)) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    /* JADX INFO: renamed from: J */
    public final void m9641J(long j7, String str) {
        try {
            getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j7)});
        } catch (SQLiteException e5) {
            String message = "remove events from " + str + " failed: " + e5.getMessage();
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message);
            }
            m9644b();
        } catch (StackOverflowError e13) {
            String message2 = "remove events from " + str + " failed: " + e13.getMessage();
            AbstractC22676k.m65750j(message2, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message2);
            }
            m9644b();
        } finally {
            close();
        }
    }

    /* JADX INFO: renamed from: T */
    public final synchronized void m9642T(String str) {
        m9643a0(str);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m9643a0(String str) {
        try {
            getWritableDatabase().delete("long_store", "key = ?", new String[]{str});
        } catch (SQLiteException e5) {
            String message = "remove value from long_store failed: " + e5.getMessage();
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message);
            }
            m9644b();
        } catch (StackOverflowError e13) {
            String message2 = "remove value from long_store failed: " + e13.getMessage();
            AbstractC22676k.m65750j(message2, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message2);
            }
            m9644b();
        } finally {
            close();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9644b() {
        try {
            close();
        } catch (Exception e5) {
            C15923b.f60233a.error("close failed: " + e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized Long m9645i(String str) {
        return (Long) m9647m("long_store", str);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized String m9646k(String str) {
        return (String) m9647m("store", str);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[PHI: r2 r16
      0x00c5: PHI (r2v7 ??) = (r2v14 ??), (r2v15 ??), (r2v16 ??) binds: [B:66:0x00f5, B:58:0x00c3, B:73:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r16v11 java.lang.Throwable) = (r16v8 java.lang.Throwable), (r16v10 java.lang.Throwable), (r16v13 java.lang.Throwable) binds: [B:66:0x00f5, B:58:0x00c3, B:73:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:14:0x004a, B:16:0x0053, B:18:0x005c, B:30:0x0074, B:55:0x00bc, B:56:0x00bf, B:57:0x00c0, B:61:0x00cc, B:63:0x00eb, B:64:0x00f0, B:69:0x0100, B:71:0x011f, B:72:0x0122), top: B:80:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: m */
    public final Object m9647m(String str, String str2) throws Throwable {
        String str3;
        Throwable th3;
        int i13;
        int i14;
        String str4;
        String str5;
        ?? r10;
        ?? r14;
        ?? r15;
        String message;
        ?? r16;
        ?? Query;
        Object string;
        ?? r17 = 0;
        if (!this.f12953x.exists()) {
            return null;
        }
        try {
            try {
                try {
                    SQLiteDatabase db4 = getReadableDatabase();
                    try {
                        if (!this.f12954y) {
                            close();
                            return null;
                        }
                        AbstractC22676k.m65749i(db4, "db");
                        str3 = "Amplitude";
                        th3 = null;
                        i13 = 2;
                        i14 = 4;
                        str4 = str;
                        try {
                            Query = db4.query(str4, new String[]{"key", "value"}, "key = ?", new String[]{str2}, null, null, null, null);
                            try {
                                AbstractC22676k.m65747g(Query);
                                if (Query.moveToFirst()) {
                                    string = str4.equals("store") ? Query.getString(1) : Long.valueOf(Query.getLong(1));
                                } else {
                                    string = null;
                                }
                                Query.close();
                                close();
                                return string;
                            } catch (SQLiteException e5) {
                                e = e5;
                            } catch (IllegalStateException e13) {
                                e = e13;
                                r15 = Query;
                                m9648s(e);
                                r16 = r15;
                                if (r15 != 0) {
                                    r16.close();
                                }
                                close();
                                return th3;
                            } catch (RuntimeException e14) {
                                e = e14;
                                m9640h(e);
                                throw th3;
                            } catch (StackOverflowError e15) {
                                e = e15;
                                r14 = Query;
                                message = "getValue from " + str4 + " failed: " + e.getMessage();
                                AbstractC22676k.m65750j(message, "message");
                                if (AbstractC12682p.m35482b(i13, i14) <= 0) {
                                    Log.e(str3, message);
                                }
                                m9644b();
                                if (r14 != 0) {
                                    r16 = r14;
                                    r16.close();
                                }
                                close();
                                return th3;
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            Query = th3;
                        } catch (IllegalStateException e17) {
                            e = e17;
                            r15 = th3;
                            m9648s(e);
                            r16 = r15;
                            if (r15 != 0) {
                                r16.close();
                            }
                            close();
                            return th3;
                        } catch (RuntimeException e18) {
                            e = e18;
                            m9640h(e);
                            throw th3;
                        } catch (StackOverflowError e19) {
                            e = e19;
                            r14 = th3;
                            message = "getValue from " + str4 + " failed: " + e.getMessage();
                            AbstractC22676k.m65750j(message, "message");
                            if (AbstractC12682p.m35482b(i13, i14) <= 0) {
                                Log.e(str3, message);
                            }
                            m9644b();
                            if (r14 != 0) {
                                r16 = r14;
                                r16.close();
                            }
                            close();
                            return th3;
                        } catch (Throwable th4) {
                            th = th4;
                            r17 = 0;
                            if (r17 != 0) {
                                r17.close();
                            }
                            close();
                            throw th;
                        }
                    } catch (SQLiteException e22) {
                        e = e22;
                        str3 = "Amplitude";
                        th3 = null;
                        i13 = 2;
                        i14 = 4;
                        str4 = str;
                    }
                    Query = th3;
                    str5 = str3;
                    r10 = Query;
                } catch (Throwable th5) {
                    th = th5;
                    r17 = 4;
                }
            } catch (SQLiteException e24) {
                e = e24;
                th3 = null;
                i14 = 4;
                str5 = "Amplitude";
                i13 = 2;
                str4 = str;
                r10 = 0;
            }
        } catch (IllegalStateException e25) {
            e = e25;
            th3 = null;
        } catch (RuntimeException e26) {
            e = e26;
            th3 = null;
        } catch (StackOverflowError e27) {
            e = e27;
            str3 = "Amplitude";
            th3 = null;
            i13 = 2;
            i14 = 4;
            str4 = str;
        } catch (Throwable th6) {
            th = th6;
        }
        String message2 = "getValue from " + str4 + " failed: " + e.getMessage();
        AbstractC22676k.m65750j(message2, "message");
        if (AbstractC12682p.m35482b(i13, i14) <= 0) {
            Log.e(str5, message2);
        }
        m9644b();
        r16 = r10;
        if (r10 != 0) {
            r16.close();
        }
        close();
        return th3;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db4) {
        AbstractC22676k.m65750j(db4, "db");
        this.f12954y = false;
        this.f12952w.error("Attempt to re-create existing legacy database file " + this.f12953x.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        this.f12955z = i13;
    }

    /* JADX INFO: renamed from: s */
    public final void m9648s(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message == null || message.length() == 0 || !AbstractC39414r.m125876U(message, "Couldn't read", false) || !AbstractC39414r.m125876U(message, "CursorWindow", false)) {
            throw illegalStateException;
        }
        m9644b();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c8 A[PHI: r16
      0x00c8: PHI (r16v5 android.database.Cursor) = (r16v3 android.database.Cursor), (r16v4 android.database.Cursor), (r16v6 android.database.Cursor) binds: [B:65:0x00fc, B:57:0x00c6, B:70:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final AbstractList m9649x(String str) throws Throwable {
        String str2;
        String str3;
        int i13;
        String str4;
        int i14;
        if (!this.f12953x.exists()) {
            return new ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        Cursor cursor = null;
        cursor = null;
        cursor = null;
        cursor = null;
        SQLiteCursor sQLiteCursor = 0;
        cursor = null;
        cursor = null;
        try {
            try {
                try {
                    try {
                        try {
                            SQLiteDatabase db4 = getReadableDatabase();
                            try {
                                if (!this.f12954y) {
                                    ArrayList arrayList = new ArrayList();
                                    close();
                                    return arrayList;
                                }
                                AbstractC22676k.m65749i(db4, "db");
                                str2 = str;
                                str3 = "Amplitude";
                                i13 = 4;
                                try {
                                    Cursor cursorQuery = db4.query(str2, new String[]{"id", NotificationCompat.CATEGORY_EVENT}, null, null, null, null, "id ASC", null);
                                    while (true) {
                                        try {
                                            AbstractC22676k.m65747g(cursorQuery);
                                            if (!cursorQuery.moveToNext()) {
                                                cursorQuery.close();
                                                close();
                                                return linkedList;
                                            }
                                            long j7 = cursorQuery.getLong(0);
                                            String string = cursorQuery.getString(1);
                                            if (string != null && string.length() != 0) {
                                                JSONObject jSONObject = new JSONObject(string);
                                                jSONObject.put("$rowId", j7);
                                                linkedList.add(jSONObject);
                                            }
                                        } catch (SQLiteException e5) {
                                            e = e5;
                                            cursor = cursorQuery;
                                            str4 = str3;
                                            i14 = 2;
                                            String message = "read events from " + str2 + " failed: " + e.getMessage();
                                            AbstractC22676k.m65750j(message, "message");
                                            if (AbstractC12682p.m35482b(i14, i13) <= 0) {
                                                Log.e(str4, message);
                                            }
                                            m9644b();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            close();
                                            return linkedList;
                                        } catch (IllegalStateException e13) {
                                            e = e13;
                                            cursor = cursorQuery;
                                            m9648s(e);
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            close();
                                            return linkedList;
                                        } catch (RuntimeException e14) {
                                            e = e14;
                                            m9640h(e);
                                            throw null;
                                        } catch (StackOverflowError e15) {
                                            e = e15;
                                            cursor = cursorQuery;
                                            String message2 = "read events from " + str2 + " failed: " + e.getMessage();
                                            AbstractC22676k.m65750j(message2, "message");
                                            if (AbstractC12682p.m35482b(2, i13) <= 0) {
                                                Log.e(str3, message2);
                                            }
                                            m9644b();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            close();
                                            return linkedList;
                                        }
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                } catch (StackOverflowError e17) {
                                    e = e17;
                                }
                            } catch (SQLiteException e18) {
                                e = e18;
                                str2 = str;
                                str3 = "Amplitude";
                                i13 = 4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (sQLiteCursor != 0) {
                                sQLiteCursor.close();
                            }
                            close();
                            throw th;
                        }
                    } catch (SQLiteException e19) {
                        e = e19;
                        i13 = 4;
                        str4 = "Amplitude";
                        i14 = 2;
                        str2 = str;
                    }
                } catch (StackOverflowError e22) {
                    e = e22;
                    str2 = str;
                    str3 = "Amplitude";
                    i13 = 4;
                }
            } catch (IllegalStateException e24) {
                e = e24;
            } catch (RuntimeException e25) {
                e = e25;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = 4;
        }
    }
}
