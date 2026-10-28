package io.getstream.chat.android.p226ui.common.internal.file;

import c93.InterfaceC4351m;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;", "Ljava/io/FilterInputStream;", "Ljava/io/InputStream;", "delegate", "", "totalBytes", "Lkotlin/Function2;", "Ll83/a0;", "onProgress", "<init>", "(Ljava/io/InputStream;JLc93/m;)V", "", "b", "", "off", "len", "read", "([BII)I", "J", "Lc93/m;", "bytesRead", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class ProgressInputStream extends FilterInputStream {
    private long bytesRead;
    private final InterfaceC4351m onProgress;
    private final long totalBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressInputStream(InputStream delegate, long j7, InterfaceC4351m onProgress) {
        super(delegate);
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(onProgress, "onProgress");
        this.totalBytes = j7;
        this.onProgress = onProgress;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] b, int off, int len) throws IOException {
        AbstractC22676k.m65750j(b, "b");
        int i13 = super.read(b, off, len);
        if (i13 > 0) {
            long j7 = this.bytesRead + ((long) i13);
            this.bytesRead = j7;
            this.onProgress.invoke(Long.valueOf(j7), Long.valueOf(this.totalBytes));
        }
        return i13;
    }
}
