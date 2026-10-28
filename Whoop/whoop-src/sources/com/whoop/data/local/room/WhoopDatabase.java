package com.whoop.data.local.room;

import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.persistent.RawDataDao;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao;
import com.whoop.data.local.room.dao.wipeable.GpsDao;
import com.whoop.data.local.room.dao.wipeable.JournalDao;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao;
import com.whoop.data.local.room.dao.wipeable.TeamsDao;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import tr2.InterfaceC34108f;
import yt0.InterfaceC39762a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lcom/whoop/data/local/room/WhoopDatabase;", "Landroidx/room/z0;", "<init>", "()V", "Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;", "teamsDao", "()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;", "Lcom/whoop/data/local/room/dao/wipeable/JournalDao;", "journalDao", "()Lcom/whoop/data/local/room/dao/wipeable/JournalDao;", "Ltr2/f;", "logEventsDao", "()Ltr2/f;", "Lcom/whoop/data/local/room/dao/wipeable/GpsDao;", "gpsDao", "()Lcom/whoop/data/local/room/dao/wipeable/GpsDao;", "Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;", "teamsInviteDao", "()Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;", "Lyt0/a;", "consolePacketsDao", "()Lyt0/a;", "Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;", "featureTeamDao", "()Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;", "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;", "rawDataDao", "()Lcom/whoop/data/local/room/dao/persistent/RawDataDao;", "Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;", "memberStoryDao", "()Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;", "Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;", "smartAlarmDiagnosticDao", "()Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public abstract class WhoopDatabase extends AbstractC1848z0 {
    public static final int $stable = 8;

    public abstract InterfaceC39762a consolePacketsDao();

    public abstract FeatureTeamDao featureTeamDao();

    public abstract GpsDao gpsDao();

    public abstract JournalDao journalDao();

    public abstract InterfaceC34108f logEventsDao();

    public abstract MemberStoryDao memberStoryDao();

    public abstract RawDataDao rawDataDao();

    public abstract SmartAlarmDiagnosticDao smartAlarmDiagnosticDao();

    public abstract TeamsDao teamsDao();

    public abstract TeamInviteDao teamsInviteDao();
}
