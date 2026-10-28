.class public final Lcom/whoop/design/models/items/whooprow/WhoopRowModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/whooprow/WhoopRowModel$$serializer;,
        Lcom/whoop/design/models/items/whooprow/WhoopRowModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 J2\u00020\u0001:\u0002KJBk\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013Bq\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'Jt\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101J\'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001\u00a2\u0006\u0004\u00088\u00109R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010;\u001a\u0004\u0008<\u0010\u001aR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008>\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010?\u001a\u0004\u0008@\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010 R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008E\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010F\u001a\u0004\u0008G\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010H\u001a\u0004\u0008I\u0010\'\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/design/models/items/whooprow/WhoopRowModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "",
        "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;",
        "items",
        "Lcom/whoop/design/models/items/Spacing;",
        "spacing",
        "Lcom/whoop/design/models/items/AxisSizeType;",
        "mainAxisSize",
        "Lcom/whoop/design/models/items/MainAxisAlignment;",
        "mainAxisAlignment",
        "crossAxisSize",
        "Lcom/whoop/design/models/items/CrossAxisAlignment;",
        "crossAxisAlignment",
        "Lcom/whoop/design/models/items/SpacingInsets;",
        "padding",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/items/Spacing;",
        "component4",
        "()Lcom/whoop/design/models/items/AxisSizeType;",
        "component5",
        "()Lcom/whoop/design/models/items/MainAxisAlignment;",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/CrossAxisAlignment;",
        "component8",
        "()Lcom/whoop/design/models/items/SpacingInsets;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)Lcom/whoop/design/models/items/whooprow/WhoopRowModel;",
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
        "(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/design/models/items/Spacing;",
        "getSpacing",
        "Lcom/whoop/design/models/items/AxisSizeType;",
        "getMainAxisSize",
        "Lcom/whoop/design/models/items/MainAxisAlignment;",
        "getMainAxisAlignment",
        "getCrossAxisSize",
        "Lcom/whoop/design/models/items/CrossAxisAlignment;",
        "getCrossAxisAlignment",
        "Lcom/whoop/design/models/items/SpacingInsets;",
        "getPadding",
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

.field public static final Companion:Lcom/whoop/design/models/items/whooprow/WhoopRowModel$Companion;


# instance fields
.field private final crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

.field private final crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

.field private final id:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

.field private final mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

.field private final padding:Lcom/whoop/design/models/items/SpacingInsets;

.field private final spacing:Lcom/whoop/design/models/items/Spacing;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->Companion:Lcom/whoop/design/models/items/whooprow/WhoopRowModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Leb1/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Leb1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Leb1/a;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Leb1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Leb1/a;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Leb1/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Leb1/a;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Leb1/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Leb1/a;

    const/4 v12, 0x5

    invoke-direct {v11, v12}, Leb1/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v13, Leb1/a;

    const/4 v14, 0x6

    invoke-direct {v13, v14}, Leb1/a;-><init>(I)V

    invoke-static {v2, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v13, 0x0

    aput-object v1, v0, v13

    aput-object v3, v0, v4

    aput-object v5, v0, v6

    aput-object v7, v0, v8

    aput-object v9, v0, v10

    aput-object v11, v0, v12

    aput-object v2, v0, v14

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->$childSerializers:[Ll83/h;

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

    invoke-direct/range {v0 .. v10}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const/4 v0, 0x0

    if-nez p10, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/Spacing;",
            "Lcom/whoop/design/models/items/AxisSizeType;",
            "Lcom/whoop/design/models/items/MainAxisAlignment;",
            "Lcom/whoop/design/models/items/AxisSizeType;",
            "Lcom/whoop/design/models/items/CrossAxisAlignment;",
            "Lcom/whoop/design/models/items/SpacingInsets;",
            ")V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    .line 9
    iput-object p4, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    .line 10
    iput-object p5, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    .line 11
    iput-object p6, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    .line 12
    iput-object p7, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    .line 13
    iput-object p8, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    .line 14
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p9, p8

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/Spacing;->Companion:Lcom/whoop/design/models/items/Spacing$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/Spacing$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/AxisSizeType;->Companion:Lcom/whoop/design/models/items/AxisSizeType$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/AxisSizeType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/MainAxisAlignment;->Companion:Lcom/whoop/design/models/items/MainAxisAlignment$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/MainAxisAlignment$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/AxisSizeType;->Companion:Lcom/whoop/design/models/items/AxisSizeType$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/AxisSizeType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CrossAxisAlignment;->Companion:Lcom/whoop/design/models/items/CrossAxisAlignment$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CrossAxisAlignment$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;ILjava/lang/Object;)Lcom/whoop/design/models/items/whooprow/WhoopRowModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)Lcom/whoop/design/models/items/whooprow/WhoopRowModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/items/SpacingInsets$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SpacingInsets$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/Spacing;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/AxisSizeType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/MainAxisAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/AxisSizeType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/CrossAxisAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/SpacingInsets;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)Lcom/whoop/design/models/items/whooprow/WhoopRowModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/Spacing;",
            "Lcom/whoop/design/models/items/AxisSizeType;",
            "Lcom/whoop/design/models/items/MainAxisAlignment;",
            "Lcom/whoop/design/models/items/AxisSizeType;",
            "Lcom/whoop/design/models/items/CrossAxisAlignment;",
            "Lcom/whoop/design/models/items/SpacingInsets;",
            ")",
            "Lcom/whoop/design/models/items/whooprow/WhoopRowModel;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    iget-object v3, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    iget-object v3, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    iget-object v3, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    iget-object v3, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    iget-object v3, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    iget-object p1, p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCrossAxisAlignment()Lcom/whoop/design/models/items/CrossAxisAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    return-object v0
.end method

.method public final getCrossAxisSize()Lcom/whoop/design/models/items/AxisSizeType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getMainAxisAlignment()Lcom/whoop/design/models/items/MainAxisAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    return-object v0
.end method

.method public final getMainAxisSize()Lcom/whoop/design/models/items/AxisSizeType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    return-object v0
.end method

.method public final getPadding()Lcom/whoop/design/models/items/SpacingInsets;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    return-object v0
.end method

.method public final getSpacing()Lcom/whoop/design/models/items/Spacing;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/design/models/items/SpacingInsets;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->items:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->spacing:Lcom/whoop/design/models/items/Spacing;

    iget-object v3, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    iget-object v4, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->mainAxisAlignment:Lcom/whoop/design/models/items/MainAxisAlignment;

    iget-object v5, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisSize:Lcom/whoop/design/models/items/AxisSizeType;

    iget-object v6, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->crossAxisAlignment:Lcom/whoop/design/models/items/CrossAxisAlignment;

    iget-object v7, p0, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->padding:Lcom/whoop/design/models/items/SpacingInsets;

    const-string v8, ", items="

    const-string v9, ", spacing="

    const-string v10, "WhoopRowModel(id="

    invoke-static {v10, v0, v8, v9, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mainAxisSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mainAxisAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", crossAxisSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", crossAxisAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", padding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
