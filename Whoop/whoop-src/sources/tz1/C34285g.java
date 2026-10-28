package tz1;

import b91.EnumC2888c;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.nativestore.home.domain.model.CheckoutFooter;
import com.whoop.nativestore.home.domain.model.NativeStoreSection;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23613d4;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import pz1.AbstractC29645c;
import pz1.C29644b;
import qz1.AbstractC30796a;
import r51.C30938f;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tz1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ltz1/g;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;", "Ltz1/e;", "b", "(Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;)Ltz1/e;", "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;", "", "isRefreshing", "Ltz1/a;", "c", "(Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;Z)Ltz1/a;", "Lpz1/b;", "domainState", "Ltz1/f;", "a", "(Lpz1/b;)Ltz1/f;", "Ljb1/a;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34285g {

    /* JADX INFO: renamed from: b */
    public static final int f144006b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C34285g(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final C34283e m108590b(NativeStoreSection nativeStoreSection) {
        List<C25306o> listM60536k = C21535a.m60536k(this.designItemReducer, nativeStoreSection.getItems(), null, 2, null);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60536k, 10));
        for (C25306o c25306o : listM60536k) {
            InterfaceC25312u state = c25306o.getState();
            if (state instanceof C39282o) {
                C39282o c39282o = (C39282o) state;
                state = c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : null, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : c25306o.getPrimaryAnalyticEvent());
            }
            arrayList.add(state);
        }
        return new C34283e(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0082  */
    /* JADX INFO: renamed from: c */
    private final C34279a m108591c(CheckoutFooter checkoutFooter, boolean z4) {
        C33169c0 c33169c0;
        List<CardButtonModel> cardButtons = checkoutFooter.getCardButtons();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cardButtons, 10));
        Iterator<T> it = cardButtons.iterator();
        while (it.hasNext()) {
            arrayList.add(C27256h.m82144b(AbstractC23613d4.m68662l((CardButtonModel) it.next(), null, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z4, null, null, null, null, null, null, null, 33423359, null));
        }
        String headerText = checkoutFooter.getHeaderText();
        if (headerText == null) {
            c33169c0 = null;
        } else {
            String str = !AbstractC39414r.m125890i0(headerText) ? headerText : null;
            if (str != null) {
                c33169c0 = new C33169c0(str, EnumC2888c.B2, EnumC39333f.WHITE_70, 3, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null);
            } else {
                c33169c0 = null;
            }
        }
        if (arrayList.isEmpty() && c33169c0 == null) {
            return null;
        }
        return new C34279a(arrayList, c33169c0);
    }

    /* JADX INFO: renamed from: a */
    public final C34284f m108592a(C29644b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC29645c state = domainState.getState();
        if (AbstractC22676k.m65745e(state, AbstractC29645c.c.f121044a)) {
            return new C34284f(true, false, null, null, false, 30, null);
        }
        if (AbstractC22676k.m65745e(state, AbstractC29645c.a.f121041a)) {
            return new C34284f(false, true, null, null, false, 29, null);
        }
        if (!(state instanceof AbstractC29645c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC29645c.b bVar = (AbstractC29645c.b) state;
        String navigationBarText = bVar.getResponse().getNavigationBarText();
        List<NativeStoreSection> sections = bVar.getResponse().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(m108590b((NativeStoreSection) it.next()));
        }
        CountrySelectorModel countrySelector = bVar.getResponse().getCountrySelector();
        C30938f c30938fM94714b = countrySelector != null ? AbstractC30796a.m94714b(countrySelector) : null;
        CheckoutFooter checkoutFooter = bVar.getResponse().getCheckoutFooter();
        return new C34284f(false, false, new C34280b(navigationBarText, arrayList, c30938fM94714b, checkoutFooter != null ? m108591c(checkoutFooter, bVar.getIsRefreshing()) : null, bVar.getResponse().getCart() != null), null, false, 27, null);
    }

    public /* synthetic */ C34285g(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC34281c.m108567d() : c21535a);
    }
}
