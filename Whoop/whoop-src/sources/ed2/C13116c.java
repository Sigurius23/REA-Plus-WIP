package ed2;

import a12.AbstractC0142b;
import a12.C0141a;
import cd2.C4447b;
import com.whoop.share.domain.GetShareRequest;
import com.whoop.share.model.ShareResponse;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fd2.EnumC14405c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ed2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Led2/c;", "Lod1/g;", "Led2/a;", "Led2/b;", "Lnm0/e;", "cachedApiSource", "Lcd2/b;", "shareAnalyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcd2/b;Ltr2/n;)V", "", "path", "Lec3/l;", "g", "(Ljava/lang/String;)Lec3/l;", "Lcom/whoop/share/model/ShareResponse;", "data", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/share/model/ShareResponse;)V", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lcd2/b;", "c", "Ltr2/n;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13116c implements InterfaceC27844g<AbstractC13114a, C13115b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4447b shareAnalyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ed2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.domain.ShareInteractor$fetchShareData$$inlined$cacheAPI$1", m100430f = "ShareInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f45359w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f45360x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f45361y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f45362z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f45362z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f45362z);
            aVar.f45360x = interfaceC13062m;
            aVar.f45361y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45359w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f45360x;
                C26832c c26832c = (C26832c) this.f45361y;
                InterfaceC26834e interfaceC26834e = this.f45362z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ShareResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ShareResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f45360x = null;
                this.f45361y = null;
                this.f45359w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ed2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f45363w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13116c f45364x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f45365y;

        /* JADX INFO: renamed from: ed2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f45366w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13116c f45367x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f45368y;

            /* JADX INFO: renamed from: ed2.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.share.domain.ShareInteractor$fetchShareData$$inlined$map$1$2", m100430f = "ShareInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41522a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f45369E;

                /* JADX INFO: renamed from: F */
                Object f45370F;

                /* JADX INFO: renamed from: G */
                Object f45371G;

                /* JADX INFO: renamed from: H */
                int f45372H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f45373w;

                /* JADX INFO: renamed from: x */
                int f45374x;

                /* JADX INFO: renamed from: y */
                Object f45375y;

                public C41522a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f45373w = obj;
                    this.f45374x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13116c c13116c, String str) {
                this.f45366w = interfaceC13062m;
                this.f45367x = c13116c;
                this.f45368y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41522a c41522a;
                C13115b c13115b;
                if (interfaceC30057d instanceof C41522a) {
                    c41522a = (C41522a) interfaceC30057d;
                    int i13 = c41522a.f45374x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41522a.f45374x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41522a = new C41522a(interfaceC30057d);
                    }
                } else {
                    c41522a = new C41522a(interfaceC30057d);
                }
                Object obj2 = c41522a.f45373w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41522a.f45374x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f45366w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c13115b = new C13115b(true, false, false, null, 14, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c13115b = new C13115b(false, false, true, null, 8, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        this.f45367x.m36677h((ShareResponse) c42173a.getData());
                        c13115b = new C13115b(false, false, false, (ShareResponse) c42173a.getData(), 4, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c13115b = new C13115b(false, false, false, (ShareResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), 4, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                        this.f45367x.logger.mo85222m(AbstractC2875y.m8300m("API fetch failure: request path=", this.f45368y, cVar.getHttpStatusCode() > 0 ? AbstractC2875y.m8295h(cVar.getHttpStatusCode(), ", HTTP status=") : "", ", error message=", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
                        this.f45367x.shareAnalyticsHelper.m13912c(EnumC14405c.FAILURE);
                        c13115b = new C13115b(false, true, false, null, 4, null);
                    }
                    c41522a.f45375y = null;
                    c41522a.f45369E = null;
                    c41522a.f45370F = null;
                    c41522a.f45371G = null;
                    c41522a.f45372H = 0;
                    c41522a.f45374x = 1;
                    if (interfaceC13062m.emit(c13115b, c41522a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C13116c c13116c, String str) {
            this.f45363w = interfaceC13058l;
            this.f45364x = c13116c;
            this.f45365y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f45363w.collect(new a(interfaceC13062m, this.f45364x, this.f45365y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ed2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.share.domain.ShareInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ShareInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f45377w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f45378x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f45379y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13116c f45380z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C13116c c13116c) {
            super(3, interfaceC30057d);
            this.f45380z = c13116c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC13114a abstractC13114a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f45380z);
            cVar.f45378x = interfaceC13062m;
            cVar.f45379y = abstractC13114a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45377w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f45378x;
                AbstractC13114a abstractC13114a = (AbstractC13114a) this.f45379y;
                if (!(abstractC13114a instanceof AbstractC13114a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM36676g = this.f45380z.m36676g(((AbstractC13114a.a) abstractC13114a).getPath());
                this.f45378x = null;
                this.f45379y = null;
                this.f45377w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36676g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC13114a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C13116c(InterfaceC26834e cachedApiSource, C4447b shareAnalyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(shareAnalyticsHelper, "shareAnalyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.shareAnalyticsHelper = shareAnalyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m36676g(String path) {
        C0141a c0141aM360e = AbstractC0142b.m360e(path);
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetShareRequest(c0141aM360e.getBasePath(), c0141aM360e.m354b()), 1), null, null, 3, null), new a(null, this.cachedApiSource)), this, path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: h */
    public final void m36677h(ShareResponse data) {
        String strM73374g;
        if (data != null && !data.getAssets().isEmpty()) {
            this.shareAnalyticsHelper.m13912c(EnumC14405c.SUCCESS);
            return;
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        if (data != null) {
            strM73374g = AbstractC25012a.m73374g(data.getAssets().size(), "title=", data.getTitle(), ", assets=");
            if (strM73374g == null) {
                strM73374g = "null";
            }
        } else {
            strM73374g = "null";
        }
        interfaceC34116n.mo85222m("Asset build failed: response summary=".concat(strM73374g), new AbstractC30556a.a[0]);
        this.shareAnalyticsHelper.m13912c(EnumC14405c.FAILURE);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }

    public /* synthetic */ C13116c(InterfaceC26834e interfaceC26834e, C4447b c4447b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c4447b, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ShareInteractor") : interfaceC34116n);
    }
}
