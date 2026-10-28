package io.getstream.chat.android.client.attachment;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import java.util.Iterator;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;", "", "<init>", "()V", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "verifyAttachments$stream_chat_android_client_release", "(Ln23/h;)Ln23/h;", "verifyAttachments", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsVerifier {
    public static final AttachmentsVerifier INSTANCE;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private static final InterfaceC23462h logger;

    static {
        AttachmentsVerifier attachmentsVerifier = new AttachmentsVerifier();
        INSTANCE = attachmentsVerifier;
        logger = AbstractC1772c1.m5382S(attachmentsVerifier, "Chat:AttachmentVerifier");
    }

    private AttachmentsVerifier() {
    }

    private final C2345k getLogger() {
        return (C2345k) logger.getValue();
    }

    public final AbstractC26205h verifyAttachments$stream_chat_android_client_release(AbstractC26205h result) {
        Object next;
        AbstractC22676k.m65750j(result, "result");
        Message message = (Message) result.m77816b();
        if (message != null) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger2.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g, logger2.m7231b(), "[verifyAttachments] #uploader; uploadedAttachments: " + message.getAttachments(), null);
            }
            Iterator<T> it = message.getAttachments().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Attachment attachment = (Attachment) next;
                if (attachment.getUpload() != null && attachment.getImageUrl() == null && attachment.getAssetUrl() == null) {
                    break;
                }
            }
            Attachment attachment2 = (Attachment) next;
            if (attachment2 != null) {
                C2345k logger3 = getLogger();
                InterfaceC2339e interfaceC2339eM7232c2 = logger3.m7232c();
                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger3.m7231b())) {
                    logger3.m7230a().log(enumC2341g2, logger3.m7231b(), "[verifyAttachments] #uploader; message(" + message.getId() + ") has corrupted attachment: " + attachment2, null);
                }
                return new C26203f(new C26198a("Message(" + message.getId() + ") contains corrupted attachment: " + attachment2));
            }
        }
        return result;
    }
}
