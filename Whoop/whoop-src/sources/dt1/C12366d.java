package dt1;

import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: dt1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/d;", "Lod1/g;", "Ldt1/e;", "Ldt1/g;", "Ldt1/h;", "networkInteractor", "Ldt1/j;", "localInteractor", "<init>", "(Ldt1/h;Ldt1/j;)V", "upstream", "Lec3/l;", "d", "(Ldt1/g;)Lec3/l;", "interact", "(Lec3/l;)Lec3/l;", "a", "Ldt1/h;", "b", "Ldt1/j;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12366d implements InterfaceC27844g<InterfaceC12367e, InterfaceC12369g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12370h networkInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12372j localInteractor;

    /* JADX INFO: renamed from: dt1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.domain.LabradorDetailsCombiner$interact$$inlined$flatMapLatest$1", m100430f = "LabradorDetailsCombiner.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f41586w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41587x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41588y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12366d f41589z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C12366d c12366d) {
            super(3, interfaceC30057d);
            this.f41589z = c12366d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC12369g interfaceC12369g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f41589z);
            aVar.f41587x = interfaceC13062m;
            aVar.f41588y = interfaceC12369g;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41586w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41587x;
                InterfaceC12369g interfaceC12369g = (InterfaceC12369g) this.f41588y;
                InterfaceC13058l interfaceC13058lM34645d = ((interfaceC12369g instanceof InterfaceC12369g.d) || (interfaceC12369g instanceof InterfaceC12369g.e) || (interfaceC12369g instanceof InterfaceC12369g.k)) ? this.f41589z.m34645d(interfaceC12369g) : new C0456u(interfaceC12369g, 1);
                this.f41587x = null;
                this.f41588y = null;
                this.f41586w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM34645d, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC12369g) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C12366d(C12370h networkInteractor, C12372j localInteractor) {
        AbstractC22676k.m65750j(networkInteractor, "networkInteractor");
        AbstractC22676k.m65750j(localInteractor, "localInteractor");
        this.networkInteractor = networkInteractor;
        this.localInteractor = localInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m34645d(InterfaceC12369g upstream) {
        return this.localInteractor.m34707e(upstream);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(this.networkInteractor.m34696y(upstream), new a(null, this));
    }
}
