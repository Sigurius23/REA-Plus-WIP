.class public final Lcom/whoop/domain/model/teams/MemberStory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u0000\n\u0002\u0008#\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0010\u0010\'\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0010\u0010(\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0010\u0010)\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010%J\u0010\u0010*\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010%J\u0010\u0010+\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010%J\u0010\u0010,\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010%J\u0010\u0010/\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010-J\u0010\u00100\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010-J\u0010\u00101\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010-J\u0010\u00102\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010-J\u0010\u00103\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010%J\u0010\u00104\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010\u001cJ\u0010\u00105\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010%J\u0010\u00106\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010%J\u0012\u00107\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u00d0\u0001\u00109\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00042\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010;\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008;\u0010%J\u0010\u0010<\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008<\u0010\u001cJ\u001a\u0010?\u001a\u00020\u000c2\u0008\u0010>\u001a\u0004\u0018\u00010=H\u00d6\u0003\u00a2\u0006\u0004\u0008?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010A\u001a\u0004\u0008B\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010C\u001a\u0004\u0008D\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010C\u001a\u0004\u0008E\u0010%R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010C\u001a\u0004\u0008F\u0010%R\u001a\u0010\u0008\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010C\u001a\u0004\u0008G\u0010%R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010C\u001a\u0004\u0008H\u0010%R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010C\u001a\u0004\u0008I\u0010%R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008J\u0010%R\"\u0010\r\u001a\u00020\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010K\u001a\u0004\u0008L\u0010-\"\u0004\u0008M\u0010NR\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010C\u001a\u0004\u0008O\u0010%R\"\u0010\u000f\u001a\u00020\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010K\u001a\u0004\u0008P\u0010-\"\u0004\u0008Q\u0010NR\"\u0010\u0010\u001a\u00020\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010K\u001a\u0004\u0008R\u0010-\"\u0004\u0008S\u0010NR\"\u0010\u0011\u001a\u00020\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010K\u001a\u0004\u0008T\u0010-\"\u0004\u0008U\u0010NR\u001a\u0010\u0012\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010K\u001a\u0004\u0008V\u0010-R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010C\u001a\u0004\u0008W\u0010%R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010A\u001a\u0004\u0008X\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010C\u001a\u0004\u0008Y\u0010%R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010C\u001a\u0004\u0008Z\u0010%\"\u0004\u0008[\u0010\\R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010]\u001a\u0004\u0008^\u00108\"\u0004\u0008_\u0010`R\"\u0010b\u001a\u00020a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010g\u00a8\u0006h"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/MemberStory;",
        "Landroid/os/Parcelable;",
        "",
        "memberStoryId",
        "",
        "createdAt",
        "updatedAt",
        "title",
        "publishDate",
        "url",
        "image",
        "contentType",
        "",
        "showBadge",
        "description",
        "deleted",
        "featured",
        "live",
        "archived",
        "liveTime",
        "hostId",
        "urlText",
        "ctaText",
        "Lcom/whoop/data/local/room/entity/AmaHost;",
        "host",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Z",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "()Lcom/whoop/data/local/room/entity/AmaHost;",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)Lcom/whoop/domain/model/teams/MemberStory;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getMemberStoryId",
        "Ljava/lang/String;",
        "getCreatedAt",
        "getUpdatedAt",
        "getTitle",
        "getPublishDate",
        "getUrl",
        "getImage",
        "getContentType",
        "Z",
        "getShowBadge",
        "setShowBadge",
        "(Z)V",
        "getDescription",
        "getDeleted",
        "setDeleted",
        "getFeatured",
        "setFeatured",
        "getLive",
        "setLive",
        "getArchived",
        "getLiveTime",
        "getHostId",
        "getUrlText",
        "getCtaText",
        "setCtaText",
        "(Ljava/lang/String;)V",
        "Lcom/whoop/data/local/room/entity/AmaHost;",
        "getHost",
        "setHost",
        "(Lcom/whoop/data/local/room/entity/AmaHost;)V",
        "",
        "id",
        "J",
        "getId",
        "()J",
        "setId",
        "(J)V",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final archived:Z

.field private final contentType:Ljava/lang/String;

.field private final createdAt:Ljava/lang/String;

.field private ctaText:Ljava/lang/String;

.field private deleted:Z

.field private final description:Ljava/lang/String;

.field private featured:Z

.field private host:Lcom/whoop/data/local/room/entity/AmaHost;

.field private final hostId:I

.field private id:J

.field private final image:Ljava/lang/String;

.field private live:Z

.field private final liveTime:Ljava/lang/String;

.field private final memberStoryId:I

.field private final publishDate:Ljava/lang/String;

.field private showBadge:Z

.field private final title:Ljava/lang/String;

.field private final updatedAt:Ljava/lang/String;

.field private final url:Ljava/lang/String;

