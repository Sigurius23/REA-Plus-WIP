package o23;

import androidx.glance.session.SessionWorker;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.link.LinkActivity;
import d00.C11433l;
import d10.C11465b;
import e10.InterfaceC12536b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import p014aj.C0928c;
import p138f6.AbstractC14134f;
import p164g2.InterfaceC15237i;
import p390p1.InterfaceC28601c1;
import p395p6.C28936z0;
import p451r6.C30965s;
import p581we.C37187g;
import p581we.C37188g0;
import p605x6.C38006k;
import p631xz.C38747x;
import p647yf.InterfaceC39508u;
import p695zx.C41197s;
import pg3.C29205p;
import q00.C29720i0;
import q20.AbstractC29840y;
import q30.C29938w0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import t10.C33284d;
import t10.C33285e;
import t23.C33368c0;
import ve.C35920e;
import x20.C37855w;
import x20.EnumC37847o;

/* JADX INFO: renamed from: o23.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C27486p extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110719w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f110720x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f110721y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27486p(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110719w = i13;
        this.f110720x = obj;
        this.f110721y = obj2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f110719w) {
            case 0:
                return new C27486p((C27487q) this.f110720x, (InterfaceC27471a) this.f110721y, interfaceC30057d, 0);
            case 1:
                return new C27486p((String) this.f110720x, (C11465b) this.f110721y, interfaceC30057d, 1);
            case 2:
                C27486p c27486p = new C27486p((ArrayList) this.f110721y, interfaceC30057d, 2);
                c27486p.f110720x = obj;
                return c27486p;
            case 3:
                C27486p c27486p2 = new C27486p((Set) this.f110721y, interfaceC30057d, 3);
                c27486p2.f110720x = obj;
                return c27486p2;
            case 4:
                C27486p c27486p3 = new C27486p((C28936z0) this.f110721y, interfaceC30057d, 4);
                c27486p3.f110720x = obj;
                return c27486p3;
            case 5:
                return new C27486p((C29720i0) this.f110720x, (InterfaceC15237i) this.f110721y, interfaceC30057d, 5);
            case 6:
                C27486p c27486p4 = new C27486p((C29938w0) this.f110721y, interfaceC30057d, 6);
                c27486p4.f110720x = obj;
                return c27486p4;
            case 7:
                C27486p c27486p5 = new C27486p((C33284d) this.f110721y, interfaceC30057d, 7);
                c27486p5.f110720x = obj;
                return c27486p5;
            case 8:
                C27486p c27486p6 = new C27486p((C33285e) this.f110721y, interfaceC30057d, 8);
                c27486p6.f110720x = obj;
                return c27486p6;
            case 9:
                return new C27486p((InterfaceC4339a) this.f110720x, (InterfaceC28601c1) this.f110721y, interfaceC30057d, 9);
            case 10:
                C27486p c27486p7 = new C27486p((C33368c0) this.f110721y, interfaceC30057d, 10);
                c27486p7.f110720x = obj;
                return c27486p7;
            case 11:
                C27486p c27486p8 = new C27486p((C29205p) this.f110721y, interfaceC30057d, 11);
                c27486p8.f110720x = obj;
                return c27486p8;
            case 12:
                return new C27486p((String) this.f110720x, (byte[]) this.f110721y, interfaceC30057d, 12);
            case 13:
                return new C27486p((C0928c) this.f110720x, (InterfaceC39508u) this.f110721y, interfaceC30057d, 13);
            case 14:
                return new C27486p((C37187g) this.f110720x, (C37188g0) this.f110721y, interfaceC30057d, 14);
            case 15:
                C27486p c27486p9 = new C27486p((LinkActivity) this.f110721y, interfaceC30057d, 15);
                c27486p9.f110720x = obj;
                return c27486p9;
            case 16:
                C27486p c27486p10 = new C27486p((C37855w) this.f110721y, interfaceC30057d, 16);
                c27486p10.f110720x = obj;
                return c27486p10;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C27486p c27486p11 = new C27486p((SessionWorker) this.f110721y, interfaceC30057d, 17);
                c27486p11.f110720x = obj;
                return c27486p11;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C27486p((C38747x) this.f110720x, (C11433l) this.f110721y, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C27486p((C29938w0) this.f110720x, (String) this.f110721y, interfaceC30057d, 19);
            case 20:
                return new C27486p((AnalyticsRequestV2) this.f110720x, (C29938w0) this.f110721y, interfaceC30057d, 20);
            default:
                return new C27486p((C41197s) this.f110720x, (List) this.f110721y, interfaceC30057d, 21);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f110719w) {
            case 0:
                C27486p c27486p = (C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c27486p.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C27486p c27486p2 = (C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c27486p2.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                return ((C27486p) create((AbstractC14134f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C27486p) create((AbstractC14134f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C27486p) create((C30965s) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                C27486p c27486p3 = (C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c27486p3.invokeSuspend(c23454a2);
                return c23454a2;
            case 6:
                return ((C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                C27486p c27486p4 = (C27486p) create((InterfaceC12536b0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c27486p4.invokeSuspend(c23454a3);
                return c23454a3;
            case 8:
                C27486p c27486p5 = (C27486p) create((AbstractC29840y) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c27486p5.invokeSuspend(c23454a4);
                return c23454a4;
            case 9:
                C27486p c27486p6 = (C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c27486p6.invokeSuspend(c23454a5);
                return c23454a5;
            case 10:
                C27486p c27486p7 = (C27486p) create((List) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c27486p7.invokeSuspend(c23454a6);
                return c23454a6;
            case 11:
                return ((C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                C27486p c27486p8 = (C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a7 = C23454a0.f92919a;
                c27486p8.invokeSuspend(c23454a7);
                return c23454a7;
            case 13:
                return ((C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C27486p) create((C35920e) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                C27486p c27486p9 = (C27486p) create((String) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a8 = C23454a0.f92919a;
                c27486p9.invokeSuspend(c23454a8);
                return c23454a8;
            case 16:
                C27486p c27486p10 = (C27486p) create((EnumC37847o) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a9 = C23454a0.f92919a;
                c27486p10.invokeSuspend(c23454a9);
                return c23454a9;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C27486p) create((C38006k) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C27486p c27486p11 = (C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a10 = C23454a0.f92919a;
                c27486p11.invokeSuspend(c23454a10);
                return c23454a10;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                C27486p c27486p12 = (C27486p) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a11 = C23454a0.f92919a;
                c27486p12.invokeSuspend(c23454a11);
                return c23454a11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:123:0x0303  */
    /* JADX WARN: Code duplicated, block: B:125:0x0313  */
    /* JADX WARN: Code duplicated, block: B:127:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0324  */
    /* JADX WARN: Code duplicated, block: B:130:0x0334  */
    /* JADX WARN: Code duplicated, block: B:132:0x0343  */
    /* JADX WARN: Code duplicated, block: B:134:0x0353  */
    /* JADX WARN: Code duplicated, block: B:137:0x0362  */
    /* JADX WARN: Code duplicated, block: B:139:0x0370  */
    /* JADX WARN: Code duplicated, block: B:303:0x02fe A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v49 java.lang.Object, still in use, count: 2, list:
          (r3v49 java.lang.Object) from 0x02e6: PHI (r3 I:??) = (r3v39 java.lang.Object), (r3v49 java.lang.Object) binds: [B:113:0x02e5, B:301:0x02e6] A[DONT_GENERATE, DONT_INLINE]
          (r3v49 java.lang.Object) from 0x02de: CHECK_CAST (c33.l) (r3v49 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o23.C27486p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27486p(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110719w = i13;
        this.f110721y = obj;
    }
}
