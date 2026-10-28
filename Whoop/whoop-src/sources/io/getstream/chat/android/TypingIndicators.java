package io.getstream.chat.android;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/TypingIndicators;", "", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TypingIndicators {
    private final boolean enabled;

    public TypingIndicators() {
        this(false, 1, null);
    }

    public static TypingIndicators copy$default(TypingIndicators typingIndicators, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = typingIndicators.enabled;
        }
        typingIndicators.getClass();
        return new TypingIndicators(z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final TypingIndicators copy(boolean enabled) {
        return new TypingIndicators(enabled);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TypingIndicators) && this.enabled == ((TypingIndicators) other).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("TypingIndicators(enabled=", ")", this.enabled);
    }

    public TypingIndicators(boolean z4) {
        this.enabled = z4;
    }

    public /* synthetic */ TypingIndicators(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4);
    }
}
