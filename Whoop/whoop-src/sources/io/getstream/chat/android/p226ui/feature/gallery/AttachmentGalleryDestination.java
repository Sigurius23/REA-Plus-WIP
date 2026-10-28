package io.getstream.chat.android.p226ui.feature.gallery;

import android.content.Context;
import android.widget.Toast;
import aq0.C1904o;
import io.getstream.chat.android.p226ui.feature.gallery.internal.AttachmentGalleryRepository;
import io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination;
import java.util.List;
import p031b9.AbstractC2875y;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;", "Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;", "attachmentReplyOptionHandler", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;", "attachmentShowInChatOptionHandler", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;", "attachmentDownloadOptionHandler", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;", "attachmentDeleteOptionClickHandler", "<init>", "(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;)V", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "attachmentGalleryItems", "", "attachmentIndex", "Ll83/a0;", "setData", "(Ljava/util/List;I)V", "navigate", "()V", "Lj/j;", "activityResultRegistry", "register", "(Lj/j;)V", "unregister", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;", "Lj/d;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultContract$Input;", "launcher", "Lj/d;", "Ljava/util/List;", "I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryDestination extends ChatDestination {
    private final AttachmentGalleryActivity.AttachmentDeleteOptionHandler attachmentDeleteOptionClickHandler;
    private final AttachmentGalleryActivity.AttachmentDownloadOptionHandler attachmentDownloadOptionHandler;
    private List<AttachmentGalleryItem> attachmentGalleryItems;
    private int attachmentIndex;
    private final AttachmentGalleryActivity.AttachmentReplyOptionHandler attachmentReplyOptionHandler;
    private final AttachmentGalleryActivity.AttachmentShowInChatOptionHandler attachmentShowInChatOptionHandler;
    private AbstractC21065d launcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentGalleryDestination(Context context, AttachmentGalleryActivity.AttachmentReplyOptionHandler attachmentReplyOptionHandler, AttachmentGalleryActivity.AttachmentShowInChatOptionHandler attachmentShowInChatOptionHandler, AttachmentGalleryActivity.AttachmentDownloadOptionHandler attachmentDownloadOptionHandler, AttachmentGalleryActivity.AttachmentDeleteOptionHandler attachmentDeleteOptionClickHandler) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attachmentReplyOptionHandler, "attachmentReplyOptionHandler");
        AbstractC22676k.m65750j(attachmentShowInChatOptionHandler, "attachmentShowInChatOptionHandler");
        AbstractC22676k.m65750j(attachmentDownloadOptionHandler, "attachmentDownloadOptionHandler");
        AbstractC22676k.m65750j(attachmentDeleteOptionClickHandler, "attachmentDeleteOptionClickHandler");
        this.attachmentReplyOptionHandler = attachmentReplyOptionHandler;
        this.attachmentShowInChatOptionHandler = attachmentShowInChatOptionHandler;
        this.attachmentDownloadOptionHandler = attachmentDownloadOptionHandler;
        this.attachmentDeleteOptionClickHandler = attachmentDeleteOptionClickHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(AttachmentGalleryDestination attachmentGalleryDestination, AttachmentGalleryActivity.AttachmentOptionResult attachmentOptionResult) {
        if (attachmentOptionResult instanceof AttachmentGalleryActivity.AttachmentOptionResult.Reply) {
            attachmentGalleryDestination.attachmentReplyOptionHandler.onClick(((AttachmentGalleryActivity.AttachmentOptionResult.Reply) attachmentOptionResult).getResult());
            return;
        }
        if (attachmentOptionResult instanceof AttachmentGalleryActivity.AttachmentOptionResult.ShowInChat) {
            attachmentGalleryDestination.attachmentShowInChatOptionHandler.onClick(((AttachmentGalleryActivity.AttachmentOptionResult.ShowInChat) attachmentOptionResult).getResult());
            return;
        }
        if (attachmentOptionResult instanceof AttachmentGalleryActivity.AttachmentOptionResult.Delete) {
            attachmentGalleryDestination.attachmentDeleteOptionClickHandler.onClick(((AttachmentGalleryActivity.AttachmentOptionResult.Delete) attachmentOptionResult).getResult());
        } else if (attachmentOptionResult instanceof AttachmentGalleryActivity.AttachmentOptionResult.Download) {
            attachmentGalleryDestination.attachmentDownloadOptionHandler.onClick(((AttachmentGalleryActivity.AttachmentOptionResult.Download) attachmentOptionResult).getResult());
        } else if (attachmentOptionResult != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination
    public final void navigate() {
        List<AttachmentGalleryItem> list = this.attachmentGalleryItems;
        if (list == null) {
            AbstractC22676k.m65757q("attachmentGalleryItems");
            throw null;
        }
        if (list.isEmpty()) {
            Toast.makeText(getContext(), "Invalid image(s)!", 0).show();
            return;
        }
        AttachmentGalleryRepository attachmentGalleryRepository = AttachmentGalleryRepository.INSTANCE;
        List<AttachmentGalleryItem> list2 = this.attachmentGalleryItems;
        if (list2 == null) {
            AbstractC22676k.m65757q("attachmentGalleryItems");
            throw null;
        }
        attachmentGalleryRepository.setAttachmentGalleryItems(list2);
        AbstractC21065d abstractC21065d = this.launcher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(new AttachmentGalleryResultContract.Input(this.attachmentIndex), null);
        }
    }

    public final void register(AbstractC21071j activityResultRegistry) {
        AbstractC22676k.m65750j(activityResultRegistry, "activityResultRegistry");
        this.launcher = activityResultRegistry.m58914d(AbstractC2875y.m8295h(hashCode(), "attachment_gallery_launcher#"), new AttachmentGalleryResultContract(), new C1904o(this, 6));
    }

    public final void setData(List<AttachmentGalleryItem> attachmentGalleryItems, int attachmentIndex) {
        AbstractC22676k.m65750j(attachmentGalleryItems, "attachmentGalleryItems");
        this.attachmentGalleryItems = attachmentGalleryItems;
        this.attachmentIndex = attachmentIndex;
    }

    public final void unregister() {
        AbstractC21065d abstractC21065d = this.launcher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
        this.launcher = null;
    }
}
