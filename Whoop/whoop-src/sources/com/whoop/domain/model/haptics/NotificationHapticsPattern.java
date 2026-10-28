package com.whoop.domain.model.haptics;

import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006-"}, m65681d2 = {"Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;", "", "waveFormEffect1", "", "waveFormEffect2", "waveFormEffect3", "waveFormEffect4", "waveFormEffect5", "waveFormEffect6", "waveFormEffect7", "waveFormEffect8", "loopControlForEffects", "", "overallWaveformLoopControl", "<init>", "(IIIIIIIISI)V", "getWaveFormEffect1", "()I", "getWaveFormEffect2", "getWaveFormEffect3", "getWaveFormEffect4", "getWaveFormEffect5", "getWaveFormEffect6", "getWaveFormEffect7", "getWaveFormEffect8", "getLoopControlForEffects", "()S", "getOverallWaveformLoopControl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class NotificationHapticsPattern {
    private final short loopControlForEffects;
    private final int overallWaveformLoopControl;
    private final int waveFormEffect1;
    private final int waveFormEffect2;
    private final int waveFormEffect3;
    private final int waveFormEffect4;
    private final int waveFormEffect5;
    private final int waveFormEffect6;
    private final int waveFormEffect7;
    private final int waveFormEffect8;

    public NotificationHapticsPattern(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, short s13, int i25) {
        this.waveFormEffect1 = i13;
        this.waveFormEffect2 = i14;
        this.waveFormEffect3 = i15;
        this.waveFormEffect4 = i16;
        this.waveFormEffect5 = i17;
        this.waveFormEffect6 = i18;
        this.waveFormEffect7 = i19;
        this.waveFormEffect8 = i24;
        this.loopControlForEffects = s13;
        this.overallWaveformLoopControl = i25;
    }

    public static /* synthetic */ NotificationHapticsPattern copy$default(NotificationHapticsPattern notificationHapticsPattern, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, short s13, int i25, int i26, Object obj) {
        if ((i26 & 1) != 0) {
            i13 = notificationHapticsPattern.waveFormEffect1;
        }
        if ((i26 & 2) != 0) {
            i14 = notificationHapticsPattern.waveFormEffect2;
        }
        if ((i26 & 4) != 0) {
            i15 = notificationHapticsPattern.waveFormEffect3;
        }
        if ((i26 & 8) != 0) {
            i16 = notificationHapticsPattern.waveFormEffect4;
        }
        if ((i26 & 16) != 0) {
            i17 = notificationHapticsPattern.waveFormEffect5;
        }
        if ((i26 & 32) != 0) {
            i18 = notificationHapticsPattern.waveFormEffect6;
        }
        if ((i26 & 64) != 0) {
            i19 = notificationHapticsPattern.waveFormEffect7;
        }
        if ((i26 & 128) != 0) {
            i24 = notificationHapticsPattern.waveFormEffect8;
        }
        if ((i26 & 256) != 0) {
            s13 = notificationHapticsPattern.loopControlForEffects;
        }
        if ((i26 & 512) != 0) {
            i25 = notificationHapticsPattern.overallWaveformLoopControl;
        }
        short s14 = s13;
        int i27 = i25;
        int i28 = i19;
        int i29 = i24;
        int i34 = i17;
        int i35 = i18;
        return notificationHapticsPattern.copy(i13, i14, i15, i16, i34, i35, i28, i29, s14, i27);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWaveFormEffect1() {
        return this.waveFormEffect1;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOverallWaveformLoopControl() {
        return this.overallWaveformLoopControl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWaveFormEffect2() {
        return this.waveFormEffect2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWaveFormEffect3() {
        return this.waveFormEffect3;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWaveFormEffect4() {
        return this.waveFormEffect4;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWaveFormEffect5() {
        return this.waveFormEffect5;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWaveFormEffect6() {
        return this.waveFormEffect6;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWaveFormEffect7() {
        return this.waveFormEffect7;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWaveFormEffect8() {
        return this.waveFormEffect8;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final short getLoopControlForEffects() {
        return this.loopControlForEffects;
    }

    public final NotificationHapticsPattern copy(int waveFormEffect1, int waveFormEffect2, int waveFormEffect3, int waveFormEffect4, int waveFormEffect5, int waveFormEffect6, int waveFormEffect7, int waveFormEffect8, short loopControlForEffects, int overallWaveformLoopControl) {
        return new NotificationHapticsPattern(waveFormEffect1, waveFormEffect2, waveFormEffect3, waveFormEffect4, waveFormEffect5, waveFormEffect6, waveFormEffect7, waveFormEffect8, loopControlForEffects, overallWaveformLoopControl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationHapticsPattern)) {
            return false;
        }
        NotificationHapticsPattern notificationHapticsPattern = (NotificationHapticsPattern) other;
        return this.waveFormEffect1 == notificationHapticsPattern.waveFormEffect1 && this.waveFormEffect2 == notificationHapticsPattern.waveFormEffect2 && this.waveFormEffect3 == notificationHapticsPattern.waveFormEffect3 && this.waveFormEffect4 == notificationHapticsPattern.waveFormEffect4 && this.waveFormEffect5 == notificationHapticsPattern.waveFormEffect5 && this.waveFormEffect6 == notificationHapticsPattern.waveFormEffect6 && this.waveFormEffect7 == notificationHapticsPattern.waveFormEffect7 && this.waveFormEffect8 == notificationHapticsPattern.waveFormEffect8 && this.loopControlForEffects == notificationHapticsPattern.loopControlForEffects && this.overallWaveformLoopControl == notificationHapticsPattern.overallWaveformLoopControl;
    }

    public final short getLoopControlForEffects() {
        return this.loopControlForEffects;
    }

    public final int getOverallWaveformLoopControl() {
        return this.overallWaveformLoopControl;
    }

    public final int getWaveFormEffect1() {
        return this.waveFormEffect1;
    }

    public final int getWaveFormEffect2() {
        return this.waveFormEffect2;
    }

    public final int getWaveFormEffect3() {
        return this.waveFormEffect3;
    }

    public final int getWaveFormEffect4() {
        return this.waveFormEffect4;
    }

    public final int getWaveFormEffect5() {
        return this.waveFormEffect5;
    }

    public final int getWaveFormEffect6() {
        return this.waveFormEffect6;
    }

    public final int getWaveFormEffect7() {
        return this.waveFormEffect7;
    }

    public final int getWaveFormEffect8() {
        return this.waveFormEffect8;
    }

    public int hashCode() {
        return Integer.hashCode(this.overallWaveformLoopControl) + ((Short.hashCode(this.loopControlForEffects) + AbstractC11266d.m30448b(this.waveFormEffect8, AbstractC11266d.m30448b(this.waveFormEffect7, AbstractC11266d.m30448b(this.waveFormEffect6, AbstractC11266d.m30448b(this.waveFormEffect5, AbstractC11266d.m30448b(this.waveFormEffect4, AbstractC11266d.m30448b(this.waveFormEffect3, AbstractC11266d.m30448b(this.waveFormEffect2, Integer.hashCode(this.waveFormEffect1) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public String toString() {
        int i13 = this.waveFormEffect1;
        int i14 = this.waveFormEffect2;
        int i15 = this.waveFormEffect3;
        int i16 = this.waveFormEffect4;
        int i17 = this.waveFormEffect5;
        int i18 = this.waveFormEffect6;
        int i19 = this.waveFormEffect7;
        int i24 = this.waveFormEffect8;
        short s13 = this.loopControlForEffects;
        int i25 = this.overallWaveformLoopControl;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "NotificationHapticsPattern(waveFormEffect1=", ", waveFormEffect2=", ", waveFormEffect3=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", waveFormEffect4=", i16, ", waveFormEffect5=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", waveFormEffect6=", i18, ", waveFormEffect7=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", waveFormEffect8=", i24, ", loopControlForEffects=");
        return AbstractC26725a.m79505i(sbM30465s, s13, ", overallWaveformLoopControl=", i25, ")");
    }
}
