package androidx.profileinstaller;

import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes5.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j7) {
        this.mValue = j7;
    }

    public static FileSectionType fromValue(long j7) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i13 = 0; i13 < fileSectionTypeArrValues.length; i13++) {
            if (fileSectionTypeArrValues[i13].getValue() == j7) {
                return fileSectionTypeArrValues[i13];
            }
        }
        throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "Unsupported FileSection Type "));
    }

    public long getValue() {
        return this.mValue;
    }
}
