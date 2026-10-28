package fx1;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0755b;
import ax1.AbstractC2119a;
import ax1.C2120b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.membership.management.domain.api.MembershipManagementApi;
import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutScreenBody;
import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutScreenResponse;
import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutType;
import com.whoop.membership.management.domain.models.ScreenSection;
import com.whoop.membership.management.domain.models.items.CheckoutPaymentOptionsModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutCardModel;
import com.whoop.payments.domain.models.Card;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h32.InterfaceC16828a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12313p;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.C35339j0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import xc3.AbstractC38195a;
import y00.C38793c;
import y00.C38892m;
import y00.C38951s4;

/* JADX INFO: renamed from: fx1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0018\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J'\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'JJ\u0010+\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00162\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\u0010#\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u0010/\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00102\u001a\u00020$H\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, m65681d2 = {"Lfx1/d;", "Lod1/g;", "Lfx1/a;", "Lfx1/b;", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "membershipManagementApi", "Lsr2/y;", "urlProvider", "Lh32/a;", "stripeManager", "Lbc3/z;", "dispatcher", "Lax1/b;", "analyticsHelper", "Lcom/whoop/data/coordinator/BannerInvalidator;", "bannerInvalidator", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lh32/a;Lbc3/z;Lax1/b;Lcom/whoop/data/coordinator/BannerInvalidator;Ltr2/n;)V", "Lec3/m;", "", "", "payload", "l", "(Lec3/m;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lfx1/c;", "prevDomainScreenState", "o", "(Lfx1/c;)Lfx1/c;", "", "paymentOption", "r", "(Lfx1/c;I)Lfx1/c;", "Lcom/whoop/payments/domain/models/Card;", "card", "", "validCard", "q", "(Lfx1/c;Lcom/whoop/payments/domain/models/Card;Z)Lfx1/c;", "prevDomainState", "path", "checkoutPayload", "k", "(Lec3/m;Lfx1/b;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;", "m", "(Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;", "cardToken", "n", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "showConfirmModal", "p", "(Lfx1/c;Z)Lfx1/c;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "b", "Lsr2/y;", "c", "Lh32/a;", "d", "Lbc3/z;", "e", "Lax1/b;", "f", "Lcom/whoop/data/coordinator/BannerInvalidator;", "g", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14848d implements InterfaceC27844g<InterfaceC14845a, C14846b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipManagementApi membershipManagementApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC16828a stripeManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C2120b analyticsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final BannerInvalidator bannerInvalidator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fx1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55369a;

        static {
            int[] iArr = new int[MembershipAdjustmentCheckoutType.values().length];
            try {
                iArr[MembershipAdjustmentCheckoutType.UPGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipAdjustmentCheckoutType.DOWNGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55369a = iArr;
        }
    }

    /* JADX INFO: renamed from: fx1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {172, 182, 183, 188}, m100432m = "checkout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f55370E;

        /* JADX INFO: renamed from: F */
        Object f55371F;

        /* JADX INFO: renamed from: G */
        Object f55372G;

        /* JADX INFO: renamed from: H */
        Object f55373H;

        /* JADX INFO: renamed from: I */
        Object f55374I;

        /* JADX INFO: renamed from: J */
        int f55375J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f55376K;

        /* JADX INFO: renamed from: M */
        int f55378M;

        /* JADX INFO: renamed from: w */
        Object f55379w;

        /* JADX INFO: renamed from: x */
        Object f55380x;

        /* JADX INFO: renamed from: y */
        Object f55381y;

        /* JADX INFO: renamed from: z */
        Object f55382z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55376K = obj;
            this.f55378M |= Integer.MIN_VALUE;
            return C14848d.this.m42752k(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: fx1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$checkout$response$1", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55383w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55385y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ JsonObject f55386z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JsonObject jsonObject, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55385y = str;
            this.f55386z = jsonObject;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14848d.this.new c(this.f55385y, this.f55386z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55383w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipManagementApi membershipManagementApi = C14848d.this.membershipManagementApi;
            String str = this.f55385y;
            JsonObject jsonObject = this.f55386z;
            this.f55383w = 1;
            Object objPlaceDynamicCheckout = membershipManagementApi.placeDynamicCheckout(str, jsonObject, this);
            return objPlaceDynamicCheckout == enumC31071a ? enumC31071a : objPlaceDynamicCheckout;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fx1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {91, 92}, m100432m = "fetchMembershipAdjustmentCheckoutScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f55387E;

        /* JADX INFO: renamed from: w */
        Object f55388w;

        /* JADX INFO: renamed from: x */
        Object f55389x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f55390y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55390y = obj;
            this.f55387E |= Integer.MIN_VALUE;
            return C14848d.this.m42753l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: fx1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$fetchMembershipAdjustmentCheckoutScreen$response$1", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f55392w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Map<String, String> f55394y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Map<String, String> map, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f55394y = map;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14848d.this.new e(this.f55394y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55392w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipManagementApi membershipManagementApi = C14848d.this.membershipManagementApi;
            MembershipAdjustmentCheckoutScreenBody membershipAdjustmentCheckoutScreenBody = new MembershipAdjustmentCheckoutScreenBody(this.f55394y);
            this.f55392w = 1;
            Object objFetchMembershipAdjustmentCheckoutScreen = membershipManagementApi.fetchMembershipAdjustmentCheckoutScreen(membershipAdjustmentCheckoutScreenBody, this);
            return objFetchMembershipAdjustmentCheckoutScreen == enumC31071a ? enumC31071a : objFetchMembershipAdjustmentCheckoutScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MembershipAdjustmentCheckoutScreenResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fx1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$getCardToken$2", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55395w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Card f55397y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Card card, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55397y = card;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14848d.this.new f(this.f55397y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55395w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16828a interfaceC16828a = C14848d.this.stripeManager;
                    this.f55395w = 1;
                    obj = interfaceC16828a.mo47426b(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C35339j0 c35339j0 = (C35339j0) obj;
                if (c35339j0 == null) {
                    return null;
                }
                Card card = this.f55397y;
                String cardNumber = card.getCardNumber();
                String strSubstring = card.getCardExpiration().substring(0, 2);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                int i14 = Integer.parseInt(strSubstring);
                String strSubstring2 = card.getCardExpiration().substring(2, 4);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                return C35339j0.m112191a(c35339j0, new C38892m(cardNumber, i14, Integer.parseInt(strSubstring2), card.getCardCvv(), new C38793c(null, null, null, null, card.getCardZip(), null))).f167191w;
            } catch (StripeException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: fx1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$getPaymentMethodId$2", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {225}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f55398w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f55400y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55400y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14848d.this.new g(this.f55400y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f55398w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16828a interfaceC16828a = C14848d.this.stripeManager;
                    this.f55398w = 1;
                    obj = interfaceC16828a.mo47426b(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C35339j0 c35339j0 = (C35339j0) obj;
                if (c35339j0 != null) {
                    String token = this.f55400y;
                    AbstractC22676k.m65750j(token, "token");
                    return C35339j0.m112192b(c35339j0, C33647p.m106266h(new C38951s4(null, null, null, null, token, null, null, 110), null, 14)).f167527w;
                }
            } catch (StripeException unused) {
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: fx1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$interact$1", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {51, 53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfx1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14848d f55401E;

        /* JADX INFO: renamed from: w */
        Object f55402w;

        /* JADX INFO: renamed from: x */
        int f55403x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f55404y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f55405z;

        /* JADX INFO: renamed from: fx1.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f55406w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14848d f55407x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f55408y;

            /* JADX INFO: renamed from: fx1.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$interact$1$1", m100430f = "MembershipAdjustmentCheckoutInteractor.kt", m100431l = {55, 80, 86}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41614a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                final /* synthetic */ a<T> f55409E;

                /* JADX INFO: renamed from: F */
                int f55410F;

                /* JADX INFO: renamed from: w */
                Object f55411w;

                /* JADX INFO: renamed from: x */
                Object f55412x;

                /* JADX INFO: renamed from: y */
                Object f55413y;

                /* JADX INFO: renamed from: z */
                /* synthetic */ Object f55414z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41614a(a<? super T> aVar, InterfaceC30057d<? super C41614a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f55409E = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f55414z = obj;
                    this.f55410F |= Integer.MIN_VALUE;
                    return this.f55409E.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C14848d c14848d, InterfaceC13062m interfaceC13062m) {
                this.f55406w = c22669g0;
                this.f55407x = c14848d;
                this.f55408y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:51:0x014b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x019a, code lost:
            
                if (r12.emit(r13, r7) == r0) goto L61;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(fx1.InterfaceC14845a r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
                /*
                    Method dump skipped, instruction units count: 422
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fx1.C14848d.h.a.emit(fx1.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC13058l interfaceC13058l, C14848d c14848d, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55405z = interfaceC13058l;
            this.f55401E = c14848d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f55405z, this.f55401E, interfaceC30057d);
            hVar.f55404y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (r8.collect(r4, r7) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f55404y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f55403x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L29
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                java.lang.Object r0 = r7.f55402w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L58
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r2 = r7.f55402w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r8)
                goto L42
            L29:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r8)
                fx1.b r8 = new fx1.b
                r6 = 3
                r8.<init>(r5, r5, r6, r5)
                r2.f89336w = r8
                r7.f55404y = r0
                r7.f55402w = r2
                r7.f55403x = r4
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L42
                goto L57
            L42:
                ec3.l r8 = r7.f55405z
                fx1.d$h$a r4 = new fx1.d$h$a
                fx1.d r6 = r7.f55401E
                r4.<init>(r2, r6, r0)
                r7.f55404y = r5
                r7.f55402w = r5
                r7.f55403x = r3
                java.lang.Object r8 = r8.collect(r4, r7)
                if (r8 != r1) goto L58
            L57:
                return r1
            L58:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fx1.C14848d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14848d(MembershipManagementApi membershipManagementApi, AbstractC32943y urlProvider, InterfaceC16828a stripeManager, AbstractC3076z dispatcher, C2120b analyticsHelper, BannerInvalidator bannerInvalidator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(membershipManagementApi, "membershipManagementApi");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(stripeManager, "stripeManager");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(bannerInvalidator, "bannerInvalidator");
        AbstractC22676k.m65750j(logger, "logger");
        this.membershipManagementApi = membershipManagementApi;
        this.urlProvider = urlProvider;
        this.stripeManager = stripeManager;
        this.dispatcher = dispatcher;
        this.analyticsHelper = analyticsHelper;
        this.bannerInvalidator = bannerInvalidator;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0164  */
    /* JADX WARN: Code duplicated, block: B:40:0x017f  */
    /* JADX WARN: Code duplicated, block: B:43:0x019d  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x0213  */
    /* JADX WARN: Code duplicated, block: B:57:0x021d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0229  */
    /* JADX WARN: Code duplicated, block: B:61:0x022d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0237  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: k */
    public final Object m42752k(InterfaceC13062m interfaceC13062m, C14846b c14846b, String str, Map<String, String> map, Card card, InterfaceC30057d<? super C14846b> interfaceC30057d) {
        b bVar;
        String str2;
        Map<String, String> map2;
        C14846b c14846b2;
        Card card2;
        String strM8299l;
        Map mapM73993b0;
        String str3;
        C14846b c14846b3;
        Card card3;
        int i13;
        C14846b c14846b4;
        Map<String, String> map3;
        String str4;
        String str5;
        Map map4;
        String str6;
        Object objM42755n;
        String str7;
        String str8;
        Card card4;
        String str9;
        C14846b c14846b5;
        Map<String, String> map5;
        C14846b c14846b6;
        Object objM108729b;
        C14846b c14846b7;
        Map<String, String> map6;
        String str10;
        String str11;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f55378M;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f55378M = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f55376K;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = bVar2.f55378M;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            Object objM42727b = C14846b.m42727b(c14846b, null, InterfaceC14847c.c.f55353a, 1, null);
            bVar2.f55379w = null;
            bVar2.f55380x = c14846b;
            str2 = str;
            bVar2.f55381y = str2;
            map2 = map;
            bVar2.f55382z = map2;
            bVar2.f55370E = card;
            bVar2.f55378M = 1;
            if (interfaceC13062m.emit(objM42727b, bVar2) != obj2) {
                c14846b2 = c14846b;
                card2 = card;
            }
            return obj2;
        }
        if (i15 == 1) {
            card2 = (Card) bVar2.f55370E;
            Map<String, String> map7 = (Map) bVar2.f55382z;
            String str12 = (String) bVar2.f55381y;
            c14846b2 = (C14846b) bVar2.f55380x;
            AbstractC34132o.m107864I(obj);
            map2 = map7;
            str2 = str12;
        } else {
            if (i15 == 2) {
                i13 = bVar2.f55375J;
                map4 = (Map) bVar2.f55372G;
                str4 = (String) bVar2.f55371F;
                card3 = (Card) bVar2.f55370E;
                map3 = (Map) bVar2.f55382z;
                str5 = (String) bVar2.f55381y;
                c14846b4 = (C14846b) bVar2.f55380x;
                AbstractC34132o.m107864I(obj);
                str6 = (String) obj;
                if (str6 == null) {
                    return C14846b.m42727b(c14846b4, null, new InterfaceC14847c.b(null, null, null, 7, null), 1, null);
                }
                bVar2.f55379w = null;
                bVar2.f55380x = c14846b4;
                bVar2.f55381y = str5;
                bVar2.f55382z = map3;
                bVar2.f55370E = card3;
                bVar2.f55371F = str4;
                bVar2.f55372G = map4;
                bVar2.f55373H = null;
                bVar2.f55374I = str6;
                bVar2.f55375J = i13;
                bVar2.f55378M = 3;
                objM42755n = m42755n(str6, bVar2);
                if (objM42755n != obj2) {
                    obj = objM42755n;
                    str7 = str6;
                    str8 = str4;
                    card4 = card3;
                    map2 = map3;
                    str9 = str5;
                    c14846b5 = c14846b4;
                    str11 = (String) obj;
                    if (str11 == null) {
                        return C14846b.m42727b(c14846b5, null, new InterfaceC14847c.b(null, null, null, 7, null), 1, null);
                    }
                    map4.put("payment_method_id", AbstractC0770m.m1841c(str11));
                    map4.put("card_token", AbstractC0770m.m1841c(str7));
                    C14846b c14846b8 = c14846b5;
                    mapM73993b0 = map4;
                    c14846b3 = c14846b8;
                    strM8299l = str8;
                    card2 = card4;
                    str3 = str9;
                    map5 = map2;
                    JsonObject jsonObject = new JsonObject(mapM73993b0);
                    InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n = this.logger;
                    c cVar = new c(strM8299l, jsonObject, null);
                    bVar2.f55379w = null;
                    bVar2.f55380x = c14846b3;
                    bVar2.f55381y = str3;
                    bVar2.f55382z = map5;
                    bVar2.f55370E = card2;
                    bVar2.f55371F = null;
                    bVar2.f55372G = null;
                    bVar2.f55373H = null;
                    bVar2.f55374I = null;
                    bVar2.f55378M = 4;
                    c14846b6 = c14846b3;
                    objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
                    if (objM108729b != obj2) {
                        c14846b7 = c14846b6;
                        obj = objM108729b;
                        map6 = map5;
                        str10 = str3;
                    }
                }
                return obj2;
            }
            if (i15 == 3) {
                str7 = (String) bVar2.f55374I;
                map4 = (Map) bVar2.f55372G;
                str8 = (String) bVar2.f55371F;
                card4 = (Card) bVar2.f55370E;
                map2 = (Map) bVar2.f55382z;
                str9 = (String) bVar2.f55381y;
                c14846b5 = (C14846b) bVar2.f55380x;
                AbstractC34132o.m107864I(obj);
                str11 = (String) obj;
                if (str11 == null) {
                    return C14846b.m42727b(c14846b5, null, new InterfaceC14847c.b(null, null, null, 7, null), 1, null);
                }
                map4.put("payment_method_id", AbstractC0770m.m1841c(str11));
                map4.put("card_token", AbstractC0770m.m1841c(str7));
                C14846b c14846b9 = c14846b5;
                mapM73993b0 = map4;
                c14846b3 = c14846b9;
                strM8299l = str8;
                card2 = card4;
                str3 = str9;
                map5 = map2;
                JsonObject jsonObject2 = new JsonObject(mapM73993b0);
                InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n2 = this.logger;
                c cVar2 = new c(strM8299l, jsonObject2, null);
                bVar2.f55379w = null;
                bVar2.f55380x = c14846b3;
                bVar2.f55381y = str3;
                bVar2.f55382z = map5;
                bVar2.f55370E = card2;
                bVar2.f55371F = null;
                bVar2.f55372G = null;
                bVar2.f55373H = null;
                bVar2.f55374I = null;
                bVar2.f55378M = 4;
                c14846b6 = c14846b3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, null, cVar2, bVar2, 6, null);
                if (objM108729b != obj2) {
                    c14846b7 = c14846b6;
                    obj = objM108729b;
                    map6 = map5;
                    str10 = str3;
                }
                return obj2;
            }
            if (i15 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            card2 = (Card) bVar2.f55370E;
            map6 = (Map) bVar2.f55382z;
            str10 = (String) bVar2.f55381y;
            c14846b7 = (C14846b) bVar2.f55380x;
            AbstractC34132o.m107864I(obj);
        }
        interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.bannerInvalidator.invalidateBanners();
            return C14846b.m42727b(c14846b7, null, InterfaceC14847c.e.f55361a, 1, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C14846b.m42727b(c14846b7, null, new InterfaceC14847c.b(map6, str10, card2), 1, null);
        }
        throw new NoWhenBranchMatchedException();
        strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str2);
        C0755b c0755b = AbstractC0757c.f2762d;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LinkedHashMapSerializer linkedHashMapSerializerM122335c = AbstractC38195a.m122335c(stringSerializer, AbstractC38195a.m122336d(stringSerializer));
        c0755b.getClass();
        mapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("payload", AbstractC12313p.m34290h0(c0755b, map2, linkedHashMapSerializerM122335c)));
        if (card2 != null) {
            if ((card2.isNotEmpty() ? card2 : null) != null) {
                bVar2.f55379w = null;
                bVar2.f55380x = c14846b2;
                bVar2.f55381y = str2;
                bVar2.f55382z = map2;
                bVar2.f55370E = card2;
                bVar2.f55371F = strM8299l;
                bVar2.f55372G = mapM73993b0;
                bVar2.f55373H = null;
                bVar2.f55375J = 0;
                bVar2.f55378M = 2;
                Object objM42754m = m42754m(card2, bVar2);
                if (objM42754m != obj2) {
                    Map<String, String> map8 = map2;
                    card3 = card2;
                    i13 = 0;
                    c14846b4 = c14846b2;
                    map3 = map8;
                    str4 = strM8299l;
                    obj = objM42754m;
                    str5 = str2;
                    map4 = mapM73993b0;
                    str6 = (String) obj;
                    if (str6 == null) {
                        return C14846b.m42727b(c14846b4, null, new InterfaceC14847c.b(null, null, null, 7, null), 1, null);
                    }
                    bVar2.f55379w = null;
                    bVar2.f55380x = c14846b4;
                    bVar2.f55381y = str5;
                    bVar2.f55382z = map3;
                    bVar2.f55370E = card3;
                    bVar2.f55371F = str4;
                    bVar2.f55372G = map4;
                    bVar2.f55373H = null;
                    bVar2.f55374I = str6;
                    bVar2.f55375J = i13;
                    bVar2.f55378M = 3;
                    objM42755n = m42755n(str6, bVar2);
                    if (objM42755n != obj2) {
                        obj = objM42755n;
                        str7 = str6;
                        str8 = str4;
                        card4 = card3;
                        map2 = map3;
                        str9 = str5;
                        c14846b5 = c14846b4;
                        str11 = (String) obj;
                        if (str11 == null) {
                            return C14846b.m42727b(c14846b5, null, new InterfaceC14847c.b(null, null, null, 7, null), 1, null);
                        }
                        map4.put("payment_method_id", AbstractC0770m.m1841c(str11));
                        map4.put("card_token", AbstractC0770m.m1841c(str7));
                        C14846b c14846b10 = c14846b5;
                        mapM73993b0 = map4;
                        c14846b3 = c14846b10;
                        strM8299l = str8;
                        card2 = card4;
                        str3 = str9;
                        map5 = map2;
                        JsonObject jsonObject3 = new JsonObject(mapM73993b0);
                        InterfaceC34385a.Companion companion3 = InterfaceC34385a.INSTANCE;
                        InterfaceC34116n interfaceC34116n3 = this.logger;
                        c cVar3 = new c(strM8299l, jsonObject3, null);
                        bVar2.f55379w = null;
                        bVar2.f55380x = c14846b3;
                        bVar2.f55381y = str3;
                        bVar2.f55382z = map5;
                        bVar2.f55370E = card2;
                        bVar2.f55371F = null;
                        bVar2.f55372G = null;
                        bVar2.f55373H = null;
                        bVar2.f55374I = null;
                        bVar2.f55378M = 4;
                        c14846b6 = c14846b3;
                        objM108729b = InterfaceC34385a.Companion.m108729b(companion3, interfaceC34116n3, null, null, cVar3, bVar2, 6, null);
                        if (objM108729b != obj2) {
                            c14846b7 = c14846b6;
                            obj = objM108729b;
                            map6 = map5;
                            str10 = str3;
                            interfaceC34385a = (InterfaceC34385a) obj;
                            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                                this.bannerInvalidator.invalidateBanners();
                                return C14846b.m42727b(c14846b7, null, InterfaceC14847c.e.f55361a, 1, null);
                            }
                            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                                return C14846b.m42727b(c14846b7, null, new InterfaceC14847c.b(map6, str10, card2), 1, null);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return obj2;
        }
        str3 = str2;
        c14846b3 = c14846b2;
        map5 = map2;
        JsonObject jsonObject4 = new JsonObject(mapM73993b0);
        InterfaceC34385a.Companion companion4 = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n4 = this.logger;
        c cVar4 = new c(strM8299l, jsonObject4, null);
        bVar2.f55379w = null;
        bVar2.f55380x = c14846b3;
        bVar2.f55381y = str3;
        bVar2.f55382z = map5;
        bVar2.f55370E = card2;
        bVar2.f55371F = null;
        bVar2.f55372G = null;
        bVar2.f55373H = null;
        bVar2.f55374I = null;
        bVar2.f55378M = 4;
        c14846b6 = c14846b3;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion4, interfaceC34116n4, null, null, cVar4, bVar2, 6, null);
        if (objM108729b != obj2) {
            c14846b7 = c14846b6;
            obj = objM108729b;
            map6 = map5;
            str10 = str3;
            interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                this.bannerInvalidator.invalidateBanners();
                return C14846b.m42727b(c14846b7, null, InterfaceC14847c.e.f55361a, 1, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return C14846b.m42727b(c14846b7, null, new InterfaceC14847c.b(map6, str10, card2), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad A[LOOP:0: B:28:0x009d->B:32:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x013d A[LOOP:1: B:45:0x0137->B:47:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x008a, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public final Object m42753l(InterfaceC13062m interfaceC13062m, Map<String, String> map, InterfaceC30057d<? super C14846b> interfaceC30057d) {
        d dVar;
        Map<String, String> map2;
        Map<String, String> map3;
        InterfaceC34385a interfaceC34385a;
        InterfaceC34385a.c cVar;
        String trackingType;
        int i13;
        int i14;
        ArrayList arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        MembershipCheckoutCardModel membershipCheckoutCardModel;
        boolean z4;
        CheckoutPaymentOptionsModel paymentOptions;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i15 = dVar.f55387E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f55387E = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f55390y;
        Object obj2 = EnumC31071a.f128113w;
        int i16 = dVar2.f55387E;
        boolean z13 = true;
        MembershipAdjustmentCheckoutType membershipAdjustmentCheckoutType = null;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            Object c14846b = new C14846b(null, null, 3, null);
            dVar2.f55388w = null;
            map2 = map;
            dVar2.f55389x = map2;
            dVar2.f55387E = 1;
            if (interfaceC13062m.emit(c14846b, dVar2) != obj2) {
            }
            return obj2;
        }
        if (i16 == 1) {
            map2 = (Map) dVar2.f55389x;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map3 = (Map) dVar2.f55389x;
            AbstractC34132o.m107864I(obj);
        }
        interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new C14846b(null, new InterfaceC14847c.a(map3), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        cVar = (InterfaceC34385a.c) interfaceC34385a;
        trackingType = ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingType();
        for (MembershipAdjustmentCheckoutType membershipAdjustmentCheckoutType2 : MembershipAdjustmentCheckoutType.values()) {
            if (AbstractC22676k.m65745e(membershipAdjustmentCheckoutType2.name(), trackingType)) {
                membershipAdjustmentCheckoutType = membershipAdjustmentCheckoutType2;
                break;
            }
        }
        if (membershipAdjustmentCheckoutType == null) {
            i14 = -1;
        } else {
            i14 = a.f55369a[membershipAdjustmentCheckoutType.ordinal()];
        }
        if (i14 != -1) {
            if (i14 != 1) {
                this.analyticsHelper.m6690a(new AbstractC2119a.p(null, null, String.valueOf(((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingMonths()), null, ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingTier(), null, 43, null));
            } else {
                if (i14 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.analyticsHelper.m6690a(new AbstractC2119a.m(null, null, String.valueOf(((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingMonths()), null, ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingTier(), null, 43, null));
            }
        }
        List<ScreenSection> sections = ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getSections();
        arrayList = new ArrayList();
        it = sections.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((ScreenSection) it.next()).getItems());
        }
        arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof MembershipCheckoutCardModel) {
                arrayList2.add(obj3);
            }
        }
        membershipCheckoutCardModel = (MembershipCheckoutCardModel) AbstractC25265s.m74100H0(arrayList2);
        if (membershipCheckoutCardModel != null || (paymentOptions = membershipCheckoutCardModel.getPaymentOptions()) == null) {
            z4 = false;
        } else {
            String existingLabel = paymentOptions.getExistingLabel();
            if (existingLabel != null && existingLabel.length() != 0) {
                z13 = false;
            }
            z4 = z13;
        }
        return new C14846b(map3, new InterfaceC14847c.d((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a(), z4, 0, null, false, false, z4, 60, null));
        Map<String, String> map4 = map2;
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        e eVar = new e(map4, null);
        dVar2.f55388w = null;
        dVar2.f55389x = map4;
        dVar2.f55387E = 2;
        Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, eVar, dVar2, 6, null);
        if (objM108729b != obj2) {
            map3 = map4;
            obj = objM108729b;
            interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    return new C14846b(null, new InterfaceC14847c.a(map3), 1, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            cVar = (InterfaceC34385a.c) interfaceC34385a;
            trackingType = ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingType();
            while (i13 < r5) {
                if (AbstractC22676k.m65745e(membershipAdjustmentCheckoutType2.name(), trackingType)) {
                    membershipAdjustmentCheckoutType = membershipAdjustmentCheckoutType2;
                    break;
                }
            }
            if (membershipAdjustmentCheckoutType == null) {
                i14 = -1;
            } else {
                i14 = a.f55369a[membershipAdjustmentCheckoutType.ordinal()];
            }
            if (i14 != -1) {
                if (i14 != 1) {
                    this.analyticsHelper.m6690a(new AbstractC2119a.p(null, null, String.valueOf(((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingMonths()), null, ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingTier(), null, 43, null));
                } else {
                    if (i14 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.analyticsHelper.m6690a(new AbstractC2119a.m(null, null, String.valueOf(((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingMonths()), null, ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getTrackingTier(), null, 43, null));
                }
            }
            List<ScreenSection> sections2 = ((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a()).getSections();
            arrayList = new ArrayList();
            it = sections2.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((ScreenSection) it.next()).getItems());
            }
            arrayList2 = new ArrayList();
            while (r4.hasNext()) {
                if (obj3 instanceof MembershipCheckoutCardModel) {
                    arrayList2.add(obj3);
                }
            }
            membershipCheckoutCardModel = (MembershipCheckoutCardModel) AbstractC25265s.m74100H0(arrayList2);
            if (membershipCheckoutCardModel != null) {
                z4 = false;
            } else {
                z4 = false;
            }
            return new C14846b(map3, new InterfaceC14847c.d((MembershipAdjustmentCheckoutScreenResponse) cVar.m108735a(), z4, 0, null, false, false, z4, 60, null));
        }
        return obj2;
    }

    /* JADX INFO: renamed from: m */
    private final Object m42754m(Card card, InterfaceC30057d<? super String> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new f(card, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: n */
    private final Object m42755n(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new g(str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC14847c m42756o(InterfaceC14847c prevDomainScreenState) {
        InterfaceC14847c.d dVar = prevDomainScreenState instanceof InterfaceC14847c.d ? (InterfaceC14847c.d) prevDomainScreenState : null;
        return dVar != null ? InterfaceC14847c.d.m42735b((InterfaceC14847c.d) prevDomainScreenState, null, !dVar.getIsExpanded(), 0, null, false, false, false, 125, null) : new InterfaceC14847c.a(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC14847c m42757p(InterfaceC14847c prevDomainScreenState, boolean showConfirmModal) {
        return !(prevDomainScreenState instanceof InterfaceC14847c.d) ? new InterfaceC14847c.a(null, 1, null) : InterfaceC14847c.d.m42735b((InterfaceC14847c.d) prevDomainScreenState, null, false, 0, null, false, showConfirmModal, false, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC14847c m42758q(InterfaceC14847c prevDomainScreenState, Card card, boolean validCard) {
        return !(prevDomainScreenState instanceof InterfaceC14847c.d) ? new InterfaceC14847c.a(null, 1, null) : InterfaceC14847c.d.m42735b((InterfaceC14847c.d) prevDomainScreenState, null, false, 0, card, validCard, false, false, 103, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC14847c m42759r(InterfaceC14847c prevDomainScreenState, int paymentOption) {
        return !(prevDomainScreenState instanceof InterfaceC14847c.d) ? new InterfaceC14847c.a(null, 1, null) : InterfaceC14847c.d.m42735b((InterfaceC14847c.d) prevDomainScreenState, null, false, paymentOption, null, false, false, false, 123, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new h(upstream, this, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14848d(MembershipManagementApi membershipManagementApi, AbstractC32943y abstractC32943y, InterfaceC16828a interfaceC16828a, AbstractC3076z abstractC3076z, C2120b c2120b, BannerInvalidator bannerInvalidator, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(membershipManagementApi, abstractC32943y, interfaceC16828a, abstractC3076z, c2120b, bannerInvalidator, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MembershipAdjustmentCheckoutInteractor") : interfaceC34116n);
    }
}
