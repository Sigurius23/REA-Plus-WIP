package f70;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: f70.a1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lf70/a1;", "", "<init>", "()V", "Lf70/e$b;", "c", "()Lf70/e$b;", "Lf70/e;", "b", "(Lq83/d;)Ljava/lang/Object;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14166a1 {

    /* JADX INFO: renamed from: f70.a1$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.StartScreenCtaHelper$handleStartScreenCtaClick$2", m100430f = "StartScreenCtaHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e$b;", "<anonymous>", "(Lbc3/c0;)Lf70/e$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f51054w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14166a1.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f51054w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C14166a1.this.m40354c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC14176e.b m40354c() {
        EnumC14168b0 enumC14168b0 = EnumC14168b0.LOADING;
        ActivationFlowDestination activationFlowDestination = ActivationFlowDestination.ENTER_YOUR_EMAIL;
        return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, activationFlowDestination, new AbstractC26417d.a(activationFlowDestination, null, 2, null)), null, null, enumC14168b0, false, null, false, null, false, false, null, null, null, null, null, null, 131053, null);
    }

    /* JADX INFO: renamed from: b */
    public final Object m40355b(InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1000L, new a(null), interfaceC30057d);
    }
}
