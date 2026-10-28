package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "Lkotlin/Function0;", "Ll83/a0;", "getAttachmentsButtonClickListener", "()Lc93/a;", "setAttachmentsButtonClickListener", "(Lc93/a;)V", "attachmentsButtonClickListener", "getCommandsButtonClickListener", "setCommandsButtonClickListener", "commandsButtonClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageComposerLeadingContent extends MessageComposerContent {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static View findViewByKey(MessageComposerLeadingContent messageComposerLeadingContent, String key) {
            AbstractC22676k.m65750j(key, "key");
            MessageComposerLeadingContent.access$findViewByKey$jd(messageComposerLeadingContent, key);
            return null;
        }
    }

    static /* synthetic */ View access$findViewByKey$jd(MessageComposerLeadingContent messageComposerLeadingContent, String str) {
        super.findViewByKey(str);
        return null;
    }

    InterfaceC4339a getAttachmentsButtonClickListener();

    InterfaceC4339a getCommandsButtonClickListener();

    void setAttachmentsButtonClickListener(InterfaceC4339a interfaceC4339a);

    void setCommandsButtonClickListener(InterfaceC4339a interfaceC4339a);
}
