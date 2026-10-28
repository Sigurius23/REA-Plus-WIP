package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "Lkotlin/Function1;", "", "Ll83/a0;", "getTextInputChangeListener", "()Lkotlin/jvm/functions/Function1;", "setTextInputChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "textInputChangeListener", "Lio/getstream/chat/android/models/Attachment;", "getAttachmentRemovalListener", "setAttachmentRemovalListener", "attachmentRemovalListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageComposerCenterContent extends MessageComposerContent {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static View findViewByKey(MessageComposerCenterContent messageComposerCenterContent, String key) {
            AbstractC22676k.m65750j(key, "key");
            MessageComposerCenterContent.access$findViewByKey$jd(messageComposerCenterContent, key);
            return null;
        }
    }

    static /* synthetic */ View access$findViewByKey$jd(MessageComposerCenterContent messageComposerCenterContent, String str) {
        super.findViewByKey(str);
        return null;
    }

    Function1 getAttachmentRemovalListener();

    Function1 getTextInputChangeListener();

    void setAttachmentRemovalListener(Function1 function1);

    void setTextInputChangeListener(Function1 function1);
}
