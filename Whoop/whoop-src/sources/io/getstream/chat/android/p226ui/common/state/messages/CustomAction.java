package io.getstream.chat.android.p226ui.common.state.messages;

import io.getstream.chat.android.models.Message;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/CustomAction;", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "message", "Lio/getstream/chat/android/models/Message;", "extraProperties", "", "", "", "<init>", "(Lio/getstream/chat/android/models/Message;Ljava/util/Map;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getExtraProperties", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CustomAction extends MessageAction {
    public static final int $stable = 8;
    private final Map<String, Object> extraProperties;
    private final Message message;

    public CustomAction(Message message, Map<String, ? extends Object> extraProperties) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(extraProperties, "extraProperties");
        this.message = message;
        this.extraProperties = extraProperties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomAction copy$default(CustomAction customAction, Message message, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            message = customAction.message;
        }
        if ((i13 & 2) != 0) {
            map = customAction.extraProperties;
        }
        return customAction.copy(message, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    public final Map<String, Object> component2() {
        return this.extraProperties;
    }

    public final CustomAction copy(Message message, Map<String, ? extends Object> extraProperties) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(extraProperties, "extraProperties");
        return new CustomAction(message, extraProperties);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAction)) {
            return false;
        }
        CustomAction customAction = (CustomAction) other;
        return AbstractC22676k.m65745e(this.message, customAction.message) && AbstractC22676k.m65745e(this.extraProperties, customAction.extraProperties);
    }

    public final Map<String, Object> getExtraProperties() {
        return this.extraProperties;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.messages.MessageAction
    public final Message getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.extraProperties.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAction(message=" + this.message + ", extraProperties=" + this.extraProperties + ")";
    }

    public /* synthetic */ CustomAction(Message message, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(message, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
