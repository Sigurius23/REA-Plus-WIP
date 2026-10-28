package v12;

import java.util.List;
import jb1.C21535a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import t12.C33310b;
import tr2.InterfaceC34116n;
import w12.AbstractC36701d;

/* JADX INFO: renamed from: v12.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lv12/d;", "", "Ljb1/a;", "reducer", "Ltr2/n;", "logger", "<init>", "(Ljb1/a;Ltr2/n;)V", "Lt12/b;", "domainState", "Lv12/c;", "a", "(Lt12/b;)Lv12/c;", "Ljb1/a;", "b", "Ltr2/n;", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35557d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C35557d(C21535a reducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.reducer = reducer;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final C35556c m112768a(C33310b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        List<InterfaceC25312u> listM60545m = this.reducer.m60545m(domainState.m105681a());
        if (listM60545m.size() < domainState.m105681a().size()) {
            this.logger.mo85214e("DayZeroHeaderWidgets", AbstractC2875y.m8296i(domainState.m105681a().size() - listM60545m.size(), "Dropped ", " header widget(s) this client cannot render"), new AbstractC30556a.a[0]);
        }
        return new C35556c(listM60545m);
    }

    public /* synthetic */ C35557d(C21535a c21535a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC36701d.m117825i() : c21535a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DayZeroHeaderWidgets") : interfaceC34116n);
    }
}
