package g20;

import android.app.Activity;
import androidx.health.platform.client.proto.C1533u;
import b20.EnumC2324d;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivity;
import dc3.InterfaceC11936u;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import h20.C16621a;
import h20.C16657g;
import h20.C16776z4;
import h40.C16845k;
import i20.AbstractC17981v;
import i20.C17932c0;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import j00.C21103h;
import l83.C23454a0;
import l83.C23465k;
import lb.C23576s;
import mc.C25407d;
import n10.AbstractC26118b;
import o20.C27457b;
import p027b3.C2442t0;
import p077d0.C11350f1;
import p091dg.C12002a;
import p132f0.EnumC13840z0;
import p164g2.InterfaceC15237i;
import p180h0.C16360a3;
import p180h0.C16372c3;
import p180h0.C16375d0;
import p180h0.C16381e0;
import p180h0.C16382e1;
import p180h0.C16386f0;
import p180h0.C16398h2;
import p180h0.C16422m1;
import p180h0.C16435p;
import p180h0.C16489z3;
import p180h0.InterfaceC16392g1;
import p180h0.InterfaceC16397h1;
import p180h0.InterfaceC16413k2;
import p218ic.C18354e;
import p292l1.C23203x4;
import p316m1.C24893b0;
import p316m1.C24902g;
import p326mf.C25501u;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28661r1;
import p390p1.InterfaceC28690z0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p551vf.C35943h;
import p708hb2.C17095c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s40.C32132a;
import s83.AbstractC32275i;
import y00.C38915o4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: g20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C15270p extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f57337E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57338w;

    /* JADX INFO: renamed from: x */
    public int f57339x;

    /* JADX INFO: renamed from: y */
    public Object f57340y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f57341z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15270p(InterfaceC3027k1 interfaceC3027k1, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f57338w = 12;
        this.f57341z = interfaceC3027k1;
        this.f57337E = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function3, s83.i] */
    /* JADX WARN: Type inference failed for: r10v10, types: [kotlin.jvm.functions.Function3, s83.i] */
    /* JADX WARN: Type inference failed for: r1v17, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v7, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f57338w) {
            case 0:
                return new C15270p((C15272r) this.f57340y, (InterfaceC38802c8) this.f57341z, (C32132a) this.f57337E, interfaceC30057d, 0);
            case 1:
                return new C15270p((InterfaceC28601c1) this.f57340y, (InterfaceC15237i) this.f57341z, this.f57339x, (InterfaceC28601c1) this.f57337E, interfaceC30057d);
            case 2:
                return new C15270p((C11350f1) this.f57340y, (InterfaceC28601c1) this.f57341z, (InterfaceC28690z0) this.f57337E, interfaceC30057d, 2);
            case 3:
                C15270p c15270p = new C15270p((C16435p) this.f57337E, (Function3) this.f57341z, interfaceC30057d);
                c15270p.f57340y = obj;
                return c15270p;
            case 4:
                C15270p c15270p2 = new C15270p((C16375d0) this.f57341z, (InterfaceC4351m) this.f57337E, interfaceC30057d, 4);
                c15270p2.f57340y = obj;
                return c15270p2;
            case 5:
                return new C15270p((C16375d0) this.f57340y, (EnumC13840z0) this.f57341z, (InterfaceC4351m) this.f57337E, interfaceC30057d, 5);
            case 6:
                C15270p c15270p3 = new C15270p((C16386f0) this.f57341z, (InterfaceC4351m) this.f57337E, interfaceC30057d);
                c15270p3.f57340y = obj;
                return c15270p3;
            case 7:
                return new C15270p((C16386f0) this.f57340y, (EnumC13840z0) this.f57341z, (InterfaceC4351m) this.f57337E, interfaceC30057d);
            case 8:
                C15270p c15270p4 = new C15270p((C16382e1) this.f57341z, (C16422m1) this.f57337E, interfaceC30057d, 8);
                c15270p4.f57340y = obj;
                return c15270p4;
            case 9:
                C15270p c15270p5 = new C15270p((C16382e1) this.f57341z, (C16372c3) this.f57337E, interfaceC30057d, 9);
                c15270p5.f57340y = obj;
                return c15270p5;
            case 10:
                C15270p c15270p6 = new C15270p((C16372c3) this.f57341z, (InterfaceC4351m) this.f57337E, interfaceC30057d, 10);
                c15270p6.f57340y = obj;
                return c15270p6;
            case 11:
                return new C15270p((Function3) this.f57340y, (C16398h2) this.f57341z, (C34472r) this.f57337E, interfaceC30057d);
            case 12:
                C15270p c15270p7 = new C15270p((InterfaceC3027k1) this.f57341z, (InterfaceC4351m) this.f57337E, interfaceC30057d);
                c15270p7.f57340y = obj;
                return c15270p7;
            case 13:
                C15270p c15270p8 = new C15270p((InterfaceC34476v) this.f57341z, (C16489z3) this.f57337E, interfaceC30057d, 13);
                c15270p8.f57340y = obj;
                return c15270p8;
            case 14:
                return new C15270p((C16657g) this.f57340y, (C27457b) this.f57341z, (String) this.f57337E, interfaceC30057d, 14);
            case 15:
                C15270p c15270p9 = new C15270p((C16776z4) this.f57341z, (C38915o4) this.f57337E, interfaceC30057d, 15);
                c15270p9.f57340y = obj;
                return c15270p9;
            case 16:
                return new C15270p((C16845k) this.f57340y, (AddressElementActivity) this.f57341z, (AbstractC17981v) this.f57337E, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C15270p((AutocompleteActivity) this.f57340y, (C17932c0) this.f57341z, (C16845k) this.f57337E, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C15270p c15270p10 = new C15270p((C17095c) this.f57341z, (String) this.f57337E, interfaceC30057d, 18);
                c15270p10.f57340y = obj;
                return c15270p10;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C15270p c15270p11 = new C15270p((C21103h) this.f57341z, (C19962a) this.f57337E, interfaceC30057d, 19);
                c15270p11.f57340y = obj;
                return c15270p11;
            case 20:
                return new C15270p((InterfaceC30063j) this.f57340y, (InterfaceC13058l) this.f57341z, (InterfaceC28661r1) this.f57337E, interfaceC30057d, 20);
            case 21:
                return new C15270p((Activity) this.f57340y, (String) this.f57341z, (C2442t0) this.f57337E, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C15270p c15270p12 = new C15270p((InterfaceC4351m) this.f57341z, (Function1) this.f57337E, interfaceC30057d, 22);
                c15270p12.f57340y = obj;
                return c15270p12;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C15270p((C22669g0) this.f57341z, (C23576s) this.f57337E, interfaceC30057d, 23);
            case 24:
                C15270p c15270p13 = new C15270p((Function3) this.f57341z, (C24902g) this.f57337E, interfaceC30057d, 24);
                c15270p13.f57340y = obj;
                return c15270p13;
            case 25:
                C15270p c15270p14 = new C15270p((InterfaceC4352n) this.f57341z, (C24902g) this.f57337E, interfaceC30057d, 25);
                c15270p14.f57340y = obj;
                return c15270p14;
            case 26:
                return new C15270p((InterfaceC13075p1) this.f57341z, (C23203x4) this.f57337E, interfaceC30057d, 26);
            case 27:
                C15270p c15270p15 = new C15270p((C18354e) this.f57341z, (C25407d) this.f57337E, interfaceC30057d, 27);
                c15270p15.f57340y = obj;
                return c15270p15;
            case 28:
                return new C15270p((C25501u) this.f57340y, (C12002a) this.f57341z, (C35943h) this.f57337E, interfaceC30057d, 28);
            default:
                return new C15270p((InterfaceC4339a) this.f57340y, (AbstractC26118b) this.f57341z, (EnumC2324d) this.f57337E, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f57338w) {
            case 0:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                C15270p c15270p = (C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c15270p.invokeSuspend(c23454a0);
                return c23454a0;
            case 2:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C15270p) create((InterfaceC16397h1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C15270p) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C15270p) create((C16381e0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C15270p) create((InterfaceC16392g1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C15270p) create((C16360a3) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C15270p) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C15270p) create((C16621a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C15270p) create((String) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C15270p) create((C24893b0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C15270p) create((C23465k) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 27:
                return ((C15270p) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C15270p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:460:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v47, types: [kotlin.jvm.functions.Function3, s83.i] */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.jvm.functions.Function3, s83.i] */
    /* JADX WARN: Type inference failed for: r3v27, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r3v39, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r4v18, types: [c93.m, s83.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0011
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g20.C15270p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15270p(C16435p c16435p, Function3 function3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f57338w = 3;
        this.f57341z = (AbstractC32275i) function3;
        this.f57337E = c16435p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15270p(C16386f0 c16386f0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f57338w = 6;
        this.f57341z = c16386f0;
        this.f57337E = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15270p(C16386f0 c16386f0, EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f57338w = 7;
        this.f57340y = c16386f0;
        this.f57341z = enumC13840z0;
        this.f57337E = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15270p(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f57338w = i13;
        this.f57340y = obj;
        this.f57341z = obj2;
        this.f57337E = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15270p(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f57338w = i13;
        this.f57341z = obj;
        this.f57337E = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15270p(Function3 function3, C16398h2 c16398h2, C34472r c34472r, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f57338w = 11;
        this.f57340y = (AbstractC32275i) function3;
        this.f57341z = c16398h2;
        this.f57337E = c34472r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15270p(InterfaceC28601c1 interfaceC28601c1, InterfaceC15237i interfaceC15237i, int i13, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f57338w = 1;
        this.f57340y = interfaceC28601c1;
        this.f57341z = interfaceC15237i;
        this.f57339x = i13;
        this.f57337E = interfaceC28601c2;
    }
}
