package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import b30.ViewOnClickListenerC2558k3;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.common.utils.MediaStringUtil;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemAttachmentFileBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.AttachmentUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;", "Landroidx/recyclerview/widget/i1;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "Ll83/a0;", "onAttachmentSelected", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lkotlin/jvm/functions/Function1;)V", "attachment", "", "isSelected", "toggleSelection", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V", "holder", "", "position", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;I)V", "getItemCount", "()I", "selectAttachment", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "deselectAttachment", "", "attachments", "setAttachments", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "FileAttachmentViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FileAttachmentAdapter extends AbstractC1692i1 {
    private List<AttachmentMetaData> attachments;
    private final Function1 onAttachmentSelected;
    private final AttachmentsPickerDialogStyle style;

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentFileBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "Ll83/a0;", "onAttachmentClick", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentFileBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V", "", "selected", "Landroid/graphics/drawable/Drawable;", "getSelectionIndicatorBackground", "(ZLio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Landroid/graphics/drawable/Drawable;", "attachment", "bind", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentFileBinding;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "getAttachment", "()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "setAttachment", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class FileAttachmentViewHolder extends AbstractC1717o2 {
        public AttachmentMetaData attachment;
        private final StreamUiItemAttachmentFileBinding binding;
        private final Function1 onAttachmentClick;
        private final AttachmentsPickerDialogStyle style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileAttachmentViewHolder(StreamUiItemAttachmentFileBinding binding, Function1 onAttachmentClick, AttachmentsPickerDialogStyle style) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(onAttachmentClick, "onAttachmentClick");
            AbstractC22676k.m65750j(style, "style");
            this.binding = binding;
            this.onAttachmentClick = onAttachmentClick;
            this.style = style;
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC2558k3(this, 16));
            binding.selectionIndicator.setTextColor(style.getFileAttachmentItemCheckboxTextColor());
            TextView fileNameTextView = binding.fileNameTextView;
            AbstractC22676k.m65749i(fileNameTextView, "fileNameTextView");
            TextStyleKt.setTextStyle(fileNameTextView, style.getFileAttachmentItemNameTextStyle());
            TextView fileSizeTextView = binding.fileSizeTextView;
            AbstractC22676k.m65749i(fileSizeTextView, "fileSizeTextView");
            TextStyleKt.setTextStyle(fileSizeTextView, style.getFileAttachmentItemSizeTextStyle());
        }

        /* JADX INFO: renamed from: a */
        public static void m55247a(FileAttachmentViewHolder fileAttachmentViewHolder, View view) {
            fileAttachmentViewHolder.onAttachmentClick.invoke(fileAttachmentViewHolder.getAttachment());
        }

        private final Drawable getSelectionIndicatorBackground(boolean selected, AttachmentsPickerDialogStyle style) {
            return selected ? style.getFileAttachmentItemCheckboxSelectedDrawable() : style.getFileAttachmentItemCheckboxDeselectedDrawable();
        }

        public final void bind(AttachmentMetaData attachment) {
            String string;
            AbstractC22676k.m65750j(attachment, "attachment");
            this.attachment = attachment;
            ImageView fileTypeImageView = this.binding.fileTypeImageView;
            AbstractC22676k.m65749i(fileTypeImageView, "fileTypeImageView");
            AttachmentUtilsKt.loadAttachmentThumb(fileTypeImageView, attachment);
            this.binding.fileNameTextView.setText(attachment.getTitle());
            this.binding.fileSizeTextView.setText(MediaStringUtil.convertFileSizeByteCount(attachment.getSize()));
            this.binding.selectionIndicator.setBackground(getSelectionIndicatorBackground(attachment.getIsSelected(), this.style));
            this.binding.selectionIndicator.setChecked(attachment.getIsSelected());
            CheckedTextView checkedTextView = this.binding.selectionIndicator;
            Integer numValueOf = Integer.valueOf(attachment.getSelectedPosition());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf == null || (string = numValueOf.toString()) == null) {
                string = "";
            }
            checkedTextView.setText(string);
        }

        public final AttachmentMetaData getAttachment() {
            AttachmentMetaData attachmentMetaData = this.attachment;
            if (attachmentMetaData != null) {
                return attachmentMetaData;
            }
            AbstractC22676k.m65757q("attachment");
            throw null;
        }

        public final void setAttachment(AttachmentMetaData attachmentMetaData) {
            AbstractC22676k.m65750j(attachmentMetaData, "<set-?>");
            this.attachment = attachmentMetaData;
        }
    }

    public FileAttachmentAdapter(AttachmentsPickerDialogStyle style, Function1 onAttachmentSelected) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(onAttachmentSelected, "onAttachmentSelected");
        this.style = style;
        this.onAttachmentSelected = onAttachmentSelected;
        this.attachments = C25271y.f99162w;
    }

    private final void toggleSelection(AttachmentMetaData attachment, boolean isSelected) {
        int iIndexOf = this.attachments.indexOf(attachment);
        if (iIndexOf != -1) {
            this.attachments.get(iIndexOf).setSelected(isSelected);
            int i13 = 0;
            if (isSelected) {
                AttachmentMetaData attachmentMetaData = this.attachments.get(iIndexOf);
                List<AttachmentMetaData> list = this.attachments;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((AttachmentMetaData) it.next()).getIsSelected() && (i13 = i13 + 1) < 0) {
                            AbstractC37056f.m118976c0();
                            throw null;
                        }
                    }
                }
                attachmentMetaData.setSelectedPosition(i13);
                notifyItemChanged(iIndexOf);
                return;
            }
            int selectedPosition = this.attachments.get(iIndexOf).getSelectedPosition();
            this.attachments.get(iIndexOf).setSelectedPosition(0);
            List<AttachmentMetaData> list2 = this.attachments;
            ArrayList<AttachmentMetaData> arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((AttachmentMetaData) obj).getSelectedPosition() > selectedPosition) {
                    arrayList.add(obj);
                }
            }
            for (AttachmentMetaData attachmentMetaData2 : arrayList) {
                attachmentMetaData2.setSelectedPosition(attachmentMetaData2.getSelectedPosition() - 1);
            }
            notifyDataSetChanged();
        }
    }

    public final void deselectAttachment(AttachmentMetaData attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        toggleSelection(attachment, false);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        return this.attachments.size();
    }

    public final void selectAttachment(AttachmentMetaData attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        toggleSelection(attachment, true);
    }

    public final void setAttachments(List<AttachmentMetaData> attachments) {
        AbstractC22676k.m65750j(attachments, "attachments");
        this.attachments = attachments;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(FileAttachmentViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.bind(this.attachments.get(position));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final FileAttachmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new FileAttachmentViewHolder(StreamUiItemAttachmentFileBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.onAttachmentSelected, this.style);
    }
}
