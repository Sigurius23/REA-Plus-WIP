package gl1;

import androidx.core.app.NotificationCompat;
import b11.AbstractC2282i;
import c41.EnumC4022f2;
import ca2.EnumC4363c;
import fm1.EnumC14603g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s01.EnumC32045a;
import sl1.AbstractC32703b;
import sl1.C32702a;
import td1.EnumC33708f;

/* JADX INFO: renamed from: gl1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\r¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lb11/i;", NotificationCompat.CATEGORY_STATUS, "", "e", "(Lb11/i;)Ljava/lang/String;", "Lsl1/a;", "indicatorResult", "d", "(Lsl1/a;)Ljava/lang/String;", "Lsl1/b;", "tileType", "f", "(Lsl1/b;)Ljava/lang/String;", "Lfm1/g;", "g", "(Lfm1/g;)Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15968c {

    /* JADX INFO: renamed from: gl1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60455a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f60456b;

        static {
            int[] iArr = new int[EnumC4022f2.values().length];
            try {
                iArr[EnumC4022f2.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4022f2.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4022f2.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60455a = iArr;
            int[] iArr2 = new int[EnumC14603g.values().length];
            try {
                iArr2[EnumC14603g.OVERVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC14603g.STRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC14603g.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC14603g.SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f60456b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final String m45101d(C32702a c32702a) {
        if (c32702a.getIsBluetoothOff()) {
            return "Bluetooth is off";
        }
        if (c32702a.getStrapStatus() == EnumC33708f.PAIR_DEVICE) {
            return "Pair a Whoop device";
        }
        if (c32702a.getStrapStatus() == EnumC33708f.CONNECTING) {
            return "Connecting";
        }
        if (c32702a.getStrapStatus() == EnumC33708f.CONNECTED) {
            return "Connected";
        }
        if (c32702a.getStrapStatus() == EnumC33708f.CONNECTION_FAILED) {
            return "Connection failed";
        }
        if (c32702a.getNetworkDisconnected()) {
            return "No network connection";
        }
        if (c32702a.getDataCatchingUpDomainResult().getState() == EnumC4363c.CATCHING_UP) {
            return "Data catching up";
        }
        if (c32702a.getDataCatchingUpDomainResult().getState() == EnumC4363c.CAUGHT_UP) {
            return "Data caught up";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m45102e(AbstractC2282i abstractC2282i) {
        if ((abstractC2282i instanceof AbstractC2282i.a) || AbstractC22676k.m65745e(abstractC2282i, AbstractC2282i.b.f9057f)) {
            return "Charging";
        }
        if ((abstractC2282i instanceof AbstractC2282i.c) || AbstractC22676k.m65745e(abstractC2282i, AbstractC2282i.d.f9059f)) {
            return "Connected";
        }
        if (AbstractC22676k.m65745e(abstractC2282i, AbstractC2282i.e.f9060f)) {
            return "Disconnected";
        }
        if ((abstractC2282i instanceof AbstractC2282i.f) || AbstractC22676k.m65745e(abstractC2282i, AbstractC2282i.g.f9062f)) {
            return "Low Battery";
        }
        if (AbstractC22676k.m65745e(abstractC2282i, AbstractC2282i.h.f9063f)) {
            return "Off body";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final String m45103f(AbstractC32703b abstractC32703b) {
        if (abstractC32703b instanceof AbstractC32703b.a) {
            return "bluetoothOff";
        }
        if (abstractC32703b instanceof AbstractC32703b.p) {
            return "noService";
        }
        if (abstractC32703b instanceof AbstractC32703b.d) {
            return "dataCatchingUp";
        }
        if (abstractC32703b instanceof AbstractC32703b.e) {
            return "dataCaughtUp";
        }
        if (abstractC32703b instanceof AbstractC32703b.q) {
            return "pairADevice";
        }
        if (abstractC32703b instanceof AbstractC32703b.g) {
            return "connected";
        }
        if (abstractC32703b instanceof AbstractC32703b.b) {
            return "connecting";
        }
        if (abstractC32703b instanceof AbstractC32703b.c) {
            return "failedToConnect";
        }
        if (abstractC32703b instanceof AbstractC32703b.r) {
            return "wearYourWhoop";
        }
        if (abstractC32703b instanceof AbstractC32703b.k) {
            return "firmwareUpdateAvailable";
        }
        if (abstractC32703b instanceof AbstractC32703b.m) {
            return "firmwareInstalling";
        }
        if (abstractC32703b instanceof AbstractC32703b.l) {
            return "firmwareUpdateComplete";
        }
        if (abstractC32703b instanceof AbstractC32703b.i) {
            return "firmwareUpdateFailed";
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final String m45104g(EnumC14603g enumC14603g) {
        AbstractC22676k.m65750j(enumC14603g, "<this>");
        int i13 = a.f60456b[enumC14603g.ordinal()];
        if (i13 == 1) {
            return "Overview Pillar";
        }
        if (i13 == 2) {
            return "Strain Pillar";
        }
        if (i13 == 3) {
            return "Recovery Pillar";
        }
        if (i13 == 4) {
            return "Sleep Pillar";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public static final String m45105h(EnumC14603g enumC14603g) {
        AbstractC22676k.m65750j(enumC14603g, "<this>");
        int i13 = a.f60456b[enumC14603g.ordinal()];
        if (i13 == 1) {
            return EnumC32045a.OVERVIEW.toString();
        }
        if (i13 == 2) {
            return EnumC32045a.STRAIN_ACTIVITY.toString();
        }
        if (i13 == 3) {
            return EnumC32045a.RECOVERY_ACTIVITY.toString();
        }
        if (i13 == 4) {
            return EnumC32045a.SLEEP_ACTIVITY.toString();
        }
        throw new NoWhenBranchMatchedException();
    }
}
