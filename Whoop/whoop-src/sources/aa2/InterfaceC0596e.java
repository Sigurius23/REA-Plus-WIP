package aa2;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: aa2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Laa2/e;", "", "Laa2/g;", UserState.Sources.USER, "Ll83/a0;", "b", "(Laa2/g;Lq83/d;)Ljava/lang/Object;", "Laa2/i;", "profile", "e", "(Laa2/i;Lq83/d;)Ljava/lang/Object;", "d", "(Lq83/d;)Ljava/lang/Object;", "a", "f", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC0596e {

    /* JADX INFO: renamed from: aa2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.dao.UserDao", m100430f = "UserDao.kt", m100431l = {34, 35}, m100432m = "nukeUserInfo$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f2104w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f2105x;

        /* JADX INFO: renamed from: z */
        int f2107z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f2105x = obj;
            this.f2107z |= Integer.MIN_VALUE;
            return InterfaceC0596e.m1555g(InterfaceC0596e.this, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r5.mo1558c(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m1555g(aa2.InterfaceC0596e r5, q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            boolean r0 = r6 instanceof aa2.InterfaceC0596e.a
            if (r0 == 0) goto L13
            r0 = r6
            aa2.e$a r0 = (aa2.InterfaceC0596e.a) r0
            int r1 = r0.f2107z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2107z = r1
            goto L18
        L13:
            aa2.e$a r0 = new aa2.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2105x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f2107z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f2104w
            aa2.e r5 = (aa2.InterfaceC0596e) r5
            p505ts.AbstractC34132o.m107864I(r6)
            goto L58
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.f2104w
            aa2.e r5 = (aa2.InterfaceC0596e) r5
            p505ts.AbstractC34132o.m107864I(r6)
            goto L4c
        L3e:
            p505ts.AbstractC34132o.m107864I(r6)
            r0.f2104w = r5
            r0.f2107z = r4
            java.lang.Object r6 = r5.mo1561f(r0)
            if (r6 != r1) goto L4c
            goto L57
        L4c:
            r6 = 0
            r0.f2104w = r6
            r0.f2107z = r3
            java.lang.Object r5 = r5.mo1558c(r0)
            if (r5 != r1) goto L58
        L57:
            return r1
        L58:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aa2.InterfaceC0596e.m1555g(aa2.e, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    Object mo1556a(InterfaceC30057d<? super C0600i> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo1557b(C0598g c0598g, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo1558c(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo1559d(InterfaceC30057d<? super C0598g> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    Object mo1560e(C0600i c0600i, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo1561f(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    default Object mo1562h(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m1555g(this, interfaceC30057d);
    }
}
