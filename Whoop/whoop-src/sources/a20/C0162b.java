package a20;

import a30.C0332w0;
import a30.InterfaceC0305k1;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1835v;
import androidx.work.CoroutineWorker;
import b30.C2571m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.payments.bankaccount.p054ui.CollectBankAccountActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import d30.C11530f0;
import e33.C12645n;
import f10.C14000b;
import f30.C14042e;
import f53.C14123k;
import h20.C16657g;
import h20.C16754w0;
import h20.C16771z;
import hm.C17417d;
import l83.C23454a0;
import p023ay.C2126b0;
import p077d0.C11350f1;
import p078d1.C11457j;
import p115ed.C13110e;
import p132f0.C13775c0;
import p132f0.C13793i0;
import p132f0.C13821r1;
import p132f0.C13836x0;
import p173gj.C15903d;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0162b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f486w;

    /* JADX INFO: renamed from: x */
    public int f487x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f488y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0162b(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f486w = i13;
        this.f488y = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f486w) {
            case 0:
                return new C0162b((CollectBankAccountActivity) this.f488y, interfaceC30057d, 0);
            case 1:
                return new C0162b((C0170j) this.f488y, interfaceC30057d, 1);
            case 2:
                return new C0162b((C0332w0) this.f488y, interfaceC30057d, 2);
            case 3:
                return new C0162b((C1835v) this.f488y, interfaceC30057d, 3);
            case 4:
                return new C0162b((IntentConfirmationChallengeActivity) this.f488y, interfaceC30057d, 4);
            case 5:
                return new C0162b((C2126b0) this.f488y, interfaceC30057d, 5);
            case 6:
                return new C0162b((C2571m0) this.f488y, interfaceC30057d, 6);
            case 7:
                return new C0162b((C11457j) this.f488y, interfaceC30057d, 7);
            case 8:
                return new C0162b((InterfaceC0305k1) this.f488y, interfaceC30057d, 8);
            case 9:
                return new C0162b((C13821r1) this.f488y, interfaceC30057d, 9);
            case 10:
                return new C0162b((InterfaceC28690z0) this.f488y, interfaceC30057d, 10);
            case 11:
                return new C0162b((InterfaceC28601c1) this.f488y, interfaceC30057d, 11);
            case 12:
                return new C0162b((C11350f1) this.f488y, interfaceC30057d, 12);
            case 13:
                return new C0162b((C12645n) this.f488y, interfaceC30057d, 13);
            case 14:
                return new C0162b((C13110e) this.f488y, interfaceC30057d, 14);
            case 15:
                return new C0162b((C13775c0) this.f488y, interfaceC30057d, 15);
            case 16:
                return new C0162b((C13793i0) this.f488y, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C0162b((C13836x0) this.f488y, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C0162b((AbstractC32275i) this.f488y, interfaceC30057d);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C0162b((C14000b) this.f488y, interfaceC30057d, 19);
            case 20:
                return new C0162b((C14042e) this.f488y, interfaceC30057d, 20);
            case 21:
                return new C0162b((C14123k) this.f488y, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C0162b((PaymentLauncherConfirmationActivity) this.f488y, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C0162b((C15903d) this.f488y, interfaceC30057d, 23);
            case 24:
                return new C0162b((C11530f0) this.f488y, interfaceC30057d, 24);
            case 25:
                return new C0162b((C16657g) this.f488y, interfaceC30057d, 25);
            case 26:
                return new C0162b((C16771z) this.f488y, interfaceC30057d, 26);
            case 27:
                return new C0162b((C16754w0) this.f488y, interfaceC30057d, 27);
            case 28:
                return new C0162b((CoroutineWorker) this.f488y, interfaceC30057d, 28);
            default:
                return new C0162b((C17417d) this.f488y, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f486w) {
            case 0:
                ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 1:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 4:
                ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 5:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 26:
                ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 27:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 28:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C0162b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:198:0x042d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0431  */
    /* JADX WARN: Code duplicated, block: B:203:0x043a  */
    /* JADX WARN: Code duplicated, block: B:205:0x043e  */
    /* JADX WARN: Type inference failed for: r2v62, types: [kotlin.jvm.functions.Function1, s83.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x043c -> B:198:0x042d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x0449 -> B:208:0x044c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a20.C0162b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0162b(Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f486w = 18;
        this.f488y = (AbstractC32275i) function1;
    }
}
