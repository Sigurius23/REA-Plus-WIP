package f70;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f70.b1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lf70/b1;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "Lf70/e$b;", "c", "()Lf70/e$b;", "Lf70/e;", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14169b1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.b1$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.StartScreenJoinCtaHelper$handleJoinCtaClick$2", m100430f = "StartScreenJoinCtaHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e$b;", "<anonymous>", "(Lbc3/c0;)Lf70/e$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f51080w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14169b1.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f51080w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C14169b1.this.m40362c();
        }
    }

    public C14169b1(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC14176e.b m40362c() {
        this.logger.mo85216g("User pressed 'I don't have a whoop device' button. Navigating to in-app join flow.", new AbstractC30556a.a[0]);
        EnumC14168b0 enumC14168b0 = EnumC14168b0.LOADING;
        ActivationFlowDestination activationFlowDestination = ActivationFlowDestination.IN_APP_JOIN_FLOW;
        return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, activationFlowDestination, new AbstractC26417d.a(activationFlowDestination, null, 2, null)), null, null, enumC14168b0, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122861, null);
    }

    /* JADX INFO: renamed from: b */
    public final Object m40363b(InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1000L, new a(null), interfaceC30057d);
    }

    public /* synthetic */ C14169b1(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StartScreenJoinCtaHelper") : interfaceC34116n);
    }
}
