package io.getstream.chat.android.models;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/models/ModerationAction;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ModerationAction {
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ModerationAction bounce = new ModerationAction("bounce");
    private static final ModerationAction remove = new ModerationAction("remove");
    private static final ModerationAction flag = new ModerationAction("flag");

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/models/ModerationAction$Companion;", "", "<init>", "()V", "bounce", "Lio/getstream/chat/android/models/ModerationAction;", "getBounce", "()Lio/getstream/chat/android/models/ModerationAction;", "remove", "getRemove", "flag", "getFlag", "fromValue", "value", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ModerationAction fromValue(String value) {
            AbstractC22676k.m65750j(value, "value");
            if (value.equals(getBounce().getValue())) {
                return getBounce();
            }
            if (value.equals(getRemove().getValue())) {
                return getRemove();
            }
            return value.equals(getFlag().getValue()) ? getFlag() : new ModerationAction(value);
        }

        public final ModerationAction getBounce() {
            return ModerationAction.bounce;
        }

        public final ModerationAction getFlag() {
            return ModerationAction.flag;
        }

        public final ModerationAction getRemove() {
            return ModerationAction.remove;
        }

        private Companion() {
        }
    }

    public ModerationAction(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.value = value;
    }

    public static /* synthetic */ ModerationAction copy$default(ModerationAction moderationAction, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = moderationAction.value;
        }
        return moderationAction.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final ModerationAction copy(String value) {
        AbstractC22676k.m65750j(value, "value");
        return new ModerationAction(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ModerationAction) && AbstractC22676k.m65745e(this.value, ((ModerationAction) other).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("ModerationAction(value=", this.value, ")");
    }
}
