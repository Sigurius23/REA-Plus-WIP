package io.sentry;

import androidx.core.app.NotificationCompat;
import io.sentry.clientreport.C20294b;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20484j;
import java.io.IOException;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.m5 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20424m5 implements InterfaceC20348h2 {
    Session("session"),
    Event(NotificationCompat.CATEGORY_EVENT),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    EnumC20424m5(String str) {
        this.itemType = str;
    }

    public static EnumC20424m5 resolve(Object obj) {
        if (obj instanceof C20321e5) {
            return ((C20484j) ((C20321e5) obj).f76884x.m56653w(C20484j.class, "feedback")) == null ? Event : Feedback;
        }
        if (obj instanceof C20473d0) {
            return Transaction;
        }
        if (obj instanceof C20265b7) {
            return Session;
        }
        return obj instanceof C20294b ? ClientReport : Attachment;
    }

    public static EnumC20424m5 valueOfLabel(String str) {
        for (EnumC20424m5 enumC20424m5 : values()) {
            if (enumC20424m5.itemType.equals(str)) {
                return enumC20424m5;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119222b0(this.itemType);
    }
}
