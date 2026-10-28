package sc2;

import com.whoop.p069ui.views.C10627a;
import hi0.AbstractC17311i;
import hi0.AbstractC17313k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;
import yg2.C39531f;

/* JADX INFO: renamed from: sc2.v */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u008a\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b'\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b,\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b-\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b\"\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b*\u00101R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%¨\u00064"}, m65681d2 = {"Lsc2/v;", "", "", "bluetoothVisibility", "strapSettingsView", "", "strapDisconnected", "hrBroadcastEnabled", "switchTextAppearance", "showEditStrapNameIcon", "", "connectedDeviceName", "strapAnimation", "firmwareUpdateAvailable", "Lcom/whoop/ui/views/a;", "batteryIndicatorViewState", "Lsc2/e;", "lastSyncViewState", "shouldShowBatteryPackAnimation", "<init>", "(IIZZIZLjava/lang/String;IZLcom/whoop/ui/views/a;Lsc2/e;Z)V", "a", "(IIZZIZLjava/lang/String;IZLcom/whoop/ui/views/a;Lsc2/e;Z)Lsc2/v;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "j", "c", "Z", "i", "()Z", "f", "e", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Ljava/lang/String;", "getStrapAnimation", "getFirmwareUpdateAvailable", "Lcom/whoop/ui/views/a;", "()Lcom/whoop/ui/views/a;", "Lsc2/e;", "()Lsc2/e;", "l", "getShouldShowBatteryPackAnimation", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32383v {

    /* JADX INFO: renamed from: m */
    public static final int f134088m = C39531f.f170077e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int bluetoothVisibility;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int strapSettingsView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean strapDisconnected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean hrBroadcastEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int switchTextAppearance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showEditStrapNameIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String connectedDeviceName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int strapAnimation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean firmwareUpdateAvailable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C10627a batteryIndicatorViewState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C32366e lastSyncViewState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean shouldShowBatteryPackAnimation;

    public C32383v(int i13, int i14, boolean z4, boolean z13, int i15, boolean z14, String str, int i16, boolean z15, C10627a batteryIndicatorViewState, C32366e lastSyncViewState, boolean z16) {
        AbstractC22676k.m65750j(batteryIndicatorViewState, "batteryIndicatorViewState");
        AbstractC22676k.m65750j(lastSyncViewState, "lastSyncViewState");
        this.bluetoothVisibility = i13;
        this.strapSettingsView = i14;
        this.strapDisconnected = z4;
        this.hrBroadcastEnabled = z13;
        this.switchTextAppearance = i15;
        this.showEditStrapNameIcon = z14;
        this.connectedDeviceName = str;
        this.strapAnimation = i16;
        this.firmwareUpdateAvailable = z15;
        this.batteryIndicatorViewState = batteryIndicatorViewState;
        this.lastSyncViewState = lastSyncViewState;
        this.shouldShowBatteryPackAnimation = z16;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32383v m100919b(C32383v c32383v, int i13, int i14, boolean z4, boolean z13, int i15, boolean z14, String str, int i16, boolean z15, C10627a c10627a, C32366e c32366e, boolean z16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = c32383v.bluetoothVisibility;
        }
        if ((i17 & 2) != 0) {
            i14 = c32383v.strapSettingsView;
        }
        if ((i17 & 4) != 0) {
            z4 = c32383v.strapDisconnected;
        }
        if ((i17 & 8) != 0) {
            z13 = c32383v.hrBroadcastEnabled;
        }
        if ((i17 & 16) != 0) {
            i15 = c32383v.switchTextAppearance;
        }
        if ((i17 & 32) != 0) {
            z14 = c32383v.showEditStrapNameIcon;
        }
        if ((i17 & 64) != 0) {
            str = c32383v.connectedDeviceName;
        }
        if ((i17 & 128) != 0) {
            i16 = c32383v.strapAnimation;
        }
        if ((i17 & 256) != 0) {
            z15 = c32383v.firmwareUpdateAvailable;
        }
        if ((i17 & 512) != 0) {
            c10627a = c32383v.batteryIndicatorViewState;
        }
        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c32366e = c32383v.lastSyncViewState;
        }
        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            z16 = c32383v.shouldShowBatteryPackAnimation;
        }
        C32366e c32366e2 = c32366e;
        boolean z17 = z16;
        boolean z18 = z15;
        C10627a c10627a2 = c10627a;
        String str2 = str;
        int i18 = i16;
        int i19 = i15;
        boolean z19 = z14;
        return c32383v.m100920a(i13, i14, z4, z13, i19, z19, str2, i18, z18, c10627a2, c32366e2, z17);
    }

    /* JADX INFO: renamed from: a */
    public final C32383v m100920a(int bluetoothVisibility, int strapSettingsView, boolean strapDisconnected, boolean hrBroadcastEnabled, int switchTextAppearance, boolean showEditStrapNameIcon, String connectedDeviceName, int strapAnimation, boolean firmwareUpdateAvailable, C10627a batteryIndicatorViewState, C32366e lastSyncViewState, boolean shouldShowBatteryPackAnimation) {
        AbstractC22676k.m65750j(batteryIndicatorViewState, "batteryIndicatorViewState");
        AbstractC22676k.m65750j(lastSyncViewState, "lastSyncViewState");
        return new C32383v(bluetoothVisibility, strapSettingsView, strapDisconnected, hrBroadcastEnabled, switchTextAppearance, showEditStrapNameIcon, connectedDeviceName, strapAnimation, firmwareUpdateAvailable, batteryIndicatorViewState, lastSyncViewState, shouldShowBatteryPackAnimation);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C10627a getBatteryIndicatorViewState() {
        return this.batteryIndicatorViewState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBluetoothVisibility() {
        return this.bluetoothVisibility;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getConnectedDeviceName() {
        return this.connectedDeviceName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32383v)) {
            return false;
        }
        C32383v c32383v = (C32383v) other;
        return this.bluetoothVisibility == c32383v.bluetoothVisibility && this.strapSettingsView == c32383v.strapSettingsView && this.strapDisconnected == c32383v.strapDisconnected && this.hrBroadcastEnabled == c32383v.hrBroadcastEnabled && this.switchTextAppearance == c32383v.switchTextAppearance && this.showEditStrapNameIcon == c32383v.showEditStrapNameIcon && AbstractC22676k.m65745e(this.connectedDeviceName, c32383v.connectedDeviceName) && this.strapAnimation == c32383v.strapAnimation && this.firmwareUpdateAvailable == c32383v.firmwareUpdateAvailable && AbstractC22676k.m65745e(this.batteryIndicatorViewState, c32383v.batteryIndicatorViewState) && AbstractC22676k.m65745e(this.lastSyncViewState, c32383v.lastSyncViewState) && this.shouldShowBatteryPackAnimation == c32383v.shouldShowBatteryPackAnimation;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHrBroadcastEnabled() {
        return this.hrBroadcastEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C32366e getLastSyncViewState() {
        return this.lastSyncViewState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShowEditStrapNameIcon() {
        return this.showEditStrapNameIcon;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.switchTextAppearance, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.strapSettingsView, Integer.hashCode(this.bluetoothVisibility) * 31, 31), 31, this.strapDisconnected), 31, this.hrBroadcastEnabled), 31), 31, this.showEditStrapNameIcon);
        String str = this.connectedDeviceName;
        return Boolean.hashCode(this.shouldShowBatteryPackAnimation) + ((this.lastSyncViewState.hashCode() + ((this.batteryIndicatorViewState.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.strapAnimation, (iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.firmwareUpdateAvailable)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getStrapDisconnected() {
        return this.strapDisconnected;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getStrapSettingsView() {
        return this.strapSettingsView;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSwitchTextAppearance() {
        return this.switchTextAppearance;
    }

    public String toString() {
        int i13 = this.bluetoothVisibility;
        int i14 = this.strapSettingsView;
        boolean z4 = this.strapDisconnected;
        boolean z13 = this.hrBroadcastEnabled;
        int i15 = this.switchTextAppearance;
        boolean z14 = this.showEditStrapNameIcon;
        String str = this.connectedDeviceName;
        int i16 = this.strapAnimation;
        boolean z15 = this.firmwareUpdateAvailable;
        C10627a c10627a = this.batteryIndicatorViewState;
        C32366e c32366e = this.lastSyncViewState;
        boolean z16 = this.shouldShowBatteryPackAnimation;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "StrapSettingsViewState(bluetoothVisibility=", ", strapSettingsView=", ", strapDisconnected=");
        AbstractC38963t7.m124392v(sbM30465s, z4, ", hrBroadcastEnabled=", z13, ", switchTextAppearance=");
        AbstractC13673n.m38573t(i15, ", showEditStrapNameIcon=", ", connectedDeviceName=", sbM30465s, z14);
        AbstractC11266d.m30470x(i16, str, ", strapAnimation=", ", firmwareUpdateAvailable=", sbM30465s);
        sbM30465s.append(z15);
        sbM30465s.append(", batteryIndicatorViewState=");
        sbM30465s.append(c10627a);
        sbM30465s.append(", lastSyncViewState=");
        sbM30465s.append(c32366e);
        sbM30465s.append(", shouldShowBatteryPackAnimation=");
        sbM30465s.append(z16);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public /* synthetic */ C32383v(int i13, int i14, boolean z4, boolean z13, int i15, boolean z14, String str, int i16, boolean z15, C10627a c10627a, C32366e c32366e, boolean z16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 8 : i13, (i17 & 2) != 0 ? 0 : i14, (i17 & 4) != 0 ? true : z4, (i17 & 8) != 0 ? false : z13, (i17 & 16) != 0 ? AbstractC17313k.f67039a : i15, (i17 & 32) != 0 ? false : z14, (i17 & 64) != 0 ? null : str, (i17 & 128) != 0 ? AbstractC17311i.f66905b : i16, (i17 & 256) != 0 ? false : z15, (i17 & 512) != 0 ? new C10627a(0, false, null, false, false, false, null, null, 255, null) : c10627a, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C32366e(0, 0, 0, null, 15, null) : c32366e, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z16);
    }
}
