package com.whoop.data.local.room;

import aa2.C0597f;
import aa2.InterfaceC0596e;
import ai1.C0912d;
import ai1.InterfaceC0909a;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao;
import com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao_Impl;
import com.whoop.data.local.room.dao.wipeable.ConfigurationsDao;
import com.whoop.data.local.room.dao.wipeable.ConfigurationsDao_Impl;
import com.whoop.data.local.room.entity.ConfigurationDtoKt;
import com.whoop.data.local.room.entity.OptimalStrainMappingKt;
import com.whoop.data.local.room.entity.SmartAlarmUserInfoKt;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.onboarding.OnboardingStatusDaoKt;
import com.whoop.data.onboarding.OnboardingStatusDao_Impl;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import com.whoop.whooplabs.data.domain.LabsCampaignKt;
import com.whoop.whooplabs.data.domain.OptionSelectionKt;
import com.whoop.whooplabs.data.domain.ProtocolStepConfigKt;
import com.whoop.whooplabs.data.domain.ProtocolStepKt;
import dq1.C12291d;
import dq1.InterfaceC12289b;
import fx2.C14855g;
import fx2.InterfaceC14849a;
import ha0.C17050c;
import ha0.C17054g;
import ha0.InterfaceC17048a;
import ha0.InterfaceC17052e;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ji0.C21715c;
import ji0.InterfaceC21713a;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27787j;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p555vl.AbstractC36095b;
import rf2.C31361c;
import rf2.InterfaceC31359a;
import rk2.C31500d;
import rk2.InterfaceC31499c;
import se.AbstractC32410a;
import uh1.C34967b;
import uh1.InterfaceC34966a;
import we1.C37220d;
import we1.C37227k;
import we1.InterfaceC37218b;
import we1.InterfaceC37226j;
import x90.C38096b;
import x90.InterfaceC38095a;

