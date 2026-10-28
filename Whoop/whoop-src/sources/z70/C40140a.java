package z70;

import com.whoop.activation.feature.orderconfirmation.domain.models.OrderConfirmationResponse;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16272a;
import h51.C16934f;
import i80.AbstractC18211b;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.C21535a;
import kd1.AbstractC22403o;
import m83.C25271y;
import n83.C26460c;
import ny0.C27256h;
import ny0.EnumC27254g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import u70.C34563c;
import u70.C34566f;
import v70.C35756d;
import v70.InterfaceC35754b;
import wb3.AbstractC37056f;
import y70.C39267c;
import y70.InterfaceC39265a;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: z70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Lz70/a;", "", "Ljb1/a;", "reducer", "activationFlowReducer", "<init>", "(Ljb1/a;Ljb1/a;)V", "Lv70/b$b;", "Ly70/c;", "e", "(Lv70/b$b;)Ly70/c;", "Lv70/b$e;", "Ly70/c$c;", "d", "(Lv70/b$e;)Ly70/c$c;", "Lv70/d;", "dialog", "g", "(Lv70/d;Ly70/c$c;)Ly70/c;", "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "domainState", "Ly70/c$d;", "f", "(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Lv70/d;Ljb1/a;)Ly70/c$d;", "", "backgroundImageUrl", "imageName", "Lkd1/o;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lkd1/o;", "a", "(Ljava/lang/String;)Lkd1/o;", "domainResult", "b", "(Lv70/d;)Ly70/c;", "Ljb1/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40140a {

    /* JADX INFO: renamed from: c */
    public static final int f173199c = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a activationFlowReducer;

    public C40140a(C21535a reducer, C21535a activationFlowReducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(activationFlowReducer, "activationFlowReducer");
        this.reducer = reducer;
        this.activationFlowReducer = activationFlowReducer;
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC22403o m128706a(String imageName) {
        String upperCase = imageName.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (!upperCase.equals("HIP_HERO") && upperCase.equals("RUNNING_HERO")) {
            return new AbstractC22403o.a(AbstractC16272a.f62056c);
        }
        return new AbstractC22403o.a(AbstractC16272a.f62050b);
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC22403o m128707c(String backgroundImageUrl, String imageName) {
        if (backgroundImageUrl == null || AbstractC39414r.m125890i0(backgroundImageUrl)) {
            return m128706a(imageName);
        }
        int i13 = AbstractC16272a.f62050b;
        return new AbstractC22403o.c(backgroundImageUrl, i13, i13, 0, 8, null);
    }

    /* JADX INFO: renamed from: d */
    private final C39267c.c m128708d(InterfaceC35754b.e eVar) {
        if (!(eVar instanceof InterfaceC35754b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C39267c.c(AbstractC8693b.m21278l("title"), AbstractC8693b.m21278l("Confirm"), null, AbstractC8693b.m21278l("Cancel"), AbstractC8693b.m21278l("description"), true, true, EnumC21213p.LOTTIE, null, null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    private final C39267c m128709e(InterfaceC35754b.b bVar) {
        if (bVar instanceof InterfaceC35754b.c) {
            return new C39267c(null, new C39267c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC35754b.d) {
            return new C39267c(null, new C39267c.b(C33205o0.f138451a.m105289c(), null, null, InterfaceC39265a.f.f168840a, 4, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC35754b.f) {
            return new C39267c(null, new C39267c.b(C33205o0.f138451a.m105291e(), null, null, InterfaceC39265a.f.f168840a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    private final C39267c.d m128710f(OrderConfirmationResponse orderConfirmationResponse, C35756d c35756d, C21535a c21535a) {
        ?? arrayList;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add(new C39267c.a(AbstractC37056f.m118958J(new C34563c(m128707c(orderConfirmationResponse.getBackgroundImageUrl(), orderConfirmationResponse.getImageName()), AbstractC8693b.m21278l(orderConfirmationResponse.getHeader()), AbstractC8693b.m21278l(orderConfirmationResponse.getDescription()), null, 8, null))));
        Iterator it = orderConfirmationResponse.getMenuItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h((DesignSystemModel) it.next());
            C39282o c39282o = interfaceC25312uM60541h instanceof C39282o ? (C39282o) interfaceC25312uM60541h : null;
            if (c39282o != null) {
                c26460cM119000x.add(new C39267c.a(AbstractC37056f.m118958J(new C34566f(c39282o))));
            }
        }
        DesignSystemModel educationContent = orderConfirmationResponse.getEducationContent();
        if (educationContent != null) {
            InterfaceC25312u interfaceC25312uM60541h2 = c21535a.m60541h(educationContent);
            C16934f c16934f = interfaceC25312uM60541h2 instanceof C16934f ? (C16934f) interfaceC25312uM60541h2 : null;
            if (c16934f != null) {
                c26460cM119000x.add(new C39267c.a(AbstractC37056f.m118958J(c16934f)));
            }
        }
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        List<DesignSystemModel> footerButtons = orderConfirmationResponse.getFooterButtons();
        if (footerButtons != null) {
            arrayList = new ArrayList();
            Iterator it3 = footerButtons.iterator();
            while (it3.hasNext()) {
                InterfaceC25312u interfaceC25312uM60544l = this.activationFlowReducer.m60544l((DesignSystemModel) it3.next());
                if (interfaceC25312uM60544l == null) {
                    interfaceC25312uM60544l = null;
                } else if (interfaceC25312uM60544l instanceof C27256h) {
                    interfaceC25312uM60544l = C27256h.m82144b((C27256h) interfaceC25312uM60544l, null, null, null, null, null, null, null, null, null, null, EnumC27254g.STANDARD, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33528831, null);
                }
                if (interfaceC25312uM60544l != null) {
                    arrayList.add(interfaceC25312uM60544l);
                }
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new C39267c.d(c26460cM118988k, c35756d.getDisplayRefreshingSpinner(), arrayList);
    }

    /* JADX INFO: renamed from: g */
    private final C39267c m128711g(C35756d c35756d, C39267c.c cVar) {
        OrderConfirmationResponse response = c35756d.getResponse();
        return new C39267c(cVar, null, response != null ? m128710f(response, c35756d, this.reducer) : null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final C39267c m128712b(C35756d domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC35754b currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC35754b.b) {
            return m128709e((InterfaceC35754b.b) domainResult.getCurrentDialogType());
        }
        return currentDialogType instanceof InterfaceC35754b.e ? m128711g(domainResult, m128708d((InterfaceC35754b.e) domainResult.getCurrentDialogType())) : m128711g(domainResult, null);
    }

    public /* synthetic */ C40140a(C21535a c21535a, C21535a c21535a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC40141b.f173202a : c21535a, (i13 & 2) != 0 ? AbstractC18211b.m52329n0() : c21535a2);
    }
}
