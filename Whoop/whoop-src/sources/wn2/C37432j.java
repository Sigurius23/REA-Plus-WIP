package wn2;

import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowSection;
import io2.C20762h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import sn2.C32783i;
import sn2.InterfaceC32776b;
import xn2.C38484c;
import xn2.C38488g;
import y71.C39282o;

/* JADX INFO: renamed from: wn2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwn2/j;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lsn2/i;", "Lwn2/i$c;", "c", "(Lsn2/i;)Lwn2/i$c;", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;", "Lcom/whoop/navigation/e;", "checkoutDestination", "Lwn2/g;", "d", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Lcom/whoop/navigation/e;)Lwn2/g;", "Ly71/o;", "a", "(Ly71/o;Lcom/whoop/navigation/e;)Ly71/o;", "Lsn2/b;", "result", "Lwn2/i;", "b", "(Lsn2/b;)Lwn2/i;", "Ljb1/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37432j {

    /* JADX INFO: renamed from: b */
    public static final int f160240b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C37432j(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    private final C39282o m119838a(C39282o c39282o, C9598e c9598e) {
        return c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : new InterfaceC37427e.c(c39282o.getDestination() != null ? EnumC37425c.SHIPPING_ADDRESS : EnumC37425c.PAYMENT_METHOD, c9598e), (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : null, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC37431i.c m119839c(C32783i c32783i) {
        List<BuyNowSection> listM102841e = c32783i.m102841e();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM102841e, 10));
        Iterator<T> it = listM102841e.iterator();
        while (it.hasNext()) {
            arrayList.add(m119840d((BuyNowSection) it.next(), c32783i.getCheckoutDestination()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((C37429g) obj).m119822a().isEmpty()) {
                arrayList2.add(obj);
            }
        }
        List<InterfaceC25312u> listM60545m = this.designItemReducer.m60545m(c32783i.getCheckoutFooter().getItems());
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC25265s.m74141p0(arrayList3, ((C37429g) it3.next()).m119822a());
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            if (((InterfaceC25312u) it4.next()) instanceof C38488g) {
                if (arrayList3.isEmpty()) {
                    return null;
                }
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    if (((InterfaceC25312u) it5.next()) instanceof C38484c) {
                        List<InterfaceC25312u> list = listM60545m;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            return null;
                        }
                        Iterator<T> it6 = list.iterator();
                        while (it6.hasNext()) {
                            if (((InterfaceC25312u) it6.next()) instanceof C20762h) {
                                return new InterfaceC37431i.c(c32783i.getTitle(), arrayList2, listM60545m, c32783i.getAnalyticsSubtotalValue(), c32783i.getCheckoutDestination(), c32783i.getPaymentMethodId());
                            }
                        }
                        return null;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final C37429g m119840d(BuyNowSection buyNowSection, C9598e c9598e) {
        String id4 = buyNowSection.getId();
        String sectionType = buyNowSection.getSectionType();
        List<InterfaceC25312u> listM60545m = this.designItemReducer.m60545m(buyNowSection.getItems());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60545m, 10));
        for (Object objM119838a : listM60545m) {
            if (objM119838a instanceof C39282o) {
                objM119838a = m119838a((C39282o) objM119838a, c9598e);
            }
            arrayList.add(objM119838a);
        }
        return new C37429g(id4, sectionType, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC37431i m119841b(InterfaceC32776b result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.equals(InterfaceC32776b.c.f136367a)) {
            return InterfaceC37431i.d.f160237a;
        }
        if (result instanceof InterfaceC32776b.a) {
            return new InterfaceC37431i.a(((InterfaceC32776b.a) result).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String());
        }
        if (result instanceof InterfaceC32776b.b) {
            return new InterfaceC37431i.b(null, null, null, 7, null);
        }
        if (result instanceof InterfaceC32776b.g) {
            InterfaceC37431i.c cVarM119839c = m119839c(((InterfaceC32776b.g) result).getContent());
            return cVarM119839c != null ? cVarM119839c : new InterfaceC37431i.b(null, null, null, 7, null);
        }
        if (result.equals(InterfaceC32776b.f.f136372a)) {
            return InterfaceC37431i.f.f160239a;
        }
        if (result instanceof InterfaceC32776b.d) {
            return new InterfaceC37431i.e(((InterfaceC32776b.d) result).getCartId());
        }
        if (!(result instanceof InterfaceC32776b.e)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC32776b.e eVar = (InterfaceC32776b.e) result;
        return new InterfaceC37431i.b(eVar.getTitle(), eVar.getMessage(), new InterfaceC37427e.f(eVar.getOrder()));
    }

    public /* synthetic */ C37432j(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC37426d.m119807k() : c21535a);
    }
}
