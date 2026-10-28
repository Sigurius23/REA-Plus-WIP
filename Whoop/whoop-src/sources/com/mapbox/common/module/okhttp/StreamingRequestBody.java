package com.mapbox.common.module.okhttp;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Buffer;
import com.mapbox.common.ReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import ne3.C26616h;
import ne3.InterfaceC26618i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34818h0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/StreamingRequestBody;", "Lud3/v0;", "Lcom/mapbox/common/ReadStream;", "inputStream", "Lud3/h0;", "contentType", "<init>", "(Lcom/mapbox/common/ReadStream;Lud3/h0;)V", "()Lud3/h0;", "", "isOneShot", "()Z", "", "contentLength", "()J", "Lne3/i;", "sink", "Ll83/a0;", "writeTo", "(Lne3/i;)V", "Lcom/mapbox/common/ReadStream;", "getInputStream", "()Lcom/mapbox/common/ReadStream;", "Lud3/h0;", "getContentType", "Lne3/h;", "buffer", "Lne3/h;", "getBuffer", "()Lne3/h;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class StreamingRequestBody extends AbstractC34846v0 {
    private final C26616h buffer;
    private final C34818h0 contentType;
    private final ReadStream inputStream;

    public StreamingRequestBody(ReadStream inputStream, C34818h0 c34818h0) throws IOException {
        AbstractC22676k.m65750j(inputStream, "inputStream");
        this.inputStream = inputStream;
        this.contentType = c34818h0;
        this.buffer = new C26616h();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4096);
        Buffer buffer = new Buffer(new DataRef(byteBufferAllocateDirect));
        while (!this.inputStream.getExhausted()) {
            byteBufferAllocateDirect.clear();
            Expected<String, Long> expected = this.inputStream.read(buffer);
            AbstractC22676k.m65749i(expected, "inputStream.read(commonBuffer)");
            if (!expected.isValue()) {
                String error = expected.getError();
                AbstractC22676k.m65747g(error);
                throw new IOException(error);
            }
            Long value = expected.getValue();
            AbstractC22676k.m65747g(value);
            byteBufferAllocateDirect.limit((int) value.longValue());
            this.buffer.write(byteBufferAllocateDirect);
        }
    }

    @Override // ud3.AbstractC34846v0
    public long contentLength() {
        return this.buffer.f105866x;
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public C34818h0 getContentType() {
        return this.contentType;
    }

    public final C26616h getBuffer() {
        return this.buffer;
    }

    public final C34818h0 getContentType() {
        return this.contentType;
    }

    public final ReadStream getInputStream() {
        return this.inputStream;
    }

    @Override // ud3.AbstractC34846v0
    public boolean isOneShot() {
        return false;
    }

    @Override // ud3.AbstractC34846v0
    public void writeTo(InterfaceC26618i sink) {
        AbstractC22676k.m65750j(sink, "sink");
        sink.mo79189N0(this.buffer.m79210i());
    }
}
