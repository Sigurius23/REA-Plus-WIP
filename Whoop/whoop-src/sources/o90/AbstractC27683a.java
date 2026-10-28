package o90;

import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import j80.InterfaceC21413a;
import l83.C23454a0;
import mx1.C26003i;
import no0.C26957l;
import p179h.C16351i;
import p236j.C21062a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: o90.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Landroid/content/Intent;", "pairingFlowIntent", "Lkotlin/Function1;", "Lj80/a;", "Ll83/a0;", "onViewEvent", "c", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27683a {

    /* JADX INFO: renamed from: o90.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.pairing.PairingScreenContainerKt$PairingScreenContainer$1$1", m100430f = "PairingScreenContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111442w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16351i f111443x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Intent f111444y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C16351i c16351i, Intent intent, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111443x = c16351i;
            this.f111444y = intent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f111443x, this.f111444y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f111442w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f111443x.mo4052a(this.f111444y, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m83681c(Intent pairingFlowIntent, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(pairingFlowIntent, "pairingFlowIntent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1922413267);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(pairingFlowIntent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C26957l(onViewEvent, 18);
                c28655q.m87172p0(objM87133R);
            }
            C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult, (Function1) objM87133R, c28655q, 0);
            boolean zM87157i = c28655q.m87157i(c16351iM118972a0) | c28655q.m87157i(pairingFlowIntent);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new a(c16351iM118972a0, pairingFlowIntent, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(pairingFlowIntent, onViewEvent, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m83682d(Function1 function1, C21062a activityResult) {
        AbstractC22676k.m65750j(activityResult, "activityResult");
        int i13 = activityResult.f79915w;
        if (i13 == -1) {
            function1.invoke(new InterfaceC21413a.c0(false, ActivationFlowDestination.PAIRING, null, 5, null));
        } else if (i13 == 0) {
            function1.invoke(new InterfaceC21413a.m0(ActivationFlowDestination.PAIRING));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m83683e(Intent intent, Function1 function1, int i13, Composer composer, int i14) {
        m83681c(intent, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
