package p711j31;

import com.mapbox.maps.MapboxMap;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p181h2.C16617b;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j31.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0014\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lj31/o;", "Lj31/b;", "", "stiffness", "<init>", "(F)V", "Lj31/d;", "position", "Lh2/b;", MapboxMap.QFE_OFFSET, "Ll83/a0;", "b", "(Lj31/d;JLq83/d;)Ljava/lang/Object;", "a", "F", "Ld0/e;", "Ld0/o;", "Ld0/e;", "animatable", "<set-?>", "c", "Lp1/c1;", "getPosition", "()Lj31/d;", "(Lj31/d;)V", "()J", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21284o implements InterfaceC21271b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11344e animatable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28601c1 position;

    /* JADX INFO: renamed from: j31.o$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.SpringDragCancelledAnimation", m100430f = "DragCancelledAnimation.kt", m100431l = {50, 51}, m100432m = "dragCancelled-d-4ec7I", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f81321E;

        /* JADX INFO: renamed from: w */
        Object f81322w;

        /* JADX INFO: renamed from: x */
        long f81323x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f81324y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81324y = obj;
            this.f81321E |= Integer.MIN_VALUE;
            return C21284o.this.mo59685b(null, 0L, this);
        }
    }

    public C21284o(float f13) {
        this.stiffness = f13;
        this.animatable = new C11344e(new C16617b(0L), AbstractC11348f.f36372n, null, 12);
        this.position = AbstractC28683x.m87272z(null);
    }

    /* JADX INFO: renamed from: c */
    private void m59786c(C21273d c21273d) {
        this.position.setValue(c21273d);
    }

    @Override // p711j31.InterfaceC21271b
    /* JADX INFO: renamed from: a */
    public long mo59684a() {
        return ((C16617b) this.animatable.m30549e()).f63937a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (p077d0.C11344e.m30547d(r5, r3, r7, null, r9, 12) == r4) goto L22;
     */
    @Override // p711j31.InterfaceC21271b
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo59685b(p711j31.C21273d r19, long r20, q83.InterfaceC30057d<? super l83.C23454a0> r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            boolean r4 = r3 instanceof p711j31.C21284o.a
            if (r4 == 0) goto L1a
            r4 = r3
            j31.o$a r4 = (p711j31.C21284o.a) r4
            int r5 = r4.f81321E
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1a
            int r5 = r5 - r6
            r4.f81321E = r5
        L18:
            r9 = r4
            goto L20
        L1a:
            j31.o$a r4 = new j31.o$a
            r4.<init>(r3)
            goto L18
        L20:
            java.lang.Object r3 = r9.f81324y
            r83.a r4 = r83.EnumC31071a.f128113w
            int r5 = r9.f81321E
            r6 = 2
            r7 = 1
            r11 = 0
            if (r5 == 0) goto L49
            if (r5 == r7) goto L3f
            if (r5 != r6) goto L37
            java.lang.Object r1 = r9.f81322w
            j31.d r1 = (p711j31.C21273d) r1
            p505ts.AbstractC34132o.m107864I(r3)
            goto La0
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            long r1 = r9.f81323x
            java.lang.Object r5 = r9.f81322w
            j31.d r5 = (p711j31.C21273d) r5
            p505ts.AbstractC34132o.m107864I(r3)
            goto L63
        L49:
            p505ts.AbstractC34132o.m107864I(r3)
            r18.m59786c(r19)
            d0.e r3 = r0.animatable
            h2.b r5 = new h2.b
            r5.<init>(r1)
            r9.f81322w = r11
            r9.f81323x = r1
            r9.f81321E = r7
            java.lang.Object r3 = r3.m30551g(r5, r9)
            if (r3 != r4) goto L63
            goto L9f
        L63:
            d0.e r5 = r0.animatable
            h2.b r3 = new h2.b
            r12 = 0
            r3.<init>(r12)
            float r8 = r0.stiffness
            r10 = 1056964608(0x3f000000, float:0.5)
            int r12 = java.lang.Float.floatToRawIntBits(r10)
            long r12 = (long) r12
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r14 = (long) r10
            r10 = 32
            long r12 = r12 << r10
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r16
            long r12 = r12 | r14
            h2.b r10 = new h2.b
            r10.<init>(r12)
            r12 = 0
            d0.i1 r7 = p077d0.AbstractC11348f.m30573u(r12, r8, r7, r10)
            r9.f81322w = r11
            r9.f81323x = r1
            r9.f81321E = r6
            r8 = 0
            r10 = 12
            r6 = r3
            java.lang.Object r1 = p077d0.C11344e.m30547d(r5, r6, r7, r8, r9, r10)
            if (r1 != r4) goto La0
        L9f:
            return r4
        La0:
            r0.m59786c(r11)
            l83.a0 r1 = l83.C23454a0.f92919a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p711j31.C21284o.mo59685b(j31.d, long, q83.d):java.lang.Object");
    }

    @Override // p711j31.InterfaceC21271b
    public C21273d getPosition() {
        return (C21273d) this.position.getValue();
    }

    public /* synthetic */ C21284o(float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 400.0f : f13);
    }
}
