package ug1;

import com.mapbox.maps.MapboxMap;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import gt0.AbstractC16184f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ug1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\b\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m65681d2 = {"Lug1/j;", "", "", "state", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "g", "e", "b", "i", "c", "d", "Lug1/j$a;", "Lug1/j$b;", "Lug1/j$c;", "Lug1/j$d;", "Lug1/j$e;", "Lug1/j$f;", "Lug1/j$g;", "Lug1/j$h;", "Lug1/j$i;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34946j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String state;

    /* JADX INFO: renamed from: ug1.j$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lug1/j$a;", "Lug1/j;", "<init>", "()V", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC34946j {

        /* JADX INFO: renamed from: b */
        public static final a f147855b = new a();

        private a() {
            super("DeviceNotConnected", null);
        }
    }

    /* JADX INFO: renamed from: ug1.j$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lug1/j$b;", "Lug1/j;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "firmwareVersion", "Lgt0/f;", "cause", "<init>", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "c", "Ljava/lang/String;", "d", "Lgt0/f;", "a", "()Lgt0/f;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC34946j {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final WhoopFwDevice device;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String firmwareVersion;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AbstractC16184f cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WhoopFwDevice device, String firmwareVersion, AbstractC16184f cause) {
            super("Error", null);
            AbstractC22676k.m65750j(device, "device");
            AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
            AbstractC22676k.m65750j(cause, "cause");
            this.device = device;
            this.firmwareVersion = firmwareVersion;
            this.cause = cause;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC16184f getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final WhoopFwDevice getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.device, bVar.device) && AbstractC22676k.m65745e(this.firmwareVersion, bVar.firmwareVersion) && AbstractC22676k.m65745e(this.cause, bVar.cause);
        }

        public int hashCode() {
            return this.cause.hashCode() + AbstractC11266d.m30450d(this.device.hashCode() * 31, 31, this.firmwareVersion);
        }

        @Override // ug1.AbstractC34946j
        /* JADX INFO: renamed from: toString */
        public String getState() {
            return "Error(device=" + this.device + ", firmwareVersion=" + this.firmwareVersion + ", cause=" + this.cause + ")";
        }
    }

    /* JADX INFO: renamed from: ug1.j$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lug1/j$c;", "Lug1/j;", "<init>", "()V", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC34946j {

        /* JADX INFO: renamed from: b */
        public static final c f147859b = new c();

        private c() {
            super("FW is already up to date", null);
        }
    }

    /* JADX INFO: renamed from: ug1.j$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lug1/j$d;", "Lug1/j;", "<init>", "()V", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC34946j {

        /* JADX INFO: renamed from: b */
        public static final d f147860b = new d();

        private d() {
            super("Location permission not granted", null);
        }
    }

    /* JADX INFO: renamed from: ug1.j$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lug1/j$e;", "Lug1/j;", "<init>", "()V", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC34946j {

        /* JADX INFO: renamed from: b */
        public static final e f147861b = new e();

        private e() {
            super("Process", null);
        }
    }

    /* JADX INFO: renamed from: ug1.j$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lug1/j$f;", "Lug1/j;", "", MapboxMap.QFE_OFFSET, "imageLength", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "a", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC34946j {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int offset;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int imageLength;

        public f(int i13, int i14) {
            super("Send", null);
            this.offset = i13;
            this.imageLength = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getImageLength() {
            return this.imageLength;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.offset == fVar.offset && this.imageLength == fVar.imageLength;
        }

        public int hashCode() {
            return Integer.hashCode(this.imageLength) + (Integer.hashCode(this.offset) * 31);
        }

        @Override // ug1.AbstractC34946j
        /* JADX INFO: renamed from: toString */
        public String getState() {
            return AbstractC25012a.m73372e(this.offset, this.imageLength, "Send(offset=", ", imageLength=", ")");
        }
    }

    /* JADX INFO: renamed from: ug1.j$g */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lug1/j$g;", "Lug1/j;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "firmwareVersion", "<init>", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "a", "()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "c", "Ljava/lang/String;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC34946j {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final WhoopFwDevice device;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String firmwareVersion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(WhoopFwDevice device, String firmwareVersion) {
            super("SendComplete", null);
            AbstractC22676k.m65750j(device, "device");
            AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
            this.device = device;
            this.firmwareVersion = firmwareVersion;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WhoopFwDevice getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.device, gVar.device) && AbstractC22676k.m65745e(this.firmwareVersion, gVar.firmwareVersion);
        }

        public int hashCode() {
            return this.firmwareVersion.hashCode() + (this.device.hashCode() * 31);
        }

        @Override // ug1.AbstractC34946j
        /* JADX INFO: renamed from: toString */
        public String getState() {
            return "SendComplete(device=" + this.device + ", firmwareVersion=" + this.firmwareVersion + ")";
        }
    }

    /* JADX INFO: renamed from: ug1.j$h */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lug1/j$h;", "Lug1/j;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "firmwareVersion", "<init>", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "a", "()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "c", "Ljava/lang/String;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC34946j {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final WhoopFwDevice device;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String firmwareVersion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(WhoopFwDevice device, String firmwareVersion) {
            super("Started", null);
            AbstractC22676k.m65750j(device, "device");
            AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
            this.device = device;
            this.firmwareVersion = firmwareVersion;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WhoopFwDevice getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.device, hVar.device) && AbstractC22676k.m65745e(this.firmwareVersion, hVar.firmwareVersion);
        }

        public int hashCode() {
            return this.firmwareVersion.hashCode() + (this.device.hashCode() * 31);
        }

        @Override // ug1.AbstractC34946j
        /* JADX INFO: renamed from: toString */
        public String getState() {
            return "Started(device=" + this.device + ", firmwareVersion=" + this.firmwareVersion + ")";
        }
    }

    /* JADX INFO: renamed from: ug1.j$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lug1/j$i;", "Lug1/j;", "<init>", "()V", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC34946j {

        /* JADX INFO: renamed from: b */
        public static final i f147868b = new i();

        private i() {
            super("TaskInterrupted", null);
        }
    }

    public /* synthetic */ AbstractC34946j(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getState() {
        return this.state;
    }

    private AbstractC34946j(String str) {
        this.state = str;
    }
}