.field private final urlText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/teams/MemberStory$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/MemberStory$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/MemberStory;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V
    .locals 8

    move-object v0, p6

    move-object v1, p7

    move-object/from16 v2, p8

    move-object/from16 v3, p10

    move-object/from16 v4, p15

    move-object/from16 v5, p17

    move-object/from16 v6, p18

    const-string v7, "createdAt"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "updatedAt"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "title"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "publishDate"

    invoke-static {p5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "url"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "image"

    invoke-static {p7, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "contentType"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "description"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "liveTime"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "urlText"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "ctaText"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    .line 3
    iput-object p2, p0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    .line 8
    iput-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    .line 9
    iput-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    move/from16 p1, p9

    .line 10
    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    .line 11
    iput-object v3, p0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    move/from16 p1, p11

    .line 12
    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    move/from16 p1, p12

    .line 13
    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    move/from16 p1, p13

    .line 14
    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    .line 16
    iput-object v4, p0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    .line 18
    iput-object v5, p0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    .line 19
    iput-object v6, p0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p20

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v11, v1

    goto :goto_0

    :cond_0
    move/from16 v11, p9

    :goto_0
    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move v13, v2

    goto :goto_1

    :cond_1
    move/from16 v13, p11

    :goto_1
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_2

    move v14, v2

    goto :goto_2

    :cond_2
    move/from16 v14, p12

    :goto_2
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_3

    move v15, v2

    goto :goto_3

    :cond_3
    move/from16 v15, p13

    :goto_3
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_4

    move/from16 v16, v2

    goto :goto_4

    :cond_4
    move/from16 v16, p14

    :goto_4
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    move-object/from16 v21, v0

    :goto_5
    move-object/from16 v2, p0

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v12, p10

    move-object/from16 v17, p15

    move/from16 v18, p16

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    goto :goto_6

    :cond_5
    move-object/from16 v21, p19

    goto :goto_5

    .line 21
    :goto_6
    invoke-direct/range {v2 .. v21}, Lcom/whoop/domain/model/teams/MemberStory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/MemberStory;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/MemberStory;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/domain/model/teams/MemberStory;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)Lcom/whoop/domain/model/teams/MemberStory;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    return v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    return v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Lcom/whoop/data/local/room/entity/AmaHost;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)Lcom/whoop/domain/model/teams/MemberStory;
    .locals 21

    const-string v0, "createdAt"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishDate"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "liveTime"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlText"

    move-object/from16 v2, p17

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    move-object/from16 v10, p18

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/MemberStory;

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v20, p19

    move-object/from16 v18, v2

    move-object/from16 v19, v10

    move/from16 v2, p1

    move/from16 v10, p9

    invoke-direct/range {v1 .. v20}, Lcom/whoop/domain/model/teams/MemberStory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/MemberStory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/MemberStory;

    iget v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getArchived()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    return v0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeatured()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    return v0
.end method

.method public final getHost()Lcom/whoop/data/local/room/entity/AmaHost;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    return-object v0
.end method

.method public final getHostId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    return v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->id:J

    return-wide v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    return v0
.end method

.method public final getLiveTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMemberStoryId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    return v0
.end method

.method public final getPublishDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowBadge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrlText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setCtaText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    return-void
.end method

.method public final setDeleted(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    return-void
.end method

.method public final setFeatured(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    return-void
.end method

.method public final setHost(Lcom/whoop/data/local/room/entity/AmaHost;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    return-void
.end method

.method public final setId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->id:J

    return-void
.end method

.method public final setLive(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    return-void
.end method

.method public final setShowBadge(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    iget-object v2, v0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    iget-boolean v9, v0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    iget-object v10, v0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    iget-boolean v11, v0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    iget-boolean v12, v0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    iget-boolean v13, v0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    iget-boolean v14, v0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    iget-object v15, v0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    move-object/from16 v16, v15

    iget v15, v0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    move/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    const-string v0, ", createdAt="

    move-object/from16 v20, v15

    const-string v15, ", updatedAt="

    move/from16 v21, v13

    const-string v13, "MemberStory(memberStoryId="

    invoke-static {v1, v13, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    const-string v2, ", publishDate="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", url="

    const-string v2, ", image="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", contentType="

    const-string v2, ", showBadge="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", description="

    const-string v2, ", deleted="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", featured="

    const-string v2, ", live="

    invoke-static {v0, v11, v1, v12, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", archived="

    const-string v2, ", liveTime="

    move/from16 v3, v21

    invoke-static {v0, v3, v1, v14, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", hostId="

    const-string v2, ", urlText="

    move-object/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v4, v3, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", ctaText="

    const-string v2, ", host="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->memberStoryId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->createdAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->updatedAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->publishDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->image:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->contentType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->showBadge:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->deleted:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->featured:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->live:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->archived:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->liveTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->hostId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->urlText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->ctaText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/MemberStory;->host:Lcom/whoop/data/local/room/entity/AmaHost;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/data/local/room/entity/AmaHost;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
