.class public final Lcom/whoop/domain/model/teams/MemberStoryDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/MemberStoryDto$$serializer;,
        Lcom/whoop/domain/model/teams/MemberStoryDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008%\u0008\u0007\u0018\u0000 O2\u00020\u0001:\u0002POB\u00a7\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u00c5\u0001\u0008\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u0018\u0010\u001dJ\'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001\u00a2\u0006\u0004\u0008$\u0010%J\r\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J\r\u0010*\u001a\u00020\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u001d\u0010/\u001a\u00020#2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002\u00a2\u0006\u0004\u0008/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00084\u00105R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00086\u00105R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00087\u00105R\u001a\u0010\u0008\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00088\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00089\u00105R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00103\u0012\u0004\u0008;\u0010<\u001a\u0004\u0008:\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u0008=\u00105R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00103\u001a\u0004\u0008>\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00103\u001a\u0004\u0008?\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00103\u001a\u0004\u0008@\u00105R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010A\u001a\u0004\u0008B\u0010CR\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010A\u001a\u0004\u0008D\u0010CR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010A\u001a\u0004\u0008E\u0010CR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010A\u001a\u0004\u0008F\u0010CR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010G\u001a\u0004\u0008H\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u00103\u001a\u0004\u0008J\u00105R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010K\u0012\u0004\u0008N\u0010<\u001a\u0004\u0008L\u0010M\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/MemberStoryDto;",
        "Landroid/os/Parcelable;",
        "",
        "id",
        "",
        "createdAt",
        "updatedAt",
        "title",
        "publishDate",
        "url",
        "image",
        "urlText",
        "ctaText",
        "contentType",
        "description",
        "",
        "deleted",
        "featured",
        "live",
        "archived",
        "hostId",
        "liveTime",
        "Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;",
        "hostDto",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/model/teams/MemberStoryDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/domain/model/teams/MemberStory;",
        "toMemoryStory",
        "()Lcom/whoop/domain/model/teams/MemberStory;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "I",
        "getId",
        "Ljava/lang/String;",
        "getCreatedAt",
        "()Ljava/lang/String;",
        "getUpdatedAt",
        "getTitle",
        "getPublishDate",
        "getUrl",
        "getImage",
        "getImage$annotations",
        "()V",
        "getUrlText",
        "getCtaText",
        "getContentType",
        "getDescription",
        "Z",
        "getDeleted",
        "()Z",
        "getFeatured",
        "getLive",
        "getArchived",
        "Ljava/lang/Integer;",
        "getHostId",
        "()Ljava/lang/Integer;",
        "getLiveTime",
        "Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;",
        "getHostDto",
        "()Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;",
        "getHostDto$annotations",
        "Companion",
        "$serializer",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/teams/MemberStoryDto;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/domain/model/teams/MemberStoryDto$Companion;


# instance fields
.field private final archived:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "archived"
    .end annotation
.end field

.field private final contentType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "content_type"
    .end annotation
.end field

.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final ctaText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_text"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field private final featured:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "featured"
    .end annotation
.end field

.field private final hostDto:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "host"
    .end annotation
.end field

.field private final hostId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "host_id"
    .end annotation
.end field

.field private final id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final image:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image_url"
    .end annotation
.end field

.field private final live:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "live"
    .end annotation
.end field

.field private final liveTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "live_time"
    .end annotation
.end field

.field private final publishDate:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "publish_date"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final url:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "url"
    .end annotation
.end field

.field private final urlText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "url_text"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/teams/MemberStoryDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/teams/MemberStoryDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->Companion:Lcom/whoop/domain/model/teams/MemberStoryDto$Companion;

    new-instance v0, Lcom/whoop/domain/model/teams/MemberStoryDto$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/MemberStoryDto$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/domain/model/teams/MemberStoryDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/MemberStoryDto$$serializer;

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/MemberStoryDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->id:I

    iput-object p3, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->createdAt:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->updatedAt:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->title:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->publishDate:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->url:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->image:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->urlText:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->ctaText:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->contentType:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->description:Ljava/lang/String;

    iput-boolean p13, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->deleted:Z

    move/from16 p1, p14

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->featured:Z

    move/from16 p1, p15

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->live:Z

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->archived:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostId:Ljava/lang/Integer;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->liveTime:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostDto:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;)V
    .locals 1

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishDate"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->id:I

    .line 4
    iput-object p2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->createdAt:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->updatedAt:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->title:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->publishDate:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->url:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->image:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->urlText:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->ctaText:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->contentType:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->description:Ljava/lang/String;

    .line 14
    iput-boolean p12, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->deleted:Z

    .line 15
    iput-boolean p13, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->featured:Z

    .line 16
    iput-boolean p14, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->live:Z

    move/from16 p1, p15

    .line 17
    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->archived:Z

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostId:Ljava/lang/Integer;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->liveTime:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostDto:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;

    return-void
