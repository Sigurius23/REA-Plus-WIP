package com.whoop.navigation;

import com.whoop.data.repositories.FeatureFlagChecker;
import j02.AbstractC21154m;
import j02.InterfaceC21156n;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.navigation.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/navigation/b;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj02/n;", "resolver", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/n;Ltr2/n;)V", "", "path", "query", "Lcom/whoop/navigation/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lj02/n;", "c", "Ltr2/n;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9595b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21156n resolver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C9595b(FeatureFlagChecker featureFlagChecker, InterfaceC21156n resolver, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(resolver, "resolver");
        AbstractC22676k.m65750j(logger, "logger");
        this.featureFlagChecker = featureFlagChecker;
        this.resolver = resolver;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final Object m23106a(String str, String str2, InterfaceC30057d<? super InterfaceC9596c> interfaceC30057d) {
        String strM59008a = AbstractC21154m.m59008a(str);
        String strM59009b = AbstractC21154m.m59009b(str);
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(strM59009b);
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("deeplink-migration: gate path=", str, " name=", strM59008a, " flag=");
        sbM32001t.append(strM59009b);
        sbM32001t.append(" enabled=");
        sbM32001t.append(zIsFeatureEnabled);
        interfaceC34116n.mo85216g(sbM32001t.toString(), new AbstractC30556a.a[0]);
        return !zIsFeatureEnabled ? InterfaceC9596c.c.f28129a : this.resolver.mo18045a(strM59008a, str2, interfaceC30057d);
    }

    public /* synthetic */ C9595b(FeatureFlagChecker featureFlagChecker, InterfaceC21156n interfaceC21156n, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, interfaceC21156n, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DeeplinkMigrationGate") : interfaceC34116n);
    }
}
