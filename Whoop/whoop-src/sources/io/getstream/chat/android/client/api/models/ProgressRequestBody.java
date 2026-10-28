package io.getstream.chat.android.client.api.models;

import io.getstream.chat.android.client.utils.ProgressCallback;
import ne3.AbstractC26604b;
import ne3.AbstractC26636r;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.InterfaceC26618i;
import ne3.InterfaceC26629n0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34818h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/ProgressRequestBody;", "Lud3/v0;", "delegate", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "<init>", "(Lud3/v0;Lio/getstream/chat/android/client/utils/ProgressCallback;)V", "Lud3/h0;", "contentType", "()Lud3/h0;", "", "contentLength", "()J", "Lne3/i;", "sink", "Ll83/a0;", "writeTo", "(Lne3/i;)V", "Lud3/v0;", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "CountingSink", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ProgressRequestBody extends AbstractC34846v0 {
    private final ProgressCallback callback;
    private final AbstractC34846v0 delegate;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/ProgressRequestBody$CountingSink;", "Lne3/r;", "Lne3/n0;", "delegate", "<init>", "(Lio/getstream/chat/android/client/api/models/ProgressRequestBody;Lne3/n0;)V", "Lne3/h;", "source", "", "byteCount", "Ll83/a0;", "write", "(Lne3/h;J)V", "total", "J", "getTotal", "()J", "uploaded", "getUploaded", "setUploaded", "(J)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public final class CountingSink extends AbstractC26636r {
        final /* synthetic */ ProgressRequestBody this$0;
        private final long total;
        private long uploaded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountingSink(ProgressRequestBody progressRequestBody, InterfaceC26629n0 delegate) {
            super(delegate);
            AbstractC22676k.m65750j(delegate, "delegate");
            this.this$0 = progressRequestBody;
            this.total = progressRequestBody.contentLength();
        }

        public final long getTotal() {
            return this.total;
        }

        public final long getUploaded() {
            return this.uploaded;
        }

        public final void setUploaded(long j7) {
            this.uploaded = j7;
        }

        @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0
        public final void write(C26616h source, long byteCount) {
            AbstractC22676k.m65750j(source, "source");
            super.write(source, byteCount);
            this.uploaded += byteCount;
            this.this$0.callback.onProgress(this.uploaded, this.total);
        }
    }

    public ProgressRequestBody(AbstractC34846v0 delegate, ProgressCallback callback) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(callback, "callback");
        this.delegate = delegate;
        this.callback = callback;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        return this.delegate.contentLength();
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return this.delegate.getContentType();
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i sink) {
        AbstractC22676k.m65750j(sink, "sink");
        C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(new CountingSink(this, sink));
        this.delegate.writeTo(c26617h0M79157b);
        c26617h0M79157b.flush();
    }
}
