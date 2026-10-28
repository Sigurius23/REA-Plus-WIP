package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.AttachmentType;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiUnsupportedAttachmentViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.UnsupportedAttachmentViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kr.C22782a;
import kr.C22786e;
import kr.C22788g;
import kr.C22792k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import se.AbstractC32410a;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\u000fH\u0002¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;", "<init>", "()V", "canHandle", "", "message", "Lio/getstream/chat/android/models/Message;", "createViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;", "listeners", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "parent", "Landroid/view/ViewGroup;", "isSupported", "Lio/getstream/chat/android/models/Attachment;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UnsupportedAttachmentFactory implements AttachmentFactory {
    private static final Companion Companion = new Companion();
    private static final Set<String> SUPPORTED_ATTACHMENT_TYPES = AbstractC25260n.m74059b1(new String[]{"image", "giphy", "video", "audio", "file", AttachmentType.AUDIO_RECORDING});

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory$Companion;", "", "<init>", "()V", "SUPPORTED_ATTACHMENT_TYPES", "", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final boolean isSupported(Attachment attachment) {
        return AbstractC25265s.m74155w0(SUPPORTED_ATTACHMENT_TYPES, attachment.getType());
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactory
    public final boolean canHandle(Message message) {
        AbstractC22676k.m65750j(message, "message");
        if (message.getAttachments().isEmpty()) {
            return false;
        }
        List<Attachment> attachments = message.getAttachments();
        if ((attachments instanceof Collection) && attachments.isEmpty()) {
            return true;
        }
        for (Attachment attachment : attachments) {
            if (AttachmentKt.hasLink(attachment) || isSupported(attachment)) {
                return false;
            }
        }
        return true;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactory
    public final InnerAttachmentViewHolder createViewHolder(Message message, MessageListListeners listeners, ViewGroup parent) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(parent, "parent");
        Context context = parent.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        StreamUiUnsupportedAttachmentViewBinding streamUiUnsupportedAttachmentViewBindingInflate = StreamUiUnsupportedAttachmentViewBinding.inflate(ContextKt.getStreamThemeInflater(context), parent, false);
        UnsupportedAttachmentViewStyle.Companion companion = UnsupportedAttachmentViewStyle.INSTANCE;
        Context context2 = parent.getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        UnsupportedAttachmentViewStyle unsupportedAttachmentViewStyleInvoke = companion.invoke(context2, null);
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        float cornerRadius = unsupportedAttachmentViewStyleInvoke.getCornerRadius();
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
        ConstraintLayout constraintLayout = streamUiUnsupportedAttachmentViewBindingInflate.attachmentContainer;
        C22788g c22788g = new C22788g(c22792k);
        c22788g.m66011m(ColorStateList.valueOf(unsupportedAttachmentViewStyleInvoke.getBackgroundColor()));
        c22788g.m66015q(ColorStateList.valueOf(unsupportedAttachmentViewStyleInvoke.getStrokeColor()));
        c22788g.m66017s(unsupportedAttachmentViewStyleInvoke.getStrokeWidth());
        constraintLayout.setBackground(c22788g);
        TextView titleImageView = streamUiUnsupportedAttachmentViewBindingInflate.titleImageView;
        AbstractC22676k.m65749i(titleImageView, "titleImageView");
        TextStyleKt.setTextStyle(titleImageView, unsupportedAttachmentViewStyleInvoke.getTitleTextStyle());
        return new InnerAttachmentViewHolder(streamUiUnsupportedAttachmentViewBindingInflate.getRoot()) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.attachment.UnsupportedAttachmentFactory.createViewHolder.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(constraintLayout);
                AbstractC22676k.m65747g(constraintLayout);
            }
        };
    }
}
