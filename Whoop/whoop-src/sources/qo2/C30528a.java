package qo2;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutResponse;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutSectionModel;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutSectionSpacingType;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PreviewTileModel;
import gz0.EnumC16313m0;
import hy0.C17777p0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io2.AbstractC20775n0;
import io2.C20751b0;
import io2.C20755d0;
import io2.C20762h;
import io2.C20777o0;
import io2.C20784u;
import j02.EnumC21177x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import jo2.C21839b;
import kd1.AbstractC22403o;
import ko2.C22653c;
import ko2.InterfaceC22651a;
import kotlinx.serialization.json.JsonElement;
import ln2.AbstractC24541a;
import lo2.C24620b;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mn2.AbstractC25718a;
import mn2.EnumC25719b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p31.AbstractC28805p;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import po2.C29404c;
import po2.InterfaceC29402a;
import q20.C29814e;
import u82.AbstractC34647h;
import y71.AbstractC39279l;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: qo2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0015\u001a\u00020\u0014*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001f\u001a\u00020\u001e*\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010&\u001a\b\u0012\u0004\u0012\u00020%0!*\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101¨\u00062"}, m65681d2 = {"Lqo2/a;", "", "Ljb1/a;", "reducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ljb1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lko2/c;", "Ljo2/b;", "stripeFlowControllerState", "Lj02/x0;", "b", "(Lko2/c;Ljo2/b;)Lj02/x0;", "Lko2/a$b;", "", "dynamicPayload", "dynamicPath", "source", "cartId", "Lpo2/c$b;", "e", "(Lko2/a$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpo2/c$b;", "Lpo2/c$d;", "dialog", "fullScreenModal", "", "isStripeFlowControllerConfigured", "Lq20/e;", "initialStripePaymentOption", "Lpo2/c;", "f", "(Lko2/c;Lpo2/c$d;Lpo2/c$b;ZLq20/e;)Lpo2/c;", "", "Lcom/whoop/design/models/DesignSystemModel;", "models", "paymentOption", "Lm91/u;", "d", "(Lko2/c;Ljava/util/List;ZLq20/e;Ljava/lang/String;)Ljava/util/List;", "spacing", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionSpacingType;", "a", "(Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionSpacingType;", "Llo2/b;", "domainResult", "c", "(Llo2/b;)Lpo2/c;", "Ljb1/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30528a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: qo2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f125534a;

        static {
            int[] iArr = new int[EnumC21177x0.values().length];
            try {
                iArr[EnumC21177x0.SHIPPING_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21177x0.PAYMENT_METHOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125534a = iArr;
        }
    }

    /* JADX INFO: renamed from: qo2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f125535w = new b();

        /* JADX INFO: renamed from: a */
        public final long m93581a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m93581a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: qo2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f125536w = new c();

        /* JADX INFO: renamed from: a */
        public final long m93582a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m93582a((C39336i) obj));
        }
    }

    public C30528a(C21535a reducer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.reducer = reducer;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final UniversalCheckoutSectionSpacingType m93575a(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1986416409) {
            if (iHashCode != 72205083) {
                if (iHashCode == 1668466435 && upperCase.equals("COMPACT")) {
                    return UniversalCheckoutSectionSpacingType.COMPACT;
                }
            } else if (upperCase.equals("LARGE")) {
                return UniversalCheckoutSectionSpacingType.LARGE;
            }
        } else if (upperCase.equals("NORMAL")) {
            return UniversalCheckoutSectionSpacingType.NORMAL;
        }
        return UniversalCheckoutSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: b */
    private final EnumC21177x0 m93576b(C22653c c22653c, C21839b c21839b) {
        EnumC21177x0 autoTrigger = c22653c.getAutoTrigger();
        if (autoTrigger != null) {
            if (c22653c.getHasAutoTriggered()) {
                autoTrigger = null;
            }
            if (autoTrigger != null && c22653c.getResponse() != null && c22653c.getCurrentDialogType() == null) {
                int i13 = a.f125534a[autoTrigger.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!AbstractC30529b.m93584b(c21839b, c22653c.getStripeConfigurationId())) {
                        return null;
                    }
                }
                return autoTrigger;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX INFO: renamed from: d */
    private final List<InterfaceC25312u> m93577d(C22653c c22653c, List<? extends DesignSystemModel> list, boolean z4, C29814e c29814e, String str) {
        ?? arrayList;
        String str2;
        AbstractC28805p header;
        C39282o c39282oM125211a;
        String str3 = str;
        if (EnumC25719b.INSTANCE.m75836a(str3).isInAppJoinFlow() ? this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.IN_APP_JOIN_FLOW_SHIPPING_TILES) : this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.IN_APP_JOIN_FLOW_SHIPPING_INFO)) {
            arrayList = list;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((DesignSystemModel) obj) instanceof PreviewTileModel)) {
                    arrayList.add(obj);
                }
            }
        }
        UniversalCheckoutResponse response = c22653c.getResponse();
        if (response == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String cartId = response.getCartId();
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h((DesignSystemModel) it.next());
            if (interfaceC25312uM60541h instanceof C20784u) {
                interfaceC25312uM60541h = C20784u.m57295b((C20784u) interfaceC25312uM60541h, null, null, null, null, null, c22653c.getOrderDetailsIsExpanded(), 31, null);
                str2 = cartId;
            } else if (interfaceC25312uM60541h instanceof C20755d0) {
                str2 = cartId;
                interfaceC25312uM60541h = C20755d0.m57142b((C20755d0) interfaceC25312uM60541h, null, null, null, str2, 7, null);
            } else {
                str2 = cartId;
                if (interfaceC25312uM60541h instanceof C20751b0) {
                    C20751b0 c20751b0 = (C20751b0) interfaceC25312uM60541h;
                    AbstractC28805p header2 = c20751b0.getHeader();
                    if (!(header2 instanceof AbstractC28805p.e)) {
                        header = c20751b0.getHeader();
                    } else if (c29814e != null) {
                        header = AbstractC28805p.e.m87657b((AbstractC28805p.e) header2, null, null, 0, null, false, false, 0, z4, null, null, null, null, 3967, null);
                    } else {
                        AbstractC28805p.e eVar = (AbstractC28805p.e) header2;
                        header = new AbstractC28805p.a(eVar.getLeftTitle(), null, eVar.getStyle(), eVar.getTypography(), null, null, false, false, null, null, MessageListItemViewType.ERROR_MESSAGE, null);
                    }
                    C39282o c39282o = c29814e != null ? new C39282o(null, AbstractC8693b.m21278l(c29814e.m91322b()), null, false, false, new AbstractC39279l.c(null, null, new AbstractC22403o.a(c29814e.m91321a()), p745y81.Function1.m125324b(C17919x.f69637n), null, null, null, null, null, null, null, false, 4083, null), false, null, null, null, false, null, null, null, null, 32733, null) : C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21277k(AbstractC24541a.f95769a), null, null, null, null, new C39274g(EnumC16313m0.CREDIT_CARD.toWhoopIcon(), null, 2, null), null, null, null, null, null, null, null, null, z4, false, null, true, null, null, null, false, null, 8241118, null);
                    C39282o truemedPaymentMenuItem = c20751b0.getTruemedPaymentMenuItem();
                    if (truemedPaymentMenuItem != null) {
                        AbstractC39279l alignment = c20751b0.getTruemedPaymentMenuItem().getAlignment();
                        if (alignment instanceof AbstractC39279l.b) {
                            alignment = AbstractC39279l.b.m125162b((AbstractC39279l.b) alignment, null, null, null, p745y81.Function1.m125323a(b.f125535w), null, p745y81.Function1.m125323a(c.f125536w), null, null, null, null, null, false, 4055, null);
                        }
                        c39282oM125211a = truemedPaymentMenuItem.m125211a((32735 & 1) != 0 ? truemedPaymentMenuItem.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? truemedPaymentMenuItem.title : null, (32735 & 4) != 0 ? truemedPaymentMenuItem.titleColor : null, (32735 & 8) != 0 ? truemedPaymentMenuItem.enabled : false, (32735 & 16) != 0 ? truemedPaymentMenuItem.selected : false, (32735 & 32) != 0 ? truemedPaymentMenuItem.alignment : alignment, (32735 & 64) != 0 ? truemedPaymentMenuItem.shouldApplyCardGradient : false, (32735 & 128) != 0 ? truemedPaymentMenuItem.background : null, (32735 & 256) != 0 ? truemedPaymentMenuItem.border : null, (32735 & 512) != 0 ? truemedPaymentMenuItem.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? truemedPaymentMenuItem.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? truemedPaymentMenuItem.menuItemStyle : null, (32735 & 4096) != 0 ? truemedPaymentMenuItem.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? truemedPaymentMenuItem.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? truemedPaymentMenuItem.analyticEvent : null);
                    } else {
                        c39282oM125211a = null;
                    }
                    Map<String, JsonElement> analyticsPayload = c22653c.getResponse().getAnalyticsPayload();
                    interfaceC25312uM60541h = C20751b0.m57124b(c20751b0, header, c39282o, c39282oM125211a, null, str2, str3, analyticsPayload != null ? AbstractC34647h.m109487b(analyticsPayload) : null, 8, null);
                } else if (interfaceC25312uM60541h instanceof C20762h) {
                    C20762h c20762h = (C20762h) interfaceC25312uM60541h;
                    interfaceC25312uM60541h = C20762h.m57170b(c20762h, null, null, null, null, c20762h.getIsEnabled() && (c20762h.getSkipStripeCheckout() || !(c22653c.getPromoCodeInputIsLoading() || !z4 || c29814e == null)), false, 47, null);
                } else if (interfaceC25312uM60541h instanceof C20777o0) {
                    interfaceC25312uM60541h = C20777o0.m57244b((C20777o0) interfaceC25312uM60541h, null, null, null, c22653c.getPromoCodeErrorMessage().length() > 0 ? new AbstractC20775n0.a(AbstractC8693b.m21278l(c22653c.getPromoCodeErrorMessage()), EnumC39333f.ACCENT_NEGATIVE_TREND) : c22653c.getPromoCodeInputIsLoading() ? AbstractC20775n0.b.f78016a : ((C20777o0) interfaceC25312uM60541h).getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), null, c22653c.getPromoCodeInputIsExpanded(), str2, 23, null);
                } else if (interfaceC25312uM60541h instanceof C17777p0) {
                    C17777p0 c17777p0 = (C17777p0) interfaceC25312uM60541h;
                    interfaceC25312uM60541h = C17777p0.m51068b(c17777p0, null, null, c17777p0.getIsChecked() ^ c22653c.getRefreshAnnualToggle(), null, 11, null);
                }
            }
            arrayList2.add(interfaceC25312uM60541h);
            str3 = str;
            cartId = str2;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    private final C29404c.b m93578e(InterfaceC22651a.b bVar, String str, String str2, String str3, String str4) {
        if (bVar instanceof InterfaceC22651a.c) {
            return new C29404c.b(C33211q0.m105332d(C33205o0.f138451a.m105288b(), null, null, null, null, null, false, false, null, false, ((InterfaceC22651a.c) bVar).getOverlayBackground(), FrameMetricsAggregator.EVERY_DURATION, null), null, null, null, 14, null);
        }
        if (bVar instanceof InterfaceC22651a.d) {
            return new C29404c.b(C33205o0.f138451a.m105289c(), new InterfaceC29402a.l(str2, str, str3, null, null, null, 56, null), null, InterfaceC29402a.m.f119335a, 4, null);
        }
        if (bVar instanceof InterfaceC22651a.f) {
            return new C29404c.b(C33205o0.f138451a.m105291e(), new InterfaceC29402a.l(str2, str, str3, null, null, null, 56, null), null, InterfaceC29402a.m.f119335a, 4, null);
        }
        if (bVar instanceof InterfaceC22651a.e) {
            return new C29404c.b(new C33211q0(null, new AbstractC33208p0.d(AbstractC8693b.m21277k(AbstractC24541a.f95776h)), AbstractC8693b.m21277k(AbstractC24541a.f95775g), null, null, false, false, null, false, true, 505, null), null, null, null, 14, null);
        }
        if (bVar instanceof InterfaceC22651a.h) {
            C33211q0 c33211q0 = new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC24541a.f95774f), 0L, null, 6, null), null, null, null, false, false, null, false, true, 509, null);
            C9598e postCheckoutNavigation = ((InterfaceC22651a.h) bVar).getPostCheckoutNavigation();
            return new C29404c.b(c33211q0, postCheckoutNavigation != null ? new InterfaceC29402a.x(postCheckoutNavigation) : new InterfaceC29402a.q(str4), null, null, 12, null);
        }
        if (bVar instanceof InterfaceC22651a.g) {
            return new C29404c.b(new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC24541a.f95774f), 0L, null, 6, null), null, null, null, false, false, null, false, true, 509, null), new InterfaceC29402a.q(((InterfaceC22651a.g) bVar).getCartId()), null, null, 12, null);
        }
        if (!(bVar instanceof InterfaceC22651a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC22651a.a aVar = (InterfaceC22651a.a) bVar;
        return new C29404c.b(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21271e(AbstractC8693b.m21278l(aVar.getTitle()), AbstractC8693b.m21277k(AbstractC24541a.f95773e)), false, null, 6, null), AbstractC8693b.m21278l(aVar.getSubtitle()), null, AbstractC8693b.m21277k(AbstractC24541a.f95772d), false, false, null, false, true, 489, null), InterfaceC29402a.i.f119319a, null, null, 12, null);
    }

    /* JADX INFO: renamed from: f */
    private final C29404c m93579f(C22653c c22653c, C29404c.d dVar, C29404c.b bVar, boolean z4, C29814e c29814e) {
        List<UniversalCheckoutSectionModel> sections;
        C29404c.c cVar;
        UniversalCheckoutSectionSpacingType universalCheckoutSectionSpacingTypeM93575a;
        UniversalCheckoutResponse response = c22653c.getResponse();
        if (response == null || (sections = response.getSections()) == null) {
            sections = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<UniversalCheckoutSectionModel> arrayList2 = new ArrayList();
        for (Object obj : sections) {
            List<DesignSystemModel> items = ((UniversalCheckoutSectionModel) obj).getItems();
            if (!(items instanceof Collection) || !items.isEmpty()) {
                Iterator<T> it = items.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((DesignSystemModel) it.next()) instanceof CheckoutFooterModel) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            arrayList2.add(obj);
        }
        C29814e stripePaymentOption = c22653c.getStripePaymentOption();
        C29814e c29814e2 = stripePaymentOption == null ? c29814e : stripePaymentOption;
        if (c22653c.getResponse() != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c22653c.getResponse().getTitle());
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            for (UniversalCheckoutSectionModel universalCheckoutSectionModel : arrayList2) {
                String sectionType = universalCheckoutSectionModel.getSectionType();
                if (sectionType == null || (universalCheckoutSectionSpacingTypeM93575a = m93575a(sectionType)) == null) {
                    universalCheckoutSectionSpacingTypeM93575a = UniversalCheckoutSectionSpacingType.COMPACT;
                }
                arrayList3.add(new C29404c.a(m93577d(c22653c, universalCheckoutSectionModel.getItems(), z4, c29814e2, c22653c.getSource()), universalCheckoutSectionSpacingTypeM93575a));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC25265s.m74141p0(arrayList4, ((UniversalCheckoutSectionModel) it3.next()).getItems());
            }
            cVar = new C29404c.c(textResourceM21278l, EnumC25719b.INSTANCE.m75836a(c22653c.getSource()) != EnumC25719b.JOIN, arrayList3, m93577d(c22653c, arrayList4, z4, c29814e2, c22653c.getSource()));
        } else {
            cVar = null;
        }
        UniversalCheckoutResponse response2 = c22653c.getResponse();
        return new C29404c(dVar, bVar, cVar, response2 != null ? response2.getCartId() : null, null, 16, null);
    }

    /* JADX INFO: renamed from: c */
    public final C29404c m93580c(C24620b domainResult) {
        C30528a c30528a;
        C29404c c29404cM93579f;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        C22653c universalCheckoutScreen = domainResult.getUniversalCheckoutScreen();
        C29814e initialSavedPaymentMethod = domainResult.getStripeFlowControllerState().getInitialSavedPaymentMethod();
        C21839b stripeFlowControllerState = domainResult.getStripeFlowControllerState();
        String dynamicPayload = universalCheckoutScreen.getDynamicPayload();
        String dynamicPath = universalCheckoutScreen.getDynamicPath();
        String source = universalCheckoutScreen.getSource();
        boolean isConfigured = stripeFlowControllerState.getIsConfigured();
        if (stripeFlowControllerState.getIsError()) {
            return new C29404c(null, new C29404c.b(C33205o0.f138451a.m105289c(), new InterfaceC29402a.l(dynamicPath, dynamicPayload, source, null, null, null, 56, null), null, InterfaceC29402a.m.f119335a, 4, null), null, null, null, 29, null);
        }
        InterfaceC22651a currentDialogType = universalCheckoutScreen.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC22651a.b) {
            c30528a = this;
            c29404cM93579f = c30528a.m93579f(universalCheckoutScreen, null, m93578e((InterfaceC22651a.b) currentDialogType, dynamicPayload, dynamicPath, source, domainResult.getUniversalCheckoutScreen().getCartId()), isConfigured, initialSavedPaymentMethod);
        } else {
            c30528a = this;
            c29404cM93579f = c30528a.m93579f(universalCheckoutScreen, null, null, isConfigured, initialSavedPaymentMethod);
        }
        return C29404c.m89656c(c29404cM93579f, null, null, null, null, c30528a.m93576b(universalCheckoutScreen, stripeFlowControllerState), 15, null);
    }

    public /* synthetic */ C30528a(C21535a c21535a, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25718a.m75812o() : c21535a, featureFlagChecker);
    }
}
