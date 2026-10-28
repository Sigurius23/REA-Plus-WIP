.class public final Lcom/whoop/design/models/items/DesignItemGridModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;,
        Lcom/whoop/design/models/items/DesignItemGridModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bq\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#Jt\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0017J\u0010\u0010\'\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008;\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008<\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008=\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008>\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010!R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010#\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DesignItemGridModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "",
        "columnWidth",
        "minHorizontalSpacing",
        "minVerticalSpacing",
        "minHorizontalPadding",
        "minVerticalPadding",
        "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;",
        "verticalAlignment",
        "",
        "numberOfColumns",
        "",
        "items",
        "<init>",
        "(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()D",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;",
        "component8",
        "()Ljava/lang/Integer;",
        "component9",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)Lcom/whoop/design/models/items/DesignItemGridModel;",
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
        "(Lcom/whoop/design/models/items/DesignItemGridModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "D",
        "getColumnWidth",
        "getMinHorizontalSpacing",
        "getMinVerticalSpacing",
        "getMinHorizontalPadding",
        "getMinVerticalPadding",
        "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;",
        "getVerticalAlignment",
        "Ljava/lang/Integer;",
        "getNumberOfColumns",
        "Ljava/util/List;",
        "getItems",
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

.field public static final Companion:Lcom/whoop/design/models/items/DesignItemGridModel$Companion;


# instance fields
.field private final columnWidth:D

.field private final id:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final minHorizontalPadding:D

.field private final minHorizontalSpacing:D

.field private final minVerticalPadding:D

.field private final minVerticalSpacing:D

.field private final numberOfColumns:Ljava/lang/Integer;

.field private final verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/DesignItemGridModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/DesignItemGridModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/DesignItemGridModel;->Companion:Lcom/whoop/design/models/items/DesignItemGridModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/DesignItemGridModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/c;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lw91/c;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/c;

    const/16 v5, 0x11

    invoke-direct {v4, v5}, Lw91/c;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0x9

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v3, v4, v5

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v2, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/DesignItemGridModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x103

    const/16 v1, 0x103

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    iput-wide p3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    and-int/lit8 p2, p1, 0x4

    const-wide/16 p3, 0x0

    if-nez p2, :cond_1

    iput-wide p3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    goto :goto_0

    :cond_1
    iput-wide p5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-wide p3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    goto :goto_1

    :cond_2
    iput-wide p7, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-wide p3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    goto :goto_2

    :cond_3
    iput-wide p9, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-wide p3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    goto :goto_3

    :cond_4
    iput-wide p11, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    :goto_3
    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    goto :goto_4

    :cond_5
    iput-object p13, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    :goto_4
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    :goto_5
    move-object/from16 p1, p15

    goto :goto_6

    :cond_6
    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    goto :goto_5

    :goto_6
    iput-object p1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "DDDDD",
            "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    .line 5
    iput-wide p4, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    .line 6
    iput-wide p6, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    .line 7
    iput-wide p8, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    .line 8
    iput-wide p10, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    .line 9
    iput-object p12, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    .line 10
    iput-object p13, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    .line 11
    iput-object p14, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x4

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v8, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v8, p4

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-wide v10, v2

    goto :goto_1

    :cond_1
    move-wide/from16 v10, p6

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-wide v12, v2

    goto :goto_2

    :cond_2
    move-wide/from16 v12, p8

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-wide v14, v2

    goto :goto_3

    :cond_3
    move-wide/from16 v14, p10

    :goto_3
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    move-object/from16 v16, v2

    goto :goto_4

    :cond_4
    move-object/from16 v16, p12

    :goto_4
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_5

    move-object/from16 v17, v2

    :goto_5
    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-wide/from16 v6, p2

    move-object/from16 v18, p14

    goto :goto_6

    :cond_5
    move-object/from16 v17, p13

    goto :goto_5

    .line 12
    :goto_6
    invoke-direct/range {v4 .. v18}, Lcom/whoop/design/models/items/DesignItemGridModel;-><init>(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;->Companion:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DesignItemGridModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DesignItemGridModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/DesignItemGridModel;Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/DesignItemGridModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p4

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    iget-wide v8, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p8

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    iget-wide v10, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p10

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    iget-object v12, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    goto :goto_6

    :cond_6
    move-object/from16 v12, p12

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    iget-object v13, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v13, p13

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    move-object/from16 p15, v0

    :goto_8
    move-object p1, p0

    move-object/from16 p2, v1

    move-wide/from16 p3, v2

    move-wide/from16 p5, v4

    move-wide/from16 p7, v6

    move-wide/from16 p9, v8

    move-wide/from16 p11, v10

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_9

    :cond_8
    move-object/from16 p15, p14

    goto :goto_8

    :goto_9
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/design/models/items/DesignItemGridModel;->copy(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)Lcom/whoop/design/models/items/DesignItemGridModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/DesignItemGridModel;Lzc3/c;Lyc3/g;)V
    .locals 7

    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iget-wide v5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-wide v5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_5

    :goto_2
    iget-wide v5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    invoke-interface {p1, p2, v1, v5, v6}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v5, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_7

    :goto_3
    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_7
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    return-wide v0
.end method

.method public final component7()Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)Lcom/whoop/design/models/items/DesignItemGridModel;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "DDDDD",
            "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/design/models/items/DesignItemGridModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/DesignItemGridModel;

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/items/DesignItemGridModel;-><init>(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/DesignItemGridModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/DesignItemGridModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    iget-object v3, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getColumnWidth()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    return-wide v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getMinHorizontalPadding()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    return-wide v0
.end method

.method public final getMinHorizontalSpacing()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    return-wide v0
.end method

.method public final getMinVerticalPadding()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    return-wide v0
.end method

.method public final getMinVerticalSpacing()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    return-wide v0
.end method

.method public final getNumberOfColumns()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getVerticalAlignment()Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->id:Ljava/lang/String;

    iget-wide v2, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->columnWidth:D

    iget-wide v4, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalSpacing:D

    iget-wide v6, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalSpacing:D

    iget-wide v8, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->minHorizontalPadding:D

    iget-wide v10, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->minVerticalPadding:D

    iget-object v12, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->verticalAlignment:Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    iget-object v13, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->numberOfColumns:Ljava/lang/Integer;

    iget-object v14, v0, Lcom/whoop/design/models/items/DesignItemGridModel;->items:Ljava/util/List;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, "DesignItemGridModel(id="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", columnWidth="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", minHorizontalSpacing="

    const-string v1, ", minVerticalSpacing="

    invoke-static {v15, v0, v4, v5, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v15, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", minHorizontalPadding="

    const-string v1, ", minVerticalPadding="

    invoke-static {v15, v0, v8, v9, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v15, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", verticalAlignment="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", numberOfColumns="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
