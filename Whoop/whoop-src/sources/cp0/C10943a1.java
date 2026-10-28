package cp0;

import a33.C0351c;
import androidx.lifecycle.C1586g1;
import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import l83.C23454a0;
import p132f0.C13776c1;
import p132f0.EnumC13840z0;
import p180h0.C16430o;
import p180h0.C16435p;
import p180h0.C16475x;
import p180h0.InterfaceC16356a;
import p180h0.InterfaceC16392g1;
import p180h0.InterfaceC16397h1;
import p180h0.InterfaceC16427n1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cp0.a1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcp0/a1;", "Lh0/n1;", "Lh0/p;", "Lcp0/l;", "state", "<init>", "(Lh0/p;)V", "Lf0/z0;", "dragPriority", "Lkotlin/Function2;", "Lh0/g1;", "Lq83/d;", "Ll83/a0;", "", "block", "a", "(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lh0/p;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C10943a1 implements InterfaceC16427n1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16435p state;

    /* JADX INFO: renamed from: cp0.a1$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CollapsedBarDraggableState$drag$2", m100430f = "CoachDrawerOverScroll.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lh0/a;", "Lh0/h1;", "Lcp0/l;", "anchors", "Ll83/a0;", "<anonymous>", "(Lh0/a;Lh0/h1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4351m f33875E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C10943a1 f33876F;

        /* JADX INFO: renamed from: w */
        Object f33877w;

        /* JADX INFO: renamed from: x */
        int f33878x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f33879y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f33880z;

        /* JADX INFO: renamed from: cp0.a1$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"cp0/a1$a$a", "Lh0/g1;", "", "pixels", "Ll83/a0;", "a", "(F)V", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41439a implements InterfaceC16392g1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C10943a1 f33881a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC16356a f33882b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC16397h1 f33883c;

            public C41439a(C10943a1 c10943a1, InterfaceC16356a interfaceC16356a, InterfaceC16397h1 interfaceC16397h1) {
                this.f33881a = c10943a1;
                this.f33882b = interfaceC16356a;
                this.f33883c = interfaceC16397h1;
            }

            @Override // p180h0.InterfaceC16392g1
            /* JADX INFO: renamed from: a */
            public void mo29024a(float pixels) {
                float fM87022x = this.f33881a.state.f63154f.m87022x();
                if (Float.isNaN(fM87022x)) {
                    return;
                }
                float fM29360h = AbstractC10995s.m29360h(fM87022x, pixels) + fM87022x;
                ((C16430o) this.f33882b).m46600b(AbstractC12889b.m36283m(fM29360h, ((C16475x) this.f33883c).m46649d(), ((C16475x) this.f33883c).m46648c()), 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4351m interfaceC4351m, C10943a1 c10943a1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f33875E = interfaceC4351m;
            this.f33876F = c10943a1;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16356a interfaceC16356a, InterfaceC16397h1 interfaceC16397h1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(this.f33875E, this.f33876F, interfaceC30057d);
            aVar.f33879y = interfaceC16356a;
            aVar.f33880z = interfaceC16397h1;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC16356a interfaceC16356a = (InterfaceC16356a) this.f33879y;
            InterfaceC16397h1 interfaceC16397h1 = (InterfaceC16397h1) this.f33880z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33878x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C41439a c41439a = new C41439a(this.f33876F, interfaceC16356a, interfaceC16397h1);
                InterfaceC4351m interfaceC4351m = this.f33875E;
                this.f33879y = null;
                this.f33880z = null;
                this.f33877w = null;
                this.f33878x = 1;
                if (interfaceC4351m.invoke(c41439a, this) == enumC31071a) {
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

    public C10943a1(C16435p state) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
    }

    @Override // p180h0.InterfaceC16427n1
    /* JADX INFO: renamed from: a */
    public Object mo29022a(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C16435p c16435p = this.state;
        a aVar = new a(interfaceC4351m, this, null);
        C13776c1 c13776c1 = c16435p.f63150b;
        C0351c c0351c = new C0351c(c16435p, aVar, (InterfaceC30057d) null);
        c13776c1.getClass();
        Object objM8719m = AbstractC3006f0.m8719m(new C1586g1(enumC13840z0, c13776c1, c0351c, null), interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM8719m != enumC31071a) {
            objM8719m = c23454a0;
        }
        return objM8719m == enumC31071a ? objM8719m : c23454a0;
    }
}
