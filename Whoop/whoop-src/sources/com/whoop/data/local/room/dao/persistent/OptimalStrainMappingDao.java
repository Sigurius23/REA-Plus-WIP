package com.whoop.data.local.room.dao.persistent;

import com.whoop.data.local.room.entity.OptimalStrainMapping;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0011\u0010\fJ\u001e\u0010\u0012\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0097@¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;", "", "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;", "optimalStrainMapping", "Ll83/a0;", "insert", "(Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Lq83/d;)Ljava/lang/Object;", "", "optimalStrainMappings", "insertAll", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "", "recovery", "getOptimalStrainForRecovery", "(ILq83/d;)Ljava/lang/Object;", "getAll", "replaceAll", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface OptimalStrainMappingDao {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object replaceAll(OptimalStrainMappingDao optimalStrainMappingDao, List<OptimalStrainMapping> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return OptimalStrainMappingDao.super.replaceAll(list, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao$replaceAll$1 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao", m100430f = "OptimalStrainMappingDao.kt", m100431l = {31, 32}, m100432m = "replaceAll$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C64861 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C64861(InterfaceC30057d<? super C64861> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptimalStrainMappingDao.replaceAll$suspendImpl(OptimalStrainMappingDao.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.insertAll(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object replaceAll$suspendImpl(com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao r5, java.util.List<com.whoop.data.local.room.entity.OptimalStrainMapping> r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            boolean r0 = r7 instanceof com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao.C64861
            if (r0 == 0) goto L13
            r0 = r7
            com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao$replaceAll$1 r0 = (com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao.C64861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao$replaceAll$1 r0 = new com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao$replaceAll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r0.L$0
            com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao r5 = (com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L65
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.L$0
            com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao r5 = (com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L57
        L47:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.deleteAll(r0)
            if (r7 != r1) goto L57
            goto L64
        L57:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r5 = r5.insertAll(r6, r0)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao.replaceAll$suspendImpl(com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao, java.util.List, q83.d):java.lang.Object");
    }

    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object getAll(InterfaceC30057d<? super List<OptimalStrainMapping>> interfaceC30057d);

    Object getOptimalStrainForRecovery(int i13, InterfaceC30057d<? super OptimalStrainMapping> interfaceC30057d);

    Object insert(OptimalStrainMapping optimalStrainMapping, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertAll(List<OptimalStrainMapping> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    default Object replaceAll(List<OptimalStrainMapping> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return replaceAll$suspendImpl(this, list, interfaceC30057d);
    }
}
