.class public final Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$$serializer;,
        Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0002`_B\u00b6\u0001\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\u0008\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012+\u0008\u0002\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\t0\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bB\u00af\u0001\u0008\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008\u001a\u0010 J#\u0010#\u001a\u00020\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0012H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010&J\u0010\u0010*\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010(J\u0010\u00101\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u001e\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J3\u00107\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\t0\u0018H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00106J\u00cd\u0001\u00108\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\u0008\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122+\u0008\u0002\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\t0\u0018H\u00c6\u0001\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008:\u0010&J\u0010\u0010;\u001a\u00020\u001cH\u00d6\u0001\u00a2\u0006\u0004\u0008;\u0010<J\u001a\u0010>\u001a\u00020\u000e2\u0008\u0010=\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001\u00a2\u0006\u0004\u0008F\u0010GR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010I\u001a\u0004\u0008J\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010K\u001a\u0004\u0008L\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010I\u001a\u0004\u0008M\u0010&R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010I\u001a\u0004\u0008N\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010O\u001a\u0004\u0008P\u0010,R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010Q\u001a\u0004\u0008R\u0010.R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010K\u001a\u0004\u0008S\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010K\u001a\u0004\u0008T\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010U\u001a\u0004\u0008V\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010W\u001a\u0004\u0008X\u00104R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010Y\u001a\u0004\u0008Z\u00106\"\u0004\u0008[\u0010\\RE\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015\u00a2\u0006\u000c\u0008\u0016\u0012\u0008\u0008\u0017\u0012\u0004\u0008\t0\u00188\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010Y\u001a\u0004\u0008]\u00106\"\u0004\u0008^\u0010\\\u00a8\u0006a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "leading",
        "icon",
        "title",
        "Lb91/c;",
        "titleTypography",
        "",
        "description",
        "trailing",
        "emoji",
        "",
        "iconBackgroundEnabled",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component3",
        "component4",
        "component5",
        "()Lb91/c;",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "component9",
        "()Z",
        "component10",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component11",
        "()Ljava/util/Map;",
        "component12",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getLeading",
        "getIcon",
        "getTitle",
        "Lb91/c;",
        "getTitleTypography",
        "Ljava/util/List;",
        "getDescription",
        "getTrailing",
        "getEmoji",
        "Z",
        "getIconBackgroundEnabled",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
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

.field public static final Companion:Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$Companion;


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final description:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final emoji:Lcom/whoop/design/models/DesignSystemModel;

.field private final icon:Ljava/lang/String;

.field private final iconBackgroundEnabled:Z

.field private final id:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final leading:Lcom/whoop/design/models/DesignSystemModel;

.field private final title:Ljava/lang/String;

.field private final titleTypography:Lb91/c;

.field private final trailing:Lcom/whoop/design/models/DesignSystemModel;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->Companion:Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, La2/d;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, La2/d;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, La2/d;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, La2/d;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, La2/d;

    const/16 v8, 0xd

    invoke-direct {v7, v8}, La2/d;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, La2/d;

    const/16 v9, 0xe

    invoke-direct {v8, v9}, La2/d;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    new-instance v9, La2/d;

    const/16 v10, 0xf

    invoke-direct {v9, v10}, La2/d;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v10, La2/d;

    const/16 v11, 0x10

    invoke-direct {v10, v11}, La2/d;-><init>(I)V

    invoke-static {v2, v10}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v6, v6, [Ll83/h;

    const/4 v10, 0x0

    aput-object v1, v6, v10

    const/4 v10, 0x1

    aput-object v3, v6, v10

    const/4 v3, 0x2

    aput-object v1, v6, v3

    const/4 v3, 0x3

    aput-object v1, v6, v3

    const/4 v3, 0x4

    aput-object v5, v6, v3

    const/4 v3, 0x5

    aput-object v7, v6, v3

    const/4 v3, 0x6

    aput-object v8, v6, v3

    const/4 v3, 0x7

    aput-object v9, v6, v3

    aput-object v1, v6, v0

    const/16 v0, 0x9

    aput-object v1, v6, v0

    const/16 v0, 0xa

    aput-object v2, v6, v0

    aput-object v1, v6, v4

    sput-object v6, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xdf

    const/16 v0, 0xdf

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    :goto_0
    iput-object p8, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p9, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_2

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    goto :goto_1

    :cond_2
    iput-boolean p10, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    :goto_1
    and-int/lit16 p2, p1, 0x200

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_2

    :cond_3
    iput-object p11, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_2
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    goto :goto_3

    :cond_4
    iput-object p12, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    :goto_3
    and-int/lit16 p1, p1, 0x800

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_5
    iput-object p13, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lb91/c;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Z",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    .line 13
    iput-boolean p9, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    .line 16
    iput-object p12, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 17
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v11, v1

    goto :goto_1

    :cond_1
    move/from16 v11, p9

    :goto_1
    and-int/lit16 v1, v0, 0x200

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object/from16 v12, p10

    :goto_2
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_3

    move-object v13, v2

    goto :goto_3

    :cond_3
    move-object/from16 v13, p11

    :goto_3
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_4

    move-object v14, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object v2, p0

    goto :goto_4

    :cond_4
    move-object/from16 v14, p12

    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    .line 18
    :goto_4
    invoke-direct/range {v2 .. v14}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.typography.WhoopTextStyle"

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p9, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

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

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    aget-object v3, v0, v1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    aget-object v3, v0, v1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x6

    aget-object v3, v0, v1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v3, v0, v1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    if-eq v3, v2, :cond_3

    :goto_1
    iget-boolean v2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/WithGeneratedBindings;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lb91/c;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Z",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getDescription()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    return-object v0
.end method

.method public final getEmoji()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconBackgroundEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getLeading()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleTypography()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    return-object v0
.end method

.method public final getTrailing()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->icon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->title:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->titleTypography:Lb91/c;

    iget-object v5, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->description:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->trailing:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v7, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->emoji:Lcom/whoop/design/models/DesignSystemModel;

    iget-boolean v8, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->iconBackgroundEnabled:Z

    iget-object v9, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v10, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->bindings:Ljava/util/Map;

    iget-object v11, p0, Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;->aggregateBindings:Ljava/util/Map;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "RecommendationTileHeaderModel(id="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", leading="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    const-string v1, ", titleTypography="

    invoke-static {v12, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trailing="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", emoji="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconBackgroundEnabled="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", interaction="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", aggregateBindings="

    const-string v1, ")"

    invoke-static {v12, v10, v0, v11, v1}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
