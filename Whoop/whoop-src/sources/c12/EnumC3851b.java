package c12;

/* JADX INFO: renamed from: c12.b */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3851b {
    LOW,
    MEDIUM,
    HIGH,
    URGENT,
    MAX;

    public boolean hasSound() {
        return this == HIGH || this == URGENT || this == MAX;
    }
}
