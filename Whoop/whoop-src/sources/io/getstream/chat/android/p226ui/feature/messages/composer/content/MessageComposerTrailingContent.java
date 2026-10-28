package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "Lkotlin/Function0;", "Ll83/a0;", "getSendMessageButtonClickListener", "()Lc93/a;", "setSendMessageButtonClickListener", "(Lc93/a;)V", "sendMessageButtonClickListener", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "getRecordAudioButtonTouchListener", "()Lkotlin/jvm/functions/Function1;", "setRecordAudioButtonTouchListener", "(Lkotlin/jvm/functions/Function1;)V", "recordAudioButtonTouchListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageComposerTrailingContent extends MessageComposerContent {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static View findViewByKey(MessageComposerTrailingContent messageComposerTrailingContent, String key) {
            AbstractC22676k.m65750j(key, "key");
            MessageComposerTrailingContent.access$findViewByKey$jd(messageComposerTrailingContent, key);
            return null;
        }
    }

    static /* synthetic */ View access$findViewByKey$jd(MessageComposerTrailingContent messageComposerTrailingContent, String str) {
        super.findViewByKey(str);
        return null;
    }

    Function1 getRecordAudioButtonTouchListener();

    InterfaceC4339a getSendMessageButtonClickListener();

    void setRecordAudioButtonTouchListener(Function1 function1);

    void setSendMessageButtonClickListener(InterfaceC4339a interfaceC4339a);
}
