package h32;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.payments.domain.PaymentsApi;
import java.util.Locale;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p537ux.C35339j0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: h32.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 %2\u00020\u0001:\u0003\u0016\u0019\u0015B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u000fJ\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00060\u001dR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u00060!R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Lh32/c;", "Lh32/a;", "Lcom/whoop/payments/domain/PaymentsApi;", "api", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "Lkotlin/Function1;", "", "Lux/j0;", "stripeFactory", "<init>", "(Lcom/whoop/payments/domain/PaymentsApi;Landroid/content/Context;Ltr2/n;Lkotlin/jvm/functions/Function1;)V", "i", "(Lq83/d;)Ljava/lang/Object;", "country", "k", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "j", "(Ljava/lang/String;)Ljava/lang/String;", "b", "a", "Lcom/whoop/payments/domain/PaymentsApi;", "Landroid/content/Context;", "c", "Ltr2/n;", "d", "Lkotlin/jvm/functions/Function1;", "Lh32/c$a;", "e", "Lh32/c$a;", "authenticatedStripe", "Lh32/c$c;", "f", "Lh32/c$c;", "onboardingStripe", "g", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16830c implements InterfaceC16828a {

    /* JADX INFO: renamed from: g */
    private static final b f64644g = new b(null);

    /* JADX INFO: renamed from: h */
    public static final int f64645h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PaymentsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1 stripeFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final a authenticatedStripe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final c onboardingStripe;

    /* JADX INFO: renamed from: h32.c$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\t\u0010\nR,\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lh32/c$a;", "", "Lkotlin/Function1;", "Lq83/d;", "", "keyProvider", "<init>", "(Lh32/c;Lkotlin/jvm/functions/Function1;)V", "Lux/j0;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "Lmc3/a;", "b", "Lmc3/a;", "mutex", "c", "Lux/j0;", "cache", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function1 keyProvider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25435a mutex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private C35339j0 cache;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C16830c f64655d;

        /* JADX INFO: renamed from: h32.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes9.dex */
        @InterfaceC32271e(m100429c = "com.whoop.payments.stripemanager.StripeManagerImpl$CachedStripe", m100430f = "StripeManagerImpl.kt", m100431l = {96, 61}, m100432m = "get", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41680a extends AbstractC32269c {

            /* JADX INFO: renamed from: E */
            /* synthetic */ Object f64656E;

            /* JADX INFO: renamed from: G */
            int f64658G;

            /* JADX INFO: renamed from: w */
            Object f64659w;

            /* JADX INFO: renamed from: x */
            Object f64660x;

            /* JADX INFO: renamed from: y */
            int f64661y;

            /* JADX INFO: renamed from: z */
            int f64662z;

            public C41680a(InterfaceC30057d<? super C41680a> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f64656E = obj;
                this.f64658G |= Integer.MIN_VALUE;
                return a.this.m47436a(this);
            }
        }

        public a(C16830c c16830c, Function1 keyProvider) {
            AbstractC22676k.m65750j(keyProvider, "keyProvider");
            this.f64655d = c16830c;
            this.keyProvider = keyProvider;
            this.mutex = AbstractC25438d.m74669a();
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:30:0x0083, B:32:0x0087), top: B:41:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0099  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        public final Object m47436a(InterfaceC30057d<? super C35339j0> interfaceC30057d) throws Throwable {
            C41680a c41680a;
            InterfaceC25435a interfaceC25435a;
            C16830c c16830c;
            int i13;
            InterfaceC25435a interfaceC25435a2;
            Throwable th3;
            C35339j0 c35339j0;
            C16830c c16830c2;
            String str;
            if (interfaceC30057d instanceof C41680a) {
                c41680a = (C41680a) interfaceC30057d;
                int i14 = c41680a.f64658G;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c41680a.f64658G = i14 - Integer.MIN_VALUE;
                } else {
                    c41680a = new C41680a(interfaceC30057d);
                }
            } else {
                c41680a = new C41680a(interfaceC30057d);
            }
            Object obj = c41680a.f64656E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = c41680a.f64658G;
            try {
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = this.mutex;
                    c16830c = this.f64655d;
                    c41680a.f64659w = interfaceC25435a;
                    c41680a.f64660x = c16830c;
                    c41680a.f64661y = 0;
                    c41680a.f64658G = 1;
                    if (interfaceC25435a.mo68211b(c41680a) != enumC31071a) {
                        i13 = 0;
                    }
                    return enumC31071a;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c16830c2 = (C16830c) c41680a.f64660x;
                    interfaceC25435a2 = (InterfaceC25435a) c41680a.f64659w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        str = (String) obj;
                        if (str != null) {
                            Object objInvoke = c16830c2.stripeFactory.invoke(str);
                            this.cache = (C35339j0) objInvoke;
                            c35339j0 = (C35339j0) objInvoke;
                            interfaceC25435a = interfaceC25435a2;
                        } else {
                            interfaceC25435a = interfaceC25435a2;
                            c35339j0 = null;
                        }
                        interfaceC25435a.mo68214i(null);
                        return c35339j0;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                int i16 = c41680a.f64661y;
                C16830c c16830c3 = (C16830c) c41680a.f64660x;
                InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c41680a.f64659w;
                AbstractC34132o.m107864I(obj);
                i13 = i16;
                c16830c = c16830c3;
                interfaceC25435a = interfaceC25435a3;
                c35339j0 = this.cache;
                if (c35339j0 == null) {
                    Function1 function1 = this.keyProvider;
                    c41680a.f64659w = interfaceC25435a;
                    c41680a.f64660x = c16830c;
                    c41680a.f64661y = i13;
                    c41680a.f64662z = 0;
                    c41680a.f64658G = 2;
                    Object objInvoke2 = function1.invoke(c41680a);
                    if (objInvoke2 != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a;
                        obj = objInvoke2;
                        c16830c2 = c16830c;
                        str = (String) obj;
                        if (str != null) {
                            Object objInvoke3 = c16830c2.stripeFactory.invoke(str);
                            this.cache = (C35339j0) objInvoke3;
                            c35339j0 = (C35339j0) objInvoke3;
                            interfaceC25435a = interfaceC25435a2;
                        } else {
                            interfaceC25435a = interfaceC25435a2;
                            c35339j0 = null;
                        }
                    }
                    return enumC31071a;
                }
                interfaceC25435a.mo68214i(null);
                return c35339j0;
            } catch (Throwable th5) {
                interfaceC25435a2 = interfaceC25435a;
                th3 = th5;
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: h32.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lh32/c$b;", "", "<init>", "()V", "", "DEFAULT_COUNTRY", "Ljava/lang/String;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: h32.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lh32/c$c;", "", "<init>", "(Lh32/c;)V", "", "country", "Lux/j0;", "a", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lmc3/a;", "Lmc3/a;", "mutex", "b", "Ljava/lang/String;", "cachedCountry", "c", "Lux/j0;", "cache", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC25435a mutex = AbstractC25438d.m74669a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private String cachedCountry;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private C35339j0 cache;

        /* JADX INFO: renamed from: h32.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.payments.stripemanager.StripeManagerImpl$OnboardingStripeCache", m100430f = "StripeManagerImpl.kt", m100431l = {96, 77}, m100432m = "get", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32269c {

            /* JADX INFO: renamed from: E */
            int f64667E;

            /* JADX INFO: renamed from: F */
            /* synthetic */ Object f64668F;

            /* JADX INFO: renamed from: H */
            int f64670H;

            /* JADX INFO: renamed from: w */
            Object f64671w;

            /* JADX INFO: renamed from: x */
            Object f64672x;

            /* JADX INFO: renamed from: y */
            Object f64673y;

            /* JADX INFO: renamed from: z */
            int f64674z;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f64668F = obj;
                this.f64670H |= Integer.MIN_VALUE;
                return c.this.m47437a(null, this);
            }
        }

        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:38:0x009c, B:40:0x00a0), top: B:49:0x0034 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        public final Object m47437a(String str, InterfaceC30057d<? super C35339j0> interfaceC30057d) throws Throwable {
            a aVar;
            C16830c c16830c;
            InterfaceC25435a interfaceC25435a;
            int i13;
            InterfaceC25435a interfaceC25435a2;
            C35339j0 c35339j0;
            String str2;
            C16830c c16830c2;
            String str3;
            if (interfaceC30057d instanceof a) {
                aVar = (a) interfaceC30057d;
                int i14 = aVar.f64670H;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f64670H = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC30057d);
                }
            } else {
                aVar = new a(interfaceC30057d);
            }
            Object objM47435k = aVar.f64668F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = aVar.f64670H;
            try {
                if (i15 == 0) {
                    AbstractC34132o.m107864I(objM47435k);
                    InterfaceC25435a interfaceC25435a3 = this.mutex;
                    c16830c = C16830c.this;
                    aVar.f64671w = str;
                    aVar.f64672x = interfaceC25435a3;
                    aVar.f64673y = c16830c;
                    aVar.f64674z = 0;
                    aVar.f64670H = 1;
                    if (interfaceC25435a3.mo68211b(aVar) != enumC31071a) {
                        interfaceC25435a = interfaceC25435a3;
                        i13 = 0;
                    }
                    return enumC31071a;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c16830c2 = (C16830c) aVar.f64673y;
                    interfaceC25435a2 = (InterfaceC25435a) aVar.f64672x;
                    str2 = (String) aVar.f64671w;
                    try {
                        AbstractC34132o.m107864I(objM47435k);
                        str3 = (String) objM47435k;
                        if (str3 != null) {
                            Object objInvoke = c16830c2.stripeFactory.invoke(str3);
                            this.cache = (C35339j0) objInvoke;
                            this.cachedCountry = str2;
                            c35339j0 = (C35339j0) objInvoke;
                            interfaceC25435a = interfaceC25435a2;
                        } else {
                            interfaceC25435a = interfaceC25435a2;
                            c35339j0 = null;
                        }
                        interfaceC25435a.mo68214i(null);
                        return c35339j0;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC25435a2.mo68214i(null);
                        throw th;
                    }
                }
                int i16 = aVar.f64674z;
                c16830c = (C16830c) aVar.f64673y;
                interfaceC25435a = (InterfaceC25435a) aVar.f64672x;
                String str4 = (String) aVar.f64671w;
                AbstractC34132o.m107864I(objM47435k);
                i13 = i16;
                str = str4;
                c35339j0 = this.cache;
                if (c35339j0 != null) {
                    if (!AbstractC22676k.m65745e(this.cachedCountry, str)) {
                        c35339j0 = null;
                    }
                    if (c35339j0 == null) {
                    }
                    interfaceC25435a.mo68214i(null);
                    return c35339j0;
                }
                aVar.f64671w = str;
                aVar.f64672x = interfaceC25435a;
                aVar.f64673y = c16830c;
                aVar.f64674z = i13;
                aVar.f64667E = 0;
                aVar.f64670H = 2;
                objM47435k = c16830c.m47435k(str, aVar);
                if (objM47435k != enumC31071a) {
                    str2 = str;
                    c16830c2 = c16830c;
                    interfaceC25435a2 = interfaceC25435a;
                    str3 = (String) objM47435k;
                    if (str3 != null) {
                        Object objInvoke2 = c16830c2.stripeFactory.invoke(str3);
                        this.cache = (C35339j0) objInvoke2;
                        this.cachedCountry = str2;
                        c35339j0 = (C35339j0) objInvoke2;
                        interfaceC25435a = interfaceC25435a2;
                    } else {
                        interfaceC25435a = interfaceC25435a2;
                        c35339j0 = null;
                    }
                    interfaceC25435a.mo68214i(null);
                    return c35339j0;
                }
                return enumC31071a;
            } catch (Throwable th4) {
                th = th4;
                interfaceC25435a2 = interfaceC25435a;
                interfaceC25435a2.mo68214i(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h32.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripemanager.StripeManagerImpl$authenticatedStripe$1", m100430f = "StripeManagerImpl.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f64675w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C16830c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f64675w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C16830c c16830c = C16830c.this;
            this.f64675w = 1;
            Object objM47433i = c16830c.m47433i(this);
            return objM47433i == enumC31071a ? enumC31071a : objM47433i;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super String> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: h32.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripemanager.StripeManagerImpl", m100430f = "StripeManagerImpl.kt", m100431l = {27}, m100432m = "resolveAuthenticatedKey", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f64677w;

        /* JADX INFO: renamed from: y */
        int f64679y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f64677w = obj;
            this.f64679y |= Integer.MIN_VALUE;
            return C16830c.this.m47433i(this);
        }
    }

    /* JADX INFO: renamed from: h32.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripemanager.StripeManagerImpl$resolveAuthenticatedKey$response$1", m100430f = "StripeManagerImpl.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lud3/a1;", "<anonymous>", "()Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f64680w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C16830c.this.new f(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f64680w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            PaymentsApi paymentsApi = C16830c.this.api;
            this.f64680w = 1;
            Object publicStripeToken = paymentsApi.getPublicStripeToken(this);
            return publicStripeToken == enumC31071a ? enumC31071a : publicStripeToken;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: h32.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripemanager.StripeManagerImpl", m100430f = "StripeManagerImpl.kt", m100431l = {37}, m100432m = "resolveOnboardingKey", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f64682w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f64683x;

        /* JADX INFO: renamed from: z */
        int f64685z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f64683x = obj;
            this.f64685z |= Integer.MIN_VALUE;
            return C16830c.this.m47435k(null, this);
        }
    }

    /* JADX INFO: renamed from: h32.c$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripemanager.StripeManagerImpl$resolveOnboardingKey$response$1", m100430f = "StripeManagerImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lud3/a1;", "<anonymous>", "()Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f64686w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f64688y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f64688y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C16830c.this.new h(this.f64688y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f64686w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            PaymentsApi paymentsApi = C16830c.this.api;
            String str = this.f64688y;
            this.f64686w = 1;
            Object publicStripeTokenOnboarding = paymentsApi.getPublicStripeTokenOnboarding(str, this);
            return publicStripeTokenOnboarding == enumC31071a ? enumC31071a : publicStripeTokenOnboarding;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C16830c(PaymentsApi api, Context context, InterfaceC34116n logger, Function1 stripeFactory) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(stripeFactory, "stripeFactory");
        this.api = api;
        this.context = context;
        this.logger = logger;
        this.stripeFactory = stripeFactory;
        this.authenticatedStripe = new a(this, new d(null));
        this.onboardingStripe = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C35339j0 m47428d(Context context, String key) {
        AbstractC22676k.m65750j(key, "key");
        return new C35339j0(context, key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m47433i(InterfaceC30057d<? super String> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f64679y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f64679y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f64677w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f64679y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(null);
            eVar2.f64679y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to resolve Stripe key", fVar, eVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String strM109860m = ((AbstractC34799a1) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).m109860m();
        if (strM109860m.length() == 0) {
            return null;
        }
        return strM109860m;
    }

    /* JADX INFO: renamed from: j */
    private final String m47434j(String country) {
        String string = country != null ? AbstractC39414r.m125869O0(country).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() != 0) {
            return string;
        }
        String country2 = Locale.getDefault().getCountry();
        return country2.length() == 0 ? "US" : country2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m47435k(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f64685z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f64685z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM108729b = gVar2.f64683x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f64685z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(str, null);
            gVar2.f64682w = null;
            gVar2.f64685z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to resolve onboarding Stripe key", hVar, gVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String strM109860m = ((AbstractC34799a1) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).m109860m();
        if (strM109860m.length() == 0) {
            return null;
        }
        return strM109860m;
    }

    @Override // h32.InterfaceC16828a
    /* JADX INFO: renamed from: a */
    public Object mo47425a(String str, InterfaceC30057d<? super C35339j0> interfaceC30057d) {
        return this.onboardingStripe.m47437a(m47434j(str), interfaceC30057d);
    }

    @Override // h32.InterfaceC16828a
    /* JADX INFO: renamed from: b */
    public Object mo47426b(InterfaceC30057d<? super C35339j0> interfaceC30057d) {
        return this.authenticatedStripe.m47436a(interfaceC30057d);
    }

    public /* synthetic */ C16830c(PaymentsApi paymentsApi, Context context, InterfaceC34116n interfaceC34116n, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentsApi, context, interfaceC34116n, (i13 & 8) != 0 ? new C16829b(context, 0) : function1);
    }
}
