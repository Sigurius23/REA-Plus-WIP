package s40;

import androidx.glance.session.SessionWorker;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1618q0;
import b30.C2570m;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.link.LinkActivity;
import com.stripe.android.model.ConsumerSessionRefresh;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import dc3.InterfaceC11936u;
import e10.C12553k;
import ec3.C13045h2;
import ec3.C13084s1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import h40.C16845k;
import l83.C23454a0;
import p096dq.C12262f;
import p133f1.C13977s1;
import p390p1.InterfaceC28601c1;
import p395p6.C28894l;
import p508ty.C34247a;
import p512u2.InterfaceC34476v;
import p522uf.C34892s;
import p522uf.C34894u;
import p537ux.C35339j0;
import p581we.C37187g;
import p581we.C37188g0;
import p599wz.AbstractC37747q;
import p599wz.C37770y;
import p647yf.InterfaceC39492e;
import p695zx.C41185g;
import p695zx.C41197s;
import p697zz.C41234a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import sz.C33125d;
import t10.C33284d;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33384f;
import t23.C33450s0;
import t30.C33505g;
import w20.C36734x;
import x20.C37855w;
import y00.C38809d5;
import y00.C38892m;

/* JADX INFO: renamed from: s40.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32139c0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133173w;

    /* JADX INFO: renamed from: x */
    public int f133174x;

    /* JADX INFO: renamed from: y */
    public Object f133175y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f133176z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32139c0(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f133173w = i13;
        this.f133175y = obj;
        this.f133176z = obj2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f133173w) {
            case 0:
                return new C32139c0((C32142d0) this.f133176z, interfaceC30057d, 0);
            case 1:
                return new C32139c0((C13045h2) this.f133175y, (PaymentAuthWebViewActivity) this.f133176z, interfaceC30057d, 1);
            case 2:
                C32139c0 c32139c0 = new C32139c0((C33125d) this.f133176z, interfaceC30057d, 2);
                c32139c0.f133175y = obj;
                return c32139c0;
            case 3:
                return new C32139c0((C33125d) this.f133175y, (C12262f) this.f133176z, interfaceC30057d, 3);
            case 4:
                return new C32139c0((C33284d) this.f133175y, (C12553k) this.f133176z, interfaceC30057d, 4);
            case 5:
                return new C32139c0((C33384f) this.f133175y, (C33368c0) this.f133176z, interfaceC30057d, 5);
            case 6:
                return new C32139c0((C33368c0) this.f133176z, interfaceC30057d, 6);
            case 7:
                return new C32139c0((C33450s0) this.f133175y, (InterfaceC11936u) this.f133176z, interfaceC30057d, 7);
            case 8:
                C32139c0 c32139c1 = new C32139c0((C13084s1) this.f133176z, interfaceC30057d, 8);
                c32139c1.f133175y = obj;
                return c32139c1;
            case 9:
                C32139c0 c32139c2 = new C32139c0((C33366b4) this.f133176z, interfaceC30057d, 9);
                c32139c2.f133175y = obj;
                return c32139c2;
            case 10:
                C32139c0 c32139c3 = new C32139c0((C33505g) this.f133176z, interfaceC30057d, 10);
                c32139c3.f133175y = obj;
                return c32139c3;
            case 11:
                return new C32139c0(interfaceC30057d, (InterfaceC39492e) this.f133175y, (C34894u) this.f133176z, 11);
            case 12:
                C32139c0 c32139c4 = new C32139c0((C34247a) this.f133176z, interfaceC30057d, 12);
                c32139c4.f133175y = obj;
                return c32139c4;
            case 13:
                return new C32139c0((InterfaceC34476v) this.f133175y, (C13977s1) this.f133176z, interfaceC30057d, 13);
            case 14:
                return new C32139c0((ManageActivity) this.f133175y, (InterfaceC28601c1) this.f133176z, interfaceC30057d, 14);
            case 15:
                return new C32139c0(interfaceC30057d, (C34892s) this.f133175y, (C34894u) this.f133176z, 15);
            case 16:
                return new C32139c0((C35339j0) this.f133175y, (C38892m) this.f133176z, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C32139c0((C35339j0) this.f133175y, (C38809d5) this.f133176z, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C32139c0((BacsMandateConfirmationActivity) this.f133175y, (C16845k) this.f133176z, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C32139c0((CvcRecollectionActivity) this.f133175y, (C16845k) this.f133176z, interfaceC30057d, 19);
            case 20:
                return new C32139c0((C36734x) this.f133175y, (String) this.f133176z, interfaceC30057d, 20);
            case 21:
                return new C32139c0((C37188g0) this.f133175y, (C37187g) this.f133176z, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C32139c0((C37770y) this.f133175y, (LinkActivity) this.f133176z, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C32139c0((C37770y) this.f133175y, (AbstractC37747q) this.f133176z, interfaceC30057d, 23);
            case 24:
                return new C32139c0((C37770y) this.f133175y, (ConsumerSessionRefresh) this.f133176z, interfaceC30057d, 24);
            case 25:
                C32139c0 c32139c5 = new C32139c0((C37855w) this.f133176z, interfaceC30057d, 25);
                c32139c5.f133175y = obj;
                return c32139c5;
            case 26:
                return new C32139c0((SessionWorker) this.f133175y, (C28894l) this.f133176z, interfaceC30057d, 26);
            case 27:
                return new C32139c0((InterfaceC13037f2) this.f133175y, (C2570m) this.f133176z, interfaceC30057d, 27);
            case 28:
                return new C32139c0((C41185g) this.f133175y, (C41197s) this.f133176z, interfaceC30057d, 28);
            default:
                return new C32139c0((C41234a) this.f133176z, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.f133173w) {
            case 0:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 2:
                return ((C32139c0) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 8:
                return ((C32139c0) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C32139c0) create((InterfaceC1618q0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 15:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 27:
                ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 28:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C32139c0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:263:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:265:0x04d4 A[Catch: all -> 0x046d, TRY_LEAVE, TryCatch #1 {all -> 0x046d, blocks: (B:240:0x0469, B:260:0x04ca, B:265:0x04d4), top: B:434:0x0469 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x04df  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:277:0x0500  */
    /* JADX WARN: Code duplicated, block: B:281:0x050c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r15 == r2) goto L28;
     */
    /* JADX WARN: Type inference failed for: r15v40, types: [c93.m, s83.h] */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s40.C32139c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32139c0(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f133173w = i13;
        this.f133176z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32139c0(InterfaceC30057d interfaceC30057d, InterfaceC39492e interfaceC39492e, C34894u c34894u, int i13) {
        super(2, interfaceC30057d);
        this.f133173w = i13;
        this.f133175y = interfaceC39492e;
        this.f133176z = c34894u;
    }
}
