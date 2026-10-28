package v41;

import android.graphics.Typeface;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.C3060t1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import i51.AbstractC18123t;
import i51.C18120q;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25272z;
import p505ts.AbstractC34132o;
import p524ui.C34994v;
import p524ui.InterfaceC34997y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.C34826l0;

/* JADX INFO: renamed from: v41.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00070\u00052\u0006\u0010\t\u001a\u00020\u00062\u001e\u0010\f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00070\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130 2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b!\u0010\u001fJ:\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020\"2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010%H\u0086@¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020\"2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0004\b*\u0010+J,\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,0 2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b-\u0010\u001fR\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R(\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R(\u00107\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104R:\u00108\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0018\u00010 0\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00104R4\u00109\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,\u0018\u00010 0\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104¨\u0006:"}, m65681d2 = {"Lv41/q;", "", "<init>", "()V", "T", "", "", "Lbc3/i0;", "cache", "key", "Lkotlin/Function1;", "Lq83/d;", "block", "c", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lbc3/i0;", "Ll83/a0;", "d", "(Ljava/util/Map;Ljava/lang/String;)V", QueryParams.URL, "", "gradient", "b", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "V", "", "maxEntries", "g", "(I)Ljava/util/Map;", "Lud3/l0;", "client", "j", "(Ljava/lang/String;Lud3/l0;Lq83/d;)Ljava/lang/Object;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lv41/r0;", "lottieSource", "highlightGradient", "Lkotlin/Function0;", "okHttpClient", "Lui/y;", "f", "(Lv41/r0;Ljava/util/List;Lc93/a;Lq83/d;)Ljava/lang/Object;", "i", "(Lv41/r0;Ljava/util/List;)Lui/y;", "Landroid/graphics/Typeface;", "e", "Ltr2/n;", "Ltr2/n;", "logger", "Lbc3/c0;", "Lbc3/c0;", "scope", "Ljava/util/Map;", "rawCache", "Lui/v;", "specCache", "layersCache", "fontCache", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35686q {

    /* JADX INFO: renamed from: a */
    public static final C35686q f151704a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Map<String, InterfaceC3018i0> rawCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final Map<String, InterfaceC3018i0> specCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final Map<String, InterfaceC3018i0> layersCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final Map<String, InterfaceC3018i0> fontCache;

    /* JADX INFO: renamed from: h */
    public static final int f151711h;

    /* JADX INFO: renamed from: v41.q$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$cached$1$1", m100430f = "LottieJsonCache.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f151712w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f151713x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Map<String, InterfaceC3018i0> f151714y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f151715z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Map<String, InterfaceC3018i0> map, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151713x = function1;
            this.f151714y = map;
            this.f151715z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f151713x, this.f151714y, this.f151715z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super T> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f151712w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function1 function1 = this.f151713x;
                this.f151712w = 1;
                obj = function1.invoke(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Map<String, InterfaceC3018i0> map = this.f151714y;
            String str = this.f151715z;
            if (obj == null) {
                C35686q.f151704a.m113065d(map, str);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: v41.q$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache", m100430f = "LottieJsonCache.kt", m100431l = {131}, m100432m = "fontMap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f151716E;

        /* JADX INFO: renamed from: w */
        Object f151717w;

        /* JADX INFO: renamed from: x */
        Object f151718x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f151719y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f151719y = obj;
            this.f151716E |= Integer.MIN_VALUE;
            return C35686q.this.m113067e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: v41.q$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$fontMap$2", m100430f = "LottieJsonCache.kt", m100431l = {127, 128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "", "", "Landroid/graphics/Typeface;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        Object f151721w;

        /* JADX INFO: renamed from: x */
        int f151722x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f151723y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34826l0 f151724z;

        /* JADX INFO: renamed from: v41.q$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$fontMap$2$1", m100430f = "LottieJsonCache.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "", "", "Landroid/graphics/Typeface;", "<anonymous>", "(Lbc3/c0;)Ljava/util/Map;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f151725w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f151726x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f151726x = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f151726x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Map<String, ? extends Typeface>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f151725w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return AbstractC35688r.m113121a(this.f151726x);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, C34826l0 c34826l0, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f151723y = str;
            this.f151724z = c34826l0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f151723y, this.f151724z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f151722x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C35686q c35686q = C35686q.f151704a;
                String str = this.f151723y;
                C34826l0 c34826l0 = this.f151724z;
                this.f151722x = 1;
                obj = c35686q.m113071j(str, c34826l0, this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str2 = (String) obj;
            if (str2 == null) {
                return null;
            }
            C22365e c22365e = AbstractC3050q0.f12077a;
            a aVar = new a(str2, null);
            this.f151721w = null;
            this.f151722x = 2;
            Object objM8705K = AbstractC3006f0.m8705K(c22365e, aVar, this);
            return objM8705K == enumC31071a ? enumC31071a : objM8705K;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super Map<String, ? extends Typeface>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: v41.q$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$gradientSpec$2", m100430f = "LottieJsonCache.kt", m100431l = {88, 90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lui/v;", "<anonymous>", "()Lui/v;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C34826l0 f151727E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ List<String> f151728F;

        /* JADX INFO: renamed from: w */
        Object f151729w;

        /* JADX INFO: renamed from: x */
        Object f151730x;

        /* JADX INFO: renamed from: y */
        int f151731y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f151732z;

        /* JADX INFO: renamed from: v41.q$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$gradientSpec$2$1", m100430f = "LottieJsonCache.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lui/v;", "<anonymous>", "(Lbc3/c0;)Lui/v;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f151733w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f151734x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int[] f151735y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, int[] iArr, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f151734x = str;
                this.f151735y = iArr;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f151734x, this.f151735y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C34994v> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f151733w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                String jsonString = AbstractC18123t.m52044c(this.f151734x, this.f151735y);
                AbstractC22676k.m65750j(jsonString, "jsonString");
                return new C34994v(jsonString);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C34826l0 c34826l0, List<String> list, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f151732z = str;
            this.f151727E = c34826l0;
            this.f151728F = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f151732z, this.f151727E, this.f151728F, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f151731y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C35686q c35686q = C35686q.f151704a;
                String str = this.f151732z;
                C34826l0 c34826l0 = this.f151727E;
                this.f151731y = 1;
                obj = c35686q.m113071j(str, c34826l0, this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str2 = (String) obj;
            if (str2 == null) {
                return null;
            }
            List<String> list = this.f151728F;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Integer numM52042a = AbstractC18123t.m52042a((String) it.next());
                if (numM52042a != null) {
                    arrayList.add(numM52042a);
                }
            }
            int[] iArrM74091C1 = AbstractC25265s.m74091C1(arrayList);
            C22365e c22365e = AbstractC3050q0.f12077a;
            a aVar = new a(str2, iArrM74091C1, null);
            this.f151729w = null;
            this.f151730x = null;
            this.f151731y = 2;
            Object objM8705K = AbstractC3006f0.m8705K(c22365e, aVar, this);
            return objM8705K == enumC31071a ? enumC31071a : objM8705K;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C34994v> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: v41.q$e */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u0003J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"v41/q$e", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e<V> extends LinkedHashMap<String, V> {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ int f151736w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i13) {
            super(16, 0.75f, true);
            this.f151736w = i13;
        }

        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean m113072a(String str) {
            return super.containsKey(str);
        }

        /* JADX INFO: renamed from: b */
        public /* bridge */ Object m113073b(String str) {
            return super.get(str);
        }

        /* JADX INFO: renamed from: c */
        public /* bridge */ Set<Map.Entry<String, Object>> m113074c() {
            return super.entrySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return m113072a((String) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public /* bridge */ Set<String> m113075d() {
            return super.keySet();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public /* bridge */ Object m113076e(String str, Object obj) {
            return super.getOrDefault(str, obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, V>> entrySet() {
            return (Set<Map.Entry<String, V>>) m113074c();
        }

        /* JADX INFO: renamed from: g */
        public /* bridge */ int m113077g() {
            return super.size();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ V get(Object obj) {
            if (obj instanceof String) {
                return (V) m113073b((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ V getOrDefault(Object obj, V v13) {
            return !(obj instanceof String) ? v13 : (V) m113076e((String) obj, v13);
        }

        /* JADX INFO: renamed from: h */
        public /* bridge */ Collection<Object> m113078h() {
            return super.values();
        }

        /* JADX INFO: renamed from: i */
        public /* bridge */ Object m113079i(String str) {
            return super.remove(str);
        }

        /* JADX INFO: renamed from: j */
        public /* bridge */ boolean m113080j(String str, Object obj) {
            return super.remove(str, obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return m113075d();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ V remove(Object obj) {
            if (obj instanceof String) {
                return (V) m113079i((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, ? extends V> eldest) {
            AbstractC22676k.m65750j(eldest, "eldest");
            return size() > this.f151736w;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m113077g();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<V> values() {
            return (Collection<V>) m113078h();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof String) {
                return m113080j((String) obj, obj2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: v41.q$f */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache", m100430f = "LottieJsonCache.kt", m100431l = {72}, m100432m = "overlayLayers", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f151737E;

        /* JADX INFO: renamed from: w */
        Object f151738w;

        /* JADX INFO: renamed from: x */
        Object f151739x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f151740y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f151740y = obj;
            this.f151737E |= Integer.MIN_VALUE;
            return C35686q.this.m113069h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: v41.q$g */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$overlayLayers$2", m100430f = "LottieJsonCache.kt", m100431l = {68, 69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "", "", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        Object f151742w;

        /* JADX INFO: renamed from: x */
        int f151743x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f151744y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34826l0 f151745z;

        /* JADX INFO: renamed from: v41.q$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$overlayLayers$2$1", m100430f = "LottieJsonCache.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "", "", "", "<anonymous>", "(Lbc3/c0;)Ljava/util/Map;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f151746w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f151747x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f151747x = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f151747x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Map<String, ? extends List<String>>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f151746w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return C18120q.INSTANCE.m52025b(this.f151747x);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, C34826l0 c34826l0, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f151744y = str;
            this.f151745z = c34826l0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f151744y, this.f151745z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f151743x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C35686q c35686q = C35686q.f151704a;
                String str = this.f151744y;
                C34826l0 c34826l0 = this.f151745z;
                this.f151743x = 1;
                obj = c35686q.m113071j(str, c34826l0, this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str2 = (String) obj;
            if (str2 == null) {
                return null;
            }
            C22365e c22365e = AbstractC3050q0.f12077a;
            a aVar = new a(str2, null);
            this.f151742w = null;
            this.f151743x = 2;
            Object objM8705K = AbstractC3006f0.m8705K(c22365e, aVar, this);
            return objM8705K == enumC31071a ? enumC31071a : objM8705K;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super Map<String, ? extends List<String>>> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: v41.q$h */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.LottieJsonCache$rawJson$2", m100430f = "LottieJsonCache.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f151748w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f151749x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34826l0 f151750y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, C34826l0 c34826l0, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f151749x = str;
            this.f151750y = c34826l0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f151749x, this.f151750y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f151748w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.f151749x;
            C34826l0 c34826l0 = this.f151750y;
            this.f151748w = 1;
            Object objM113087G = AbstractC35687q0.m113087G(str, c34826l0, null, this, 4, null);
            return objM113087G == enumC31071a ? enumC31071a : objM113087G;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super String> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    static {
        C35686q c35686q = new C35686q();
        f151704a = c35686q;
        logger = InterfaceC34116n.INSTANCE.m107848a("LottieJsonCache");
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C22365e c22365e = AbstractC3050q0.f12077a;
        scope = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, ExecutorC22364d.f87316w));
        rawCache = c35686q.m113066g(32);
        specCache = c35686q.m113066g(32);
        layersCache = c35686q.m113066g(32);
        fontCache = c35686q.m113066g(32);
        f151711h = 8;
    }

    private C35686q() {
    }

    /* JADX INFO: renamed from: b */
    private final String m113063b(String url, List<String> gradient) {
        return AbstractC18489d0.m53370k(url, "|", AbstractC25265s.m74110N0(gradient, ",", null, null, null, 62));
    }

    /* JADX INFO: renamed from: c */
    private final synchronized <T> InterfaceC3018i0 m113064c(Map<String, InterfaceC3018i0> cache, String key, Function1 block) {
        InterfaceC3018i0 interfaceC3018i0M8711e;
        try {
            interfaceC3018i0M8711e = cache.get(key);
            if (interfaceC3018i0M8711e == null) {
                interfaceC3018i0M8711e = AbstractC3006f0.m8711e(scope, null, new a(block, cache, key, null), 3);
                cache.put(key, interfaceC3018i0M8711e);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return interfaceC3018i0M8711e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final synchronized <T> void m113065d(Map<String, InterfaceC3018i0> cache, String key) {
        cache.remove(key);
    }

    /* JADX INFO: renamed from: g */
    private final <V> Map<String, V> m113066g(int maxEntries) {
        return new e(maxEntries);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m113067e(String str, C34826l0 c34826l0, InterfaceC30057d<? super Map<String, ? extends Typeface>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f151716E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f151716E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objAwait = bVar.f151719y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f151716E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            InterfaceC3018i0 interfaceC3018i0M113064c = m113064c(fontCache, str, new c(str, c34826l0, null));
            bVar.f151717w = null;
            bVar.f151718x = null;
            bVar.f151716E = 1;
            objAwait = interfaceC3018i0M113064c.await(bVar);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
        }
        Map map = (Map) objAwait;
        return map == null ? C25272z.f99163w : map;
    }

    /* JADX INFO: renamed from: f */
    public final Object m113068f(InterfaceC35689r0 interfaceC35689r0, List<String> list, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super InterfaceC34997y> interfaceC30057d) {
        C34826l0 c34826l0;
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return AbstractC35684p.m113060u(interfaceC35689r0);
        }
        String str = interfaceC35689r0 instanceof InterfaceC35689r0.e ? ((InterfaceC35689r0.e) interfaceC35689r0).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String() : null;
        if (str == null || interfaceC4339a == null || (c34826l0 = (C34826l0) interfaceC4339a.invoke()) == null) {
            return null;
        }
        return m113064c(specCache, m113063b(str, list), new d(str, c34826l0, list, null)).await(interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m113069h(String str, C34826l0 c34826l0, InterfaceC30057d<? super Map<String, ? extends List<String>>> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f151737E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f151737E = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objAwait = fVar.f151740y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f151737E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            InterfaceC3018i0 interfaceC3018i0M113064c = m113064c(layersCache, str, new g(str, c34826l0, null));
            fVar.f151738w = null;
            fVar.f151739x = null;
            fVar.f151737E = 1;
            objAwait = interfaceC3018i0M113064c.await(fVar);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
        }
        Map map = (Map) objAwait;
        return map == null ? C25272z.f99163w : map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final synchronized InterfaceC34997y m113070i(InterfaceC35689r0 lottieSource, List<String> highlightGradient) {
        AbstractC22676k.m65750j(lottieSource, "lottieSource");
        List<String> list = highlightGradient;
        if (list != null && !list.isEmpty()) {
            InterfaceC34997y interfaceC34997y = null;
            String str = lottieSource instanceof InterfaceC35689r0.e ? ((InterfaceC35689r0.e) lottieSource).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String() : null;
            if (str == null) {
                return null;
            }
            InterfaceC3018i0 interfaceC3018i0 = specCache.get(m113063b(str, highlightGradient));
            if (interfaceC3018i0 == 0) {
                return null;
            }
            C3060t1 c3060t1 = (C3060t1) interfaceC3018i0;
            if (c3060t1.isCompleted() && !c3060t1.isCancelled()) {
                interfaceC34997y = (InterfaceC34997y) interfaceC3018i0.m8741b();
            }
            return interfaceC34997y;
        }
        return AbstractC35684p.m113060u(lottieSource);
    }

    /* JADX INFO: renamed from: j */
    public final Object m113071j(String str, C34826l0 c34826l0, InterfaceC30057d<? super String> interfaceC30057d) {
        return m113064c(rawCache, str, new h(str, c34826l0, null)).await(interfaceC30057d);
    }
}
