package ha0;

import androidx.health.platform.client.proto.C1533u;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ha0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000bH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lha0/e;", "", "", "Lha0/h;", "activityList", "Ll83/a0;", "d", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "c", "(Lq83/d;)Ljava/lang/Object;", "b", "Lec3/l;", "a", "()Lec3/l;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17052e {

    /* JADX INFO: renamed from: ha0.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.data.RecentActivitiesDao", m100430f = "RecentActivitiesDao.kt", m100431l = {21, C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "updateActivities$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f65563E;

        /* JADX INFO: renamed from: w */
        Object f65564w;

        /* JADX INFO: renamed from: x */
        Object f65565x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f65566y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f65566y = obj;
            this.f65563E |= Integer.MIN_VALUE;
            return InterfaceC17052e.m48147e(InterfaceC17052e.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.mo48151d(r6, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m48147e(ha0.InterfaceC17052e r5, java.util.List<ha0.C17055h> r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            boolean r0 = r7 instanceof ha0.InterfaceC17052e.a
            if (r0 == 0) goto L13
            r0 = r7
            ha0.e$a r0 = (ha0.InterfaceC17052e.a) r0
            int r1 = r0.f65563E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65563E = r1
            goto L18
        L13:
            ha0.e$a r0 = new ha0.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f65566y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f65563E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f65565x
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r0.f65564w
            ha0.e r5 = (ha0.InterfaceC17052e) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L65
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r5 = r0.f65565x
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.f65564w
            ha0.e r5 = (ha0.InterfaceC17052e) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L57
        L47:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f65564w = r5
            r0.f65565x = r6
            r0.f65563E = r4
            java.lang.Object r7 = r5.mo48150c(r0)
            if (r7 != r1) goto L57
            goto L64
        L57:
            r7 = 0
            r0.f65564w = r7
            r0.f65565x = r7
            r0.f65563E = r3
            java.lang.Object r5 = r5.mo48151d(r6, r0)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.InterfaceC17052e.m48147e(ha0.e, java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    InterfaceC13058l mo48148a();

    /* JADX INFO: renamed from: b */
    default Object mo48149b(List<C17055h> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m48147e(this, list, interfaceC30057d);
    }

    /* JADX INFO: renamed from: c */
    Object mo48150c(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo48151d(List<C17055h> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
