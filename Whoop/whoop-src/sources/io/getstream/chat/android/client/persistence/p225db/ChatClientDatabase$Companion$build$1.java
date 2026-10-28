package io.getstream.chat.android.client.persistence.p225db;

import androidx.room.AbstractC1821q0;
import p518ub.InterfaceC34728a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"io/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion$build$1", "Landroidx/room/q0;", "Lub/a;", "db", "Ll83/a0;", "onOpen", "(Lub/a;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClientDatabase$Companion$build$1 extends AbstractC1821q0 {
    @Override // androidx.room.AbstractC1821q0
    public final void onOpen(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        db4.mo109660E("PRAGMA synchronous = NORMAL");
    }
}
