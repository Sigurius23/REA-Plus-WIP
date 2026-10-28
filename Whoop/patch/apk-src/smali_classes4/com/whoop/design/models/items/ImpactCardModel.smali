.class public final Lcom/whoop/design/models/items/ImpactCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ImpactCardModel$$serializer;,
        Lcom/whoop/design/models/items/ImpactCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 Y2\u00020\u0001:\u0002ZYB\u0086\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0019\u0010\u0018\u001a\u00150\u0013j\u0002`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J#\u00101\u001a\u00150\u0013j\u0002`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u00a5\u0001\u00103\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u001b\u0008\u0002\u0010\u0018\u001a\u00150\u0013j\u0002`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00085\u0010!J\u0010\u00106\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u00086\u00107J\u001a\u0010;\u001a\u00020:2\u0008\u00109\u001a\u0004\u0018\u000108H\u00d6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001\u00a2\u0006\u0004\u0008C\u0010DR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010F\u001a\u0004\u0008G\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010F\u001a\u0004\u0008H\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010F\u001a\u0004\u0008I\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010J\u001a\u0004\u0008K\u0010%R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010J\u001a\u0004\u0008L\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010M\u001a\u0004\u0008N\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010O\u001a\u0004\u0008P\u0010*R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010Q\u001a\u0004\u0008R\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010S\u001a\u0004\u0008T\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010U\u001a\u0004\u0008V\u00100R*\u0010\u0018\u001a\u00150\u0013j\u0002`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010W\u001a\u0004\u0008X\u00102\u00a8\u0006["
    }
    d2 = {
        "Lcom/whoop/design/models/items/ImpactCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "impactCardTitleDisplay",
        "impactCardSubtitleDisplay",
        "impactPercentageDisplay",
        "Lcom/whoop/design/models/items/InsufficientAnswerCount;",
        "yesAnswerCount",
        "noAnswerCount",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "impactStyle",
        "Lcom/whoop/design/models/items/TileTagModel;",
        "tileTag",
        "",
        "tileTags",
        "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "impactBarSegment",
        "Lcom/whoop/design/models/items/BackgroundStyle;",
        "cardBackgroundStyle",
        "Ljava/util/UUID;",
        "Lcom/whoop/design/json/serializers/SerializableUUID;",
        "Lwc3/i;",
        "with",
        "Lo91/g;",
        "impactUuid",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/InsufficientAnswerCount;",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/items/ImpactStyle;",
        "component7",
        "()Lcom/whoop/design/models/items/TileTagModel;",
        "component8",
        "()Ljava/util/List;",
        "component9",
        "()Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "component10",
        "()Lcom/whoop/design/models/items/BackgroundStyle;",
        "component11",
        "()Ljava/util/UUID;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)Lcom/whoop/design/models/items/ImpactCardModel;",
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
        "(Lcom/whoop/design/models/items/ImpactCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getImpactCardTitleDisplay",
        "getImpactCardSubtitleDisplay",
        "getImpactPercentageDisplay",
        "Lcom/whoop/design/models/items/InsufficientAnswerCount;",
        "getYesAnswerCount",
        "getNoAnswerCount",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "getImpactStyle",
        "Lcom/whoop/design/models/items/TileTagModel;",
        "getTileTag",
        "Ljava/util/List;",
        "getTileTags",
        "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "getImpactBarSegment",
        "Lcom/whoop/design/models/items/BackgroundStyle;",
        "getCardBackgroundStyle",
        "Ljava/util/UUID;",
        "getImpactUuid",
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

.field public static final Companion:Lcom/whoop/design/models/items/ImpactCardModel$Companion;


# instance fields
.field private final cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

.field private final impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

.field private final impactCardSubtitleDisplay:Ljava/lang/String;

.field private final impactCardTitleDisplay:Ljava/lang/String;

.field private final impactPercentageDisplay:Ljava/lang/String;

.field private final impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

.field private final impactUuid:Ljava/util/UUID;

.field private final noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

.field private final tileTag:Lcom/whoop/design/models/items/TileTagModel;

.field private final tileTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TileTagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/items/ImpactCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ImpactCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ImpactCardModel;->Companion:Lcom/whoop/design/models/items/ImpactCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ImpactCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/f;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lw91/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/f;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lw91/f;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/f;

    const/16 v8, 0xc

    invoke-direct {v7, v8}, Lw91/f;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v6, v6, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const/4 v7, 0x2

    aput-object v1, v6, v7

    const/4 v7, 0x3

    aput-object v1, v6, v7

    const/4 v7, 0x4

    aput-object v1, v6, v7

    const/4 v7, 0x5

    aput-object v3, v6, v7

    const/4 v3, 0x6

    aput-object v1, v6, v3

    const/4 v3, 0x7

    aput-object v5, v6, v3

    aput-object v1, v6, v0

    const/16 v0, 0x9

    aput-object v2, v6, v0

    aput-object v1, v6, v4

    sput-object v6, Lcom/whoop/design/models/items/ImpactCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/items/ImpactCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactCardModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/ImpactCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    iput-object p6, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    iput-object p7, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iput-object p8, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    iput-object p9, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    iput-object p10, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iput-object p11, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    iput-object p12, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/InsufficientAnswerCount;",
            "Lcom/whoop/design/models/items/InsufficientAnswerCount;",
            "Lcom/whoop/design/models/items/ImpactStyle;",
            "Lcom/whoop/design/models/items/TileTagModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TileTagModel;",
            ">;",
            "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
            "Lcom/whoop/design/models/items/BackgroundStyle;",
            "Ljava/util/UUID;",
            ")V"
        }
    .end annotation

    const-string v0, "impactStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactBarSegment"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBackgroundStyle"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactUuid"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.ImpactStyle"

    invoke-static {}, Lcom/whoop/design/models/items/ImpactStyle;->values()[Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/TileTagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TileTagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.BackgroundStyle"

    invoke-static {}, Lcom/whoop/design/models/items/BackgroundStyle;->values()[Lcom/whoop/design/models/items/BackgroundStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ImpactCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ImpactCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ImpactCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ImpactCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ImpactCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/design/models/items/ImpactCardModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/ImpactCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)Lcom/whoop/design/models/items/ImpactCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ImpactCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/ImpactCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/InsufficientAnswerCount$$serializer;->INSTANCE:Lcom/whoop/design/models/items/InsufficientAnswerCount$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/TileTagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TileTagModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lo91/g;->a:Lo91/g;

    iget-object p0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/BackgroundStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    return-object v0
.end method

.method public final component11()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/InsufficientAnswerCount;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/InsufficientAnswerCount;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/TileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TileTagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)Lcom/whoop/design/models/items/ImpactCardModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/InsufficientAnswerCount;",
            "Lcom/whoop/design/models/items/InsufficientAnswerCount;",
            "Lcom/whoop/design/models/items/ImpactStyle;",
            "Lcom/whoop/design/models/items/TileTagModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TileTagModel;",
            ">;",
            "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
            "Lcom/whoop/design/models/items/BackgroundStyle;",
            "Ljava/util/UUID;",
            ")",
            "Lcom/whoop/design/models/items/ImpactCardModel;"
        }
    .end annotation

    const-string v0, "impactStyle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactBarSegment"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBackgroundStyle"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactUuid"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ImpactCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/ImpactCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ImpactCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ImpactCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    iget-object p1, p1, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCardBackgroundStyle()Lcom/whoop/design/models/items/BackgroundStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    return-object v0
