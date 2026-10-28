package rr2;

import or2.C28162g;
import p007a6.InterfaceC0422g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: rr2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"La6/g;", "Lf6/f;", "prefsDataStore", "Lzr2/a;", "dataTimeProvider", "Lor2/g;", "buildConfigProvider", "Lrr2/o;", "sentryReporter", "Lrr2/a;", "a", "(La6/g;Lzr2/a;Lor2/g;Lrr2/o;)Lrr2/a;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31774k {
    /* JADX INFO: renamed from: a */
    public static final C31764a m98653a(InterfaceC0422g prefsDataStore, InterfaceC41070a dataTimeProvider, C28162g buildConfigProvider, C31778o sentryReporter) {
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(dataTimeProvider, "dataTimeProvider");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(sentryReporter, "sentryReporter");
        return AbstractC31767d.m98637a(new C31771h(null, prefsDataStore, dataTimeProvider, buildConfigProvider, 1, null), sentryReporter);
    }
}
