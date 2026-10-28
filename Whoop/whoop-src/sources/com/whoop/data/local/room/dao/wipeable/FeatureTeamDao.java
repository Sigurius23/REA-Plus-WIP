package com.whoop.data.local.room.dao.wipeable;

import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.profile.domain.ProfileApiKt;
import ec3.InterfaceC13058l;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rH§@¢\u0006\u0004\b\u001b\u0010\u0005¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;", "", "", "Lcom/whoop/domain/model/teams/FeatureTeam;", "getFeatureTeamData", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "getFlowFeatureTeamData", "()Lec3/l;", "", "showBadge", "", ProfileApiKt.COMMUNITY_ID_PARAM, "Ll83/a0;", "updateBannerStatus", "(ZILq83/d;)Ljava/lang/Object;", "teams", "updateAllBadgeStatus", "(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;", "featureTeam", "saveFeatureTeam", "(Lcom/whoop/domain/model/teams/FeatureTeam;Lq83/d;)Ljava/lang/Object;", "getFeatureTeamByCommunityId", "(I)Lcom/whoop/domain/model/teams/FeatureTeam;", "featureTeams", "addFeatureTeams", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "deleteAllFeatureTeams", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FeatureTeamDao {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object addFeatureTeams(FeatureTeamDao featureTeamDao, List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return FeatureTeamDao.super.addFeatureTeams(list, interfaceC30057d);
        }

        @Deprecated
        public static Object updateAllBadgeStatus(FeatureTeamDao featureTeamDao, boolean z4, List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return FeatureTeamDao.super.updateAllBadgeStatus(z4, list, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.FeatureTeamDao$addFeatureTeams$1 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.local.room.dao.wipeable.FeatureTeamDao", m100430f = "FeatureTeamDao.kt", m100431l = {44, 46}, m100432m = "addFeatureTeams$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65001 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C65001(InterfaceC30057d<? super C65001> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureTeamDao.addFeatureTeams$suspendImpl(FeatureTeamDao.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.FeatureTeamDao$updateAllBadgeStatus$1 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.local.room.dao.wipeable.FeatureTeamDao", m100430f = "FeatureTeamDao.kt", m100431l = {27}, m100432m = "updateAllBadgeStatus$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65011 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C65011(InterfaceC30057d<? super C65011> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureTeamDao.updateAllBadgeStatus$suspendImpl(FeatureTeamDao.this, false, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:26:0x008e->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r7.deleteAllFeatureTeams(r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object addFeatureTeams$suspendImpl(com.whoop.data.local.room.dao.wipeable.FeatureTeamDao r7, java.util.List<com.whoop.domain.model.teams.FeatureTeam> r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            boolean r0 = r9 instanceof com.whoop.data.local.room.dao.wipeable.FeatureTeamDao.C65001
            if (r0 == 0) goto L13
            r0 = r9
            com.whoop.data.local.room.dao.wipeable.FeatureTeamDao$addFeatureTeams$1 r0 = (com.whoop.data.local.room.dao.wipeable.FeatureTeamDao.C65001) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.local.room.dao.wipeable.FeatureTeamDao$addFeatureTeams$1 r0 = new com.whoop.data.local.room.dao.wipeable.FeatureTeamDao$addFeatureTeams$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L56
            if (r2 == r5) goto L49
            if (r2 != r4) goto L41
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$5
            com.whoop.domain.model.teams.FeatureTeam r8 = (com.whoop.domain.model.teams.FeatureTeam) r8
            java.lang.Object r8 = r0.L$3
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r0.L$0
            com.whoop.data.local.room.dao.wipeable.FeatureTeamDao r2 = (com.whoop.data.local.room.dao.wipeable.FeatureTeamDao) r2
            p505ts.AbstractC34132o.m107864I(r9)
            goto L8e
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L49:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r0.L$0
            com.whoop.data.local.room.dao.wipeable.FeatureTeamDao r7 = (com.whoop.data.local.room.dao.wipeable.FeatureTeamDao) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L88
        L56:
            p505ts.AbstractC34132o.m107864I(r9)
            java.util.Iterator r9 = r8.iterator()
        L5d:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r9.next()
            com.whoop.domain.model.teams.FeatureTeam r2 = (com.whoop.domain.model.teams.FeatureTeam) r2
            int r6 = r2.getCommunityId()
            com.whoop.domain.model.teams.FeatureTeam r6 = r7.getFeatureTeamByCommunityId(r6)
            if (r6 == 0) goto L5d
            boolean r6 = r6.getShowBadge()
            r2.setShowBadge(r6)
            goto L5d
        L7b:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r7.deleteAllFeatureTeams(r0)
            if (r9 != r1) goto L88
            goto Lb3
        L88:
            java.util.Iterator r8 = r8.iterator()
            r2 = r7
            r7 = r3
        L8e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lb4
            java.lang.Object r9 = r8.next()
            com.whoop.domain.model.teams.FeatureTeam r9 = (com.whoop.domain.model.teams.FeatureTeam) r9
            r0.L$0 = r2
            r5 = 0
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r8
            r0.L$4 = r5
            r0.L$5 = r5
            r0.I$0 = r7
            r0.I$1 = r3
            r0.label = r4
            java.lang.Object r9 = r2.saveFeatureTeam(r9, r0)
            if (r9 != r1) goto L8e
        Lb3:
            return r1
        Lb4:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.local.room.dao.wipeable.FeatureTeamDao.addFeatureTeams$suspendImpl(com.whoop.data.local.room.dao.wipeable.FeatureTeamDao, java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object updateAllBadgeStatus$suspendImpl(FeatureTeamDao featureTeamDao, boolean z4, List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65011 c65011;
        Iterator it;
        boolean z13;
        int i13;
        if (interfaceC30057d instanceof C65011) {
            c65011 = (C65011) interfaceC30057d;
            int i14 = c65011.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c65011.label = i14 - Integer.MIN_VALUE;
            } else {
                c65011 = featureTeamDao.new C65011(interfaceC30057d);
            }
        } else {
            c65011 = featureTeamDao.new C65011(interfaceC30057d);
        }
        Object obj = c65011.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c65011.label;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = list.iterator();
            z13 = z4;
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = c65011.I$0;
            boolean z14 = c65011.Z$0;
            Iterator it3 = (Iterator) c65011.L$3;
            FeatureTeamDao featureTeamDao2 = (FeatureTeamDao) c65011.L$0;
            AbstractC34132o.m107864I(obj);
            it = it3;
            z13 = z14;
            i13 = i16;
            featureTeamDao = featureTeamDao2;
        }
        while (it.hasNext()) {
            int communityId = ((FeatureTeam) it.next()).getCommunityId();
            c65011.L$0 = featureTeamDao;
            c65011.L$1 = null;
            c65011.L$2 = null;
            c65011.L$3 = it;
            c65011.L$4 = null;
            c65011.L$5 = null;
            c65011.Z$0 = z13;
            c65011.I$0 = i13;
            c65011.I$1 = 0;
            c65011.label = 1;
            if (featureTeamDao.updateBannerStatus(z13, communityId, c65011) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    default Object addFeatureTeams(List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return addFeatureTeams$suspendImpl(this, list, interfaceC30057d);
    }

    Object deleteAllFeatureTeams(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    FeatureTeam getFeatureTeamByCommunityId(int communityId);

    Object getFeatureTeamData(InterfaceC30057d<? super List<FeatureTeam>> interfaceC30057d);

    InterfaceC13058l getFlowFeatureTeamData();

    Object saveFeatureTeam(FeatureTeam featureTeam, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    default Object updateAllBadgeStatus(boolean z4, List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return updateAllBadgeStatus$suspendImpl(this, z4, list, interfaceC30057d);
    }

    Object updateBannerStatus(boolean z4, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
