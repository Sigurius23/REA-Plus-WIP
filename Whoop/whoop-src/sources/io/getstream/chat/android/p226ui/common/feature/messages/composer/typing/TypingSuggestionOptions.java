package io.getstream.chat.android.p226ui.common.feature.messages.composer.typing;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;", "", "symbol", "", "shouldTriggerOnlyAtStart", "", "minimumRequiredCharacters", "", "<init>", "(Ljava/lang/String;ZI)V", "getSymbol", "()Ljava/lang/String;", "getShouldTriggerOnlyAtStart", "()Z", "getMinimumRequiredCharacters", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TypingSuggestionOptions {
    public static final int $stable = 0;
    private final int minimumRequiredCharacters;
    private final boolean shouldTriggerOnlyAtStart;
    private final String symbol;

    public TypingSuggestionOptions(String symbol, boolean z4, int i13) {
        AbstractC22676k.m65750j(symbol, "symbol");
        this.symbol = symbol;
        this.shouldTriggerOnlyAtStart = z4;
        this.minimumRequiredCharacters = i13;
    }

    public static /* synthetic */ TypingSuggestionOptions copy$default(TypingSuggestionOptions typingSuggestionOptions, String str, boolean z4, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = typingSuggestionOptions.symbol;
        }
        if ((i14 & 2) != 0) {
            z4 = typingSuggestionOptions.shouldTriggerOnlyAtStart;
        }
        if ((i14 & 4) != 0) {
            i13 = typingSuggestionOptions.minimumRequiredCharacters;
        }
        return typingSuggestionOptions.copy(str, z4, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldTriggerOnlyAtStart() {
        return this.shouldTriggerOnlyAtStart;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinimumRequiredCharacters() {
        return this.minimumRequiredCharacters;
    }

    public final TypingSuggestionOptions copy(String symbol, boolean shouldTriggerOnlyAtStart, int minimumRequiredCharacters) {
        AbstractC22676k.m65750j(symbol, "symbol");
        return new TypingSuggestionOptions(symbol, shouldTriggerOnlyAtStart, minimumRequiredCharacters);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingSuggestionOptions)) {
            return false;
        }
        TypingSuggestionOptions typingSuggestionOptions = (TypingSuggestionOptions) other;
        return AbstractC22676k.m65745e(this.symbol, typingSuggestionOptions.symbol) && this.shouldTriggerOnlyAtStart == typingSuggestionOptions.shouldTriggerOnlyAtStart && this.minimumRequiredCharacters == typingSuggestionOptions.minimumRequiredCharacters;
    }

    public final int getMinimumRequiredCharacters() {
        return this.minimumRequiredCharacters;
    }

    public final boolean getShouldTriggerOnlyAtStart() {
        return this.shouldTriggerOnlyAtStart;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minimumRequiredCharacters) + AbstractC2875y.m8289b(this.symbol.hashCode() * 31, 31, this.shouldTriggerOnlyAtStart);
    }

    public final String toString() {
        String str = this.symbol;
        boolean z4 = this.shouldTriggerOnlyAtStart;
        return AbstractC18489d0.m53371l(AbstractC25012a.m73379l("TypingSuggestionOptions(symbol=", str, ", shouldTriggerOnlyAtStart=", ", minimumRequiredCharacters=", z4), this.minimumRequiredCharacters, ")");
    }

    public /* synthetic */ TypingSuggestionOptions(String str, boolean z4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? 0 : i13);
    }
}
