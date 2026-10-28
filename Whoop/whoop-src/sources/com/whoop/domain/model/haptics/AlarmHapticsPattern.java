package com.whoop.domain.model.haptics;

import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00101\u001a\u000202HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00063"}, m65681d2 = {"Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "", "waveFormEffect1", "", "waveFormEffect2", "waveFormEffect3", "waveFormEffect4", "waveFormEffect5", "waveFormEffect6", "waveFormEffect7", "waveFormEffect8", "loopControlForEffects", "", "overallWaveformLoopControl", "alarmDurationInSeconds", "alarmType", "<init>", "(IIIIIIIISIII)V", "getWaveFormEffect1", "()I", "getWaveFormEffect2", "getWaveFormEffect3", "getWaveFormEffect4", "getWaveFormEffect5", "getWaveFormEffect6", "getWaveFormEffect7", "getWaveFormEffect8", "getLoopControlForEffects", "()S", "getOverallWaveformLoopControl", "getAlarmDurationInSeconds", "getAlarmType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class AlarmHapticsPattern {
    private final int alarmDurationInSeconds;
    private final int alarmType;
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

    public AlarmHapticsPattern(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, short s13, int i25, int i26, int i27) {
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
        this.alarmDurationInSeconds = i26;
        this.alarmType = i27;
    }

    public static /* synthetic */ AlarmHapticsPattern copy$default(AlarmHapticsPattern alarmHapticsPattern, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, short s13, int i25, int i26, int i27, int i28, Object obj) {
        if ((i28 & 1) != 0) {
            i13 = alarmHapticsPattern.waveFormEffect1;
        }
        if ((i28 & 2) != 0) {
            i14 = alarmHapticsPattern.waveFormEffect2;
        }
        if ((i28 & 4) != 0) {
            i15 = alarmHapticsPattern.waveFormEffect3;
        }
        if ((i28 & 8) != 0) {
            i16 = alarmHapticsPattern.waveFormEffect4;
        }
        if ((i28 & 16) != 0) {
            i17 = alarmHapticsPattern.waveFormEffect5;
        }
        if ((i28 & 32) != 0) {
            i18 = alarmHapticsPattern.waveFormEffect6;
        }
        if ((i28 & 64) != 0) {
            i19 = alarmHapticsPattern.waveFormEffect7;
        }
        if ((i28 & 128) != 0) {
            i24 = alarmHapticsPattern.waveFormEffect8;
        }
        if ((i28 & 256) != 0) {
            s13 = alarmHapticsPattern.loopControlForEffects;
        }
        if ((i28 & 512) != 0) {
            i25 = alarmHapticsPattern.overallWaveformLoopControl;
        }
        if ((i28 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            i26 = alarmHapticsPattern.alarmDurationInSeconds;
        }
        if ((i28 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            i27 = alarmHapticsPattern.alarmType;
        }
        int i29 = i26;
        int i34 = i27;
        short s14 = s13;
        int i35 = i25;
        int i36 = i19;
        int i37 = i24;
        int i38 = i17;
        int i39 = i18;
        return alarmHapticsPattern.copy(i13, i14, i15, i16, i38, i39, i36, i37, s14, i35, i29, i34);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWaveFormEffect1() {
        return this.waveFormEffect1;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOverallWaveformLoopControl() {
        return this.overallWaveformLoopControl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAlarmDurationInSeconds() {
        return this.alarmDurationInSeconds;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getAlarmType() {
        return this.alarmType;
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

    public final AlarmHapticsPattern copy(int waveFormEffect1, int waveFormEffect2, int waveFormEffect3, int waveFormEffect4, int waveFormEffect5, int waveFormEffect6, int waveFormEffect7, int waveFormEffect8, short loopControlForEffects, int overallWaveformLoopControl, int alarmDurationInSeconds, int alarmType) {
        return new AlarmHapticsPattern(waveFormEffect1, waveFormEffect2, waveFormEffect3, waveFormEffect4, waveFormEffect5, waveFormEffect6, waveFormEffect7, waveFormEffect8, loopControlForEffects, overallWaveformLoopControl, alarmDurationInSeconds, alarmType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmHapticsPattern)) {
            return false;
        }
        AlarmHapticsPattern alarmHapticsPattern = (AlarmHapticsPattern) other;
        return this.waveFormEffect1 == alarmHapticsPattern.waveFormEffect1 && this.waveFormEffect2 == alarmHapticsPattern.waveFormEffect2 && this.waveFormEffect3 == alarmHapticsPattern.waveFormEffect3 && this.waveFormEffect4 == alarmHapticsPattern.waveFormEffect4 && this.waveFormEffect5 == alarmHapticsPattern.waveFormEffect5 && this.waveFormEffect6 == alarmHapticsPattern.waveFormEffect6 && this.waveFormEffect7 == alarmHapticsPattern.waveFormEffect7 && this.waveFormEffect8 == alarmHapticsPattern.waveFormEffect8 && this.loopControlForEffects == alarmHapticsPattern.loopControlForEffects && this.overallWaveformLoopControl == alarmHapticsPattern.overallWaveformLoopControl && this.alarmDurationInSeconds == alarmHapticsPattern.alarmDurationInSeconds && this.alarmType == alarmHapticsPattern.alarmType;
    }

    public final int getAlarmDurationInSeconds() {
        return this.alarmDurationInSeconds;
    }

    public final int getAlarmType() {
        return this.alarmType;
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
        return Integer.hashCode(this.alarmType) + AbstractC11266d.m30448b(this.alarmDurationInSeconds, AbstractC11266d.m30448b(this.overallWaveformLoopControl, (Short.hashCode(this.loopControlForEffects) + AbstractC11266d.m30448b(this.waveFormEffect8, AbstractC11266d.m30448b(this.waveFormEffect7, AbstractC11266d.m30448b(this.waveFormEffect6, AbstractC11266d.m30448b(this.waveFormEffect5, AbstractC11266d.m30448b(this.waveFormEffect4, AbstractC11266d.m30448b(this.waveFormEffect3, AbstractC11266d.m30448b(this.waveFormEffect2, Integer.hashCode(this.waveFormEffect1) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31);
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
        int i26 = this.alarmDurationInSeconds;
        int i27 = this.alarmType;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "AlarmHapticsPattern(waveFormEffect1=", ", waveFormEffect2=", ", waveFormEffect3=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", waveFormEffect4=", i16, ", waveFormEffect5=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", waveFormEffect6=", i18, ", waveFormEffect7=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", waveFormEffect8=", i24, ", loopControlForEffects=");
        AbstractC30802r.m94773v(sbM30465s, s13, ", overallWaveformLoopControl=", i25, ", alarmDurationInSeconds=");
        return AbstractC26725a.m79505i(sbM30465s, i26, ", alarmType=", i27, ")");
    }
}
