package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, m65681d2 = {"fileReadStream", "Lcom/mapbox/common/ReadStream;", "path", "", "memoryReadStream", "str", "asReadStream", "Ljava/io/InputStream;", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class PlatformStreamFactoryKt {
    public static final ReadStream asReadStream(final InputStream inputStream) {
        AbstractC22676k.m65750j(inputStream, "<this>");
        return new ReadStream() { // from class: com.mapbox.common.PlatformStreamFactoryKt.asReadStream.1
            private boolean exhausted;
            private long processed;

            @Override // com.mapbox.common.ReadStream
            /* JADX INFO: renamed from: isExhausted, reason: from getter */
            public boolean getExhausted() {
                return this.exhausted;
            }

            @Override // com.mapbox.common.ReadStream
            public boolean isReadable() {
                return true;
            }

            @Override // com.mapbox.common.ReadStream
            public Expected<String, Long> read(Buffer commonBuffer) {
                AbstractC22676k.m65750j(commonBuffer, "commonBuffer");
                try {
                    ByteBuffer buffer = commonBuffer.getData().getBuffer();
                    AbstractC22676k.m65749i(buffer, "commonBuffer.data.buffer");
                    long j7 = 0;
                    while (j7 < buffer.capacity()) {
                        int i13 = inputStream.read();
                        if (i13 == -1) {
                            this.exhausted = true;
                            break;
                        }
                        buffer.put((byte) i13);
                        j7++;
                    }
                    this.processed += j7;
                    Expected<String, Long> expectedCreateValue = ExpectedFactory.createValue(Long.valueOf(j7));
                    AbstractC22676k.m65749i(expectedCreateValue, "createValue(read)");
                    return expectedCreateValue;
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
            /* JADX INFO: renamed from: readBytes, reason: from getter */
            public long getProcessed() {
                return this.processed;
            }
        };
    }

    public static final ReadStream fileReadStream(String path) {
        AbstractC22676k.m65750j(path, "path");
        return asReadStream(new FileInputStream(new File(path)));
    }

    public static final ReadStream memoryReadStream(String str) {
        AbstractC22676k.m65750j(str, "str");
        byte[] bytes = str.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "this as java.lang.String).getBytes(charset)");
        return asReadStream(new ByteArrayInputStream(bytes));
    }
}
