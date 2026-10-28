package a30;

import androidx.room.AbstractC1848z0;
import androidx.room.InterfaceC1843x1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d33.C11602h1;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import my.C26027a;
import p077d0.C11344e;
import p077d0.C11347e2;
import p077d0.InterfaceC11337c0;
import p238j0.InterfaceC21083i;
import p293l2.C23226c;
import p389p0.C28550t;
import p390p1.InterfaceC28601c1;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import stream.video.sfu.models.TrackType;
import y00.C38966u1;

/* JADX INFO: renamed from: a30.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C0327u extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f1138E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1139F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1140w;

    /* JADX INFO: renamed from: x */
    public int f1141x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f1142y;

    /* JADX INFO: renamed from: z */
    public Object f1143z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327u(C0274a0 c0274a0, C26027a c26027a, boolean z4, C38966u1 c38966u1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1140w = 0;
        this.f1143z = c0274a0;
        this.f1138E = c26027a;
        this.f1142y = z4;
        this.f1139F = c38966u1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1140w) {
            case 0:
                return new C0327u((C0274a0) this.f1143z, (C26027a) this.f1138E, this.f1142y, (C38966u1) this.f1139F, interfaceC30057d);
            case 1:
                C0327u c0327u = new C0327u((AbstractC1848z0) this.f1138E, this.f1142y, (String[]) this.f1139F, interfaceC30057d, 1);
                c0327u.f1143z = obj;
                return c0327u;
            case 2:
                C0327u c0327u2 = new C0327u((C11602h1) this.f1138E, (TrackType) this.f1139F, this.f1142y, interfaceC30057d);
                c0327u2.f1143z = obj;
                return c0327u2;
            case 3:
                return new C0327u((C11602h1) this.f1143z, (List) this.f1138E, (List) this.f1139F, this.f1142y, interfaceC30057d);
            case 4:
                return new C0327u((C11344e) this.f1143z, this.f1142y, (C11347e2) this.f1138E, (InterfaceC4339a) this.f1139F, interfaceC30057d);
            case 5:
                return new C0327u(this.f1142y, (C28550t) this.f1143z, (InterfaceC11337c0) this.f1138E, (C23226c) this.f1139F, interfaceC30057d);
            default:
                return new C0327u((InterfaceC28601c1) this.f1138E, this.f1142y, (InterfaceC21083i) this.f1139F, interfaceC30057d, 6);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1140w) {
            case 0:
                return ((C0327u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C0327u) create((InterfaceC1843x1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C0327u) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C0327u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C0327u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C0327u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C0327u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:109:0x022a A[PHI: r1
      0x022a: PHI (r1v13 androidx.room.x1) = (r1v10 androidx.room.x1), (r1v10 androidx.room.x1), (r1v15 androidx.room.x1) binds: [B:105:0x0219, B:107:0x0227, B:99:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x023f A[PHI: r1
      0x023f: PHI (r1v16 androidx.room.x1) = (r1v13 androidx.room.x1), (r1v18 androidx.room.x1) binds: [B:110:0x023c, B:98:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x024b A[PHI: r1 r2
      0x024b: PHI (r1v19 androidx.room.x1) = (r1v16 androidx.room.x1), (r1v21 androidx.room.x1) binds: [B:113:0x0248, B:97:0x01dd] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r2v13 java.lang.Object) = (r2v12 java.lang.Object), (r2v19 java.lang.Object) binds: [B:113:0x0248, B:97:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0253  */
    /* JADX WARN: Code duplicated, block: B:120:0x0261 A[PHI: r1
      0x0261: PHI (r1v22 androidx.room.x1) = (r1v19 androidx.room.x1), (r1v25 androidx.room.x1) binds: [B:118:0x025e, B:96:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026c, code lost:
    
        if (p505ts.AbstractC34132o.m107890r(r1, "VACUUM", r20) == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r0 == r13) goto L41;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0327u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327u(C11344e c11344e, boolean z4, C11347e2 c11347e2, InterfaceC4339a interfaceC4339a, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1140w = 4;
        this.f1143z = c11344e;
        this.f1142y = z4;
        this.f1138E = c11347e2;
        this.f1139F = interfaceC4339a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327u(C11602h1 c11602h1, List list, List list2, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1140w = 3;
        this.f1143z = c11602h1;
        this.f1138E = list;
        this.f1139F = list2;
        this.f1142y = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327u(C11602h1 c11602h1, TrackType trackType, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1140w = 2;
        this.f1138E = c11602h1;
        this.f1139F = trackType;
        this.f1142y = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0327u(Object obj, boolean z4, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1140w = i13;
        this.f1138E = obj;
        this.f1142y = z4;
        this.f1139F = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327u(boolean z4, C28550t c28550t, InterfaceC11337c0 interfaceC11337c0, C23226c c23226c, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1140w = 5;
        this.f1142y = z4;
        this.f1143z = c28550t;
        this.f1138E = interfaceC11337c0;
        this.f1139F = c23226c;
    }
}
