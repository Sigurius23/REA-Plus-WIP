package io.getstream.chat.android.p226ui.feature.messages.composer;

import android.view.View;
import android.widget.FrameLayout;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer;
import java.util.Iterator;
import p027b3.C2365d3;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000f\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"asContentContainer", "io/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;", "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;)Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerViewKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.MessageComposerViewKt$asContentContainer$1 */
    @Metadata(m65680d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001aH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u001b"}, m65681d2 = {"io/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;", "childCount", "", "center", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "getCenter", "()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "centerOverlap", "getCenterOverlap", "leading", "getLeading", "trailing", "getTrailing", "header", "getHeader", "footer", "getFooter", "asView", "Landroid/view/View;", "findViewByKey", "key", "", "getChildAt", "index", "iterator", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C196731 implements MessageComposerContentContainer {
        final /* synthetic */ StreamUiMessageComposerBinding $this_asContentContainer;
        private final int childCount = 6;

        public C196731(StreamUiMessageComposerBinding streamUiMessageComposerBinding) {
            this.$this_asContentContainer = streamUiMessageComposerBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MessageComposerContent getChildAt(int index) {
            if (index == 0) {
                return getCenter();
            }
            if (index == 1) {
                return getCenterOverlap();
            }
            if (index == 2) {
                return getLeading();
            }
            if (index == 3) {
                return getTrailing();
            }
            if (index == 4) {
                return getHeader();
            }
            if (index != 5) {
                return null;
            }
            return getFooter();
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final View asView() {
            View root = this.$this_asContentContainer.getRoot();
            AbstractC22676k.m65749i(root, "getRoot(...)");
            return root;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final View findViewByKey(String key) {
            AbstractC22676k.m65750j(key, "key");
            MessageComposerViewKt$asContentContainer$1$iterator$1 messageComposerViewKt$asContentContainer$1$iterator$1 = new MessageComposerViewKt$asContentContainer$1$iterator$1(this);
            while (messageComposerViewKt$asContentContainer$1$iterator$1.hasNext()) {
                View viewFindViewByKey = messageComposerViewKt$asContentContainer$1$iterator$1.next().findViewByKey(key);
                if (viewFindViewByKey != null) {
                    return viewFindViewByKey;
                }
            }
            return null;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final MessageComposerContent getCenter() {
            FrameLayout centerContent = this.$this_asContentContainer.centerContent;
            AbstractC22676k.m65749i(centerContent, "centerContent");
            Object objM122283s = AbstractC38176k.m122283s(new C2365d3(centerContent, 1));
            if (objM122283s instanceof MessageComposerContent) {
                return (MessageComposerContent) objM122283s;
            }
            return null;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final MessageComposerContent getCenterOverlap() {
            FrameLayout centerOverlapContent = this.$this_asContentContainer.centerOverlapContent;
            AbstractC22676k.m65749i(centerOverlapContent, "centerOverlapContent");
            Object objM122283s = AbstractC38176k.m122283s(new C2365d3(centerOverlapContent, 1));
            if (objM122283s instanceof MessageComposerContent) {
                return (MessageComposerContent) objM122283s;
            }
            return null;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final MessageComposerContent getFooter() {
            FrameLayout footerContent = this.$this_asContentContainer.footerContent;
            AbstractC22676k.m65749i(footerContent, "footerContent");
            Object objM122283s = AbstractC38176k.m122283s(new C2365d3(footerContent, 1));
            if (objM122283s instanceof MessageComposerContent) {
                return (MessageComposerContent) objM122283s;
            }
            return null;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final MessageComposerContent getHeader() {
            FrameLayout headerContent = this.$this_asContentContainer.headerContent;
            AbstractC22676k.m65749i(headerContent, "headerContent");
            Object objM122283s = AbstractC38176k.m122283s(new C2365d3(headerContent, 1));
            if (objM122283s instanceof MessageComposerContent) {
                return (MessageComposerContent) objM122283s;
            }
            return null;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final MessageComposerContent getLeading() {
            FrameLayout leadingContent = this.$this_asContentContainer.leadingContent;
            AbstractC22676k.m65749i(leadingContent, "leadingContent");
            Object objM122283s = AbstractC38176k.m122283s(new C2365d3(leadingContent, 1));
            if (objM122283s instanceof MessageComposerContent) {
                return (MessageComposerContent) objM122283s;
            }
            return null;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer
        public final MessageComposerContent getTrailing() {
            FrameLayout trailingContent = this.$this_asContentContainer.trailingContent;
            AbstractC22676k.m65749i(trailingContent, "trailingContent");
            Object objM122283s = AbstractC38176k.m122283s(new C2365d3(trailingContent, 1));
            if (objM122283s instanceof MessageComposerContent) {
                return (MessageComposerContent) objM122283s;
            }
            return null;
        }

        @Override // java.lang.Iterable
        public final Iterator<MessageComposerContent> iterator() {
            return new MessageComposerViewKt$asContentContainer$1$iterator$1(this);
        }
    }

    public static final C196731 access$asContentContainer(StreamUiMessageComposerBinding streamUiMessageComposerBinding) {
        return new C196731(streamUiMessageComposerBinding);
    }

    private static final C196731 asContentContainer(StreamUiMessageComposerBinding streamUiMessageComposerBinding) {
        return new C196731(streamUiMessageComposerBinding);
    }
}
