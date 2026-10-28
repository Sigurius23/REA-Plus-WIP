package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.utils.MediaStringUtil;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemFileAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.FileAttachmentViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.background.ShapeAppearanceModelFactory;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.AttachmentUtilsKt;
import java.io.File;
import kr.C22782a;
import kr.C22786e;
import kr.C22788g;
import kr.C22792k;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;", "binding", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "attachmentLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;", "attachmentDownloadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V", "Ll83/a0;", "setupBackground", "()V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "subscribeForProgressIfNeeded", "(Lio/getstream/chat/android/models/Attachment;)V", "Landroid/widget/TextView;", "fileSizeView", "", "bytesRead", "totalBytes", "handleInProgressAttachment", "(Landroid/widget/TextView;JJ)V", "clearScope", "restartJob", "item", "bind", "unbind", "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/models/Attachment;", "Lbc3/c0;", "scope", "Lbc3/c0;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class GeneralFileAttachmentViewHolder extends FileAttachmentViewHolder {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f74616a = 0;
    private Attachment attachment;
    private final StreamUiItemFileAttachmentBinding binding;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private InterfaceC2994c0 scope;
    private final FileAttachmentViewStyle style;

    /* JADX WARN: Illegal instructions before constructor call */
    public GeneralFileAttachmentViewHolder(StreamUiItemFileAttachmentBinding binding, AttachmentClickListener attachmentClickListener, AttachmentLongClickListener attachmentLongClickListener, AttachmentDownloadClickListener attachmentDownloadClickListener, FileAttachmentViewStyle style) {
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(style, "style");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        this.style = style;
        this.logger = AbstractC1772c1.m5382S(this, "FileAttachmentVH");
        if (attachmentClickListener != null) {
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC19771b(1, this, attachmentClickListener));
        }
        if (attachmentLongClickListener != null) {
            binding.getRoot().setOnLongClickListener(new ViewOnLongClickListenerC19780k(attachmentLongClickListener, 0));
        }
        if (attachmentDownloadClickListener != null) {
            binding.actionButton.setOnClickListener(new ViewOnClickListenerC19771b(2, this, attachmentDownloadClickListener));
        }
        binding.getRoot().setBackground(ShapeAppearanceModelFactory.INSTANCE.fileBackground(getContext()));
    }

    /* JADX INFO: renamed from: a */
    public static void m55493a(GeneralFileAttachmentViewHolder generalFileAttachmentViewHolder, AttachmentClickListener attachmentClickListener, View view) {
        Attachment attachment = generalFileAttachmentViewHolder.attachment;
        if (attachment != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void handleInProgressAttachment(TextView fileSizeView, long bytesRead, long totalBytes) {
        fileSizeView.setText(getContext().getString(C19469R.string.stream_ui_message_list_attachment_upload_progress, MediaStringUtil.convertFileSizeByteCount(bytesRead), MediaStringUtil.convertFileSizeByteCount(totalBytes)));
    }

    private static final void lambda$1$lambda$0(GeneralFileAttachmentViewHolder generalFileAttachmentViewHolder, AttachmentClickListener attachmentClickListener, View view) {
        Attachment attachment = generalFileAttachmentViewHolder.attachment;
        if (attachment != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private static final boolean lambda$3$lambda$2(AttachmentLongClickListener attachmentLongClickListener, View view) {
        attachmentLongClickListener.onAttachmentLongClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(GeneralFileAttachmentViewHolder generalFileAttachmentViewHolder, AttachmentDownloadClickListener attachmentDownloadClickListener, View view) {
        Attachment attachment;
        Attachment attachment2 = generalFileAttachmentViewHolder.attachment;
        if ((attachment2 == null || !AttachmentKt.isFailed(attachment2)) && (attachment = generalFileAttachmentViewHolder.attachment) != null) {
            attachmentDownloadClickListener.onAttachmentDownloadClick(attachment);
        }
    }

    private final void setupBackground() {
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        float cornerRadius = this.style.getCornerRadius();
        AbstractC32410a abstractC32410aM101114z = AbstractC32411b.m101114z(0);
        C22782a c22782a = new C22782a(cornerRadius);
        C22782a c22782a2 = new C22782a(cornerRadius);
        C22782a c22782a3 = new C22782a(cornerRadius);
        C22782a c22782a4 = new C22782a(cornerRadius);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = abstractC32410aM101114z;
        c22792k.f89767b = abstractC32410aM101114z;
        c22792k.f89768c = abstractC32410aM101114z;
        c22792k.f89769d = abstractC32410aM101114z;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        C22788g c22788g = new C22788g(c22792k);
        c22788g.m66011m(ColorStateList.valueOf(this.style.getBackgroundColor()));
        c22788g.m66015q(ColorStateList.valueOf(this.style.getStrokeColor()));
        c22788g.m66017s(this.style.getStrokeWidth());
        this.binding.getRoot().setBackground(c22788g);
    }

    private final void subscribeForProgressIfNeeded(Attachment attachment) {
        Attachment.UploadState uploadState = attachment.getUploadState();
        if (uploadState instanceof Attachment.UploadState.Idle) {
            TextView fileSize = this.binding.fileSize;
            AbstractC22676k.m65749i(fileSize, "fileSize");
            File upload = attachment.getUpload();
            handleInProgressAttachment(fileSize, 0L, upload != null ? upload.length() : 0L);
            return;
        }
        if (uploadState instanceof Attachment.UploadState.InProgress) {
            TextView fileSize2 = this.binding.fileSize;
            AbstractC22676k.m65749i(fileSize2, "fileSize");
            Attachment.UploadState.InProgress inProgress = (Attachment.UploadState.InProgress) uploadState;
            handleInProgressAttachment(fileSize2, inProgress.getBytesUploaded(), inProgress.getTotalBytes());
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FileAttachmentViewHolder
    public final void clearScope() {
        InterfaceC2994c0 interfaceC2994c0 = this.scope;
        if (interfaceC2994c0 != null) {
            AbstractC3006f0.m8714h(interfaceC2994c0, null);
        }
        this.scope = null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FileAttachmentViewHolder
    public final void restartJob() {
        Attachment attachment = this.attachment;
        if (attachment != null) {
            subscribeForProgressIfNeeded(attachment);
        }
    }

    @Override // io.getstream.chat.android.ui.widgets.internal.SimpleListAdapter.ViewHolder
    public final void unbind() {
        clearScope();
    }

    @Override // io.getstream.chat.android.ui.widgets.internal.SimpleListAdapter.ViewHolder
    public final void bind(Attachment item) {
        AbstractC22676k.m65750j(item, "item");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[bind] item: " + item, null);
        }
        this.attachment = item;
        StreamUiItemFileAttachmentBinding streamUiItemFileAttachmentBinding = this.binding;
        TextView fileTitle = streamUiItemFileAttachmentBinding.fileTitle;
        AbstractC22676k.m65749i(fileTitle, "fileTitle");
        TextStyleKt.setTextStyle(fileTitle, this.style.getTitleTextStyle());
        TextView fileSize = streamUiItemFileAttachmentBinding.fileSize;
        AbstractC22676k.m65749i(fileSize, "fileSize");
        TextStyleKt.setTextStyle(fileSize, this.style.getFileSizeTextStyle());
        ImageView fileTypeIcon = streamUiItemFileAttachmentBinding.fileTypeIcon;
        AbstractC22676k.m65749i(fileTypeIcon, "fileTypeIcon");
        AttachmentUtilsKt.loadAttachmentThumb(fileTypeIcon, item);
        streamUiItemFileAttachmentBinding.fileTitle.setText(AttachmentKt.getDisplayableName(item));
        if ((item.getUploadState() instanceof Attachment.UploadState.Idle) || (item.getUploadState() instanceof Attachment.UploadState.InProgress) || ((item.getUploadState() instanceof Attachment.UploadState.Success) && item.getFileSize() == 0)) {
            streamUiItemFileAttachmentBinding.actionButton.setVisibility(8);
            TextView textView = streamUiItemFileAttachmentBinding.fileSize;
            File upload = item.getUpload();
            textView.setText(MediaStringUtil.convertFileSizeByteCount(upload != null ? upload.length() : 0L));
        } else if ((item.getUploadState() instanceof Attachment.UploadState.Failed) || item.getFileSize() == 0) {
            streamUiItemFileAttachmentBinding.actionButton.setVisibility(0);
            streamUiItemFileAttachmentBinding.actionButton.setImageDrawable(this.style.getFailedAttachmentIcon());
            TextView textView2 = streamUiItemFileAttachmentBinding.fileSize;
            File upload2 = item.getUpload();
            textView2.setText(MediaStringUtil.convertFileSizeByteCount(upload2 != null ? upload2.length() : 0L));
        } else {
            streamUiItemFileAttachmentBinding.actionButton.setVisibility(0);
            streamUiItemFileAttachmentBinding.actionButton.setImageDrawable(this.style.getActionButtonIcon());
            streamUiItemFileAttachmentBinding.fileSize.setText(MediaStringUtil.convertFileSizeByteCount(item.getFileSize()));
        }
        this.binding.progressBar.setIndeterminateDrawable(this.style.getProgressBarDrawable());
        ProgressBar progressBar = this.binding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(item.getUploadState() instanceof Attachment.UploadState.InProgress ? 0 : 8);
        subscribeForProgressIfNeeded(item);
        setupBackground();
    }
}
