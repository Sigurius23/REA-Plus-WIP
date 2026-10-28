package io.getstream.chat.android.client.utils.retry;

import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r23.InterfaceC30894d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/retry/NoRetryPolicy;", "Lr23/d;", "<init>", "()V", "", "attempt", "Ln23/e;", "error", "", "shouldRetry", "(ILn23/e;)Z", "retryTimeout", "(ILn23/e;)I", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoRetryPolicy implements InterfaceC30894d {
    @Override // r23.InterfaceC30894d
    public final int retryTimeout(int attempt, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        return 0;
    }

    @Override // r23.InterfaceC30894d
    public final boolean shouldRetry(int attempt, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        return false;
    }
}
