package ey1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ey1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m65681d2 = {"Ley1/f;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ALARM_ALREADY_DISABLED_AND_SYNC", "ALARM_SUCCESSFULLY_DISABLED", "LWT_ALREADY_SET_ON_STRAP", "INSIDE_WAKE_WINDOW", "SUCCESSFULLY_UPDATED_STRAP", "STRAP_NOT_READY", "ALARM_DISABLED", "SLEEP_SCHEDULE_OUT_OF_SYNC", "UPDATED_BE_ON_GEN3_DOWNGRADE", "SUCCESSFULLY_TRIGGERED_ALARM", "ALARM_UPDATED_FROM_STALE_CACHE", "EMPTY_READ_FROM_CACHE", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC13749f {
    ALARM_ALREADY_DISABLED_AND_SYNC("strap_and_alarm_perference_disabled_exiting_early"),
    ALARM_SUCCESSFULLY_DISABLED("alarm_preferences_on_strap_updated_to_disabled"),
    LWT_ALREADY_SET_ON_STRAP("latest_waketime_calculated_is_same_as_strap_exiting_early"),
    INSIDE_WAKE_WINDOW("inside_wake_window_will_not_reset_strap"),
    SUCCESSFULLY_UPDATED_STRAP("successfully_updated_strap"),
    STRAP_NOT_READY("strap_not_ready"),
    ALARM_DISABLED("alarm_disabled"),
    SLEEP_SCHEDULE_OUT_OF_SYNC("we_are_on_schedule_and_out_of_sync"),
    UPDATED_BE_ON_GEN3_DOWNGRADE("updated_backend_for_Gen3_downgrade"),
    SUCCESSFULLY_TRIGGERED_ALARM("successfully_triggered_alarm"),
    ALARM_UPDATED_FROM_STALE_CACHE("alarm_preferences_updated_from_stale_cache"),
    EMPTY_READ_FROM_CACHE("failed_read_smart_alarm_prefs_from_Userdefaults");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String value;

    EnumC13749f(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
