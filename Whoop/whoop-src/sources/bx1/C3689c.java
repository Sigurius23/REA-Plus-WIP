package bx1;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0755b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.membership.management.domain.api.MembershipManagementApi;
import com.whoop.payments.domain.models.Card;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h32.InterfaceC16828a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12313p;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.C35339j0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
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

/* JADX INFO: renamed from: bx1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lbx1/c;", "Lod1/g;", "Lbx1/a;", "Lbx1/b;", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "membershipManagementApi", "Lsr2/y;", "urlProvider", "Lh32/a;", "stripeManager", "Lcom/whoop/data/coordinator/BannerInvalidator;", "bannerInvalidator", "Lbc3/z;", "dispatcher", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lh32/a;Lcom/whoop/data/coordinator/BannerInvalidator;Lbc3/z;Ltr2/n;)V", "", "path", "", "payload", "Lcom/whoop/payments/domain/models/Card;", "card", "g", "(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;", "cardToken", "i", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "b", "Lsr2/y;", "c", "Lh32/a;", "d", "Lcom/whoop/data/coordinator/BannerInvalidator;", "e", "Lbc3/z;", "f", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3689c implements InterfaceC27844g<InterfaceC3687a, InterfaceC3688b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipManagementApi membershipManagementApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC16828a stripeManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final BannerInvalidator bannerInvalidator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: bx1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor", m100430f = "CheckoutInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 76, 82}, m100432m = "checkout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f15072E;

        /* JADX INFO: renamed from: F */
        Object f15073F;

        /* JADX INFO: renamed from: G */
        Object f15074G;

        /* JADX INFO: renamed from: H */
        int f15075H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f15076I;

        /* JADX INFO: renamed from: K */
        int f15078K;

        /* JADX INFO: renamed from: w */
        Object f15079w;

        /* JADX INFO: renamed from: x */
        Object f15080x;

        /* JADX INFO: renamed from: y */
        Object f15081y;

        /* JADX INFO: renamed from: z */
        Object f15082z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f15076I = obj;
            this.f15078K |= Integer.MIN_VALUE;
            return C3689c.this.m11478g(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: bx1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor$checkout$response$1", m100430f = "CheckoutInteractor.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f15083w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f15085y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ JsonObject f15086z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, JsonObject jsonObject, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f15085y = str;
            this.f15086z = jsonObject;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C3689c.this.new b(this.f15085y, this.f15086z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f15083w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipManagementApi membershipManagementApi = C3689c.this.membershipManagementApi;
            String str = this.f15085y;
            JsonObject jsonObject = this.f15086z;
            this.f15083w = 1;
            Object objPlaceDynamicCheckout = membershipManagementApi.placeDynamicCheckout(str, jsonObject, this);
            return objPlaceDynamicCheckout == enumC31071a ? enumC31071a : objPlaceDynamicCheckout;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: bx1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor$getCardToken$2", m100430f = "CheckoutInteractor.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f15087w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Card f15089y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Card card, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f15089y = card;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3689c.this.new c(this.f15089y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objMo47426b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f15087w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16828a interfaceC16828a = C3689c.this.stripeManager;
                    this.f15087w = 1;
                    objMo47426b = interfaceC16828a.mo47426b(this);
                    if (objMo47426b == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objMo47426b = obj;
                }
                C35339j0 c35339j0 = (C35339j0) objMo47426b;
                if (c35339j0 == null) {
                    return null;
                }
                Card card = this.f15089y;
                String cardNumber = card.getCardNumber();
                String strSubstring = card.getCardExpiration().substring(0, 2);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                int i14 = Integer.parseInt(strSubstring);
                String strSubstring2 = card.getCardExpiration().substring(2, 4);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                return C35339j0.m112191a(c35339j0, new C38892m(cardNumber, i14, Integer.parseInt(strSubstring2), card.getCardCvv(), new C38793c(null, null, null, null, card.getCardZip(), null))).f167191w;
            } catch (StripeException e5) {
                C3689c.this.logger.mo85228t("Stripe Exception - Create card token - " + e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: bx1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor$getPaymentMethodId$2", m100430f = "CheckoutInteractor.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f15090w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f15092y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f15092y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3689c.this.new d(this.f15092y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f15090w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16828a interfaceC16828a = C3689c.this.stripeManager;
                    this.f15090w = 1;
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
                String token = this.f15092y;
                AbstractC22676k.m65750j(token, "token");
                return C35339j0.m112192b(c35339j0, C33647p.m106266h(new C38951s4(null, null, null, null, token, null, null, 110), null, 14)).f167527w;
            } catch (StripeException e5) {
                C3689c.this.logger.mo85228t("Stripe Exception - Create payment method - " + e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: bx1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f15093w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f15094x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f15095y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC3687a interfaceC3687a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f15094x = interfaceC13062m;
            eVar.f15095y = interfaceC3687a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c3383g;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f15093w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f15094x;
                InterfaceC3687a interfaceC3687a = (InterfaceC3687a) this.f15095y;
                if (AbstractC22676k.m65745e(interfaceC3687a, InterfaceC3687a.b.f15060a)) {
                    c3383g = new C0456u(InterfaceC3690d.b.f15102a, 1);
                } else {
                    if (!(interfaceC3687a instanceof InterfaceC3687a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC3687a.a aVar = (InterfaceC3687a.a) interfaceC3687a;
                    c3383g = new C3383g(new InterfaceC3690d[]{InterfaceC3690d.b.f15102a, new InterfaceC3690d.a(aVar.getPath(), aVar.m11470c(), aVar.getCard())}, 3);
                }
                this.f15094x = null;
                this.f15095y = null;
                this.f15093w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC3687a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: bx1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor$interact$2", m100430f = "CheckoutInteractor.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbx1/b;", "<unused var>", "Lbx1/d;", "action", "<anonymous>", "(Lbx1/b;Lbx1/d;)Lbx1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f15096w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f15097x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3688b interfaceC3688b, InterfaceC3690d interfaceC3690d, InterfaceC30057d<? super InterfaceC3688b> interfaceC30057d) {
            f fVar = C3689c.this.new f(interfaceC30057d);
            fVar.f15097x = interfaceC3690d;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3690d interfaceC3690d = (InterfaceC3690d) this.f15097x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f15096w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(interfaceC3690d, InterfaceC3690d.b.f15102a)) {
                    return InterfaceC3688b.b.f15064a;
                }
                if (!(interfaceC3690d instanceof InterfaceC3690d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C3689c c3689c = C3689c.this;
                InterfaceC3690d.a aVar = (InterfaceC3690d.a) interfaceC3690d;
                String path = aVar.getPath();
                Map<String, String> mapM11484c = aVar.m11484c();
                Card card = aVar.getCard();
                this.f15097x = null;
                this.f15096w = 1;
                obj = c3689c.m11478g(path, mapM11484c, card, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (InterfaceC3688b) obj;
        }
    }

    public C3689c(MembershipManagementApi membershipManagementApi, AbstractC32943y urlProvider, InterfaceC16828a stripeManager, BannerInvalidator bannerInvalidator, AbstractC3076z dispatcher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(membershipManagementApi, "membershipManagementApi");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(stripeManager, "stripeManager");
        AbstractC22676k.m65750j(bannerInvalidator, "bannerInvalidator");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        this.membershipManagementApi = membershipManagementApi;
        this.urlProvider = urlProvider;
        this.stripeManager = stripeManager;
        this.bannerInvalidator = bannerInvalidator;
        this.dispatcher = dispatcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x0142  */
    /* JADX WARN: Code duplicated, block: B:43:0x0155 A[PHI: r1 r2 r3 r4 r6
      0x0155: PHI (r1v5 java.lang.String) = (r1v0 java.lang.String), (r1v0 java.lang.String), (r1v9 java.lang.String) binds: [B:20:0x00d8, B:25:0x00e3, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r2v2 java.util.Map<java.lang.String, java.lang.String>) = 
      (r2v0 java.util.Map<java.lang.String, java.lang.String>)
      (r2v0 java.util.Map<java.lang.String, java.lang.String>)
      (r2v3 java.util.Map<java.lang.String, java.lang.String>)
     binds: [B:20:0x00d8, B:25:0x00e3, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r3v2 com.whoop.payments.domain.models.Card) = 
      (r3v0 com.whoop.payments.domain.models.Card)
      (r3v0 com.whoop.payments.domain.models.Card)
      (r3v4 com.whoop.payments.domain.models.Card)
     binds: [B:20:0x00d8, B:25:0x00e3, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r4v6 java.lang.String) = (r4v4 java.lang.String), (r4v4 java.lang.String), (r4v8 java.lang.String) binds: [B:20:0x00d8, B:25:0x00e3, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r6v6 java.util.Map) = (r6v4 java.util.Map), (r6v4 java.util.Map), (r6v8 java.util.Map) binds: [B:20:0x00d8, B:25:0x00e3, B:42:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0180  */
    /* JADX WARN: Code duplicated, block: B:49:0x018b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0193  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: g */
    public final Object m11478g(String str, Map<String, String> map, Card card, InterfaceC30057d<? super InterfaceC3688b> interfaceC30057d) {
        a aVar;
        String strM8299l;
        Map mapM73993b0;
        Object objM11479h;
        String str2;
        int i13;
        Object obj;
        String str3;
        String str4;
        Card card2;
        String str5;
        InterfaceC34385a interfaceC34385a;
        String str6 = str;
        Map<String, String> map2 = map;
        Card card3 = card;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f15078K;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f15078K = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f15076I;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = aVar2.f15078K;
        if (i15 != 0) {
            if (i15 == 1) {
                i13 = aVar2.f15075H;
                Map map3 = (Map) aVar2.f15072E;
                String str7 = (String) aVar2.f15082z;
                Card card4 = (Card) aVar2.f15081y;
                Map<String, String> map4 = (Map) aVar2.f15080x;
                str2 = (String) aVar2.f15079w;
                AbstractC34132o.m107864I(objM108729b);
                mapM73993b0 = map3;
                map2 = map4;
                objM11479h = objM108729b;
                strM8299l = str7;
                card3 = card4;
            } else {
                if (i15 == 2) {
                    str3 = (String) aVar2.f15074G;
                    Map map5 = (Map) aVar2.f15072E;
                    String str8 = (String) aVar2.f15082z;
                    Card card5 = (Card) aVar2.f15081y;
                    Map<String, String> map6 = (Map) aVar2.f15080x;
                    String str9 = (String) aVar2.f15079w;
                    AbstractC34132o.m107864I(objM108729b);
                    mapM73993b0 = map5;
                    map2 = map6;
                    obj = objM108729b;
                    strM8299l = str8;
                    card3 = card5;
                    str2 = str9;
                    str5 = (String) obj;
                    if (str5 == null) {
                        return new InterfaceC3688b.a(null, null, null, 7, null);
                    }
                    mapM73993b0.put("payment_method_id", AbstractC0770m.m1841c(str5));
                    mapM73993b0.put("card_token", AbstractC0770m.m1841c(str3));
                    str6 = str2;
                    JsonObject jsonObject = new JsonObject(mapM73993b0);
                    InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n = this.logger;
                    b bVar = new b(strM8299l, jsonObject, null);
                    aVar2.f15079w = str6;
                    aVar2.f15080x = map2;
                    aVar2.f15081y = card3;
                    aVar2.f15082z = null;
                    aVar2.f15072E = null;
                    aVar2.f15073F = null;
                    aVar2.f15074G = null;
                    aVar2.f15078K = 3;
                    objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
                    if (objM108729b != obj2) {
                        Card card6 = card3;
                        str4 = str6;
                        card2 = card6;
                    }
                    return obj2;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                card2 = (Card) aVar2.f15081y;
                map2 = (Map) aVar2.f15080x;
                str4 = (String) aVar2.f15079w;
                AbstractC34132o.m107864I(objM108729b);
            }
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                this.bannerInvalidator.invalidateBanners();
                return InterfaceC3688b.c.f15065a;
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC3688b.a(str4, map2, card2);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC34132o.m107864I(objM108729b);
        strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str6);
        C0755b c0755b = AbstractC0757c.f2762d;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LinkedHashMapSerializer linkedHashMapSerializerM122335c = AbstractC38195a.m122335c(stringSerializer, AbstractC38195a.m122336d(stringSerializer));
        c0755b.getClass();
        mapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("payload", AbstractC12313p.m34290h0(c0755b, map2, linkedHashMapSerializerM122335c)));
        if (card3 == null) {
            JsonObject jsonObject2 = new JsonObject(mapM73993b0);
            InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            b bVar2 = new b(strM8299l, jsonObject2, null);
            aVar2.f15079w = str6;
            aVar2.f15080x = map2;
            aVar2.f15081y = card3;
            aVar2.f15082z = null;
            aVar2.f15072E = null;
            aVar2.f15073F = null;
            aVar2.f15074G = null;
            aVar2.f15078K = 3;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, null, bVar2, aVar2, 6, null);
            if (objM108729b != obj2) {
                Card card7 = card3;
                str4 = str6;
                card2 = card7;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    this.bannerInvalidator.invalidateBanners();
                    return InterfaceC3688b.c.f15065a;
                }
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    return new InterfaceC3688b.a(str4, map2, card2);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if ((card3.isNotEmpty() ? card3 : null) != null) {
                aVar2.f15079w = str6;
                aVar2.f15080x = map2;
                aVar2.f15081y = card3;
                aVar2.f15082z = strM8299l;
                aVar2.f15072E = mapM73993b0;
                aVar2.f15073F = null;
                aVar2.f15075H = 0;
                aVar2.f15078K = 1;
                objM11479h = m11479h(card3, aVar2);
                if (objM11479h != obj2) {
                    str2 = str6;
                    i13 = 0;
                }
            } else {
                JsonObject jsonObject3 = new JsonObject(mapM73993b0);
                InterfaceC34385a.Companion companion3 = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n3 = this.logger;
                b bVar3 = new b(strM8299l, jsonObject3, null);
                aVar2.f15079w = str6;
                aVar2.f15080x = map2;
                aVar2.f15081y = card3;
                aVar2.f15082z = null;
                aVar2.f15072E = null;
                aVar2.f15073F = null;
                aVar2.f15074G = null;
                aVar2.f15078K = 3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion3, interfaceC34116n3, null, null, bVar3, aVar2, 6, null);
                if (objM108729b != obj2) {
                    Card card8 = card3;
                    str4 = str6;
                    card2 = card8;
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        this.bannerInvalidator.invalidateBanners();
                        return InterfaceC3688b.c.f15065a;
                    }
                    if (interfaceC34385a instanceof InterfaceC34385a.b) {
                        return new InterfaceC3688b.a(str4, map2, card2);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return obj2;
        String str10 = (String) objM11479h;
        if (str10 == null) {
            return new InterfaceC3688b.a(null, null, null, 7, null);
        }
        aVar2.f15079w = str2;
        aVar2.f15080x = map2;
        aVar2.f15081y = card3;
        aVar2.f15082z = strM8299l;
        aVar2.f15072E = mapM73993b0;
        aVar2.f15073F = null;
        aVar2.f15074G = str10;
        aVar2.f15075H = i13;
        aVar2.f15078K = 2;
        Object objM11480i = m11480i(str10, aVar2);
        if (objM11480i != obj2) {
            obj = objM11480i;
            str3 = str10;
            str5 = (String) obj;
            if (str5 == null) {
                return new InterfaceC3688b.a(null, null, null, 7, null);
            }
            mapM73993b0.put("payment_method_id", AbstractC0770m.m1841c(str5));
            mapM73993b0.put("card_token", AbstractC0770m.m1841c(str3));
            str6 = str2;
            JsonObject jsonObject4 = new JsonObject(mapM73993b0);
            InterfaceC34385a.Companion companion4 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n4 = this.logger;
            b bVar4 = new b(strM8299l, jsonObject4, null);
            aVar2.f15079w = str6;
            aVar2.f15080x = map2;
            aVar2.f15081y = card3;
            aVar2.f15082z = null;
            aVar2.f15072E = null;
            aVar2.f15073F = null;
            aVar2.f15074G = null;
            aVar2.f15078K = 3;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion4, interfaceC34116n4, null, null, bVar4, aVar2, 6, null);
            if (objM108729b != obj2) {
                Card card9 = card3;
                str4 = str6;
                card2 = card9;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    this.bannerInvalidator.invalidateBanners();
                    return InterfaceC3688b.c.f15065a;
                }
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    return new InterfaceC3688b.a(str4, map2, card2);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: h */
    private final Object m11479h(Card card, InterfaceC30057d<? super String> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new c(card, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    private final Object m11480i(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new d(str, null), interfaceC30057d);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC3688b.b.f15064a, AbstractC13091v.m36590P(upstream, new e(null)), new f(null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3689c(MembershipManagementApi membershipManagementApi, AbstractC32943y abstractC32943y, InterfaceC16828a interfaceC16828a, BannerInvalidator bannerInvalidator, AbstractC3076z abstractC3076z, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(membershipManagementApi, abstractC32943y, interfaceC16828a, bannerInvalidator, abstractC3076z, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CheckoutInteractor") : interfaceC34116n);
    }
}
