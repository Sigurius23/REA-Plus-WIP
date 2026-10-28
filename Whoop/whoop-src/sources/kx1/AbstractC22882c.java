package kx1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.membership.management.domain.models.items.AdditionalInfoModel;
import com.whoop.membership.management.domain.models.items.CheckoutCardSummaryItemModel;
import com.whoop.membership.management.domain.models.items.CtaModel;
import com.whoop.membership.management.domain.models.items.DaysLeftModel;
import com.whoop.membership.management.domain.models.items.DowngradeInfoModel;
import com.whoop.membership.management.domain.models.items.DowngradeMembershipCardModel;
import com.whoop.membership.management.domain.models.items.InactiveInfoModel;
import com.whoop.membership.management.domain.models.items.MembershipAdjustmentCheckoutHeaderModel;
import com.whoop.membership.management.domain.models.items.MembershipCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCardStyle;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutRadioOptionModel;
import com.whoop.membership.management.domain.models.items.MembershipFeatureModel;
import com.whoop.membership.management.domain.models.items.MembershipFeaturesCardModel;
import com.whoop.membership.management.domain.models.items.MembershipInfoModel;
import com.whoop.membership.management.domain.models.items.SwitchBillingInfoModel;
import com.whoop.navigation.C9598e;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jx1.C22004a;
import jx1.C22008c;
import jx1.C22010d;
import jx1.C22014f;
import jx1.C22016g;
import jx1.C22017g0;
import jx1.C22018h;
import jx1.C22019i;
import jx1.C22020j;
import jx1.C22021k;
import jx1.C22023m;
import jx1.C22027q;
import jx1.C22029s;
import jx1.C22032v;
import jx1.C22033w;
import jx1.C22035y;
import jx1.C22036z;
import jx1.EnumC22028r;
import jx1.EnumC22030t;
import jx1.EnumC22031u;
import jx1.EnumC22034x;
import kd1.AbstractC22403o;
import km2.C22594e;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import y71.C39282o;

