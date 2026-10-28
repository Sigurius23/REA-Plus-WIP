package a70;

import com.whoop.activation.dayzero.model.DayZeroSplashResponse;
import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import m83.C25271y;
import p000.AbstractC30802r;
import p699b70.C2779e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import y60.C39258b;

/* JADX INFO: renamed from: a70.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"La70/c;", "", "Ljb1/a;", "designItemReducer", "Ltr2/n;", "logger", "<init>", "(Ljb1/a;Ltr2/n;)V", "Ly60/b;", "domainResult", "Lb70/e;", "a", "(Ly60/b;)Lb70/e;", "Ljb1/a;", "b", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0519c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C0519c(C21535a designItemReducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.designItemReducer = designItemReducer;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final C2779e m1220a(C39258b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult.getIsLoading()) {
            return new C2779e(true, null, null, false, null, 30, null);
        }
        C21535a c21535a = this.designItemReducer;
        DayZeroSplashResponse response = domainResult.getResponse();
        List<DesignSystemModel> items = response != null ? response.getItems() : null;
        List<DesignSystemModel> list = C25271y.f99162w;
        if (items == null) {
            items = list;
        }
        List<InterfaceC25312u> listM60545m = c21535a.m60545m(items);
        C21535a c21535a2 = this.designItemReducer;
        DayZeroSplashResponse response2 = domainResult.getResponse();
        List<DesignSystemModel> footer = response2 != null ? response2.getFooter() : null;
        if (footer != null) {
            list = footer;
        }
        List<InterfaceC25312u> listM60545m2 = c21535a2.m60545m(list);
        if (listM60545m.isEmpty() && listM60545m2.isEmpty()) {
            this.logger.mo85222m(AbstractC30802r.m94762k("Dismissing Day-0 splash, nothing to render (isError=", ", hasPayload=", ")", domainResult.getIsError(), domainResult.getResponse() != null), new AbstractC30556a.a[0]);
            return new C2779e(false, null, null, true, null, 22, null);
        }
        DayZeroSplashResponse response3 = domainResult.getResponse();
        return new C2779e(false, listM60545m, listM60545m2, false, response3 != null ? response3.getAnalyticEvent() : null, 8, null);
    }

    public /* synthetic */ C0519c(C21535a c21535a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DayZeroSplashViewStateReducer") : interfaceC34116n);
    }
}
