package ug1;

import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import l83.C23464j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ug1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lug1/f;", "", "Lug1/b;", "defaultUpdateStrategy", "Lug1/k;", "unifiedUpdateStrategy", "Lug1/a;", "batteryPackUpdateStrategy", "<init>", "(Lug1/b;Lug1/k;Lug1/a;)V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "Lug1/e;", "a", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lug1/e;", "Lug1/b;", "b", "Lug1/k;", "c", "Lug1/a;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34942f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34938b defaultUpdateStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34947k unifiedUpdateStrategy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34937a batteryPackUpdateStrategy;

    /* JADX INFO: renamed from: ug1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f147830a;

        static {
            int[] iArr = new int[WhoopDeviceName.values().length];
            try {
                iArr[WhoopDeviceName.GOOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WhoopDeviceName.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WhoopDeviceName.MONUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WhoopDeviceName.SYMPHONY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WhoopDeviceName.HARVARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WhoopDeviceName.PUFFIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f147830a = iArr;
        }
    }

    public C34942f(C34938b defaultUpdateStrategy, C34947k unifiedUpdateStrategy, C34937a batteryPackUpdateStrategy) {
        AbstractC22676k.m65750j(defaultUpdateStrategy, "defaultUpdateStrategy");
        AbstractC22676k.m65750j(unifiedUpdateStrategy, "unifiedUpdateStrategy");
        AbstractC22676k.m65750j(batteryPackUpdateStrategy, "batteryPackUpdateStrategy");
        this.defaultUpdateStrategy = defaultUpdateStrategy;
        this.unifiedUpdateStrategy = unifiedUpdateStrategy;
        this.batteryPackUpdateStrategy = batteryPackUpdateStrategy;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC34941e m110372a(WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        switch (a.f147830a[device.getDeviceName().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.defaultUpdateStrategy;
            case 5:
                return this.unifiedUpdateStrategy;
            case 6:
                return this.batteryPackUpdateStrategy;
            default:
                throw new C23464j("An operation is not implemented: Other strategies");
        }
    }
}
