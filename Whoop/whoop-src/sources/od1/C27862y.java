package od1;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ch3.C4716w0;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.C6657d;
import fh3.C14493a;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23465k;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pd1.C29104a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xg3.C38280g;
import xg3.C38289p;
import xg3.InterfaceC38290q;

/* JADX INFO: renamed from: od1.y */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lod1/y;", "", "Lbc3/c0;", "scope", "Lpd1/a;", "bootstrapUserSignIn", "<init>", "(Lbc3/c0;Lpd1/a;)V", "Lxg3/g;", "Ll83/k;", "Lcom/whoop/domain/model/User;", "", "d", "()Lxg3/g;", "a", "Lbc3/c0;", "b", "Lpd1/a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27862y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C29104a bootstrapUserSignIn;

    /* JADX INFO: renamed from: od1.y$a */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserMgrUtil$getUserProfile$1$job$1", m100430f = "UserMgrUtil.kt", m100431l = {C1533u.MAX_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f112265w;

        /* JADX INFO: renamed from: x */
        int f112266x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC38290q f112267y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27862y f112268z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC38290q interfaceC38290q, C27862y c27862y, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f112267y = interfaceC38290q;
            this.f112268z = c27862y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f112267y, this.f112268z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC38290q interfaceC38290q;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f112266x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC38290q interfaceC38290q2 = this.f112267y;
                C29104a c29104a = this.f112268z.bootstrapUserSignIn;
                this.f112265w = interfaceC38290q2;
                this.f112266x = 1;
                Object objM88437n = c29104a.m88437n(this);
                if (objM88437n == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC38290q = interfaceC38290q2;
                obj = objM88437n;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC38290q = (InterfaceC38290q) this.f112265w;
                AbstractC34132o.m107864I(obj);
            }
            ((C4716w0) interfaceC38290q).m14775d(obj);
            return C23454a0.f92919a;
        }
    }

    public C27862y(InterfaceC2994c0 scope, C29104a bootstrapUserSignIn) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(bootstrapUserSignIn, "bootstrapUserSignIn");
        this.scope = scope;
        this.bootstrapUserSignIn = bootstrapUserSignIn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m84099e(C27862y c27862y, InterfaceC38290q interfaceC38290q) {
        C6657d c6657d = new C6657d(AbstractC3006f0.m8732z(c27862y.scope, null, null, new a(interfaceC38290q, c27862y, null), 3), 1);
        C4716w0 c4716w0 = (C4716w0) interfaceC38290q;
        c4716w0.getClass();
        c4716w0.f19294x.m41405c(new C14493a(c6657d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m84100f(InterfaceC3027k1 interfaceC3027k1) {
        interfaceC3027k1.cancel((CancellationException) null);
    }

    /* JADX INFO: renamed from: d */
    public final C38280g<C23465k> m84101d() {
        C38280g<C23465k> c38280gM122683a = C38289p.m122683a(C38289p.m122684b(new C6529c(this, 16)));
        AbstractC22676k.m65749i(c38280gM122683a, "toObservable(...)");
        return c38280gM122683a;
    }
}
