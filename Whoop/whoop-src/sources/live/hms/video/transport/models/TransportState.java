package live.hms.video.transport.models;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/transport/models/TransportState;", "", "<init>", "(Ljava/lang/String;I)V", "Disconnected", "Connecting", "SignalConnected", "Joined", EnumC39339b.RESULT_FAILURE, "Reconnecting", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum TransportState {
    Disconnected,
    Connecting,
    SignalConnected,
    Joined,
    Failed,
    Reconnecting;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
