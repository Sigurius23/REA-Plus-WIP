package io.getstream.chat.android.p226ui.common.helper.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.models.FileUploadConfig;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import p479s4.AbstractC32128i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;", "", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "<init>", "(Lio/getstream/chat/android/client/ChatClient;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "attachment", "", "", "allowedFileExtensions", "", "allowedMimeTypes", "blockedFileExtensions", "blockedMimeTypes", "", "matchesUploadConfig", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;)Z", "fileExtensions", "mimeTypes", "matchesFileExtensionOrMimeType", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;)Z", "matchesMimeType", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;[Ljava/lang/String;)Z", "matchesFileExtension", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;)Z", "attachments", "filterAttachments", "(Ljava/util/List;)Ljava/util/List;", "getSupportedMimeTypes", "()Ljava/util/List;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentFilter {
    public static final int $stable = 8;
    private final ChatClient chatClient;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentFilter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final boolean matchesFileExtension(AttachmentMetaData attachment, List<String> fileExtensions) {
        List<String> list = fileExtensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String title = attachment.getTitle();
            if (title != null ? AbstractC39421y.m125920E(title, str, true) : false) {
                return true;
            }
        }
        return false;
    }

    private final boolean matchesFileExtensionOrMimeType(AttachmentMetaData attachment, List<String> fileExtensions, String[] mimeTypes) {
        return matchesFileExtension(attachment, fileExtensions) || matchesMimeType(attachment, mimeTypes);
    }

    private final boolean matchesMimeType(AttachmentMetaData attachment, String[] mimeTypes) {
        try {
            return AbstractC32128i.m100059n(attachment.getMimeType(), mimeTypes) != null;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:21:0x002b  */
    private final boolean matchesUploadConfig(AttachmentMetaData attachment, List<String> allowedFileExtensions, String[] allowedMimeTypes, List<String> blockedFileExtensions, String[] blockedMimeTypes) {
        boolean z4;
        boolean z13;
        if (allowedFileExtensions.isEmpty()) {
            if (allowedMimeTypes.length == 0) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = true;
        }
        if (blockedFileExtensions.isEmpty()) {
            if (blockedMimeTypes.length == 0) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else {
            z13 = true;
        }
        if (z4) {
            return matchesFileExtensionOrMimeType(attachment, allowedFileExtensions, allowedMimeTypes);
        }
        return (z13 && matchesFileExtensionOrMimeType(attachment, blockedFileExtensions, blockedMimeTypes)) ? false : true;
    }

    public final List<AttachmentMetaData> filterAttachments(List<AttachmentMetaData> attachments) {
        AttachmentFilter attachmentFilter = this;
        AbstractC22676k.m65750j(attachments, "attachments");
        FileUploadConfig fileUploadConfig = attachmentFilter.chatClient.getAppSettings().getApp().getFileUploadConfig();
        List<String> allowedFileExtensions = fileUploadConfig.getAllowedFileExtensions();
        String[] strArr = (String[]) fileUploadConfig.getAllowedMimeTypes().toArray(new String[0]);
        List<String> blockedFileExtensions = fileUploadConfig.getBlockedFileExtensions();
        String[] strArr2 = (String[]) fileUploadConfig.getBlockedMimeTypes().toArray(new String[0]);
        FileUploadConfig imageUploadConfig = attachmentFilter.chatClient.getAppSettings().getApp().getImageUploadConfig();
        List<String> allowedFileExtensions2 = imageUploadConfig.getAllowedFileExtensions();
        String[] strArr3 = (String[]) imageUploadConfig.getAllowedMimeTypes().toArray(new String[0]);
        List<String> blockedFileExtensions2 = imageUploadConfig.getBlockedFileExtensions();
        String[] strArr4 = (String[]) imageUploadConfig.getBlockedMimeTypes().toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            AttachmentMetaData attachmentMetaData = (AttachmentMetaData) obj;
            boolean zM65745e = AbstractC22676k.m65745e(attachmentMetaData.getType(), "image");
            List<String> list = allowedFileExtensions;
            if (attachmentFilter.matchesUploadConfig(attachmentMetaData, zM65745e ? allowedFileExtensions2 : allowedFileExtensions, zM65745e ? strArr3 : strArr, zM65745e ? blockedFileExtensions2 : blockedFileExtensions, zM65745e ? strArr4 : strArr2)) {
                arrayList.add(obj);
            }
            attachmentFilter = this;
            allowedFileExtensions = list;
        }
        return arrayList;
    }

    public final List<String> getSupportedMimeTypes() {
        List<String> listM118958J = AbstractC37056f.m118958J("*/*");
        FileUploadConfig fileUploadConfig = this.chatClient.getAppSettings().getApp().getFileUploadConfig();
        FileUploadConfig imageUploadConfig = this.chatClient.getAppSettings().getApp().getImageUploadConfig();
        String[] strArr = (String[]) fileUploadConfig.getAllowedMimeTypes().toArray(new String[0]);
        String[] strArr2 = (String[]) imageUploadConfig.getAllowedMimeTypes().toArray(new String[0]);
        String[] strArr3 = (String[]) fileUploadConfig.getBlockedMimeTypes().toArray(new String[0]);
        String[] strArr4 = (String[]) imageUploadConfig.getBlockedMimeTypes().toArray(new String[0]);
        String[] strArr5 = (String[]) AbstractC25260n.m74032H0(strArr, strArr2);
        String[] strArr6 = (String[]) AbstractC25260n.m74032H0(strArr3, strArr4);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr5) {
            if (!AbstractC25260n.m74056a0(strArr6, str)) {
                arrayList.add(str);
            }
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str2 = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, "Supported MIME types: " + arrayList, null);
        }
        if (!arrayList.isEmpty()) {
            listM118958J = arrayList;
        }
        return listM118958J;
    }

    public AttachmentFilter(ChatClient chatClient) {
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.chatClient = chatClient;
        this.logger = AbstractC1772c1.m5382S(this, "AttachmentFilter");
    }

    public /* synthetic */ AttachmentFilter(ChatClient chatClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChatClient.INSTANCE.instance() : chatClient);
    }
}
