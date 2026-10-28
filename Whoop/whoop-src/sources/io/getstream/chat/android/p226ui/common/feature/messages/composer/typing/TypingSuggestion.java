package io.getstream.chat.android.p226ui.common.feature.messages.composer.typing;

import i93.C18284j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;", "", "", "text", "Li93/j;", "locationRange", "<init>", "(Ljava/lang/String;Li93/j;)V", "component1", "()Ljava/lang/String;", "component2", "()Li93/j;", "copy", "(Ljava/lang/String;Li93/j;)Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Li93/j;", "getLocationRange", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TypingSuggestion {
    public static final int $stable = 8;
    private final C18284j locationRange;
    private final String text;

    public TypingSuggestion(String text, C18284j locationRange) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(locationRange, "locationRange");
        this.text = text;
        this.locationRange = locationRange;
    }

    public static /* synthetic */ TypingSuggestion copy$default(TypingSuggestion typingSuggestion, String str, C18284j c18284j, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = typingSuggestion.text;
        }
        if ((i13 & 2) != 0) {
            c18284j = typingSuggestion.locationRange;
        }
        return typingSuggestion.copy(str, c18284j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C18284j getLocationRange() {
        return this.locationRange;
    }

    public final TypingSuggestion copy(String text, C18284j locationRange) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(locationRange, "locationRange");
        return new TypingSuggestion(text, locationRange);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingSuggestion)) {
            return false;
        }
        TypingSuggestion typingSuggestion = (TypingSuggestion) other;
        return AbstractC22676k.m65745e(this.text, typingSuggestion.text) && AbstractC22676k.m65745e(this.locationRange, typingSuggestion.locationRange);
    }

    public final C18284j getLocationRange() {
        return this.locationRange;
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.locationRange.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "TypingSuggestion(text=" + this.text + ", locationRange=" + this.locationRange + ")";
    }
}
