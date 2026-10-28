package yu0;

import ge3.AbstractC15751g;
import jt0.EnumC21935b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: yu0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lyu0/e;", "", "<init>", "(Ljava/lang/String;I)V", "", "Ljt0/b;", "gen5PacketTypes", "()[Ljt0/b;", "REALTIME_HEART_RATE", "REALTIME_ECG", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC39788e {
    REALTIME_HEART_RATE { // from class: yu0.e.b
        @Override // yu0.EnumC39788e
        public EnumC21935b[] gen5PacketTypes() {
            return new EnumC21935b[]{EnumC21935b.REALTIME_HR, EnumC21935b.REALTIME_IMU};
        }
    },
    REALTIME_ECG { // from class: yu0.e.a
        @Override // yu0.EnumC39788e
        public EnumC21935b[] gen5PacketTypes() {
            return new EnumC21935b[]{EnumC21935b.REALTIME_FILTERED_ECG};
        }
    };

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* synthetic */ EnumC39788e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public abstract EnumC21935b[] gen5PacketTypes();
}
