package io.getstream.chat.android.p226ui.navigation.destinations;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import i23.InterfaceC18016a;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.feature.documents.DocumentAttachmentHandler;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentActivity;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentMediaActivity;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.C2817b;
import p309lo.C24560r;
import p314m.DialogInterfaceC24846j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\fR\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/ui/navigation/destinations/AttachmentDestination;", "Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Landroid/content/Context;", "context", "<init>", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;Landroid/content/Context;)V", "Ll83/a0;", "loadFile", "(Lio/getstream/chat/android/models/Attachment;)V", "", "mimeType", "type", "", "playableContent", "(Ljava/lang/String;Ljava/lang/String;)Z", "docMimeType", "(Ljava/lang/String;)Z", "isGif", "(Lio/getstream/chat/android/models/Attachment;)Z", "navigate", "()V", "showAttachment", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)V", "showImageViewer", "Lio/getstream/chat/android/models/Message;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "setMessage", "(Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/models/Attachment;", "getAttachment", "()Lio/getstream/chat/android/models/Attachment;", "setAttachment", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class AttachmentDestination extends ChatDestination {
    private static final String AUDIO_TYPE = "audio";
    private static final Companion Companion = new Companion();
    private static final String MP4_MIME_TYPE = "mp4";
    private static final String MPEG_MIME_TYPE = "audio/mpeg";
    private static final String QUICKTIME_MIME_TYPE = "quicktime";
    private static final String VIDEO_MIME_TYPE_PREFIX = "video";
    private static final String VIDEO_TYPE = "video";
    private Attachment attachment;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private Message message;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/navigation/destinations/AttachmentDestination$Companion;", "", "<init>", "()V", "VIDEO_MIME_TYPE_PREFIX", "", "MP4_MIME_TYPE", "MPEG_MIME_TYPE", "QUICKTIME_MIME_TYPE", "VIDEO_TYPE", "AUDIO_TYPE", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.navigation.destinations.AttachmentDestination$showImageViewer$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C199001 implements InterfaceC18016a, InterfaceC22666f {
        public static final C199001 INSTANCE = new C199001();

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC18016a) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return new C22656a(2, ImageUtilsKt.class, "load", "load(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", 9);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // i23.InterfaceC18016a
        public final void loadImage(ImageView p13, Object obj) {
            AbstractC22676k.m65750j(p13, "p0");
            ImageUtilsKt.load$default(p13, obj, (Integer) null, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 30, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentDestination(Message message, Attachment attachment, Context context) {
        super(context);
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachment, "attachment");
        AbstractC22676k.m65750j(context, "context");
        this.message = message;
        this.attachment = attachment;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:AttachmentDestination");
    }

    private final boolean docMimeType(String mimeType) {
        return AbstractC22676k.m65745e(mimeType, MimeType.MIME_TYPE_DOC) || AbstractC22676k.m65745e(mimeType, MimeType.MIME_TYPE_TXT) || AbstractC22676k.m65745e(mimeType, MimeType.MIME_TYPE_PDF) || AbstractC22676k.m65745e(mimeType, MimeType.MIME_TYPE_HTML) || (mimeType != null && AbstractC39414r.m125876U(mimeType, MimeType.MIME_TYPE_VND, false));
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final boolean isGif(Attachment attachment) {
        String mimeType = attachment.getMimeType();
        if (mimeType != null) {
            return AbstractC39414r.m125876U(mimeType, "gif", false);
        }
        return false;
    }

    private final void loadFile(Attachment attachment) {
        String mimeType = attachment.getMimeType();
        String assetUrl = attachment.getAssetUrl();
        String type = attachment.getType();
        String title = attachment.getTitle();
        String str = (title == null && (title = attachment.getName()) == null) ? "" : title;
        if (mimeType == null && type == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("MimeType is null for url ", assetUrl), null);
            }
            Toast.makeText(getContext(), getContext().getString(C19470R.string.stream_ui_message_list_attachment_invalid_mime_type, attachment.getName()), 0).show();
            return;
        }
        if (playableContent(mimeType, type)) {
            start(AttachmentMediaActivity.INSTANCE.createIntent(getContext(), assetUrl != null ? assetUrl : "", str, mimeType, type));
            return;
        }
        if (docMimeType(mimeType)) {
            DocumentAttachmentHandler.INSTANCE.openAttachment(getContext(), attachment);
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str3 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
            logger2.f9274b.log(enumC2341g2, str3, AbstractC31061c.m95640p("Could not load attachment. Mimetype: ", mimeType, ". Type: ", type), null);
        }
        Toast.makeText(getContext(), getContext().getString(C19470R.string.stream_ui_message_list_attachment_invalid_mime_type, attachment.getName()), 0).show();
    }

    private final boolean playableContent(String mimeType, String type) {
        return (mimeType != null && AbstractC39414r.m125876U(mimeType, "audio", false)) || (mimeType != null && AbstractC39414r.m125876U(mimeType, "video", false)) || ((mimeType != null && AbstractC39414r.m125876U(mimeType, "mp4", false)) || ((mimeType != null && AbstractC39414r.m125876U(mimeType, MPEG_MIME_TYPE, false)) || ((mimeType != null && AbstractC39414r.m125876U(mimeType, "quicktime", false)) || AbstractC22676k.m65745e(type, "audio") || AbstractC22676k.m65745e(type, "video"))));
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final Message getMessage() {
        return this.message;
    }

    @Override // io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination
    public final void navigate() {
        showAttachment(this.message, this.attachment);
    }

    public final void setAttachment(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<set-?>");
        this.attachment = attachment;
    }

    public final void setMessage(Message message) {
        AbstractC22676k.m65750j(message, "<set-?>");
        this.message = message;
    }

    public final void showAttachment(Message message, Attachment attachment) {
        String mimeType;
        String thumbUrl;
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachment, "attachment");
        if (AttachmentUtilsKt.isFile(attachment) || AttachmentUtilsKt.isVideo(attachment) || AttachmentUtilsKt.isAudio(attachment) || ((mimeType = attachment.getMimeType()) != null && AbstractC39414r.m125876U(mimeType, "video", false))) {
            loadFile(attachment);
            return;
        }
        String type = attachment.getType();
        String type2 = attachment.getType();
        if (!AbstractC22676k.m65745e(type2, "image")) {
            thumbUrl = AbstractC22676k.m65745e(type2, "giphy") ? attachment.getThumbUrl() : null;
        } else if (attachment.getTitleLink() != null || attachment.getOgUrl() != null || attachment.getAssetUrl() != null) {
            thumbUrl = attachment.getTitleLink();
            if (thumbUrl == null && (thumbUrl = attachment.getOgUrl()) == null) {
                thumbUrl = attachment.getAssetUrl();
            }
            type = "image";
        } else if (!isGif(attachment)) {
            showImageViewer(message, attachment);
            return;
        } else {
            thumbUrl = attachment.getImageUrl();
            type = "giphy";
        }
        if (thumbUrl != null && thumbUrl.length() != 0) {
            start(AttachmentActivity.INSTANCE.createIntent(getContext(), type, thumbUrl));
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "Wrong URL for attachment. Attachment: " + attachment, null);
        }
        if (AbstractC22676k.m65745e(attachment.getType(), "unknown")) {
            Toast.makeText(getContext(), getContext().getString(C19470R.string.stream_ui_message_list_attachment_invalid_url), 0).show();
        }
    }

    public final void showImageViewer(Message message, Attachment attachment) {
        String imageUrl;
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachment, "attachment");
        List<Attachment> attachments = message.getAttachments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            Attachment attachment2 = (Attachment) obj;
            if (AttachmentUtilsKt.isImage(attachment2) && (imageUrl = attachment2.getImageUrl()) != null && imageUrl.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String imageUrl2 = ((Attachment) it.next()).getImageUrl();
            if (imageUrl2 != null) {
                arrayList2.add(imageUrl2);
            }
        }
        int i13 = 0;
        if (arrayList2.isEmpty()) {
            Toast.makeText(getContext(), "Invalid image(s)!", 0).show();
            return;
        }
        int iIndexOf = message.getAttachments().indexOf(attachment);
        Context context = getContext();
        C199001 imageLoader = C199001.INSTANCE;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        C24560r c24560r = new C24560r();
        c24560r.f95855y = arrayList2;
        c24560r.f95856z = imageLoader;
        c24560r.f95853w = new int[4];
        if (iIndexOf >= 0 && iIndexOf < arrayList2.size()) {
            i13 = iIndexOf;
        }
        c24560r.f95854x = i13;
        C2817b c2817b = new C2817b(context, c24560r);
        if (arrayList2.isEmpty()) {
            Log.w("PhotoView", "Images list cannot be empty! Viewer ignored.");
        } else {
            c2817b.f11023x = true;
            ((DialogInterfaceC24846j) c2817b.f11025z).show();
        }
    }
}
