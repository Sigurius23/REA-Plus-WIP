package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import androidx.profileinstaller.ExecutorC1651b;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p249jc.C21567b;
import p249jc.C21590p;
import p325mb.AbstractC25380b;
import p489t.C33242a;
import p518ub.InterfaceC34731d;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: androidx.room.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1818p0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f7142a;

    /* JADX INFO: renamed from: b */
    public final Context f7143b;

    /* JADX INFO: renamed from: c */
    public final String f7144c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f7145d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f7146e;

    /* JADX INFO: renamed from: f */
    public Executor f7147f;

    /* JADX INFO: renamed from: g */
    public Executor f7148g;

    /* JADX INFO: renamed from: h */
    public C21590p f7149h;

    /* JADX INFO: renamed from: i */
    public boolean f7150i;

    /* JADX INFO: renamed from: j */
    public final EnumC1827s0 f7151j;

    /* JADX INFO: renamed from: k */
    public final long f7152k;

    /* JADX INFO: renamed from: l */
    public final C1830t0 f7153l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashSet f7154m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashSet f7155n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f7156o;

    /* JADX INFO: renamed from: p */
    public boolean f7157p;

    /* JADX INFO: renamed from: q */
    public boolean f7158q;

    /* JADX INFO: renamed from: r */
    public boolean f7159r;

    /* JADX INFO: renamed from: s */
    public final boolean f7160s;

    public C1818p0(Context context, Class cls, String str) {
        AbstractC22676k.m65750j(context, "context");
        this.f7145d = new ArrayList();
        this.f7146e = new ArrayList();
        this.f7151j = EnumC1827s0.f7170w;
        this.f7152k = -1L;
        this.f7153l = new C1830t0();
        this.f7154m = new LinkedHashSet();
        this.f7155n = new LinkedHashSet();
        this.f7156o = new ArrayList();
        this.f7157p = true;
        this.f7160s = true;
        this.f7142a = AbstractC21598x.m60666V(cls);
        this.f7143b = context;
        this.f7144c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m5449a(AbstractC25380b... migrations) {
        AbstractC22676k.m65750j(migrations, "migrations");
        for (AbstractC25380b abstractC25380b : migrations) {
            Integer numValueOf = Integer.valueOf(abstractC25380b.startVersion);
            LinkedHashSet linkedHashSet = this.f7155n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(abstractC25380b.endVersion));
        }
        AbstractC25380b[] migrations2 = (AbstractC25380b[]) Arrays.copyOf(migrations, migrations.length);
        C1830t0 c1830t0 = this.f7153l;
        c1830t0.getClass();
        AbstractC22676k.m65750j(migrations2, "migrations");
        for (AbstractC25380b abstractC25380b2 : migrations2) {
            c1830t0.m5452a(abstractC25380b2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1848z0 m5450b() {
        String name;
        String str;
        Executor executor = this.f7147f;
        if (executor == null && this.f7148g == null) {
            ExecutorC1651b executorC1651b = C33242a.f138638d;
            this.f7148g = executorC1651b;
            this.f7147f = executorC1651b;
        } else if (executor != null && this.f7148g == null) {
            this.f7148g = executor;
        } else if (executor == null) {
            this.f7147f = this.f7148g;
        }
        LinkedHashSet migrationStartAndEndVersions = this.f7155n;
        AbstractC22676k.m65750j(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        LinkedHashSet migrationsNotRequiredFrom = this.f7154m;
        AbstractC22676k.m65750j(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (!migrationStartAndEndVersions.isEmpty()) {
            Iterator it = migrationStartAndEndVersions.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        InterfaceC34731d c21567b = this.f7149h;
        if (c21567b == null) {
            c21567b = new C21567b(27);
        }
        InterfaceC34731d interfaceC34731d = c21567b;
        if (this.f7152k > 0) {
            if (this.f7144c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z4 = this.f7150i;
        EnumC1827s0 enumC1827s0 = this.f7151j;
        enumC1827s0.getClass();
        Context context = this.f7143b;
        AbstractC22676k.m65750j(context, "context");
        if (enumC1827s0 == EnumC1827s0.f7170w) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            enumC1827s0 = (activityManager == null || activityManager.isLowRamDevice()) ? EnumC1827s0.f7171x : EnumC1827s0.f7172y;
        }
        EnumC1827s0 enumC1827s1 = enumC1827s0;
        Executor executor2 = this.f7147f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f7148g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C1786g c1786g = new C1786g(context, this.f7144c, interfaceC34731d, this.f7153l, this.f7145d, z4, enumC1827s1, executor2, executor3, null, this.f7157p, this.f7158q, migrationsNotRequiredFrom, null, null, null, this.f7146e, this.f7156o, this.f7159r, null, null);
        c1786g.f7063v = this.f7160s;
        Class clsM60663S = AbstractC21598x.m60663S(this.f7142a);
        Package r10 = clsM60663S.getPackage();
        if (r10 == null || (name = r10.getName()) == null) {
            name = "";
        }
        String canonicalName = clsM60663S.getCanonicalName();
        AbstractC22676k.m65747g(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            AbstractC22676k.m65749i(canonicalName, "substring(...)");
        }
        String strConcat = AbstractC39421y.m125927L(canonicalName, '.', '_').concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls = Class.forName(str, true, clsM60663S.getClassLoader());
            AbstractC22676k.m65748h(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            AbstractC1848z0 abstractC1848z0 = (AbstractC1848z0) cls.getDeclaredConstructor(null).newInstance(null);
            abstractC1848z0.init(c1786g);
            return abstractC1848z0;
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("Cannot find implementation for " + clsM60663S.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e5);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Cannot access the constructor " + clsM60663S.getCanonicalName(), e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("Failed to create an instance of " + clsM60663S.getCanonicalName(), e14);
        }
    }
}
