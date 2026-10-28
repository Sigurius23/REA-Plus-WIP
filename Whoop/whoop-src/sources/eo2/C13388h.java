package eo2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.universalcheckout.features.cart.domain.AbstractC10659b;
import com.whoop.universalcheckout.features.cart.domain.C10660c;
import com.whoop.universalcheckout.features.cart.domain.models.CartResponse;
import com.whoop.universalcheckout.features.cart.domain.models.CartSection;
import fo2.C14666d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: eo2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Leo2/h;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "", "fallbackCartId", "", "isUpdating", "Leo2/a;", "b", "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Ljava/lang/String;Z)Leo2/a;", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;", "Leo2/e;", "c", "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;Z)Leo2/e;", "Lcom/whoop/universalcheckout/features/cart/domain/c;", "domainState", "Leo2/g;", "a", "(Lcom/whoop/universalcheckout/features/cart/domain/c;)Leo2/g;", "Ljb1/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13388h {

    /* JADX INFO: renamed from: b */
    public static final int f46894b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C13388h(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final C13381a m37793b(CartResponse cartResponse, String str, boolean z4) {
        List<InterfaceC25312u> listM60545m;
        List<DesignSystemModel> items;
        String title = cartResponse.getTitle();
        List<CartSection> sections = cartResponse.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(m37794c((CartSection) it.next(), z4));
        }
        CartSection checkoutFooter = cartResponse.getCheckoutFooter();
        if (checkoutFooter == null || (items = checkoutFooter.getItems()) == null || (listM60545m = this.designItemReducer.m60545m(items)) == null) {
            listM60545m = C25271y.f99162w;
        }
        List<InterfaceC25312u> list = listM60545m;
        String cartId = cartResponse.getCartId();
        return new C13381a(title, arrayList, list, cartId == null ? str : cartId, cartResponse.getAnalyticsSubtotalValue());
    }

    /* JADX INFO: renamed from: c */
    private final C13385e m37794c(CartSection cartSection, boolean z4) {
        String id4 = cartSection.getId();
        String sectionType = cartSection.getSectionType();
        List<InterfaceC25312u> listM60545m = this.designItemReducer.m60545m(cartSection.getItems());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60545m, 10));
        for (Object objM41906a : listM60545m) {
            if (objM41906a instanceof C14666d) {
                C14666d c14666d = (C14666d) objM41906a;
                objM41906a = c14666d.m41906a((15933 & 1) != 0 ? c14666d.title : null, (15933 & 2) != 0 ? c14666d.subtitle : null, (15933 & 4) != 0 ? c14666d.image : null, (15933 & 8) != 0 ? c14666d.stackedImages : null, (15933 & 16) != 0 ? c14666d.price : null, (15933 & 32) != 0 ? c14666d.strikethroughPrice : null, (15933 & 64) != 0 ? c14666d.quantity : 0, (15933 & 128) != 0 ? c14666d.minQuantity : 0, (15933 & 256) != 0 ? c14666d.maxQuantity : 0, (15933 & 512) != 0 ? c14666d.isNotEditable : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c14666d.hideQuantity : false, (15933 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c14666d.lineItemId : null, (15933 & 4096) != 0 ? c14666d.analyticsLabel : null, (15933 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c14666d.isUpdating : z4);
            }
            arrayList.add(objM41906a);
        }
        return new C13385e(id4, sectionType, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final C13387g m37795a(C10660c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC10659b state = domainState.getState();
        if (AbstractC22676k.m65745e(state, AbstractC10659b.c.f32468a)) {
            return new C13387g(true, false, null, false, null, null, 62, null);
        }
        if (state instanceof AbstractC10659b.a) {
            AbstractC10659b.a aVar = (AbstractC10659b.a) state;
            CartResponse response = aVar.getResponse();
            return new C13387g(false, true, response != null ? m37793b(response, domainState.getCartId(), domainState.getIsUpdating()) : null, domainState.getIsUpdating(), !domainState.getIsUpdating() ? aVar.getKind() : null, aVar.getSupportText(), 1, null);
        }
        if (state instanceof AbstractC10659b.b) {
            return new C13387g(false, false, m37793b(((AbstractC10659b.b) state).getResponse(), domainState.getCartId(), domainState.getIsUpdating()), domainState.getIsUpdating(), null, null, 51, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C13388h(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC13382b.m37760o() : c21535a);
    }
}
