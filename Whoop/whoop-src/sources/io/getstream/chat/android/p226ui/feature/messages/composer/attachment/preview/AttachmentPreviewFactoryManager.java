package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview;

import android.view.ViewGroup;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.AttachmentPreviewFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.AudioRecordAttachmentPreviewFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.FallbackAttachmentPreviewFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.FileAttachmentPreviewFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory.MediaAttachmentPreviewFactory;
import java.util.List;
import l83.InterfaceC23462h;
import p002a0.AbstractC0064z;
import p002a0.C0024g1;
import p024b0.AbstractC2177a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B#\b\u0007\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;", "", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AttachmentPreviewFactory;", "attachmentPreviewFactories", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory;", "fallbackAttachmentPreviewFactory", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory;)V", "Landroid/view/ViewGroup;", "parentView", "", "viewType", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "Ll83/a0;", "attachmentRemovalListener", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;ILkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "attachment", "getItemViewType", "(Lio/getstream/chat/android/models/Attachment;)I", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "La0/g1;", "viewTypeToFactoryMapping", "La0/g1;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentPreviewFactoryManager {
    private static final Companion Companion = new Companion();
    private static final int FALLBACK_FACTORY_VIEW_TYPE = 100;
    private final FallbackAttachmentPreviewFactory fallbackAttachmentPreviewFactory;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final C0024g1 viewTypeToFactoryMapping;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager$Companion;", "", "<init>", "()V", "FALLBACK_FACTORY_VIEW_TYPE", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentPreviewFactoryManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public static /* synthetic */ AttachmentPreviewViewHolder onCreateViewHolder$default(AttachmentPreviewFactoryManager attachmentPreviewFactoryManager, ViewGroup viewGroup, int i13, Function1 function1, MessageComposerViewStyle messageComposerViewStyle, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            messageComposerViewStyle = null;
        }
        return attachmentPreviewFactoryManager.onCreateViewHolder(viewGroup, i13, function1, messageComposerViewStyle);
    }

    public final int getItemViewType(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        int iM58g = this.viewTypeToFactoryMapping.m58g();
        for (int i13 = 0; i13 < iM58g; i13++) {
            AttachmentPreviewFactory attachmentPreviewFactory = (AttachmentPreviewFactory) this.viewTypeToFactoryMapping.m59h(i13);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[getItemViewType] i: " + i13 + ", factory: " + attachmentPreviewFactory, null);
            }
            if (attachmentPreviewFactory.canHandle(attachment)) {
                return this.viewTypeToFactoryMapping.m56e(i13);
            }
        }
        return 100;
    }

    public final AttachmentPreviewViewHolder onCreateViewHolder(ViewGroup parentView, int viewType, Function1 attachmentRemovalListener, MessageComposerViewStyle style) {
        Object obj;
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        C0024g1 c0024g1 = this.viewTypeToFactoryMapping;
        Object obj2 = this.fallbackAttachmentPreviewFactory;
        int iM6853a = AbstractC2177a.m6853a(c0024g1.f58z, viewType, c0024g1.f56x);
        if (iM6853a >= 0 && (obj = c0024g1.f57y[iM6853a]) != AbstractC0064z.f203c) {
            obj2 = obj;
        }
        return ((AttachmentPreviewFactory) obj2).onCreateViewHolder(parentView, attachmentRemovalListener, style);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentPreviewFactoryManager(List<? extends AttachmentPreviewFactory> attachmentPreviewFactories) {
        this(attachmentPreviewFactories, null, 2, 0 == true ? 1 : 0);
        AbstractC22676k.m65750j(attachmentPreviewFactories, "attachmentPreviewFactories");
    }

    public AttachmentPreviewFactoryManager(List<? extends AttachmentPreviewFactory> attachmentPreviewFactories, FallbackAttachmentPreviewFactory fallbackAttachmentPreviewFactory) {
        AbstractC22676k.m65750j(attachmentPreviewFactories, "attachmentPreviewFactories");
        AbstractC22676k.m65750j(fallbackAttachmentPreviewFactory, "fallbackAttachmentPreviewFactory");
        this.fallbackAttachmentPreviewFactory = fallbackAttachmentPreviewFactory;
        this.logger = AbstractC1772c1.m5382S(this, "AttachPreviewFM");
        this.viewTypeToFactoryMapping = new C0024g1((Object) null);
        int size = attachmentPreviewFactories.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.viewTypeToFactoryMapping.m57f(i13, attachmentPreviewFactories.get(i13));
        }
    }

    public /* synthetic */ AttachmentPreviewFactoryManager(List list, FallbackAttachmentPreviewFactory fallbackAttachmentPreviewFactory, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC37056f.m118959K(new MediaAttachmentPreviewFactory(), new AudioRecordAttachmentPreviewFactory(), new FileAttachmentPreviewFactory()) : list, (i13 & 2) != 0 ? new FallbackAttachmentPreviewFactory() : fallbackAttachmentPreviewFactory);
    }
}
