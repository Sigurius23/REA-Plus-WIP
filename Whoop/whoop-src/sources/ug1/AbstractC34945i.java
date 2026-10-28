package ug1;

import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ug1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, m65681d2 = {"Lug1/i;", "", "<init>", "()V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "a", "()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "Lug1/i$a;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34945i {

    /* JADX INFO: renamed from: ug1.i$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lug1/i$a;", "Lug1/i;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "userAcceptanceRequired", "<init>", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "b", "Z", "()Z", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC34945i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WhoopFwDevice device;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean userAcceptanceRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WhoopFwDevice device, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(device, "device");
            this.device = device;
            this.userAcceptanceRequired = z4;
        }

        @Override // ug1.AbstractC34945i
        /* JADX INFO: renamed from: a, reason: from getter */
        public WhoopFwDevice getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getUserAcceptanceRequired() {
            return this.userAcceptanceRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.device, aVar.device) && this.userAcceptanceRequired == aVar.userAcceptanceRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.userAcceptanceRequired) + (this.device.hashCode() * 31);
        }

        public String toString() {
            return "Start(device=" + this.device + ", userAcceptanceRequired=" + this.userAcceptanceRequired + ")";
        }
    }

    public /* synthetic */ AbstractC34945i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract WhoopFwDevice getDevice();

    private AbstractC34945i() {
    }
}
