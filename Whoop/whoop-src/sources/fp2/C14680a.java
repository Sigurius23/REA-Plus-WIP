package fp2;

import bp2.C3539c;
import bp2.InterfaceC3537a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptOrderResponse;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptSectionModel;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptSectionSpacingType;
import ep2.C13431c;
import ep2.InterfaceC13429a;
import io2.C20751b0;
import io2.C20784u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.C21535a;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mn2.AbstractC25718a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import y71.AbstractC39279l;
import y71.C39282o;

/* JADX INFO: renamed from: fp2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!¨\u0006\""}, m65681d2 = {"Lfp2/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lbp2/a$a;", "", "cartId", "source", "Lep2/c;", "d", "(Lbp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lep2/c;", "Lbp2/c;", "Lep2/c$c;", "dialog", "e", "(Lbp2/c;Lep2/c$c;)Lep2/c;", "", "Lcom/whoop/design/models/DesignSystemModel;", "models", "", "orderDetailsIsExpanded", "Lm91/u;", "c", "(Ljava/util/List;Z)Ljava/util/List;", "spacing", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;", "a", "(Ljava/lang/String;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;", "domainResult", "b", "(Lbp2/c;)Lep2/c;", "Ljb1/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14680a {

    /* JADX INFO: renamed from: b */
    public static final int f54243b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C14680a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final ReceiptSectionSpacingType m41991a(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1986416409) {
            if (iHashCode != 72205083) {
                if (iHashCode == 1668466435 && upperCase.equals("COMPACT")) {
                    return ReceiptSectionSpacingType.COMPACT;
                }
            } else if (upperCase.equals("LARGE")) {
                return ReceiptSectionSpacingType.LARGE;
            }
        } else if (upperCase.equals("NORMAL")) {
            return ReceiptSectionSpacingType.NORMAL;
        }
        return ReceiptSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC25312u> m41992c(List<? extends DesignSystemModel> models, boolean orderDetailsIsExpanded) {
        List<? extends DesignSystemModel> list = models;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h((DesignSystemModel) it.next());
            if (interfaceC25312uM60541h instanceof C20784u) {
                interfaceC25312uM60541h = C20784u.m57295b((C20784u) interfaceC25312uM60541h, null, null, null, null, null, orderDetailsIsExpanded, 31, null);
            } else if (interfaceC25312uM60541h instanceof C20751b0) {
                C20751b0 c20751b0 = (C20751b0) interfaceC25312uM60541h;
                C39282o paymentMethodTile = c20751b0.getPaymentMethodTile();
                AbstractC39279l alignment = c20751b0.getPaymentMethodTile().getAlignment();
                if (alignment instanceof AbstractC39279l.b) {
                    alignment = AbstractC39279l.b.m125162b((AbstractC39279l.b) alignment, null, null, null, null, null, null, null, null, null, null, null, true, 2047, null);
                } else if (alignment instanceof AbstractC39279l.c) {
                    alignment = AbstractC39279l.c.m125179b((AbstractC39279l.c) alignment, null, null, null, null, null, null, null, null, null, null, null, true, 2047, null);
                }
                interfaceC25312uM60541h = C20751b0.m57124b(c20751b0, null, paymentMethodTile.m125211a((32735 & 1) != 0 ? paymentMethodTile.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? paymentMethodTile.title : null, (32735 & 4) != 0 ? paymentMethodTile.titleColor : null, (32735 & 8) != 0 ? paymentMethodTile.enabled : false, (32735 & 16) != 0 ? paymentMethodTile.selected : false, (32735 & 32) != 0 ? paymentMethodTile.alignment : alignment, (32735 & 64) != 0 ? paymentMethodTile.shouldApplyCardGradient : false, (32735 & 128) != 0 ? paymentMethodTile.background : null, (32735 & 256) != 0 ? paymentMethodTile.border : null, (32735 & 512) != 0 ? paymentMethodTile.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? paymentMethodTile.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? paymentMethodTile.menuItemStyle : null, (32735 & 4096) != 0 ? paymentMethodTile.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? paymentMethodTile.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? paymentMethodTile.analyticEvent : null), null, null, null, null, null, 125, null);
            }
            arrayList.add(interfaceC25312uM60541h);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private final C13431c m41993d(InterfaceC3537a.a aVar, String str, String str2) {
        if (aVar instanceof InterfaceC3537a.b) {
            return new C13431c(null, new C13431c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, null, 13, null);
        }
        if (aVar instanceof InterfaceC3537a.c) {
            return new C13431c(null, new C13431c.b(C33205o0.f138451a.m105289c(), new InterfaceC13429a.g(str, str2), null, InterfaceC13429a.j.f47035a, 4, null), null, null, 13, null);
        }
        if (aVar instanceof InterfaceC3537a.d) {
            return new C13431c(null, new C13431c.b(C33205o0.f138451a.m105291e(), new InterfaceC13429a.g(str, str2), null, InterfaceC13429a.j.f47035a, 4, null), null, null, 13, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    private final C13431c m41994e(C3539c c3539c, C13431c.c cVar) {
        List<ReceiptSectionModel> sections;
        ReceiptSectionSpacingType receiptSectionSpacingTypeM41991a;
        ReceiptOrderResponse response = c3539c.getResponse();
        if (response == null || (sections = response.getSections()) == null) {
            sections = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<ReceiptSectionModel> arrayList2 = new ArrayList();
        for (Object obj : sections) {
            if (AbstractC22676k.m65745e(((ReceiptSectionModel) obj).getId(), "sticky-bottom-items")) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        AnyModal modal = c3539c.getModal();
        ReceiptOrderResponse response2 = c3539c.getResponse();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(response2 != null ? response2.getTitle() : null);
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        for (ReceiptSectionModel receiptSectionModel : arrayList2) {
            String sectionType = receiptSectionModel.getSectionType();
            if (sectionType == null || (receiptSectionSpacingTypeM41991a = m41991a(sectionType)) == null) {
                receiptSectionSpacingTypeM41991a = ReceiptSectionSpacingType.COMPACT;
            }
            arrayList3.add(new C13431c.a(m41992c(receiptSectionModel.getItems(), c3539c.getOrderDetailsIsExpanded()), receiptSectionSpacingTypeM41991a));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList4, ((ReceiptSectionModel) it.next()).getItems());
        }
        List<InterfaceC25312u> listM41992c = m41992c(arrayList4, c3539c.getOrderDetailsIsExpanded());
        ReceiptOrderResponse response3 = c3539c.getResponse();
        return new C13431c(cVar, null, new C13431c.d(textResourceM21278l, arrayList3, listM41992c, response3 != null ? response3.getCloseInteraction() : null), modal, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final C13431c m41995b(C3539c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC3537a.a ? m41993d((InterfaceC3537a.a) domainResult.getCurrentDialogType(), domainResult.getCartId(), domainResult.getSource()) : m41994e(domainResult, null);
    }

    public /* synthetic */ C14680a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25718a.m75812o() : c21535a);
    }
}
