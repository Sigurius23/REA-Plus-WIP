package com.whoop.archv2.feature.domain;

import com.whoop.archv2.model.template.AnyScreenTemplate;
import com.whoop.archv2.model.template.NavigationTemplate;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.archv2.model.template.UnknownTemplate;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.InterfaceC9596c;
import com.whoop.network.request.GetApiRequest;
import f63.AbstractC14155c;
import fy1.C14878n;
import fy1.InterfaceC14871g;
import ge3.AbstractC15751g;
import i63.C18183v;
import io.ktor.serialization.ContentConvertException;
import j02.InterfaceC21156n;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.DurationKt;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import w53.C36845b;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000f*\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/r;", "Lj02/n;", "Lu02/c;", "apiClient", "Ltr2/n;", "logger", "Lfy1/g;", "nanoClock", "<init>", "(Lu02/c;Ltr2/n;Lfy1/g;)V", "Lu02/a;", "Lf63/c;", "result", "", "name", "Lcom/whoop/navigation/c;", "f", "(Lu02/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "d", "(Lf63/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "e", "(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Ljava/lang/String;)Lcom/whoop/navigation/c;", "query", "a", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lu02/c;", "b", "Ltr2/n;", "c", "Lfy1/g;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6012r implements InterfaceC21156n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.r$a */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.TemplateDeeplinkResolver", m100430f = "TemplateDeeplinkResolver.kt", m100431l = {120}, m100432m = "decodeTemplate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f24014E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f24015F;

        /* JADX INFO: renamed from: H */
        int f24017H;

        /* JADX INFO: renamed from: w */
        Object f24018w;

        /* JADX INFO: renamed from: x */
        Object f24019x;

        /* JADX INFO: renamed from: y */
        Object f24020y;

        /* JADX INFO: renamed from: z */
        Object f24021z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f24015F = obj;
            this.f24017H |= Integer.MIN_VALUE;
            return C6012r.this.m18042d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.r$b */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.TemplateDeeplinkResolver", m100430f = "TemplateDeeplinkResolver.kt", m100431l = {42, 45}, m100432m = "resolve", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f24022E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f24023F;

        /* JADX INFO: renamed from: H */
        int f24025H;

        /* JADX INFO: renamed from: w */
        Object f24026w;

        /* JADX INFO: renamed from: x */
        Object f24027x;

        /* JADX INFO: renamed from: y */
        Object f24028y;

        /* JADX INFO: renamed from: z */
        Object f24029z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f24023F = obj;
            this.f24025H |= Integer.MIN_VALUE;
            return C6012r.this.mo18045a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.r$c */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.TemplateDeeplinkResolver$resolve$result$1", m100430f = "TemplateDeeplinkResolver.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f24030w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ DeeplinkResolveRequest f24032y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeeplinkResolveRequest deeplinkResolveRequest, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f24032y = deeplinkResolveRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C6012r.this.new c(this.f24032y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24030w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c c34387c = C6012r.this.apiClient;
            DeeplinkResolveRequest deeplinkResolveRequest = this.f24032y;
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(GetApiRequest.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(GetApiRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
            this.f24030w = 1;
            Object objM108748d = c34387c.m108748d(deeplinkResolveRequest, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C6012r(C34387c apiClient, InterfaceC34116n logger, InterfaceC14871g nanoClock) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        this.apiClient = apiClient;
        this.logger = logger;
        this.nanoClock = nanoClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: d */
    public final Object m18042d(AbstractC14155c abstractC14155c, String str, InterfaceC30057d<? super InterfaceC9596c> interfaceC30057d) {
        a aVar;
        C6012r c6012r;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f24017H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f24017H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM118137a = aVar.f24015F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f24017H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM118137a);
                C36845b c36845bMo13321a = abstractC14155c.mo13321a();
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(AnyScreenTemplate.class);
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnyScreenTemplate.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                aVar.f24018w = null;
                aVar.f24019x = str;
                aVar.f24020y = null;
                aVar.f24021z = this;
                aVar.f24014E = 0;
                aVar.f24017H = 1;
                objM118137a = c36845bMo13321a.m118137a(c32236aM44445Y, aVar);
                if (objM118137a == enumC31071a) {
                    return enumC31071a;
                }
                c6012r = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6012r = (C6012r) aVar.f24021z;
                str = (String) aVar.f24019x;
                AbstractC34132o.m107864I(objM118137a);
            }
            return c6012r.m18043e((AnyScreenTemplate) objM118137a, str);
        } catch (ContentConvertException e5) {
            this.logger.mo85230v(AbstractC11895b.m31996o("Deeplink ", str, " resolved to an undeserializable body"), e5, new AbstractC30556a.a[0]);
            return InterfaceC9596c.a.f28127a;
        } catch (SerializationException e13) {
            this.logger.mo85230v(AbstractC11895b.m31996o("Deeplink ", str, " resolved to an undeserializable body"), e13, new AbstractC30556a.a[0]);
            return InterfaceC9596c.a.f28127a;
        }
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC9596c m18043e(AnyScreenTemplate anyScreenTemplate, String str) {
        ScreenTemplate template = anyScreenTemplate != null ? anyScreenTemplate.getTemplate() : null;
        NavigationTemplate navigationTemplate = template instanceof NavigationTemplate ? (NavigationTemplate) template : null;
        if (navigationTemplate == null) {
            this.logger.mo85222m(AbstractC31061c.m95640p("Deeplink ", str, " did not resolve: ", (template == null || template.equals(UnknownTemplate.INSTANCE)) ? "the body could not be decoded as a template. Check the top level \"type\" is \"NAVIGATE\" and that \"content\" is present" : AbstractC11895b.m31996o("it decoded as ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(template.getClass()).getSimpleName(), ", expected NAVIGATE")), new AbstractC30556a.a[0]);
            return InterfaceC9596c.a.f28127a;
        }
        C9598e destination = navigationTemplate.getDestination();
        if (!AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            return new InterfaceC9596c.d(destination);
        }
        this.logger.mo85222m(AbstractC11895b.m31996o("Deeplink ", str, " resolved to a screen unknown to this build"), new AbstractC30556a.a[0]);
        return InterfaceC9596c.a.f28127a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m18044f(InterfaceC34385a<? extends AbstractC14155c> interfaceC34385a, String str, InterfaceC30057d<? super InterfaceC9596c> interfaceC30057d) {
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return m18042d((AbstractC14155c) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), str, interfaceC30057d);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.a.C42431a) {
            this.logger.mo85222m(AbstractC11895b.m31996o("Deeplink ", str, " resolved to an undeserializable body"), new AbstractC30556a.a[0]);
            return InterfaceC9596c.a.f28127a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            InterfaceC34385a.b.a aVar = (InterfaceC34385a.b.a) interfaceC34385a;
            return aVar.getErrorCode() == C18183v.f70529h.f70530a ? InterfaceC9596c.b.f28128a : new InterfaceC9596c.e(aVar.getErrorCode());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return InterfaceC9596c.f.f28132a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // j02.InterfaceC21156n
    /* JADX INFO: renamed from: a */
    public Object mo18045a(String str, String str2, InterfaceC30057d<? super InterfaceC9596c> interfaceC30057d) {
        b bVar;
        long j7;
        long j13;
        String str3 = str;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f24025H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f24025H = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f24023F;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar2.f24025H;
        if (i14 != 0) {
            if (i14 == 1) {
                j7 = bVar2.f24022E;
                str3 = (String) bVar2.f24026w;
                AbstractC34132o.m107864I(objM108729b);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = bVar2.f24022E;
                str3 = (String) bVar2.f24026w;
                AbstractC34132o.m107864I(objM108729b);
            }
            this.logger.mo85216g(AbstractC11266d.m30457k((this.nanoClock.mo42899a() - j13) / ((long) DurationKt.NANOS_IN_MILLIS), "ms", AbstractC11895b.m32001t("deeplink-migration: resolve name=", str3, " outcome=", AbstractC6013s.m18048c((InterfaceC9596c) objM108729b), " in ")), new AbstractC30556a.a[0]);
            return objM108729b;
        }
        AbstractC34132o.m107864I(objM108729b);
        DeeplinkResolveRequest deeplinkResolveRequest = new DeeplinkResolveRequest(str3, AbstractC6013s.m18049d(str2));
        this.logger.mo85216g("deeplink-migration: GET " + deeplinkResolveRequest.getPath() + " params=" + deeplinkResolveRequest.getParameters().keySet() + " timeout=800ms", new AbstractC30556a.a[0]);
        long jMo42899a = this.nanoClock.mo42899a();
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        String strM30461o = AbstractC11266d.m30461o("Failed to resolve deeplink ", str3);
        c cVar = new c(deeplinkResolveRequest, null);
        bVar2.f24026w = str3;
        bVar2.f24027x = null;
        bVar2.f24028y = null;
        bVar2.f24022E = jMo42899a;
        bVar2.f24025H = 1;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM30461o, cVar, bVar2, 2, null);
        if (objM108729b != obj) {
            j7 = jMo42899a;
        }
        return obj;
        bVar2.f24026w = str3;
        bVar2.f24027x = null;
        bVar2.f24028y = null;
        bVar2.f24029z = null;
        bVar2.f24022E = j7;
        bVar2.f24025H = 2;
        objM108729b = m18044f((InterfaceC34385a) objM108729b, str3, bVar2);
        if (objM108729b != obj) {
            j13 = j7;
            this.logger.mo85216g(AbstractC11266d.m30457k((this.nanoClock.mo42899a() - j13) / ((long) DurationKt.NANOS_IN_MILLIS), "ms", AbstractC11895b.m32001t("deeplink-migration: resolve name=", str3, " outcome=", AbstractC6013s.m18048c((InterfaceC9596c) objM108729b), " in ")), new AbstractC30556a.a[0]);
            return objM108729b;
        }
        return obj;
    }

    public /* synthetic */ C6012r(C34387c c34387c, InterfaceC34116n interfaceC34116n, InterfaceC14871g interfaceC14871g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TemplateDeeplinkResolver") : interfaceC34116n, (i13 & 4) != 0 ? new C14878n() : interfaceC14871g);
    }
}
