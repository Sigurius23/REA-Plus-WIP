package io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal;

import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \\2\u00020\u0001:\u0001\\Bé\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u000eHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010S\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0015\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001bHÆ\u0003J\u009a\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u000eHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b7\u00103\"\u0004\b8\u00105R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006]"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;", "", "id", "", "messageId", "authorName", "titleLink", "authorLink", "thumbUrl", "imageUrl", "assetUrl", "ogUrl", "mimeType", "fileSize", "", "title", "text", "type", "image", "name", "fallback", "uploadFilePath", "originalHeight", "originalWidth", "uploadState", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getMessageId", "getAuthorName", "getTitleLink", "getAuthorLink", "getThumbUrl", "getImageUrl", "getAssetUrl", "getOgUrl", "getMimeType", "getFileSize", "()I", "getTitle", "getText", "getType", "getImage", "getName", "getFallback", "getUploadFilePath", "getOriginalHeight", "()Ljava/lang/Integer;", "setOriginalHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOriginalWidth", "setOriginalWidth", "getUploadState", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;", "setUploadState", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;)V", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;", "equals", "", "other", "hashCode", "toString", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReplyAttachmentEntity {
    public static final String REPLY_ATTACHMENT_ENTITY_TABLE_NAME = "reply_attachment_inner_entity";
    private final String assetUrl;
    private final String authorLink;
    private final String authorName;
    private final Map<String, Object> extraData;
    private final String fallback;
    private final int fileSize;
    private final String id;
    private final String image;
    private final String imageUrl;
    private final String messageId;
    private final String mimeType;
    private final String name;
    private final String ogUrl;
    private Integer originalHeight;
    private Integer originalWidth;
    private final String text;
    private final String thumbUrl;
    private final String title;
    private final String titleLink;
    private final String type;
    private final String uploadFilePath;
    private UploadStateEntity uploadState;

    public ReplyAttachmentEntity(String id4, String messageId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, Integer num2, UploadStateEntity uploadStateEntity, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.messageId = messageId;
        this.authorName = str;
        this.titleLink = str2;
        this.authorLink = str3;
        this.thumbUrl = str4;
        this.imageUrl = str5;
        this.assetUrl = str6;
        this.ogUrl = str7;
        this.mimeType = str8;
        this.fileSize = i13;
        this.title = str9;
        this.text = str10;
        this.type = str11;
        this.image = str12;
        this.name = str13;
        this.fallback = str14;
        this.uploadFilePath = str15;
        this.originalHeight = num;
        this.originalWidth = num2;
        this.uploadState = uploadStateEntity;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReplyAttachmentEntity copy$default(ReplyAttachmentEntity replyAttachmentEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, Integer num2, UploadStateEntity uploadStateEntity, Map map, int i14, Object obj) {
        Map map2;
        UploadStateEntity uploadStateEntity2;
        String str18 = (i14 & 1) != 0 ? replyAttachmentEntity.id : str;
        String str19 = (i14 & 2) != 0 ? replyAttachmentEntity.messageId : str2;
        String str20 = (i14 & 4) != 0 ? replyAttachmentEntity.authorName : str3;
        String str21 = (i14 & 8) != 0 ? replyAttachmentEntity.titleLink : str4;
        String str22 = (i14 & 16) != 0 ? replyAttachmentEntity.authorLink : str5;
        String str23 = (i14 & 32) != 0 ? replyAttachmentEntity.thumbUrl : str6;
        String str24 = (i14 & 64) != 0 ? replyAttachmentEntity.imageUrl : str7;
        String str25 = (i14 & 128) != 0 ? replyAttachmentEntity.assetUrl : str8;
        String str26 = (i14 & 256) != 0 ? replyAttachmentEntity.ogUrl : str9;
        String str27 = (i14 & 512) != 0 ? replyAttachmentEntity.mimeType : str10;
        int i15 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? replyAttachmentEntity.fileSize : i13;
        String str28 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? replyAttachmentEntity.title : str11;
        String str29 = (i14 & 4096) != 0 ? replyAttachmentEntity.text : str12;
        String str30 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? replyAttachmentEntity.type : str13;
        String str31 = str18;
        String str32 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? replyAttachmentEntity.image : str14;
        String str33 = (i14 & 32768) != 0 ? replyAttachmentEntity.name : str15;
        String str34 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? replyAttachmentEntity.fallback : str16;
        String str35 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? replyAttachmentEntity.uploadFilePath : str17;
        Integer num3 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? replyAttachmentEntity.originalHeight : num;
        Integer num4 = (i14 & 524288) != 0 ? replyAttachmentEntity.originalWidth : num2;
        UploadStateEntity uploadStateEntity3 = (i14 & 1048576) != 0 ? replyAttachmentEntity.uploadState : uploadStateEntity;
        if ((i14 & 2097152) != 0) {
            uploadStateEntity2 = uploadStateEntity3;
            map2 = replyAttachmentEntity.extraData;
        } else {
            map2 = map;
            uploadStateEntity2 = uploadStateEntity3;
        }
        return replyAttachmentEntity.copy(str31, str19, str20, str21, str22, str23, str24, str25, str26, str27, i15, str28, str29, str30, str32, str33, str34, str35, num3, num4, uploadStateEntity2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUploadFilePath() {
        return this.uploadFilePath;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getOriginalHeight() {
        return this.originalHeight;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getOriginalWidth() {
        return this.originalWidth;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final UploadStateEntity getUploadState() {
        return this.uploadState;
    }

    public final Map<String, Object> component22() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitleLink() {
        return this.titleLink;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAuthorLink() {
        return this.authorLink;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOgUrl() {
        return this.ogUrl;
    }

    public final ReplyAttachmentEntity copy(String id4, String messageId, String authorName, String titleLink, String authorLink, String thumbUrl, String imageUrl, String assetUrl, String ogUrl, String mimeType, int fileSize, String title, String text, String type, String image, String name, String fallback, String uploadFilePath, Integer originalHeight, Integer originalWidth, UploadStateEntity uploadState, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new ReplyAttachmentEntity(id4, messageId, authorName, titleLink, authorLink, thumbUrl, imageUrl, assetUrl, ogUrl, mimeType, fileSize, title, text, type, image, name, fallback, uploadFilePath, originalHeight, originalWidth, uploadState, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyAttachmentEntity)) {
            return false;
        }
        ReplyAttachmentEntity replyAttachmentEntity = (ReplyAttachmentEntity) other;
        return AbstractC22676k.m65745e(this.id, replyAttachmentEntity.id) && AbstractC22676k.m65745e(this.messageId, replyAttachmentEntity.messageId) && AbstractC22676k.m65745e(this.authorName, replyAttachmentEntity.authorName) && AbstractC22676k.m65745e(this.titleLink, replyAttachmentEntity.titleLink) && AbstractC22676k.m65745e(this.authorLink, replyAttachmentEntity.authorLink) && AbstractC22676k.m65745e(this.thumbUrl, replyAttachmentEntity.thumbUrl) && AbstractC22676k.m65745e(this.imageUrl, replyAttachmentEntity.imageUrl) && AbstractC22676k.m65745e(this.assetUrl, replyAttachmentEntity.assetUrl) && AbstractC22676k.m65745e(this.ogUrl, replyAttachmentEntity.ogUrl) && AbstractC22676k.m65745e(this.mimeType, replyAttachmentEntity.mimeType) && this.fileSize == replyAttachmentEntity.fileSize && AbstractC22676k.m65745e(this.title, replyAttachmentEntity.title) && AbstractC22676k.m65745e(this.text, replyAttachmentEntity.text) && AbstractC22676k.m65745e(this.type, replyAttachmentEntity.type) && AbstractC22676k.m65745e(this.image, replyAttachmentEntity.image) && AbstractC22676k.m65745e(this.name, replyAttachmentEntity.name) && AbstractC22676k.m65745e(this.fallback, replyAttachmentEntity.fallback) && AbstractC22676k.m65745e(this.uploadFilePath, replyAttachmentEntity.uploadFilePath) && AbstractC22676k.m65745e(this.originalHeight, replyAttachmentEntity.originalHeight) && AbstractC22676k.m65745e(this.originalWidth, replyAttachmentEntity.originalWidth) && AbstractC22676k.m65745e(this.uploadState, replyAttachmentEntity.uploadState) && AbstractC22676k.m65745e(this.extraData, replyAttachmentEntity.extraData);
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

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final String getId() {
        return this.id;
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

    public final String getOgUrl() {
        return this.ogUrl;
    }

    public final Integer getOriginalHeight() {
        return this.originalHeight;
    }

    public final Integer getOriginalWidth() {
        return this.originalWidth;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleLink() {
        return this.titleLink;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUploadFilePath() {
        return this.uploadFilePath;
    }

    public final UploadStateEntity getUploadState() {
        return this.uploadState;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.messageId);
        String str = this.authorName;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumbUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.assetUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ogUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mimeType;
        int iM30448b = AbstractC11266d.m30448b(this.fileSize, (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31);
        String str9 = this.title;
        int iHashCode8 = (iM30448b + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.text;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.image;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.name;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fallback;
        int iHashCode13 = (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.uploadFilePath;
        int iHashCode14 = (iHashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num = this.originalHeight;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.originalWidth;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UploadStateEntity uploadStateEntity = this.uploadState;
        return this.extraData.hashCode() + ((iHashCode16 + (uploadStateEntity != null ? uploadStateEntity.hashCode() : 0)) * 31);
    }

    public final void setOriginalHeight(Integer num) {
        this.originalHeight = num;
    }

    public final void setOriginalWidth(Integer num) {
        this.originalWidth = num;
    }

    public final void setUploadState(UploadStateEntity uploadStateEntity) {
        this.uploadState = uploadStateEntity;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.messageId;
        String str3 = this.authorName;
        String str4 = this.titleLink;
        String str5 = this.authorLink;
        String str6 = this.thumbUrl;
        String str7 = this.imageUrl;
        String str8 = this.assetUrl;
        String str9 = this.ogUrl;
        String str10 = this.mimeType;
        int i13 = this.fileSize;
        String str11 = this.title;
        String str12 = this.text;
        String str13 = this.type;
        String str14 = this.image;
        String str15 = this.name;
        String str16 = this.fallback;
        String str17 = this.uploadFilePath;
        Integer num = this.originalHeight;
        Integer num2 = this.originalWidth;
        UploadStateEntity uploadStateEntity = this.uploadState;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReplyAttachmentEntity(id=", str, ", messageId=", str2, ", authorName=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", titleLink=", str4, ", authorLink=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", thumbUrl=", str6, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", assetUrl=", str8, ", ogUrl=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", mimeType=", str10, ", fileSize=");
        AbstractC11895b.m31979B(i13, ", title=", str11, ", text=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str12, ", type=", str13, ", image=");
        AbstractC11266d.m30444B(sbM32001t, str14, ", name=", str15, ", fallback=");
        AbstractC11266d.m30444B(sbM32001t, str16, ", uploadFilePath=", str17, ", originalHeight=");
        AbstractC31061c.m95621A(sbM32001t, num, ", originalWidth=", num2, ", uploadState=");
        sbM32001t.append(uploadStateEntity);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ReplyAttachmentEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i13, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, Integer num2, UploadStateEntity uploadStateEntity, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i13, str11, str12, str13, str14, str15, str16, str17, num, num2, (i14 & 1048576) != 0 ? null : uploadStateEntity, map);
    }
}
