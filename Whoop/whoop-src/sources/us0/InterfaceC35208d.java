package us0;

import androidx.core.app.NotificationCompat;
import ge3.AbstractC15751g;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import t83.InterfaceC33616a;
import y82.EnumC39339b;

/* JADX INFO: renamed from: us0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0003\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lus0/d;", "", "Lst0/v;", "c", "()Lst0/v;", "deviceType", "a", "d", "b", "e", "Lus0/d$a;", "Lus0/d$d;", "Lus0/d$e;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC35208d {

    /* JADX INFO: renamed from: us0.d$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lus0/d$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FAIL", "SUCCESS", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        FAIL("Fail"),
        SUCCESS(EnumC39339b.RESULT_SUCCESS);

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String value;

        b(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: us0.d$c */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lus0/d$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "SLIDE_IN", "STRAP_CONNECTION", "DISCONNECT_RETRY", "PERIODIC_SCAN", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum c {
        SLIDE_IN("slide_in"),
        STRAP_CONNECTION("strap_connection"),
        DISCONNECT_RETRY("disconnect_retry"),
        PERIODIC_SCAN("periodic_scan");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: us0.d$c$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lus0/d$c$a;", "", "<init>", "()V", "", "value", "Lus0/d$c;", "a", "(Ljava/lang/String;)Lus0/d$c;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:11:0x0021  */
            /* JADX INFO: renamed from: a */
            public final c m111549a(String value) {
                AbstractC22676k.m65750j(value, "value");
                for (c cVar : c.values()) {
                    if (AbstractC22676k.m65745e(cVar.getValue(), value)) {
                        if (cVar != null) {
                            return cVar;
                        }
                        throw new IllegalArgumentException("Unknown ConnectionAttemptSource value: ".concat(value));
                    }
                }
                cVar = null;
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalArgumentException("Unknown ConnectionAttemptSource value: ".concat(value));
            }

            private Companion() {
            }
        }

        c(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: us0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lus0/d$e;", "Lus0/d;", "Lst0/v;", "deviceType", "<init>", "(Lst0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst0/v;", "c", "()Lst0/v;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC35208d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC32978v deviceType;

        public e(EnumC32978v deviceType) {
            AbstractC22676k.m65750j(deviceType, "deviceType");
            this.deviceType = deviceType;
        }

        @Override // us0.InterfaceC35208d
        /* JADX INFO: renamed from: c, reason: from getter */
        public EnumC32978v getDeviceType() {
            return this.deviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.deviceType == ((e) other).deviceType;
        }

        public int hashCode() {
            return this.deviceType.hashCode();
        }

        public String toString() {
            return "Disconnected(deviceType=" + this.deviceType + ")";
        }
    }

    /* JADX INFO: renamed from: c */
    EnumC32978v getDeviceType();

    /* JADX INFO: renamed from: us0.d$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lus0/d$a;", "Lus0/d;", "Lst0/v;", "deviceType", "Lus0/d$c;", "source", "<init>", "(Lst0/v;Lus0/d$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst0/v;", "c", "()Lst0/v;", "b", "Lus0/d$c;", "()Lus0/d$c;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC35208d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC32978v deviceType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final c source;

        public a(EnumC32978v deviceType, c cVar) {
            AbstractC22676k.m65750j(deviceType, "deviceType");
            this.deviceType = deviceType;
            this.source = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getSource() {
            return this.source;
        }

        @Override // us0.InterfaceC35208d
        /* JADX INFO: renamed from: c, reason: from getter */
        public EnumC32978v getDeviceType() {
            return this.deviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.deviceType == aVar.deviceType && this.source == aVar.source;
        }

        public int hashCode() {
            int iHashCode = this.deviceType.hashCode() * 31;
            c cVar = this.source;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "ConnectionAttempt(deviceType=" + this.deviceType + ", source=" + this.source + ")";
        }

        public /* synthetic */ a(EnumC32978v enumC32978v, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC32978v, (i13 & 2) != 0 ? null : cVar);
        }
    }

    /* JADX INFO: renamed from: us0.d$d */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lus0/d$d;", "Lus0/d;", "Lst0/v;", "deviceType", "Lus0/d$b;", NotificationCompat.CATEGORY_STATUS, "", "error", "<init>", "(Lst0/v;Lus0/d$b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst0/v;", "c", "()Lst0/v;", "b", "Lus0/d$b;", "()Lus0/d$b;", "Ljava/lang/String;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC35208d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC32978v deviceType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final b status;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String error;

        public d(EnumC32978v deviceType, b status, String str) {
            AbstractC22676k.m65750j(deviceType, "deviceType");
            AbstractC22676k.m65750j(status, "status");
            this.deviceType = deviceType;
            this.status = status;
            this.error = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getStatus() {
            return this.status;
        }

        @Override // us0.InterfaceC35208d
        /* JADX INFO: renamed from: c, reason: from getter */
        public EnumC32978v getDeviceType() {
            return this.deviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.deviceType == dVar.deviceType && this.status == dVar.status && AbstractC22676k.m65745e(this.error, dVar.error);
        }

        public int hashCode() {
            int iHashCode = (this.status.hashCode() + (this.deviceType.hashCode() * 31)) * 31;
            String str = this.error;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            EnumC32978v enumC32978v = this.deviceType;
            b bVar = this.status;
            String str = this.error;
            StringBuilder sb4 = new StringBuilder("ConnectionStatus(deviceType=");
            sb4.append(enumC32978v);
            sb4.append(", status=");
            sb4.append(bVar);
            sb4.append(", error=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ d(EnumC32978v enumC32978v, b bVar, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC32978v, bVar, (i13 & 4) != 0 ? null : str);
        }
    }
}