/* JADX INFO: renamed from: kx1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "i", "()Ljb1/a;", "membershipManagementDesignItemReducer", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22882c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f90329a = AbstractC21537c.m60554d(new C22594e(26));

    /* JADX INFO: renamed from: kx1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90330a;

        static {
            int[] iArr = new int[MembershipCardStyle.values().length];
            try {
                iArr[MembershipCardStyle.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipCardStyle.PEAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MembershipCardStyle.LIFE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MembershipCardStyle.PLAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f90330a = iArr;
        }
    }

    /* JADX INFO: renamed from: kx1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C39282o c39282o = (C39282o) it;
            return c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : null, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null);
        }
    }

    /* JADX INFO: renamed from: kx1.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90331w;

        public c(Function1 function1) {
            this.f90331w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f90331w.invoke((MembershipCardModel) it);
        }
    }

    /* JADX INFO: renamed from: kx1.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90332w;

        public d(Function1 function1) {
            this.f90332w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f90332w.invoke((MembershipAdjustmentCheckoutHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: kx1.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90333w;

        public e(Function1 function1) {
            this.f90333w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f90333w.invoke((MembershipCheckoutCardModel) it);
        }
    }

    /* JADX INFO: renamed from: kx1.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90334w;

        public f(Function1 function1) {
            this.f90334w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f90334w.invoke((DowngradeMembershipCardModel) it);
        }
    }

    /* JADX INFO: renamed from: kx1.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90335w;

        public g(Function1 function1) {
            this.f90335w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f90335w.invoke((MembershipFeaturesCardModel) it);
        }
    }

    /* JADX INFO: renamed from: kx1.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90336w;

        public h(Function1 function1) {
            this.f90336w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f90336w.invoke((MembershipCheckoutRadioOptionModel) it);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final C21535a m66488i() {
        return f90329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66489j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C22880a(designItemReducer, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m66490k(C21536b c21536b, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C22594e c22594e = new C22594e(27);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MembershipCardModel.class), new c(c22594e));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MembershipAdjustmentCheckoutHeaderModel.class), new d(new C22594e(28)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MembershipCheckoutCardModel.class), new e(new C22594e(29)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DowngradeMembershipCardModel.class), new f(new C22881b(0)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MembershipFeaturesCardModel.class), new g(new C22881b(1)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(MembershipCheckoutRadioOptionModel.class), new h(new C22881b(2)));
        c21536b.m60546a(c22673i0.getOrCreateKotlinClass(C39282o.class), new b());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: l */
    public static final C22027q m66491l(MembershipCardModel model) {
        ?? arrayList;
        C22020j c22020j;
        C22021k c22021k;
        MembershipCardStyle membershipCardStyle;
        EnumC22028r enumC22028r;
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getTierImage(), 0, 0, 0, 14, null);
        String profilePhoto = model.getProfilePhoto();
        AbstractC22403o cVar2 = profilePhoto != null ? new AbstractC22403o.c(profilePhoto, 0, 0, 0, 14, null) : new AbstractC22403o.a(AbstractC16272a.f61943J1);
        List<MembershipInfoModel> membershipInfo = model.getMembershipInfo();
        if (membershipInfo != null) {
            List<MembershipInfoModel> list = membershipInfo;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (MembershipInfoModel membershipInfoModel : list) {
                arrayList.add(new C22036z(membershipInfoModel.getTitle(), membershipInfoModel.getSubtitle(), membershipInfoModel.getValue()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        DowngradeInfoModel downgradeInfo = model.getDowngradeInfo();
        if (downgradeInfo != null) {
            String title2 = downgradeInfo.getTitle();
            AbstractC22403o.c cVar3 = new AbstractC22403o.c(downgradeInfo.getFromMembership(), 0, 0, 0, 14, null);
            AbstractC22403o.c cVar4 = new AbstractC22403o.c(downgradeInfo.getToMembership(), 0, 0, 0, 14, null);
            DaysLeftModel daysLeft = downgradeInfo.getDaysLeft();
            C22018h c22018h = daysLeft != null ? new C22018h(daysLeft.getTitle(), daysLeft.getDays()) : null;
            C22016g c22016g = new C22016g(downgradeInfo.getPrimaryCta().getText(), downgradeInfo.getPrimaryCta().getDestination());
            CtaModel secondaryCta = downgradeInfo.getSecondaryCta();
            c22020j = new C22020j(title2, cVar3, cVar4, c22018h, c22016g, secondaryCta != null ? new C22016g(secondaryCta.getText(), secondaryCta.getDestination()) : null, downgradeInfo.getTrackingTier());
        } else {
            c22020j = null;
        }
        SwitchBillingInfoModel switchBillingInfo = model.getSwitchBillingInfo();
        C22017g0 c22017g0 = switchBillingInfo != null ? new C22017g0(switchBillingInfo.getTitle(), switchBillingInfo.getSubtitle(), switchBillingInfo.getStrikethroughPrice(), switchBillingInfo.getPrice(), new C22016g(switchBillingInfo.getPrimaryCta().getText(), switchBillingInfo.getPrimaryCta().getDestination()), new C22016g(switchBillingInfo.getSecondaryCta().getText(), switchBillingInfo.getSecondaryCta().getDestination())) : null;
        AdditionalInfoModel additionalInfo = model.getAdditionalInfo();
        C22004a c22004a = additionalInfo != null ? new C22004a(additionalInfo.getTitle(), additionalInfo.getContent()) : null;
        InactiveInfoModel inactive = model.getInactive();
        if (inactive != null) {
            String title3 = inactive.getTitle();
            String subtitle = inactive.getSubtitle();
            DaysLeftModel daysLeft2 = inactive.getDaysLeft();
            C22018h c22018h2 = daysLeft2 != null ? new C22018h(daysLeft2.getTitle(), daysLeft2.getDays()) : null;
            C22016g c22016g2 = new C22016g(inactive.getPrimaryCta().getText(), inactive.getPrimaryCta().getDestination());
            CtaModel secondaryCta2 = inactive.getSecondaryCta();
            c22021k = new C22021k(title3, subtitle, c22018h2, c22016g2, secondaryCta2 != null ? new C22016g(secondaryCta2.getText(), secondaryCta2.getDestination()) : null, inactive.getTrackingTier());
        } else {
            c22021k = null;
        }
        String style = model.getStyle();
        MembershipCardStyle membershipCardStyle2 = MembershipCardStyle.PLAIN;
        MembershipCardStyle[] membershipCardStyleArrValues = MembershipCardStyle.values();
        int length = membershipCardStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                membershipCardStyle = null;
                break;
            }
            MembershipCardStyle membershipCardStyle3 = membershipCardStyleArrValues[i13];
            if (AbstractC22676k.m65745e(membershipCardStyle3.name(), style)) {
                membershipCardStyle = membershipCardStyle3;
                break;
            }
            i13++;
        }
        if (membershipCardStyle != null) {
            membershipCardStyle2 = membershipCardStyle;
        }
        int i14 = a.f90330a[membershipCardStyle2.ordinal()];
        if (i14 == 1) {
            enumC22028r = EnumC22028r.ONE;
        } else if (i14 == 2) {
            enumC22028r = EnumC22028r.PEAK;
        } else if (i14 == 3) {
            enumC22028r = EnumC22028r.LIFE;
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            enumC22028r = EnumC22028r.PLAIN;
        }
        return new C22027q(title, cVar, cVar2, arrayList, c22020j, c22017g0, c22004a, c22021k, enumC22028r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C22023m m66492m(MembershipAdjustmentCheckoutHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C22023m(model.getTitle(), new AbstractC22403o.c(model.getTierImage(), 0, 0, 0, 14, null), model.getSubtitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C22029s m66493n(MembershipCheckoutCardModel model) {
        C22016g c22016g;
        C22010d c22010d;
        C22016g c22016g2;
        EnumC22030t enumC22030t;
        EnumC22030t enumC22030t2;
        EnumC22031u enumC22031u;
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        String subtitle = model.getSubtitle();
        String expandedSubtitle = model.getExpandedSubtitle();
        String price = model.getPrice();
        String expandedPrice = model.getExpandedPrice();
        List<CheckoutCardSummaryItemModel> summaryItems = model.getSummaryItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(summaryItems, 10));
        for (CheckoutCardSummaryItemModel checkoutCardSummaryItemModel : summaryItems) {
            arrayList.add(new C22008c(checkoutCardSummaryItemModel.getLabel(), checkoutCardSummaryItemModel.getAmount()));
        }
        if (model.getPaymentOptions() != null) {
            c22010d = new C22010d(model.getPaymentOptions().getTitle(), model.getPaymentOptions().getExistingLabel(), model.getPaymentOptions().getAlternateLabel(), model.getPaymentOptions().getZipCodeRequired());
            c22016g = null;
        } else {
            c22016g = null;
            c22010d = null;
        }
        String expandTitle = model.getExpandTitle();
        String expandText = model.getExpandText();
        C22016g c22016g3 = new C22016g(model.getPrimaryCta().getText(), model.getPrimaryCta().getDestination());
        if (model.getSecondaryCta() != null) {
            String text = model.getSecondaryCta().getText();
            C9598e destination = model.getSecondaryCta().getDestination();
            if (destination == null) {
                destination = new C9598e(null, null, null, 7, null);
            }
            c22016g2 = new C22016g(text, destination);
        } else {
            c22016g2 = c22016g;
        }
        String footerText = model.getFooterText();
        C22014f c22014f = model.getConfirmModal() != null ? new C22014f(model.getConfirmModal().getTitle(), model.getConfirmModal().getSubtitle(), model.getConfirmModal().getFeatures(), new C22016g(model.getConfirmModal().getKeepCurrentMembershipText(), new C9598e(null, null, null, 7, null)), new C22016g(model.getConfirmModal().getConfirmText(), model.getPrimaryCta().getDestination())) : null;
        String style = model.getStyle();
        EnumC22030t enumC22030t3 = EnumC22030t.ONE;
        EnumC22030t[] enumC22030tArrValues = EnumC22030t.values();
        int length = enumC22030tArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC22030t = enumC22030t3;
                enumC22030t2 = null;
                break;
            }
            enumC22030t2 = enumC22030tArrValues[i13];
            enumC22030t = enumC22030t3;
            if (AbstractC22676k.m65745e(enumC22030t2.name(), style)) {
                break;
            }
            i13++;
            enumC22030t3 = enumC22030t;
        }
        EnumC22030t enumC22030t4 = enumC22030t2 == null ? enumC22030t : enumC22030t2;
        String checkoutType = model.getCheckoutType();
        EnumC22031u enumC22031u2 = EnumC22031u.UPGRADE;
        EnumC22031u[] enumC22031uArrValues = EnumC22031u.values();
        int length2 = enumC22031uArrValues.length;
        EnumC22030t enumC22030t5 = enumC22030t4;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                enumC22031u = null;
                break;
            }
            enumC22031u = enumC22031uArrValues[i14];
            int i15 = i14;
            if (AbstractC22676k.m65745e(enumC22031u.name(), checkoutType)) {
                break;
            }
            i14 = i15 + 1;
        }
        if (enumC22031u != null) {
            enumC22031u2 = enumC22031u;
        }
        return new C22029s(title, subtitle, price, expandedPrice, expandedSubtitle, arrayList, expandTitle, expandText, c22010d, 0, c22016g3, c22016g2, footerText, false, null, null, false, c22014f, false, enumC22030t5, enumC22031u2, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C22019i m66494o(DowngradeMembershipCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C22019i(new AbstractC22403o.c(model.getTierImage(), 0, 0, 0, 14, null), model.getText(), new C22016g(model.getCta().getText(), model.getCta().getDestination()), model.getTrackingTier());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C22035y m66495p(MembershipFeaturesCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getTierImage(), 0, 0, 0, 14, null);
        List<MembershipFeatureModel> features = model.getFeatures();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(features, 10));
        for (MembershipFeatureModel membershipFeatureModel : features) {
            arrayList.add(new C22033w(EnumC16313m0.valueOf(membershipFeatureModel.getIcon()), membershipFeatureModel.getLabel()));
        }
        CtaModel cta = model.getCta();
        EnumC22034x enumC22034x = null;
        C22016g c22016g = cta != null ? new C22016g(cta.getText(), cta.getDestination()) : null;
        String style = model.getStyle();
        EnumC22034x enumC22034x2 = EnumC22034x.ONE;
        for (EnumC22034x enumC22034x3 : EnumC22034x.values()) {
            if (AbstractC22676k.m65745e(enumC22034x3.name(), style)) {
                enumC22034x = enumC22034x3;
                break;
            }
        }
        if (enumC22034x != null) {
            enumC22034x2 = enumC22034x;
        }
        return new C22035y(cVar, arrayList, c22016g, enumC22034x2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C22032v m66496q(MembershipCheckoutRadioOptionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C22032v(model.getTitle(), model.getPrice(), model.getPriceSubtitle(), model.getSelected(), model.getTrackingLabel(), model.getStrikethroughPrice(), model.getDestination(), null, model.getAction());
    }
}
