package io.getstream.chat.android.client.attachment;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.models.Message;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003R.\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;", "", "<init>", "()V", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "updateMessageAttachments", "(Lio/getstream/chat/android/models/Message;)V", "", "messageId", "Lec3/l;", "", "Lio/getstream/chat/android/models/Attachment;", "observeAttachments", "(Ljava/lang/String;)Lec3/l;", "removeMessageAttachmentsState", "(Ljava/lang/String;)V", "clearStates", "", "Lec3/p1;", "messagesStates", "Ljava/util/Map;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsUploadStates {
    public static final AttachmentsUploadStates INSTANCE = new AttachmentsUploadStates();
    private static Map<String, ? extends InterfaceC13075p1> messagesStates = C25272z.f99163w;

    private AttachmentsUploadStates() {
    }

    public final void clearStates() {
        synchronized (this) {
            messagesStates = C25272z.f99163w;
        }
    }

    public final InterfaceC13058l observeAttachments(String messageId) {
        InterfaceC13058l interfaceC13058l;
        AbstractC22676k.m65750j(messageId, "messageId");
        synchronized (this) {
            try {
                InterfaceC13058l interfaceC13058lM36593c = messagesStates.get(messageId);
                if (interfaceC13058lM36593c == null) {
                    interfaceC13058lM36593c = AbstractC13091v.m36593c(C25271y.f99162w);
                }
                interfaceC13058l = interfaceC13058lM36593c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC13058l;
    }

    public final void removeMessageAttachmentsState(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        synchronized (this) {
            messagesStates = AbstractC25247g0.m73991Z(messageId, messagesStates);
        }
    }

    public final void updateMessageAttachments(Message message) {
        AbstractC22676k.m65750j(message, "message");
        synchronized (this) {
            try {
                InterfaceC13075p1 interfaceC13075p1M36593c = messagesStates.get(message.getId());
                if (interfaceC13075p1M36593c == null) {
                    interfaceC13075p1M36593c = AbstractC13091v.m36593c(message.getAttachments());
                }
                InterfaceC13075p1 interfaceC13075p1 = interfaceC13075p1M36593c;
                ((C13045h2) interfaceC13075p1).m36570j(message.getAttachments());
                messagesStates = AbstractC25247g0.m73996e0(messagesStates, new C23465k(message.getId(), interfaceC13075p1));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
