package io.getstream.chat.android.client.api2.model.dto;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0015\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003Jð\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010G\u001a\u00020\bHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b,\u0010 R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b-\u0010 R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006I"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "asset_url", "", "author_name", "author_link", "fallback", "file_size", "", "image", "image_url", "mime_type", "name", "og_scrape_url", "text", "thumb_url", "title", "title_link", "type", "original_height", "original_width", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "getAsset_url", "()Ljava/lang/String;", "getAuthor_name", "getAuthor_link", "getFallback", "getFile_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "getImage_url", "getMime_type", "getName", "getOg_scrape_url", "getText", "getThumb_url", "getTitle", "getTitle_link", "getType", "getOriginal_height", "getOriginal_width", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentDto implements ExtraDataDto {
    private final String asset_url;
    private final String author_link;
    private final String author_name;
    private final Map<String, Object> extraData;
    private final String fallback;
    private final Integer file_size;
    private final String image;
    private final String image_url;
    private final String mime_type;
    private final String name;
    private final String og_scrape_url;
    private final Integer original_height;
    private final Integer original_width;
    private final String text;
    private final String thumb_url;
    private final String title;
    private final String title_link;
    private final String type;

    public AttachmentDto(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num2, Integer num3, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        this.asset_url = str;
        this.author_name = str2;
        this.author_link = str3;
        this.fallback = str4;
        this.file_size = num;
        this.image = str5;
        this.image_url = str6;
        this.mime_type = str7;
        this.name = str8;
        this.og_scrape_url = str9;
        this.text = str10;
        this.thumb_url = str11;
        this.title = str12;
        this.title_link = str13;
        this.type = str14;
        this.original_height = num2;
        this.original_width = num3;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachmentDto copy$default(AttachmentDto attachmentDto, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num2, Integer num3, Map map, int i13, Object obj) {
        Map map2;
        Integer num4;
        String str15 = (i13 & 1) != 0 ? attachmentDto.asset_url : str;
        String str16 = (i13 & 2) != 0 ? attachmentDto.author_name : str2;
        String str17 = (i13 & 4) != 0 ? attachmentDto.author_link : str3;
        String str18 = (i13 & 8) != 0 ? attachmentDto.fallback : str4;
        Integer num5 = (i13 & 16) != 0 ? attachmentDto.file_size : num;
        String str19 = (i13 & 32) != 0 ? attachmentDto.image : str5;
        String str20 = (i13 & 64) != 0 ? attachmentDto.image_url : str6;
        String str21 = (i13 & 128) != 0 ? attachmentDto.mime_type : str7;
        String str22 = (i13 & 256) != 0 ? attachmentDto.name : str8;
        String str23 = (i13 & 512) != 0 ? attachmentDto.og_scrape_url : str9;
        String str24 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? attachmentDto.text : str10;
        String str25 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? attachmentDto.thumb_url : str11;
        String str26 = (i13 & 4096) != 0 ? attachmentDto.title : str12;
        String str27 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? attachmentDto.title_link : str13;
        String str28 = str15;
        String str29 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? attachmentDto.type : str14;
        Integer num6 = (i13 & 32768) != 0 ? attachmentDto.original_height : num2;
        Integer num7 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? attachmentDto.original_width : num3;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            num4 = num7;
            map2 = attachmentDto.extraData;
        } else {
            map2 = map;
            num4 = num7;
        }
        return attachmentDto.copy(str28, str16, str17, str18, num5, str19, str20, str21, str22, str23, str24, str25, str26, str27, str29, num6, num4, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAsset_url() {
        return this.asset_url;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOg_scrape_url() {
        return this.og_scrape_url;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getThumb_url() {
        return this.thumb_url;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTitle_link() {
        return this.title_link;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getOriginal_height() {
        return this.original_height;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getOriginal_width() {
        return this.original_width;
    }

    public final Map<String, Object> component18() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthor_name() {
        return this.author_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthor_link() {
        return this.author_link;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFile_size() {
        return this.file_size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImage_url() {
        return this.image_url;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMime_type() {
        return this.mime_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final AttachmentDto copy(String asset_url, String author_name, String author_link, String fallback, Integer file_size, String image, String image_url, String mime_type, String name, String og_scrape_url, String text, String thumb_url, String title, String title_link, String type, Integer original_height, Integer original_width, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        return new AttachmentDto(asset_url, author_name, author_link, fallback, file_size, image, image_url, mime_type, name, og_scrape_url, text, thumb_url, title, title_link, type, original_height, original_width, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentDto)) {
            return false;
        }
        AttachmentDto attachmentDto = (AttachmentDto) other;
        return AbstractC22676k.m65745e(this.asset_url, attachmentDto.asset_url) && AbstractC22676k.m65745e(this.author_name, attachmentDto.author_name) && AbstractC22676k.m65745e(this.author_link, attachmentDto.author_link) && AbstractC22676k.m65745e(this.fallback, attachmentDto.fallback) && AbstractC22676k.m65745e(this.file_size, attachmentDto.file_size) && AbstractC22676k.m65745e(this.image, attachmentDto.image) && AbstractC22676k.m65745e(this.image_url, attachmentDto.image_url) && AbstractC22676k.m65745e(this.mime_type, attachmentDto.mime_type) && AbstractC22676k.m65745e(this.name, attachmentDto.name) && AbstractC22676k.m65745e(this.og_scrape_url, attachmentDto.og_scrape_url) && AbstractC22676k.m65745e(this.text, attachmentDto.text) && AbstractC22676k.m65745e(this.thumb_url, attachmentDto.thumb_url) && AbstractC22676k.m65745e(this.title, attachmentDto.title) && AbstractC22676k.m65745e(this.title_link, attachmentDto.title_link) && AbstractC22676k.m65745e(this.type, attachmentDto.type) && AbstractC22676k.m65745e(this.original_height, attachmentDto.original_height) && AbstractC22676k.m65745e(this.original_width, attachmentDto.original_width) && AbstractC22676k.m65745e(this.extraData, attachmentDto.extraData);
    }

    public final String getAsset_url() {
        return this.asset_url;
    }

    public final String getAuthor_link() {
        return this.author_link;
    }

    public final String getAuthor_name() {
        return this.author_name;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final Integer getFile_size() {
        return this.file_size;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOg_scrape_url() {
        return this.og_scrape_url;
    }

    public final Integer getOriginal_height() {
        return this.original_height;
    }

    public final Integer getOriginal_width() {
        return this.original_width;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThumb_url() {
        return this.thumb_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitle_link() {
        return this.title_link;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.asset_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.author_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.author_link;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fallback;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.file_size;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.image;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.image_url;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mime_type;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.name;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.og_scrape_url;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.text;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.thumb_url;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.title;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.title_link;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.type;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num2 = this.original_height;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.original_width;
        return this.extraData.hashCode() + ((iHashCode16 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.asset_url;
        String str2 = this.author_name;
        String str3 = this.author_link;
        String str4 = this.fallback;
        Integer num = this.file_size;
        String str5 = this.image;
        String str6 = this.image_url;
        String str7 = this.mime_type;
        String str8 = this.name;
        String str9 = this.og_scrape_url;
        String str10 = this.text;
        String str11 = this.thumb_url;
        String str12 = this.title;
        String str13 = this.title_link;
        String str14 = this.type;
        Integer num2 = this.original_height;
        Integer num3 = this.original_width;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AttachmentDto(asset_url=", str, ", author_name=", str2, ", author_link=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", fallback=", str4, ", file_size=");
        AbstractC13673n.m38577x(num, ", image=", str5, ", image_url=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str6, ", mime_type=", str7, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", og_scrape_url=", str9, ", text=");
        AbstractC11266d.m30444B(sbM32001t, str10, ", thumb_url=", str11, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str12, ", title_link=", str13, ", type=");
        AbstractC30007c.m91853w(num2, str14, ", original_height=", ", original_width=", sbM32001t);
        sbM32001t.append(num3);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
