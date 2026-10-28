package androidx.room;

import android.content.Context;
import android.content.Intent;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hg3.AbstractC17269i;
import io.sentry.internal.debugmeta.C20378c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import lb.C23573p;
import lb.InterfaceC23558b;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25265s;
import m83.C25271y;
import n83.C26459b;
import n83.C26460c;
import p003a1.C0103b;
import p007a6.C0428i;
import p035bp.AbstractC3511b;
import p037bu.C3632c;
import p249jc.AbstractC21598x;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33688b;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p518ub.C34730c;
import p518ub.InterfaceC34728a;
import p518ub.InterfaceC34731d;
import p518ub.InterfaceC34732e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: androidx.room.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1812n0 {

    /* JADX INFO: renamed from: a */
    public boolean f7118a;

    /* JADX INFO: renamed from: b */
    public boolean f7119b;

    /* JADX INFO: renamed from: c */
    public final C1786g f7120c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1788g1 f7121d;

    /* JADX INFO: renamed from: e */
    public final List f7122e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC23558b f7123f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC34732e f7124g;

    /* JADX INFO: renamed from: h */
    public InterfaceC34728a f7125h;

    public C1812n0(C1786g c1786g, C0428i c0428i, C1836v0 c1836v0) {
        EnumC1827s0 enumC1827s0 = c1786g.f7048g;
        this.f7120c = c1786g;
        this.f7121d = new C1803k0();
        List list = c1786g.f7046e;
        C25271y c25271y = C25271y.f99162w;
        this.f7122e = list == null ? c25271y : list;
        ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(new C1809m0(new C0103b(this, 6)), list == null ? c25271y : list);
        Context context = c1786g.f7042a;
        String str = c1786g.f7043b;
        InterfaceC34731d interfaceC34731d = c1786g.f7044c;
        C1830t0 migrationContainer = c1786g.f7045d;
        boolean z4 = c1786g.f7047f;
        Executor queryExecutor = c1786g.f7049h;
        Executor transactionExecutor = c1786g.f7050i;
        Intent intent = c1786g.f7051j;
        boolean z13 = c1786g.f7052k;
        boolean z14 = c1786g.f7053l;
        Set set = c1786g.f7054m;
        String str2 = c1786g.f7055n;
        File file = c1786g.f7056o;
        Callable callable = c1786g.f7057p;
        List typeConverters = c1786g.f7058q;
        List autoMigrationSpecs = c1786g.f7059r;
        boolean z15 = c1786g.f7060s;
        InterfaceC33688b interfaceC33688b = c1786g.f7061t;
        InterfaceC30063j interfaceC30063j = c1786g.f7062u;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(migrationContainer, "migrationContainer");
        AbstractC22676k.m65750j(queryExecutor, "queryExecutor");
        AbstractC22676k.m65750j(transactionExecutor, "transactionExecutor");
        AbstractC22676k.m65750j(typeConverters, "typeConverters");
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        C1786g c1786g2 = new C1786g(context, str, interfaceC34731d, migrationContainer, arrayListM74128f1, z4, enumC1827s0, queryExecutor, transactionExecutor, intent, z13, z14, set, str2, file, callable, typeConverters, autoMigrationSpecs, z15, interfaceC33688b, interfaceC30063j);
        c1786g2.f7063v = c1786g.f7063v;
        InterfaceC34732e interfaceC34732e = (InterfaceC34732e) c0428i.invoke(c1786g2);
        this.f7124g = interfaceC34732e;
        C3632c c3632c = new C3632c(interfaceC34732e);
        String str3 = c1786g.f7043b;
        this.f7123f = new C23573p(c3632c, str3 == null ? ":memory:" : str3, c1836v0);
        boolean z16 = enumC1827s0 == EnumC1827s0.f7172y;
        if (interfaceC34732e != null) {
            interfaceC34732e.setWriteAheadLoggingEnabled(z16);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5439a(C1812n0 c1812n0, InterfaceC33687a interfaceC33687a) throws Throwable {
        Object objM107888l;
        AbstractC1788g1 abstractC1788g1 = c1812n0.f7121d;
        m5440b(interfaceC33687a);
        C1786g c1786g = c1812n0.f7120c;
        EnumC1827s0 enumC1827s0 = c1786g.f7048g;
        EnumC1827s0 enumC1827s1 = EnumC1827s0.f7172y;
        if (enumC1827s0 == enumC1827s1) {
            AbstractC17269i.m48864K("PRAGMA journal_mode = WAL", interfaceC33687a);
        } else {
            AbstractC17269i.m48864K("PRAGMA journal_mode = TRUNCATE", interfaceC33687a);
        }
        if (c1786g.f7048g == enumC1827s1) {
            AbstractC17269i.m48864K("PRAGMA synchronous = NORMAL", interfaceC33687a);
        } else {
            AbstractC17269i.m48864K("PRAGMA synchronous = FULL", interfaceC33687a);
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("PRAGMA user_version");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            int i13 = (int) interfaceC33689cMo68212g1.getLong(0);
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            if (i13 != abstractC1788g1.getVersion()) {
                AbstractC17269i.m48864K("BEGIN EXCLUSIVE TRANSACTION", interfaceC33687a);
                try {
                    if (i13 == 0) {
                        c1812n0.m5441c(interfaceC33687a);
                    } else {
                        c1812n0.m5442d(i13, abstractC1788g1.getVersion(), interfaceC33687a);
                    }
                    AbstractC17269i.m48864K("PRAGMA user_version = " + abstractC1788g1.getVersion(), interfaceC33687a);
                    objM107888l = C23454a0.f92919a;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (!(objM107888l instanceof C23467m)) {
                    AbstractC17269i.m48864K("END TRANSACTION", interfaceC33687a);
                }
                Throwable thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    AbstractC17269i.m48864K("ROLLBACK TRANSACTION", interfaceC33687a);
                    throw thM68037a;
                }
            }
            c1812n0.m5443e(interfaceC33687a);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5440b(InterfaceC33687a interfaceC33687a) {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("PRAGMA busy_timeout");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            long j7 = interfaceC33689cMo68212g1.getLong(0);
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            if (j7 < HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS) {
                AbstractC17269i.m48864K("PRAGMA busy_timeout = 3000", interfaceC33687a);
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5441c(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z4 = false;
            if (interfaceC33689cMo68212g1.mo5355e1() && interfaceC33689cMo68212g1.getLong(0) == 0) {
                z4 = true;
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            AbstractC1788g1 abstractC1788g1 = this.f7121d;
            abstractC1788g1.createAllTables(connection);
            if (!z4) {
                C1784f1 c1784f1OnValidateSchema = abstractC1788g1.onValidateSchema(connection);
                if (!c1784f1OnValidateSchema.f7032a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + c1784f1OnValidateSchema.f7033b).toString());
                }
            }
            m5444f(connection);
            abstractC1788g1.onCreate(connection);
            Iterator it = this.f7122e.iterator();
            while (it.hasNext()) {
                ((AbstractC1821q0) it.next()).onCreate(connection);
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5442d(int i13, int i14, InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        C1786g c1786g = this.f7120c;
        List listM48867N = AbstractC17269i.m48867N(c1786g.f7045d, i13, i14);
        AbstractC1788g1 abstractC1788g1 = this.f7121d;
        if (listM48867N != null) {
            abstractC1788g1.onPreMigrate(connection);
            Iterator it = listM48867N.iterator();
            while (it.hasNext()) {
                ((AbstractC25380b) it.next()).migrate(connection);
            }
            C1784f1 c1784f1OnValidateSchema = abstractC1788g1.onValidateSchema(connection);
            if (c1784f1OnValidateSchema.f7032a) {
                abstractC1788g1.onPostMigrate(connection);
                m5444f(connection);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + c1784f1OnValidateSchema.f7033b).toString());
            }
        }
        if (AbstractC17269i.m48878Y(c1786g, i13, i14)) {
            throw new IllegalStateException(("A migration from " + i13 + " to " + i14 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c1786g.f7060s) {
            InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                while (interfaceC33689cMo68212g1.mo5355e1()) {
                    String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(0);
                    if (!AbstractC39421y.m125930O(strMo5353J0, "sqlite_", false) && !strMo5353J0.equals("android_metadata")) {
                        c26460cM119000x.add(new C23465k(strMo5353J0, Boolean.valueOf(AbstractC22676k.m65745e(interfaceC33689cMo68212g1.mo5353J0(1), ProfileAnalyticsKt.VIEW))));
                    }
                }
                C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
                ListIterator listIterator = c26460cM118988k.listIterator(0);
                while (true) {
                    C26459b c26459b = (C26459b) listIterator;
                    if (!c26459b.hasNext()) {
                        break;
                    }
                    C23465k c23465k = (C23465k) c26459b.next();
                    String str = (String) c23465k.f92937w;
                    if (((Boolean) c23465k.f92938x).booleanValue()) {
                        AbstractC17269i.m48864K("DROP VIEW IF EXISTS `" + str + '`', connection);
                    } else {
                        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `" + str + '`', connection);
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                    throw th4;
                }
            }
        } else {
            abstractC1788g1.dropAllTables(connection);
        }
        Iterator it3 = this.f7122e.iterator();
        while (it3.hasNext()) {
            ((AbstractC1821q0) it3.next()).onDestructiveMigration(connection);
        }
        abstractC1788g1.createAllTables(connection);
    }

    /* JADX INFO: renamed from: e */
    public final void m5443e(InterfaceC33687a connection) {
        Object objM107888l;
        AbstractC22676k.m65750j(connection, "connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z4 = interfaceC33689cMo68212g1.mo5355e1() && interfaceC33689cMo68212g1.getLong(0) != 0;
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            AbstractC1788g1 abstractC1788g1 = this.f7121d;
            if (z4) {
                InterfaceC33689c interfaceC33689cMo68212g2 = connection.mo68212g1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strMo5353J0 = interfaceC33689cMo68212g2.mo5355e1() ? interfaceC33689cMo68212g2.mo5353J0(0) : null;
                    AbstractC21598x.m60698r(interfaceC33689cMo68212g2, null);
                    if (!AbstractC22676k.m65745e(abstractC1788g1.getIdentityHash(), strMo5353J0) && !AbstractC22676k.m65745e(abstractC1788g1.getLegacyIdentityHash(), strMo5353J0)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + abstractC1788g1.getIdentityHash() + ", found: " + strMo5353J0).toString());
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC21598x.m60698r(interfaceC33689cMo68212g2, th3);
                        throw th4;
                    }
                }
            } else {
                AbstractC17269i.m48864K("BEGIN EXCLUSIVE TRANSACTION", connection);
                try {
                    C1784f1 c1784f1OnValidateSchema = abstractC1788g1.onValidateSchema(connection);
                    if (!c1784f1OnValidateSchema.f7032a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + c1784f1OnValidateSchema.f7033b).toString());
                    }
                    abstractC1788g1.onPostMigrate(connection);
                    m5444f(connection);
                    objM107888l = C23454a0.f92919a;
                    if (!(objM107888l instanceof C23467m)) {
                        AbstractC17269i.m48864K("END TRANSACTION", connection);
                    }
                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        AbstractC17269i.m48864K("ROLLBACK TRANSACTION", connection);
                        throw thM68037a;
                    }
                } catch (Throwable th5) {
                    objM107888l = AbstractC34132o.m107888l(th5);
                }
            }
            abstractC1788g1.onOpen(connection);
            Iterator it = this.f7122e.iterator();
            while (it.hasNext()) {
                ((AbstractC1821q0) it.next()).onOpen(connection);
            }
            this.f7118a = true;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th6);
                throw th7;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5444f(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
        String hash = this.f7121d.getIdentityHash();
        AbstractC22676k.m65750j(hash, "hash");
        AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')", interfaceC33687a);
    }

    public C1812n0(C1786g c1786g, AbstractC1788g1 abstractC1788g1, C1839w0 c1839w0) {
        int i13;
        InterfaceC23558b interfaceC23558bM10364D;
        EnumC1827s0 enumC1827s0 = c1786g.f7048g;
        InterfaceC34731d interfaceC34731d = c1786g.f7044c;
        InterfaceC33688b interfaceC33688b = c1786g.f7061t;
        String str = c1786g.f7043b;
        this.f7120c = c1786g;
        this.f7121d = abstractC1788g1;
        List list = c1786g.f7046e;
        this.f7122e = list == null ? C25271y.f99162w : list;
        if (interfaceC33688b != null) {
            this.f7124g = null;
            if (interfaceC33688b.mo11177z()) {
                interfaceC23558bM10364D = new C23573p(new C20378c(this, interfaceC33688b), str == null ? ":memory:" : str, c1839w0);
            } else if (str == null) {
                interfaceC23558bM10364D = AbstractC3511b.m10365E(new C20378c(this, interfaceC33688b));
            } else {
                C20378c c20378c = new C20378c(this, interfaceC33688b);
                int iOrdinal = enumC1827s0.ordinal();
                if (iOrdinal == 1) {
                    i13 = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + enumC1827s0 + '\'').toString());
                    }
                    i13 = 4;
                }
                int iOrdinal2 = enumC1827s0.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + enumC1827s0 + '\'').toString());
                }
                interfaceC23558bM10364D = AbstractC3511b.m10364D(c20378c, str, i13);
            }
            this.f7123f = interfaceC23558bM10364D;
        } else if (interfaceC34731d != null) {
            Context context = c1786g.f7042a;
            AbstractC22676k.m65750j(context, "context");
            InterfaceC34732e interfaceC34732eMo60609a = interfaceC34731d.mo60609a(new C34730c(context, str, new C1806l0(this, abstractC1788g1.getVersion()), false, false));
            this.f7124g = interfaceC34732eMo60609a;
            this.f7123f = new C23573p(new C3632c(interfaceC34732eMo60609a), str == null ? ":memory:" : str, c1839w0);
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z4 = enumC1827s0 == EnumC1827s0.f7172y;
        InterfaceC34732e interfaceC34732e = this.f7124g;
        if (interfaceC34732e != null) {
            interfaceC34732e.setWriteAheadLoggingEnabled(z4);
        }
    }
}
