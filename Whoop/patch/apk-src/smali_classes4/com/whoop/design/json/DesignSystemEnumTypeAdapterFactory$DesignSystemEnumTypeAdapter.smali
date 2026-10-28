.class final Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DesignSystemEnumTypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/gson/TypeAdapter<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u0000 \u0013*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;",
        "T",
        "Lcom/google/gson/TypeAdapter;",
        "",
        "typeString",
        "<init>",
        "(Ljava/lang/String;)V",
        "Lcom/google/gson/stream/JsonWriter;",
        "out",
        "value",
        "Ll83/a0;",
        "write",
        "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V",
        "Lcom/google/gson/stream/JsonReader;",
        "in",
        "read",
        "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;",
        "a",
        "Ljava/lang/String;",
        "b",
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


# static fields
.field public static final b:Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter$a;

.field private static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 84

    new-instance v0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->b:Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter$a;

    const-class v0, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/design/json/f;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v0, Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/design/json/f;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v0, Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/design/json/f;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v0, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    const/16 v6, 0x1a

    invoke-direct {v2, v6}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    const/16 v7, 0x8

    invoke-direct {v2, v7}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/design/json/g;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v3 .. v8}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->c:Ljava/util/Map;

    const-class v1, Lcom/whoop/design/models/items/AlarmStatus;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/BackgroundStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/BatteryStatus;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Llb1/r0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v13, Ll83/k;

    invoke-direct {v13, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/CheckmarkStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v14, Ll83/k;

    invoke-direct {v14, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v15, Ll83/k;

    invoke-direct {v15, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/CircularProgressStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v16, v3

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v17, v3

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lhy0/g;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v18, v3

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v19, v3

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v20, v3

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v21, v3

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v22, v3

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lj61/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v23, v3

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v24, v3

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lj61/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v25, v3

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lj61/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v26, v3

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lj61/e;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v27, v3

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lg61/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v28, v3

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lg61/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v29, v3

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lg61/f;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v30, v3

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v31, v3

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v32, v3

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v33, v3

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/HeaderStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v34, v3

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm71/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v35, v3

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v36, v3

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/HeartRateTileStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v37, v3

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lkd1/l;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v38, v3

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/f;

    move-object/from16 v39, v3

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lcom/whoop/design/json/f;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lh01/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v40, v3

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lny0/p;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v41, v3

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lv71/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v42, v3

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/ProgressMeterStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v43, v3

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lny0/m0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v44, v3

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v45, v3

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/IconPointStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v46, v3

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/IconGradient;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v47, v3

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/IconSize;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v48, v3

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v49, v3

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/IndicatorStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v50, v3

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v51, v3

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v52, v3

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/ItemsCardFooterAlignment;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v53, v3

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v54, v3

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/JournalEntrypointState;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v55, v3

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/LayoutDirection;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v56, v3

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/LegendShape;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v57, v3

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/LegendStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v58, v3

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v59, v3

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v60, v3

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v61, v3

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v62, v3

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v63, v3

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, La71/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/g;

    move-object/from16 v64, v3

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lcom/whoop/design/json/g;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v65, v3

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v66, v3

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v67, v3

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/ProgressStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v68, v3

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v69, v3

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, La71/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v70, v3

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v71, v3

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v72, v3

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lo01/e;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v73, v3

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/TileBorderStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v74, v3

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/modal/ToastActionButtonAlignment;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v75, v3

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/modal/ToastStyleModel;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v76, v3

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v77, v3

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v78, v3

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lgz0/m0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v79, v3

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v80, v3

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v81, v3

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/json/h;

    move-object/from16 v82, v3

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lcom/whoop/design/json/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v83, v3

    filled-new-array/range {v4 .. v83}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "typeString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    iput-object p1, p0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic A(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->f1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->y1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final A1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/IconPointStyle;->EMPTY:Lcom/whoop/design/models/items/graph/plot/IconPointStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/IconPointStyle;->values()[Lcom/whoop/design/models/items/graph/plot/IconPointStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic B(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->w1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->l2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final B1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/IconGradient;->NONE:Lcom/whoop/design/models/IconGradient;

    invoke-static {}, Lcom/whoop/design/models/IconGradient;->values()[Lcom/whoop/design/models/IconGradient;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic C(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->B1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->Q0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final C1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/IconSize;->MEDIUM:Lcom/whoop/design/models/IconSize;

    invoke-static {}, Lcom/whoop/design/models/IconSize;->values()[Lcom/whoop/design/models/IconSize;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic D(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->m1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->M0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final D1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ImpactStyle;->INELIGIBLE:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-static {}, Lcom/whoop/design/models/items/ImpactStyle;->values()[Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic E(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->W0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->Q1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final E1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/IndicatorStyle;->NO_DATA:Lcom/whoop/design/models/items/IndicatorStyle;

    invoke-static {}, Lcom/whoop/design/models/items/IndicatorStyle;->values()[Lcom/whoop/design/models/items/IndicatorStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic F(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->j1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->l1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final F1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->IMPACT_DETAIL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-static {}, Lcom/whoop/design/models/items/InfoCalloutStyle;->values()[Lcom/whoop/design/models/items/InfoCalloutStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic G(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->A1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->t1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final G1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;->TEXT:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;->values()[Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic H(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->i2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->X0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final H1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->STANDARD:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->values()[Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic I(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->L1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final I0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->DISCOVER_MORE:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->values()[Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final I1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ItemsCardFooterAlignment;->END:Lcom/whoop/design/models/items/ItemsCardFooterAlignment;

    invoke-static {}, Lcom/whoop/design/models/items/ItemsCardFooterAlignment;->values()[Lcom/whoop/design/models/items/ItemsCardFooterAlignment;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic J(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->R1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final J0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;->STANDARD:Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;->values()[Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final J1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ItemVisibilityStateEnum;->ENABLED:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    invoke-static {}, Lcom/whoop/design/models/items/ItemVisibilityStateEnum;->values()[Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic K(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->D1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final K0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileModelEventEnum;->STRESS_MONITOR_IN_APP_EDUCATION:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileModelEventEnum;->values()[Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final K1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/JournalEntrypointState;->INTRADAY:Lcom/whoop/design/models/items/JournalEntrypointState;

    invoke-static {}, Lcom/whoop/design/models/items/JournalEntrypointState;->values()[Lcom/whoop/design/models/items/JournalEntrypointState;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic L(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->z1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->DISMISS:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->values()[Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final L1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/LayoutDirection;->LEFT_TO_RIGHT:Lcom/whoop/design/models/items/graph/LayoutDirection;

    invoke-static {}, Lcom/whoop/design/models/items/graph/LayoutDirection;->values()[Lcom/whoop/design/models/items/graph/LayoutDirection;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic M(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->O0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->VIEW_ALL:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->values()[Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final M1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->CIRCLE:Lcom/whoop/design/models/items/graph/LegendShape;

    invoke-static {}, Lcom/whoop/design/models/items/graph/LegendShape;->values()[Lcom/whoop/design/models/items/graph/LegendShape;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic N(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->f2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->MORE:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->values()[Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final N1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/LegendStyle;->ASLEEP:Lcom/whoop/design/models/LegendStyle;

    invoke-static {}, Lcom/whoop/design/models/LegendStyle;->values()[Lcom/whoop/design/models/LegendStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic O(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->h2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/AlarmStatus;->OFF:Lcom/whoop/design/models/items/AlarmStatus;

    invoke-static {}, Lcom/whoop/design/models/items/AlarmStatus;->values()[Lcom/whoop/design/models/items/AlarmStatus;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final O1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;->values()[Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic P(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->V0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/BackgroundStyle;->NONE:Lcom/whoop/design/models/items/BackgroundStyle;

    invoke-static {}, Lcom/whoop/design/models/items/BackgroundStyle;->values()[Lcom/whoop/design/models/items/BackgroundStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final P1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;->values()[Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic Q(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->Y1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/CheckmarkStyle;->DISABLED:Lcom/whoop/design/models/items/CheckmarkStyle;

    invoke-static {}, Lcom/whoop/design/models/items/CheckmarkStyle;->values()[Lcom/whoop/design/models/items/CheckmarkStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final Q1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LineWidth;->STANDARD:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LineWidth;->values()[Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic R(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->g1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;->COLLAPSED:Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;

    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;->values()[Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final R1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;->CARDIO_ACTIVITY:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;->values()[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic S(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->p1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final S0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/CircularProgressStyle;->ACTIVITY_SNAPSHOT:Lcom/whoop/design/models/CircularProgressStyle;

    invoke-static {}, Lcom/whoop/design/models/CircularProgressStyle;->values()[Lcom/whoop/design/models/CircularProgressStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final S1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/BatteryStatus;->CHARGED:Lcom/whoop/design/models/items/BatteryStatus;

    invoke-static {}, Lcom/whoop/design/models/items/BatteryStatus;->values()[Lcom/whoop/design/models/items/BatteryStatus;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic T(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->E1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/DashPattern;->SOLID:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/DashPattern;->values()[Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final T1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->PENDING:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->values()[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic U(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->C1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final U0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;->CENTER:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    invoke-static {}, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;->values()[Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final U1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La71/b;->MCI_LUTEAL:La71/b;

    invoke-static {}, La71/b;->values()[La71/b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic V(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->F1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhy0/g;->SOLID:Lhy0/g;

    invoke-static {}, Lhy0/g;->values()[Lhy0/g;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final V1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/PointShape;->CIRCLE:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/PointShape;->values()[Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic W(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->N0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final W0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;->TIME:Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;

    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;->values()[Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final W1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/PointSize;->STANDARD:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/PointSize;->values()[Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic X(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->o2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final X0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;->COLLAPSED:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    invoke-static {}, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;->values()[Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final X1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;->ALL:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;->values()[Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic Y(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->k2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final Y0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;->FULL:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;->values()[Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final Y1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ProgressStyle;->STEPS:Lcom/whoop/design/models/items/ProgressStyle;

    invoke-static {}, Lcom/whoop/design/models/items/ProgressStyle;->values()[Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic Z(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->Z1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final Z0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/GoalSettingsTileStyle;->RECOVERY_ACTIVITY:Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    invoke-static {}, Lcom/whoop/design/models/items/GoalSettingsTileStyle;->values()[Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final Z1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_NONE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->values()[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic a(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->U1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->I0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final a1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;->UNKNOWN:Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;->values()[Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final a2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La71/d;->AWAKE:La71/d;

    invoke-static {}, La71/d;->values()[La71/d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic b(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->M1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->n1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj61/a;->X_AXIS:Lj61/a;

    invoke-static {}, Lj61/a;->values()[Lj61/a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final b2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/StressGraphingCardSize;->FULL:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardSize;->values()[Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic c(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->K1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->u1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final c1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;->LEFT:Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;->values()[Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final c2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/stress/StressState;->NO_DATA:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-static {}, Lcom/whoop/design/models/items/graph/stress/StressState;->values()[Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic d(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->T0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->h1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final d1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj61/b;->TEXTUAL:Lj61/b;

    invoke-static {}, Lj61/b;->values()[Lj61/b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final d2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;->DEFAULT:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;->values()[Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic e(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->k1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->R0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final e1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj61/d;->STANDARD:Lj61/d;

    invoke-static {}, Lj61/d;->values()[Lj61/d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final e2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo01/e;->GENERAL:Lo01/e;

    invoke-static {}, Lo01/e;->values()[Lo01/e;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic f(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->q1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->J1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final f1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj61/e;->REGION_HIGHLIGHT:Lj61/e;

    invoke-static {}, Lj61/e;->values()[Lj61/e;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final f2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/TileBorderStyle;->NONE:Lcom/whoop/design/models/items/TileBorderStyle;

    invoke-static {}, Lcom/whoop/design/models/items/TileBorderStyle;->values()[Lcom/whoop/design/models/items/TileBorderStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic g(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->g2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->e2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final g1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg61/c;->SOLID:Lg61/c;

    invoke-static {}, Lg61/c;->values()[Lg61/c;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final g2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/modal/ToastActionButtonAlignment;->UNKNOWN:Lcom/whoop/design/models/modal/ToastActionButtonAlignment;

    invoke-static {}, Lcom/whoop/design/models/modal/ToastActionButtonAlignment;->values()[Lcom/whoop/design/models/modal/ToastActionButtonAlignment;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic h(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->Y0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->K0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg61/d;->STANDARD:Lg61/d;

    invoke-static {}, Lg61/d;->values()[Lg61/d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final h2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/modal/ToastStyleModel;->UNKNOWN:Lcom/whoop/design/models/modal/ToastStyleModel;

    invoke-static {}, Lcom/whoop/design/models/modal/ToastStyleModel;->values()[Lcom/whoop/design/models/modal/ToastStyleModel;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic i(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->H1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->x1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg61/f;->X_AXIS:Lg61/f;

    invoke-static {}, Lg61/f;->values()[Lg61/f;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final i2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->STRAIN:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->values()[Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic j(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->P1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->e1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final j1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;->values()[Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final j2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->NEUTRAL:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-static {}, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->values()[Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic k(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->o1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->L0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final k1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;->values()[Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final k2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic l(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->S0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->b1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final l1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;->values()[Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final l2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;->PRIMARY:Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;

    invoke-static {}, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;->values()[Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic m(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->r1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->G1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final m1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;->values()[Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final m2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;->UNKNOWN:Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;

    invoke-static {}, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;->values()[Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic n(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->Z0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->S1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final n1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/HeaderStyle;->NONE:Lcom/whoop/design/models/items/HeaderStyle;

    invoke-static {}, Lcom/whoop/design/models/items/HeaderStyle;->values()[Lcom/whoop/design/models/items/HeaderStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final n2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;->DISABLED:Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;

    invoke-static {}, Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;->values()[Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic o(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->v1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->b2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final o1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm71/c;->NORMAL:Lm71/c;

    invoke-static {}, Lm71/c;->values()[Lm71/c;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final o2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;->DEFAULT:Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;->values()[Lcom/whoop/design/models/items/graph/ChartBackgroundStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic p(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->W1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->N1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final p1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/HeartRateTileId;->NONE:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-static {}, Lcom/whoop/design/models/items/HeartRateTileId;->values()[Lcom/whoop/design/models/items/HeartRateTileId;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final p2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/r0;->EQUAL:Llb1/r0;

    invoke-static {}, Llb1/r0;->values()[Llb1/r0;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic q(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->I1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->i1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final q1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/HeartRateTileStyle;->NONE:Lcom/whoop/design/models/items/HeartRateTileStyle;

    invoke-static {}, Lcom/whoop/design/models/items/HeartRateTileStyle;->values()[Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic r(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->p2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->a1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final r1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkd1/l;->NONE:Lkd1/l;

    invoke-static {}, Lkd1/l;->values()[Lkd1/l;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic s(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->X1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->U0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final s1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->FREE:Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    invoke-static {}, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->values()[Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic t(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->j2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->d1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final t1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh01/a;->DEFAULT:Lh01/a;

    invoke-static {}, Lh01/a;->values()[Lh01/a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic u(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->O1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->s1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final u1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lny0/p;->DEFAULT:Lny0/p;

    invoke-static {}, Lny0/p;->values()[Lny0/p;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic v(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->d2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->n2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final v1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv71/a;->STANDARD:Lv71/a;

    invoke-static {}, Lv71/a;->values()[Lv71/a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic w(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->V1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->a2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final w1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;->STRAIN:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;->values()[Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic x(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->m2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->J0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final x1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/ProgressMeterStyle;->DEFAULT:Lcom/whoop/design/models/ProgressMeterStyle;

    invoke-static {}, Lcom/whoop/design/models/ProgressMeterStyle;->values()[Lcom/whoop/design/models/ProgressMeterStyle;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic y(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->c1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->c2(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final y1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lny0/m0;->DEFAULT:Lny0/m0;

    invoke-static {}, Lny0/m0;->values()[Lny0/m0;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static synthetic z(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->P0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->T1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;

    move-result-object p0

    return-object p0
.end method

.method private static final z1(Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemEnum;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;->MATCHES_OR_SELECTED:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;->values()[Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    const-string v0, "in"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "nextString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->d:Ljava/util/Map;

    iget-object v1, p0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;->a:Ljava/lang/String;

    const-string v0, "enum "

    const-string v1, " must be added to the DesignSystemEnumTypeAdapter map"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonWriter;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    return-void

    :cond_0
    instance-of v0, p2, Ljava/lang/Enum;

    if-eqz v0, :cond_1

    check-cast p2, Ljava/lang/Enum;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    return-void

    :cond_1
    const-string p1, "If value "

    const-string v0, " isn\'t an enum you probably messed up"

    invoke-static {p2, p1, v0}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
