package io.getstream.chat.android.p226ui.common.state.messages.composer;

import android.content.Context;
import android.net.Uri;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.internal.file.ShareableUriProvider;
import io.getstream.chat.android.p226ui.common.utils.Utils;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0013J\u0012\u0010<\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003J[\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0001J\u0013\u0010D\u001a\u00020/2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u000204HÖ\u0001J\t\u0010G\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-¨\u0006H"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "", "uri", "Landroid/net/Uri;", "type", "", "mimeType", "title", "file", "Ljava/io/File;", "extraData", "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/util/Map;)V", "attachment", "Lio/getstream/chat/android/models/Attachment;", "(Lio/getstream/chat/android/models/Attachment;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/io/File;)V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getMimeType", "setMimeType", "getTitle", "setTitle", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "getExtraData", "()Ljava/util/Map;", "setExtraData", "(Ljava/util/Map;)V", "size", "", "getSize", "()J", "setSize", "(J)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "videoLength", "getVideoLength", "setVideoLength", "getTypeFromMimeType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentMetaData {
    public static final int $stable = 8;
    private Map<String, ? extends Object> extraData;
    private File file;
    private boolean isSelected;
    private String mimeType;
    private int selectedPosition;
    private long size;
    private String title;
    private String type;
    private Uri uri;
    private long videoLength;

    public AttachmentMetaData() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachmentMetaData copy$default(AttachmentMetaData attachmentMetaData, Uri uri, String str, String str2, String str3, File file, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uri = attachmentMetaData.uri;
        }
        if ((i13 & 2) != 0) {
            str = attachmentMetaData.type;
        }
        if ((i13 & 4) != 0) {
            str2 = attachmentMetaData.mimeType;
        }
        if ((i13 & 8) != 0) {
            str3 = attachmentMetaData.title;
        }
        if ((i13 & 16) != 0) {
            file = attachmentMetaData.file;
        }
        if ((i13 & 32) != 0) {
            map = attachmentMetaData.extraData;
        }
        File file2 = file;
        Map map2 = map;
        return attachmentMetaData.copy(uri, str, str2, str3, file2, map2);
    }

    private final String getTypeFromMimeType(String mimeType) {
        if (mimeType == null) {
            return "file";
        }
        if (AbstractC39414r.m125876U(mimeType, "image", false)) {
            return "image";
        }
        return AbstractC39414r.m125876U(mimeType, "video", false) ? "video" : "file";
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public final Map<String, Object> component6() {
        return this.extraData;
    }

    public final AttachmentMetaData copy(Uri uri, String type, String mimeType, String title, File file, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        return new AttachmentMetaData(uri, type, mimeType, title, file, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentMetaData)) {
            return false;
        }
        AttachmentMetaData attachmentMetaData = (AttachmentMetaData) other;
        return AbstractC22676k.m65745e(this.uri, attachmentMetaData.uri) && AbstractC22676k.m65745e(this.type, attachmentMetaData.type) && AbstractC22676k.m65745e(this.mimeType, attachmentMetaData.mimeType) && AbstractC22676k.m65745e(this.title, attachmentMetaData.title) && AbstractC22676k.m65745e(this.file, attachmentMetaData.file) && AbstractC22676k.m65745e(this.extraData, attachmentMetaData.extraData);
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final long getVideoLength() {
        return this.videoLength;
    }

    public final int hashCode() {
        Uri uri = this.uri;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        File file = this.file;
        return this.extraData.hashCode() + ((iHashCode4 + (file != null ? file.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setExtraData(Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(map, "<set-?>");
        this.extraData = map;
    }

    public final void setFile(File file) {
        this.file = file;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setSelected(boolean z4) {
        this.isSelected = z4;
    }

    public final void setSelectedPosition(int i13) {
        this.selectedPosition = i13;
    }

    public final void setSize(long j7) {
        this.size = j7;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUri(Uri uri) {
        this.uri = uri;
    }

    public final void setVideoLength(long j7) {
        this.videoLength = j7;
    }

    public final String toString() {
        Uri uri = this.uri;
        String str = this.type;
        String str2 = this.mimeType;
        String str3 = this.title;
        File file = this.file;
        Map<String, ? extends Object> map = this.extraData;
        StringBuilder sb4 = new StringBuilder("AttachmentMetaData(uri=");
        sb4.append(uri);
        sb4.append(", type=");
        sb4.append(str);
        sb4.append(", mimeType=");
        AbstractC11266d.m30444B(sb4, str2, ", title=", str3, ", file=");
        sb4.append(file);
        sb4.append(", extraData=");
        sb4.append(map);
        sb4.append(")");
        return sb4.toString();
    }

    public AttachmentMetaData(Uri uri, String str, String str2, String str3, File file, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        this.uri = uri;
        this.type = str;
        this.mimeType = str2;
        this.title = str3;
        this.file = file;
        this.extraData = extraData;
    }

    public /* synthetic */ AttachmentMetaData(Uri uri, String str, String str2, String str3, File file, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : uri, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : file, (i13 & 32) != 0 ? C25272z.f99163w : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttachmentMetaData(Attachment attachment) {
        this(null, attachment.getType(), attachment.getMimeType(), attachment.getTitle(), null, null, 49, null);
        AbstractC22676k.m65750j(attachment, "attachment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttachmentMetaData(Context context, File file) {
        this(new ShareableUriProvider().getUriForFile(context, file), null, null, null, file, null, 46, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(file, "file");
        Locale locale = Utils.locale;
        String mimeType = Utils.getMimeType(file.getPath());
        this.mimeType = mimeType;
        this.type = getTypeFromMimeType(mimeType);
        this.size = file.length();
        this.title = file.getName();
    }
}
