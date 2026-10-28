package androidx.profileinstaller;

/* JADX INFO: loaded from: classes5.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    public WritableFileSection(FileSectionType fileSectionType, int i13, byte[] bArr, boolean z4) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i13;
        this.mContents = bArr;
        this.mNeedsCompression = z4;
    }
}
