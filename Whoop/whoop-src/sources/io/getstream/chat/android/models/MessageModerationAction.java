package io.getstream.chat.android.models;

import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25260n;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/models/MessageModerationAction;", "", "rawValue", "", "<init>", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageModerationAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MessageModerationAction block;
    private static final MessageModerationAction bounce;
    private static final MessageModerationAction flag;
    private static final Set<MessageModerationAction> values;
    private final String rawValue;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/models/MessageModerationAction$Companion;", "", "<init>", "()V", "bounce", "Lio/getstream/chat/android/models/MessageModerationAction;", "getBounce", "()Lio/getstream/chat/android/models/MessageModerationAction;", "flag", "getFlag", "block", "getBlock", "values", "", "getValues", "()Ljava/util/Set;", "fromRawValue", "rawValue", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MessageModerationAction fromRawValue(String rawValue) {
            Object next;
            AbstractC22676k.m65750j(rawValue, "rawValue");
            Iterator<T> it = getValues().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((MessageModerationAction) next).getRawValue(), rawValue));
            MessageModerationAction messageModerationAction = (MessageModerationAction) next;
            return messageModerationAction == null ? new MessageModerationAction(rawValue) : messageModerationAction;
        }

        public final MessageModerationAction getBlock() {
            return MessageModerationAction.block;
        }

        public final MessageModerationAction getBounce() {
            return MessageModerationAction.bounce;
        }

        public final MessageModerationAction getFlag() {
            return MessageModerationAction.flag;
        }

        public final Set<MessageModerationAction> getValues() {
            return MessageModerationAction.values;
        }

        private Companion() {
        }
    }

    static {
        MessageModerationAction messageModerationAction = new MessageModerationAction("MESSAGE_RESPONSE_ACTION_BOUNCE");
        bounce = messageModerationAction;
        MessageModerationAction messageModerationAction2 = new MessageModerationAction("MESSAGE_RESPONSE_ACTION_FLAG");
        flag = messageModerationAction2;
        MessageModerationAction messageModerationAction3 = new MessageModerationAction("MESSAGE_RESPONSE_ACTION_BLOCK");
        block = messageModerationAction3;
        values = AbstractC25260n.m74059b1(new MessageModerationAction[]{messageModerationAction, messageModerationAction2, messageModerationAction3});
    }

    public MessageModerationAction(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        this.rawValue = rawValue;
    }

    public static /* synthetic */ MessageModerationAction copy$default(MessageModerationAction messageModerationAction, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageModerationAction.rawValue;
        }
        return messageModerationAction.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }

    public final MessageModerationAction copy(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        return new MessageModerationAction(rawValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageModerationAction) && AbstractC22676k.m65745e(this.rawValue, ((MessageModerationAction) other).rawValue);
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public int hashCode() {
        return this.rawValue.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("MessageModerationAction(rawValue=", this.rawValue, ")");
    }
}
