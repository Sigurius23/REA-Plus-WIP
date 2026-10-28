.class public final Lcom/whoop/data/remote/domain/dto/SportDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/SportDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/SportDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BY\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eBc\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"J\u0010\u0010&\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"J\u0010\u0010\'\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010$J\u0010\u0010(\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\"Jb\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00062\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\"J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u001a\u0010/\u001a\u00020\u00062\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00084\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00086\u0010$R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00087\u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00088\u0010\"R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u0008\n\u0010$R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00105\u0012\u0004\u00089\u0010:\u001a\u0004\u0008\u000b\u0010$R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00103\u001a\u0004\u0008;\u0010\"\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/SportDto;",
        "",
        "",
        "id",
        "",
        "name",
        "",
        "hasGps",
        "iconUrl",
        "category",
        "isCurrent",
        "isHasSurvey",
        "activityTypeInternalName",
        "<init>",
        "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/SportDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/service/network/model/Sport;",
        "toSport",
        "()Lcom/whoop/service/network/model/Sport;",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Z",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/whoop/data/remote/domain/dto/SportDto;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getId",
        "Ljava/lang/String;",
        "getName",
        "Z",
        "getHasGps",
        "getIconUrl",
        "getCategory",
        "isHasSurvey$annotations",
        "()V",
        "getActivityTypeInternalName",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/SportDto$Companion;


# instance fields
.field private final activityTypeInternalName:Ljava/lang/String;

.field private final category:Ljava/lang/String;

.field private final hasGps:Z

.field private final iconUrl:Ljava/lang/String;

.field private final id:I

.field private final isCurrent:Z

.field private final isHasSurvey:Z

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SportDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/SportDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SportDto;->Companion:Lcom/whoop/data/remote/domain/dto/SportDto$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/data/remote/domain/dto/SportDto;-><init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const/4 v0, 0x0

    if-nez p10, :cond_0

    iput v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const-string p10, ""

    if-nez p2, :cond_1

    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    goto :goto_2

    :cond_2
    iput-boolean p4, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 3
    sget-object p2, Lcom/whoop/ui/activities/realtime/SportCategory;->CARDIOVASCULAR:Lcom/whoop/ui/activities/realtime/SportCategory;

    invoke-virtual {p2}, Lcom/whoop/ui/activities/realtime/SportCategory;->getValue()Ljava/lang/String;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    goto :goto_5

    :cond_5
    iput-boolean p7, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    goto :goto_6

    :cond_6
    iput-boolean p8, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    .line 7
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    .line 8
    iput-boolean p3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    .line 9
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    .line 11
    iput-boolean p6, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    .line 12
    iput-boolean p7, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    .line 13
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    .line 14
    const-string v1, ""

    if-eqz p10, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    .line 15
    sget-object p5, Lcom/whoop/ui/activities/realtime/SportCategory;->CARDIOVASCULAR:Lcom/whoop/ui/activities/realtime/SportCategory;

    invoke-virtual {p5}, Lcom/whoop/ui/activities/realtime/SportCategory;->getValue()Ljava/lang/String;

    move-result-object p5

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    const/4 p6, 0x1

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    const/4 p8, 0x0

    :cond_7
    move-object p9, p8

    move p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    .line 16
    invoke-direct/range {p1 .. p9}, Lcom/whoop/data/remote/domain/dto/SportDto;-><init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/SportDto;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/SportDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-boolean p3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p6, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-boolean p7, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    :cond_7
    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/data/remote/domain/dto/SportDto;->copy(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/whoop/data/remote/domain/dto/SportDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isHasSurvey$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "has_survey"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/SportDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    if-eqz v1, :cond_1

    :goto_0
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    if-eqz v3, :cond_5

    :goto_2
    iget-boolean v3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    invoke-interface {p1, p2, v1, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    sget-object v3, Lcom/whoop/ui/activities/realtime/SportCategory;->CARDIOVASCULAR:Lcom/whoop/ui/activities/realtime/SportCategory;

    invoke-virtual {v3}, Lcom/whoop/ui/activities/realtime/SportCategory;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    if-eq v2, v0, :cond_b

    :goto_5
    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    invoke-interface {p1, p2, v1, v0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    if-eqz v1, :cond_d

    :goto_6
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/whoop/data/remote/domain/dto/SportDto;
    .locals 10

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/dto/SportDto;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/data/remote/domain/dto/SportDto;-><init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/SportDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/SportDto;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getActivityTypeInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasGps()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    return v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isCurrent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    return v0
.end method

.method public final isHasSurvey()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    return v0
.end method

.method public final toSport()Lcom/whoop/service/network/model/Sport;
    .locals 9

    new-instance v0, Lcom/whoop/service/network/model/Sport;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    sget-object v5, Lcom/whoop/ui/activities/realtime/SportCategory;->Companion:Lcom/whoop/ui/activities/realtime/SportCategory$a;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/whoop/ui/activities/realtime/SportCategory$a;->a(Ljava/lang/String;)Lcom/whoop/ui/activities/realtime/SportCategory;

    move-result-object v5

    iget-boolean v6, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    iget-boolean v7, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    iget-object v8, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    invoke-direct/range {v0 .. v8}, Lcom/whoop/service/network/model/Sport;-><init>(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->id:I

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->name:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->hasGps:Z

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->iconUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->category:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isCurrent:Z

    iget-boolean v6, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->isHasSurvey:Z

    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/SportDto;->activityTypeInternalName:Ljava/lang/String;

    const-string v8, ", name="

    const-string v9, ", hasGps="

    const-string v10, "SportDto(id="

    invoke-static {v0, v10, v8, v1, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    const-string v8, ", category="

    invoke-static {v0, v2, v1, v3, v8}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isCurrent="

    const-string v2, ", isHasSurvey="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", activityTypeInternalName="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
