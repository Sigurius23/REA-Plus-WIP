.class public final Lcom/whoop/design/models/items/ExpandableContentModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ExpandableContentModel$$serializer;,
        Lcom/whoop/design/models/items/ExpandableContentModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 H2\u00020\u0001:\u0002IHB_\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bo\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&Jl\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020\t2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008;\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008=\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010>\u001a\u0004\u0008?\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010@\u001a\u0004\u0008A\u0010 R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008C\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010D\u001a\u0004\u0008E\u0010$R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010F\u001a\u0004\u0008G\u0010&\u00a8\u0006J"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ExpandableContentModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "Lb91/c;",
        "titleTypography",
        "Lcom/whoop/design/models/items/TagModel;",
        "tag",
        "",
        "initiallyExpanded",
        "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;",
        "itemLayout",
        "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;",
        "headerPosition",
        "",
        "items",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lb91/c;",
        "component4",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component5",
        "()Z",
        "component6",
        "()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;",
        "component7",
        "()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;",
        "component8",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)Lcom/whoop/design/models/items/ExpandableContentModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "(Lcom/whoop/design/models/items/ExpandableContentModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "Lb91/c;",
        "getTitleTypography",
        "Lcom/whoop/design/models/items/TagModel;",
        "getTag",
        "Z",
        "getInitiallyExpanded",
        "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;",
        "getItemLayout",
        "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;",
        "getHeaderPosition",
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

.field public static final Companion:Lcom/whoop/design/models/items/ExpandableContentModel$Companion;


# instance fields
.field private final headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

.field private final id:Ljava/lang/String;

.field private final initiallyExpanded:Z

.field private final itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tag:Lcom/whoop/design/models/items/TagModel;

.field private final title:Ljava/lang/String;

.field private final titleTypography:Lb91/c;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/design/models/items/ExpandableContentModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ExpandableContentModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ExpandableContentModel;->Companion:Lcom/whoop/design/models/items/ExpandableContentModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ExpandableContentModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/d;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lw91/d;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/d;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lw91/d;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/d;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lw91/d;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lw91/d;

    const/4 v10, 0x3

    invoke-direct {v9, v10}, Lw91/d;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    aput-object v1, v0, v4

    aput-object v1, v0, v6

    aput-object v3, v0, v8

    aput-object v1, v0, v10

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v1, 0x5

    aput-object v5, v0, v1

    const/4 v1, 0x6

    aput-object v7, v0, v1

    const/4 v1, 0x7

    aput-object v2, v0, v1

    sput-object v0, Lcom/whoop/design/models/items/ExpandableContentModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x6

    const/4 v0, 0x6

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/ExpandableContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ExpandableContentModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/ExpandableContentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const/4 v0, 0x0

    if-nez p10, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    :goto_0
    iput-object p3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    goto :goto_2

    :cond_3
    iput-boolean p6, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    .line 2
    sget-object p2, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;->HORIZONTAL:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    .line 4
    sget-object p2, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;->TOP:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    :goto_4
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_6

    .line 6
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 7
    iput-object p1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    return-void

    :cond_6
    iput-object p9, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lb91/c;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Z",
            "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;",
            "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemLayout"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerPosition"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    .line 12
    iput-object p4, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    .line 13
    iput-boolean p5, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    .line 14
    iput-object p6, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    .line 15
    iput-object p7, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    .line 16
    iput-object p8, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_2

    const/4 p5, 0x1

    :cond_2
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_3

    .line 17
    sget-object p6, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;->HORIZONTAL:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    :cond_3
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_4

    .line 18
    sget-object p7, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;->TOP:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    :cond_4
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_5

    .line 19
    sget-object p8, Lm83/y;->w:Lm83/y;

    :cond_5
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 20
    invoke-direct/range {p1 .. p9}, Lcom/whoop/design/models/items/ExpandableContentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.typography.WhoopTextStyle"

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;->Companion:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout$a;

    invoke-virtual {v0}, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;->Companion:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition$a;

    invoke-virtual {v0}, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/design/models/items/ExpandableContentModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ExpandableContentModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ExpandableContentModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ExpandableContentModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/ExpandableContentModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-boolean p5, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/ExpandableContentModel;->copy(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)Lcom/whoop/design/models/items/ExpandableContentModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ExpandableContentModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ExpandableContentModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/ExpandableContentModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v3, v0, v1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    if-eqz v3, :cond_3

    :goto_1
    sget-object v3, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    if-eq v3, v2, :cond_5

    :goto_2
    iget-boolean v2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    sget-object v3, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;->HORIZONTAL:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    if-eq v2, v3, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    sget-object v3, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;->TOP:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    if-eq v2, v3, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    return v0
.end method

.method public final component6()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)Lcom/whoop/design/models/items/ExpandableContentModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lb91/c;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Z",
            "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;",
            "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/design/models/items/ExpandableContentModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemLayout"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerPosition"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ExpandableContentModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/ExpandableContentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ExpandableContentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ExpandableContentModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getHeaderPosition()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitiallyExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    return v0
.end method

.method public final getItemLayout()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleTypography()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->titleTypography:Lb91/c;

    iget-object v3, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-boolean v4, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->initiallyExpanded:Z

    iget-object v5, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->itemLayout:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    iget-object v6, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->headerPosition:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    iget-object v7, p0, Lcom/whoop/design/models/items/ExpandableContentModel;->items:Ljava/util/List;

    const-string v8, ", title="

    const-string v9, ", titleTypography="

    const-string v10, "ExpandableContentModel(id="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initiallyExpanded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", itemLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
