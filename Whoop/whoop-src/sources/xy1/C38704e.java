package xy1;

import az1.InterfaceC2168i;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import py1.C29622a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: xy1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lxy1/e;", "", "Lpy1/a;", "mfaAnalyticsHelper", "<init>", "(Lpy1/a;)V", "Lec3/l;", "Laz1/i;", "upstream", "Lxy1/d;", "b", "(Lec3/l;)Lec3/l;", "a", "Lpy1/a;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38704e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29622a mfaAnalyticsHelper;

    /* JADX INFO: renamed from: xy1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f166578w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38704e f166579x;

        /* JADX INFO: renamed from: xy1.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42672a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f166580w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38704e f166581x;

            /* JADX INFO: renamed from: xy1.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.domain.MfaSetupIntroInteractor$interact$$inlined$map$1$2", m100430f = "MfaSetupIntroInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42673a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f166582E;

                /* JADX INFO: renamed from: F */
                Object f166583F;

                /* JADX INFO: renamed from: G */
                Object f166584G;

                /* JADX INFO: renamed from: H */
                int f166585H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f166586w;

                /* JADX INFO: renamed from: x */
                int f166587x;

                /* JADX INFO: renamed from: y */
                Object f166588y;

                public C42673a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f166586w = obj;
                    this.f166587x |= Integer.MIN_VALUE;
                    return C42672a.this.emit(null, this);
                }
            }

            public C42672a(InterfaceC13062m interfaceC13062m, C38704e c38704e) {
                this.f166580w = interfaceC13062m;
                this.f166581x = c38704e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42673a c42673a;
                if (interfaceC30057d instanceof C42673a) {
                    c42673a = (C42673a) interfaceC30057d;
                    int i13 = c42673a.f166587x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42673a.f166587x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42673a = new C42673a(interfaceC30057d);
                    }
                } else {
                    c42673a = new C42673a(interfaceC30057d);
                }
                Object obj2 = c42673a.f166586w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42673a.f166587x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f166580w;
                    InterfaceC2168i interfaceC2168i = (InterfaceC2168i) obj;
                    if (!(interfaceC2168i instanceof InterfaceC2168i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC2168i.a aVar = (InterfaceC2168i.a) interfaceC2168i;
                    this.f166581x.mfaAnalyticsHelper.m91031v(aVar.getSource());
                    C38703d c38703d = new C38703d(aVar.getSource());
                    c42673a.f166588y = null;
                    c42673a.f166582E = null;
                    c42673a.f166583F = null;
                    c42673a.f166584G = null;
                    c42673a.f166585H = 0;
                    c42673a.f166587x = 1;
                    if (interfaceC13062m.emit(c38703d, c42673a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C38704e c38704e) {
            this.f166578w = interfaceC13058l;
            this.f166579x = c38704e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f166578w.collect(new C42672a(interfaceC13062m, this.f166579x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C38704e(C29622a mfaAnalyticsHelper) {
        AbstractC22676k.m65750j(mfaAnalyticsHelper, "mfaAnalyticsHelper");
        this.mfaAnalyticsHelper = mfaAnalyticsHelper;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m124131b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}
