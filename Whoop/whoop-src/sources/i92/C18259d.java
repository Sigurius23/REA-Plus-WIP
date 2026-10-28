package i92;

import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13072o1;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: i92.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Li92/d;", "", "Ll83/h;", "Liy1/c;", "metricWriter", "<init>", "(Ll83/h;)V", "", "tag", "Ll83/a0;", "a", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ll83/h;", "Lec3/o1;", "b", "Lec3/o1;", "_enforcementEvents", "Lec3/l;", "c", "Lec3/l;", "()Lec3/l;", "enforcementEvents", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18259d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13072o1 _enforcementEvents;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l enforcementEvents;

    /* JADX INFO: renamed from: i92.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.MfaEnforcer", m100430f = "MfaEnforcer.kt", m100431l = {20, 21}, m100432m = "enforcement$core_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f71079w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f71080x;

        /* JADX INFO: renamed from: z */
        int f71082z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71080x = obj;
            this.f71082z |= Integer.MIN_VALUE;
            return C18259d.this.m52602a(null, this);
        }
    }

    public C18259d(InterfaceC23462h metricWriter) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.metricWriter = metricWriter;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this._enforcementEvents = c13096w1M36592b;
        this.enforcementEvents = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r14.mo58700a(r5, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m52602a(java.lang.String r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof i92.C18259d.a
            if (r0 == 0) goto L13
            r0 = r15
            i92.d$a r0 = (i92.C18259d.a) r0
            int r1 = r0.f71082z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71082z = r1
            goto L18
        L13:
            i92.d$a r0 = new i92.d$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f71080x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f71082z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r14 = r0.f71079w
            java.lang.String r14 = (java.lang.String) r14
            p505ts.AbstractC34132o.m107864I(r15)
            goto L71
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            java.lang.Object r14 = r0.f71079w
            java.lang.String r14 = (java.lang.String) r14
            p505ts.AbstractC34132o.m107864I(r15)
            goto L4f
        L3f:
            p505ts.AbstractC34132o.m107864I(r15)
            ec3.o1 r15 = r13._enforcementEvents
            r0.f71079w = r3
            r0.f71082z = r5
            java.lang.Object r14 = r15.emit(r14, r0)
            if (r14 != r1) goto L4f
            goto L70
        L4f:
            l83.h r14 = r13.metricWriter
            java.lang.Object r14 = r14.getValue()
            iy1.c r14 = (iy1.InterfaceC21030c) r14
            jy1.a r5 = new jy1.a
            r11 = 21
            r12 = 0
            r6 = 0
            java.lang.String r7 = "mfa.enforcement.signal"
            r8 = 0
            m83.y r9 = m83.C25271y.f99162w
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.f71079w = r3
            r0.f71082z = r4
            java.lang.Object r14 = r14.mo58700a(r5, r0)
            if (r14 != r1) goto L71
        L70:
            return r1
        L71:
            l83.a0 r14 = l83.C23454a0.f92919a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: i92.C18259d.m52602a(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13058l getEnforcementEvents() {
        return this.enforcementEvents;
    }
}
