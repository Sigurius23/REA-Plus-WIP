.class public final Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$$serializer;,
        Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00029:BW\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\rBg\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$Jd\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00083\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00084\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00085\u0010\u001dR\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00087\u0010$\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "titleDisplay",
        "subtitleDisplay",
        "subtitleStyle",
        "imageUrl",
        "iconKey",
        "",
        "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;",
        "stats",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_everyday_stats_release",
        "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getTitleDisplay",
        "getSubtitleDisplay",
        "getSubtitleStyle",
        "getImageUrl",
        "getIconKey",
        "Ljava/util/List;",
        "getStats",
        "Companion",
        "$serializer",
        "a",
        "community-everyday-stats_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$a;


# instance fields
.field private final iconKey:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final stats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;",
            ">;"
        }
    .end annotation
.end field

.field private final subtitleDisplay:Ljava/lang/String;

.field private final subtitleStyle:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->Companion:Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lxo1/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lxo1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v2, v3, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v1, 0x6

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x6

    const/4 v0, 0x6

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x0

    if-nez p9, :cond_1

    iput-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    :goto_0
    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    :goto_3
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_5

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    return-void

    :cond_5
    iput-object p8, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stats"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_4

    .line 12
    sget-object p7, Lm83/y;->w:Lm83/y;

    :cond_4
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p8}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_everyday_stats_release(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;",
            ">;)",
            "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stats"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getIconKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getStats()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    return-object v0
.end method

.method public final getSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitleStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->subtitleStyle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->imageUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->iconKey:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->stats:Ljava/util/List;

    const-string v7, ", titleDisplay="

    const-string v8, ", subtitleDisplay="

    const-string v9, "SnapshotExerciseTileModel(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitleStyle="

    const-string v7, ", imageUrl="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", iconKey="

    const-string v2, ", stats="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
