.class public final Lcom/whoop/design/models/items/ItemsCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ItemsCardModel$$serializer;,
        Lcom/whoop/design/models/items/ItemsCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9BC\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBY\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"JV\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00082\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010 R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u00087\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00088\u0010\"\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ItemsCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/ItemsCardHeaderModel;",
        "header",
        "Lcom/whoop/design/models/items/ItemsCardFooterModel;",
        "footer",
        "Lv71/a;",
        "backgroundStyle",
        "",
        "items",
        "footerItems",
        "<init>",
        "(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ItemsCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/ItemsCardHeaderModel;",
        "component2",
        "()Lcom/whoop/design/models/items/ItemsCardFooterModel;",
        "component3",
        "()Lv71/a;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "copy",
        "(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/ItemsCardModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/ItemsCardHeaderModel;",
        "getHeader",
        "Lcom/whoop/design/models/items/ItemsCardFooterModel;",
        "getFooter",
        "Lv71/a;",
        "getBackgroundStyle",
        "Ljava/util/List;",
        "getItems",
        "getFooterItems",
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

.field public static final Companion:Lcom/whoop/design/models/items/ItemsCardModel$Companion;


# instance fields
.field private final backgroundStyle:Lv71/a;

.field private final footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

.field private final footerItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/ItemsCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ItemsCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ItemsCardModel;->Companion:Lcom/whoop/design/models/items/ItemsCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ItemsCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lun1/f;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lun1/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lun1/f;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Lun1/f;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lun1/f;

    const/16 v5, 0x14

    invoke-direct {v4, v5}, Lun1/f;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const/4 v1, 0x3

    aput-object v3, v4, v1

    const/4 v1, 0x4

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/design/models/items/ItemsCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/items/ItemsCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ItemsCardModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/items/ItemsCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    iput-object p3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    iput-object p4, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    iput-object p5, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/ItemsCardHeaderModel;",
            "Lcom/whoop/design/models/items/ItemsCardFooterModel;",
            "Lv71/a;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.itemscard.ItemsCardBackgroundStyle"

    invoke-static {}, Lv71/a;->values()[Lv71/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ItemsCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ItemsCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ItemsCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ItemsCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ItemsCardModel;Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/ItemsCardModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/ItemsCardModel;->copy(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/ItemsCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ItemsCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/ItemsCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/ItemsCardHeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ItemsCardHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/ItemsCardFooterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ItemsCardFooterModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/ItemsCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/ItemsCardFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    return-object v0
.end method

.method public final component3()Lv71/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/ItemsCardModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/ItemsCardHeaderModel;",
            "Lcom/whoop/design/models/items/ItemsCardFooterModel;",
            "Lv71/a;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/design/models/items/ItemsCardModel;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ItemsCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/ItemsCardModel;-><init>(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ItemsCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ItemsCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    iget-object v3, p1, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBackgroundStyle()Lv71/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/design/models/items/ItemsCardFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    return-object v0
.end method

.method public final getFooterItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/items/ItemsCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/ItemsCardHeaderModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/design/models/items/ItemsCardFooterModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/items/ItemsCardModel;->header:Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footer:Lcom/whoop/design/models/items/ItemsCardFooterModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/ItemsCardModel;->backgroundStyle:Lv71/a;

    iget-object v3, p0, Lcom/whoop/design/models/items/ItemsCardModel;->items:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/items/ItemsCardModel;->footerItems:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ItemsCardModel(header="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundStyle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footerItems="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
