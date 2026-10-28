package bw1;

import androidx.lifecycle.AbstractC1637w1;
import cw1.C11159a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vv1.C36530a;
import vv1.C36531b;

/* JADX INFO: renamed from: bw1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lbw1/b;", "Landroidx/lifecycle/w1;", "Lvv1/a;", "coordinator", "Lcw1/a;", "reducer", "<init>", "(Lvv1/a;Lcw1/a;)V", "Lec3/l;", "Lbw1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3683b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: bw1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f15026w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11159a f15027x;

        /* JADX INFO: renamed from: bw1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41330a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f15028w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11159a f15029x;

            /* JADX INFO: renamed from: bw1.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.presentation.DunningBottomSheetViewModel$special$$inlined$map$1$2", m100430f = "DunningBottomSheetViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41331a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f15030E;

                /* JADX INFO: renamed from: F */
                Object f15031F;

                /* JADX INFO: renamed from: G */
                Object f15032G;

                /* JADX INFO: renamed from: H */
                int f15033H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f15034w;

                /* JADX INFO: renamed from: x */
                int f15035x;

                /* JADX INFO: renamed from: y */
                Object f15036y;

                public C41331a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f15034w = obj;
                    this.f15035x |= Integer.MIN_VALUE;
                    return C41330a.this.emit(null, this);
                }
            }

            public C41330a(InterfaceC13062m interfaceC13062m, C11159a c11159a) {
                this.f15028w = interfaceC13062m;
                this.f15029x = c11159a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41331a c41331a;
                if (interfaceC30057d instanceof C41331a) {
                    c41331a = (C41331a) interfaceC30057d;
                    int i13 = c41331a.f15035x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41331a.f15035x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41331a = new C41331a(interfaceC30057d);
                    }
                } else {
                    c41331a = new C41331a(interfaceC30057d);
                }
                Object obj2 = c41331a.f15034w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41331a.f15035x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f15028w;
                    AbstractC3684c abstractC3684cM30244a = this.f15029x.m30244a(((C36531b) obj).getState());
                    c41331a.f15036y = null;
                    c41331a.f15030E = null;
                    c41331a.f15031F = null;
                    c41331a.f15032G = null;
                    c41331a.f15033H = 0;
                    c41331a.f15035x = 1;
                    if (interfaceC13062m.emit(abstractC3684cM30244a, c41331a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C11159a c11159a) {
            this.f15026w = interfaceC13058l;
            this.f15027x = c11159a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f15026w.collect(new C41330a(interfaceC13062m, this.f15027x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C3683b(C36530a coordinator, C11159a reducer) {
        AbstractC22676k.m65750j(coordinator, "coordinator");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.viewState = new a(coordinator.getStateFlow(), reducer);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }
}
