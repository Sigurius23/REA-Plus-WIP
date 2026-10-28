package io.getstream.chat.android.p226ui.common.helper.internal;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n83.C26463f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0007¢\u0006\u0004\b\u001f\u0010\u0019J5\u0010!\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;", "", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;", "storageHelper", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;", "attachmentFilter", "<init>", "(Landroid/content/Context;Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;)V", "Ljava/io/File;", "file", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Ll83/k;", "", "resolveLocalDimensions", "(Ljava/io/File;Lio/getstream/chat/android/models/Attachment;)Ll83/k;", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "getFileMetadata", "()Ljava/util/List;", "getMediaMetadata", "metaData", "toAttachments", "(Ljava/util/List;)Ljava/util/List;", "attachments", "resolveAttachmentFiles", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "uris", "resolveMetadata", "metadata", "partitionResolvable", "(Ljava/util/List;)Ll83/k;", "Landroid/content/Context;", "Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;", "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentStorageHelper {
    public static final int $stable = 8;
    public static final String EXTRA_SOURCE_URI = "io.getstream.sourceUri";
    private final AttachmentFilter attachmentFilter;
    private final Context context;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final StorageHelper storageHelper;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.helper.internal.AttachmentStorageHelper$resolveAttachmentFiles$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.helper.internal.AttachmentStorageHelper$resolveAttachmentFiles$2", m100430f = "AttachmentStorageHelper.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lio/getstream/chat/android/models/Attachment;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196022 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ List<Attachment> $attachments;
        int label;
        final /* synthetic */ AttachmentStorageHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196022(List<Attachment> list, AttachmentStorageHelper attachmentStorageHelper, InterfaceC30057d<? super C196022> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$attachments = list;
            this.this$0 = attachmentStorageHelper;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C196022(this.$attachments, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<Attachment>> interfaceC30057d) {
            return ((C196022) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Uri uri;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            List<Attachment> list = this.$attachments;
            AttachmentStorageHelper attachmentStorageHelper = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Attachment attachmentCopy$default : list) {
                if (attachmentCopy$default.getUpload() == null) {
                    Object obj2 = attachmentCopy$default.getExtraData().get(AttachmentStorageHelper.EXTRA_SOURCE_URI);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null && (uri = Uri.parse(str)) != null) {
                        AttachmentMetaData attachmentMetaData = new AttachmentMetaData(uri, attachmentCopy$default.getType(), attachmentCopy$default.getMimeType(), attachmentCopy$default.getName(), null, null, 48, null);
                        attachmentMetaData.setSize(attachmentCopy$default.getFileSize());
                        File cachedFileFromUri = attachmentStorageHelper.storageHelper.getCachedFileFromUri(attachmentStorageHelper.context, attachmentMetaData);
                        if (cachedFileFromUri == null) {
                            C2345k logger = attachmentStorageHelper.getLogger();
                            InterfaceC2339e interfaceC2339e = logger.f9275c;
                            String str2 = logger.f9273a;
                            EnumC2341g enumC2341g = EnumC2341g.WARN;
                            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                                logger.f9274b.log(enumC2341g, str2, AbstractC31061c.m95637m(uri, "[resolveAttachmentFiles] Failed to resolve file for URI: "), null);
                            }
                            attachmentCopy$default = null;
                        } else {
                            C23465k c23465kResolveLocalDimensions = (attachmentCopy$default.getOriginalWidth() == null && attachmentCopy$default.getOriginalHeight() == null) ? attachmentStorageHelper.resolveLocalDimensions(cachedFileFromUri, attachmentCopy$default) : new C23465k(attachmentCopy$default.getOriginalWidth(), attachmentCopy$default.getOriginalHeight());
                            attachmentCopy$default = Attachment.copy$default(attachmentCopy$default, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, (Integer) c23465kResolveLocalDimensions.f92938x, (Integer) c23465kResolveLocalDimensions.f92937w, cachedFileFromUri, null, AbstractC25247g0.m73991Z(AttachmentStorageHelper.EXTRA_SOURCE_URI, attachmentCopy$default.getExtraData()), 294911, null);
                        }
                    }
                }
                if (attachmentCopy$default != null) {
                    arrayList.add(attachmentCopy$default);
                }
            }
            return arrayList;
        }
    }

    public AttachmentStorageHelper(Context context, StorageHelper storageHelper, AttachmentFilter attachmentFilter) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(storageHelper, "storageHelper");
        AbstractC22676k.m65750j(attachmentFilter, "attachmentFilter");
        this.context = context;
        this.storageHelper = storageHelper;
        this.attachmentFilter = attachmentFilter;
        this.logger = AbstractC1772c1.m5382S(this, "AttachmentStorageHelper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C23465k resolveLocalDimensions(File file, Attachment attachment) throws IOException {
        C23465k c23465k;
        Integer numM125932Q;
        Integer numM125932Q2;
        Integer numM125932Q3;
        if (AttachmentUtilsKt.isImage(attachment)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            Integer numValueOf = Integer.valueOf(options.outWidth);
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            Integer numValueOf2 = Integer.valueOf(options.outHeight);
            return new C23465k(numValueOf, numValueOf2.intValue() > 0 ? numValueOf2 : null);
        }
        if (!AttachmentUtilsKt.isVideo(attachment)) {
            return new C23465k(null, null);
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                if (strExtractMetadata == null || (numM125932Q = AbstractC39421y.m125932Q(strExtractMetadata)) == null || numM125932Q.intValue() <= 0) {
                    numM125932Q = null;
                }
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (strExtractMetadata2 == null || (numM125932Q2 = AbstractC39421y.m125932Q(strExtractMetadata2)) == null || numM125932Q2.intValue() <= 0) {
                    numM125932Q2 = null;
                }
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                int iIntValue = (strExtractMetadata3 == null || (numM125932Q3 = AbstractC39421y.m125932Q(strExtractMetadata3)) == null) ? 0 : numM125932Q3.intValue();
                c23465k = (iIntValue == 90 || iIntValue == 270) ? new C23465k(numM125932Q2, numM125932Q) : new C23465k(numM125932Q, numM125932Q2);
            } catch (Exception unused) {
                c23465k = new C23465k(null, null);
            }
            return c23465k;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public final List<AttachmentMetaData> getFileMetadata() {
        return this.attachmentFilter.filterAttachments(this.storageHelper.getFileAttachments(this.context));
    }

    public final List<AttachmentMetaData> getMediaMetadata() {
        return this.attachmentFilter.filterAttachments(this.storageHelper.getMediaAttachments(this.context));
    }

    public final C23465k partitionResolvable(List<AttachmentMetaData> metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : metadata) {
            Uri uri = ((AttachmentMetaData) obj).getUri();
            if (uri != null ? this.storageHelper.isUriResolvable$stream_chat_android_ui_common_release(this.context, uri) : true) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new C23465k(arrayList, arrayList2);
    }

    public final Object resolveAttachmentFiles(List<Attachment> list, InterfaceC30057d<? super List<Attachment>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C196022(list, this, null), interfaceC30057d);
    }

    public final List<AttachmentMetaData> resolveMetadata(List<? extends Uri> uris) {
        AbstractC22676k.m65750j(uris, "uris");
        return this.attachmentFilter.filterAttachments(this.storageHelper.getAttachmentsFromUriList(this.context, uris));
    }

    public final List<Attachment> toAttachments(List<AttachmentMetaData> metaData) {
        AbstractC22676k.m65750j(metaData, "metaData");
        List<AttachmentMetaData> list = metaData;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (AttachmentMetaData attachmentMetaData : list) {
            C26463f c26463f = new C26463f();
            c26463f.putAll(attachmentMetaData.getExtraData());
            Uri uri = attachmentMetaData.getUri();
            if (uri != null) {
                String string = uri.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                c26463f.put(EXTRA_SOURCE_URI, string);
            }
            if (attachmentMetaData.getVideoLength() > 0) {
                c26463f.put(AttachmentExtensionsKt.EXTRA_DURATION, Float.valueOf(attachmentMetaData.getVideoLength()));
            }
            C26463f c26463fM78380b = c26463f.m78380b();
            String type = attachmentMetaData.getType();
            String title = attachmentMetaData.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList.add(new Attachment(null, null, null, null, null, null, null, attachmentMetaData.getMimeType(), (int) attachmentMetaData.getSize(), null, null, type, null, title, null, null, null, null, null, c26463fM78380b, 513663, null));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AttachmentStorageHelper(Context context, StorageHelper storageHelper, AttachmentFilter attachmentFilter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? new StorageHelper() : storageHelper, (i13 & 4) != 0 ? new AttachmentFilter(null, 1, 0 == true ? 1 : 0) : attachmentFilter);
    }
}
