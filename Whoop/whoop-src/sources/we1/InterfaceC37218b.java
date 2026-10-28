package we1;

import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: we1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lwe1/b;", "", "", "Lwe1/e;", "entitlements", "Ll83/a0;", "b", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "a", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "getEntitlements", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC37218b {

    /* JADX INFO: renamed from: we1.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementDao", m100430f = "EntitlementDao.kt", m100431l = {14, 15}, m100432m = "update$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f159139E;

        /* JADX INFO: renamed from: w */
        Object f159140w;

        /* JADX INFO: renamed from: x */
        Object f159141x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159142y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159142y = obj;
            this.f159139E |= Integer.MIN_VALUE;
            return InterfaceC37218b.m119273c(InterfaceC37218b.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.mo119274a(r6, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m119273c(we1.InterfaceC37218b r5, java.util.List<we1.C37221e> r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            boolean r0 = r7 instanceof we1.InterfaceC37218b.a
            if (r0 == 0) goto L13
            r0 = r7
            we1.b$a r0 = (we1.InterfaceC37218b.a) r0
            int r1 = r0.f159139E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159139E = r1
            goto L18
        L13:
            we1.b$a r0 = new we1.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f159142y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f159139E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f159141x
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r0.f159140w
            we1.b r5 = (we1.InterfaceC37218b) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L65
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r5 = r0.f159141x
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.f159140w
            we1.b r5 = (we1.InterfaceC37218b) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L57
        L47:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f159140w = r5
            r0.f159141x = r6
            r0.f159139E = r4
            java.lang.Object r7 = r5.deleteAll(r0)
            if (r7 != r1) goto L57
            goto L64
        L57:
            r7 = 0
            r0.f159140w = r7
            r0.f159141x = r7
            r0.f159139E = r3
            java.lang.Object r5 = r5.mo119274a(r6, r0)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.InterfaceC37218b.m119273c(we1.b, java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    Object mo119274a(List<C37221e> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    default Object mo119275b(List<C37221e> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m119273c(this, list, interfaceC30057d);
    }

    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object getEntitlements(InterfaceC30057d<? super List<C37221e>> interfaceC30057d);
}
