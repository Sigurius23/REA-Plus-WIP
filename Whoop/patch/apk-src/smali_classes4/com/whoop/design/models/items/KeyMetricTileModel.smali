.class public final Lcom/whoop/design/models/items/KeyMetricTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/KeyMetricTileModel$$serializer;,
        Lcom/whoop/design/models/items/KeyMetricTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0002GFBy\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u007f\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0082\u0001\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u0008:\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u0008;\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00108\u001a\u0004\u0008<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u0008=\u0010\u0018R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u0008>\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010?\u001a\u0004\u0008@\u0010\u001fR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010A\u001a\u0004\u0008B\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00108\u001a\u0004\u0008C\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010D\u001a\u0004\u0008E\u0010$\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/design/models/items/KeyMetricTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "keyMetricTileIcon",
        "keyMetricTileTitleDisplay",
        "keyMetricTileStatValueDisplay",
        "keyMetricTileSuffixDisplay",
        "keyMetricTileTrendDisplay",
        "Lcom/whoop/design/atomic/atom/TrendTypeEnum;",
        "keyMetricTileTrendType",
        "Lcom/whoop/design/models/items/TrendBarModel;",
        "keyMetricTileTrendBar",
        "placeholderMessageDisplay",
        "Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;",
        "keyMetricTileDialogContent",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/design/atomic/atom/TrendTypeEnum;",
        "component8",
        "()Lcom/whoop/design/models/items/TrendBarModel;",
        "component9",
        "component10",
        "()Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)Lcom/whoop/design/models/items/KeyMetricTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/KeyMetricTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getKeyMetricTileIcon",
        "getKeyMetricTileTitleDisplay",
        "getKeyMetricTileStatValueDisplay",
        "getKeyMetricTileSuffixDisplay",
        "getKeyMetricTileTrendDisplay",
        "Lcom/whoop/design/atomic/atom/TrendTypeEnum;",
        "getKeyMetricTileTrendType",
        "Lcom/whoop/design/models/items/TrendBarModel;",
        "getKeyMetricTileTrendBar",
        "getPlaceholderMessageDisplay",
        "Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;",
        "getKeyMetricTileDialogContent",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/KeyMetricTileModel$Companion;


# instance fields
.field private final id:Ljava/lang/String;

.field private final keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

.field private final keyMetricTileIcon:Ljava/lang/String;

.field private final keyMetricTileStatValueDisplay:Ljava/lang/String;

.field private final keyMetricTileSuffixDisplay:Ljava/lang/String;

.field private final keyMetricTileTitleDisplay:Ljava/lang/String;

.field private final keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

.field private final keyMetricTileTrendDisplay:Ljava/lang/String;

.field private final keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

.field private final placeholderMessageDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/KeyMetricTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/KeyMetricTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/KeyMetricTileModel;->Companion:Lcom/whoop/design/models/items/KeyMetricTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/KeyMetricTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/g;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lw91/g;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    const/4 v5, 0x5

    aput-object v1, v3, v5

    aput-object v2, v3, v4

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/KeyMetricTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/whoop/design/models/items/KeyMetricTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const/4 v0, 0x0

    if-nez p12, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const-string p12, ""

    if-nez p2, :cond_1

    iput-object p12, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p12, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p12, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p12, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p12, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 3
    sget-object p2, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->NEUTRAL:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    :goto_8
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_9

    iput-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    return-void

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)V
    .locals 1

    const-string v0, "keyMetricTileIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyMetricTileTitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyMetricTileStatValueDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    .line 11
    iput-object p6, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    .line 13
    iput-object p8, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    .line 14
    iput-object p9, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    .line 15
    iput-object p10, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    .line 16
    const-string v1, ""

    if-eqz p12, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move-object p6, v1

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    .line 17
    sget-object p7, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->NEUTRAL:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move-object p11, p10

    goto :goto_0

    .line 18
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/design/models/items/KeyMetricTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.TrendTypeEnum"

    invoke-static {}, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->values()[Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/KeyMetricTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/KeyMetricTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/KeyMetricTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/KeyMetricTileModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/KeyMetricTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)Lcom/whoop/design/models/items/KeyMetricTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/KeyMetricTileModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/KeyMetricTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    sget-object v3, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->NEUTRAL:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    if-eq v2, v3, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/items/TrendBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TrendBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/atomic/atom/TrendTypeEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/TrendBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)Lcom/whoop/design/models/items/KeyMetricTileModel;
    .locals 12

    const-string v0, "keyMetricTileIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyMetricTileTitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyMetricTileStatValueDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/KeyMetricTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/KeyMetricTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/KeyMetricTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyMetricTileDialogContent()Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    return-object v0
.end method

.method public final getKeyMetricTileIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyMetricTileStatValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyMetricTileSuffixDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyMetricTileTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyMetricTileTrendBar()Lcom/whoop/design/models/items/TrendBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    return-object v0
.end method

.method public final getKeyMetricTileTrendDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyMetricTileTrendType()Lcom/whoop/design/atomic/atom/TrendTypeEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    return-object v0
.end method

.method public final getPlaceholderMessageDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/design/models/items/TrendBarModel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileStatValueDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileSuffixDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendType:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    iget-object v7, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileTrendBar:Lcom/whoop/design/models/items/TrendBarModel;

    iget-object v8, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->placeholderMessageDisplay:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/items/KeyMetricTileModel;->keyMetricTileDialogContent:Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    const-string v10, ", keyMetricTileIcon="

    const-string v11, ", keyMetricTileTitleDisplay="

    const-string v12, "KeyMetricTileModel(id="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", keyMetricTileStatValueDisplay="

    const-string v10, ", keyMetricTileSuffixDisplay="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", keyMetricTileTrendDisplay="

    const-string v2, ", keyMetricTileTrendType="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", keyMetricTileTrendBar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderMessageDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", keyMetricTileDialogContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
