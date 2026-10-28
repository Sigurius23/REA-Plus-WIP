package io.getstream.chat.android.client.persistence.p225db;

import android.content.Context;
import androidx.room.AbstractC1848z0;
import androidx.room.C1818p0;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;", "Landroidx/room/z0;", "<init>", "()V", "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "messageReceiptDao", "()Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ChatClientDatabase extends AbstractC1848z0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;", "", "<init>", "()V", "build", "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;", "context", "Landroid/content/Context;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChatClientDatabase build(Context context) {
            AbstractC22676k.m65750j(context, "context");
            Context applicationContext = context.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(applicationContext, ChatClientDatabase.class, "stream_chat_client.db");
            c1818p0M60645C.f7157p = false;
            c1818p0M60645C.f7158q = true;
            c1818p0M60645C.f7145d.add(new ChatClientDatabase$Companion$build$1());
            return (ChatClientDatabase) c1818p0M60645C.m5450b();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract MessageReceiptDao messageReceiptDao();
}
