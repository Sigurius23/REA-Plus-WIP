package dp0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cp0.C10941a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.AbstractC13405k;
import ep0.C13398d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p027b3.AbstractC2453v1;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: dp0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"", "bottomNavTab", "Ll83/a0;", "e", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "k", "(Landroidx/compose/runtime/Composer;I)Z", "Ly3/f;", "clearance", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(FLandroidx/compose/runtime/Composer;I)V", "ownsBar", "coach-everywhere-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12247c {

    /* JADX INFO: renamed from: dp0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywherecommon.BottomNavCoachBarEffectsKt$RegisterForegroundBottomNavTab$1$1", m100430f = "BottomNavCoachBarEffects.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f40961w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f40962x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f40963y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC12251g interfaceC12251g, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f40962x = interfaceC12251g;
            this.f40963y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f40962x, this.f40963y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f40961w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f40962x.mo34139i(this.f40963y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dp0.c$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"dp0/c$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12251g f40964a;

        public b(InterfaceC12251g interfaceC12251g) {
            this.f40964a = interfaceC12251g;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f40964a.mo34139i(null);
        }
    }

    /* JADX INFO: renamed from: dp0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywherecommon.BottomNavCoachBarEffectsKt$ReportCoachBarNavClearance$1$1", m100430f = "BottomNavCoachBarEffects.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f40965w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f40966x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f40967y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC12251g interfaceC12251g, float f13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f40966x = interfaceC12251g;
            this.f40967y = f13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f40966x, this.f40967y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f40965w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f40966x.mo34134a(this.f40967y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dp0.c$d */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"dp0/c$d", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12251g f40968a;

        public d(InterfaceC12251g interfaceC12251g) {
            this.f40968a = interfaceC12251g;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f40968a.mo34134a(0.0f);
        }
    }

    /* JADX INFO: renamed from: dp0.c$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f40969w;

        /* JADX INFO: renamed from: dp0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f40970w;

            /* JADX INFO: renamed from: dp0.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywherecommon.BottomNavCoachBarEffectsKt$rememberOverlayOwnsNavCoachBar$lambda$0$$inlined$map$1$2", m100430f = "BottomNavCoachBarEffects.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41477a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f40971E;

                /* JADX INFO: renamed from: F */
                Object f40972F;

                /* JADX INFO: renamed from: G */
                Object f40973G;

                /* JADX INFO: renamed from: H */
                int f40974H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f40975w;

                /* JADX INFO: renamed from: x */
                int f40976x;

                /* JADX INFO: renamed from: y */
                Object f40977y;

                public C41477a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f40975w = obj;
                    this.f40976x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f40970w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41477a c41477a;
                if (interfaceC30057d instanceof C41477a) {
                    c41477a = (C41477a) interfaceC30057d;
                    int i13 = c41477a.f40976x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41477a.f40976x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41477a = new C41477a(interfaceC30057d);
                    }
                } else {
                    c41477a = new C41477a(interfaceC30057d);
                }
                Object obj2 = c41477a.f40975w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41477a.f40976x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f40970w;
                    Boolean boolValueOf = Boolean.valueOf(AbstractC13405k.m37871c(((C13398d) obj).getCurrentScreenContext()));
                    c41477a.f40977y = null;
                    c41477a.f40971E = null;
                    c41477a.f40972F = null;
                    c41477a.f40973G = null;
                    c41477a.f40974H = 0;
                    c41477a.f40976x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41477a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f40969w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f40969w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m34100e(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1211727770);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            boolean zM87157i = c28655q.m87157i(interfaceC12251g) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new a(interfaceC12251g, str, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87254h(interfaceC12251g, str, (InterfaceC4351m) objM87133R, c28655q);
            boolean zM87157i2 = c28655q.m87157i(interfaceC12251g);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C12245a(interfaceC12251g, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87251e(interfaceC12251g, (Function1) objM87133R2, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC28620h0 m34101f(InterfaceC12251g interfaceC12251g, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new b(interfaceC12251g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m34102g(String str, int i13, Composer composer, int i14) {
        m34100e(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m34103h(float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-414511534);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13);
            Float fValueOf = Float.valueOf(fMo743q0);
            boolean zM87157i = c28655q.m87157i(interfaceC12251g) | c28655q.m87147d(fMo743q0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new c(interfaceC12251g, fMo743q0, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87254h(interfaceC12251g, fValueOf, (InterfaceC4351m) objM87133R, c28655q);
            boolean zM87157i2 = c28655q.m87157i(interfaceC12251g);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C12245a(interfaceC12251g, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87251e(interfaceC12251g, (Function1) objM87133R2, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12246b(f13, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC28620h0 m34104i(InterfaceC12251g interfaceC12251g, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new d(interfaceC12251g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m34105j(float f13, int i13, Composer composer, int i14) {
        m34103h(f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m34106k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
        boolean zM87153g = c28655q.m87153g(interfaceC12251g);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC13091v.m36610t(new e(interfaceC12251g.getState()));
            c28655q.m87172p0(objM87133R);
        }
        return m34107l(AbstractC28683x.m87260n((InterfaceC13058l) objM87133R, Boolean.FALSE, null, c28655q, 48, 2));
    }

    /* JADX INFO: renamed from: l */
    private static final boolean m34107l(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }
}
