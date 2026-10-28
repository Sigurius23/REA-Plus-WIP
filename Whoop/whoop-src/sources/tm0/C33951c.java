package tm0;

import androidx.health.platform.client.proto.C1533u;
import mm0.InterfaceC25682a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vm0.InterfaceC36149g;

/* JADX INFO: renamed from: tm0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ltm0/c;", "Ltm0/a;", "Lmm0/a;", "bffCache", "Lvm0/g;", "cacheReporter", "<init>", "(Lmm0/a;Lvm0/g;)V", "Ll83/a0;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lmm0/a;", "b", "Lvm0/g;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33951c implements InterfaceC33949a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25682a bffCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC36149g cacheReporter;

    /* JADX INFO: renamed from: tm0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.nuke.CacheNuker", m100430f = "CacheNuke.kt", m100431l = {21, C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "nukeAll", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f142362w;

        /* JADX INFO: renamed from: y */
        int f142364y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f142362w = obj;
            this.f142364y |= Integer.MIN_VALUE;
            return C33951c.this.mo107389a(this);
        }
    }

    public C33951c(InterfaceC25682a bffCache, InterfaceC36149g cacheReporter) {
        AbstractC22676k.m65750j(bffCache, "bffCache");
        AbstractC22676k.m65750j(cacheReporter, "cacheReporter");
        this.bffCache = bffCache;
        this.cacheReporter = cacheReporter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.mo114991d(r0) == r1) goto L21;
     */
    @Override // tm0.InterfaceC33949a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo107389a(q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof tm0.C33951c.a
            if (r0 == 0) goto L13
            r0 = r6
            tm0.c$a r0 = (tm0.C33951c.a) r0
            int r1 = r0.f142364y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142364y = r1
            goto L18
        L13:
            tm0.c$a r0 = new tm0.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f142362w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f142364y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L44
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            mm0.a r6 = r5.bffCache
            r0.f142364y = r4
            java.lang.Object r6 = r6.mo75623f(r0)
            if (r6 != r1) goto L44
            goto L55
        L44:
            vm0.g r6 = r5.cacheReporter
            vm0.f r2 = vm0.EnumC36148f.NUKE
            r6.mo114993f(r2)
            vm0.g r6 = r5.cacheReporter
            r0.f142364y = r3
            java.lang.Object r6 = r6.mo114991d(r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tm0.C33951c.mo107389a(q83.d):java.lang.Object");
    }
}