.end method

.method public final getImpactBarSegment()Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    return-object v0
.end method

.method public final getImpactCardSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactCardTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactPercentageDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactStyle()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final getImpactUuid()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    return-object v0
.end method

.method public final getNoAnswerCount()Lcom/whoop/design/models/items/InsufficientAnswerCount;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    return-object v0
.end method

.method public final getTileTag()Lcom/whoop/design/models/items/TileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    return-object v0
.end method

.method public final getTileTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TileTagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    return-object v0
.end method

.method public final getYesAnswerCount()Lcom/whoop/design/models/items/InsufficientAnswerCount;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/InsufficientAnswerCount;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/InsufficientAnswerCount;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TileTagModel;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardTitleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactCardSubtitleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactPercentageDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/ImpactCardModel;->yesAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    iget-object v4, p0, Lcom/whoop/design/models/items/ImpactCardModel;->noAnswerCount:Lcom/whoop/design/models/items/InsufficientAnswerCount;

    iget-object v5, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v6, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    iget-object v7, p0, Lcom/whoop/design/models/items/ImpactCardModel;->tileTags:Ljava/util/List;

    iget-object v8, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iget-object v9, p0, Lcom/whoop/design/models/items/ImpactCardModel;->cardBackgroundStyle:Lcom/whoop/design/models/items/BackgroundStyle;

    iget-object v10, p0, Lcom/whoop/design/models/items/ImpactCardModel;->impactUuid:Ljava/util/UUID;

    const-string v11, ", impactCardSubtitleDisplay="

    const-string v12, ", impactPercentageDisplay="

    const-string v13, "ImpactCardModel(impactCardTitleDisplay="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", yesAnswerCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noAnswerCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", impactStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tileTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tileTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", impactBarSegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardBackgroundStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", impactUuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
