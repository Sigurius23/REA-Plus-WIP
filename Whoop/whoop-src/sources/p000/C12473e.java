package p000;

import a20.C0170j;
import a30.C0274a0;
import a30.C0332w0;
import a33.C0352d;
import a43.C0384f;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1565b0;
import androidx.lifecycle.C1621r0;
import androidx.lifecycle.InterfaceC1618q0;
import b30.C2570m;
import b30.C2659y0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bh.C3247j;
import bi.C3277o;
import bi.C3281s;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import cz.C11197e0;
import cz.C11215n0;
import e30.AbstractC12605c;
import ec3.InterfaceC13058l;
import java.util.List;
import kz.AbstractC22917n;
import l83.C23454a0;
import mh.C25542j;
import my.C26027a;
import p023ay.C2123a;
import p023ay.C2126b0;
import p023ay.InterfaceC2134h;
import p026b2.C2319y;
import p027b3.C2389i2;
import p027b3.C2462x0;
import p043c4.C3958f0;
import p078d1.C11449b;
import p078d1.C11453f;
import p078d1.C11457j;
import p078d1.C11458k;
import p266jz.AbstractC22067o;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p512u2.InterfaceC34476v;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes9.dex */
public final class C12473e extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42571w;

    /* JADX INFO: renamed from: x */
    public int f42572x;

    /* JADX INFO: renamed from: y */
    public Object f42573y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f42574z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12473e(C1565b0 c1565b0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42571w = 9;
        this.f42573y = c1565b0;
        this.f42574z = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f42571w) {
            case 0:
                return new C12473e((InterfaceC4339a) this.f42573y, (InterfaceC28601c1) this.f42574z, interfaceC30057d, 0);
            case 1:
                return new C12473e((InterfaceC28670t2) this.f42574z, this.f42573y, interfaceC30057d, 1);
            case 2:
                return new C12473e((AbstractC22067o) this.f42573y, (C0170j) this.f42574z, interfaceC30057d, 2);
            case 3:
                return new C12473e((AbstractC22917n) this.f42573y, (C0170j) this.f42574z, interfaceC30057d, 3);
            case 4:
                return new C12473e((C0274a0) this.f42573y, (C26027a) this.f42574z, interfaceC30057d, 4);
            case 5:
                return new C12473e((C0352d) this.f42573y, (List) this.f42574z, interfaceC30057d, 5);
            case 6:
                return new C12473e((C0384f) this.f42574z, interfaceC30057d, 6);
            case 7:
                C12473e c12473e = new C12473e((C0332w0) this.f42574z, interfaceC30057d, 7);
                c12473e.f42573y = obj;
                return c12473e;
            case 8:
                C12473e c12473e2 = new C12473e((InterfaceC13058l) this.f42574z, interfaceC30057d, 8);
                c12473e2.f42573y = obj;
                return c12473e2;
            case 9:
                return new C12473e((C1565b0) this.f42573y, (InterfaceC4351m) this.f42574z, interfaceC30057d);
            case 10:
                return new C12473e((C1621r0) this.f42573y, this.f42574z, interfaceC30057d, 10);
            case 11:
                return new C12473e((IntentConfirmationChallengeActivity) this.f42573y, (InterfaceC28601c1) this.f42574z, interfaceC30057d, 11);
            case 12:
                return new C12473e((C2126b0) this.f42573y, (C2123a) this.f42574z, interfaceC30057d, 12);
            case 13:
                C12473e c12473e3 = new C12473e((C2126b0) this.f42574z, interfaceC30057d, 13);
                c12473e3.f42573y = obj;
                return c12473e3;
            case 14:
                C12473e c12473e4 = new C12473e((C2462x0) this.f42574z, interfaceC30057d, 14);
                c12473e4.f42573y = obj;
                return c12473e4;
            case 15:
                return new C12473e((C2570m) this.f42573y, (Function1) this.f42574z, interfaceC30057d, 15);
            case 16:
                return new C12473e((C2659y0) this.f42574z, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C12473e((C2659y0) this.f42574z, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C12473e((InterfaceC13058l) this.f42573y, (Function1) this.f42574z, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C12473e c12473e5 = new C12473e((InterfaceC28601c1) this.f42574z, interfaceC30057d, 19);
                c12473e5.f42573y = obj;
                return c12473e5;
            case 20:
                return new C12473e((AbstractC12605c) this.f42573y, (InterfaceC28601c1) this.f42574z, interfaceC30057d, 20);
            case 21:
                return new C12473e((InterfaceC28670t2) this.f42574z, this.f42573y, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C12473e((C3247j) this.f42573y, (C25542j) this.f42574z, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C12473e c12473e6 = new C12473e((C3277o) this.f42574z, interfaceC30057d, 23);
                c12473e6.f42573y = obj;
                return c12473e6;
            case 24:
                C12473e c12473e7 = new C12473e((C3958f0) this.f42574z, interfaceC30057d, 24);
                c12473e7.f42573y = obj;
                return c12473e7;
            case 25:
                C12473e c12473e8 = new C12473e((C11215n0) this.f42574z, interfaceC30057d, 25);
                c12473e8.f42573y = obj;
                return c12473e8;
            case 26:
                return new C12473e((C11215n0) this.f42573y, (Boolean) this.f42574z, interfaceC30057d, 26);
            case 27:
                return new C12473e((C11449b) this.f42573y, (C11457j) this.f42574z, interfaceC30057d, 27);
            case 28:
                return new C12473e((InterfaceC3027k1) this.f42573y, (C11453f) this.f42574z, interfaceC30057d, 28);
            default:
                return new C12473e((C11458k) this.f42573y, (C2319y) this.f42574z, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f42571w) {
            case 0:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C12473e) create((InterfaceC1618q0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C12473e) create((InterfaceC2134h) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                ((C12473e) create((C2389i2) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 15:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C12473e) create((InterfaceC34476v) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C12473e) create((C3281s) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C12473e) create((C11197e0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 27:
                return ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            default:
                ((C12473e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:213:0x037a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0384 A[PHI: r7
      0x0384: PHI (r7v9 java.lang.Object) = (r7v8 java.lang.Object), (r7v11 java.lang.Object) binds: [B:214:0x0380, B:204:0x0351] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x039c  */
    /* JADX WARN: Code duplicated, block: B:224:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:227:0x03bf A[PHI: r3 r7
      0x03bf: PHI (r3v38 java.lang.Object) = (r3v30 java.lang.Object), (r3v52 java.lang.Object) binds: [B:225:0x03bb, B:203:0x0345] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r7v12 l83.n) = (r7v10 l83.n), (r7v19 l83.n) binds: [B:225:0x03bb, B:203:0x0345] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x03cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:238:0x03e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:242:0x03f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:246:0x0405  */
    /* JADX WARN: Code duplicated, block: B:249:0x040a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0418  */
    /* JADX WARN: Code duplicated, block: B:254:0x041e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0424  */
    /* JADX WARN: Code duplicated, block: B:261:0x0438  */
    /* JADX WARN: Code duplicated, block: B:286:0x049d A[PHI: r7
      0x049d: PHI (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v7 java.lang.Object) binds: [B:284:0x049a, B:274:0x0467] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:289:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:291:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:292:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:546:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v45, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r8v2, types: [c93.m, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x01b6 -> B:114:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x009f -> B:43:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C12473e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12473e(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f42571w = i13;
        this.f42573y = obj;
        this.f42574z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12473e(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f42571w = i13;
        this.f42574z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12473e(InterfaceC28670t2 interfaceC28670t2, Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f42571w = i13;
        this.f42574z = interfaceC28670t2;
        this.f42573y = obj;
    }
}
