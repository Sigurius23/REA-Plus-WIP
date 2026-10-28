package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "fileAttachmentHeight", "", "fileAttachmentWidth", "imageAttachmentHeight", "imageAttachmentWidth", "quotedImageRadius", "<init>", "(IIIII)V", "getFileAttachmentHeight", "()I", "getFileAttachmentWidth", "getImageAttachmentHeight", "getImageAttachmentWidth", "getQuotedImageRadius", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultQuotedAttachmentViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int fileAttachmentHeight;
    private final int fileAttachmentWidth;
    private final int imageAttachmentHeight;
    private final int imageAttachmentWidth;
    private final int quotedImageRadius;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;", "context", "Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final DefaultQuotedAttachmentViewStyle invoke(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return TransformStyle.getDefaultQuotedAttachmentViewStyleTransformer().transform(new DefaultQuotedAttachmentViewStyle(ContextKt.getDimension(context, C19469R.dimen.streamUiQuotedFileAttachmentViewHeight), ContextKt.getDimension(context, C19469R.dimen.streamUiQuotedFileAttachmentViewWidth), ContextKt.getDimension(context, C19469R.dimen.streamUiQuotedImageAttachmentViewHeight), ContextKt.getDimension(context, C19469R.dimen.streamUiQuotedImageAttachmentViewWidth), ContextKt.getDimension(context, C19469R.dimen.streamUiQuotedImageAttachmentImageRadius)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DefaultQuotedAttachmentViewStyle(int i13, int i14, int i15, int i16, int i17) {
        this.fileAttachmentHeight = i13;
        this.fileAttachmentWidth = i14;
        this.imageAttachmentHeight = i15;
        this.imageAttachmentWidth = i16;
        this.quotedImageRadius = i17;
    }

    public final int getFileAttachmentHeight() {
        return this.fileAttachmentHeight;
    }

    public final int getFileAttachmentWidth() {
        return this.fileAttachmentWidth;
    }

    public final int getImageAttachmentHeight() {
        return this.imageAttachmentHeight;
    }

    public final int getImageAttachmentWidth() {
        return this.imageAttachmentWidth;
    }

    public final int getQuotedImageRadius() {
        return this.quotedImageRadius;
    }
}
