package f70;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.PaymentMethodStepModel;
import java.util.List;
import n70.C26414a;
import n70.C26416c;
import n70.C26418e;
import n70.InterfaceC26415b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: f70.s0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lf70/s0;", "", "Ln70/c;", "progressInteractor", "<init>", "(Ln70/c;)V", "Lf70/e$b;", "prevDomainResult", "", "a", "(Lf70/e$b;)I", "", "authenticated", "b", "(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "Ln70/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14205s0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26416c progressInteractor;

    /* JADX INFO: renamed from: f70.s0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.NavigateBackToCreditCardScreenHelper", m100430f = "NavigateBackToCreditCardScreenHelper.kt", m100431l = {20}, m100432m = "invoke", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f51660F;

        /* JADX INFO: renamed from: w */
        Object f51661w;

        /* JADX INFO: renamed from: x */
        Object f51662x;

        /* JADX INFO: renamed from: y */
        boolean f51663y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f51664z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51664z = obj;
            this.f51660F |= Integer.MIN_VALUE;
            return C14205s0.this.m40599b(null, false, this);
        }
    }

    public C14205s0(C26416c progressInteractor) {
        AbstractC22676k.m65750j(progressInteractor, "progressInteractor");
        this.progressInteractor = progressInteractor;
    }

    /* JADX INFO: renamed from: a */
    private final int m40598a(InterfaceC14176e.b prevDomainResult) {
        int currentStepIndex = prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        Object obj = null;
        if (listM40428m != null) {
            for (Object obj2 : listM40428m) {
                if (((ActivationFlowStepModel) obj2) instanceof PaymentMethodStepModel) {
                    obj = obj2;
                    break;
                }
            }
            obj = (ActivationFlowStepModel) obj;
        }
        List<ActivationFlowStepModel> listM40428m2 = prevDomainResult.m40428m();
        int iIndexOf = listM40428m2 != null ? listM40428m2.indexOf(obj) : -1;
        if (iIndexOf != -1) {
            return iIndexOf - currentStepIndex;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b */
    public final Object m40599b(InterfaceC14176e.b bVar, boolean z4, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
        a aVar;
        InterfaceC14176e.b bVar2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51660F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51660F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM78158k = aVar.f51664z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f51660F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM78158k);
            C26416c c26416c = this.progressInteractor;
            C26414a c26414a = new C26414a(new InterfaceC26415b.a(m40598a(bVar), null, 2, null), bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), z4);
            aVar.f51661w = null;
            aVar.f51662x = bVar;
            aVar.f51663y = z4;
            aVar.f51660F = 1;
            objM78158k = c26416c.m78158k(c26414a, aVar);
            if (objM78158k == enumC31071a) {
                return enumC31071a;
            }
            bVar2 = bVar;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC14176e.b bVar3 = (InterfaceC14176e.b) aVar.f51662x;
            AbstractC34132o.m107864I(objM78158k);
            bVar2 = bVar3;
        }
        return InterfaceC14176e.b.m40416b(bVar2, null, (C26418e) objM78158k, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131037, null);
    }
}
