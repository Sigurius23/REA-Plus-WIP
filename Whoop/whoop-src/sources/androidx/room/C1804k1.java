package androidx.room;

import android.database.Cursor;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hg3.AbstractC17269i;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l83.C23465k;
import n83.C26459b;
import n83.C26460c;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p325mb.AbstractC25380b;
import p389p0.C28539n0;
import p518ub.AbstractC34729b;
import p549vb.C35858c;
import p578wb.C37024a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: androidx.room.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1804k1 extends AbstractC34729b {

    /* JADX INFO: renamed from: b */
    public C1786g f7107b;

    /* JADX INFO: renamed from: c */
    public final List f7108c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1796i1 f7109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804k1(C1786g configuration, AbstractC1796i1 abstractC1796i1) {
        super(abstractC1796i1.version);
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f7108c = configuration.f7046e;
        this.f7107b = configuration;
        this.f7109d = abstractC1796i1;
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: b */
    public final void mo5427b(C35858c c35858c) {
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: c */
    public final void mo5428c(C35858c c35858c) throws IOException {
        Cursor cursorMo109669l0 = c35858c.mo109669l0(new C28539n0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z4 = false;
            if (cursorMo109669l0.moveToFirst() && cursorMo109669l0.getInt(0) == 0) {
                z4 = true;
            }
            cursorMo109669l0.close();
            AbstractC1796i1 abstractC1796i1 = this.f7109d;
            abstractC1796i1.createAllTables(c35858c);
            if (!z4) {
                C1800j1 c1800j1OnValidateSchema = abstractC1796i1.onValidateSchema(c35858c);
                if (!c1800j1OnValidateSchema.f7103a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c1800j1OnValidateSchema.f7104b);
                }
            }
            c35858c.mo109660E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c35858c.mo109660E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '356e4a21530b2975a5e43ebcfbd41316')");
            abstractC1796i1.onCreate(c35858c);
            List list = this.f7108c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC1821q0) it.next()).getClass();
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(cursorMo109669l0, th3);
                throw th4;
            }
        }
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: d */
    public final void mo5429d(C35858c c35858c, int i13, int i14) throws IOException {
        mo5431f(c35858c, i13, i14);
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: e */
    public final void mo5430e(C35858c c35858c) throws IOException {
        Cursor cursorMo109669l0 = c35858c.mo109669l0(new C28539n0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            boolean z4 = cursorMo109669l0.moveToFirst() && cursorMo109669l0.getInt(0) != 0;
            cursorMo109669l0.close();
            AbstractC1796i1 abstractC1796i1 = this.f7109d;
            if (z4) {
                Cursor cursorMo109669l1 = c35858c.mo109669l0(new C28539n0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorMo109669l1.moveToFirst() ? cursorMo109669l1.getString(0) : null;
                    cursorMo109669l1.close();
                    if (!"356e4a21530b2975a5e43ebcfbd41316".equals(string) && !"3babbcf080a75b94217adaa8a75688ff".equals(string)) {
                        throw new IllegalStateException(AbstractC11266d.m30461o("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 356e4a21530b2975a5e43ebcfbd41316, found: ", string));
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(cursorMo109669l1, th3);
                        throw th4;
                    }
                }
            } else {
                C1800j1 c1800j1OnValidateSchema = abstractC1796i1.onValidateSchema(c35858c);
                if (!c1800j1OnValidateSchema.f7103a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c1800j1OnValidateSchema.f7104b);
                }
                abstractC1796i1.onPostMigrate(c35858c);
                c35858c.mo109660E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c35858c.mo109660E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '356e4a21530b2975a5e43ebcfbd41316')");
            }
            abstractC1796i1.onOpen(c35858c);
            List list = this.f7108c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC1821q0) it.next()).onOpen(c35858c);
                }
            }
            this.f7107b = null;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC35854l.m113829i(cursorMo109669l0, th5);
                throw th6;
            }
        }
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: f */
    public final void mo5431f(C35858c c35858c, int i13, int i14) throws IOException {
        C1786g c1786g = this.f7107b;
        AbstractC1796i1 abstractC1796i1 = this.f7109d;
        if (c1786g != null) {
            C1830t0 c1830t0 = c1786g.f7045d;
            c1830t0.getClass();
            List listM48867N = AbstractC17269i.m48867N(c1830t0, i13, i14);
            if (listM48867N != null) {
                abstractC1796i1.onPreMigrate(c35858c);
                Iterator it = listM48867N.iterator();
                while (it.hasNext()) {
                    ((AbstractC25380b) it.next()).migrate(new C37024a(c35858c));
                }
                C1800j1 c1800j1OnValidateSchema = abstractC1796i1.onValidateSchema(c35858c);
                if (!c1800j1OnValidateSchema.f7103a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + c1800j1OnValidateSchema.f7104b);
                }
                abstractC1796i1.onPostMigrate(c35858c);
                c35858c.mo109660E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c35858c.mo109660E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '356e4a21530b2975a5e43ebcfbd41316')");
                return;
            }
        }
        C1786g c1786g2 = this.f7107b;
        if (c1786g2 == null || AbstractC17269i.m48878Y(c1786g2, i13, i14)) {
            throw new IllegalStateException(AbstractC25012a.m73372e(i13, i14, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (c1786g2.f7060s) {
            Cursor cursorMo109669l0 = c35858c.mo109669l0(new C28539n0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                while (cursorMo109669l0.moveToNext()) {
                    String string = cursorMo109669l0.getString(0);
                    AbstractC22676k.m65747g(string);
                    if (!AbstractC39421y.m125930O(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        c26460cM119000x.add(new C23465k(string, Boolean.valueOf(AbstractC22676k.m65745e(cursorMo109669l0.getString(1), ProfileAnalyticsKt.VIEW))));
                    }
                }
                C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                cursorMo109669l0.close();
                ListIterator listIterator = c26460cM118988k.listIterator(0);
                while (true) {
                    C26459b c26459b = (C26459b) listIterator;
                    if (!c26459b.hasNext()) {
                        break;
                    }
                    C23465k c23465k = (C23465k) c26459b.next();
                    String str = (String) c23465k.f92937w;
                    if (((Boolean) c23465k.f92938x).booleanValue()) {
                        c35858c.mo109660E("DROP VIEW IF EXISTS " + str);
                    } else {
                        c35858c.mo109660E("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(cursorMo109669l0, th3);
                    throw th4;
                }
            }
        } else {
            abstractC1796i1.dropAllTables(c35858c);
        }
        List list = this.f7108c;
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((AbstractC1821q0) it3.next()).getClass();
            }
        }
        abstractC1796i1.createAllTables(c35858c);
    }
}
