package p549vb;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p037bu.C3632c;
import p088dc.AbstractC11895b;
import p518ub.AbstractC34729b;
import p518ub.InterfaceC34728a;
import p609xb.C38160a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C35863h extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f152679H = 0;

    /* JADX INFO: renamed from: E */
    public boolean f152680E;

    /* JADX INFO: renamed from: F */
    public final C38160a f152681F;

    /* JADX INFO: renamed from: G */
    public boolean f152682G;

    /* JADX INFO: renamed from: w */
    public final Context f152683w;

    /* JADX INFO: renamed from: x */
    public final C3632c f152684x;

    /* JADX INFO: renamed from: y */
    public final AbstractC34729b f152685y;

    /* JADX INFO: renamed from: z */
    public final boolean f152686z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35863h(Context context, String str, final C3632c c3632c, final AbstractC34729b callback, boolean z4) {
        super(context, str, null, callback.f146270a, new DatabaseErrorHandler() { // from class: vb.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i13 = C35863h.f152679H;
                AbstractC22676k.m65747g(sQLiteDatabase);
                C35858c c35858cM113841d = AbstractC35862g.m113841d(c3632c, sQLiteDatabase);
                callback.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c35858cM113841d + ".path");
                SQLiteDatabase sQLiteDatabase2 = c35858cM113841d.f152668w;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        AbstractC34729b.m109674a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                AbstractC22676k.m65749i(second, "second");
                                AbstractC34729b.m109674a((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                AbstractC34729b.m109674a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    c35858cM113841d.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(callback, "callback");
        this.f152683w = context;
        this.f152684x = c3632c;
        this.f152685y = callback;
        this.f152686z = z4;
        this.f152681F = new C38160a(false, context.getCacheDir(), str == null ? AbstractC11895b.m31995n("toString(...)") : str);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC34728a m113849b(boolean z4) {
        C38160a c38160a = this.f152681F;
        try {
            c38160a.m122224a((this.f152682G || getDatabaseName() == null) ? false : true);
            this.f152680E = false;
            SQLiteDatabase sQLiteDatabaseM113850h = m113850h(z4);
            if (!this.f152680E) {
                return AbstractC35862g.m113841d(this.f152684x, sQLiteDatabaseM113850h);
            }
            close();
            return m113849b(z4);
        } finally {
            c38160a.m122225b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C38160a c38160a = this.f152681F;
        try {
            c38160a.m122224a(c38160a.f163408a);
            super.close();
            this.f152684x.f14788w = null;
            this.f152682G = false;
        } finally {
            c38160a.m122225b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final SQLiteDatabase m113850h(boolean z4) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z13 = this.f152682G;
        Context context = this.f152683w;
        if (databaseName != null && !z13 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z4) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                AbstractC22676k.m65747g(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            AbstractC22676k.m65747g(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z4) {
                    readableDatabase2 = getWritableDatabase();
                    AbstractC22676k.m65747g(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    AbstractC22676k.m65747g(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof C35860e) {
                    C35860e c35860e = (C35860e) th;
                    int iOrdinal = c35860e.f152671w.ordinal();
                    th = c35860e.f152672x;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f152686z) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z4) {
                        readableDatabase = getWritableDatabase();
                        AbstractC22676k.m65747g(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        AbstractC22676k.m65747g(readableDatabase);
                    }
                    return readableDatabase;
                } catch (C35860e e5) {
                    throw e5.f152672x;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db4) {
        AbstractC22676k.m65750j(db4, "db");
        boolean z4 = this.f152680E;
        AbstractC34729b abstractC34729b = this.f152685y;
        if (!z4 && abstractC34729b.f146270a != db4.getVersion()) {
            db4.setMaxSqlCacheSize(1);
        }
        try {
            abstractC34729b.mo5427b(AbstractC35862g.m113841d(this.f152684x, db4));
        } catch (Throwable th3) {
            throw new C35860e(EnumC35861f.f152675w, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        AbstractC22676k.m65750j(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f152685y.mo5428c(AbstractC35862g.m113841d(this.f152684x, sqLiteDatabase));
        } catch (Throwable th3) {
            throw new C35860e(EnumC35861f.f152676x, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db4, int i13, int i14) {
        AbstractC22676k.m65750j(db4, "db");
        this.f152680E = true;
        try {
            this.f152685y.mo5429d(AbstractC35862g.m113841d(this.f152684x, db4), i13, i14);
        } catch (Throwable th3) {
            throw new C35860e(EnumC35861f.f152678z, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db4) {
        AbstractC22676k.m65750j(db4, "db");
        if (!this.f152680E) {
            try {
                this.f152685y.mo5430e(AbstractC35862g.m113841d(this.f152684x, db4));
            } catch (Throwable th3) {
                throw new C35860e(EnumC35861f.f152673E, th3);
            }
        }
        this.f152682G = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i13, int i14) {
        AbstractC22676k.m65750j(sqLiteDatabase, "sqLiteDatabase");
        this.f152680E = true;
        try {
            this.f152685y.mo5431f(AbstractC35862g.m113841d(this.f152684x, sqLiteDatabase), i13, i14);
        } catch (Throwable th3) {
            throw new C35860e(EnumC35861f.f152677y, th3);
        }
    }
}
