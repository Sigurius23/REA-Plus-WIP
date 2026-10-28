package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p500tb.InterfaceC33688b;
import p518ub.InterfaceC34731d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: androidx.room.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1786g {

    /* JADX INFO: renamed from: a */
    public final Context f7042a;

    /* JADX INFO: renamed from: b */
    public final String f7043b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC34731d f7044c;

    /* JADX INFO: renamed from: d */
    public final C1830t0 f7045d;

    /* JADX INFO: renamed from: e */
    public final List f7046e;

    /* JADX INFO: renamed from: f */
    public final boolean f7047f;

    /* JADX INFO: renamed from: g */
    public final EnumC1827s0 f7048g;

    /* JADX INFO: renamed from: h */
    public final Executor f7049h;

    /* JADX INFO: renamed from: i */
    public final Executor f7050i;

    /* JADX INFO: renamed from: j */
    public final Intent f7051j;

    /* JADX INFO: renamed from: k */
    public final boolean f7052k;

    /* JADX INFO: renamed from: l */
    public final boolean f7053l;

    /* JADX INFO: renamed from: m */
    public final Set f7054m;

    /* JADX INFO: renamed from: n */
    public final String f7055n;

    /* JADX INFO: renamed from: o */
    public final File f7056o;

    /* JADX INFO: renamed from: p */
    public final Callable f7057p;

    /* JADX INFO: renamed from: q */
    public final List f7058q;

    /* JADX INFO: renamed from: r */
    public final List f7059r;

    /* JADX INFO: renamed from: s */
    public final boolean f7060s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC33688b f7061t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC30063j f7062u;

    /* JADX INFO: renamed from: v */
    public boolean f7063v;

    public C1786g(Context context, String str, InterfaceC34731d interfaceC34731d, C1830t0 migrationContainer, List list, boolean z4, EnumC1827s0 enumC1827s0, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z13, boolean z14, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z15, InterfaceC33688b interfaceC33688b, InterfaceC30063j interfaceC30063j) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(migrationContainer, "migrationContainer");
        AbstractC22676k.m65750j(queryExecutor, "queryExecutor");
        AbstractC22676k.m65750j(transactionExecutor, "transactionExecutor");
        AbstractC22676k.m65750j(typeConverters, "typeConverters");
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        this.f7042a = context;
        this.f7043b = str;
        this.f7044c = interfaceC34731d;
        this.f7045d = migrationContainer;
        this.f7046e = list;
        this.f7047f = z4;
        this.f7048g = enumC1827s0;
        this.f7049h = queryExecutor;
        this.f7050i = transactionExecutor;
        this.f7051j = intent;
        this.f7052k = z13;
        this.f7053l = z14;
        this.f7054m = set;
        this.f7055n = str2;
        this.f7056o = file;
        this.f7057p = callable;
        this.f7058q = typeConverters;
        this.f7059r = autoMigrationSpecs;
        this.f7060s = z15;
        this.f7061t = interfaceC33688b;
        this.f7062u = interfaceC30063j;
        this.f7063v = true;
    }
}
