package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.nio.ByteBuffer;
import ne3.C26616h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/mapbox/common/ResponseReadStream;", "Lcom/mapbox/common/ReadStream;", "Lne3/h;", "okioBuffer", "<init>", "(Lne3/h;)V", "", "readBytes", "()J", "", "isExhausted", "()Z", "isReadable", "Lcom/mapbox/common/Buffer;", "commonBuffer", "Lcom/mapbox/bindgen/Expected;", "", "read", "(Lcom/mapbox/common/Buffer;)Lcom/mapbox/bindgen/Expected;", "Lne3/h;", "getOkioBuffer", "()Lne3/h;", "J", "getReadBytes", "setReadBytes", "(J)V", "exhausted", "Z", "getExhausted", "setExhausted", "(Z)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ResponseReadStream implements ReadStream {
    private boolean exhausted;
    private final C26616h okioBuffer;
    private long readBytes;

    public ResponseReadStream(C26616h okioBuffer) {
        AbstractC22676k.m65750j(okioBuffer, "okioBuffer");
        this.okioBuffer = okioBuffer;
    }

    public final boolean getExhausted() {
        return this.exhausted;
    }

    public final C26616h getOkioBuffer() {
        return this.okioBuffer;
    }

    public final long getReadBytes() {
        return this.readBytes;
    }

    @Override // com.mapbox.common.ReadStream
    /* JADX INFO: renamed from: isExhausted */
    public boolean getExhausted() {
        return this.exhausted;
    }

    @Override // com.mapbox.common.ReadStream
    public boolean isReadable() {
        return this.okioBuffer.f105866x > 0;
    }

    @Override // com.mapbox.common.ReadStream
    public Expected<String, Long> read(Buffer commonBuffer) {
        AbstractC22676k.m65750j(commonBuffer, "commonBuffer");
        try {
            ByteBuffer buffer = commonBuffer.getData().getBuffer();
            AbstractC22676k.m65749i(buffer, "commonBuffer.data.buffer");
            long j7 = 0;
            while (isReadable() && buffer.hasRemaining()) {
                int i13 = this.okioBuffer.read(buffer);
                if (i13 == -1) {
                    this.exhausted = true;
                    Expected<String, Long> expectedCreateValue = ExpectedFactory.createValue(Long.valueOf(j7));
                    AbstractC22676k.m65749i(expectedCreateValue, "createValue(totalRead)");
                    return expectedCreateValue;
                }
                long j13 = i13;
                j7 += j13;
                this.readBytes += j13;
            }
            Expected<String, Long> expectedCreateValue2 = ExpectedFactory.createValue(Long.valueOf(j7));
            AbstractC22676k.m65749i(expectedCreateValue2, "createValue(totalRead)");
            return expectedCreateValue2;
        } catch (Exception e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = "Unknown stream error";
            }
            Expected<String, Long> expectedCreateError = ExpectedFactory.createError(message);
            AbstractC22676k.m65749i(expectedCreateError, "createError(e.message ?: \"Unknown stream error\")");
            return expectedCreateError;
        }
    }

    @Override // com.mapbox.common.ReadStream
    /* JADX INFO: renamed from: readBytes */
    public long getProcessed() {
        return this.readBytes;
    }

    public final void setExhausted(boolean z4) {
        this.exhausted = z4;
    }

    public final void setReadBytes(long j7) {
        this.readBytes = j7;
    }
}
