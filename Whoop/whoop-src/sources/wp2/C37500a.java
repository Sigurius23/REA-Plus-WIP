package wp2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.shippingmethod.domain.models.ShippingMethod;
import com.whoop.universalcheckout.features.shippingmethod.domain.models.ShippingMethodModels;
import i91.AbstractC18249c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25267u;
import ny0.C27256h;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33205o0;
import p745y81.EnumC39333f;
import rp2.C31642b;
import sp2.C32875c;
import sp2.InterfaceC32873a;
import vp2.C36276c;
import vp2.InterfaceC36274a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: wp2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lwp2/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lsp2/a$a;", "", "cartId", "source", "Lvp2/c;", "b", "(Lsp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lvp2/c;", "Lsp2/c;", "Lvp2/c$d;", "dialog", "d", "(Lsp2/c;Lvp2/c$d;)Lvp2/c;", "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;", "", "isSelected", "hasDivider", "Lrp2/b;", "c", "(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;ZZ)Lrp2/b;", "domainResult", "a", "(Lsp2/c;)Lvp2/c;", "Ljb1/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37500a {

    /* JADX INFO: renamed from: b */
    public static final int f160406b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C37500a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: b */
    private final C36276c m120198b(InterfaceC32873a.a aVar, String str, String str2) {
        if (aVar instanceof InterfaceC32873a.b) {
            return new C36276c(null, new C36276c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC32873a.c) {
            return new C36276c(null, new C36276c.b(C33205o0.f138451a.m105289c(), str != null ? new InterfaceC36274a.h(str, str2) : null, null, InterfaceC36274a.e.f155439a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC32873a.d) {
            return new C36276c(null, new C36276c.b(C33205o0.f138451a.m105291e(), str != null ? new InterfaceC36274a.h(str, str2) : null, null, InterfaceC36274a.e.f155439a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC32873a.f) {
            return new C36276c(null, new C36276c.b(C33205o0.f138451a.m105293g(), InterfaceC36274a.e.f155439a, null, null, 12, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC32873a.e) {
            return new C36276c(null, new C36276c.b(C33205o0.f138451a.m105291e(), null, null, InterfaceC36274a.e.f155439a, 6, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final C31642b m120199c(ShippingMethod shippingMethod, boolean z4, boolean z13) {
        return new C31642b(shippingMethod.getId(), AbstractC8693b.m21278l(shippingMethod.getTitle()), AbstractC8693b.m21278l(shippingMethod.getSubtitle()), z4, z13);
    }

    /* JADX INFO: renamed from: d */
    private final C36276c m120200d(C32875c c32875c, C36276c.d dVar) {
        C36276c.c cVar;
        ShippingMethodModels response = c32875c.getResponse();
        if (response != null) {
            C27256h c27256h = new C27256h(AbstractC8693b.m21278l(response.getCtaText()), null, AbstractC18249c.m52575m(EnumC39333f.BRAND_WHITE), EnumC39333f.BRAND_BLACK, null, null, EnumC27272p.DEFAULT, new C9598e(null, null, null, 7, null), null, null, EnumC27254g.STANDARD, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33528626, null);
            List<ShippingMethod> shippingMethods = response.getShippingMethods();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(shippingMethods, 10));
            Iterator<T> it = shippingMethods.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    String cartId = c32875c.getCartId();
                    if (cartId == null) {
                        throw new IllegalArgumentException("cartId must be set");
                    }
                    cVar = new C36276c.c(cartId, AbstractC8693b.m21278l(response.getTitle()), arrayList, c32875c.getSelectedShippingMethodId(), c32875c.getIsSubmitting(), !c32875c.getManualRefresh() && c32875c.getDisplayRefreshingSpinner(), AbstractC37056f.m118958J(c27256h));
                    break;
                }
                Object next = it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                ShippingMethod shippingMethod = (ShippingMethod) next;
                arrayList.add(new C36276c.a(AbstractC37056f.m118958J(m120199c(shippingMethod, AbstractC22676k.m65745e(shippingMethod.getId(), c32875c.getSelectedShippingMethodId()), i13 < response.getShippingMethods().size() - 1))));
                i13 = i14;
            }
        } else {
            cVar = null;
        }
        return new C36276c(dVar, null, cVar, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final C36276c m120201a(C32875c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult.getIsSubmitting()) {
            return new C36276c(null, new C36276c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (domainResult.getCurrentDialogType() instanceof InterfaceC32873a.a) {
            return m120198b((InterfaceC32873a.a) domainResult.getCurrentDialogType(), domainResult.getCartId(), domainResult.getSource());
        }
        domainResult.getCurrentDialogType();
        return m120200d(domainResult, null);
    }

    public /* synthetic */ C37500a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC37501b.f160408a : c21535a);
    }
}
