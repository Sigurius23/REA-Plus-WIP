package d33;

import a30.C0320q0;
import bc3.InterfaceC2994c0;
import bi.C3278p;
import c93.InterfaceC4351m;
import e33.C12662v0;
import h20.C16761x1;
import java.util.List;
import java.util.Map;
import jo2.C21841d;
import l83.C23454a0;
import n20.C26181p;
import p450r5.C30929c;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import stream.video.sfu.models.TrackType;
import t23.C33368c0;
import t23.C33384f;
import z20.C40013g;
import z20.C40014h;

/* JADX INFO: renamed from: d33.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11629t0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f37550E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f37551F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f37552G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37553w = 0;

    /* JADX INFO: renamed from: x */
    public int f37554x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f37555y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f37556z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11629t0(C11602h1 c11602h1, TrackType trackType, boolean z4, Map map, String str, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37556z = c11602h1;
        this.f37550E = trackType;
        this.f37555y = z4;
        this.f37551F = map;
        this.f37552G = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37553w) {
            case 0:
                return new C11629t0((C11602h1) this.f37556z, (TrackType) this.f37550E, this.f37555y, (Map) this.f37551F, (String) this.f37552G, interfaceC30057d);
            case 1:
                return new C11629t0((C12662v0) this.f37556z, this.f37555y, (List) this.f37550E, (List) this.f37551F, (C3278p) this.f37552G, interfaceC30057d);
            case 2:
                return new C11629t0((C26181p) this.f37556z, (C0320q0) this.f37550E, (C16761x1) this.f37551F, this.f37555y, (C21841d) this.f37552G, interfaceC30057d);
            case 3:
                C11629t0 c11629t0 = new C11629t0(this.f37555y, (C33384f) this.f37550E, (C33368c0) this.f37551F, (C30929c) this.f37552G, interfaceC30057d);
                c11629t0.f37556z = obj;
                return c11629t0;
            default:
                C11629t0 c11629t1 = new C11629t0((List) this.f37550E, (C40013g) this.f37551F, (C40014h) this.f37552G, this.f37555y, interfaceC30057d);
                c11629t1.f37556z = obj;
                return c11629t1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f37553w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C11629t0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x022c  */
    /* JADX WARN: Code duplicated, block: B:225:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:227:0x05b0  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x020e, code lost:
    
        if (bc3.AbstractC3006f0.m8729w(r3) == false) goto L107;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            Method dump skipped, instruction units count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11629t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11629t0(C12662v0 c12662v0, boolean z4, List list, List list2, C3278p c3278p, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37556z = c12662v0;
        this.f37555y = z4;
        this.f37550E = list;
        this.f37551F = list2;
        this.f37552G = c3278p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11629t0(List list, C40013g c40013g, C40014h c40014h, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37550E = list;
        this.f37551F = c40013g;
        this.f37552G = c40014h;
        this.f37555y = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11629t0(C26181p c26181p, C0320q0 c0320q0, C16761x1 c16761x1, boolean z4, C21841d c21841d, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37556z = c26181p;
        this.f37550E = c0320q0;
        this.f37551F = c16761x1;
        this.f37555y = z4;
        this.f37552G = c21841d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11629t0(boolean z4, C33384f c33384f, C33368c0 c33368c0, C30929c c30929c, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37555y = z4;
        this.f37550E = c33384f;
        this.f37551F = c33368c0;
        this.f37552G = c30929c;
    }
}
