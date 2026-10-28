.class public final Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;,
        Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 J2\u00020\u0001:\u0002KLBo\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0012\u0010\u0013By\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001bJx\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010%J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010<\u001a\u0004\u0008=\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010>\u001a\u0004\u0008?\u0010\u001dR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010@\u001a\u0004\u0008A\u0010\u001fR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008C\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010D\u001a\u0004\u0008E\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010F\u001a\u0004\u0008G\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010<\u001a\u0004\u0008H\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010<\u001a\u0004\u0008I\u0010\u001b\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
        "level",
        "",
        "title",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
        "type",
        "",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
        "options",
        "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
        "sizeChart",
        "selectedOption",
        "",
        "variantSelectorIndex",
        "packItemId",
        "packItemProductKey",
        "<init>",
        "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
        "component6",
        "()Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
        "component7",
        "()I",
        "component8",
        "component9",
        "copy",
        "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        "toString",
        "hashCode",
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
        "write$Self$native_store_release",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
        "getLevel",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
        "getType",
        "Ljava/util/List;",
        "getOptions",
        "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
        "getSizeChart",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
        "getSelectedOption",
        "I",
        "getVariantSelectorIndex",
        "getPackItemId",
        "getPackItemProductKey",
        "Companion",
        "$serializer",
        "a",
        "native-store_release"
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

.field public static final Companion:Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$a;


# instance fields
.field private final level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
            ">;"
        }
    .end annotation
.end field

.field private final packItemId:Ljava/lang/String;

.field private final packItemProductKey:Ljava/lang/String;

.field private final selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

.field private final sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

.field private final title:Ljava/lang/String;

.field private final type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

.field private final variantSelectorIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->Companion:Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lzz1/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lzz1/a;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lzz1/a;

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x9

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v3, v7, v9

    const/4 v3, 0x1

    aput-object v1, v7, v3

    const/4 v3, 0x2

    aput-object v5, v7, v3

    aput-object v2, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

    const/4 v2, 0x6

    aput-object v1, v7, v2

    const/4 v2, 0x7

    aput-object v1, v7, v2

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;-><init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p11, p1, 0x1

    if-nez p11, :cond_0

    .line 3
    sget-object p2, Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;->PRODUCT:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    const-string p2, ""

    .line 6
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 7
    sget-object p2, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;->TEXT:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    .line 8
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 9
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 10
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    const/4 p2, 0x0

    iput p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    goto :goto_5

    :cond_6
    iput p8, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
            ">;",
            "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    .line 13
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    .line 14
    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    .line 15
    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    .line 16
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    .line 17
    iput-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    .line 18
    iput p7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    .line 19
    iput-object p8, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    .line 20
    iput-object p9, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    .line 21
    sget-object p1, Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;->PRODUCT:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 22
    const-string p2, ""

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    .line 23
    sget-object p3, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;->TEXT:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    .line 24
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    const/4 v0, 0x0

    if-eqz p11, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    const/4 p7, 0x0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move-object p11, v0

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_8
    move-object p11, p9

    move-object p10, p8

    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 25
    :goto_0
    invoke-direct/range {p2 .. p11}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;-><init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;->Companion:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel$a;

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;->Companion:Lcom/whoop/nativestore/pdp/domain/model/SelectorType$a;

    invoke-virtual {v0}, Lcom/whoop/nativestore/pdp/domain/model/SelectorType$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->copy(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    sget-object v3, Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;->PRODUCT:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    sget-object v3, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;->TEXT:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    if-eq v2, v3, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    if-eqz v1, :cond_d

    :goto_6
    iget v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    return-object v0
.end method

.method public final component6()Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
            ">;",
            "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;"
        }
    .end annotation

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;-><init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    iget v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getLevel()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getPackItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackItemProductKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedOption()Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    return-object v0
.end method

.method public final getSizeChart()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    return-object v0
.end method

.method public final getVariantSelectorIndex()I
    .locals 1

    iget v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/nativestore/pdp/domain/model/SizeChart;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->level:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->type:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->options:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->sizeChart:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    iget-object v5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->selectedOption:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    iget v6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->variantSelectorIndex:I

    iget-object v7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemId:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->packItemProductKey:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ProductVariantSelectorModel(level="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sizeChart="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedOption="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", variantSelectorIndex="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", packItemId="

    const-string v1, ", packItemProductKey="

    invoke-static {v6, v0, v7, v1, v9}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v8, v0, v9}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
