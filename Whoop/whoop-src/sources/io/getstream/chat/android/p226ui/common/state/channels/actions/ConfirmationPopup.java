package io.getstream.chat.android.p226ui.common.state.channels.actions;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;", "", "title", "", "message", "confirmButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getConfirmButtonText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConfirmationPopup {
    public static final int $stable = 0;
    private final String confirmButtonText;
    private final String message;
    private final String title;

    public ConfirmationPopup(String title, String message, String confirmButtonText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(confirmButtonText, "confirmButtonText");
        this.title = title;
        this.message = message;
        this.confirmButtonText = confirmButtonText;
    }

    public static /* synthetic */ ConfirmationPopup copy$default(ConfirmationPopup confirmationPopup, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = confirmationPopup.title;
        }
        if ((i13 & 2) != 0) {
            str2 = confirmationPopup.message;
        }
        if ((i13 & 4) != 0) {
            str3 = confirmationPopup.confirmButtonText;
        }
        return confirmationPopup.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final ConfirmationPopup copy(String title, String message, String confirmButtonText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(confirmButtonText, "confirmButtonText");
        return new ConfirmationPopup(title, message, confirmButtonText);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmationPopup)) {
            return false;
        }
        ConfirmationPopup confirmationPopup = (ConfirmationPopup) other;
        return AbstractC22676k.m65745e(this.title, confirmationPopup.title) && AbstractC22676k.m65745e(this.message, confirmationPopup.message) && AbstractC22676k.m65745e(this.confirmButtonText, confirmationPopup.confirmButtonText);
    }

    public final String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.confirmButtonText.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.confirmButtonText, ")", AbstractC11895b.m32001t("ConfirmationPopup(title=", this.title, ", message=", this.message, ", confirmButtonText="));
    }
}
