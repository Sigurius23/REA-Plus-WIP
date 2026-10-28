package com.mapbox.common.module.cronet;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Buffer;
import com.mapbox.common.ReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ne3.C26616h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/mapbox/common/ReadStream;", "Lne3/h;", "toOkioBuffer", "(Lcom/mapbox/common/ReadStream;)Lne3/h;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "callbackExecutor", "Ljava/util/concurrent/ExecutorService;", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CronetClientDetailKt {
    private static final ExecutorService callbackExecutor = Executors.newSingleThreadExecutor();

    /* JADX INFO: Access modifiers changed from: private */
    public static final C26616h toOkioBuffer(ReadStream readStream) throws IOException {
        C26616h c26616h = new C26616h();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4096);
        Buffer buffer = new Buffer(new DataRef(byteBufferAllocateDirect));
        while (!readStream.getExhausted()) {
            byteBufferAllocateDirect.clear();
            Expected<String, Long> expected = readStream.read(buffer);
            AbstractC22676k.m65749i(expected, "this.read(commonBuffer)");
            if (!expected.isValue()) {
                String error = expected.getError();
                AbstractC22676k.m65747g(error);
                throw new IOException(error);
            }
            Long value = expected.getValue();
            AbstractC22676k.m65747g(value);
            byteBufferAllocateDirect.limit((int) value.longValue());
            c26616h.write(byteBufferAllocateDirect);
        }
        return c26616h;
    }
}
