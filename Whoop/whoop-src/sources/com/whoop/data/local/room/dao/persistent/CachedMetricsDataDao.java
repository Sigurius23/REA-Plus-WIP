package com.whoop.data.local.room.dao.persistent;

import com.whoop.data.local.room.entity.connectivity.CachedMetricsDataDto;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0097@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0097@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;", "", "", "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;", "CachedMetricsDataDtoList", "Ll83/a0;", "insertList", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "getOldestPacketRevision", "(Lq83/d;)Ljava/lang/Object;", "packetRevision", "", "oldestTimeStamp", "newestTimeStamp", "getHeartDataByTimeRanges", "(IJJLq83/d;)Ljava/lang/Object;", "oldestTimeStampThreshold", "deleteAllHeartDataBeforeTimeStamp", "(JLq83/d;)Ljava/lang/Object;", "cachedMetricsDataDtoList", "insertAllThenDeleteOldHeartDataByTimeStamp", "(Ljava/util/List;JLq83/d;)Ljava/lang/Object;", "timeStampFrom", "timeStampTo", "getPacketRevisionThenHeartDataByTimeRanges", "(JJLq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CachedMetricsDataDao {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object getPacketRevisionThenHeartDataByTimeRanges(CachedMetricsDataDao cachedMetricsDataDao, long j7, long j13, InterfaceC30057d<? super List<CachedMetricsDataDto>> interfaceC30057d) {
            return CachedMetricsDataDao.super.getPacketRevisionThenHeartDataByTimeRanges(j7, j13, interfaceC30057d);
        }

        @Deprecated
        public static Object insertAllThenDeleteOldHeartDataByTimeStamp(CachedMetricsDataDao cachedMetricsDataDao, List<CachedMetricsDataDto> list, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return CachedMetricsDataDao.super.insertAllThenDeleteOldHeartDataByTimeStamp(list, j7, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao", m100430f = "CachedMetricsDataDao.kt", m100431l = {40, 42}, m100432m = "getPacketRevisionThenHeartDataByTimeRanges$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C64831 extends AbstractC32269c {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C64831(InterfaceC30057d<? super C64831> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachedMetricsDataDao.getPacketRevisionThenHeartDataByTimeRanges$suspendImpl(CachedMetricsDataDao.this, 0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao", m100430f = "CachedMetricsDataDao.kt", m100431l = {31, 32}, m100432m = "insertAllThenDeleteOldHeartDataByTimeStamp$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C64841 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C64841(InterfaceC30057d<? super C64841> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachedMetricsDataDao.insertAllThenDeleteOldHeartDataByTimeStamp$suspendImpl(CachedMetricsDataDao.this, null, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    static Object getPacketRevisionThenHeartDataByTimeRanges$suspendImpl(CachedMetricsDataDao cachedMetricsDataDao, long j7, long j13, InterfaceC30057d<? super List<CachedMetricsDataDto>> interfaceC30057d) {
        C64831 c64831;
        if (interfaceC30057d instanceof C64831) {
            c64831 = (C64831) interfaceC30057d;
            int i13 = c64831.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c64831.label = i13 - Integer.MIN_VALUE;
            } else {
                c64831 = cachedMetricsDataDao.new C64831(interfaceC30057d);
            }
        } else {
            c64831 = cachedMetricsDataDao.new C64831(interfaceC30057d);
        }
        C64831 c64832 = c64831;
        Object oldestPacketRevision = c64832.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c64832.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(oldestPacketRevision);
            c64832.L$0 = cachedMetricsDataDao;
            c64832.J$0 = j7;
            c64832.J$1 = j13;
            c64832.label = 1;
            oldestPacketRevision = cachedMetricsDataDao.getOldestPacketRevision(c64832);
            if (oldestPacketRevision != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(oldestPacketRevision);
            return oldestPacketRevision;
        }
        j13 = c64832.J$1;
        j7 = c64832.J$0;
        cachedMetricsDataDao = (CachedMetricsDataDao) c64832.L$0;
        AbstractC34132o.m107864I(oldestPacketRevision);
        CachedMetricsDataDao cachedMetricsDataDao2 = cachedMetricsDataDao;
        long j14 = j7;
        long j15 = j13;
        int iIntValue = ((Number) oldestPacketRevision).intValue();
        c64832.L$0 = null;
        c64832.J$0 = j14;
        c64832.J$1 = j15;
        c64832.I$0 = iIntValue;
        c64832.label = 2;
        Object heartDataByTimeRanges = cachedMetricsDataDao2.getHeartDataByTimeRanges(iIntValue, j14, j15, c64832);
        return heartDataByTimeRanges == enumC31071a ? enumC31071a : heartDataByTimeRanges;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r6.deleteAllHeartDataBeforeTimeStamp(r8, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object insertAllThenDeleteOldHeartDataByTimeStamp$suspendImpl(com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao r6, java.util.List<com.whoop.data.local.room.entity.connectivity.CachedMetricsDataDto> r7, long r8, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            boolean r0 = r10 instanceof com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao.C64841
            if (r0 == 0) goto L13
            r0 = r10
            com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1 r0 = (com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao.C64841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1 r0 = new com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.L$0
            com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao r6 = (com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao) r6
            p505ts.AbstractC34132o.m107864I(r10)
            goto L6a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            long r8 = r0.J$0
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.L$0
            com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao r6 = (com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao) r6
            p505ts.AbstractC34132o.m107864I(r10)
            goto L5b
        L49:
            p505ts.AbstractC34132o.m107864I(r10)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.J$0 = r8
            r0.label = r4
            java.lang.Object r7 = r6.insertList(r7, r0)
            if (r7 != r1) goto L5b
            goto L69
        L5b:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.J$0 = r8
            r0.label = r3
            java.lang.Object r6 = r6.deleteAllHeartDataBeforeTimeStamp(r8, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao.insertAllThenDeleteOldHeartDataByTimeStamp$suspendImpl(com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao, java.util.List, long, q83.d):java.lang.Object");
    }

    Object deleteAllHeartDataBeforeTimeStamp(long j7, InterfaceC30057d<? super Integer> interfaceC30057d);

    Object getHeartDataByTimeRanges(int i13, long j7, long j13, InterfaceC30057d<? super List<CachedMetricsDataDto>> interfaceC30057d);

    Object getOldestPacketRevision(InterfaceC30057d<? super Integer> interfaceC30057d);

    default Object getPacketRevisionThenHeartDataByTimeRanges(long j7, long j13, InterfaceC30057d<? super List<CachedMetricsDataDto>> interfaceC30057d) {
        return getPacketRevisionThenHeartDataByTimeRanges$suspendImpl(this, j7, j13, interfaceC30057d);
    }

    default Object insertAllThenDeleteOldHeartDataByTimeStamp(List<CachedMetricsDataDto> list, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return insertAllThenDeleteOldHeartDataByTimeStamp$suspendImpl(this, list, j7, interfaceC30057d);
    }

    Object insertList(List<CachedMetricsDataDto> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
