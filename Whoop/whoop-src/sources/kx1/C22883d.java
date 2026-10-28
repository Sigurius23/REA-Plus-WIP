package kx1;

import bx1.InterfaceC3688b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.membership.management.domain.models.ScreenSection;
import com.whoop.payments.domain.models.Card;
import cx1.C11178a;
import dx1.InterfaceC12428b;
import ex1.InterfaceC13728b;
import fx1.C14846b;
import fx1.InterfaceC14847c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jx1.AbstractC22009c0;
import jx1.AbstractC22012e;
import jx1.AbstractC22022l;
import jx1.AbstractC22025o;
import jx1.C22010d;
import jx1.C22013e0;
import jx1.C22015f0;
import jx1.C22029s;
import jx1.EnumC22024n;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q22.C29855e;

/* JADX INFO: renamed from: kx1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lkx1/d;", "", "Lq22/e;", "paymentFormValidator", "<init>", "(Lq22/e;)V", "Lex1/b;", "result", "Ljx1/c0;", "e", "(Lex1/b;)Ljx1/c0;", "Lfx1/b;", "Ljx1/o;", "d", "(Lfx1/b;)Ljx1/o;", "Ldx1/b;", "Ljx1/l;", "c", "(Ldx1/b;)Ljx1/l;", "Lbx1/b;", "Ljx1/e;", "b", "(Lbx1/b;)Ljx1/e;", "Lcx1/a;", "domainResult", "Ljx1/e0;", "a", "(Lcx1/a;)Ljx1/e0;", "Lq22/e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22883d {

    /* JADX INFO: renamed from: b */
    public static final int f90337b = C29855e.f122028d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29855e paymentFormValidator;

    public C22883d(C29855e paymentFormValidator) {
        AbstractC22676k.m65750j(paymentFormValidator, "paymentFormValidator");
        this.paymentFormValidator = paymentFormValidator;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC22012e m66504b(InterfaceC3688b result) {
        if (AbstractC22676k.m65745e(result, InterfaceC3688b.b.f15064a)) {
            return AbstractC22012e.b.f85352a;
        }
        if (!(result instanceof InterfaceC3688b.a)) {
            if (AbstractC22676k.m65745e(result, InterfaceC3688b.c.f15065a)) {
                return AbstractC22012e.c.f85353a;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC3688b.a aVar = (InterfaceC3688b.a) result;
        String path = aVar.getPath();
        if (path == null) {
            path = "";
        }
        return new AbstractC22012e.a(path, aVar.m11473c(), aVar.getCard());
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC22022l m66505c(InterfaceC12428b result) {
        EnumC22024n enumC22024n;
        if (!(result instanceof InterfaceC12428b.c)) {
            if (AbstractC22676k.m65745e(result, InterfaceC12428b.a.f42331a)) {
                return AbstractC22022l.a.f85396a;
            }
            if (AbstractC22676k.m65745e(result, InterfaceC12428b.b.f42332a)) {
                return AbstractC22022l.c.f85400a;
            }
            if (AbstractC22676k.m65745e(result, InterfaceC12428b.d.f42334a)) {
                return AbstractC22022l.d.f85401a;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC12428b.c cVar = (InterfaceC12428b.c) result;
        String navigationBarText = cVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getNavigationBarText();
        List<ScreenSection> sections = cVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            List<DesignSystemModel> items = ((ScreenSection) it.next()).getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it3 = items.iterator();
            while (it3.hasNext()) {
                arrayList2.add(AbstractC22882c.m66488i().m60541h((DesignSystemModel) it3.next()));
            }
            arrayList.add(new C22015f0(arrayList2));
        }
        String style = cVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getStyle();
        EnumC22024n enumC22024n2 = EnumC22024n.ONE;
        EnumC22024n[] enumC22024nArrValues = EnumC22024n.values();
        int length = enumC22024nArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC22024n = null;
                break;
            }
            enumC22024n = enumC22024nArrValues[i13];
            if (AbstractC22676k.m65745e(enumC22024n.name(), style)) {
                break;
            }
            i13++;
        }
        if (enumC22024n != null) {
            enumC22024n2 = enumC22024n;
        }
        return new AbstractC22022l.b(navigationBarText, arrayList, enumC22024n2);
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC22025o m66506d(C14846b result) {
        int i13;
        EnumC22024n enumC22024n;
        InterfaceC14847c screenState = result.getScreenState();
        if (!(screenState instanceof InterfaceC14847c.d)) {
            if (screenState instanceof InterfaceC14847c.a) {
                return new AbstractC22025o.a(((InterfaceC14847c.a) result.getScreenState()).m42731a());
            }
            if (AbstractC22676k.m65745e(screenState, InterfaceC14847c.c.f55353a)) {
                return AbstractC22025o.d.f85414b;
            }
            if (AbstractC22676k.m65745e(screenState, InterfaceC14847c.e.f55361a)) {
                return AbstractC22025o.e.f85415b;
            }
            if (!(screenState instanceof InterfaceC14847c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Map<String, String> mapM42729c = result.m42729c();
            Map<String, String> mapM42733b = ((InterfaceC14847c.b) result.getScreenState()).m42733b();
            String path = ((InterfaceC14847c.b) result.getScreenState()).getPath();
            if (path == null) {
                path = "";
            }
            return new AbstractC22025o.b(mapM42729c, path, mapM42733b, ((InterfaceC14847c.b) result.getScreenState()).getCard());
        }
        String navigationBarText = ((InterfaceC14847c.d) result.getScreenState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getNavigationBarText();
        List<ScreenSection> sections = ((InterfaceC14847c.d) result.getScreenState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (true) {
            enumC22024n = null;
            if (!it.hasNext()) {
                break;
            }
            List<DesignSystemModel> items = ((ScreenSection) it.next()).getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it3 = items.iterator();
            while (it3.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h = AbstractC22882c.m66488i().m60541h((DesignSystemModel) it3.next());
                if (interfaceC25312uM60541h instanceof C22029s) {
                    C22029s c22029s = (C22029s) interfaceC25312uM60541h;
                    boolean isExpanded = ((InterfaceC14847c.d) result.getScreenState()).getIsExpanded();
                    C29855e c29855e = this.paymentFormValidator;
                    int selectedPaymentOptionIndex = ((InterfaceC14847c.d) result.getScreenState()).getSelectedPaymentOptionIndex();
                    Card card = ((InterfaceC14847c.d) result.getScreenState()).getCard();
                    C22010d paymentOptions = c22029s.getPaymentOptions();
                    String existingLabel = paymentOptions != null ? paymentOptions.getExistingLabel() : null;
                    interfaceC25312uM60541h = C22029s.m62975b(c22029s, null, null, null, null, null, null, null, null, null, selectedPaymentOptionIndex, null, null, null, isExpanded, c29855e, card, !(existingLabel == null || existingLabel.length() == 0 || ((InterfaceC14847c.d) result.getScreenState()).getSelectedPaymentOptionIndex() != 0) || ((InterfaceC14847c.d) result.getScreenState()).getValidCard(), null, ((InterfaceC14847c.d) result.getScreenState()).getShowConfirmModal(), null, null, String.valueOf(((InterfaceC14847c.d) result.getScreenState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getTrackingMonths()), 1711615, null);
                }
                arrayList2.add(interfaceC25312uM60541h);
            }
            arrayList.add(new C22015f0(arrayList2));
        }
        String style = ((InterfaceC14847c.d) result.getScreenState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getStyle();
        EnumC22024n enumC22024n2 = EnumC22024n.ONE;
        for (EnumC22024n enumC22024n3 : EnumC22024n.values()) {
            if (AbstractC22676k.m65745e(enumC22024n3.name(), style)) {
                enumC22024n = enumC22024n3;
                break;
            }
        }
        if (enumC22024n != null) {
            enumC22024n2 = enumC22024n;
        }
        return new AbstractC22025o.c(navigationBarText, arrayList, enumC22024n2);
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC22009c0 m66507e(InterfaceC13728b result) {
        if (!(result instanceof InterfaceC13728b.d)) {
            if (AbstractC22676k.m65745e(result, InterfaceC13728b.a.f48743a)) {
                return AbstractC22009c0.a.f85262a;
            }
            if (AbstractC22676k.m65745e(result, InterfaceC13728b.c.f48746a)) {
                return AbstractC22009c0.d.f85267a;
            }
            if (AbstractC22676k.m65745e(result, InterfaceC13728b.f.f48749a)) {
                return AbstractC22009c0.f.f85269a;
            }
            if (result instanceof InterfaceC13728b.b) {
                InterfaceC13728b.b bVar = (InterfaceC13728b.b) result;
                return new AbstractC22009c0.b(bVar.getPath(), bVar.m38946b());
            }
            if (AbstractC22676k.m65745e(result, InterfaceC13728b.e.f48748a)) {
                return AbstractC22009c0.e.f85268a;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC13728b.d dVar = (InterfaceC13728b.d) result;
        String navigationBarText = dVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getNavigationBarText();
        List<ScreenSection> sections = dVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            List<DesignSystemModel> items = ((ScreenSection) it.next()).getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it3 = items.iterator();
            while (it3.hasNext()) {
                arrayList2.add(AbstractC22882c.m66488i().m60541h((DesignSystemModel) it3.next()));
            }
            arrayList.add(new C22015f0(arrayList2));
        }
        return new AbstractC22009c0.c(navigationBarText, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final C22013e0 m66508a(C11178a domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return new C22013e0(m66507e(domainResult.getMembershipManagementScreen()), m66506d(domainResult.getMembershipAdjustmentCheckoutScreen()), m66505c(domainResult.getManageMembershipScreen()), m66504b(domainResult.getCheckoutScreen()));
    }
}
