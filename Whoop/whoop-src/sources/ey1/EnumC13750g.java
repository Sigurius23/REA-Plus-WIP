package ey1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ey1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Ley1/g;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ENABLE_ALARM", "DISABLE_ALARM", "RESET_LWT", "TRIGGER_ALARM_PUSH", "TRIGGER_ALARM_POLL", "ALARM_CACHE_PURGE", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC13750g {
    ENABLE_ALARM("whoop.smart_alarm.enable_alarm"),
    DISABLE_ALARM("whoop.smart_alarm.disable_alarm"),
    RESET_LWT("whoop.smart_alarm.reset_lwt_method"),
    TRIGGER_ALARM_PUSH("whoop.smart_alarm.trigger_push"),
    TRIGGER_ALARM_POLL("whoop.smart_alarm.trigger_poll"),
    ALARM_CACHE_PURGE("whoop.smart_alarm.purge_cache");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String value;

    EnumC13750g(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
