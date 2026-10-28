package io.getstream.chat.android.client.internal.offline.repository.database.internal.debug;

import java.util.concurrent.Executor;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/internal/debug/CurrentThreadExecutor;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Ll83/a0;", "execute", "(Ljava/lang/Runnable;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CurrentThreadExecutor implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        AbstractC22676k.m65750j(command, "command");
        command.run();
    }
}
