package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"asView", "Landroid/view/View;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final View asView(MessageComposerContent messageComposerContent) {
        AbstractC22676k.m65750j(messageComposerContent, "<this>");
        if (messageComposerContent instanceof View) {
            return (View) messageComposerContent;
        }
        return null;
    }
}
