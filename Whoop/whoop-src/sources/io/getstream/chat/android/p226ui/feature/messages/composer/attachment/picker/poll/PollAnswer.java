package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "", "id", "", "text", "", "duplicateError", "", "<init>", "(ILjava/lang/String;Z)V", "getId", "()I", "getText", "()Ljava/lang/String;", "getDuplicateError", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollAnswer {
    private final boolean duplicateError;
    private final int id;
    private final String text;

    public PollAnswer(int i13, String text, boolean z4) {
        AbstractC22676k.m65750j(text, "text");
        this.id = i13;
        this.text = text;
        this.duplicateError = z4;
    }

    public static /* synthetic */ PollAnswer copy$default(PollAnswer pollAnswer, int i13, String str, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = pollAnswer.id;
        }
        if ((i14 & 2) != 0) {
            str = pollAnswer.text;
        }
        if ((i14 & 4) != 0) {
            z4 = pollAnswer.duplicateError;
        }
        return pollAnswer.copy(i13, str, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDuplicateError() {
        return this.duplicateError;
    }

    public final PollAnswer copy(int id4, String text, boolean duplicateError) {
        AbstractC22676k.m65750j(text, "text");
        return new PollAnswer(id4, text, duplicateError);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollAnswer)) {
            return false;
        }
        PollAnswer pollAnswer = (PollAnswer) other;
        return this.id == pollAnswer.id && AbstractC22676k.m65745e(this.text, pollAnswer.text) && this.duplicateError == pollAnswer.duplicateError;
    }

    public final boolean getDuplicateError() {
        return this.duplicateError;
    }

    public final int getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.duplicateError) + AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.text);
    }

    public final String toString() {
        int i13 = this.id;
        String str = this.text;
        return AbstractC18489d0.m53372m(AbstractC18489d0.m53373n(i13, "PollAnswer(id=", ", text=", str, ", duplicateError="), this.duplicateError, ")");
    }
}
