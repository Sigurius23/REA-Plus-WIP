package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.data.local.room.entity.AmaHost;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b2\u0010-J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001cJ\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010%J\u0012\u00107\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b7\u00108JÐ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u0010%J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010\u001cJ\u001a\u0010?\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bE\u0010%R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bF\u0010%R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bG\u0010%R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bH\u0010%R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bI\u0010%R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bJ\u0010%R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010-\"\u0004\bM\u0010NR\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bO\u0010%R\"\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010K\u001a\u0004\bP\u0010-\"\u0004\bQ\u0010NR\"\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010K\u001a\u0004\bR\u0010-\"\u0004\bS\u0010NR\"\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010K\u001a\u0004\bT\u0010-\"\u0004\bU\u0010NR\u001a\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bV\u0010-R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bW\u0010%R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bX\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bY\u0010%R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010C\u001a\u0004\bZ\u0010%\"\u0004\b[\u0010\\R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u00108\"\u0004\b_\u0010`R\"\u0010b\u001a\u00020a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006h"}, m65681d2 = {"Lcom/whoop/domain/model/teams/MemberStory;", "Landroid/os/Parcelable;", "", "memberStoryId", "", "createdAt", "updatedAt", "title", "publishDate", QueryParams.URL, "image", "contentType", "", "showBadge", "description", "deleted", "featured", "live", "archived", "liveTime", "hostId", "urlText", "ctaText", "Lcom/whoop/data/local/room/entity/AmaHost;", "host", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lcom/whoop/data/local/room/entity/AmaHost;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)Lcom/whoop/domain/model/teams/MemberStory;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getMemberStoryId", "Ljava/lang/String;", "getCreatedAt", "getUpdatedAt", "getTitle", "getPublishDate", "getUrl", "getImage", "getContentType", "Z", "getShowBadge", "setShowBadge", "(Z)V", "getDescription", "getDeleted", "setDeleted", "getFeatured", "setFeatured", "getLive", "setLive", "getArchived", "getLiveTime", "getHostId", "getUrlText", "getCtaText", "setCtaText", "(Ljava/lang/String;)V", "Lcom/whoop/data/local/room/entity/AmaHost;", "getHost", "setHost", "(Lcom/whoop/data/local/room/entity/AmaHost;)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MemberStory implements Parcelable {
    public static final Parcelable.Creator<MemberStory> CREATOR = new Creator();
    private final boolean archived;
    private final String contentType;
    private final String createdAt;
    private String ctaText;
    private boolean deleted;
    private final String description;
    private boolean featured;
    private AmaHost host;
    private final int hostId;
    private long id;
    private final String image;
    private boolean live;
    private final String liveTime;
    private final int memberStoryId;
    private final String publishDate;
    private boolean showBadge;
    private final String title;
    private final String updatedAt;
    private final String url;
    private final String urlText;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<MemberStory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberStory createFromParcel(Parcel parcel) {
            boolean z4;
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z13 = false;
            if (parcel.readInt() != 0) {
                z13 = true;
                z4 = true;
            } else {
                z4 = true;
            }
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                z4 = z13;
            }
            if (parcel.readInt() == 0) {
                z4 = z13;
            }
            if (parcel.readInt() == 0) {
                z4 = z13;
            }
            if (parcel.readInt() == 0) {
                z4 = false;
            }
            return new MemberStory(i13, string, string2, string3, string4, string5, string6, string7, z13, string8, z4, z4, z4, z4, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AmaHost.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberStory[] newArray(int i13) {
            return new MemberStory[i13];
        }
    }

    public MemberStory(int i13, String createdAt, String updatedAt, String title, String publishDate, String url, String image, String contentType, boolean z4, String description, boolean z13, boolean z14, boolean z15, boolean z16, String liveTime, int i14, String urlText, String ctaText, AmaHost amaHost) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(publishDate, "publishDate");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(liveTime, "liveTime");
        AbstractC22676k.m65750j(urlText, "urlText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        this.memberStoryId = i13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.title = title;
        this.publishDate = publishDate;
        this.url = url;
        this.image = image;
        this.contentType = contentType;
        this.showBadge = z4;
        this.description = description;
        this.deleted = z13;
        this.featured = z14;
        this.live = z15;
        this.archived = z16;
        this.liveTime = liveTime;
        this.hostId = i14;
        this.urlText = urlText;
        this.ctaText = ctaText;
        this.host = amaHost;
    }

    public static /* synthetic */ MemberStory copy$default(MemberStory memberStory, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z4, String str8, boolean z13, boolean z14, boolean z15, boolean z16, String str9, int i14, String str10, String str11, AmaHost amaHost, int i15, Object obj) {
        AmaHost amaHost2;
        String str12;
        int i16 = (i15 & 1) != 0 ? memberStory.memberStoryId : i13;
        String str13 = (i15 & 2) != 0 ? memberStory.createdAt : str;
        String str14 = (i15 & 4) != 0 ? memberStory.updatedAt : str2;
        String str15 = (i15 & 8) != 0 ? memberStory.title : str3;
        String str16 = (i15 & 16) != 0 ? memberStory.publishDate : str4;
        String str17 = (i15 & 32) != 0 ? memberStory.url : str5;
        String str18 = (i15 & 64) != 0 ? memberStory.image : str6;
        String str19 = (i15 & 128) != 0 ? memberStory.contentType : str7;
        boolean z17 = (i15 & 256) != 0 ? memberStory.showBadge : z4;
        String str20 = (i15 & 512) != 0 ? memberStory.description : str8;
        boolean z18 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? memberStory.deleted : z13;
        boolean z19 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? memberStory.featured : z14;
        boolean z24 = (i15 & 4096) != 0 ? memberStory.live : z15;
        boolean z25 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? memberStory.archived : z16;
        int i17 = i16;
        String str21 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? memberStory.liveTime : str9;
        int i18 = (i15 & 32768) != 0 ? memberStory.hostId : i14;
        String str22 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? memberStory.urlText : str10;
        String str23 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? memberStory.ctaText : str11;
        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            str12 = str23;
            amaHost2 = memberStory.host;
        } else {
            amaHost2 = amaHost;
            str12 = str23;
        }
        return memberStory.copy(i17, str13, str14, str15, str16, str17, str18, str19, z17, str20, z18, z19, z24, z25, str21, i18, str22, str12, amaHost2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMemberStoryId() {
        return this.memberStoryId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getFeatured() {
        return this.featured;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getLive() {
        return this.live;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getArchived() {
        return this.archived;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLiveTime() {
        return this.liveTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getHostId() {
        return this.hostId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getUrlText() {
        return this.urlText;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final AmaHost getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPublishDate() {
        return this.publishDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowBadge() {
        return this.showBadge;
    }

    public final MemberStory copy(int memberStoryId, String createdAt, String updatedAt, String title, String publishDate, String url, String image, String contentType, boolean showBadge, String description, boolean deleted, boolean featured, boolean live2, boolean archived, String liveTime, int hostId, String urlText, String ctaText, AmaHost host) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(publishDate, "publishDate");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(liveTime, "liveTime");
        AbstractC22676k.m65750j(urlText, "urlText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        return new MemberStory(memberStoryId, createdAt, updatedAt, title, publishDate, url, image, contentType, showBadge, description, deleted, featured, live2, archived, liveTime, hostId, urlText, ctaText, host);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberStory)) {
            return false;
        }
        MemberStory memberStory = (MemberStory) other;
        return this.memberStoryId == memberStory.memberStoryId && AbstractC22676k.m65745e(this.createdAt, memberStory.createdAt) && AbstractC22676k.m65745e(this.updatedAt, memberStory.updatedAt) && AbstractC22676k.m65745e(this.title, memberStory.title) && AbstractC22676k.m65745e(this.publishDate, memberStory.publishDate) && AbstractC22676k.m65745e(this.url, memberStory.url) && AbstractC22676k.m65745e(this.image, memberStory.image) && AbstractC22676k.m65745e(this.contentType, memberStory.contentType) && this.showBadge == memberStory.showBadge && AbstractC22676k.m65745e(this.description, memberStory.description) && this.deleted == memberStory.deleted && this.featured == memberStory.featured && this.live == memberStory.live && this.archived == memberStory.archived && AbstractC22676k.m65745e(this.liveTime, memberStory.liveTime) && this.hostId == memberStory.hostId && AbstractC22676k.m65745e(this.urlText, memberStory.urlText) && AbstractC22676k.m65745e(this.ctaText, memberStory.ctaText) && AbstractC22676k.m65745e(this.host, memberStory.host);
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getFeatured() {
        return this.featured;
    }

    public final AmaHost getHost() {
        return this.host;
    }

    public final int getHostId() {
        return this.hostId;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final boolean getLive() {
        return this.live;
    }

    public final String getLiveTime() {
        return this.liveTime;
    }

    public final int getMemberStoryId() {
        return this.memberStoryId;
    }

    public final String getPublishDate() {
        return this.publishDate;
    }

    public final boolean getShowBadge() {
        return this.showBadge;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlText() {
        return this.urlText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.hostId, AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.memberStoryId) * 31, 31, this.createdAt), 31, this.updatedAt), 31, this.title), 31, this.publishDate), 31, this.url), 31, this.image), 31, this.contentType), 31, this.showBadge), 31, this.description), 31, this.deleted), 31, this.featured), 31, this.live), 31, this.archived), 31, this.liveTime), 31), 31, this.urlText), 31, this.ctaText);
        AmaHost amaHost = this.host;
        return iM30450d + (amaHost == null ? 0 : amaHost.hashCode());
    }

    public final void setCtaText(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.ctaText = str;
    }

    public final void setDeleted(boolean z4) {
        this.deleted = z4;
    }

    public final void setFeatured(boolean z4) {
        this.featured = z4;
    }

    public final void setHost(AmaHost amaHost) {
        this.host = amaHost;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setLive(boolean z4) {
        this.live = z4;
    }

    public final void setShowBadge(boolean z4) {
        this.showBadge = z4;
    }

    public String toString() {
        int i13 = this.memberStoryId;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.title;
        String str4 = this.publishDate;
        String str5 = this.url;
        String str6 = this.image;
        String str7 = this.contentType;
        boolean z4 = this.showBadge;
        String str8 = this.description;
        boolean z13 = this.deleted;
        boolean z14 = this.featured;
        boolean z15 = this.live;
        boolean z16 = this.archived;
        String str9 = this.liveTime;
        int i14 = this.hostId;
        String str10 = this.urlText;
        String str11 = this.ctaText;
        AmaHost amaHost = this.host;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "MemberStory(memberStoryId=", ", createdAt=", str, ", updatedAt=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", title=", str3, ", publishDate=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", url=", str5, ", image=");
        AbstractC11266d.m30444B(sbM53373n, str6, ", contentType=", str7, ", showBadge=");
        AbstractC38963t7.m124391u(sbM53373n, z4, ", description=", str8, ", deleted=");
        AbstractC38963t7.m124392v(sbM53373n, z13, ", featured=", z14, ", live=");
        AbstractC38963t7.m124392v(sbM53373n, z15, ", archived=", z16, ", liveTime=");
        AbstractC11266d.m30470x(i14, str9, ", hostId=", ", urlText=", sbM53373n);
        AbstractC11266d.m30444B(sbM53373n, str10, ", ctaText=", str11, ", host=");
        sbM53373n.append(amaHost);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.memberStoryId);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeString(this.title);
        dest.writeString(this.publishDate);
        dest.writeString(this.url);
        dest.writeString(this.image);
        dest.writeString(this.contentType);
        dest.writeInt(this.showBadge ? 1 : 0);
        dest.writeString(this.description);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeInt(this.featured ? 1 : 0);
        dest.writeInt(this.live ? 1 : 0);
        dest.writeInt(this.archived ? 1 : 0);
        dest.writeString(this.liveTime);
        dest.writeInt(this.hostId);
        dest.writeString(this.urlText);
        dest.writeString(this.ctaText);
        AmaHost amaHost = this.host;
        if (amaHost == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amaHost.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MemberStory(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z4, String str8, boolean z13, boolean z14, boolean z15, boolean z16, String str9, int i14, String str10, String str11, AmaHost amaHost, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, str3, str4, str5, str6, str7, (i15 & 256) != 0 ? true : z4, str8, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z13, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z14, (i15 & 4096) != 0 ? false : z15, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z16, str9, i14, str10, str11, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : amaHost);
    }
}
