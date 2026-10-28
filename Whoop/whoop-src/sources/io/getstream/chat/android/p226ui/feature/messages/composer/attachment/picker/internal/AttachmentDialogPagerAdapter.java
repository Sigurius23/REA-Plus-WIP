package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.internal;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.viewpager2.adapter.AbstractC1861i;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/internal/AttachmentDialogPagerAdapter;", "Landroidx/viewpager2/adapter/i;", "Landroidx/fragment/app/m0;", "fragment", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;", "attachmentsPickerTabFactories", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "attachmentsPickerTabListener", "<init>", "(Landroidx/fragment/app/m0;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;)V", "", "position", "createFragment", "(I)Landroidx/fragment/app/m0;", "getItemCount", "()I", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Ljava/util/List;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentDialogPagerAdapter extends AbstractC1861i {
    private final List<AttachmentsPickerTabFactory> attachmentsPickerTabFactories;
    private final AttachmentsPickerTabListener attachmentsPickerTabListener;
    private final AttachmentsPickerDialogStyle style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentDialogPagerAdapter(AbstractComponentCallbacksC1320m0 fragment, AttachmentsPickerDialogStyle style, List<? extends AttachmentsPickerTabFactory> attachmentsPickerTabFactories, AttachmentsPickerTabListener attachmentsPickerTabListener) {
        super(fragment);
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(attachmentsPickerTabFactories, "attachmentsPickerTabFactories");
        AbstractC22676k.m65750j(attachmentsPickerTabListener, "attachmentsPickerTabListener");
        this.style = style;
        this.attachmentsPickerTabFactories = attachmentsPickerTabFactories;
        this.attachmentsPickerTabListener = attachmentsPickerTabListener;
    }

    @Override // androidx.viewpager2.adapter.AbstractC1861i
    public final AbstractComponentCallbacksC1320m0 createFragment(int position) {
        if (position < this.attachmentsPickerTabFactories.size()) {
            return this.attachmentsPickerTabFactories.get(position).createTabFragment(this.style, this.attachmentsPickerTabListener);
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(position, "Can not create page for position "));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        return this.attachmentsPickerTabFactories.size();
    }
}
