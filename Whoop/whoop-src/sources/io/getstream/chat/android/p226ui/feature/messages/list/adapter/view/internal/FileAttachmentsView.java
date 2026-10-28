package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.feature.messages.list.FileAttachmentViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "", "Lio/getstream/chat/android/models/Attachment;", "attachments", "setAttachments", "(Ljava/util/List;)V", "onDetachedFromWindow", "()V", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "getAttachmentClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "setAttachmentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "attachmentLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "getAttachmentLongClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "setAttachmentLongClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;", "attachmentDownloadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;", "getAttachmentDownloadClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;", "setAttachmentDownloadClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;", "fileAttachmentsAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FileAttachmentsView extends RecyclerView {
    private AttachmentClickListener attachmentClickListener;
    private AttachmentDownloadClickListener attachmentDownloadClickListener;
    private AttachmentLongClickListener attachmentLongClickListener;
    private FileAttachmentsAdapter fileAttachmentsAdapter;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private FileAttachmentViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileAttachmentsView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void init(AttributeSet attrs) {
        FileAttachmentViewStyle.Companion companion = FileAttachmentViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.style = companion.invoke(context, attrs);
    }

    public final AttachmentClickListener getAttachmentClickListener() {
        return this.attachmentClickListener;
    }

    public final AttachmentDownloadClickListener getAttachmentDownloadClickListener() {
        return this.attachmentDownloadClickListener;
    }

    public final AttachmentLongClickListener getAttachmentLongClickListener() {
        return this.attachmentLongClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC1692i1 adapter = getAdapter();
        if (adapter != null) {
            adapter.onDetachedFromRecyclerView(this);
        }
        super.onDetachedFromWindow();
    }

    public final void setAttachmentClickListener(AttachmentClickListener attachmentClickListener) {
        this.attachmentClickListener = attachmentClickListener;
    }

    public final void setAttachmentDownloadClickListener(AttachmentDownloadClickListener attachmentDownloadClickListener) {
        this.attachmentDownloadClickListener = attachmentDownloadClickListener;
    }

    public final void setAttachmentLongClickListener(AttachmentLongClickListener attachmentLongClickListener) {
        this.attachmentLongClickListener = attachmentLongClickListener;
    }

    public final void setAttachments(List<Attachment> attachments) {
        AbstractC22676k.m65750j(attachments, "attachments");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31998q("[setAttachments] attachments: ", attachments), null);
        }
        if (this.fileAttachmentsAdapter == null) {
            AttachmentClickListener attachmentClickListener = this.attachmentClickListener;
            FileAttachmentsView$setAttachments$2$1 fileAttachmentsView$setAttachments$2$1 = attachmentClickListener != null ? new FileAttachmentsView$setAttachments$2$1(attachmentClickListener) : null;
            AttachmentLongClickListener attachmentLongClickListener = this.attachmentLongClickListener;
            FileAttachmentsView$setAttachments$3$1 fileAttachmentsView$setAttachments$3$1 = attachmentLongClickListener != null ? new FileAttachmentsView$setAttachments$3$1(attachmentLongClickListener) : null;
            AttachmentDownloadClickListener attachmentDownloadClickListener = this.attachmentDownloadClickListener;
            FileAttachmentsView$setAttachments$4$1 fileAttachmentsView$setAttachments$4$1 = attachmentDownloadClickListener != null ? new FileAttachmentsView$setAttachments$4$1(attachmentDownloadClickListener) : null;
            FileAttachmentViewStyle fileAttachmentViewStyle = this.style;
            if (fileAttachmentViewStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            FileAttachmentsAdapter fileAttachmentsAdapter = new FileAttachmentsAdapter(fileAttachmentsView$setAttachments$2$1, fileAttachmentsView$setAttachments$3$1, fileAttachmentsView$setAttachments$4$1, fileAttachmentViewStyle);
            this.fileAttachmentsAdapter = fileAttachmentsAdapter;
            setAdapter(fileAttachmentsAdapter);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (!AttachmentKt.hasLink((Attachment) obj)) {
                arrayList.add(obj);
            }
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8295h(arrayList.size(), "[setAttachments] filteredAttachments.size: "), null);
        }
        FileAttachmentsAdapter fileAttachmentsAdapter2 = this.fileAttachmentsAdapter;
        if (fileAttachmentsAdapter2 == null) {
            AbstractC22676k.m65757q("fileAttachmentsAdapter");
            throw null;
        }
        fileAttachmentsAdapter2.setItems(arrayList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileAttachmentsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentsView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "FileAttachmentListView");
        getContext();
        setLayoutManager(new LinearLayoutManager(1));
        addItemDecoration(new VerticalSpaceItemDecorator(IntKt.dpToPx(4)), -1);
        init(attributeSet);
    }
}
