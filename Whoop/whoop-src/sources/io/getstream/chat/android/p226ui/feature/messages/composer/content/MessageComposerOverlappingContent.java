package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007R*\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006(À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "Lkotlin/Function0;", "Ll83/a0;", "getRecordButtonHoldListener", "()Lc93/a;", "setRecordButtonHoldListener", "(Lc93/a;)V", "recordButtonHoldListener", "getRecordButtonLockListener", "setRecordButtonLockListener", "recordButtonLockListener", "getRecordButtonCancelListener", "setRecordButtonCancelListener", "recordButtonCancelListener", "getRecordButtonReleaseListener", "setRecordButtonReleaseListener", "recordButtonReleaseListener", "getPlaybackButtonClickListener", "setPlaybackButtonClickListener", "playbackButtonClickListener", "getStopButtonClickListener", "setStopButtonClickListener", "stopButtonClickListener", "getDeleteButtonClickListener", "setDeleteButtonClickListener", "deleteButtonClickListener", "getCompleteButtonClickListener", "setCompleteButtonClickListener", "completeButtonClickListener", "Lkotlin/Function1;", "", "getSliderDragStartListener", "()Lkotlin/jvm/functions/Function1;", "setSliderDragStartListener", "(Lkotlin/jvm/functions/Function1;)V", "sliderDragStartListener", "getSliderDragStopListener", "setSliderDragStopListener", "sliderDragStopListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageComposerOverlappingContent extends MessageComposerContent {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static View findViewByKey(MessageComposerOverlappingContent messageComposerOverlappingContent, String key) {
            AbstractC22676k.m65750j(key, "key");
            MessageComposerOverlappingContent.access$findViewByKey$jd(messageComposerOverlappingContent, key);
            return null;
        }
    }

    static /* synthetic */ View access$findViewByKey$jd(MessageComposerOverlappingContent messageComposerOverlappingContent, String str) {
        super.findViewByKey(str);
        return null;
    }

    InterfaceC4339a getCompleteButtonClickListener();

    InterfaceC4339a getDeleteButtonClickListener();

    InterfaceC4339a getPlaybackButtonClickListener();

    InterfaceC4339a getRecordButtonCancelListener();

    InterfaceC4339a getRecordButtonHoldListener();

    InterfaceC4339a getRecordButtonLockListener();

    InterfaceC4339a getRecordButtonReleaseListener();

    Function1 getSliderDragStartListener();

    Function1 getSliderDragStopListener();

    InterfaceC4339a getStopButtonClickListener();

    void setCompleteButtonClickListener(InterfaceC4339a interfaceC4339a);

    void setDeleteButtonClickListener(InterfaceC4339a interfaceC4339a);

    void setPlaybackButtonClickListener(InterfaceC4339a interfaceC4339a);

    void setRecordButtonCancelListener(InterfaceC4339a interfaceC4339a);

    void setRecordButtonHoldListener(InterfaceC4339a interfaceC4339a);

    void setRecordButtonLockListener(InterfaceC4339a interfaceC4339a);

    void setRecordButtonReleaseListener(InterfaceC4339a interfaceC4339a);

    void setSliderDragStartListener(Function1 function1);

    void setSliderDragStopListener(Function1 function1);

    void setStopButtonClickListener(InterfaceC4339a interfaceC4339a);
}
