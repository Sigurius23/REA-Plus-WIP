package dq0;

import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dq0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0007¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/models/User;", "", "b", "(Lio/getstream/chat/android/models/User;)Z", "Lio/getstream/chat/android/models/Attachment;", "d", "(Lio/getstream/chat/android/models/Attachment;)Z", "Lio/getstream/chat/android/models/Message;", "c", "(Lio/getstream/chat/android/models/Message;)Z", "", "a", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;", "imagePreviewUrl", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12285c {
    /* JADX INFO: renamed from: a */
    public static final String m34192a(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        String thumbUrl = attachment.getThumbUrl();
        return (thumbUrl == null && (thumbUrl = attachment.getImageUrl()) == null && (thumbUrl = attachment.getAssetUrl()) == null) ? attachment.getImage() : thumbUrl;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m34193b(User user) {
        AbstractC22676k.m65750j(user, "<this>");
        ChatClient.Companion companion = ChatClient.INSTANCE;
        if (!companion.isInitialized()) {
            return false;
        }
        String id4 = user.getId();
        User currentUser = companion.instance().getCurrentUser();
        return AbstractC22676k.m65745e(id4, currentUser != null ? currentUser.getId() : null);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m34194c(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        String parentId = message.getParentId();
        return !(parentId == null || parentId.length() == 0);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m34195d(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AbstractC25265s.m74155w0(AbstractC37056f.m118958J("image"), attachment.getType());
    }
}
