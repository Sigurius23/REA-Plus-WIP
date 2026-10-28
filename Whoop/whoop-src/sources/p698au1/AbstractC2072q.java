package p698au1;

import a20.C0167g;
import a81.C0555f;
import am2.C1020h;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.C13031e0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import java.util.WeakHashMap;
import kotlin.C1991b1;
import kotlin.C2012k;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p000.C22079k;
import p000.C22931l;
import p000.C29656q;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rs1.AbstractC31794f;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.C39274g;
import yt1.InterfaceC39768a;
import zt1.C41126a;
import zt1.C41127b;
import zt1.InterfaceC41128c;
import zt1.InterfaceC41129d;

/* JADX INFO: renamed from: au1.q */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001aS\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aG\u0010\u000e\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0001\u001a\u00020\r2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0016\u001a\u00020\u0003*\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lzt1/c;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onBack", "Lkotlin/Function1;", "Lzt1/d;", "onViewEvent", "Lyt1/a;", "onNavigation", "F", "(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/y;", "Lzt1/c$c;", "t", "(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ln0/u;", "", "buffer", "", "nextToken", "onLoadMore", "N", "(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "K", "(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2072q {

    /* JADX INFO: renamed from: au1.q$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f8207w = new a();

        /* JADX INFO: renamed from: a */
        public final long m6557a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m6557a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: au1.q$b */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.view.LabradorResultsScreenKt$OnBottomReached$1$1", m100430f = "LabradorResultsScreen.kt", m100431l = {196}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8208w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f8209x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f8210y;

        /* JADX INFO: renamed from: au1.q$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.view.LabradorResultsScreenKt$OnBottomReached$1$1$3", m100430f = "LabradorResultsScreen.kt", m100431l = {195}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f8211w;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f8211w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f8211w = 1;
                    if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
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

            public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: au1.q$b$b, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41290b<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC4339a f8212w;

            public C41290b(InterfaceC4339a interfaceC4339a) {
                this.f8212w = interfaceC4339a;
            }

            /* JADX INFO: renamed from: b */
            public final Object m6560b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f8212w.invoke();
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m6560b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: au1.q$b$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f8213w;

            /* JADX INFO: renamed from: au1.q$b$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f8214w;

                /* JADX INFO: renamed from: au1.q$b$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.view.LabradorResultsScreenKt$OnBottomReached$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "LabradorResultsScreen.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41291a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f8216F;

                    /* JADX INFO: renamed from: G */
                    Object f8217G;

                    /* JADX INFO: renamed from: H */
                    int f8218H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f8219w;

                    /* JADX INFO: renamed from: x */
                    int f8220x;

                    /* JADX INFO: renamed from: y */
                    Object f8221y;

                    /* JADX INFO: renamed from: z */
                    Object f8222z;

                    public C41291a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f8219w = obj;
                        this.f8220x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f8214w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41291a c41291a;
                    if (interfaceC30057d instanceof C41291a) {
                        c41291a = (C41291a) interfaceC30057d;
                        int i13 = c41291a.f8220x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41291a.f8220x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41291a = new C41291a(interfaceC30057d);
                        }
                    } else {
                        c41291a = new C41291a(interfaceC30057d);
                    }
                    Object obj2 = c41291a.f8219w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41291a.f8220x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f8214w;
                        if (((Boolean) obj).booleanValue()) {
                            c41291a.f8221y = null;
                            c41291a.f8222z = null;
                            c41291a.f8216F = null;
                            c41291a.f8217G = null;
                            c41291a.f8218H = 0;
                            c41291a.f8220x = 1;
                            if (interfaceC13062m.emit(obj, c41291a) == enumC31071a) {
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

            public c(InterfaceC13058l interfaceC13058l) {
                this.f8213w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f8213w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28670t2 interfaceC28670t2, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8209x = interfaceC28670t2;
            this.f8210y = interfaceC4339a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m6559h(InterfaceC28670t2 interfaceC28670t2) {
            return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f8209x, this.f8210y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8208w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            c cVar = new c(AbstractC28683x.m87240H(new C2073r(this.f8209x, 0)));
            a aVar = new a(null);
            C41290b c41290b = new C41290b(this.f8210y);
            this.f8208w = 1;
            Object objCollect = cVar.collect(new C13031e0(2, c41290b, aVar), this);
            if (objCollect != enumC31071a) {
                objCollect = c23454a0;
            }
            return objCollect == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m6515A(C41127b c41127b, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(item) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC2063h.m6497e(InterfaceC1103a.m3430a(item, C2314t.f9131w, 7), c41127b, function1, c28655q, TextResource.$stable << 3, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m6516B(Function1 function1, InterfaceC41128c.c cVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(item) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3430a = InterfaceC1103a.m3430a(item, AbstractC1102d.m3409f(1.0f, c2314t), 7);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3430a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 3 * 8, 0.0f, 0.0f, 13);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(cVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2071p(function1, cVar, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2060e.m6486d(modifierM3398t, (InterfaceC4339a) objM87133R, c28655q, 6, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m6517C(Function1 function1, InterfaceC41128c.c cVar) {
        function1.invoke(new InterfaceC41129d.a(cVar.getNextToken()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m6518D(Function1 function1, InterfaceC41128c.c cVar) {
        String strM133528f = cVar.getNextToken();
        AbstractC22676k.m65747g(strM133528f);
        function1.invoke(new InterfaceC41129d.d(strM133528f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m6519E(InterfaceC23013y interfaceC23013y, InterfaceC41128c.c cVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m6550t(interfaceC23013y, cVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x0102  */
    /* JADX WARN: Code duplicated, block: B:74:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0119  */
    /* JADX WARN: Code duplicated, block: B:79:0x0127  */
    /* JADX WARN: Code duplicated, block: B:82:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public static final void m6520F(InterfaceC41128c state, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function7;
        Function1 function8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function9;
        Function1 function10;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1379029409);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q2.m87157i(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function4 = function2;
                        if (c28655q2.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C2012k(2);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C1991b1(6);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function7 = (Function1) objM87133R2;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C1991b1(7);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function8 = (Function1) objM87133R;
                        } else {
                            function8 = function4;
                        }
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        c28655q = c28655q2;
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                        AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a5, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                        if (state.equals(InterfaceC41128c.a.f177292a)) {
                            c28655q.m87150e0(-117523074);
                            Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (state.equals(InterfaceC41128c.b.f177293a)) {
                                c28655q.m87150e0(-117519787);
                                AbstractC2068m.m6513b(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                if (state instanceof InterfaceC41128c.c) {
                                    throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                                }
                                c28655q.m87150e0(-117516972);
                                function9 = function7;
                                function10 = function8;
                                m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            function5 = function9;
                            function6 = function10;
                            interfaceC4339a3 = interfaceC4339a5;
                        }
                        function9 = function7;
                        function10 = function8;
                        c28655q.m87173q(true);
                        function5 = function9;
                        function6 = function10;
                        interfaceC4339a3 = interfaceC4339a5;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        interfaceC4339a3 = interfaceC4339a2;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
                    }
                }
                i15 |= 3072;
                function4 = function2;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2012k(2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C1991b1(6);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function7 = (Function1) objM87133R2;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C1991b1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t2));
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66724m2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                    AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t2), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                    if (state.equals(InterfaceC41128c.a.f177292a)) {
                        c28655q.m87150e0(-117523074);
                        Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (state.equals(InterfaceC41128c.b.f177293a)) {
                            c28655q.m87150e0(-117519787);
                            AbstractC2068m.m6513b(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (state instanceof InterfaceC41128c.c) {
                                throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                            }
                            c28655q.m87150e0(-117516972);
                            function9 = function7;
                            function10 = function8;
                            m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function5 = function9;
                        function6 = function10;
                        interfaceC4339a3 = interfaceC4339a6;
                    }
                    function9 = function7;
                    function10 = function8;
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                    interfaceC4339a3 = interfaceC4339a6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2012k(2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C1991b1(6);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function7 = (Function1) objM87133R2;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C1991b1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t3));
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM66724m3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                    AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t3), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a7, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                    if (state.equals(InterfaceC41128c.a.f177292a)) {
                        c28655q.m87150e0(-117523074);
                        Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (state.equals(InterfaceC41128c.b.f177293a)) {
                            c28655q.m87150e0(-117519787);
                            AbstractC2068m.m6513b(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (state instanceof InterfaceC41128c.c) {
                                throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                            }
                            c28655q.m87150e0(-117516972);
                            function9 = function7;
                            function10 = function8;
                            m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function5 = function9;
                        function6 = function10;
                        interfaceC4339a3 = interfaceC4339a7;
                    }
                    function9 = function7;
                    function10 = function8;
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                    interfaceC4339a3 = interfaceC4339a7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2012k(2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C1991b1(6);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C1991b1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function8 = (Function1) objM87133R;
                } else {
                    function8 = function4;
                }
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM66724m4 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t4));
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM66724m4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                c28655q = c28655q2;
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t4), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a8, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                if (state.equals(InterfaceC41128c.a.f177292a)) {
                    c28655q.m87150e0(-117523074);
                    Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                    c28655q.m87173q(false);
                } else {
                    if (state.equals(InterfaceC41128c.b.f177293a)) {
                        c28655q.m87150e0(-117519787);
                        AbstractC2068m.m6513b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (state instanceof InterfaceC41128c.c) {
                            throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                        }
                        c28655q.m87150e0(-117516972);
                        function9 = function7;
                        function10 = function8;
                        m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                    interfaceC4339a3 = interfaceC4339a8;
                }
                function9 = function7;
                function10 = function8;
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function10;
                interfaceC4339a3 = interfaceC4339a8;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q2.m87157i(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2012k(2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C1991b1(6);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function7 = (Function1) objM87133R2;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C1991b1(7);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    C2314t c2314t5 = C2314t.f9131w;
                    Modifier modifierM66724m5 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t5));
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM66724m5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
                    AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t5), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a9, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                    if (state.equals(InterfaceC41128c.a.f177292a)) {
                        c28655q.m87150e0(-117523074);
                        Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (state.equals(InterfaceC41128c.b.f177293a)) {
                            c28655q.m87150e0(-117519787);
                            AbstractC2068m.m6513b(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (state instanceof InterfaceC41128c.c) {
                                throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                            }
                            c28655q.m87150e0(-117516972);
                            function9 = function7;
                            function10 = function8;
                            m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function5 = function9;
                        function6 = function10;
                        interfaceC4339a3 = interfaceC4339a9;
                    }
                    function9 = function7;
                    function10 = function8;
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                    interfaceC4339a3 = interfaceC4339a9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2012k(2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C1991b1(6);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C1991b1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function8 = (Function1) objM87133R;
                } else {
                    function8 = function4;
                }
                C2314t c2314t6 = C2314t.f9131w;
                Modifier modifierM66724m6 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t6));
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM66724m6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                c28655q = c28655q2;
                InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t6), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a10, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                if (state.equals(InterfaceC41128c.a.f177292a)) {
                    c28655q.m87150e0(-117523074);
                    Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                    c28655q.m87173q(false);
                } else {
                    if (state.equals(InterfaceC41128c.b.f177293a)) {
                        c28655q.m87150e0(-117519787);
                        AbstractC2068m.m6513b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (state instanceof InterfaceC41128c.c) {
                            throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                        }
                        c28655q.m87150e0(-117516972);
                        function9 = function7;
                        function10 = function8;
                        m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                    interfaceC4339a3 = interfaceC4339a10;
                }
                function9 = function7;
                function10 = function8;
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function10;
                interfaceC4339a3 = interfaceC4339a10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2012k(2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C1991b1(6);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C1991b1(7);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function8 = (Function1) objM87133R;
                } else {
                    function8 = function4;
                }
                C2314t c2314t7 = C2314t.f9131w;
                Modifier modifierM66724m7 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t7));
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM66724m7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                c28655q = c28655q2;
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a4;
                AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t7), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a11, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                if (state.equals(InterfaceC41128c.a.f177292a)) {
                    c28655q.m87150e0(-117523074);
                    Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                    c28655q.m87173q(false);
                } else {
                    if (state.equals(InterfaceC41128c.b.f177293a)) {
                        c28655q.m87150e0(-117519787);
                        AbstractC2068m.m6513b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (state instanceof InterfaceC41128c.c) {
                            throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                        }
                        c28655q.m87150e0(-117516972);
                        function9 = function7;
                        function10 = function8;
                        m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                    interfaceC4339a3 = interfaceC4339a11;
                }
                function9 = function7;
                function10 = function8;
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function10;
                interfaceC4339a3 = interfaceC4339a11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C2012k(2);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C1991b1(6);
                    c28655q2.m87172p0(objM87133R2);
                }
                function7 = (Function1) objM87133R2;
            } else {
                function7 = function3;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C1991b1(7);
                    c28655q2.m87172p0(objM87133R);
                }
                function8 = (Function1) objM87133R;
            } else {
                function8 = function4;
            }
            C2314t c2314t8 = C2314t.f9131w;
            Modifier modifierM66724m8 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t8));
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM66724m8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
            c28655q = c28655q2;
            InterfaceC4339a interfaceC4339a12 = interfaceC4339a4;
            AbstractC6719b.m20143d(AbstractC1102d.m3409f(1.0f, c2314t8), new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC31794f.f131674o0), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a12, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
            if (state.equals(InterfaceC41128c.a.f177292a)) {
                c28655q.m87150e0(-117523074);
                Function1.m6508d(function7, c28655q, (i15 >> 6) & 14, 0);
                c28655q.m87173q(false);
            } else {
                if (state.equals(InterfaceC41128c.b.f177293a)) {
                    c28655q.m87150e0(-117519787);
                    AbstractC2068m.m6513b(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (state instanceof InterfaceC41128c.c) {
                        throw AbstractC11895b.m32003v(-117525239, c28655q, false);
                    }
                    c28655q.m87150e0(-117516972);
                    function9 = function7;
                    function10 = function8;
                    m6550t(C23016z.f90757a, (InterfaceC41128c.c) state, function9, function10, c28655q, 6 | ((i15 << 3) & 112) | (i15 & 896) | (i15 & 7168), 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function10;
                interfaceC4339a3 = interfaceC4339a12;
            }
            function9 = function7;
            function10 = function8;
            c28655q.m87173q(true);
            function5 = function9;
            function6 = function10;
            interfaceC4339a3 = interfaceC4339a12;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) state, (Object) interfaceC4339a3, function5, (Object) function6, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m6521G() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m6522H(InterfaceC41129d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m6523I(InterfaceC39768a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m6524J(InterfaceC41128c interfaceC41128c, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m6520F(interfaceC41128c, interfaceC4339a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    private static final void m6525K(InterfaceC41128c.c cVar, Function1 function1, Composer composer, int i13) {
        int i14;
        InterfaceC41128c.c cVar2 = cVar;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1300625414);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(cVar2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            TextResource textResourceM133530h = cVar2.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM133530h, c28655q, i16);
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i17).getT2();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3396r, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 48, i18, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubTitle(), c28655q, i16), AbstractC1099a.m3395q(c2314t, f13, f13), c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 48, i18, 196600);
            if (AbstractC8693b.m21270d(cVar.getLearnMoreText())) {
                c28655q.m87150e0(-2031084410);
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                TextResource textResourceM133527e = cVar.getLearnMoreText();
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    c28655q = c28655q;
                    objM87133R = a.f8207w;
                    c28655q.m87172p0(objM87133R);
                }
                c28655q = c28655q;
                InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                cVar2 = cVar;
                boolean zM87157i = ((i15 & 112) == 32) | c28655q.m87157i(cVar2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0167g(16, function1, cVar2);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = function1;
                AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM133527e, null, c39274g, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) objM87133R2, c28655q, (i16 << 6) | 48 | (C39274g.f168929c << 12), 0, 4009);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q;
                cVar2 = cVar;
                function2 = function1;
                c28655q.m87150e0(-2030707512);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(cVar2, function2, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m6526L(Function1 function1, InterfaceC41128c.c cVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC39768a.b(cVar.getLearnMoreDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m6527M(InterfaceC41128c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m6525K(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final void m6528N(C26068u c26068u, int i13, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i14, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1312761084);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(c26068u) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(interfaceC4339a) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                i13 = 0;
            }
            boolean z4 = (i16 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C1020h(c26068u, str, i13, 2));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | ((i16 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new b(interfaceC28670t2, interfaceC4339a, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28670t2);
        } else {
            c28655q.m87138X();
        }
        int i18 = i13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2069n(c26068u, i18, str, interfaceC4339a, i14, i15, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: O */
    public static final boolean m6529O(C26068u c26068u, String str, int i13) {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        return (interfaceC26054g == null || str == null || ((C26062o) interfaceC26054g).f103184a < (c26068u.m77565h().f103180n - i13) - 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m6530P(C26068u c26068u, int i13, String str, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) {
        m6528N(c26068u, i13, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x011b  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public static final void m6550t(InterfaceC23013y interfaceC23013y, InterfaceC41128c.c state, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        int i19;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(interfaceC23013y, "<this>");
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1569750482);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q2.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    i18 = 8;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C1991b1(i18);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C1991b1(9);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function2;
                    }
                    m6525K(state, function7, c28655q2, ((i15 >> 3) & 14) | ((i15 >> 6) & 112));
                    c28655q2.m87150e0(996701943);
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    float fMo733e0 = interfaceC39171c.mo733e0(C22949e.m66712e(c28655q2).f90558e.m66705e().f151452d) + 32;
                    c28655q2.m87173q(false);
                    C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                    float f13 = 8;
                    float f14 = 1 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, ((C23016z) interfaceC23013y).m66779c(C2314t.f9131w, true, 1.0f)), 0.0f, f14, 0.0f, 0.0f, 13);
                    float f15 = 2 * f13;
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(f15, 0.0f, f15, fMo733e0, 2);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                    boolean zM87157i2 = c28655q2.m87157i(state);
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z17 = zM87157i2 | z13;
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z17;
                    objM87133R = c28655q2.m87133R();
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new C29656q((Object) state, function6, (Object) function7, 5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q = c28655q2;
                    Function1 function8 = function7;
                    z16 = false;
                    AbstractC22674j.m65717c(modifierM3398t, c26068uM77569a, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 488);
                    String strM133528f = state.getNextToken();
                    if (i19 == 256) {
                        z16 = true;
                    }
                    zM87157i = z16 | c28655q.m87157i(state);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C2071p(function6, state, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m6528N(c26068uM77569a, 0, strM133528f, (InterfaceC4339a) objM87133R2, c28655q, 48, 0);
                    Function1 function9 = function6;
                    function4 = function8;
                    function5 = function9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function4 = function2;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) interfaceC23013y, (Object) state, function5, (Object) function4, i13, i14, 6);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                i18 = 8;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C1991b1(i18);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C1991b1(9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function2;
                }
                m6525K(state, function7, c28655q2, ((i15 >> 3) & 14) | ((i15 >> 6) & 112));
                c28655q2.m87150e0(996701943);
                InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                WeakHashMap weakHashMap2 = C22944c2.f90553v;
                float fMo733e1 = interfaceC39171c2.mo733e0(C22949e.m66712e(c28655q2).f90558e.m66705e().f151452d) + 32;
                c28655q2.m87173q(false);
                C26068u c26068uM77569a2 = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                float f16 = 8;
                float f17 = 1 * f16;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, ((C23016z) interfaceC23013y).m66779c(C2314t.f9131w, true, 1.0f)), 0.0f, f17, 0.0f, 0.0f, 13);
                float f18 = 2 * f16;
                C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(f18, 0.0f, f18, fMo733e1, 2);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f17);
                boolean zM87157i3 = c28655q2.m87157i(state);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = zM87157i3 | z13;
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z18;
                objM87133R = c28655q2.m87133R();
                if (z15) {
                    objM87133R = new C29656q((Object) state, function6, (Object) function7, 5);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C29656q((Object) state, function6, (Object) function7, 5);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                Function1 function10 = function7;
                z16 = false;
                AbstractC22674j.m65717c(modifierM3398t2, c26068uM77569a2, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 488);
                String strM133528f2 = state.getNextToken();
                if (i19 == 256) {
                    z16 = true;
                }
                zM87157i = z16 | c28655q.m87157i(state);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C2071p(function6, state, 1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2071p(function6, state, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                m6528N(c26068uM77569a2, 0, strM133528f2, (InterfaceC4339a) objM87133R2, c28655q, 48, 0);
                Function1 function11 = function6;
                function4 = function10;
                function5 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function4 = function2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) interfaceC23013y, (Object) state, function5, (Object) function4, i13, i14, 6);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                i18 = 8;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C1991b1(i18);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C1991b1(9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function2;
                }
                m6525K(state, function7, c28655q2, ((i15 >> 3) & 14) | ((i15 >> 6) & 112));
                c28655q2.m87150e0(996701943);
                InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                WeakHashMap weakHashMap3 = C22944c2.f90553v;
                float fMo733e2 = interfaceC39171c3.mo733e0(C22949e.m66712e(c28655q2).f90558e.m66705e().f151452d) + 32;
                c28655q2.m87173q(false);
                C26068u c26068uM77569a3 = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                float f19 = 8;
                float f110 = 1 * f19;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, ((C23016z) interfaceC23013y).m66779c(C2314t.f9131w, true, 1.0f)), 0.0f, f110, 0.0f, 0.0f, 13);
                float f111 = 2 * f19;
                C22976l1 c22976l1M3381c3 = AbstractC1099a.m3381c(f111, 0.0f, f111, fMo733e2, 2);
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f110);
                boolean zM87157i4 = c28655q2.m87157i(state);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z19 = zM87157i4 | z13;
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z19;
                objM87133R = c28655q2.m87133R();
                if (z15) {
                    objM87133R = new C29656q((Object) state, function6, (Object) function7, 5);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C29656q((Object) state, function6, (Object) function7, 5);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                Function1 function12 = function7;
                z16 = false;
                AbstractC22674j.m65717c(modifierM3398t3, c26068uM77569a3, c22976l1M3381c3, c22971kM66746i3, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 488);
                String strM133528f3 = state.getNextToken();
                if (i19 == 256) {
                    z16 = true;
                }
                zM87157i = z16 | c28655q.m87157i(state);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C2071p(function6, state, 1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2071p(function6, state, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                m6528N(c26068uM77569a3, 0, strM133528f3, (InterfaceC4339a) objM87133R2, c28655q, 48, 0);
                Function1 function13 = function6;
                function4 = function12;
                function5 = function13;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function4 = function2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) interfaceC23013y, (Object) state, function5, (Object) function4, i13, i14, 6);
            }
        }
        i15 |= 3072;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            i18 = 8;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C1991b1(i18);
                    c28655q2.m87172p0(objM87133R4);
                }
                function6 = (Function1) objM87133R4;
            } else {
                function6 = function3;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C1991b1(9);
                    c28655q2.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function2;
            }
            m6525K(state, function7, c28655q2, ((i15 >> 3) & 14) | ((i15 >> 6) & 112));
            c28655q2.m87150e0(996701943);
            InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            WeakHashMap weakHashMap4 = C22944c2.f90553v;
            float fMo733e3 = interfaceC39171c4.mo733e0(C22949e.m66712e(c28655q2).f90558e.m66705e().f151452d) + 32;
            c28655q2.m87173q(false);
            C26068u c26068uM77569a4 = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            float f112 = 8;
            float f113 = 1 * f112;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, ((C23016z) interfaceC23013y).m66779c(C2314t.f9131w, true, 1.0f)), 0.0f, f113, 0.0f, 0.0f, 13);
            float f114 = 2 * f112;
            C22976l1 c22976l1M3381c4 = AbstractC1099a.m3381c(f114, 0.0f, f114, fMo733e3, 2);
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f113);
            boolean zM87157i5 = c28655q2.m87157i(state);
            i19 = i15 & 896;
            if (i19 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z110 = zM87157i5 | z13;
            if ((i15 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z110;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                objM87133R = new C29656q((Object) state, function6, (Object) function7, 5);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C29656q((Object) state, function6, (Object) function7, 5);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            Function1 function14 = function7;
            z16 = false;
            AbstractC22674j.m65717c(modifierM3398t4, c26068uM77569a4, c22976l1M3381c4, c22971kM66746i4, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 488);
            String strM133528f4 = state.getNextToken();
            if (i19 == 256) {
                z16 = true;
            }
            zM87157i = z16 | c28655q.m87157i(state);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C2071p(function6, state, 1);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2071p(function6, state, 1);
                c28655q.m87172p0(objM87133R2);
            }
            m6528N(c26068uM77569a4, 0, strM133528f4, (InterfaceC4339a) objM87133R2, c28655q, 48, 0);
            Function1 function15 = function6;
            function4 = function14;
            function5 = function15;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function4 = function2;
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) interfaceC23013y, (Object) state, function5, (Object) function4, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m6551u(InterfaceC41129d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m6552v(InterfaceC39768a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m6553w(InterfaceC41128c.c cVar, final Function1 function1, Function1 function2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        if (cVar.getTopLoader()) {
            ((C26053f) LazyColumn).m77528q("top loader", C2074s.f8225a, C2056a.f8176a.m6481c());
        } else if (cVar.getTopError()) {
            final int i13 = 0;
            ((C26053f) LazyColumn).m77528q("top error", C2058c.f8180a, new C37816b(new Function3() { // from class: au1.o
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i13) {
                        case 0:
                            return AbstractC2072q.m6554x((Function1) function1, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        default:
                            return AbstractC2072q.m6556z((C41126a) function1, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }
            }, true, -1570436437));
        }
        for (final C41126a c41126a : cVar.m133525c()) {
            final int i14 = 1;
            C26053f c26053f = (C26053f) LazyColumn;
            c26053f.m77528q(c41126a.getKey(), C2057b.f8179a, new C37816b(new Function3() { // from class: au1.o
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i14) {
                        case 0:
                            return AbstractC2072q.m6554x((Function1) c41126a, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        default:
                            return AbstractC2072q.m6556z((C41126a) c41126a, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }
            }, true, 778205470));
            for (C41127b c41127b : c41126a.m133518c()) {
                c26053f.m77528q(c41127b.getId(), C2075t.f8226a, new C37816b(new C22931l(3, c41127b, function2), true, -1885144922));
            }
        }
        if (cVar.getBottomLoader()) {
            ((C26053f) LazyColumn).m77528q("bottom loader", C2074s.f8225a, C2056a.f8176a.m6482d());
        } else if (cVar.getBottomError()) {
            ((C26053f) LazyColumn).m77528q("bottom error", C2058c.f8180a, new C37816b(new C22931l(function1, cVar, 4), true, 1754660578));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m6554x(Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(item) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            Modifier modifierM3430a = InterfaceC1103a.m3430a(item, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 7);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3430a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2065j(function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2060e.m6486d(null, (InterfaceC4339a) objM87133R, c28655q, 0, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m6555y(Function1 function1) {
        function1.invoke(InterfaceC41129d.e.f177308a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m6556z(C41126a c41126a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(item) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC2064i.m6503b(InterfaceC1103a.m3430a(item, C2314t.f9131w, 7), c41126a.getDateName(), c28655q, TextResource.$stable << 3);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
