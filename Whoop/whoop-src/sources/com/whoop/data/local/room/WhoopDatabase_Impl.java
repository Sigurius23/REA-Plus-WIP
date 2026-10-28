package com.whoop.data.local.room;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import com.whoop.data.local.room.dao.persistent.RawDataDao;
import com.whoop.data.local.room.dao.persistent.RawDataDao_Impl;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao_Impl;
import com.whoop.data.local.room.dao.wipeable.GpsDao;
import com.whoop.data.local.room.dao.wipeable.GpsDao_Impl;
import com.whoop.data.local.room.dao.wipeable.JournalDao;
import com.whoop.data.local.room.dao.wipeable.JournalDao_Impl;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao_Impl;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamsDao;
import com.whoop.data.local.room.dao.wipeable.TeamsDao_Impl;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.service.network.model.UserState;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27787j;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p555vl.AbstractC36095b;
import se.AbstractC32410a;
import tr2.C34109g;
import tr2.InterfaceC34108f;
import yt0.C39764c;
import yt0.InterfaceC39762a;

/* JADX INFO: loaded from: classes.dex */
public final class WhoopDatabase_Impl extends WhoopDatabase {
    private volatile InterfaceC39762a _consolePacketsDao;
    private volatile FeatureTeamDao _featureTeamDao;
    private volatile GpsDao _gpsDao;
    private volatile JournalDao _journalDao;
    private volatile InterfaceC34108f _logEventsDao;
    private volatile MemberStoryDao _memberStoryDao;
    private volatile RawDataDao _rawDataDao;
    private volatile SmartAlarmDiagnosticDao _smartAlarmDiagnosticDao;
    private volatile TeamInviteDao _teamInviteDao;
    private volatile TeamsDao _teamsDao;

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, "table_teams", "table_default_images", "table_journal_answers", "table_log_stream", "table_gps", "table_gps_meta_data", "table_team_invites", "table_console_packets", "table_feature_teams", "table_raw_data", "table_member_stories", "table_smart_alarm_diagnostics");
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public InterfaceC39762a consolePacketsDao() {
        InterfaceC39762a interfaceC39762a;
        if (this._consolePacketsDao != null) {
            return this._consolePacketsDao;
        }
        synchronized (this) {
            try {
                if (this._consolePacketsDao == null) {
                    this._consolePacketsDao = new C39764c(this);
                }
                interfaceC39762a = this._consolePacketsDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC39762a;
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), "table_teams", "table_default_images", "table_journal_answers", "table_log_stream", "table_gps", "table_gps_meta_data", "table_team_invites", "table_console_packets", "table_feature_teams", "table_raw_data", "table_member_stories", "table_smart_alarm_diagnostics");
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public FeatureTeamDao featureTeamDao() {
        FeatureTeamDao featureTeamDao;
        if (this._featureTeamDao != null) {
            return this._featureTeamDao;
        }
        synchronized (this) {
            try {
                if (this._featureTeamDao == null) {
                    this._featureTeamDao = new FeatureTeamDao_Impl(this);
                }
                featureTeamDao = this._featureTeamDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return featureTeamDao;
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
        map.put(TeamsDao.class, TeamsDao_Impl.getRequiredConverters());
        map.put(JournalDao.class, JournalDao_Impl.getRequiredConverters());
        map.put(InterfaceC34108f.class, C34109g.m107823q());
        map.put(GpsDao.class, GpsDao_Impl.getRequiredConverters());
        map.put(TeamInviteDao.class, TeamInviteDao_Impl.getRequiredConverters());
        map.put(InterfaceC39762a.class, C39764c.m127285k());
        map.put(FeatureTeamDao.class, FeatureTeamDao_Impl.getRequiredConverters());
        map.put(RawDataDao.class, RawDataDao_Impl.getRequiredConverters());
        map.put(MemberStoryDao.class, MemberStoryDao_Impl.getRequiredConverters());
        map.put(SmartAlarmDiagnosticDao.class, SmartAlarmDiagnosticDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public GpsDao gpsDao() {
        GpsDao gpsDao;
        if (this._gpsDao != null) {
            return this._gpsDao;
        }
        synchronized (this) {
            try {
                if (this._gpsDao == null) {
                    this._gpsDao = new GpsDao_Impl(this);
                }
                gpsDao = this._gpsDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return gpsDao;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public JournalDao journalDao() {
        JournalDao journalDao;
        if (this._journalDao != null) {
            return this._journalDao;
        }
        synchronized (this) {
            try {
                if (this._journalDao == null) {
                    this._journalDao = new JournalDao_Impl(this);
                }
                journalDao = this._journalDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return journalDao;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public InterfaceC34108f logEventsDao() {
        InterfaceC34108f interfaceC34108f;
        if (this._logEventsDao != null) {
            return this._logEventsDao;
        }
        synchronized (this) {
            try {
                if (this._logEventsDao == null) {
                    this._logEventsDao = new C34109g(this);
                }
                interfaceC34108f = this._logEventsDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC34108f;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public MemberStoryDao memberStoryDao() {
        MemberStoryDao memberStoryDao;
        if (this._memberStoryDao != null) {
            return this._memberStoryDao;
        }
        synchronized (this) {
            try {
                if (this._memberStoryDao == null) {
                    this._memberStoryDao = new MemberStoryDao_Impl(this);
                }
                memberStoryDao = this._memberStoryDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return memberStoryDao;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public RawDataDao rawDataDao() {
        RawDataDao rawDataDao;
        if (this._rawDataDao != null) {
            return this._rawDataDao;
        }
        synchronized (this) {
            try {
                if (this._rawDataDao == null) {
                    this._rawDataDao = new RawDataDao_Impl(this);
                }
                rawDataDao = this._rawDataDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return rawDataDao;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public SmartAlarmDiagnosticDao smartAlarmDiagnosticDao() {
        SmartAlarmDiagnosticDao smartAlarmDiagnosticDao;
        if (this._smartAlarmDiagnosticDao != null) {
            return this._smartAlarmDiagnosticDao;
        }
        synchronized (this) {
            try {
                if (this._smartAlarmDiagnosticDao == null) {
                    this._smartAlarmDiagnosticDao = new SmartAlarmDiagnosticDao_Impl(this);
                }
                smartAlarmDiagnosticDao = this._smartAlarmDiagnosticDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return smartAlarmDiagnosticDao;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public TeamsDao teamsDao() {
        TeamsDao teamsDao;
        if (this._teamsDao != null) {
            return this._teamsDao;
        }
        synchronized (this) {
            try {
                if (this._teamsDao == null) {
                    this._teamsDao = new TeamsDao_Impl(this);
                }
                teamsDao = this._teamsDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return teamsDao;
    }

    @Override // com.whoop.data.local.room.WhoopDatabase
    public TeamInviteDao teamsInviteDao() {
        TeamInviteDao teamInviteDao;
        if (this._teamInviteDao != null) {
            return this._teamInviteDao;
        }
        synchronized (this) {
            try {
                if (this._teamInviteDao == null) {
                    this._teamInviteDao = new TeamInviteDao_Impl(this);
                }
                teamInviteDao = this._teamInviteDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return teamInviteDao;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new AbstractC1788g1(44, "7f8f6cda74cddb64af0f9f3afdcd2fad", "d680932c422189e1fccc4fe4b5e51a08") { // from class: com.whoop.data.local.room.WhoopDatabase_Impl.1
            @Override // androidx.room.AbstractC1788g1
            public void createAllTables(InterfaceC33687a interfaceC33687a) {
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_teams` (`user_id` INTEGER, `id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `icon_url` TEXT NOT NULL, `banner_url` TEXT NOT NULL, `athlete_privacy_id` INTEGER NOT NULL, `scores` TEXT NOT NULL, `admin_id` INTEGER NOT NULL, `team_type` TEXT NOT NULL, `member_count` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `chat_enable` INTEGER NOT NULL, `unread_count` INTEGER NOT NULL, `team_privacy_profile_id` INTEGER, `team_privacy_profile_name` TEXT, `basic` INTEGER, `stats` INTEGER, `comps` INTEGER, `overview` INTEGER, `intensity` INTEGER, `recovery` INTEGER, `sleep` INTEGER, `cid` TEXT, `channel_id` TEXT, `channel_type` TEXT, `channel_name` TEXT, PRIMARY KEY(`id`, `team_type`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_default_images` (`id` INTEGER NOT NULL, `banners` TEXT NOT NULL, `avatars` TEXT NOT NULL, PRIMARY KEY(`id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_journal_answers` (`cycle_id` INTEGER NOT NULL, `is_journal_shown` INTEGER NOT NULL, `is_journal_answered` INTEGER NOT NULL, PRIMARY KEY(`cycle_id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_log_stream` (`user_id` INTEGER, `utc_date_time` TEXT, `local_date_time` TEXT, `body` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_gps` (`time_stamp` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL, `horizontal_accuracy` REAL NOT NULL, `vertical_accuracy` REAL NOT NULL, PRIMARY KEY(`time_stamp`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_gps_meta_data` (`start_date` INTEGER NOT NULL, `end_date` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_team_invites` (`id` INTEGER NOT NULL, `status` TEXT NOT NULL, `deleted` INTEGER NOT NULL, `community_id` INTEGER NOT NULL, `sender_id` INTEGER NOT NULL, `recipient_id` INTEGER NOT NULL, `community` TEXT, `sender` TEXT, `community_invite_code` TEXT, `showBadge` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`id`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_console_packets` (`packet_time_stamp_utc` INTEGER NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `strap_id` TEXT NOT NULL, `hw_version` TEXT NOT NULL, `maxim_version` TEXT NOT NULL, `dsp_version` TEXT NOT NULL, `nordic_version` TEXT NOT NULL, `sequence_number` INTEGER NOT NULL, `received_packet_raw` BLOB NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_feature_teams` (`name` TEXT NOT NULL, `description` TEXT, `iconUrl` TEXT NOT NULL, `bannerUrl` TEXT NOT NULL, `athletePrivacyId` INTEGER NOT NULL, `memberCount` INTEGER NOT NULL, `inviteCode` TEXT NOT NULL, `teamType` TEXT NOT NULL, `communityId` INTEGER NOT NULL, `showBadge` INTEGER NOT NULL DEFAULT 1, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_raw_data` (`timestamp` INTEGER NOT NULL, `hw_version` TEXT NOT NULL, `maxim_version` TEXT NOT NULL, `dsp_version` TEXT NOT NULL, `strap_id` TEXT NOT NULL, `binary_version` INTEGER NOT NULL, `binary_flags` INTEGER NOT NULL, `raw_data_version` TEXT NOT NULL, `payload` BLOB NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_table_raw_data_timestamp_raw_data_version` ON `table_raw_data` (`timestamp`, `raw_data_version`)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_member_stories` (`memberStoryId` INTEGER NOT NULL, `created_at` TEXT NOT NULL, `updated_at` TEXT NOT NULL, `title` TEXT NOT NULL, `publish_date` TEXT NOT NULL, `url` TEXT NOT NULL, `image` TEXT NOT NULL, `content_type` TEXT NOT NULL, `showBadge` INTEGER NOT NULL DEFAULT 1, `description` TEXT NOT NULL, `deleted` INTEGER NOT NULL DEFAULT 0, `featured` INTEGER NOT NULL DEFAULT 0, `live` INTEGER NOT NULL DEFAULT 0, `archived` INTEGER NOT NULL DEFAULT 0, `live_time` TEXT NOT NULL, `host_id` INTEGER NOT NULL, `url_text` TEXT NOT NULL, `cta_text` TEXT NOT NULL DEFAULT 'Join the discussion', `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER, `first_name` TEXT, `last_name` TEXT, `name` TEXT, `username` TEXT, `avatar_url` TEXT, `host_created_at` TEXT, `host_updated_at` TEXT)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_smart_alarm_diagnostics` (`event_type` TEXT NOT NULL, `alarm_trigger` TEXT, `timestamp_millis` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `isAckSuccess` INTEGER, `devicePlatform` TEXT NOT NULL, `deviceOs` TEXT NOT NULL, `deviceModel` TEXT NOT NULL, `strapId` TEXT NOT NULL, `maximVersion` TEXT NOT NULL, `nordicVersion` TEXT NOT NULL, `batteryOptimizationOn` INTEGER NOT NULL, `phoneSetAlarmTime` TEXT, `strapReportedAlarmTime` TEXT, `isStrapConnected` INTEGER)", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
                AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7f8f6cda74cddb64af0f9f3afdcd2fad')", interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void dropAllTables(InterfaceC33687a interfaceC33687a) {
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_teams`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_default_images`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_journal_answers`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_log_stream`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_gps`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_gps_meta_data`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_team_invites`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_console_packets`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_feature_teams`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_raw_data`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_member_stories`", interfaceC33687a);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_smart_alarm_diagnostics`", interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void onCreate(InterfaceC33687a interfaceC33687a) {
            }

            @Override // androidx.room.AbstractC1788g1
            public void onOpen(InterfaceC33687a interfaceC33687a) {
                WhoopDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
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
                HashMap map = new HashMap(27);
                map.put("user_id", new C27785h(0, 1, "user_id", "INTEGER", null, false));
                map.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("description", new C27785h(0, 1, "description", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("icon_url", new C27785h(0, 1, "icon_url", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("banner_url", new C27785h(0, 1, "banner_url", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("athlete_privacy_id", new C27785h(0, 1, "athlete_privacy_id", "INTEGER", null, true));
                map.put("scores", new C27785h(0, 1, "scores", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("admin_id", new C27785h(0, 1, "admin_id", "INTEGER", null, true));
                map.put("team_type", new C27785h(2, 1, "team_type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("member_count", new C27785h(0, 1, "member_count", "INTEGER", null, true));
                map.put("rank", new C27785h(0, 1, "rank", "INTEGER", null, true));
                map.put("chat_enable", new C27785h(0, 1, "chat_enable", "INTEGER", null, true));
                map.put("unread_count", new C27785h(0, 1, "unread_count", "INTEGER", null, true));
                map.put("team_privacy_profile_id", new C27785h(0, 1, "team_privacy_profile_id", "INTEGER", null, false));
                map.put("team_privacy_profile_name", new C27785h(0, 1, "team_privacy_profile_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("basic", new C27785h(0, 1, "basic", "INTEGER", null, false));
                map.put("stats", new C27785h(0, 1, "stats", "INTEGER", null, false));
                map.put("comps", new C27785h(0, 1, "comps", "INTEGER", null, false));
                map.put("overview", new C27785h(0, 1, "overview", "INTEGER", null, false));
                map.put("intensity", new C27785h(0, 1, "intensity", "INTEGER", null, false));
                map.put("recovery", new C27785h(0, 1, "recovery", "INTEGER", null, false));
                map.put(UserState.States.SLEEP, new C27785h(0, 1, UserState.States.SLEEP, "INTEGER", null, false));
                map.put("cid", new C27785h(0, 1, "cid", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("channel_id", new C27785h(0, 1, "channel_id", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("channel_type", new C27785h(0, 1, "channel_type", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k = new C27788k("table_teams", map, AbstractC36095b.m114687o(map, "channel_name", new C27785h(0, 1, "channel_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                C27788k c27788kM83879a = C27788k.m83879a("table_teams", interfaceC33687a);
                if (!c27788k.equals(c27788kM83879a)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_teams(com.whoop.data.local.room.entity.TeamsDto).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a));
                }
                HashMap map2 = new HashMap(3);
                map2.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map2.put("banners", new C27785h(0, 1, "banners", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k2 = new C27788k("table_default_images", map2, AbstractC36095b.m114687o(map2, "avatars", new C27785h(0, 1, "avatars", ShippingAddressField.TEXT_FIELD_TYPE, null, true), 0), new HashSet(0));
                C27788k c27788kM83879a2 = C27788k.m83879a("table_default_images", interfaceC33687a);
                if (!c27788k2.equals(c27788kM83879a2)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_default_images(com.whoop.service.network.model.DefaultImages).\n Expected:\n", c27788k2, "\n Found:\n", c27788kM83879a2));
                }
                HashMap map3 = new HashMap(3);
                map3.put("cycle_id", new C27785h(1, 1, "cycle_id", "INTEGER", null, true));
                map3.put("is_journal_shown", new C27785h(0, 1, "is_journal_shown", "INTEGER", null, true));
                C27788k c27788k3 = new C27788k("table_journal_answers", map3, AbstractC36095b.m114687o(map3, "is_journal_answered", new C27785h(0, 1, "is_journal_answered", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a3 = C27788k.m83879a("table_journal_answers", interfaceC33687a);
                if (!c27788k3.equals(c27788kM83879a3)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_journal_answers(com.whoop.data.local.room.entity.JournalAnsweredDto).\n Expected:\n", c27788k3, "\n Found:\n", c27788kM83879a3));
                }
                HashMap map4 = new HashMap(5);
                map4.put("user_id", new C27785h(0, 1, "user_id", "INTEGER", null, false));
                map4.put("utc_date_time", new C27785h(0, 1, "utc_date_time", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map4.put("local_date_time", new C27785h(0, 1, "local_date_time", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map4.put("body", new C27785h(0, 1, "body", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                C27788k c27788k4 = new C27788k("table_log_stream", map4, AbstractC36095b.m114687o(map4, "id", new C27785h(1, 1, "id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a4 = C27788k.m83879a("table_log_stream", interfaceC33687a);
                if (!c27788k4.equals(c27788kM83879a4)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_log_stream(com.whoop.util.log.LogEventsDto).\n Expected:\n", c27788k4, "\n Found:\n", c27788kM83879a4));
                }
                HashMap map5 = new HashMap(6);
                map5.put("time_stamp", new C27785h(1, 1, "time_stamp", "INTEGER", null, true));
                map5.put("latitude", new C27785h(0, 1, "latitude", "REAL", null, true));
                map5.put("longitude", new C27785h(0, 1, "longitude", "REAL", null, true));
                map5.put("altitude", new C27785h(0, 1, "altitude", "REAL", null, true));
                map5.put("horizontal_accuracy", new C27785h(0, 1, "horizontal_accuracy", "REAL", null, true));
                C27788k c27788k5 = new C27788k("table_gps", map5, AbstractC36095b.m114687o(map5, "vertical_accuracy", new C27785h(0, 1, "vertical_accuracy", "REAL", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a5 = C27788k.m83879a("table_gps", interfaceC33687a);
                if (!c27788k5.equals(c27788kM83879a5)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_gps(com.whoop.data.local.room.entity.GpsDto).\n Expected:\n", c27788k5, "\n Found:\n", c27788kM83879a5));
                }
                HashMap map6 = new HashMap(3);
                map6.put("start_date", new C27785h(0, 1, "start_date", "INTEGER", null, true));
                map6.put("end_date", new C27785h(0, 1, "end_date", "INTEGER", null, true));
                C27788k c27788k6 = new C27788k("table_gps_meta_data", map6, AbstractC36095b.m114687o(map6, "id", new C27785h(1, 1, "id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a6 = C27788k.m83879a("table_gps_meta_data", interfaceC33687a);
                if (!c27788k6.equals(c27788kM83879a6)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_gps_meta_data(com.whoop.data.local.room.entity.GpsMetaDataDto).\n Expected:\n", c27788k6, "\n Found:\n", c27788kM83879a6));
                }
                HashMap map7 = new HashMap(10);
                map7.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map7.put(NotificationCompat.CATEGORY_STATUS, new C27785h(0, 1, NotificationCompat.CATEGORY_STATUS, ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map7.put("deleted", new C27785h(0, 1, "deleted", "INTEGER", null, true));
                map7.put("community_id", new C27785h(0, 1, "community_id", "INTEGER", null, true));
                map7.put("sender_id", new C27785h(0, 1, "sender_id", "INTEGER", null, true));
                map7.put("recipient_id", new C27785h(0, 1, "recipient_id", "INTEGER", null, true));
                map7.put("community", new C27785h(0, 1, "community", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map7.put("sender", new C27785h(0, 1, "sender", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map7.put("community_invite_code", new C27785h(0, 1, "community_invite_code", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k7 = new C27788k("table_team_invites", map7, AbstractC36095b.m114687o(map7, "showBadge", new C27785h(0, 1, "showBadge", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, true), 0), new HashSet(0));
                C27788k c27788kM83879a7 = C27788k.m83879a("table_team_invites", interfaceC33687a);
                if (!c27788k7.equals(c27788kM83879a7)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_team_invites(com.whoop.domain.model.teams.TeamInviteDto).\n Expected:\n", c27788k7, "\n Found:\n", c27788kM83879a7));
                }
                HashMap map8 = new HashMap(10);
                map8.put("packet_time_stamp_utc", new C27785h(0, 1, "packet_time_stamp_utc", "INTEGER", null, true));
                map8.put("packet_time_stamp", new C27785h(0, 1, "packet_time_stamp", "INTEGER", null, true));
                map8.put("strap_id", new C27785h(0, 1, "strap_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map8.put("hw_version", new C27785h(0, 1, "hw_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map8.put("maxim_version", new C27785h(0, 1, "maxim_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map8.put("dsp_version", new C27785h(0, 1, "dsp_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map8.put("nordic_version", new C27785h(0, 1, "nordic_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map8.put("sequence_number", new C27785h(0, 1, "sequence_number", "INTEGER", null, true));
                map8.put("received_packet_raw", new C27785h(0, 1, "received_packet_raw", "BLOB", null, true));
                C27788k c27788k8 = new C27788k("table_console_packets", map8, AbstractC36095b.m114687o(map8, "id", new C27785h(1, 1, "id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a8 = C27788k.m83879a("table_console_packets", interfaceC33687a);
                if (!c27788k8.equals(c27788kM83879a8)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_console_packets(com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsDto).\n Expected:\n", c27788k8, "\n Found:\n", c27788kM83879a8));
                }
                HashMap map9 = new HashMap(11);
                map9.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map9.put("description", new C27785h(0, 1, "description", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map9.put("iconUrl", new C27785h(0, 1, "iconUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map9.put("bannerUrl", new C27785h(0, 1, "bannerUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map9.put("athletePrivacyId", new C27785h(0, 1, "athletePrivacyId", "INTEGER", null, true));
                map9.put("memberCount", new C27785h(0, 1, "memberCount", "INTEGER", null, true));
                map9.put("inviteCode", new C27785h(0, 1, "inviteCode", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map9.put("teamType", new C27785h(0, 1, "teamType", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map9.put(ProfileApiKt.COMMUNITY_ID_PARAM, new C27785h(0, 1, ProfileApiKt.COMMUNITY_ID_PARAM, "INTEGER", null, true));
                map9.put("showBadge", new C27785h(0, 1, "showBadge", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, true));
                C27788k c27788k9 = new C27788k("table_feature_teams", map9, AbstractC36095b.m114687o(map9, "id", new C27785h(1, 1, "id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a9 = C27788k.m83879a("table_feature_teams", interfaceC33687a);
                if (!c27788k9.equals(c27788kM83879a9)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_feature_teams(com.whoop.domain.model.teams.FeatureTeam).\n Expected:\n", c27788k9, "\n Found:\n", c27788kM83879a9));
                }
                HashMap map10 = new HashMap(10);
                map10.put("timestamp", new C27785h(0, 1, "timestamp", "INTEGER", null, true));
                map10.put("hw_version", new C27785h(0, 1, "hw_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("maxim_version", new C27785h(0, 1, "maxim_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("dsp_version", new C27785h(0, 1, "dsp_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("strap_id", new C27785h(0, 1, "strap_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("binary_version", new C27785h(0, 1, "binary_version", "INTEGER", null, true));
                map10.put("binary_flags", new C27785h(0, 1, "binary_flags", "INTEGER", null, true));
                map10.put("raw_data_version", new C27785h(0, 1, "raw_data_version", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map10.put("payload", new C27785h(0, 1, "payload", "BLOB", null, true));
                HashSet hashSetM114687o = AbstractC36095b.m114687o(map10, "id", new C27785h(1, 1, "id", "INTEGER", null, true), 0);
                HashSet hashSet = new HashSet(1);
                hashSet.add(new C27787j("index_table_raw_data_timestamp_raw_data_version", Arrays.asList("timestamp", "raw_data_version"), Arrays.asList("ASC", "ASC"), true));
                C27788k c27788k10 = new C27788k("table_raw_data", map10, hashSetM114687o, hashSet);
                C27788k c27788kM83879a10 = C27788k.m83879a("table_raw_data", interfaceC33687a);
                if (!c27788k10.equals(c27788kM83879a10)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_raw_data(com.whoop.connectivityDataPacketsModels.firmware.rawdata.dto.RawDataDto).\n Expected:\n", c27788k10, "\n Found:\n", c27788kM83879a10));
                }
                HashMap map11 = new HashMap(27);
                map11.put("memberStoryId", new C27785h(0, 1, "memberStoryId", "INTEGER", null, true));
                map11.put("created_at", new C27785h(0, 1, "created_at", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("updated_at", new C27785h(0, 1, "updated_at", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("title", new C27785h(0, 1, "title", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("publish_date", new C27785h(0, 1, "publish_date", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put(QueryParams.URL, new C27785h(0, 1, QueryParams.URL, ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("image", new C27785h(0, 1, "image", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("content_type", new C27785h(0, 1, "content_type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("showBadge", new C27785h(0, 1, "showBadge", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, true));
                map11.put("description", new C27785h(0, 1, "description", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("deleted", new C27785h(0, 1, "deleted", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                map11.put("featured", new C27785h(0, 1, "featured", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                map11.put("live", new C27785h(0, 1, "live", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                map11.put("archived", new C27785h(0, 1, "archived", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
                map11.put("live_time", new C27785h(0, 1, "live_time", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("host_id", new C27785h(0, 1, "host_id", "INTEGER", null, true));
                map11.put("url_text", new C27785h(0, 1, "url_text", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map11.put("cta_text", new C27785h(0, 1, "cta_text", ShippingAddressField.TEXT_FIELD_TYPE, "'Join the discussion'", true));
                map11.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map11.put("user_id", new C27785h(0, 1, "user_id", "INTEGER", null, false));
                map11.put("first_name", new C27785h(0, 1, "first_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map11.put("last_name", new C27785h(0, 1, "last_name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map11.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map11.put("username", new C27785h(0, 1, "username", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map11.put("avatar_url", new C27785h(0, 1, "avatar_url", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map11.put("host_created_at", new C27785h(0, 1, "host_created_at", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k11 = new C27788k("table_member_stories", map11, AbstractC36095b.m114687o(map11, "host_updated_at", new C27785h(0, 1, "host_updated_at", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                C27788k c27788kM83879a11 = C27788k.m83879a("table_member_stories", interfaceC33687a);
                if (!c27788k11.equals(c27788kM83879a11)) {
                    return new C1784f1(false, AbstractC17176i.m48505g("table_member_stories(com.whoop.domain.model.teams.MemberStory).\n Expected:\n", c27788k11, "\n Found:\n", c27788kM83879a11));
                }
                HashMap map12 = new HashMap(15);
                map12.put("event_type", new C27785h(0, 1, "event_type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map12.put("alarm_trigger", new C27785h(0, 1, "alarm_trigger", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map12.put("timestamp_millis", new C27785h(0, 1, "timestamp_millis", "INTEGER", null, true));
                map12.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
                map12.put("isAckSuccess", new C27785h(0, 1, "isAckSuccess", "INTEGER", null, false));
                map12.put("devicePlatform", new C27785h(0, 1, "devicePlatform", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map12.put("deviceOs", new C27785h(0, 1, "deviceOs", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map12.put("deviceModel", new C27785h(0, 1, "deviceModel", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map12.put("strapId", new C27785h(0, 1, "strapId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map12.put("maximVersion", new C27785h(0, 1, "maximVersion", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map12.put("nordicVersion", new C27785h(0, 1, "nordicVersion", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map12.put("batteryOptimizationOn", new C27785h(0, 1, "batteryOptimizationOn", "INTEGER", null, true));
                map12.put("phoneSetAlarmTime", new C27785h(0, 1, "phoneSetAlarmTime", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map12.put("strapReportedAlarmTime", new C27785h(0, 1, "strapReportedAlarmTime", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k12 = new C27788k("table_smart_alarm_diagnostics", map12, AbstractC36095b.m114687o(map12, "isStrapConnected", new C27785h(0, 1, "isStrapConnected", "INTEGER", null, false), 0), new HashSet(0));
                C27788k c27788kM83879a12 = C27788k.m83879a("table_smart_alarm_diagnostics", interfaceC33687a);
                return !c27788k12.equals(c27788kM83879a12) ? new C1784f1(false, AbstractC17176i.m48505g("table_smart_alarm_diagnostics(com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto).\n Expected:\n", c27788k12, "\n Found:\n", c27788kM83879a12)) : new C1784f1(true, null);
            }
        };
    }
}
