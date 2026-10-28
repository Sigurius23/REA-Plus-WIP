package io.getstream.chat.android.p226ui.feature.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010\u0018J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 JÆ\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010 J\u0010\u00104\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b4\u0010\u0018J\u001a\u00107\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b\b\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b?\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b@\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bA\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bB\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bC\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bF\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bG\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\bH\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\bI\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\bJ\u0010 ¨\u0006K"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "Landroid/os/Parcelable;", "", "messageId", "parentId", "cid", "userName", "", "isMine", "authorName", "authorLink", "imageUrl", "assetUrl", "mimeType", "", "fileSize", "title", "text", "type", "image", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId", "getParentId", "getCid", "getUserName", "Z", "getAuthorName", "getAuthorLink", "getImageUrl", "getAssetUrl", "getMimeType", "I", "getFileSize", "getTitle", "getText", "getType", "getImage", "getName", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentGalleryResultItem implements Parcelable {
    public static final Parcelable.Creator<AttachmentGalleryResultItem> CREATOR = new Creator();
    private final String assetUrl;
    private final String authorLink;
    private final String authorName;
    private final String cid;
    private final int fileSize;
    private final String image;
    private final String imageUrl;
    private final boolean isMine;
    private final String messageId;
    private final String mimeType;
    private final String name;
    private final String parentId;
    private final String text;
    private final String title;
    private final String type;
    private final String userName;

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<AttachmentGalleryResultItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachmentGalleryResultItem createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new AttachmentGalleryResultItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachmentGalleryResultItem[] newArray(int i13) {
            return new AttachmentGalleryResultItem[i13];
        }

        @Override // android.os.Parcelable.Creator
        public final AttachmentGalleryResultItem[] newArray(int i13) {
            return new AttachmentGalleryResultItem[i13];
        }
    }

    public AttachmentGalleryResultItem(String messageId, String str, String cid, String userName, boolean z4, String str2, String str3, String str4, String str5, String str6, int i13, String str7, String str8, String str9, String str10, String str11) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(userName, "userName");
        this.messageId = messageId;
        this.parentId = str;
        this.cid = cid;
        this.userName = userName;
        this.isMine = z4;
        this.authorName = str2;
        this.authorLink = str3;
        this.imageUrl = str4;
        this.assetUrl = str5;
        this.mimeType = str6;
        this.fileSize = i13;
        this.title = str7;
        this.text = str8;
        this.type = str9;
        this.image = str10;
        this.name = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsMine() {
        return this.isMine;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAuthorLink() {
        return this.authorLink;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    public final AttachmentGalleryResultItem copy(String messageId, String parentId, String cid, String userName, boolean isMine, String authorName, String authorLink, String imageUrl, String assetUrl, String mimeType, int fileSize, String title, String text, String type, String image, String name) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(userName, "userName");
        return new AttachmentGalleryResultItem(messageId, parentId, cid, userName, isMine, authorName, authorLink, imageUrl, assetUrl, mimeType, fileSize, title, text, type, image, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentGalleryResultItem)) {
            return false;
        }
        AttachmentGalleryResultItem attachmentGalleryResultItem = (AttachmentGalleryResultItem) other;
        return AbstractC22676k.m65745e(this.messageId, attachmentGalleryResultItem.messageId) && AbstractC22676k.m65745e(this.parentId, attachmentGalleryResultItem.parentId) && AbstractC22676k.m65745e(this.cid, attachmentGalleryResultItem.cid) && AbstractC22676k.m65745e(this.userName, attachmentGalleryResultItem.userName) && this.isMine == attachmentGalleryResultItem.isMine && AbstractC22676k.m65745e(this.authorName, attachmentGalleryResultItem.authorName) && AbstractC22676k.m65745e(this.authorLink, attachmentGalleryResultItem.authorLink) && AbstractC22676k.m65745e(this.imageUrl, attachmentGalleryResultItem.imageUrl) && AbstractC22676k.m65745e(this.assetUrl, attachmentGalleryResultItem.assetUrl) && AbstractC22676k.m65745e(this.mimeType, attachmentGalleryResultItem.mimeType) && this.fileSize == attachmentGalleryResultItem.fileSize && AbstractC22676k.m65745e(this.title, attachmentGalleryResultItem.title) && AbstractC22676k.m65745e(this.text, attachmentGalleryResultItem.text) && AbstractC22676k.m65745e(this.type, attachmentGalleryResultItem.type) && AbstractC22676k.m65745e(this.image, attachmentGalleryResultItem.image) && AbstractC22676k.m65745e(this.name, attachmentGalleryResultItem.name);
    }

    public final String getAssetUrl() {
        return this.assetUrl;
    }

    public final String getAuthorLink() {
        return this.authorLink;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getCid() {
        return this.cid;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int hashCode() {
        int iHashCode = this.messageId.hashCode() * 31;
        String str = this.parentId;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.cid), 31, this.userName), 31, this.isMine);
        String str2 = this.authorName;
        int iHashCode2 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.assetUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mimeType;
        int iM30448b = AbstractC11266d.m30448b(this.fileSize, (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.title;
        int iHashCode6 = (iM30448b + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.text;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.type;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.image;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.name;
        return iHashCode9 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isMine() {
        return this.isMine;
    }

    public final String toString() {
        String str = this.messageId;
        String str2 = this.parentId;
        String str3 = this.cid;
        String str4 = this.userName;
        boolean z4 = this.isMine;
        String str5 = this.authorName;
        String str6 = this.authorLink;
        String str7 = this.imageUrl;
        String str8 = this.assetUrl;
        String str9 = this.mimeType;
        int i13 = this.fileSize;
        String str10 = this.title;
        String str11 = this.text;
        String str12 = this.type;
        String str13 = this.image;
        String str14 = this.name;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AttachmentGalleryResultItem(messageId=", str, ", parentId=", str2, ", cid=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", userName=", str4, ", isMine=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", authorName=", str5, ", authorLink=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", imageUrl=", str7, ", assetUrl=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", mimeType=", str9, ", fileSize=");
        AbstractC11895b.m31979B(i13, ", title=", str10, ", text=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str11, ", type=", str12, ", image=");
        return AbstractC11266d.m30464r(sbM32001t, str13, ", name=", str14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.messageId);
        dest.writeString(this.parentId);
        dest.writeString(this.cid);
        dest.writeString(this.userName);
        dest.writeInt(this.isMine ? 1 : 0);
        dest.writeString(this.authorName);
        dest.writeString(this.authorLink);
        dest.writeString(this.imageUrl);
        dest.writeString(this.assetUrl);
        dest.writeString(this.mimeType);
        dest.writeInt(this.fileSize);
        dest.writeString(this.title);
        dest.writeString(this.text);
        dest.writeString(this.type);
        dest.writeString(this.image);
        dest.writeString(this.name);
    }

    public /* synthetic */ AttachmentGalleryResultItem(String str, String str2, String str3, String str4, boolean z4, String str5, String str6, String str7, String str8, String str9, int i13, String str10, String str11, String str12, String str13, String str14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? false : z4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : str9, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str10, (i14 & 4096) != 0 ? null : str11, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str12, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str13, (i14 & 32768) != 0 ? null : str14);
    }
}
