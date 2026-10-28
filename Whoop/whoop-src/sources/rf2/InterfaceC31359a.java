package rf2;

import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sf2.C32448a;

/* JADX INFO: renamed from: rf2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\t\u0010\u0006J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Lrf2/a;", "", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "smartAlarmUserInfo", "Ll83/a0;", "f", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "d", "a", "Lec3/l;", "b", "()Lec3/l;", "Lsf2/a;", "smartUserInfoCompositeId", "g", "(Lsf2/a;Lq83/d;)Ljava/lang/Object;", "", "smartAlarmTriggeredCompositeId", "", "e", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31359a {

    /* JADX INFO: renamed from: rf2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.room.dao.SmartAlarmUserInfoDao", m100430f = "SmartAlarmUserInfoDao.kt", m100431l = {29, 30}, m100432m = "setSmartAlarmUserInfo$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129008E;

        /* JADX INFO: renamed from: w */
        Object f129009w;

        /* JADX INFO: renamed from: x */
        Object f129010x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129011y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129011y = obj;
            this.f129008E |= Integer.MIN_VALUE;
            return InterfaceC31359a.m96433c(InterfaceC31359a.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.mo96438f(r6, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m96433c(rf2.InterfaceC31359a r5, com.whoop.data.local.room.entity.SmartAlarmUserInfo r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            boolean r0 = r7 instanceof rf2.InterfaceC31359a.a
            if (r0 == 0) goto L13
            r0 = r7
            rf2.a$a r0 = (rf2.InterfaceC31359a.a) r0
            int r1 = r0.f129008E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129008E = r1
            goto L18
        L13:
            rf2.a$a r0 = new rf2.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f129011y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f129008E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f129010x
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r5 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r5
            java.lang.Object r5 = r0.f129009w
            rf2.a r5 = (rf2.InterfaceC31359a) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L65
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r5 = r0.f129010x
            r6 = r5
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r6 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r6
            java.lang.Object r5 = r0.f129009w
            rf2.a r5 = (rf2.InterfaceC31359a) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L57
        L47:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f129009w = r5
            r0.f129010x = r6
            r0.f129008E = r4
            java.lang.Object r7 = r5.deleteAll(r0)
            if (r7 != r1) goto L57
            goto L64
        L57:
            r7 = 0
            r0.f129009w = r7
            r0.f129010x = r7
            r0.f129008E = r3
            java.lang.Object r5 = r5.mo96438f(r6, r0)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.InterfaceC31359a.m96433c(rf2.a, com.whoop.data.local.room.entity.SmartAlarmUserInfo, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    Object mo96434a(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    InterfaceC13058l mo96435b();

    /* JADX INFO: renamed from: d */
    default Object mo96436d(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m96433c(this, smartAlarmUserInfo, interfaceC30057d);
    }

    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    Object mo96437e(String str, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo96438f(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: g */
    Object mo96439g(C32448a c32448a, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
