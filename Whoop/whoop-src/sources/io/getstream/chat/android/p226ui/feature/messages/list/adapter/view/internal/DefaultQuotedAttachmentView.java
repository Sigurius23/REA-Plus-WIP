package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.feature.messages.list.DefaultQuotedAttachmentViewStyle;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", QueryParams.URL, "Ll83/a0;", "showAttachmentThumb", "(Ljava/lang/String;)V", "init", "onAttachedToWindow", "()V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "showAttachment", "(Lio/getstream/chat/android/models/Attachment;)V", "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;", "Lio/getstream/chat/android/models/Attachment;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultQuotedAttachmentView extends AppCompatImageView {
    private Attachment attachment;
    private DefaultQuotedAttachmentViewStyle style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultQuotedAttachmentView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context), null);
        AbstractC22676k.m65750j(context, "context");
        this.style = DefaultQuotedAttachmentViewStyle.INSTANCE.invoke(context);
    }

    private final void init(Context context) {
        this.style = DefaultQuotedAttachmentViewStyle.INSTANCE.invoke(context);
    }

    private final void showAttachmentThumb(String url) {
        DefaultQuotedAttachmentViewStyle defaultQuotedAttachmentViewStyle = this.style;
        if (defaultQuotedAttachmentViewStyle != null) {
            ImageUtilsKt.load$default(this, url, (Integer) null, new StreamImageLoader.ImageTransformation.RoundedCorners(defaultQuotedAttachmentViewStyle.getQuotedImageRadius()), (InterfaceC4339a) null, (InterfaceC4339a) null, 26, (Object) null);
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Attachment attachment = this.attachment;
        String type = attachment != null ? attachment.getType() : null;
        if (AbstractC22676k.m65745e(type, "file") || AbstractC22676k.m65745e(type, "video")) {
            DefaultQuotedAttachmentViewStyle defaultQuotedAttachmentViewStyle = this.style;
            if (defaultQuotedAttachmentViewStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            layoutParams.width = defaultQuotedAttachmentViewStyle.getFileAttachmentWidth();
            DefaultQuotedAttachmentViewStyle defaultQuotedAttachmentViewStyle2 = this.style;
            if (defaultQuotedAttachmentViewStyle2 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            layoutParams.height = defaultQuotedAttachmentViewStyle2.getFileAttachmentHeight();
        } else {
            DefaultQuotedAttachmentViewStyle defaultQuotedAttachmentViewStyle3 = this.style;
            if (defaultQuotedAttachmentViewStyle3 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            layoutParams.width = defaultQuotedAttachmentViewStyle3.getImageAttachmentWidth();
            DefaultQuotedAttachmentViewStyle defaultQuotedAttachmentViewStyle4 = this.style;
            if (defaultQuotedAttachmentViewStyle4 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            layoutParams.height = defaultQuotedAttachmentViewStyle4.getImageAttachmentHeight();
        }
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0.equals("video") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r0.equals("file") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        io.getstream.chat.android.p226ui.utils.AttachmentUtilsKt.loadAttachmentThumb(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0.equals(io.getstream.chat.android.models.AttachmentType.AUDIO_RECORDING) == false) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showAttachment(io.getstream.chat.android.models.Attachment r3) {
        /*
            r2 = this;
            java.lang.String r0 = "attachment"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r3, r0)
            r2.attachment = r3
            java.lang.String r0 = r3.getType()
            if (r0 == 0) goto L62
            int r1 = r0.hashCode()
            switch(r1) {
                case 3143036: goto L55;
                case 98361695: goto L44;
                case 100313435: goto L27;
                case 112202875: goto L1e;
                case 1459418335: goto L15;
                default: goto L14;
            }
        L14:
            goto L62
        L15:
            java.lang.String r1 = "voiceRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L62
        L1e:
            java.lang.String r1 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L62
            goto L5e
        L27:
            java.lang.String r1 = "image"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L62
        L30:
            java.lang.String r3 = r3.getImageUrl()
            if (r3 == 0) goto L3f
            io.getstream.chat.android.ui.common.images.resizing.StreamCdnImageResizing r0 = io.getstream.chat.android.p226ui.ChatUI.getStreamCdnImageResizing()
            java.lang.String r3 = io.getstream.chat.android.p226ui.common.images.resizing.StringExtensionsKt.applyStreamCdnImageResizingIfEnabled(r3, r0)
            goto L40
        L3f:
            r3 = 0
        L40:
            r2.showAttachmentThumb(r3)
            return
        L44:
            java.lang.String r1 = "giphy"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L62
        L4d:
            java.lang.String r3 = r3.getThumbUrl()
            r2.showAttachmentThumb(r3)
            return
        L55:
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L62
        L5e:
            io.getstream.chat.android.p226ui.utils.AttachmentUtilsKt.loadAttachmentThumb(r2, r3)
            return
        L62:
            java.lang.String r3 = r3.getImage()
            r2.showAttachmentThumb(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.DefaultQuotedAttachmentView.showAttachment(io.getstream.chat.android.models.Attachment):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultQuotedAttachmentView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.style = DefaultQuotedAttachmentViewStyle.INSTANCE.invoke(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultQuotedAttachmentView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.style = DefaultQuotedAttachmentViewStyle.INSTANCE.invoke(context);
    }
}
