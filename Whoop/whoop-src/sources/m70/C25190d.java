package m70;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.exception.CardException;
import com.whoop.activation.domain.interactors.payments.ActivationMembershipApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import ec3.C13015a0;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h32.InterfaceC16828a;
import h80.C17003c;
import h80.InterfaceC17002b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.Map;
import jy1.C22047a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import m83.C25271y;
import od1.InterfaceC27844g;
import p087db.C11856j0;
import p408q.C29662f;
import p442qy.C30767f;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.C35339j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import y00.C38793c;
import y00.C38842g8;
import y00.C38843h;
import y00.C38892m;
import y00.C38915o4;
import y00.C38951s4;
import y00.C38968u3;
import y00.EnumC38853i;

/* JADX INFO: renamed from: m70.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020#H\u0082@¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020!*\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020#2\u0006\u0010/\u001a\u00020(H\u0002¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u000202*\u00020(H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u000202*\u0004\u0018\u000105H\u0002¢\u0006\u0004\b6\u00107J#\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003082\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, m65681d2 = {"Lm70/d;", "Lod1/g;", "Lm70/a;", "Lm70/b;", "Lh32/a;", "stripeManager", "Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;", "membershipApi", "Lh80/c;", "analyticsHelper", "Liy1/c;", "metricWriter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/z;", "dispatcher", "Ltr2/n;", "logger", "<init>", "(Lh32/a;Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Lh80/c;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/z;Ltr2/n;)V", "Lm70/a$d;", "domainAction", "v", "(Lm70/a$d;Lq83/d;)Ljava/lang/Object;", "Lm70/a$c;", "u", "(Lm70/a$c;Lq83/d;)Ljava/lang/Object;", "Lm70/k;", "n", "(Lm70/k;Lq83/d;)Ljava/lang/Object;", "Lm70/a$a;", "o", "(Lm70/a$a;Lq83/d;)Ljava/lang/Object;", "Lm70/g;", "exception", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lm70/g;Lq83/d;)Ljava/lang/Object;", "x", "(Lq83/d;)Ljava/lang/Object;", "Lcom/stripe/android/core/exception/StripeException;", "p", "(Lcom/stripe/android/core/exception/StripeException;)Lm70/g;", "Ly00/g8;", "token", "q", "(Ly00/g8;)V", "e", "r", "(Lcom/stripe/android/core/exception/StripeException;)V", "", "s", "(Lcom/stripe/android/core/exception/StripeException;)Ljava/lang/String;", "Ly00/i;", "t", "(Ly00/i;)Ljava/lang/String;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lh32/a;", "b", "Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;", "c", "Lh80/c;", "d", "Liy1/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Lbc3/z;", "g", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25190d implements InterfaceC27844g<InterfaceC25187a, InterfaceC25188b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC16828a stripeManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivationMembershipApi membershipApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: m70.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98874a;

        static {
            int[] iArr = new int[EnumC38853i.values().length];
            try {
                iArr[EnumC38853i.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38853i.Discover.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38853i.JCB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC38853i.DinersClub.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC38853i.Visa.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC38853i.MasterCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC38853i.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f98874a = iArr;
        }
    }

    /* JADX INFO: renamed from: m70.d$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor", m100430f = "PaymentsInteractor.kt", m100431l = {182, 203, 209}, m100432m = "createPaymentMethod", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f98875E;

        /* JADX INFO: renamed from: G */
        int f98877G;

        /* JADX INFO: renamed from: w */
        Object f98878w;

        /* JADX INFO: renamed from: x */
        Object f98879x;

        /* JADX INFO: renamed from: y */
        Object f98880y;

        /* JADX INFO: renamed from: z */
        Object f98881z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f98875E = obj;
            this.f98877G |= Integer.MIN_VALUE;
            return C25190d.this.m73750n(null, this);
        }
    }

    /* JADX INFO: renamed from: m70.d$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor", m100430f = "PaymentsInteractor.kt", m100431l = {222, 255}, m100432m = "createStripeToken", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f98883F;

        /* JADX INFO: renamed from: w */
        Object f98884w;

        /* JADX INFO: renamed from: x */
        Object f98885x;

        /* JADX INFO: renamed from: y */
        Object f98886y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f98887z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f98887z = obj;
            this.f98883F |= Integer.MIN_VALUE;
            return C25190d.this.m73751o(null, this);
        }
    }

    /* JADX INFO: renamed from: m70.d$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$createStripeToken$2", m100430f = "PaymentsInteractor.kt", m100431l = {224, 242, 245}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lm70/b;", "<anonymous>", "(Lbc3/c0;)Lm70/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC25187a.a f98889F;

        /* JADX INFO: renamed from: w */
        Object f98890w;

        /* JADX INFO: renamed from: x */
        Object f98891x;

        /* JADX INFO: renamed from: y */
        Object f98892y;

        /* JADX INFO: renamed from: z */
        int f98893z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC25187a.a aVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98889F = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25190d.this.new d(this.f98889F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25195i.b bVar;
            Object objMo47425a;
            C38842g8 c38842g8;
            InterfaceC25195i.b bVar2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98893z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                bVar = InterfaceC25195i.b.f98950a;
                InterfaceC16828a interfaceC16828a = C25190d.this.stripeManager;
                String userCountryCode = this.f98889F.getUserCountryCode();
                this.f98890w = bVar;
                this.f98893z = 1;
                objMo47425a = interfaceC16828a.mo47425a(userCountryCode, this);
                if (objMo47425a != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 != 1) {
                if (i13 == 2) {
                    c38842g8 = (C38842g8) this.f98892y;
                    AbstractC34132o.m107864I(obj);
                    return new InterfaceC25188b.d(c38842g8.f167191w, this.f98889F.getCardZip());
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (InterfaceC25195i.b) this.f98890w;
                AbstractC34132o.m107864I(obj);
                return new InterfaceC25188b.e(bVar2);
            }
            bVar = (InterfaceC25195i.b) this.f98890w;
            AbstractC34132o.m107864I(obj);
            objMo47425a = obj;
            C35339j0 c35339j0 = (C35339j0) objMo47425a;
            if (c35339j0 == null) {
                return new InterfaceC25188b.e(bVar);
            }
            C38842g8 c38842g8M112191a = C35339j0.m112191a(c35339j0, new C38892m(this.f98889F.getCardNumber().getValue(), this.f98889F.getCardExpirationMonth().getValue(), this.f98889F.getCardExpirationYear().getValue(), this.f98889F.getCardCvv().getValue(), new C38793c(null, null, null, null, this.f98889F.getCardZip().getValue(), null)));
            if (c38842g8M112191a.f167191w.length() == 0) {
                C25190d c25190d = C25190d.this;
                this.f98890w = bVar;
                this.f98891x = null;
                this.f98892y = null;
                this.f98893z = 3;
                if (c25190d.m73759w(bVar, this) != enumC31071a) {
                    bVar2 = bVar;
                    return new InterfaceC25188b.e(bVar2);
                }
            } else {
                C25190d.this.m73753q(c38842g8M112191a);
                C25190d c25190d2 = C25190d.this;
                this.f98890w = null;
                this.f98891x = null;
                this.f98892y = c38842g8M112191a;
                this.f98893z = 2;
                if (c25190d2.m73760x(this) != enumC31071a) {
                    c38842g8 = c38842g8M112191a;
                    return new InterfaceC25188b.d(c38842g8.f167191w, this.f98889F.getCardZip());
                }
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: m70.d$e */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$interact$$inlined$transform$1", m100430f = "PaymentsInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f98894w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f98895x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f98896y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25190d f98897z;

        /* JADX INFO: renamed from: m70.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f98898w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25190d f98899x;

            /* JADX INFO: renamed from: m70.d$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$interact$$inlined$transform$1$1", m100430f = "PaymentsInteractor.kt", m100431l = {41, 42, 45, 48, 50, 53, 57, 58, 61, 65}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41985a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f98900E;

                /* JADX INFO: renamed from: F */
                Object f98901F;

                /* JADX INFO: renamed from: G */
                Object f98902G;

                /* JADX INFO: renamed from: H */
                Object f98903H;

                /* JADX INFO: renamed from: I */
                int f98904I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f98905w;

                /* JADX INFO: renamed from: x */
                int f98906x;

                /* JADX INFO: renamed from: z */
                Object f98908z;

                public C41985a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f98905w = obj;
                    this.f98906x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25190d c25190d) {
                this.f98899x = c25190d;
                this.f98898w = interfaceC13062m;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:29:0x00f3 A[PHI: r2 r9 r10
              0x00f3: PHI (r2v9 ec3.m) = (r2v6 ec3.m), (r2v11 ec3.m) binds: [B:27:0x00ef, B:18:0x008d] A[DONT_GENERATE, DONT_INLINE]
              0x00f3: PHI (r9v19 int) = (r9v17 int), (r9v22 int) binds: [B:27:0x00ef, B:18:0x008d] A[DONT_GENERATE, DONT_INLINE]
              0x00f3: PHI (r10v5 java.lang.Object) = (r10v4 java.lang.Object), (r10v1 java.lang.Object) binds: [B:27:0x00ef, B:18:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:41:0x0145 A[PHI: r2 r9 r10
              0x0145: PHI (r2v15 ec3.m) = (r2v12 ec3.m), (r2v17 ec3.m) binds: [B:39:0x0141, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
              0x0145: PHI (r9v33 int) = (r9v31 int), (r9v36 int) binds: [B:39:0x0141, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
              0x0145: PHI (r10v9 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:39:0x0141, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:53:0x0195 A[PHI: r2 r9 r10
              0x0195: PHI (r2v21 ec3.m) = (r2v18 ec3.m), (r2v23 ec3.m) binds: [B:51:0x0192, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
              0x0195: PHI (r9v40 int) = (r9v37 int), (r9v43 int) binds: [B:51:0x0192, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
              0x0195: PHI (r10v13 java.lang.Object) = (r10v12 java.lang.Object), (r10v1 java.lang.Object) binds: [B:51:0x0192, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
            
                if (r2.emit((m70.InterfaceC25188b) r10, r0) == r1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x015a, code lost:
            
                if (r2.emit((m70.InterfaceC25188b) r10, r0) == r1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01ab, code lost:
            
                if (r2.emit((m70.InterfaceC25188b) r10, r0) == r1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01c6, code lost:
            
                if (r10.emit(r9, r0) == r1) goto L60;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
                /*
                    Method dump skipped, instruction units count: 492
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m70.C25190d.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C25190d c25190d) {
            super(2, interfaceC30057d);
            this.f98896y = interfaceC13058l;
            this.f98897z = c25190d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f98896y, interfaceC30057d, this.f98897z);
            eVar.f98895x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98894w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f98895x;
                InterfaceC13058l interfaceC13058l = this.f98896y;
                a aVar = new a(interfaceC13062m, this.f98897z);
                this.f98895x = null;
                this.f98894w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: m70.d$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$interact$1$result$1", m100430f = "PaymentsInteractor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lm70/b;", "<anonymous>", "(Lbc3/c0;)Lm70/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f98909w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25187a f98911y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC25187a interfaceC25187a, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98911y = interfaceC25187a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25190d.this.new f(this.f98911y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98909w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C25190d c25190d = C25190d.this;
            InterfaceC25187a.a aVar = (InterfaceC25187a.a) this.f98911y;
            this.f98909w = 1;
            Object objM73751o = c25190d.m73751o(aVar, this);
            return objM73751o == enumC31071a ? enumC31071a : objM73751o;
        }
    }

    /* JADX INFO: renamed from: m70.d$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$interact$1$result$2", m100430f = "PaymentsInteractor.kt", m100431l = {71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lm70/b;", "<anonymous>", "(Lbc3/c0;)Lm70/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f98912w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25187a f98914y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC25187a interfaceC25187a, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98914y = interfaceC25187a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25190d.this.new g(this.f98914y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98912w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C25190d c25190d = C25190d.this;
            InterfaceC25187a.d dVar = (InterfaceC25187a.d) this.f98914y;
            this.f98912w = 1;
            Object objM73758v = c25190d.m73758v(dVar, this);
            return objM73758v == enumC31071a ? enumC31071a : objM73758v;
        }
    }

    /* JADX INFO: renamed from: m70.d$h */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$interact$1$result$3", m100430f = "PaymentsInteractor.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lm70/b;", "<anonymous>", "(Lbc3/c0;)Lm70/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f98915w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25187a f98917y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC25187a interfaceC25187a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98917y = interfaceC25187a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25190d.this.new h(this.f98917y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98915w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C25190d c25190d = C25190d.this;
            InterfaceC25187a.c cVar = (InterfaceC25187a.c) this.f98917y;
            this.f98915w = 1;
            Object objM73757u = c25190d.m73757u(cVar, this);
            return objM73757u == enumC31071a ? enumC31071a : objM73757u;
        }
    }

    /* JADX INFO: renamed from: m70.d$i */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$interact$2", m100430f = "PaymentsInteractor.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lm70/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f98918w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f98919x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(interfaceC30057d);
            iVar.f98919x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f98919x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98918w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC25188b.a aVar = InterfaceC25188b.a.f98857a;
                this.f98919x = null;
                this.f98918w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: m70.d$j */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$trialOfferCheckout$2", m100430f = "PaymentsInteractor.kt", m100431l = {138, 157, 165}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lm70/b;", "<anonymous>", "(Lbc3/c0;)Lm70/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C25190d f98920E;

        /* JADX INFO: renamed from: w */
        Object f98921w;

        /* JADX INFO: renamed from: x */
        Object f98922x;

        /* JADX INFO: renamed from: y */
        int f98923y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC25187a.c f98924z;

        /* JADX INFO: renamed from: m70.d$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$trialOfferCheckout$2$response$1", m100430f = "PaymentsInteractor.kt", m100431l = {157}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f98925w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25190d f98926x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ JsonObject f98927y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C25190d c25190d, JsonObject jsonObject, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f98926x = c25190d;
                this.f98927y = jsonObject;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f98926x, this.f98927y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f98925w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivationMembershipApi activationMembershipApi = this.f98926x.membershipApi;
                JsonObject jsonObject = this.f98927y;
                this.f98925w = 1;
                Object objPlaceOrderV2 = activationMembershipApi.placeOrderV2(jsonObject, this);
                return objPlaceOrderV2 == enumC31071a ? enumC31071a : objPlaceOrderV2;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ProgressContent> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: m70.d$j$b */
        @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$trialOfferCheckout$2$response$2", m100430f = "PaymentsInteractor.kt", m100431l = {165}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f98928w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25190d f98929x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Map<String, Object> f98930y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C25190d c25190d, Map<String, Object> map, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f98929x = c25190d;
                this.f98930y = map;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f98929x, this.f98930y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f98928w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivationMembershipApi activationMembershipApi = this.f98929x.membershipApi;
                Map<String, Object> map = this.f98930y;
                this.f98928w = 1;
                Object objPlaceOrder = activationMembershipApi.placeOrder(map, this);
                return objPlaceOrder == enumC31071a ? enumC31071a : objPlaceOrder;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ProgressContent> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC25187a.c cVar, C25190d c25190d, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98924z = cVar;
            this.f98920E = c25190d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f98924z, this.f98920E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x006d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0086  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00da  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:44:0x0132  */
        /* JADX WARN: Code duplicated, block: B:46:0x0159  */
        /* JADX WARN: Code duplicated, block: B:50:0x016a  */
        /* JADX WARN: Code duplicated, block: B:52:0x016d  */
        /* JADX WARN: Code duplicated, block: B:56:0x017f  */
        /* JADX WARN: Code duplicated, block: B:58:0x0182  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r0 == r8) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
        
            if (r0 == r8) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
        
            if (r0 == r8) goto L61;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 469
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m70.C25190d.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: m70.d$k */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$upcycleCheckout$2", m100430f = "PaymentsInteractor.kt", m100431l = {95, 114, 122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lm70/b;", "<anonymous>", "(Lbc3/c0;)Lm70/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C25190d f98931E;

        /* JADX INFO: renamed from: w */
        Object f98932w;

        /* JADX INFO: renamed from: x */
        Object f98933x;

        /* JADX INFO: renamed from: y */
        int f98934y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC25187a.d f98935z;

        /* JADX INFO: renamed from: m70.d$k$a */
        @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$upcycleCheckout$2$response$1", m100430f = "PaymentsInteractor.kt", m100431l = {114}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f98936w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25190d f98937x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ JsonObject f98938y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C25190d c25190d, JsonObject jsonObject, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f98937x = c25190d;
                this.f98938y = jsonObject;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f98937x, this.f98938y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f98936w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivationMembershipApi activationMembershipApi = this.f98937x.membershipApi;
                JsonObject jsonObject = this.f98938y;
                this.f98936w = 1;
                Object objPlaceOrderV2 = activationMembershipApi.placeOrderV2(jsonObject, this);
                return objPlaceOrderV2 == enumC31071a ? enumC31071a : objPlaceOrderV2;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ProgressContent> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: m70.d$k$b */
        @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$upcycleCheckout$2$response$2", m100430f = "PaymentsInteractor.kt", m100431l = {122}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f98939w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25190d f98940x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Map<String, Object> f98941y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C25190d c25190d, Map<String, Object> map, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f98940x = c25190d;
                this.f98941y = map;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f98940x, this.f98941y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f98939w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ActivationMembershipApi activationMembershipApi = this.f98940x.membershipApi;
                Map<String, Object> map = this.f98941y;
                this.f98939w = 1;
                Object objPlaceOrder = activationMembershipApi.placeOrder(map, this);
                return objPlaceOrder == enumC31071a ? enumC31071a : objPlaceOrder;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ProgressContent> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC25187a.d dVar, C25190d c25190d, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98935z = dVar;
            this.f98931E = c25190d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f98935z, this.f98931E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x006d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0086  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00da  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:44:0x0132  */
        /* JADX WARN: Code duplicated, block: B:46:0x0159  */
        /* JADX WARN: Code duplicated, block: B:50:0x016a  */
        /* JADX WARN: Code duplicated, block: B:52:0x016d  */
        /* JADX WARN: Code duplicated, block: B:56:0x017f  */
        /* JADX WARN: Code duplicated, block: B:58:0x0182  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r0 == r8) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
        
            if (r0 == r8) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
        
            if (r0 == r8) goto L61;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 469
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m70.C25190d.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C25190d(InterfaceC16828a stripeManager, ActivationMembershipApi membershipApi, C17003c analyticsHelper, InterfaceC21030c metricWriter, FeatureFlagChecker featureFlagChecker, AbstractC3076z dispatcher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(stripeManager, "stripeManager");
        AbstractC22676k.m65750j(membershipApi, "membershipApi");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        this.stripeManager = stripeManager;
        this.membershipApi = membershipApi;
        this.analyticsHelper = analyticsHelper;
        this.metricWriter = metricWriter;
        this.featureFlagChecker = featureFlagChecker;
        this.dispatcher = dispatcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m73750n(C25197k c25197k, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
        b bVar;
        InterfaceC25193g interfaceC25193g;
        C25197k c25197k2;
        InterfaceC25195i.b bVar2;
        C38915o4 c38915o4M112192b;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f98877G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f98877G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f98875E;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = bVar.f98877G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC25195i.b bVar3 = InterfaceC25195i.b.f98950a;
                InterfaceC16828a interfaceC16828a = this.stripeManager;
                String userCountryCode = c25197k.getUserCountryCode();
                bVar.f98878w = c25197k;
                bVar.f98879x = bVar3;
                bVar.f98877G = 1;
                Object objMo47425a = interfaceC16828a.mo47425a(userCountryCode, bVar);
                if (objMo47425a != obj2) {
                    c25197k2 = c25197k;
                    bVar2 = bVar3;
                    obj = objMo47425a;
                }
                return obj2;
            }
            if (i14 == 1) {
                bVar2 = (InterfaceC25195i.b) bVar.f98879x;
                c25197k2 = (C25197k) bVar.f98878w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25193g = (InterfaceC25193g) bVar.f98880y;
                    AbstractC34132o.m107864I(obj);
                    return new InterfaceC25188b.e(interfaceC25193g);
                }
                c38915o4M112192b = (C38915o4) bVar.f98881z;
                AbstractC34132o.m107864I(obj);
            }
            return new InterfaceC25188b.c(c38915o4M112192b.f167527w);
            C35339j0 c35339j0 = (C35339j0) obj;
            if (c35339j0 == null) {
                return new InterfaceC25188b.e(bVar2);
            }
            C29662f c29662f = new C29662f(23, false);
            c29662f.m91094O0(c25197k2.getCardNumber().getValue());
            c29662f.m91090K0(c25197k2.getCardCvv().getValue());
            c29662f.m91091L0(new Integer(c25197k2.getCardExpirationMonth().getValue()));
            c29662f.m91092M0(new Integer(c25197k2.getCardExpirationYear().getValue()));
            C38951s4 c38951s4M91121k0 = c29662f.m91121k0();
            C38968u3 c38968u3 = new C38968u3();
            C11856j0 c11856j0 = new C11856j0(14);
            c11856j0.m31830p(c25197k2.getCardZip().getValue());
            c38968u3.m124399b(c11856j0.m31825i());
            c38915o4M112192b = C35339j0.m112192b(c35339j0, C33647p.m106266h(c38951s4M91121k0, c38968u3.m124398a(), 12));
            bVar.f98878w = null;
            bVar.f98879x = null;
            bVar.f98880y = null;
            bVar.f98881z = c38915o4M112192b;
            bVar.f98877G = 2;
            if (m73760x(bVar) == obj2) {
                return obj2;
            }
            return new InterfaceC25188b.c(c38915o4M112192b.f167527w);
        } catch (StripeException e5) {
            InterfaceC25193g interfaceC25193gM73752p = m73752p(e5);
            this.logger.mo85230v("Failed to create stripe token: " + e5, e5, new AbstractC30556a.a[0]);
            m73754r(e5);
            bVar.f98878w = null;
            bVar.f98879x = null;
            bVar.f98880y = interfaceC25193gM73752p;
            bVar.f98881z = null;
            bVar.f98877G = 3;
            if (m73759w(interfaceC25193gM73752p, bVar) != obj2) {
                interfaceC25193g = interfaceC25193gM73752p;
            }
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (m73759w(r7, r0) == r1) goto L28;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m73751o(m70.InterfaceC25187a.a r7, q83.InterfaceC30057d<? super m70.InterfaceC25188b> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof m70.C25190d.c
            if (r0 == 0) goto L13
            r0 = r8
            m70.d$c r0 = (m70.C25190d.c) r0
            int r1 = r0.f98883F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98883F = r1
            goto L18
        L13:
            m70.d$c r0 = new m70.d$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f98887z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f98883F
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f98886y
            m70.g r7 = (m70.InterfaceC25193g) r7
            java.lang.Object r1 = r0.f98885x
            com.stripe.android.core.exception.StripeException r1 = (com.stripe.android.core.exception.StripeException) r1
            java.lang.Object r0 = r0.f98884w
            m70.a$a r0 = (m70.InterfaceC25187a.a) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L8d
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.f98884w
            m70.a$a r7 = (m70.InterfaceC25187a.a) r7
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: com.stripe.android.core.exception.StripeException -> L47
            goto L5e
        L47:
            r7 = move-exception
            goto L61
        L49:
            p505ts.AbstractC34132o.m107864I(r8)
            bc3.z r8 = r6.dispatcher     // Catch: com.stripe.android.core.exception.StripeException -> L47
            m70.d$d r2 = new m70.d$d     // Catch: com.stripe.android.core.exception.StripeException -> L47
            r2.<init>(r7, r5)     // Catch: com.stripe.android.core.exception.StripeException -> L47
            r0.f98884w = r5     // Catch: com.stripe.android.core.exception.StripeException -> L47
            r0.f98883F = r4     // Catch: com.stripe.android.core.exception.StripeException -> L47
            java.lang.Object r8 = bc3.AbstractC3006f0.m8705K(r8, r2, r0)     // Catch: com.stripe.android.core.exception.StripeException -> L47
            if (r8 != r1) goto L5e
            goto L8c
        L5e:
            m70.b r8 = (m70.InterfaceC25188b) r8     // Catch: com.stripe.android.core.exception.StripeException -> L47
            return r8
        L61:
            tr2.n r8 = r6.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create stripe token: "
            r2.<init>(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4 = 0
            qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
            r8.mo85230v(r2, r7, r4)
            r6.m73754r(r7)
            m70.g r7 = r6.m73752p(r7)
            r0.f98884w = r5
            r0.f98885x = r5
            r0.f98886y = r7
            r0.f98883F = r3
            java.lang.Object r8 = r6.m73759w(r7, r0)
            if (r8 != r1) goto L8d
        L8c:
            return r1
        L8d:
            m70.b$e r8 = new m70.b$e
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m70.C25190d.m73751o(m70.a$a, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC25193g m73752p(StripeException stripeException) {
        if (stripeException instanceof APIConnectionException) {
            return InterfaceC25193g.a.f98944a;
        }
        if (stripeException instanceof APIException) {
            return InterfaceC25193g.b.f98945a;
        }
        if (stripeException instanceof AuthenticationException) {
            return InterfaceC25195i.a.f98949a;
        }
        if (stripeException instanceof CardException) {
            return InterfaceC25193g.c.f98946a;
        }
        return stripeException instanceof InvalidRequestException ? InterfaceC25193g.d.f98947a : InterfaceC25195i.b.f98950a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m73753q(C38842g8 token) {
        C17003c c17003c = this.analyticsHelper;
        C38843h c38843hM124350b = token.m124350b();
        c17003c.m47941p(new InterfaceC17002b.d("payment_method", m73756t(c38843hM124350b != null ? c38843hM124350b.m124351b() : null)));
    }

    /* JADX INFO: renamed from: r */
    private final void m73754r(StripeException e5) {
        this.analyticsHelper.m47941p(new InterfaceC17002b.a("payment_method", "inline_error", "try_again", "membership"));
        this.analyticsHelper.m47941p(new InterfaceC17002b.a("payment_method", "inline_error", m73755s(e5), "membership"));
    }

    /* JADX INFO: renamed from: s */
    private final String m73755s(StripeException stripeException) {
        C30767f c30767f = stripeException.f22155w;
        String strM94516v = c30767f != null ? c30767f.m94516v() : null;
        if (strM94516v == null) {
            return "generic_decline";
        }
        switch (strM94516v.hashCode()) {
            case -1109249604:
                return !strM94516v.equals("invalid_expiry_month") ? "generic_decline" : "incorrect_card_expiration";
            case -857379549:
                return !strM94516v.equals("incorrect_number") ? "generic_decline" : "incorrect_card_number";
            case 657301889:
                return !strM94516v.equals("invalid_expiry_year") ? "generic_decline" : "incorrect_card_expiration";
            case 1436957674:
                return !strM94516v.equals("expired_card") ? "generic_decline" : "expired_card";
            case 2037370550:
                return !strM94516v.equals("incorrect_cvc") ? "generic_decline" : "incorrect_card_CVC";
            case 2037392263:
                return !strM94516v.equals("incorrect_zip") ? "generic_decline" : "incorrect_card_zip_code";
            default:
                return "generic_decline";
        }
    }

    /* JADX INFO: renamed from: t */
    private final String m73756t(EnumC38853i enumC38853i) {
        switch (enumC38853i == null ? -1 : a.f98874a[enumC38853i.ordinal()]) {
            case 1:
                return "american_express";
            case 2:
                return "discover";
            case 3:
                return "jcb";
            case 4:
                return "diners_club";
            case 5:
                return "visa";
            case 6:
                return "master_card";
            case 7:
                return "union_pay";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final Object m73757u(InterfaceC25187a.c cVar, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new j(cVar, this, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final Object m73758v(InterfaceC25187a.d dVar, InterfaceC30057d<? super InterfaceC25188b> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new k(dVar, this, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final Object m73759w(InterfaceC25193g interfaceC25193g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new InterfaceC25192f.a(null, AbstractC37056f.m118958J(AbstractC25189c.m73738a(interfaceC25193g)), 1, null).mo73766b(), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final Object m73760x(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "whoop.stripe.oobe.success", null, C25271y.f99162w, null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13015a0(new i(null), new C13084s1(new e(upstream, null, this)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C25190d(InterfaceC16828a interfaceC16828a, ActivationMembershipApi activationMembershipApi, C17003c c17003c, InterfaceC21030c interfaceC21030c, FeatureFlagChecker featureFlagChecker, AbstractC3076z abstractC3076z, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 32) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(interfaceC16828a, activationMembershipApi, c17003c, interfaceC21030c, featureFlagChecker, abstractC3076z, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PaymentsInteractor") : interfaceC34116n);
    }
}
