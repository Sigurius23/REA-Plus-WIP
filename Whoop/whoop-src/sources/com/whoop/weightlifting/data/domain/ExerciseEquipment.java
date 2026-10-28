package com.whoop.weightlifting.data.domain;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import xr2.InterfaceC38631a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;", "Lxr2/a;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "Barbell", "BodyWeight", "CableMachine", "DipBar", "Dumbbell", "EzCurlBar", "GluteHamMachine", "HexBar", "JumpRope", "Kettlebell", "Machine", "MedicineBall", "Other", "PlyoBox", "PulleyMachine", "PullUpBar", "Rings", "Sled", "SmithMachine", "StabilityBall", "Tire", "TrapBar", "Trx", "Unknown", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum ExerciseEquipment implements InterfaceC38631a {
    Barbell("BARBELL"),
    BodyWeight("BODY"),
    CableMachine("CABLE_MACHINE"),
    DipBar("DIP_BAR"),
    Dumbbell("DUMBBELL"),
    EzCurlBar("EZ_CURL_BAR"),
    GluteHamMachine("GLUTE_HAM_MACHINE"),
    HexBar("HEXBAR"),
    JumpRope("JUMP_ROPE"),
    Kettlebell("KETTLEBELL"),
    Machine("MACHINE"),
    MedicineBall("MEDICINE_BALL"),
    Other("OTHER"),
    PlyoBox("PLYO_BOX"),
    PulleyMachine("PULLEY_MACHINE"),
    PullUpBar("PULL_UP_BAR"),
    Rings("RINGS"),
    Sled("SLED"),
    SmithMachine("SMITH_MACHINE"),
    StabilityBall("STABILITY_BALL"),
    Tire("TIRE"),
    TrapBar("TRAPBAR"),
    Trx("TRX"),
    Unknown("UNKNOWN");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String serializedValue;

    ExerciseEquipment(String str) {
        this.serializedValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    @Override // xr2.InterfaceC38631a
    public String getSerializedValue() {
        return this.serializedValue;
    }
}
