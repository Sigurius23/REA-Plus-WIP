package io.getstream.chat.android.client.attachment;

import android.webkit.MimeTypeMap;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.uploader.StreamCdnImageMimeTypes;
import io.getstream.chat.android.client.utils.ProgressCallback;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.UploadedFile;
import java.io.File;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.InterfaceC27474d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import x83.AbstractC38093j;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014JP\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001f\u001a\u00020\r*\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u0010*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b!\u0010\"J:\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0087@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/AttachmentUploader;", "", "Lio/getstream/chat/android/client/ChatClient;", "client", "<init>", "(Lio/getstream/chat/android/client/ChatClient;)V", "", "channelType", "channelId", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "progressCallback", "Lio/getstream/chat/android/models/Attachment;", "attachment", "mimeType", "Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;", "attachmentType", "Ln23/h;", "uploadImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lq83/d;)Ljava/lang/Object;", "uploadFile", "augmentedAttachment", "onSuccessfulUpload", "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;", "Ln23/f;", "result", "onFailedUpload", "(Lio/getstream/chat/android/models/Attachment;Ln23/f;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;", "Lio/getstream/chat/android/models/UploadedFile;", "uploadedFile", "augmentAttachmentOnSuccess", "(Lio/getstream/chat/android/models/Attachment;Ljava/io/File;Ljava/lang/String;Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;Lio/getstream/chat/android/models/UploadedFile;)Lio/getstream/chat/android/models/Attachment;", "toAttachmentType", "(Ljava/lang/String;)Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;", "uploadAttachment", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "AttachmentType", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentUploader {
    private final ChatClient client;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/AttachmentUploader$AttachmentType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "IMAGE", "VIDEO", "FILE", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum AttachmentType {
        IMAGE("image"),
        VIDEO("video"),
        FILE("file");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String value;

        AttachmentType(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.AttachmentUploader$uploadFile$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.AttachmentUploader", m100430f = "AttachmentUploader.kt", m100431l = {172}, m100432m = "uploadFile")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190551 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C190551(InterfaceC30057d<? super C190551> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AttachmentUploader.this.uploadFile(null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.AttachmentUploader$uploadImage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.AttachmentUploader", m100430f = "AttachmentUploader.kt", m100431l = {116}, m100432m = "uploadImage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190561 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C190561(InterfaceC30057d<? super C190561> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AttachmentUploader.this.uploadImage(null, null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentUploader() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Attachment augmentAttachmentOnSuccess(Attachment attachment, File file, String str, AttachmentType attachmentType, UploadedFile uploadedFile) {
        String file2;
        String name = file.getName();
        int length = (int) file.length();
        Attachment.UploadState.Success success = Attachment.UploadState.Success.INSTANCE;
        String title = attachment.getTitle();
        if (title == null || AbstractC39414r.m125890i0(title)) {
            title = null;
        }
        if (title == null) {
            title = file.getName();
        }
        String str2 = title;
        String thumbUrl = uploadedFile.getThumbUrl();
        String type = attachment.getType();
        if (type == null) {
            type = attachmentType.toString();
        }
        String str3 = type;
        int i13 = WhenMappings.$EnumSwitchMapping$0[attachmentType.ordinal()];
        if (i13 != 1) {
            file2 = i13 != 2 ? attachment.getImageUrl() : uploadedFile.getThumbUrl();
        } else {
            file2 = uploadedFile.getFile();
        }
        return Attachment.copy$default(attachment, null, null, null, thumbUrl, file2, uploadedFile.getFile(), null, str, length, str2, null, str3, null, name, null, null, null, null, success, AbstractC25247g0.m73991Z(AttachmentExtensionsKt.EXTRA_UPLOAD_ID, AbstractC25247g0.m73995d0(attachment.getExtraData(), uploadedFile.getExtraData())), 250951, null);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final AbstractC26205h onFailedUpload(Attachment attachment, C26203f result, ProgressCallback progressCallback) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onFailedUpload] #uploader; attachment " + AttachmentExtensionsKt.getUploadId(attachment) + " upload failed: " + result.f103918a, null);
        }
        if (progressCallback != null) {
            progressCallback.onError(result.f103918a);
        }
        return new C26203f(result.f103918a);
    }

    private final AbstractC26205h onSuccessfulUpload(Attachment augmentedAttachment, ProgressCallback progressCallback) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[onSuccessfulUpload] #uploader; attachment ", AttachmentExtensionsKt.getUploadId(augmentedAttachment), " uploaded successfully"), null);
        }
        if (progressCallback != null) {
            progressCallback.onSuccess(augmentedAttachment.getAssetUrl());
        }
        return new C26204g(Attachment.copy$default(augmentedAttachment, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, Attachment.UploadState.Success.INSTANCE, null, 786431, null));
    }

    private final AttachmentType toAttachmentType(String str) {
        if (str == null) {
            return AttachmentType.FILE;
        }
        if (StreamCdnImageMimeTypes.INSTANCE.isImageMimeTypeSupported(str)) {
            return AttachmentType.IMAGE;
        }
        return AbstractC39414r.m125876U(str, "video", false) ? AttachmentType.VIDEO : AttachmentType.FILE;
    }

    public static /* synthetic */ Object uploadAttachment$default(AttachmentUploader attachmentUploader, String str, String str2, Attachment attachment, ProgressCallback progressCallback, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            progressCallback = null;
        }
        return attachmentUploader.uploadAttachment(str, str2, attachment, progressCallback, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final Object uploadFile(String str, String str2, File file, ProgressCallback progressCallback, Attachment attachment, String str3, AttachmentType attachmentType, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C190551 c190551;
        String str4;
        File file2 = file;
        ProgressCallback progressCallback2 = progressCallback;
        Attachment attachment2 = attachment;
        AttachmentType attachmentType2 = attachmentType;
        if (interfaceC30057d instanceof C190551) {
            c190551 = (C190551) interfaceC30057d;
            int i13 = c190551.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c190551.label = i13 - Integer.MIN_VALUE;
            } else {
                c190551 = new C190551(interfaceC30057d);
            }
        } else {
            c190551 = new C190551(interfaceC30057d);
        }
        Object objAwait = c190551.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c190551.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str5 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                logger.f9274b.log(enumC2341g, str5, "[uploadFile] #uploader; mimeType: " + str3 + ", attachmentType: " + attachmentType2 + ", file: " + file2 + ", cid: " + str + ":$" + str2 + ", attachment: " + attachment2, null);
            }
            InterfaceC27474d interfaceC27474dSendFile = this.client.sendFile(str, str2, file2, progressCallback2);
            c190551.L$0 = null;
            c190551.L$1 = null;
            c190551.L$2 = file2;
            c190551.L$3 = progressCallback2;
            c190551.L$4 = attachment2;
            c190551.L$5 = str3;
            c190551.L$6 = attachmentType2;
            c190551.label = 1;
            objAwait = interfaceC27474dSendFile.await(c190551);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
            str4 = str3;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AttachmentType attachmentType3 = (AttachmentType) c190551.L$6;
            str4 = (String) c190551.L$5;
            Attachment attachment3 = (Attachment) c190551.L$4;
            progressCallback2 = (ProgressCallback) c190551.L$3;
            File file3 = (File) c190551.L$2;
            AbstractC34132o.m107864I(objAwait);
            attachment2 = attachment3;
            file2 = file3;
            attachmentType2 = attachmentType3;
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str6 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str6)) {
            logger2.f9274b.log(enumC2341g2, str6, "[uploadFile] #uploader; result: " + abstractC26205h, null);
        }
        if (!(abstractC26205h instanceof C26204g)) {
            Attachment attachment4 = attachment2;
            if (abstractC26205h instanceof C26203f) {
                return onFailedUpload(attachment4, (C26203f) abstractC26205h, progressCallback2);
            }
            throw new NoWhenBranchMatchedException();
        }
        return onSuccessfulUpload(augmentAttachmentOnSuccess(attachment2, file2, str4, attachmentType2, (UploadedFile) ((C26204g) abstractC26205h).f103919a), progressCallback2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final Object uploadImage(String str, String str2, File file, ProgressCallback progressCallback, Attachment attachment, String str3, AttachmentType attachmentType, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C190561 c190561;
        String str4;
        File file2 = file;
        ProgressCallback progressCallback2 = progressCallback;
        Attachment attachment2 = attachment;
        AttachmentType attachmentType2 = attachmentType;
        if (interfaceC30057d instanceof C190561) {
            c190561 = (C190561) interfaceC30057d;
            int i13 = c190561.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c190561.label = i13 - Integer.MIN_VALUE;
            } else {
                c190561 = new C190561(interfaceC30057d);
            }
        } else {
            c190561 = new C190561(interfaceC30057d);
        }
        Object objAwait = c190561.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c190561.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str5 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                logger.f9274b.log(enumC2341g, str5, "[uploadImage] #uploader; mimeType: " + str3 + ", attachmentType: " + attachmentType2 + ", file: " + file2 + ", cid: " + str + ":$" + str2 + ", attachment: " + attachment2, null);
            }
            InterfaceC27474d interfaceC27474dSendImage = this.client.sendImage(str, str2, file2, progressCallback2);
            c190561.L$0 = null;
            c190561.L$1 = null;
            c190561.L$2 = file2;
            c190561.L$3 = progressCallback2;
            c190561.L$4 = attachment2;
            c190561.L$5 = str3;
            c190561.L$6 = attachmentType2;
            c190561.label = 1;
            objAwait = interfaceC27474dSendImage.await(c190561);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
            str4 = str3;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AttachmentType attachmentType3 = (AttachmentType) c190561.L$6;
            str4 = (String) c190561.L$5;
            Attachment attachment3 = (Attachment) c190561.L$4;
            progressCallback2 = (ProgressCallback) c190561.L$3;
            File file3 = (File) c190561.L$2;
            AbstractC34132o.m107864I(objAwait);
            attachment2 = attachment3;
            file2 = file3;
            attachmentType2 = attachmentType3;
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str6 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str6)) {
            logger2.f9274b.log(enumC2341g2, str6, "[uploadImage] #uploader; result: " + abstractC26205h, null);
        }
        if (!(abstractC26205h instanceof C26204g)) {
            Attachment attachment4 = attachment2;
            if (abstractC26205h instanceof C26203f) {
                return onFailedUpload(attachment4, (C26203f) abstractC26205h, progressCallback2);
            }
            throw new NoWhenBranchMatchedException();
        }
        return onSuccessfulUpload(augmentAttachmentOnSuccess(attachment2, file2, str4, attachmentType2, (UploadedFile) ((C26204g) abstractC26205h).f103919a), progressCallback2);
    }

    @InternalStreamChatApi
    public final Object uploadAttachment(String str, String str2, Attachment attachment, ProgressCallback progressCallback, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        File upload = attachment.getUpload();
        if (upload == null) {
            throw new IllegalStateException("An attachment needs to have a non null attachment.upload value");
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(AbstractC38093j.m122039m(upload));
        if (mimeTypeFromExtension == null && (mimeTypeFromExtension = attachment.getMimeType()) == null) {
            mimeTypeFromExtension = "";
        }
        String str3 = mimeTypeFromExtension;
        AttachmentType attachmentType = toAttachmentType(str3);
        if (attachmentType == AttachmentType.IMAGE) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str4 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                logger.f9274b.log(enumC2341g, str4, AbstractC11895b.m31996o("[uploadAttachment] #uploader; uploading ", AttachmentExtensionsKt.getUploadId(attachment), " as image"), null);
            }
            return uploadImage(str, str2, upload, progressCallback, attachment, str3, attachmentType, interfaceC30057d);
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str5 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str5)) {
            logger2.f9274b.log(enumC2341g2, str5, AbstractC11895b.m31996o("[uploadAttachment] #uploader; uploading ", AttachmentExtensionsKt.getUploadId(attachment), " as file"), null);
        }
        return uploadFile(str, str2, upload, progressCallback, attachment, str3, attachmentType, interfaceC30057d);
    }

    public AttachmentUploader(ChatClient client) {
        AbstractC22676k.m65750j(client, "client");
        this.client = client;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:Uploader");
    }

    public /* synthetic */ AttachmentUploader(ChatClient chatClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChatClient.INSTANCE.instance() : chatClient);
    }
}
