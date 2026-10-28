package p710im1;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bm.C3396t;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fm1.EnumC14603g;
import hy0.C17734d1;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: im1.w0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lbm/t;", "pagerState", "Ln0/u;", "listState", "Lkotlin/Function1;", "", "Ll83/a0;", "onBottomOfPageHit", "source", "b", "(Lbm/t;Ln0/u;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "f", "(Ln0/u;)Z", "Lfm1/g;", "pillarType", "e", "(Lfm1/g;)Ljava/lang/String;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18703w0 {

    /* JADX INFO: renamed from: im1.w0$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.PagerLazyColumnBottomNotifierKt$PagerLazyColumnBottomNotifier$1$1", m100430f = "PagerLazyColumnBottomNotifier.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73427w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26068u f73428x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f73429y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f73430z;

        /* JADX INFO: renamed from: im1.w0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41759a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f73431w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f73432x;

            public C41759a(Function1 function1, String str) {
                this.f73431w = function1;
                this.f73432x = str;
            }

            /* JADX INFO: renamed from: b */
            public final Object m54395b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f73431w.invoke(this.f73432x);
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m54395b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: im1.w0$a$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f73433w;

            /* JADX INFO: renamed from: im1.w0$a$b$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41760a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f73434w;

                /* JADX INFO: renamed from: im1.w0$a$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.home.view.PagerLazyColumnBottomNotifierKt$PagerLazyColumnBottomNotifier$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "PagerLazyColumnBottomNotifier.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41761a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f73436F;

                    /* JADX INFO: renamed from: G */
                    Object f73437G;

                    /* JADX INFO: renamed from: H */
                    int f73438H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f73439w;

                    /* JADX INFO: renamed from: x */
                    int f73440x;

                    /* JADX INFO: renamed from: y */
                    Object f73441y;

                    /* JADX INFO: renamed from: z */
                    Object f73442z;

                    public C41761a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f73439w = obj;
                        this.f73440x |= Integer.MIN_VALUE;
                        return C41760a.this.emit(null, this);
                    }
                }

                public C41760a(InterfaceC13062m interfaceC13062m) {
                    this.f73434w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41761a c41761a;
                    if (interfaceC30057d instanceof C41761a) {
                        c41761a = (C41761a) interfaceC30057d;
                        int i13 = c41761a.f73440x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41761a.f73440x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41761a = new C41761a(interfaceC30057d);
                        }
                    } else {
                        c41761a = new C41761a(interfaceC30057d);
                    }
                    Object obj2 = c41761a.f73439w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41761a.f73440x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f73434w;
                        if (((Boolean) obj).booleanValue()) {
                            c41761a.f73441y = null;
                            c41761a.f73442z = null;
                            c41761a.f73436F = null;
                            c41761a.f73437G = null;
                            c41761a.f73438H = 0;
                            c41761a.f73440x = 1;
                            if (interfaceC13062m.emit(obj, c41761a) == enumC31071a) {
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

            public b(InterfaceC13058l interfaceC13058l) {
                this.f73433w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f73433w.collect(new C41760a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C26068u c26068u, Function1 function1, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73428x = c26068u;
            this.f73429y = function1;
            this.f73430z = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m54394h(C26068u c26068u) {
            return AbstractC18703w0.m54392f(c26068u);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f73428x, this.f73429y, this.f73430z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73427w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b bVar = new b(AbstractC13091v.m36612v(AbstractC28683x.m87240H(new C18701v0(this.f73428x, 0)), 1));
                C41759a c41759a = new C41759a(this.f73429y, this.f73430z);
                this.f73427w = 1;
                if (bVar.collect(c41759a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: im1.w0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73443a;

        static {
            int[] iArr = new int[EnumC14603g.values().length];
            try {
                iArr[EnumC14603g.OVERVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14603g.SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14603g.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14603g.STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f73443a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m54388b(C3396t pagerState, C26068u listState, Function1 onBottomOfPageHit, String source, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(pagerState, "pagerState");
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(onBottomOfPageHit, "onBottomOfPageHit");
        AbstractC22676k.m65750j(source, "source");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(190416185);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(pagerState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(listState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onBottomOfPageHit) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(source) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Integer numValueOf = Integer.valueOf(pagerState.m9774m());
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new a(listState, onBottomOfPageHit, source, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, numValueOf);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17734d1(i13, 17, pagerState, listState, source, onBottomOfPageHit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m54389c(C3396t c3396t, C26068u c26068u, Function1 function1, String str, int i13, Composer composer, int i14) {
        m54388b(c3396t, c26068u, function1, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final String m54391e(EnumC14603g pillarType) {
        AbstractC22676k.m65750j(pillarType, "pillarType");
        int i13 = b.f73443a[pillarType.ordinal()];
        if (i13 == 1) {
            return "Overview Pillar";
        }
        if (i13 == 2) {
            return "Sleep Pillar";
        }
        if (i13 == 3) {
            return "Recovery Pillar";
        }
        if (i13 == 4) {
            return "Strain Pillar";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static final boolean m54392f(C26068u c26068u) {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        return interfaceC26054g != null && ((C26062o) interfaceC26054g).f103184a == c26068u.m77565h().f103180n - 1;
    }
}
