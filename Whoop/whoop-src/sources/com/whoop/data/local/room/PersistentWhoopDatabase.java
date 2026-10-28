package com.whoop.data.local.room;

import aa2.InterfaceC0596e;
import ai1.InterfaceC0909a;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao;
import com.whoop.data.local.room.dao.wipeable.ConfigurationsDao;
import com.whoop.data.onboarding.OnboardingStatusDao;
import dq1.InterfaceC12289b;
import fx2.InterfaceC14849a;
import ha0.InterfaceC17048a;
import ha0.InterfaceC17052e;
import ji0.InterfaceC21713a;
import p715kotlin.Metadata;
import rf2.InterfaceC31359a;
import rk2.InterfaceC31499c;
import uh1.InterfaceC34966a;
import we1.InterfaceC37218b;
import we1.InterfaceC37226j;
import x90.InterfaceC38095a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H&¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H&¢\u0006\u0004\b2\u00103¨\u00064"}, m65681d2 = {"Lcom/whoop/data/local/room/PersistentWhoopDatabase;", "Landroidx/room/z0;", "<init>", "()V", "Lx90/a;", "activeActivitySessionDao", "()Lx90/a;", "Lha0/a;", "activitiesDao", "()Lha0/a;", "Lji0/a;", "appConfigurationCacheDao", "()Lji0/a;", "Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;", "configurationsDao", "()Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;", "Lwe1/b;", "entitlementDao", "()Lwe1/b;", "Lwe1/j;", "membershipTypeDao", "()Lwe1/j;", "Ldq1/b;", "hrZonesDao", "()Ldq1/b;", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "()Lcom/whoop/data/onboarding/OnboardingStatusDao;", "Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;", "optimalStrainMappingDao", "()Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;", "Lrk2/c;", "pendingActivitySaveDao", "()Lrk2/c;", "Lha0/e;", "recentActivitiesDao", "()Lha0/e;", "Lrf2/a;", "smartAlarmUserInfoDao", "()Lrf2/a;", "Laa2/e;", "userDao", "()Laa2/e;", "Lfx2/a;", "whoopLabsDao", "()Lfx2/a;", "Luh1/a;", "gpsLocationDao", "()Luh1/a;", "Lai1/a;", "foregroundGpsRoutePointDao", "()Lai1/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class PersistentWhoopDatabase extends AbstractC1848z0 {
    public static final int $stable = 8;

    public abstract InterfaceC38095a activeActivitySessionDao();

    public abstract InterfaceC17048a activitiesDao();

    public abstract InterfaceC21713a appConfigurationCacheDao();

    public abstract ConfigurationsDao configurationsDao();

    public abstract InterfaceC37218b entitlementDao();

    public abstract InterfaceC0909a foregroundGpsRoutePointDao();

    public abstract InterfaceC34966a gpsLocationDao();

    public abstract InterfaceC12289b hrZonesDao();

    public abstract InterfaceC37226j membershipTypeDao();

    public abstract OnboardingStatusDao onboardingStatusDao();

    public abstract OptimalStrainMappingDao optimalStrainMappingDao();

    public abstract InterfaceC31499c pendingActivitySaveDao();

    public abstract InterfaceC17052e recentActivitiesDao();

    public abstract InterfaceC31359a smartAlarmUserInfoDao();

    public abstract InterfaceC0596e userDao();

    public abstract InterfaceC14849a whoopLabsDao();
}
