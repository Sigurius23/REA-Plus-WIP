package pl1;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import il1.AbstractC18624b;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: pl1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lpl1/b;", "Lod1/g;", "Lil1/b;", "Lpl1/a;", "<init>", "()V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29350b implements InterfaceC27844g<AbstractC18624b, C29349a> {

    /* JADX INFO: renamed from: pl1.b$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f118951w;

        /* JADX INFO: renamed from: pl1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42169a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f118952w;

            /* JADX INFO: renamed from: pl1.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.indicator.ConnectivityIndicatorInteractor$interact$$inlined$map$1$2", m100430f = "ConnectivityIndicatorInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42170a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f118953E;

                /* JADX INFO: renamed from: F */
                Object f118954F;

                /* JADX INFO: renamed from: G */
                Object f118955G;

                /* JADX INFO: renamed from: H */
                int f118956H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f118957w;

                /* JADX INFO: renamed from: x */
                int f118958x;

                /* JADX INFO: renamed from: y */
                Object f118959y;

                public C42170a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f118957w = obj;
                    this.f118958x |= Integer.MIN_VALUE;
                    return C42169a.this.emit(null, this);
                }
            }

            public C42169a(InterfaceC13062m interfaceC13062m) {
                this.f118952w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42170a c42170a;
                if (interfaceC30057d instanceof C42170a) {
                    c42170a = (C42170a) interfaceC30057d;
                    int i13 = c42170a.f118958x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42170a.f118958x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42170a = new C42170a(interfaceC30057d);
                    }
                } else {
                    c42170a = new C42170a(interfaceC30057d);
                }
                Object obj2 = c42170a.f118957w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42170a.f118958x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f118952w;
                    AbstractC18624b abstractC18624b = (AbstractC18624b) obj;
                    if (!(abstractC18624b instanceof AbstractC18624b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C29349a c29349a = new C29349a(((AbstractC18624b.a) abstractC18624b).getIsVisible());
                    c42170a.f118959y = null;
                    c42170a.f118953E = null;
                    c42170a.f118954F = null;
                    c42170a.f118955G = null;
                    c42170a.f118956H = 0;
                    c42170a.f118958x = 1;
                    if (interfaceC13062m.emit(c29349a, c42170a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f118951w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f118951w.collect(new C42169a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
