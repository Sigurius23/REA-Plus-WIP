package no0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4351m;
import com.mapbox.common.MapboxServices;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gb1.AbstractC15674c;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import hy0.C17749h0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.WeakHashMap;
import js2.C21927e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import lo0.C24571b0;
import lo0.InterfaceC24615z;
import n01.C26088e;
import n01.C26089f;
import n72.C26439b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22940b2;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import p718lz1.C24823a;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: no0.n0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Llo0/b0$b$e;", "viewState", "Lkotlin/Function1;", "Llo0/z;", "Ll83/a0;", "onEvent", "l", "(Llo0/b0$b$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhy0/h0;", "headerImage", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lc41/p2;", "disclaimer", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lhy0/h0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/p2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lc31/k;", "progressState", "y", "(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "searchQuery", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26962n0 {

    /* JADX INFO: renamed from: no0.n0$a */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingStateSelectScreenContentKt$ClinicianVideoSchedulingStateSelectScreenContent$2$1", m100430f = "ClinicianVideoSchedulingStateSelectScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107558w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24571b0.b.e f107559x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f107560y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C24571b0.b.e eVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107559x = eVar;
            this.f107560y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f107559x, this.f107560y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107558w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC28601c1 interfaceC28601c1 = this.f107560y;
            String strM71854b = this.f107559x.getSearchField().getText();
            if (strM71854b == null) {
                strM71854b = "";
            }
            AbstractC26962n0.m80713o(interfaceC28601c1, strM71854b);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.n0$b */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingStateSelectScreenContentKt$ClinicianVideoSchedulingStateSelectScreenContent$3$1", m100430f = "ClinicianVideoSchedulingStateSelectScreenContent.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107561w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f107562x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39171c f107563y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26068u f107564z;

        /* JADX INFO: renamed from: no0.n0$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C26068u f107565w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC39171c f107566x;

            public a(C26068u c26068u, InterfaceC39171c interfaceC39171c) {
                this.f107565w = c26068u;
                this.f107566x = interfaceC39171c;
            }

            /* JADX INFO: renamed from: b */
            public final Object m80727b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objM77563f = this.f107565w.m77563f(1, this.f107566x.mo724F(3 * 8), interfaceC30057d);
                return objM77563f == EnumC31071a.f128113w ? objM77563f : C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m80727b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: no0.n0$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42072b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f107567w;

            /* JADX INFO: renamed from: no0.n0$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f107568w;

                /* JADX INFO: renamed from: no0.n0$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingStateSelectScreenContentKt$ClinicianVideoSchedulingStateSelectScreenContent$3$1$invokeSuspend$$inlined$filter$1$2", m100430f = "ClinicianVideoSchedulingStateSelectScreenContent.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42073a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f107570F;

                    /* JADX INFO: renamed from: G */
                    Object f107571G;

                    /* JADX INFO: renamed from: H */
                    int f107572H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f107573w;

                    /* JADX INFO: renamed from: x */
                    int f107574x;

                    /* JADX INFO: renamed from: y */
                    Object f107575y;

                    /* JADX INFO: renamed from: z */
                    Object f107576z;

                    public C42073a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f107573w = obj;
                        this.f107574x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f107568w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42073a c42073a;
                    if (interfaceC30057d instanceof C42073a) {
                        c42073a = (C42073a) interfaceC30057d;
                        int i13 = c42073a.f107574x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42073a.f107574x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42073a = new C42073a(interfaceC30057d);
                        }
                    } else {
                        c42073a = new C42073a(interfaceC30057d);
                    }
                    Object obj2 = c42073a.f107573w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42073a.f107574x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f107568w;
                        if (((Boolean) obj).booleanValue()) {
                            c42073a.f107575y = null;
                            c42073a.f107576z = null;
                            c42073a.f107570F = null;
                            c42073a.f107571G = null;
                            c42073a.f107572H = 0;
                            c42073a.f107574x = 1;
                            if (interfaceC13062m.emit(obj, c42073a) == enumC31071a) {
                                return enumC31071a;
                            }
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

            public C42072b(InterfaceC13058l interfaceC13058l) {
                this.f107567w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f107567w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c, C26068u c26068u, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107562x = interfaceC28670t2;
            this.f107563y = interfaceC39171c;
            this.f107564z = c26068u;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m80726h(InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c) {
            return ((InterfaceC22940b2) interfaceC28670t2.getValue()).mo43079c(interfaceC39171c) > 0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f107562x, this.f107563y, this.f107564z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107561w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C42072b c42072b = new C42072b(AbstractC13091v.m36612v(AbstractC13091v.m36610t(AbstractC28683x.m87240H(new C26964o0(0, this.f107562x, this.f107563y))), 1));
                a aVar = new a(this.f107564z, this.f107563y);
                this.f107561w = 1;
                if (c42072b.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m80697A(Modifier modifier, C3927k c3927k, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80723y(modifier, c3927k, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:107:0x025b  */
    /* JADX WARN: Code duplicated, block: B:109:0x028a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0294  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x020b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0212  */
    /* JADX WARN: Code duplicated, block: B:98:0x0214  */
    /* JADX INFO: renamed from: l */
    public static final void m80710l(C24571b0.b.e viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int i16;
        boolean z13;
        Object objM87133R2;
        C26068u c26068uM77569a;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        InterfaceC39171c interfaceC39171c;
        boolean zM87153g;
        Object objM87133R3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        boolean z14;
        int iHashCode2;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R4;
        Function1 function5;
        C3927k c3927kM71745e;
        String strM71854b;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(683068232);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C26439b(26);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    strM71854b = viewState.getSearchField().getText();
                    if (strM71854b == null) {
                        strM71854b = "";
                    }
                    objM87133R = AbstractC28683x.m87272z(strM71854b);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                String strM71854b2 = viewState.getSearchField().getText();
                i16 = i15 & 14;
                if (i16 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, strM71854b2);
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(C22949e.m66712e(c28655q).f90556c, c28655q);
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC39171c) | c28655q.m87153g(c26068uM77569a);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new b(interfaceC28601c1M87238F, interfaceC39171c, c26068uM77569a, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c26068uM77569a);
                c2314t = C2314t.f9131w;
                float f13 = 4;
                Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f13 * f13, 0.0f, 2)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i17 = i15;
                } else {
                    i17 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    if (1.0f > 0.0d) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM124374d);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    float f14 = 8;
                    Modifier modifierM44081e = AbstractC15674c.m44081e(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 10 * f14, 7), 0.0f, null, 3, null), AbstractC26973t.m80810a());
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 2 * f14, 0.0f, 6 * f14, 5);
                    if (i16 != 4 || ((i17 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i17 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objM87133R4 = c28655q.m87133R();
                    if (z17 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C26954j0((Object) viewState, (Object) interfaceC28601c1, function4, 1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = function4;
                    AbstractC22674j.m65717c(modifierM44081e, c26068uM77569a, c22976l1M3381c, null, null, null, false, null, (Function1) objM87133R4, c28655q, 384, 504);
                    c3927kM71745e = viewState.getProgressButton();
                    if (c3927kM71745e == null) {
                        c28655q.m87150e0(1287670954);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1287670955);
                        m80723y(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), c3927kM71745e, function5, c28655q, (C3927k.f16020r << 3) | ((i17 << 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d2 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM124374d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                float f15 = 8;
                Modifier modifierM44081e2 = AbstractC15674c.m44081e(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 10 * f15, 7), 0.0f, null, 3, null), AbstractC26973t.m80810a());
                C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(0.0f, 2 * f15, 0.0f, 6 * f15, 5);
                if (i16 != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if ((i17 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    objM87133R4 = new C26954j0((Object) viewState, (Object) interfaceC28601c1, function4, 1);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26954j0((Object) viewState, (Object) interfaceC28601c1, function4, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                function5 = function4;
                AbstractC22674j.m65717c(modifierM44081e2, c26068uM77569a, c22976l1M3381c2, null, null, null, false, null, (Function1) objM87133R4, c28655q, 384, 504);
                c3927kM71745e = viewState.getProgressButton();
                if (c3927kM71745e == null) {
                    c28655q.m87150e0(1287670954);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1287670955);
                    m80723y(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), c3927kM71745e, function5, c28655q, (C3927k.f16020r << 3) | ((i17 << 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24671c(viewState, i13, function3, i14, 28);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C26439b(26);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                strM71854b = viewState.getSearchField().getText();
                if (strM71854b == null) {
                    strM71854b = "";
                }
                objM87133R = AbstractC28683x.m87272z(strM71854b);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            String strM71854b3 = viewState.getSearchField().getText();
            i16 = i15 & 14;
            if (i16 != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new a(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, strM71854b3);
            c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            WeakHashMap weakHashMap2 = C22944c2.f90553v;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(C22949e.m66712e(c28655q).f90556c, c28655q);
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC39171c) | c28655q.m87153g(c26068uM77569a);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new b(interfaceC28601c1M87238F, interfaceC39171c, c26068uM77569a, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(interfaceC28601c1M87238F, interfaceC39171c, c26068uM77569a, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c26068uM77569a);
            c2314t = C2314t.f9131w;
            float f16 = 4;
            Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f16 * f16, 0.0f, 2)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i17 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d3 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM124374d3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                float f17 = 8;
                Modifier modifierM44081e3 = AbstractC15674c.m44081e(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 10 * f17, 7), 0.0f, null, 3, null), AbstractC26973t.m80810a());
                C22976l1 c22976l1M3381c3 = AbstractC1099a.m3381c(0.0f, 2 * f17, 0.0f, 6 * f17, 5);
                if (i16 != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if ((i17 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    objM87133R4 = new C26954j0((Object) viewState, (Object) interfaceC28601c1, function4, 1);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C26954j0((Object) viewState, (Object) interfaceC28601c1, function4, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                function5 = function4;
                AbstractC22674j.m65717c(modifierM44081e3, c26068uM77569a, c22976l1M3381c3, null, null, null, false, null, (Function1) objM87133R4, c28655q, 384, 504);
                c3927kM71745e = viewState.getProgressButton();
                if (c3927kM71745e == null) {
                    c28655q.m87150e0(1287670954);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1287670955);
                    m80723y(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), c3927kM71745e, function5, c28655q, (C3927k.f16020r << 3) | ((i17 << 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                i17 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM124374d4 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM124374d4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            float f18 = 8;
            Modifier modifierM44081e4 = AbstractC15674c.m44081e(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 10 * f18, 7), 0.0f, null, 3, null), AbstractC26973t.m80810a());
            C22976l1 c22976l1M3381c4 = AbstractC1099a.m3381c(0.0f, 2 * f18, 0.0f, 6 * f18, 5);
            if (i16 != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            if ((i17 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z15 | z16;
            objM87133R4 = c28655q.m87133R();
            if (z17) {
                objM87133R4 = new C26954j0((Object) viewState, (Object) interfaceC28601c1, function4, 1);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C26954j0((Object) viewState, (Object) interfaceC28601c1, function4, 1);
                c28655q.m87172p0(objM87133R4);
            }
            function5 = function4;
            AbstractC22674j.m65717c(modifierM44081e4, c26068uM77569a, c22976l1M3381c4, null, null, null, false, null, (Function1) objM87133R4, c28655q, 384, 504);
            c3927kM71745e = viewState.getProgressButton();
            if (c3927kM71745e == null) {
                c28655q.m87150e0(1287670954);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1287670955);
                m80723y(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), c3927kM71745e, function5, c28655q, (C3927k.f16020r << 3) | ((i17 << 3) & 896), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(viewState, i13, function3, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m80711m(InterfaceC24615z it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final String m80712n(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m80713o(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m80714p(C24571b0.b.e eVar, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, "header", new C37816b(new C24823a(eVar, 3), true, -443219815), 2);
        InterfaceC26064q.m77556b(LazyColumn, MapboxServices.SEARCH, new C37816b(new C26956k0(1, eVar, interfaceC28601c1), true, -1066201392), 2);
        InterfaceC26064q.m77556b(LazyColumn, "states", new C37816b(new C26949h((Object) eVar, function1, (Object) interfaceC28601c1, 2), true, -1890012207), 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m80715q(C24571b0.b.e eVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C17749h0 c17749h0M71744d = eVar.getHeaderImage();
            TextResource textResourceM71749i = eVar.getTitle();
            TextResource textResourceM71748h = eVar.getSubtitle();
            C4092p2 c4092p2M71743c = eVar.getDisclaimer();
            int i14 = C17749h0.f69004h;
            int i15 = TextResource.$stable;
            m80721w(c17749h0M71744d, textResourceM71749i, textResourceM71748h, c4092p2M71743c, c28655q, i14 | (i15 << 3) | (i15 << 6) | (C4092p2.f16593v << 9));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m80716r(C24571b0.b.e eVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 3 * 8, 0.0f, 0.0f, 13);
            TextResource textResourceM21267a = m80712n(interfaceC28601c1).length() == 0 ? AbstractC8693b.m21267a() : AbstractC8693b.m21278l(m80712n(interfaceC28601c1));
            String strM71853a = eVar.getSearchField().getPlaceholder();
            if (strM71853a == null) {
                strM71853a = "";
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l(strM71853a);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C21927e(21, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            int i14 = TextResource.$stable;
            AbstractC17795v0.m51127j(modifierM3398t, textResourceM21267a, textResourceM21278l, null, 0L, 0, false, null, 0L, false, null, false, false, null, function1, c28655q, (i14 << 3) | 6 | (i14 << 6), 24576, 16376);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m80717s(InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.c) {
            m80713o(interfaceC28601c1, ((AbstractC17801x0.c) event).getNewText());
        } else if (event.equals(AbstractC17801x0.a.f69231a)) {
            m80713o(interfaceC28601c1, "");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m80718t(C24571b0.b.e eVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM80712n = m80712n(interfaceC28601c1);
            C26088e c26088eM71747g = eVar.getStatesList();
            boolean zM87157i = c28655q.m87157i(eVar) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C26941d(eVar, function1, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC26934a1.m80421c(strM80712n, c26088eM71747g, (Function1) objM87133R, null, c28655q, C26088e.f103319h << 3, 8);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m80719u(C24571b0.b.e eVar, Function1 function1, List selectedIds) {
        AbstractC22676k.m65750j(selectedIds, "selectedIds");
        function1.invoke(new InterfaceC24615z.e(new C26089f(eVar.getStatesList().getId(), selectedIds), eVar.getStatesList()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m80720v(C24571b0.b.e eVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80710l(eVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m80721w(C17749h0 c17749h0, TextResource textResource, TextResource textResource2, C4092p2 c4092p2, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        int i15;
        boolean z4;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-892092942);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c17749h0) : c28655q.m87157i(c17749h0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c4092p2) : c28655q.m87157i(c4092p2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (c17749h0 == null) {
                c28655q.m87150e0(-1026264715);
                c28655q.m87173q(false);
                i15 = i16;
                z4 = false;
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(-1026264714);
                c2314t = c2314t2;
                i15 = i16;
                z4 = false;
                c28655q = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c17749h0.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t), C2299e.f9117z, C39102j.f168200b, 0.0f, null, c28655q, 28080, 96);
                c28655q.m87173q(false);
            }
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4 * f13, 0.0f, 0.0f, 13);
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, ((i15 >> 3) & 14) | i17);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            C2886a c2886aM8416N = c38072d.m121952e(c28655q, i18).getT1();
            long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
            int i19 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            C2314t c2314t3 = c2314t;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q2, 48, i19, 196600);
            c28655q = c28655q2;
            if (textResource2 == null) {
                c28655q.m87150e0(-1025687185);
                c28655q.m87173q(z4);
                z13 = true;
            } else {
                c28655q.m87150e0(-1025687184);
                z13 = true;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, i17), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, 1 * f13, 1), c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 48, i19, 196088);
                c28655q.m87173q(z4);
            }
            if (c4092p2 == null) {
                c2314t3 = c2314t3;
                c28655q = c28655q;
                c28655q.m87150e0(-1025343612);
                c28655q.m87173q(z4);
            } else {
                c2314t3 = c2314t3;
                c28655q = c28655q;
                c28655q.m87150e0(-1025343611);
                AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t3, 0.0f, 2 * f13, 0.0f, 0.0f, 13), c4092p2, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(c17749h0, textResource, textResource2, c4092p2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m80722x(C17749h0 c17749h0, TextResource textResource, TextResource textResource2, C4092p2 c4092p2, int i13, Composer composer, int i14) {
        m80721w(c17749h0, textResource, textResource2, c4092p2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m80723y(Modifier modifier, C3927k c3927k, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(541738977);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c3927k) : c28655q.m87157i(c3927k) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 8;
            float f14 = 4 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, 2 * f13, f14, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            boolean z4 = (i15 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C26957l(function1, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 3) & 14), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26981x(modifier3, c3927k, function1, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m80724z(Function1 function1, EnumC3919c click) {
        AbstractC22676k.m65750j(click, "click");
        function1.invoke(InterfaceC24615z.o.f96242a);
        return C23454a0.f92919a;
    }
}
