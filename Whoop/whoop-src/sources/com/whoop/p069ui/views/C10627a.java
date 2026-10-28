package com.whoop.p069ui.views;

import com.whoop.connectivityCore.batteryPack.models.BatteryPackType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kn2.EnumC22601c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;
import yg2.C39531f;

/* JADX INFO: renamed from: com.whoop.ui.views.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Jb\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b\n\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b!\u0010,R\u0011\u0010-\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010 ¨\u0006."}, m65681d2 = {"Lcom/whoop/ui/views/a;", "", "", "batteryPercent", "", "isCharging", "Lkn2/c;", "strapGeneration", "isMaverickOrGoose", "puffinChargeFeatureEnabled", "isPuffinReady", "Lyg2/f;", "puffinBatteryViewState", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "batteryPackType", "<init>", "(IZLkn2/c;ZZZLyg2/f;Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)V", "a", "(IZLkn2/c;ZZZLyg2/f;Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)Lcom/whoop/ui/views/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "Z", "i", "()Z", "c", "Lkn2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkn2/c;", "j", "e", "f", "g", "Lyg2/f;", "()Lyg2/f;", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "showChargeLabel", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10627a {

    /* JADX INFO: renamed from: i */
    public static final int f32368i = C39531f.f170077e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int batteryPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isCharging;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC22601c strapGeneration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isMaverickOrGoose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean puffinChargeFeatureEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isPuffinReady;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C39531f puffinBatteryViewState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final BatteryPackType batteryPackType;

    public C10627a(int i13, boolean z4, EnumC22601c strapGeneration, boolean z13, boolean z14, boolean z15, C39531f puffinBatteryViewState, BatteryPackType batteryPackType) {
        AbstractC22676k.m65750j(strapGeneration, "strapGeneration");
        AbstractC22676k.m65750j(puffinBatteryViewState, "puffinBatteryViewState");
        this.batteryPercent = i13;
        this.isCharging = z4;
        this.strapGeneration = strapGeneration;
        this.isMaverickOrGoose = z13;
        this.puffinChargeFeatureEnabled = z14;
        this.isPuffinReady = z15;
        this.puffinBatteryViewState = puffinBatteryViewState;
        this.batteryPackType = batteryPackType;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C10627a m27476b(C10627a c10627a, int i13, boolean z4, EnumC22601c enumC22601c, boolean z13, boolean z14, boolean z15, C39531f c39531f, BatteryPackType batteryPackType, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c10627a.batteryPercent;
        }
        if ((i14 & 2) != 0) {
            z4 = c10627a.isCharging;
        }
        if ((i14 & 4) != 0) {
            enumC22601c = c10627a.strapGeneration;
        }
        if ((i14 & 8) != 0) {
            z13 = c10627a.isMaverickOrGoose;
        }
        if ((i14 & 16) != 0) {
            z14 = c10627a.puffinChargeFeatureEnabled;
        }
        if ((i14 & 32) != 0) {
            z15 = c10627a.isPuffinReady;
        }
        if ((i14 & 64) != 0) {
            c39531f = c10627a.puffinBatteryViewState;
        }
        if ((i14 & 128) != 0) {
            batteryPackType = c10627a.batteryPackType;
        }
        C39531f c39531f2 = c39531f;
        BatteryPackType batteryPackType2 = batteryPackType;
        boolean z16 = z14;
        boolean z17 = z15;
        return c10627a.m27477a(i13, z4, enumC22601c, z13, z16, z17, c39531f2, batteryPackType2);
    }

    /* JADX INFO: renamed from: a */
    public final C10627a m27477a(int batteryPercent, boolean isCharging, EnumC22601c strapGeneration, boolean isMaverickOrGoose, boolean puffinChargeFeatureEnabled, boolean isPuffinReady, C39531f puffinBatteryViewState, BatteryPackType batteryPackType) {
        AbstractC22676k.m65750j(strapGeneration, "strapGeneration");
        AbstractC22676k.m65750j(puffinBatteryViewState, "puffinBatteryViewState");
        return new C10627a(batteryPercent, isCharging, strapGeneration, isMaverickOrGoose, puffinChargeFeatureEnabled, isPuffinReady, puffinBatteryViewState, batteryPackType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BatteryPackType getBatteryPackType() {
        return this.batteryPackType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBatteryPercent() {
        return this.batteryPercent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C39531f getPuffinBatteryViewState() {
        return this.puffinBatteryViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10627a)) {
            return false;
        }
        C10627a c10627a = (C10627a) other;
        return this.batteryPercent == c10627a.batteryPercent && this.isCharging == c10627a.isCharging && this.strapGeneration == c10627a.strapGeneration && this.isMaverickOrGoose == c10627a.isMaverickOrGoose && this.puffinChargeFeatureEnabled == c10627a.puffinChargeFeatureEnabled && this.isPuffinReady == c10627a.isPuffinReady && AbstractC22676k.m65745e(this.puffinBatteryViewState, c10627a.puffinBatteryViewState) && this.batteryPackType == c10627a.batteryPackType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPuffinChargeFeatureEnabled() {
        return this.puffinChargeFeatureEnabled;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27482g() {
        return !this.isCharging && EnumC10628b.INSTANCE.m27486a(this.batteryPercent) == EnumC10628b.LOW;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC22601c getStrapGeneration() {
        return this.strapGeneration;
    }

    public int hashCode() {
        int iHashCode = (this.puffinBatteryViewState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.strapGeneration.hashCode() + AbstractC2875y.m8289b(Integer.hashCode(this.batteryPercent) * 31, 31, this.isCharging)) * 31, 31, this.isMaverickOrGoose), 31, this.puffinChargeFeatureEnabled), 31, this.isPuffinReady)) * 31;
        BatteryPackType batteryPackType = this.batteryPackType;
        return iHashCode + (batteryPackType == null ? 0 : batteryPackType.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsMaverickOrGoose() {
        return this.isMaverickOrGoose;
    }

    public String toString() {
        int i13 = this.batteryPercent;
        boolean z4 = this.isCharging;
        EnumC22601c enumC22601c = this.strapGeneration;
        boolean z13 = this.isMaverickOrGoose;
        boolean z14 = this.puffinChargeFeatureEnabled;
        boolean z15 = this.isPuffinReady;
        C39531f c39531f = this.puffinBatteryViewState;
        BatteryPackType batteryPackType = this.batteryPackType;
        StringBuilder sb4 = new StringBuilder("BatteryIndicatorViewState(batteryPercent=");
        sb4.append(i13);
        sb4.append(", isCharging=");
        sb4.append(z4);
        sb4.append(", strapGeneration=");
        sb4.append(enumC22601c);
        sb4.append(", isMaverickOrGoose=");
        sb4.append(z13);
        sb4.append(", puffinChargeFeatureEnabled=");
        AbstractC38963t7.m124392v(sb4, z14, ", isPuffinReady=", z15, ", puffinBatteryViewState=");
        sb4.append(c39531f);
        sb4.append(", batteryPackType=");
        sb4.append(batteryPackType);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C10627a(int i13, boolean z4, EnumC22601c enumC22601c, boolean z13, boolean z14, boolean z15, C39531f c39531f, BatteryPackType batteryPackType, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? -1 : i13, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? EnumC22601c.DISCONNECTED : enumC22601c, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? false : z14, (i14 & 32) == 0 ? z15 : false, (i14 & 64) != 0 ? new C39531f(0, null, 0, false, 15, null) : c39531f, (i14 & 128) != 0 ? null : batteryPackType);
    }
}