/* JADX INFO: loaded from: classes.dex */
public final class PersistentWhoopDatabase_Impl extends PersistentWhoopDatabase {
    private volatile InterfaceC38095a _activeActivitySessionDao;
    private volatile InterfaceC17048a _activitiesDao;
    private volatile InterfaceC21713a _appConfigurationCacheDao;
    private volatile ConfigurationsDao _configurationsDao;
    private volatile InterfaceC37218b _entitlementDao;
    private volatile InterfaceC0909a _foregroundGpsRoutePointDao;
    private volatile InterfaceC34966a _gpsLocationDao;
    private volatile InterfaceC12289b _hrZonesDao;
    private volatile InterfaceC14849a _labsDao;
    private volatile InterfaceC37226j _membershipTypeDao;
    private volatile OnboardingStatusDao _onboardingStatusDao;
    private volatile OptimalStrainMappingDao _optimalStrainMappingDao;
    private volatile InterfaceC31499c _pendingActivitySaveDao;
    private volatile InterfaceC17052e _recentActivitiesDao;
    private volatile InterfaceC31359a _smartAlarmUserInfoDao;
    private volatile InterfaceC0596e _userDao;

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC38095a activeActivitySessionDao() {
        InterfaceC38095a interfaceC38095a;
        if (this._activeActivitySessionDao != null) {
            return this._activeActivitySessionDao;
        }
        synchronized (this) {
            try {
                if (this._activeActivitySessionDao == null) {
                    this._activeActivitySessionDao = new C38096b(this);
                }
                interfaceC38095a = this._activeActivitySessionDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC38095a;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC17048a activitiesDao() {
        InterfaceC17048a interfaceC17048a;
        if (this._activitiesDao != null) {
            return this._activitiesDao;
        }
        synchronized (this) {
            try {
                if (this._activitiesDao == null) {
                    this._activitiesDao = new C17050c(this);
                }
                interfaceC17048a = this._activitiesDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC17048a;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC21713a appConfigurationCacheDao() {
        InterfaceC21713a interfaceC21713a;
        if (this._appConfigurationCacheDao != null) {
            return this._appConfigurationCacheDao;
        }
        synchronized (this) {
            try {
                if (this._appConfigurationCacheDao == null) {
                    this._appConfigurationCacheDao = new C21715c(this);
                }
                interfaceC21713a = this._appConfigurationCacheDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC21713a;
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, "active_activity_session_table", "table_activities_list", "app_configuration_cache_table", ConfigurationDtoKt.CONFIGURATIONS_TABLE_NAME, "entitlement_table", "table_hr_zone_list", LabsCampaignKt.LABS_CAMPAIGN_TABLE, "legal_document_to_campaign", "whoop_labs_session", "whoop_labs_strap_info", "whoop_labs_legal_ducment", OnboardingStatusDaoKt.ONBOARDING_STATUS_TABLE_NAME, OptimalStrainMappingKt.OPTIMAL_STRAIN_MAPPING_TABLE, "pending_activity_save_table", ProtocolStepKt.PROTOCOL_STEP_TABLE, "whoop_labs_protocol_step_result", "table_recent_activities", SmartAlarmUserInfoKt.SMART_ALARM_USER_INFO_TABLE_NAME, "table_smart_alarm_triggered", "table_user", "table_user_profile", "whoop_labs_hr_device", "whoop_labs_study", "whoop_labs_study_tag", OptionSelectionKt.INPUT_OPTION_TABLE_NAME, ProtocolStepConfigKt.PROTOCOL_STEP_CONFIG_TABLE, "gps_locations", "membership_type_table", "foreground_gps_route_points");
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public ConfigurationsDao configurationsDao() {
        ConfigurationsDao configurationsDao;
        if (this._configurationsDao != null) {
            return this._configurationsDao;
        }
        synchronized (this) {
            try {
                if (this._configurationsDao == null) {
                    this._configurationsDao = new ConfigurationsDao_Impl(this);
                }
                configurationsDao = this._configurationsDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return configurationsDao;
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), "active_activity_session_table", "table_activities_list", "app_configuration_cache_table", ConfigurationDtoKt.CONFIGURATIONS_TABLE_NAME, "entitlement_table", "table_hr_zone_list", LabsCampaignKt.LABS_CAMPAIGN_TABLE, "legal_document_to_campaign", "whoop_labs_session", "whoop_labs_strap_info", "whoop_labs_legal_ducment", OnboardingStatusDaoKt.ONBOARDING_STATUS_TABLE_NAME, OptimalStrainMappingKt.OPTIMAL_STRAIN_MAPPING_TABLE, "pending_activity_save_table", ProtocolStepKt.PROTOCOL_STEP_TABLE, "whoop_labs_protocol_step_result", "table_recent_activities", SmartAlarmUserInfoKt.SMART_ALARM_USER_INFO_TABLE_NAME, "table_smart_alarm_triggered", "table_user", "table_user_profile", "whoop_labs_hr_device", "whoop_labs_study", "whoop_labs_study_tag", OptionSelectionKt.INPUT_OPTION_TABLE_NAME, ProtocolStepConfigKt.PROTOCOL_STEP_CONFIG_TABLE, "gps_locations", "membership_type_table", "foreground_gps_route_points");
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC37218b entitlementDao() {
        InterfaceC37218b interfaceC37218b;
        if (this._entitlementDao != null) {
            return this._entitlementDao;
        }
        synchronized (this) {
            try {
                if (this._entitlementDao == null) {
                    this._entitlementDao = new C37220d(this);
                }
                interfaceC37218b = this._entitlementDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC37218b;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC0909a foregroundGpsRoutePointDao() {
        InterfaceC0909a interfaceC0909a;
        if (this._foregroundGpsRoutePointDao != null) {
            return this._foregroundGpsRoutePointDao;
        }
        synchronized (this) {
            try {
                if (this._foregroundGpsRoutePointDao == null) {
                    this._foregroundGpsRoutePointDao = new C0912d(this);
                }
                interfaceC0909a = this._foregroundGpsRoutePointDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC0909a;
    }

    @Override // androidx.room.AbstractC1848z0
    public List<AbstractC25380b> getAutoMigrations(Map<Class<? extends InterfaceC25379a>, InterfaceC25379a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.AbstractC1848z0
    public Set<Class<? extends InterfaceC25379a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC38095a.class, C38096b.m122050g());
        map.put(InterfaceC17048a.class, C17050c.m48134k());
        map.put(InterfaceC21713a.class, C21715c.m61168f());
        map.put(ConfigurationsDao.class, ConfigurationsDao_Impl.getRequiredConverters());
        map.put(InterfaceC37218b.class, C37220d.m119280h());
        map.put(InterfaceC37226j.class, C37227k.m119314f());
        map.put(InterfaceC12289b.class, C12291d.m34215k());
        map.put(OnboardingStatusDao.class, OnboardingStatusDao_Impl.getRequiredConverters());
        map.put(OptimalStrainMappingDao.class, OptimalStrainMappingDao_Impl.getRequiredConverters());
        map.put(InterfaceC31499c.class, C31500d.m97054h());
        map.put(InterfaceC17052e.class, C17054g.m48157k());
        map.put(InterfaceC31359a.class, C31361c.m96449q());
        map.put(InterfaceC0596e.class, C0597f.m1575t());
        map.put(InterfaceC14849a.class, C14855g.m42863v0());
        map.put(InterfaceC34966a.class, C34967b.m110440k());
        map.put(InterfaceC0909a.class, C0912d.m2249i());
        return map;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC34966a gpsLocationDao() {
        InterfaceC34966a interfaceC34966a;
        if (this._gpsLocationDao != null) {
            return this._gpsLocationDao;
        }
        synchronized (this) {
            try {
                if (this._gpsLocationDao == null) {
                    this._gpsLocationDao = new C34967b(this);
                }
                interfaceC34966a = this._gpsLocationDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC34966a;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC12289b hrZonesDao() {
        InterfaceC12289b interfaceC12289b;
        if (this._hrZonesDao != null) {
            return this._hrZonesDao;
        }
        synchronized (this) {
            try {
                if (this._hrZonesDao == null) {
                    this._hrZonesDao = new C12291d(this);
                }
                interfaceC12289b = this._hrZonesDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC12289b;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC37226j membershipTypeDao() {
        InterfaceC37226j interfaceC37226j;
        if (this._membershipTypeDao != null) {
            return this._membershipTypeDao;
        }
        synchronized (this) {
            try {
                if (this._membershipTypeDao == null) {
                    this._membershipTypeDao = new C37227k(this);
                }
                interfaceC37226j = this._membershipTypeDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC37226j;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public OnboardingStatusDao onboardingStatusDao() {
        OnboardingStatusDao onboardingStatusDao;
        if (this._onboardingStatusDao != null) {
            return this._onboardingStatusDao;
        }
        synchronized (this) {
            try {
                if (this._onboardingStatusDao == null) {
                    this._onboardingStatusDao = new OnboardingStatusDao_Impl(this);
                }
                onboardingStatusDao = this._onboardingStatusDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return onboardingStatusDao;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public OptimalStrainMappingDao optimalStrainMappingDao() {
        OptimalStrainMappingDao optimalStrainMappingDao;
        if (this._optimalStrainMappingDao != null) {
            return this._optimalStrainMappingDao;
        }
        synchronized (this) {
            try {
                if (this._optimalStrainMappingDao == null) {
                    this._optimalStrainMappingDao = new OptimalStrainMappingDao_Impl(this);
                }
                optimalStrainMappingDao = this._optimalStrainMappingDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return optimalStrainMappingDao;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC31499c pendingActivitySaveDao() {
        InterfaceC31499c interfaceC31499c;
        if (this._pendingActivitySaveDao != null) {
            return this._pendingActivitySaveDao;
        }
        synchronized (this) {
            try {
                if (this._pendingActivitySaveDao == null) {
                    this._pendingActivitySaveDao = new C31500d(this);
                }
                interfaceC31499c = this._pendingActivitySaveDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC31499c;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC17052e recentActivitiesDao() {
        InterfaceC17052e interfaceC17052e;
        if (this._recentActivitiesDao != null) {
            return this._recentActivitiesDao;
        }
        synchronized (this) {
            try {
                if (this._recentActivitiesDao == null) {
                    this._recentActivitiesDao = new C17054g(this);
                }
                interfaceC17052e = this._recentActivitiesDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC17052e;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC31359a smartAlarmUserInfoDao() {
        InterfaceC31359a interfaceC31359a;
        if (this._smartAlarmUserInfoDao != null) {
            return this._smartAlarmUserInfoDao;
        }
        synchronized (this) {
            try {
                if (this._smartAlarmUserInfoDao == null) {
                    this._smartAlarmUserInfoDao = new C31361c(this);
                }
                interfaceC31359a = this._smartAlarmUserInfoDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC31359a;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC0596e userDao() {
        InterfaceC0596e interfaceC0596e;
        if (this._userDao != null) {
            return this._userDao;
        }
        synchronized (this) {
            try {
                if (this._userDao == null) {
                    this._userDao = new C0597f(this);
                }
                interfaceC0596e = this._userDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC0596e;
    }

    @Override // com.whoop.data.local.room.PersistentWhoopDatabase
    public InterfaceC14849a whoopLabsDao() {
        InterfaceC14849a interfaceC14849a;
        if (this._labsDao != null) {
            return this._labsDao;
        }
        synchronized (this) {
            try {
                if (this._labsDao == null) {
                    this._labsDao = new C14855g(this);
                }
                interfaceC14849a = this._labsDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC14849a;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new AbstractC1788g1(69, "320843d67212caa754e8ddcd3a67c5df", "46d010973847809645a792bee843c856") { // from class: com.whoop.data.local.room.PersistentWhoopDatabase_Impl.1
            @Override // androidx.room.AbstractC1788g1
            public void createAllTables(InterfaceC33687a interfaceC33687a) {
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `active_activity_session_table` (`id` INTEGER NOT NULL, `activitySessionId` TEXT NOT NULL, `state` TEXT NOT NULL, `selectedActivityInternalName` TEXT NOT NULL, `gpsTrackingEnabled` INTEGER NOT NULL, `startTimeMs` INTEGER NOT NULL, `resumeNavigationJson` TEXT, `pauseSegmentsJson` TEXT NOT NULL, PRIMARY KEY(`id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_activities_list` (`internal_name` TEXT NOT NULL, `display_name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `deleted` INTEGER NOT NULL, `category` TEXT NOT NULL, `score_type` TEXT NOT NULL, `has_gps` INTEGER NOT NULL, PRIMARY KEY(`internal_name`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `app_configuration_cache_table` (`id` INTEGER NOT NULL, `responseJson` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_configurations` (`configuration_key` TEXT NOT NULL, `configuration_value` TEXT NOT NULL, PRIMARY KEY(`configuration_key`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `entitlement_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `lastUpdated` INTEGER NOT NULL)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_hr_zone_list` (`zone_id` TEXT NOT NULL, `min` INTEGER NOT NULL, `max` INTEGER NOT NULL, PRIMARY KEY(`zone_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `labs_campaign` (`campaign_id` INTEGER NOT NULL, `description` TEXT NOT NULL, `name` TEXT NOT NULL, `subtitle` TEXT, `participation_cooldown_date` TEXT, `additional_collection_length` INTEGER, `bthr_additional_collection_length` INTEGER, `data_types` TEXT, `protocol_id` INTEGER, `protocol_name` TEXT, `pdf_url` TEXT, `campaign_session_id` INTEGER, PRIMARY KEY(`campaign_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `legal_document_to_campaign` (`campaign_id` INTEGER NOT NULL, `legal_id` INTEGER NOT NULL, PRIMARY KEY(`campaign_id`, `legal_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_session` (`campaign_session_id` INTEGER NOT NULL, PRIMARY KEY(`campaign_session_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_strap_info` (`whoop_strap_id` TEXT NOT NULL, `hardware_version` TEXT NOT NULL, `firmware_version` TEXT NOT NULL, `bluetooth_version` TEXT NOT NULL, `sig_proc_version` TEXT NOT NULL, PRIMARY KEY(`whoop_strap_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_legal_ducment` (`legal_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `pdf_url` TEXT NOT NULL, `pdf_file_name` TEXT, PRIMARY KEY(`legal_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_onboarding_status` (`type` TEXT NOT NULL, `isCompleted` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`type`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `optimal_strain_mapping_table` (`recovery` INTEGER NOT NULL, `lower_optimal_strain` REAL NOT NULL, `optimal_strain` REAL NOT NULL, `upper_optimal_strain` REAL NOT NULL, `cycle_id` INTEGER NOT NULL, PRIMARY KEY(`recovery`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `pending_activity_save_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `activityInternalName` TEXT NOT NULL, `garmentId` INTEGER NOT NULL, `startTime` TEXT NOT NULL, `endTime` TEXT NOT NULL, `gpsEnabled` INTEGER NOT NULL, `queuedAtMs` INTEGER NOT NULL, `pauseSegmentsJson` TEXT)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `protocol_step` (`campaign_id` INTEGER NOT NULL, `step_id` INTEGER NOT NULL, `text` TEXT, `step_order` INTEGER NOT NULL, `typeform_url` TEXT, `image_url` TEXT, `image_alt` TEXT, `is_bp` INTEGER NOT NULL, `is_timer_active` INTEGER, `is_bthr` INTEGER NOT NULL, `title` TEXT, `sub_title` TEXT, `cta` TEXT, `typeform_title` TEXT, `systolic_label` TEXT, `systolic_too_low_text` TEXT, `systolic_too_high_text` TEXT, `systolic_required_text` TEXT, `systolic_max` INTEGER, `systolic_min` INTEGER, `systolic_suffix` TEXT, `systolic_required` INTEGER, `diastolic_label` TEXT, `diastolic_too_low_text` TEXT, `diastolic_too_high_text` TEXT, `diastolic_required_text` TEXT, `diastolic_max` INTEGER, `diastolic_min` INTEGER, `diastolic_suffix` TEXT, `diastolic_required` INTEGER, `heart_rate_label` TEXT, `heart_rate_too_low_text` TEXT, `heart_rate_too_high_text` TEXT, `heart_required_text` TEXT, `heart_rate_max` INTEGER, `heart_rate_min` INTEGER, `heart_rate_suffix` TEXT, `heart_rate_required` INTEGER, `input_type` TEXT, `input_required` INTEGER NOT NULL, `required_regex` TEXT, `blocked_regex` TEXT, `countdown_timer_required` INTEGER NOT NULL, `countdown_timer_seconds` INTEGER, `survey_form_id` TEXT, `survey_vendor_metadata` TEXT, `survey_provider` TEXT, PRIMARY KEY(`campaign_id`, `step_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_protocol_step_result` (`campaign_id` INTEGER NOT NULL, `result_id` INTEGER NOT NULL, `step_order` INTEGER NOT NULL, `start_timestamp` TEXT, `end_timestamp` TEXT, `typeform_submitted` INTEGER NOT NULL, `text_option` TEXT, `number_input` INTEGER, `text_input` TEXT, `timestamp_input` TEXT, `timestamp` TEXT, `systolic` INTEGER, `diastolic` INTEGER, `heart_rate` INTEGER, PRIMARY KEY(`campaign_id`, `result_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_recent_activities` (`internal_name` TEXT NOT NULL, `display_name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `deleted` INTEGER NOT NULL, `category` TEXT NOT NULL, `score_type` TEXT NOT NULL, `has_gps` INTEGER NOT NULL, PRIMARY KEY(`internal_name`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `smart_alarm_user_info_table` (`user_id` INTEGER NOT NULL, `window_minutes` INTEGER NOT NULL, `upper_time_bound` TEXT NOT NULL, `last_triggered_at` TEXT, `sleep_score_goal` INTEGER, `recovery_score_goal` INTEGER, `goal` TEXT NOT NULL DEFAULT 'EXACT_TIME_PEAK', `enabled` INTEGER NOT NULL DEFAULT 0, `last_updated_at` INTEGER NOT NULL, `schedule_enabled` INTEGER NOT NULL DEFAULT 0, `day_of_week` TEXT, `enrolled_weekly_plan` INTEGER NOT NULL DEFAULT 0, `weekly_plan_goal` INTEGER, `time_zone_offset` TEXT, `alarm_bounds` TEXT, `weekly_plan_hour_goal` TEXT, PRIMARY KEY(`user_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_smart_alarm_triggered` (`composite_id` TEXT NOT NULL, PRIMARY KEY(`composite_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_user` (`id` INTEGER NOT NULL, `created_at` TEXT NOT NULL, `first_name` TEXT NOT NULL, `last_name` TEXT NOT NULL, `full_name` TEXT NOT NULL, `email_address` TEXT NOT NULL, `password` TEXT NOT NULL, `username` TEXT NOT NULL, `avatar_url` TEXT NOT NULL, `city` TEXT, `admin_division` TEXT, `country` TEXT NOT NULL, `concealed` INTEGER NOT NULL DEFAULT 0, `age` INTEGER NOT NULL, PRIMARY KEY(`id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_user_profile` (`id` INTEGER NOT NULL, `gender` TEXT NOT NULL, `height` REAL NOT NULL, `weight` REAL NOT NULL, `birthday` TEXT NOT NULL, `time_zone_offset` TEXT NOT NULL, `unit_system` TEXT NOT NULL, `fitness_level` TEXT NOT NULL, `max_heart_rate` INTEGER NOT NULL, `min_heart_rate` INTEGER NOT NULL, `physiological_baseline` TEXT, `can_upload_data` INTEGER NOT NULL, PRIMARY KEY(`id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_hr_device` (`hr_device_id` TEXT NOT NULL, `device_name` TEXT, `hr_file_path` TEXT, PRIMARY KEY(`hr_device_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_study` (`study_id` INTEGER NOT NULL, `start_time` TEXT, `end_time` TEXT, `hr_device_connected` INTEGER NOT NULL, `status` TEXT NOT NULL, `campaign_id` INTEGER NOT NULL, `pdf_file_name` TEXT, `protocol_step` INTEGER NOT NULL, `protocol_completed` INTEGER NOT NULL, PRIMARY KEY(`study_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_study_tag` (`timestamp` TEXT NOT NULL, `note` TEXT, `campaign_id` INTEGER NOT NULL, `tag_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_input_option` (`step_id` INTEGER NOT NULL, `option_order` INTEGER NOT NULL, `option_key` TEXT NOT NULL, `option_value` TEXT NOT NULL, PRIMARY KEY(`step_id`, `option_key`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `whoop_labs_protocol_step_config` (`step_id` INTEGER NOT NULL, `input_label` TEXT, `min` INTEGER, `max` INTEGER, `min_error_text` TEXT, `max_error_text` TEXT, `hint` TEXT, `row_count` INTEGER, PRIMARY KEY(`step_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `gps_locations` (`timestamp` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL, `horizontal_accuracy_meters` REAL NOT NULL, `vertical_accuracy_meters` REAL NOT NULL, `speed_value` REAL, `speed_unit` TEXT, `speed_accuracy` REAL, `trigger` TEXT, PRIMARY KEY(`timestamp`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_gps_locations_timestamp` ON `gps_locations` (`timestamp`)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `membership_type_table` (`id` INTEGER NOT NULL, `membershipType` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `foreground_gps_route_points` (`sessionStartTimeMs` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL, `horizontal_accuracy_meters` REAL NOT NULL, `vertical_accuracy_meters` REAL NOT NULL, PRIMARY KEY(`sessionStartTimeMs`, `timestamp`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_foreground_gps_route_points_sessionStartTimeMs` ON `foreground_gps_route_points` (`sessionStartTimeMs`)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
                AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '320843d67212caa754e8ddcd3a67c5df')", interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void dropAllTables(InterfaceC33687a interfaceC33687a) {
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `active_activity_session_table`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_activities_list`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `app_configuration_cache_table`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_configurations`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `entitlement_table`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_hr_zone_list`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `labs_campaign`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `legal_document_to_campaign`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_session`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_strap_info`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_legal_ducment`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_onboarding_status`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `optimal_strain_mapping_table`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `pending_activity_save_table`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `protocol_step`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_protocol_step_result`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_recent_activities`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `smart_alarm_user_info_table`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_smart_alarm_triggered`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_user`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_user_profile`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_hr_device`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_study`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_study_tag`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_input_option`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `whoop_labs_protocol_step_config`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `gps_locations`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `membership_type_table`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `foreground_gps_route_points`", interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void onCreate(InterfaceC33687a interfaceC33687a) {
            }

            @Override // androidx.room.AbstractC1788g1
            public void onOpen(InterfaceC33687a interfaceC33687a) {
                PersistentWhoopDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void onPostMigrate(InterfaceC33687a interfaceC33687a) {
            }

            @Override // androidx.room.AbstractC1788g1
            public void onPreMigrate(InterfaceC33687a interfaceC33687a) {
                AbstractC32410a.m101001I(interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public C1784f1 onValidateSchema(InterfaceC33687a interfaceC33687a) {
                HashMap map = new HashMap(8);
                map.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map.put("activitySessionId", new C27785h(0, 1, "activitySessionId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("state", new C27785h(0, 1, "state", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("selectedActivityInternalName", new C27785h(0, 1, "selectedActivityInternalName", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("gpsTrackingEnabled", new C27785h(0, 1, "gpsTrackingEnabled", "INTEGER", null, true));
                map.put("startTimeMs", new C27785h(0, 1, "startTimeMs", "INTEGER", null, true));
                map.put("resumeNavigationJson", new C27785h(0, 1, "resumeNavigationJson", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k = new C27788k("active_activity_session_table", map, AbstractC36095b.m114687o(map, "pauseSegmentsJson", new C27785h(0, 1, "pauseSegmentsJson", ShippingAddressField.TEXT_FIELD_TYPE, null, true), 0), new HashSet(0));
                C27788k c27788kM83879a = C27788k.m83879a("active_activity_session_table", interfaceC33687a);
                if (!c27788k.equals(c27788kM83879a)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("active_activity_session_table(com.whoop.activitysession.ActiveActivitySessionEntity).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a));
                }
                HashMap map2 = new HashMap(7);
                map2.put("internal_name", new C27785h(1, 1, "internal_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map2.put("display_name", new C27785h(0, 1, "display_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map2.put("icon_url", new C27785h(0, 1, "icon_url", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map2.put("deleted", new C27785h(0, 1, "deleted", "INTEGER", null, true));
                map2.put("category", new C27785h(0, 1, "category", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map2.put("score_type", new C27785h(0, 1, "score_type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k2 = new C27788k("table_activities_list", map2, AbstractC36095b.m114687o(map2, "has_gps", new C27785h(0, 1, "has_gps", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a2 = C27788k.m83879a("table_activities_list", interfaceC33687a);
                if (!c27788k2.equals(c27788kM83879a2)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_activities_list(com.whoop.addactivity.activitieslist.data.ActivityDto).\n Expected:\n", c27788k2, "\n Found:\n", c27788kM83879a2));
                }
                HashMap map3 = new HashMap(3);
                map3.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map3.put("responseJson", new C27785h(0, 1, "responseJson", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k3 = new C27788k("app_configuration_cache_table", map3, AbstractC36095b.m114687o(map3, "lastUpdated", new C27785h(0, 1, "lastUpdated", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a3 = C27788k.m83879a("app_configuration_cache_table", interfaceC33687a);
                if (!c27788k3.equals(c27788kM83879a3)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("app_configuration_cache_table(com.whoop.appconfiguration.AppConfigurationCacheEntity).\n Expected:\n", c27788k3, "\n Found:\n", c27788kM83879a3));
                }
                HashMap map4 = new HashMap(2);
                map4.put("configuration_key", new C27785h(1, 1, "configuration_key", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k4 = new C27788k(ConfigurationDtoKt.CONFIGURATIONS_TABLE_NAME, map4, AbstractC36095b.m114687o(map4, "configuration_value", new C27785h(0, 1, "configuration_value", ShippingAddressField.TEXT_FIELD_TYPE, null, true), 0), new HashSet(0));
                C27788k c27788kM83879a4 = C27788k.m83879a(ConfigurationDtoKt.CONFIGURATIONS_TABLE_NAME, interfaceC33687a);
                if (!c27788k4.equals(c27788kM83879a4)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_configurations(com.whoop.data.local.room.entity.ConfigurationDto).\n Expected:\n", c27788k4, "\n Found:\n", c27788kM83879a4));
                }
                HashMap map5 = new HashMap(4);
                map5.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map5.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map5.put("enabled", new C27785h(0, 1, "enabled", "INTEGER", null, true));
                C27788k c27788k5 = new C27788k("entitlement_table", map5, AbstractC36095b.m114687o(map5, "lastUpdated", new C27785h(0, 1, "lastUpdated", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a5 = C27788k.m83879a("entitlement_table", interfaceC33687a);
                if (!c27788k5.equals(c27788kM83879a5)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("entitlement_table(com.whoop.entitlements.EntitlementEntity).\n Expected:\n", c27788k5, "\n Found:\n", c27788kM83879a5));
                }
                HashMap map6 = new HashMap(3);
                map6.put("zone_id", new C27785h(1, 1, "zone_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map6.put("min", new C27785h(0, 1, "min", "INTEGER", null, true));
                C27788k c27788k6 = new C27788k("table_hr_zone_list", map6, AbstractC36095b.m114687o(map6, "max", new C27785h(0, 1, "max", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a6 = C27788k.m83879a("table_hr_zone_list", interfaceC33687a);
                if (!c27788k6.equals(c27788kM83879a6)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_hr_zone_list(com.whoop.hrZones.db.HrZoneDto).\n Expected:\n", c27788k6, "\n Found:\n", c27788kM83879a6));
                }
                HashMap map7 = new HashMap(12);
                map7.put("campaign_id", new C27785h(1, 1, "campaign_id", "INTEGER", null, true));
                map7.put("description", new C27785h(0, 1, "description", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map7.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map7.put("subtitle", new C27785h(0, 1, "subtitle", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map7.put("participation_cooldown_date", new C27785h(0, 1, "participation_cooldown_date", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map7.put("additional_collection_length", new C27785h(0, 1, "additional_collection_length", "INTEGER", null, false));
                map7.put("bthr_additional_collection_length", new C27785h(0, 1, "bthr_additional_collection_length", "INTEGER", null, false));
                map7.put("data_types", new C27785h(0, 1, "data_types", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map7.put("protocol_id", new C27785h(0, 1, "protocol_id", "INTEGER", null, false));
                map7.put("protocol_name", new C27785h(0, 1, "protocol_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map7.put("pdf_url", new C27785h(0, 1, "pdf_url", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k7 = new C27788k(LabsCampaignKt.LABS_CAMPAIGN_TABLE, map7, AbstractC36095b.m114687o(map7, "campaign_session_id", new C27785h(0, 1, "campaign_session_id", "INTEGER", null, false), 0), new HashSet(0));
                C27788k c27788kM83879a7 = C27788k.m83879a(LabsCampaignKt.LABS_CAMPAIGN_TABLE, interfaceC33687a);
                if (!c27788k7.equals(c27788kM83879a7)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("labs_campaign(com.whoop.whooplabs.data.domain.LabsCampaign).\n Expected:\n", c27788k7, "\n Found:\n", c27788kM83879a7));
                }
                HashMap map8 = new HashMap(2);
                map8.put("campaign_id", new C27785h(1, 1, "campaign_id", "INTEGER", null, true));
                C27788k c27788k8 = new C27788k("legal_document_to_campaign", map8, AbstractC36095b.m114687o(map8, "legal_id", new C27785h(2, 1, "legal_id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a8 = C27788k.m83879a("legal_document_to_campaign", interfaceC33687a);
                if (!c27788k8.equals(c27788kM83879a8)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("legal_document_to_campaign(com.whoop.whooplabs.data.room.entity.LabsCampaignToLegalDocumentCrossRef).\n Expected:\n", c27788k8, "\n Found:\n", c27788kM83879a8));
                }
                HashMap map9 = new HashMap(1);
                C27788k c27788k9 = new C27788k("whoop_labs_session", map9, AbstractC36095b.m114687o(map9, "campaign_session_id", new C27785h(1, 1, "campaign_session_id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a9 = C27788k.m83879a("whoop_labs_session", interfaceC33687a);
                if (!c27788k9.equals(c27788kM83879a9)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_session(com.whoop.whooplabs.data.domain.LabsSession).\n Expected:\n", c27788k9, "\n Found:\n", c27788kM83879a9));
                }
                HashMap map10 = new HashMap(5);
                map10.put("whoop_strap_id", new C27785h(1, 1, "whoop_strap_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("hardware_version", new C27785h(0, 1, "hardware_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("firmware_version", new C27785h(0, 1, "firmware_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("bluetooth_version", new C27785h(0, 1, "bluetooth_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k10 = new C27788k("whoop_labs_strap_info", map10, AbstractC36095b.m114687o(map10, "sig_proc_version", new C27785h(0, 1, "sig_proc_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true), 0), new HashSet(0));
                C27788k c27788kM83879a10 = C27788k.m83879a("whoop_labs_strap_info", interfaceC33687a);
                if (!c27788k10.equals(c27788kM83879a10)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_strap_info(com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo).\n Expected:\n", c27788k10, "\n Found:\n", c27788kM83879a10));
                }
                HashMap map11 = new HashMap(4);
                map11.put("legal_id", new C27785h(1, 1, "legal_id", "INTEGER", null, true));
                map11.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("pdf_url", new C27785h(0, 1, "pdf_url", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k11 = new C27788k("whoop_labs_legal_ducment", map11, AbstractC36095b.m114687o(map11, "pdf_file_name", new C27785h(0, 1, "pdf_file_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                C27788k c27788kM83879a11 = C27788k.m83879a("whoop_labs_legal_ducment", interfaceC33687a);
                if (!c27788k11.equals(c27788kM83879a11)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_legal_ducment(com.whoop.whooplabs.data.domain.LegalDocument).\n Expected:\n", c27788k11, "\n Found:\n", c27788kM83879a11));
                }
                HashMap map12 = new HashMap(2);
                map12.put("type", new C27785h(1, 1, "type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k12 = new C27788k(OnboardingStatusDaoKt.ONBOARDING_STATUS_TABLE_NAME, map12, AbstractC36095b.m114687o(map12, "isCompleted", new C27785h(0, 1, "isCompleted", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true), 0), new HashSet(0));
                C27788k c27788kM83879a12 = C27788k.m83879a(OnboardingStatusDaoKt.ONBOARDING_STATUS_TABLE_NAME, interfaceC33687a);
                if (!c27788k12.equals(c27788kM83879a12)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_onboarding_status(com.whoop.data.onboarding.OnboardingStatus).\n Expected:\n", c27788k12, "\n Found:\n", c27788kM83879a12));
                }
                HashMap map13 = new HashMap(5);
                map13.put("recovery", new C27785h(1, 1, "recovery", "INTEGER", null, true));
                map13.put("lower_optimal_strain", new C27785h(0, 1, "lower_optimal_strain", "REAL", null, true));
                map13.put("optimal_strain", new C27785h(0, 1, "optimal_strain", "REAL", null, true));
                map13.put("upper_optimal_strain", new C27785h(0, 1, "upper_optimal_strain", "REAL", null, true));
                C27788k c27788k13 = new C27788k(OptimalStrainMappingKt.OPTIMAL_STRAIN_MAPPING_TABLE, map13, AbstractC36095b.m114687o(map13, "cycle_id", new C27785h(0, 1, "cycle_id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a13 = C27788k.m83879a(OptimalStrainMappingKt.OPTIMAL_STRAIN_MAPPING_TABLE, interfaceC33687a);
                if (!c27788k13.equals(c27788kM83879a13)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("optimal_strain_mapping_table(com.whoop.data.local.room.entity.OptimalStrainMapping).\n Expected:\n", c27788k13, "\n Found:\n", c27788kM83879a13));
                }
                HashMap map14 = new HashMap(8);
                map14.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map14.put("activityInternalName", new C27785h(0, 1, "activityInternalName", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map14.put("garmentId", new C27785h(0, 1, "garmentId", "INTEGER", null, true));
                map14.put("startTime", new C27785h(0, 1, "startTime", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map14.put("endTime", new C27785h(0, 1, "endTime", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map14.put("gpsEnabled", new C27785h(0, 1, "gpsEnabled", "INTEGER", null, true));
                map14.put("queuedAtMs", new C27785h(0, 1, "queuedAtMs", "INTEGER", null, true));
                C27788k c27788k14 = new C27788k("pending_activity_save_table", map14, AbstractC36095b.m114687o(map14, "pauseSegmentsJson", new C27785h(0, 1, "pauseSegmentsJson", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                C27788k c27788kM83879a14 = C27788k.m83879a("pending_activity_save_table", interfaceC33687a);
                if (!c27788k14.equals(c27788kM83879a14)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("pending_activity_save_table(com.whoop.trackactivity.pendingsave.PendingActivitySaveEntity).\n Expected:\n", c27788k14, "\n Found:\n", c27788kM83879a14));
                }
                HashMap map15 = new HashMap(47);
                map15.put("campaign_id", new C27785h(1, 1, "campaign_id", "INTEGER", null, true));
                map15.put("step_id", new C27785h(2, 1, "step_id", "INTEGER", null, true));
                map15.put("text", new C27785h(0, 1, "text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("step_order", new C27785h(0, 1, "step_order", "INTEGER", null, true));
                map15.put("typeform_url", new C27785h(0, 1, "typeform_url", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("image_url", new C27785h(0, 1, "image_url", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("image_alt", new C27785h(0, 1, "image_alt", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("is_bp", new C27785h(0, 1, "is_bp", "INTEGER", null, true));
                map15.put("is_timer_active", new C27785h(0, 1, "is_timer_active", "INTEGER", null, false));
                map15.put("is_bthr", new C27785h(0, 1, "is_bthr", "INTEGER", null, true));
                map15.put("title", new C27785h(0, 1, "title", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("sub_title", new C27785h(0, 1, "sub_title", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("cta", new C27785h(0, 1, "cta", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("typeform_title", new C27785h(0, 1, "typeform_title", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("systolic_label", new C27785h(0, 1, "systolic_label", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("systolic_too_low_text", new C27785h(0, 1, "systolic_too_low_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("systolic_too_high_text", new C27785h(0, 1, "systolic_too_high_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("systolic_required_text", new C27785h(0, 1, "systolic_required_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("systolic_max", new C27785h(0, 1, "systolic_max", "INTEGER", null, false));
                map15.put("systolic_min", new C27785h(0, 1, "systolic_min", "INTEGER", null, false));
                map15.put("systolic_suffix", new C27785h(0, 1, "systolic_suffix", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("systolic_required", new C27785h(0, 1, "systolic_required", "INTEGER", null, false));
                map15.put("diastolic_label", new C27785h(0, 1, "diastolic_label", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("diastolic_too_low_text", new C27785h(0, 1, "diastolic_too_low_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("diastolic_too_high_text", new C27785h(0, 1, "diastolic_too_high_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("diastolic_required_text", new C27785h(0, 1, "diastolic_required_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("diastolic_max", new C27785h(0, 1, "diastolic_max", "INTEGER", null, false));
                map15.put("diastolic_min", new C27785h(0, 1, "diastolic_min", "INTEGER", null, false));
                map15.put("diastolic_suffix", new C27785h(0, 1, "diastolic_suffix", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("diastolic_required", new C27785h(0, 1, "diastolic_required", "INTEGER", null, false));
                map15.put("heart_rate_label", new C27785h(0, 1, "heart_rate_label", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("heart_rate_too_low_text", new C27785h(0, 1, "heart_rate_too_low_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("heart_rate_too_high_text", new C27785h(0, 1, "heart_rate_too_high_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("heart_required_text", new C27785h(0, 1, "heart_required_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("heart_rate_max", new C27785h(0, 1, "heart_rate_max", "INTEGER", null, false));
                map15.put("heart_rate_min", new C27785h(0, 1, "heart_rate_min", "INTEGER", null, false));
                map15.put("heart_rate_suffix", new C27785h(0, 1, "heart_rate_suffix", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("heart_rate_required", new C27785h(0, 1, "heart_rate_required", "INTEGER", null, false));
                map15.put("input_type", new C27785h(0, 1, "input_type", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("input_required", new C27785h(0, 1, "input_required", "INTEGER", null, true));
                map15.put("required_regex", new C27785h(0, 1, "required_regex", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("blocked_regex", new C27785h(0, 1, "blocked_regex", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("countdown_timer_required", new C27785h(0, 1, "countdown_timer_required", "INTEGER", null, true));
                map15.put("countdown_timer_seconds", new C27785h(0, 1, "countdown_timer_seconds", "INTEGER", null, false));
                map15.put("survey_form_id", new C27785h(0, 1, "survey_form_id", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map15.put("survey_vendor_metadata", new C27785h(0, 1, "survey_vendor_metadata", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k15 = new C27788k(ProtocolStepKt.PROTOCOL_STEP_TABLE, map15, AbstractC36095b.m114687o(map15, "survey_provider", new C27785h(0, 1, "survey_provider", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                C27788k c27788kM83879a15 = C27788k.m83879a(ProtocolStepKt.PROTOCOL_STEP_TABLE, interfaceC33687a);
                if (!c27788k15.equals(c27788kM83879a15)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("protocol_step(com.whoop.whooplabs.data.domain.ProtocolStep).\n Expected:\n", c27788k15, "\n Found:\n", c27788kM83879a15));
                }
                HashMap map16 = new HashMap(14);
                map16.put("campaign_id", new C27785h(1, 1, "campaign_id", "INTEGER", null, true));
                map16.put("result_id", new C27785h(2, 1, "result_id", "INTEGER", null, true));
                map16.put("step_order", new C27785h(0, 1, "step_order", "INTEGER", null, true));
                map16.put("start_timestamp", new C27785h(0, 1, "start_timestamp", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map16.put("end_timestamp", new C27785h(0, 1, "end_timestamp", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map16.put("typeform_submitted", new C27785h(0, 1, "typeform_submitted", "INTEGER", null, true));
                map16.put("text_option", new C27785h(0, 1, "text_option", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map16.put("number_input", new C27785h(0, 1, "number_input", "INTEGER", null, false));
                map16.put("text_input", new C27785h(0, 1, "text_input", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map16.put("timestamp_input", new C27785h(0, 1, "timestamp_input", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map16.put("timestamp", new C27785h(0, 1, "timestamp", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map16.put("systolic", new C27785h(0, 1, "systolic", "INTEGER", null, false));
                map16.put("diastolic", new C27785h(0, 1, "diastolic", "INTEGER", null, false));
                C27788k c27788k16 = new C27788k("whoop_labs_protocol_step_result", map16, AbstractC36095b.m114687o(map16, "heart_rate", new C27785h(0, 1, "heart_rate", "INTEGER", null, false), 0), new HashSet(0));
                C27788k c27788kM83879a16 = C27788k.m83879a("whoop_labs_protocol_step_result", interfaceC33687a);
                if (!c27788k16.equals(c27788kM83879a16)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_protocol_step_result(com.whoop.whooplabs.data.room.entity.ProtocolStepResult).\n Expected:\n", c27788k16, "\n Found:\n", c27788kM83879a16));
                }
                HashMap map17 = new HashMap(7);
                map17.put("internal_name", new C27785h(1, 1, "internal_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map17.put("display_name", new C27785h(0, 1, "display_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map17.put("icon_url", new C27785h(0, 1, "icon_url", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map17.put("deleted", new C27785h(0, 1, "deleted", "INTEGER", null, true));
                map17.put("category", new C27785h(0, 1, "category", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map17.put("score_type", new C27785h(0, 1, "score_type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k17 = new C27788k("table_recent_activities", map17, AbstractC36095b.m114687o(map17, "has_gps", new C27785h(0, 1, "has_gps", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a17 = C27788k.m83879a("table_recent_activities", interfaceC33687a);
                if (!c27788k17.equals(c27788kM83879a17)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_recent_activities(com.whoop.addactivity.activitieslist.data.RecentActivityDto).\n Expected:\n", c27788k17, "\n Found:\n", c27788kM83879a17));
                }
                HashMap map18 = new HashMap(16);
                map18.put("user_id", new C27785h(1, 1, "user_id", "INTEGER", null, true));
                map18.put("window_minutes", new C27785h(0, 1, "window_minutes", "INTEGER", null, true));
                map18.put("upper_time_bound", new C27785h(0, 1, "upper_time_bound", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map18.put("last_triggered_at", new C27785h(0, 1, "last_triggered_at", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map18.put("sleep_score_goal", new C27785h(0, 1, "sleep_score_goal", "INTEGER", null, false));
                map18.put("recovery_score_goal", new C27785h(0, 1, "recovery_score_goal", "INTEGER", null, false));
                map18.put(WeeklyPlanApiKt.GOAL, new C27785h(0, 1, WeeklyPlanApiKt.GOAL, ShippingAddressField.TEXT_FIELD_TYPE, "'EXACT_TIME_PEAK'", true));
                map18.put("enabled", new C27785h(0, 1, "enabled", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                map18.put("last_updated_at", new C27785h(0, 1, "last_updated_at", "INTEGER", null, true));
                map18.put("schedule_enabled", new C27785h(0, 1, "schedule_enabled", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                map18.put("day_of_week", new C27785h(0, 1, "day_of_week", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map18.put("enrolled_weekly_plan", new C27785h(0, 1, "enrolled_weekly_plan", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                map18.put("weekly_plan_goal", new C27785h(0, 1, "weekly_plan_goal", "INTEGER", null, false));
                map18.put("time_zone_offset", new C27785h(0, 1, "time_zone_offset", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map18.put("alarm_bounds", new C27785h(0, 1, "alarm_bounds", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k18 = new C27788k(SmartAlarmUserInfoKt.SMART_ALARM_USER_INFO_TABLE_NAME, map18, AbstractC36095b.m114687o(map18, "weekly_plan_hour_goal", new C27785h(0, 1, "weekly_plan_hour_goal", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                C27788k c27788kM83879a18 = C27788k.m83879a(SmartAlarmUserInfoKt.SMART_ALARM_USER_INFO_TABLE_NAME, interfaceC33687a);
                if (!c27788k18.equals(c27788kM83879a18)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("smart_alarm_user_info_table(com.whoop.data.local.room.entity.SmartAlarmUserInfo).\n Expected:\n", c27788k18, "\n Found:\n", c27788kM83879a18));
                }
                HashMap map19 = new HashMap(1);
                C27788k c27788k19 = new C27788k("table_smart_alarm_triggered", map19, AbstractC36095b.m114687o(map19, "composite_id", new C27785h(1, 1, "composite_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true), 0), new HashSet(0));
                C27788k c27788kM83879a19 = C27788k.m83879a("table_smart_alarm_triggered", interfaceC33687a);
                if (!c27788k19.equals(c27788kM83879a19)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_smart_alarm_triggered(com.whoop.smart.alarm.data.room.entity.SmartAlarmUserInfoCompositeId).\n Expected:\n", c27788k19, "\n Found:\n", c27788kM83879a19));
                }
                HashMap map20 = new HashMap(14);
                map20.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map20.put("created_at", new C27785h(0, 1, "created_at", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("first_name", new C27785h(0, 1, "first_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("last_name", new C27785h(0, 1, "last_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("full_name", new C27785h(0, 1, "full_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("email_address", new C27785h(0, 1, "email_address", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("password", new C27785h(0, 1, "password", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("username", new C27785h(0, 1, "username", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("avatar_url", new C27785h(0, 1, "avatar_url", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("city", new C27785h(0, 1, "city", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map20.put("admin_division", new C27785h(0, 1, "admin_division", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map20.put("country", new C27785h(0, 1, "country", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map20.put("concealed", new C27785h(0, 1, "concealed", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                C27788k c27788k20 = new C27788k("table_user", map20, AbstractC36095b.m114687o(map20, HttpHeaders.AGE, new C27785h(0, 1, HttpHeaders.AGE, "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a20 = C27788k.m83879a("table_user", interfaceC33687a);
                if (!c27788k20.equals(c27788kM83879a20)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_user(com.whoop.service.store.user.dao.UserEntity).\n Expected:\n", c27788k20, "\n Found:\n", c27788kM83879a20));
                }
                HashMap map21 = new HashMap(12);
                map21.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map21.put("gender", new C27785h(0, 1, "gender", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map21.put("height", new C27785h(0, 1, "height", "REAL", null, true));
                map21.put("weight", new C27785h(0, 1, "weight", "REAL", null, true));
                map21.put("birthday", new C27785h(0, 1, "birthday", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map21.put("time_zone_offset", new C27785h(0, 1, "time_zone_offset", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map21.put("unit_system", new C27785h(0, 1, "unit_system", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map21.put("fitness_level", new C27785h(0, 1, "fitness_level", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map21.put("max_heart_rate", new C27785h(0, 1, "max_heart_rate", "INTEGER", null, true));
                map21.put("min_heart_rate", new C27785h(0, 1, "min_heart_rate", "INTEGER", null, true));
                map21.put("physiological_baseline", new C27785h(0, 1, "physiological_baseline", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k21 = new C27788k("table_user_profile", map21, AbstractC36095b.m114687o(map21, "can_upload_data", new C27785h(0, 1, "can_upload_data", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a21 = C27788k.m83879a("table_user_profile", interfaceC33687a);
                if (!c27788k21.equals(c27788kM83879a21)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_user_profile(com.whoop.service.store.user.dao.UserProfileEntity).\n Expected:\n", c27788k21, "\n Found:\n", c27788kM83879a21));
                }
                HashMap map22 = new HashMap(3);
                map22.put("hr_device_id", new C27785h(1, 1, "hr_device_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map22.put("device_name", new C27785h(0, 1, "device_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k22 = new C27788k("whoop_labs_hr_device", map22, AbstractC36095b.m114687o(map22, "hr_file_path", new C27785h(0, 1, "hr_file_path", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                C27788k c27788kM83879a22 = C27788k.m83879a("whoop_labs_hr_device", interfaceC33687a);
                if (!c27788k22.equals(c27788kM83879a22)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_hr_device(com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice).\n Expected:\n", c27788k22, "\n Found:\n", c27788kM83879a22));
                }
                HashMap map23 = new HashMap(9);
                map23.put("study_id", new C27785h(1, 1, "study_id", "INTEGER", null, true));
                map23.put("start_time", new C27785h(0, 1, "start_time", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map23.put("end_time", new C27785h(0, 1, "end_time", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map23.put("hr_device_connected", new C27785h(0, 1, "hr_device_connected", "INTEGER", null, true));
                map23.put(NotificationCompat.CATEGORY_STATUS, new C27785h(0, 1, NotificationCompat.CATEGORY_STATUS, ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map23.put("campaign_id", new C27785h(0, 1, "campaign_id", "INTEGER", null, true));
                map23.put("pdf_file_name", new C27785h(0, 1, "pdf_file_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map23.put(ProtocolStepKt.PROTOCOL_STEP_TABLE, new C27785h(0, 1, ProtocolStepKt.PROTOCOL_STEP_TABLE, "INTEGER", null, true));
                C27788k c27788k23 = new C27788k("whoop_labs_study", map23, AbstractC36095b.m114687o(map23, "protocol_completed", new C27785h(0, 1, "protocol_completed", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a23 = C27788k.m83879a("whoop_labs_study", interfaceC33687a);
                if (!c27788k23.equals(c27788kM83879a23)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_study(com.whoop.whooplabs.data.room.entity.WhoopLabsStudy).\n Expected:\n", c27788k23, "\n Found:\n", c27788kM83879a23));
                }
                HashMap map24 = new HashMap(4);
                map24.put("timestamp", new C27785h(0, 1, "timestamp", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map24.put("note", new C27785h(0, 1, "note", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map24.put("campaign_id", new C27785h(0, 1, "campaign_id", "INTEGER", null, true));
                C27788k c27788k24 = new C27788k("whoop_labs_study_tag", map24, AbstractC36095b.m114687o(map24, "tag_id", new C27785h(1, 1, "tag_id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a24 = C27788k.m83879a("whoop_labs_study_tag", interfaceC33687a);
                if (!c27788k24.equals(c27788kM83879a24)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_study_tag(com.whoop.whooplabs.data.room.entity.WhoopLabsStudyTag).\n Expected:\n", c27788k24, "\n Found:\n", c27788kM83879a24));
                }
                HashMap map25 = new HashMap(4);
                map25.put("step_id", new C27785h(1, 1, "step_id", "INTEGER", null, true));
                map25.put("option_order", new C27785h(0, 1, "option_order", "INTEGER", null, true));
                map25.put("option_key", new C27785h(2, 1, "option_key", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k25 = new C27788k(OptionSelectionKt.INPUT_OPTION_TABLE_NAME, map25, AbstractC36095b.m114687o(map25, "option_value", new C27785h(0, 1, "option_value", ShippingAddressField.TEXT_FIELD_TYPE, null, true), 0), new HashSet(0));
                C27788k c27788kM83879a25 = C27788k.m83879a(OptionSelectionKt.INPUT_OPTION_TABLE_NAME, interfaceC33687a);
                if (!c27788k25.equals(c27788kM83879a25)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_input_option(com.whoop.whooplabs.data.domain.OptionSelection).\n Expected:\n", c27788k25, "\n Found:\n", c27788kM83879a25));
                }
                HashMap map26 = new HashMap(8);
                map26.put("step_id", new C27785h(1, 1, "step_id", "INTEGER", null, true));
                map26.put("input_label", new C27785h(0, 1, "input_label", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map26.put("min", new C27785h(0, 1, "min", "INTEGER", null, false));
                map26.put("max", new C27785h(0, 1, "max", "INTEGER", null, false));
                map26.put("min_error_text", new C27785h(0, 1, "min_error_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map26.put("max_error_text", new C27785h(0, 1, "max_error_text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map26.put("hint", new C27785h(0, 1, "hint", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k26 = new C27788k(ProtocolStepConfigKt.PROTOCOL_STEP_CONFIG_TABLE, map26, AbstractC36095b.m114687o(map26, "row_count", new C27785h(0, 1, "row_count", "INTEGER", null, false), 0), new HashSet(0));
                C27788k c27788kM83879a26 = C27788k.m83879a(ProtocolStepConfigKt.PROTOCOL_STEP_CONFIG_TABLE, interfaceC33687a);
                if (!c27788k26.equals(c27788kM83879a26)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("whoop_labs_protocol_step_config(com.whoop.whooplabs.data.domain.ProtocolStepConfig).\n Expected:\n", c27788k26, "\n Found:\n", c27788kM83879a26));
                }
                HashMap map27 = new HashMap(10);
                map27.put("timestamp", new C27785h(1, 1, "timestamp", "INTEGER", null, true));
                map27.put("latitude", new C27785h(0, 1, "latitude", "REAL", null, true));
                map27.put("longitude", new C27785h(0, 1, "longitude", "REAL", null, true));
                map27.put("altitude", new C27785h(0, 1, "altitude", "REAL", null, true));
                map27.put("horizontal_accuracy_meters", new C27785h(0, 1, "horizontal_accuracy_meters", "REAL", null, true));
                map27.put("vertical_accuracy_meters", new C27785h(0, 1, "vertical_accuracy_meters", "REAL", null, true));
                map27.put("speed_value", new C27785h(0, 1, "speed_value", "REAL", null, false));
                map27.put("speed_unit", new C27785h(0, 1, "speed_unit", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map27.put("speed_accuracy", new C27785h(0, 1, "speed_accuracy", "REAL", null, false));
                HashSet hashSetM114687o = AbstractC36095b.m114687o(map27, "trigger", new C27785h(0, 1, "trigger", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0);
                HashSet hashSet = new HashSet(1);
                hashSet.add(new C27787j("index_gps_locations_timestamp", Arrays.asList("timestamp"), Arrays.asList("ASC"), false));
                C27788k c27788k27 = new C27788k("gps_locations", map27, hashSetM114687o, hashSet);
                C27788k c27788kM83879a27 = C27788k.m83879a("gps_locations", interfaceC33687a);
                if (!c27788k27.equals(c27788kM83879a27)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("gps_locations(com.whoop.gps.data.entity.GpsLocationDto).\n Expected:\n", c27788k27, "\n Found:\n", c27788kM83879a27));
                }
                HashMap map28 = new HashMap(3);
                map28.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map28.put("membershipType", new C27785h(0, 1, "membershipType", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k28 = new C27788k("membership_type_table", map28, AbstractC36095b.m114687o(map28, "lastUpdated", new C27785h(0, 1, "lastUpdated", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a28 = C27788k.m83879a("membership_type_table", interfaceC33687a);
                if (!c27788k28.equals(c27788kM83879a28)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("membership_type_table(com.whoop.entitlements.MembershipTypeEntity).\n Expected:\n", c27788k28, "\n Found:\n", c27788kM83879a28));
                }
                HashMap map29 = new HashMap(7);
                map29.put("sessionStartTimeMs", new C27785h(1, 1, "sessionStartTimeMs", "INTEGER", null, true));
                map29.put("timestamp", new C27785h(2, 1, "timestamp", "INTEGER", null, true));
                map29.put("latitude", new C27785h(0, 1, "latitude", "REAL", null, true));
                map29.put("longitude", new C27785h(0, 1, "longitude", "REAL", null, true));
                map29.put("altitude", new C27785h(0, 1, "altitude", "REAL", null, true));
                map29.put("horizontal_accuracy_meters", new C27785h(0, 1, "horizontal_accuracy_meters", "REAL", null, true));
                HashSet hashSetM114687o2 = AbstractC36095b.m114687o(map29, "vertical_accuracy_meters", new C27785h(0, 1, "vertical_accuracy_meters", "REAL", null, true), 0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new C27787j("index_foreground_gps_route_points_sessionStartTimeMs", Arrays.asList("sessionStartTimeMs"), Arrays.asList("ASC"), false));
                C27788k c27788k29 = new C27788k("foreground_gps_route_points", map29, hashSetM114687o2, hashSet2);
                C27788k c27788kM83879a29 = C27788k.m83879a("foreground_gps_route_points", interfaceC33687a);
                return !c27788k29.equals(c27788kM83879a29) ? new C1784f1(false, AbstractC17176i.m48505g("foreground_gps_route_points(com.whoop.gps.foreground.data.entity.ForegroundGpsRoutePointEntity).\n Expected:\n", c27788k29, "\n Found:\n", c27788kM83879a29)) : new C1784f1(true, null);
            }
        };
    }
}
