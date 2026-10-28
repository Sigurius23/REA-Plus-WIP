package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "Ll83/a0;", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "", "key", "Landroid/view/View;", "findViewByKey", "(Ljava/lang/String;)Landroid/view/View;", "PredefinedKeys", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageComposerContent {

    /* JADX INFO: renamed from: PredefinedKeys, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String RECORD_AUDIO_BUTTON = "record_audio_button";

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static View findViewByKey(MessageComposerContent messageComposerContent, String key) {
            AbstractC22676k.m65750j(key, "key");
            MessageComposerContent.access$findViewByKey$jd(messageComposerContent, key);
            return null;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.content.MessageComposerContent$PredefinedKeys, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent$PredefinedKeys;", "", "<init>", "()V", "RECORD_AUDIO_BUTTON", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String RECORD_AUDIO_BUTTON = "record_audio_button";

        private Companion() {
        }
    }

    static /* synthetic */ View access$findViewByKey$jd(MessageComposerContent messageComposerContent, String str) {
        super.findViewByKey(str);
        return null;
    }

    void attachContext(MessageComposerContext messageComposerContext);

    default View findViewByKey(String key) {
        AbstractC22676k.m65750j(key, "key");
        return null;
    }

    void renderState(MessageComposerState state);
}
