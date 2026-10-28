package io.getstream.chat.android.client.errors.cause;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/errors/cause/StreamChannelNotFoundException;", "Lio/getstream/chat/android/client/errors/cause/StreamException;", "cid", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "getMessage", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamChannelNotFoundException extends StreamException {
    private final String cid;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamChannelNotFoundException(String cid, String message) {
        super(message);
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(message, "message");
        this.cid = cid;
        this.message = message;
    }

    public final String getCid() {
        return this.cid;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ StreamChannelNotFoundException(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? AbstractC11895b.m31996o("Channel with cid \"", str, "\" not found") : str2);
    }
}