.end method

.method public static synthetic getHostDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "host"
    .end annotation

    return-void
.end method

.method public static synthetic getImage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "image_url"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/model/teams/MemberStoryDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->id:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->publishDate:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->url:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->image:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->urlText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->contentType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->deleted:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0xc

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->featured:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0xd

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->live:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0xe

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->archived:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostId:Ljava/lang/Integer;

    const/16 v3, 0xf

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x10

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->liveTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$$serializer;

    iget-object p0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostDto:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;

    const/16 v1, 0x11

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getArchived()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->archived:Z

    return v0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->deleted:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeatured()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->featured:Z

    return v0
.end method

.method public final getHostDto()Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostDto:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;

    return-object v0
.end method

.method public final getHostId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->id:I

    return v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->live:Z

    return v0
.end method

.method public final getLiveTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->liveTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublishDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->publishDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrlText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->urlText:Ljava/lang/String;

    return-object v0
.end method

.method public final toMemoryStory()Lcom/whoop/domain/model/teams/MemberStory;
    .locals 23

    move-object/from16 v0, p0

    iget v2, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->id:I

    iget-object v5, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->createdAt:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->updatedAt:Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->url:Ljava/lang/String;

    const-string v6, ""

    if-nez v1, :cond_0

    move-object v7, v6

    goto :goto_0

    :cond_0
    move-object v7, v1

    :goto_0
    iget-object v1, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->contentType:Ljava/lang/String;

    if-nez v1, :cond_1

    move-object v9, v6

    goto :goto_1

    :cond_1
    move-object v9, v1

    :goto_1
    iget-object v8, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->image:Ljava/lang/String;

    move-object v1, v6

    iget-object v6, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->publishDate:Ljava/lang/String;

    iget-boolean v12, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->deleted:Z

    iget-object v10, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->description:Ljava/lang/String;

    if-nez v10, :cond_2

    move-object v11, v1

    goto :goto_2

    :cond_2
    move-object v11, v10

    :goto_2
    iget-boolean v13, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->featured:Z

    iget-boolean v14, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->live:Z

    iget-object v10, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostId:Ljava/lang/Integer;

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    :goto_3
    move/from16 v17, v10

    goto :goto_4

    :cond_3
    const/4 v10, 0x0

    goto :goto_3

    :goto_4
    iget-boolean v15, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->archived:Z

    iget-object v10, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->liveTime:Ljava/lang/String;

    if-nez v10, :cond_4

    move-object/from16 v16, v1

    goto :goto_5

    :cond_4
    move-object/from16 v16, v10

    :goto_5
    iget-object v10, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->urlText:Ljava/lang/String;

    if-nez v10, :cond_5

    move-object/from16 v18, v1

    goto :goto_6

    :cond_5
    move-object/from16 v18, v10

    :goto_6
    iget-object v1, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->ctaText:Ljava/lang/String;

    if-nez v1, :cond_6

    const-string v1, "Join the discussion"

    :cond_6
    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostDto:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->toAmaHost()Lcom/whoop/data/local/room/entity/AmaHost;

    move-result-object v1

    :goto_7
    move-object/from16 v20, v1

    goto :goto_8

    :cond_7
    const/4 v1, 0x0

    goto :goto_7

    :goto_8
    new-instance v1, Lcom/whoop/domain/model/teams/MemberStory;

    const/16 v21, 0x100

    const/16 v22, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v22}, Lcom/whoop/domain/model/teams/MemberStory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->createdAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->updatedAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->publishDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->image:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->urlText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->ctaText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->contentType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->deleted:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->featured:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->live:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->archived:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostId:Ljava/lang/Integer;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->liveTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStoryDto;->hostDto:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
