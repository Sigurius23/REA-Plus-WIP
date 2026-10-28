package io.getstream.chat.android.p226ui.feature.messages.list;

import io.getstream.chat.android.p226ui.helper.ViewStyle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "T", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "own", "theirs", "<init>", "(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)V", "getOwn", "()Lio/getstream/chat/android/ui/helper/ViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "getTheirs", "component1", "component2", "copy", "(Lio/getstream/chat/android/ui/helper/ViewStyle;Lio/getstream/chat/android/ui/helper/ViewStyle;)Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageViewStyle<T extends ViewStyle> implements ViewStyle {
    private final T own;
    private final T theirs;

    public MessageViewStyle(T t14, T t15) {
        this.own = t14;
        this.theirs = t15;
    }

    public static MessageViewStyle copy$default(MessageViewStyle messageViewStyle, ViewStyle viewStyle, ViewStyle viewStyle2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            viewStyle = messageViewStyle.own;
        }
        if ((i13 & 2) != 0) {
            viewStyle2 = messageViewStyle.theirs;
        }
        messageViewStyle.getClass();
        return new MessageViewStyle(viewStyle, viewStyle2);
    }

    public final T component1() {
        return this.own;
    }

    public final T component2() {
        return this.theirs;
    }

    public final MessageViewStyle<T> copy(T own, T theirs) {
        return new MessageViewStyle<>(own, theirs);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageViewStyle)) {
            return false;
        }
        MessageViewStyle messageViewStyle = (MessageViewStyle) other;
        return AbstractC22676k.m65745e(this.own, messageViewStyle.own) && AbstractC22676k.m65745e(this.theirs, messageViewStyle.theirs);
    }

    public final T getOwn() {
        return this.own;
    }

    public final T getTheirs() {
        return this.theirs;
    }

    public final int hashCode() {
        T t14 = this.own;
        int iHashCode = (t14 == null ? 0 : t14.hashCode()) * 31;
        T t15 = this.theirs;
        return iHashCode + (t15 != null ? t15.hashCode() : 0);
    }

    public final String toString() {
        return "MessageViewStyle(own=" + this.own + ", theirs=" + this.theirs + ")";
    }
}
