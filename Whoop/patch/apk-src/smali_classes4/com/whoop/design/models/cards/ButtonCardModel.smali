.class public final Lcom/whoop/design/models/cards/ButtonCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;,
        Lcom/whoop/design/models/cards/ButtonCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 g2\u00020\u0001:\u0002hgB\u00b3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dB\u00c7\u0001\u0008\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008\u001c\u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0010\u00106\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u00d4\u0001\u0010<\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0001\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010>\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010#J\u0010\u0010?\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010@J\u001a\u0010C\u001a\u00020\u00112\u0008\u0010B\u001a\u0004\u0018\u00010AH\u00d6\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001\u00a2\u0006\u0004\u0008K\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010N\u001a\u0004\u0008O\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010N\u001a\u0004\u0008P\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010N\u001a\u0004\u0008Q\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010N\u001a\u0004\u0008R\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010N\u001a\u0004\u0008S\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010T\u001a\u0004\u0008U\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010V\u001a\u0004\u0008W\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010X\u001a\u0004\u0008Y\u0010-R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010Z\u001a\u0004\u0008[\u0010/R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010Z\u001a\u0004\u0008\\\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010]\u001a\u0004\u0008\u0012\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010N\u001a\u0004\u0008^\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010_\u001a\u0004\u0008`\u00105R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010a\u001a\u0004\u0008b\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010c\u001a\u0004\u0008d\u00109R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010e\u001a\u0004\u0008f\u0010;\u00a8\u0006i"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/ButtonCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "body",
        "imageUrl",
        "imageUrlAlignment",
        "",
        "imageSize",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "button",
        "Lcom/whoop/design/models/items/TagModel;",
        "tag",
        "",
        "items",
        "expandedItems",
        "",
        "isExpanded",
        "dismissIcon",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "dismissAction",
        "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;",
        "style",
        "Lcom/whoop/design/models/cards/ButtonCardPriceModel;",
        "price",
        "Ly81/f;",
        "titleColor",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Integer;",
        "component7",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "component8",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component9",
        "()Ljava/util/List;",
        "component10",
        "component11",
        "()Ljava/lang/Boolean;",
        "component12",
        "component13",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component14",
        "()Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;",
        "component15",
        "()Lcom/whoop/design/models/cards/ButtonCardPriceModel;",
        "component16",
        "()Ly81/f;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)Lcom/whoop/design/models/cards/ButtonCardModel;",
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
        "(Lcom/whoop/design/models/cards/ButtonCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getBody",
        "getImageUrl",
        "getImageUrlAlignment",
        "Ljava/lang/Integer;",
        "getImageSize",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getButton",
        "Lcom/whoop/design/models/items/TagModel;",
        "getTag",
        "Ljava/util/List;",
        "getItems",
        "getExpandedItems",
        "Ljava/lang/Boolean;",
        "getDismissIcon",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getDismissAction",
        "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;",
        "getStyle",
        "Lcom/whoop/design/models/cards/ButtonCardPriceModel;",
        "getPrice",
        "Ly81/f;",
        "getTitleColor",
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

.field public static final Companion:Lcom/whoop/design/models/cards/ButtonCardModel$Companion;


# instance fields
.field private final body:Ljava/lang/String;

.field private final button:Lcom/whoop/design/models/items/CardButtonModel;

.field private final dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

.field private final dismissIcon:Ljava/lang/String;

.field private final expandedItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final imageSize:Ljava/lang/Integer;

.field private final imageUrl:Ljava/lang/String;

.field private final imageUrlAlignment:Ljava/lang/String;

.field private final isExpanded:Ljava/lang/Boolean;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

.field private final style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

.field private final tag:Lcom/whoop/design/models/items/TagModel;

.field private final title:Ljava/lang/String;

.field private final titleColor:Ly81/f;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/whoop/design/models/cards/ButtonCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/cards/ButtonCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/cards/ButtonCardModel;->Companion:Lcom/whoop/design/models/cards/ButtonCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/cards/ButtonCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lt42/a;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lt42/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lt42/a;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lt42/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lt42/a;

    const/4 v8, 0x4

    invoke-direct {v7, v8}, Lt42/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lt42/a;

    const/4 v10, 0x5

    invoke-direct {v9, v10}, Lt42/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Lt42/a;

    const/4 v12, 0x6

    invoke-direct {v11, v12}, Lt42/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v11, 0x10

    new-array v11, v11, [Ll83/h;

    const/4 v13, 0x0

    aput-object v1, v11, v13

    const/4 v13, 0x1

    aput-object v1, v11, v13

    aput-object v1, v11, v4

    aput-object v1, v11, v6

    aput-object v1, v11, v8

    aput-object v1, v11, v10

    aput-object v1, v11, v12

    const/4 v4, 0x7

    aput-object v1, v11, v4

    aput-object v3, v11, v0

    const/16 v0, 0x9

    aput-object v5, v11, v0

    const/16 v0, 0xa

    aput-object v1, v11, v0

    const/16 v0, 0xb

    aput-object v1, v11, v0

    const/16 v0, 0xc

    aput-object v7, v11, v0

    const/16 v0, 0xd

    aput-object v9, v11, v0

    const/16 v0, 0xe

    aput-object v1, v11, v0

    const/16 v0, 0xf

    aput-object v2, v11, v0

    sput-object v11, Lcom/whoop/design/models/cards/ButtonCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1fdf

    const/16 v1, 0x1fdf

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    :goto_0
    iput-object p8, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p9, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iput-object p10, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    iput-object p11, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    iput-object p12, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    iput-object p13, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_2

    .line 2
    sget-object p2, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;->DEFAULT:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    .line 3
    :goto_1
    iput-object p2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    goto :goto_2

    :cond_2
    move-object/from16 p2, p15

    goto :goto_1

    :goto_2
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    goto :goto_3

    :cond_3
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    :goto_3
    const p2, 0x8000

    and-int/2addr p1, p2

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    return-void

    :cond_4
    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;",
            "Lcom/whoop/design/models/cards/ButtonCardPriceModel;",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p14

    const-string v1, "id"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "style"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    .line 16
    iput-object p12, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    .line 17
    iput-object p13, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    .line 18
    iput-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_1

    .line 21
    sget-object v1, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;->DEFAULT:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, p14

    :goto_1
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_2

    move-object/from16 v18, v2

    goto :goto_2

    :cond_2
    move-object/from16 v18, p15

    :goto_2
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    move-object/from16 v19, v2

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    goto :goto_4

    :cond_3
    move-object/from16 v19, p16

    goto :goto_3

    .line 22
    :goto_4
    invoke-direct/range {v3 .. v19}, Lcom/whoop/design/models/cards/ButtonCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

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

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.cards.ButtonCardStyleDtoEnum"

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;->values()[Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/cards/ButtonCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/cards/ButtonCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;ILjava/lang/Object;)Lcom/whoop/design/models/cards/ButtonCardModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/design/models/cards/ButtonCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)Lcom/whoop/design/models/cards/ButtonCardModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/cards/ButtonCardModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/cards/ButtonCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    if-eqz v3, :cond_1

    :goto_0
    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v2, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v4, 0x6

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    const/16 v4, 0xa

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    sget-object v3, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;->DEFAULT:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    if-eq v2, v3, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    return-object v0
.end method

.method public final component15()Lcom/whoop/design/models/cards/ButtonCardPriceModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    return-object v0
.end method

.method public final component16()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

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

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)Lcom/whoop/design/models/cards/ButtonCardModel;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;",
            "Lcom/whoop/design/models/cards/ButtonCardPriceModel;",
            "Ly81/f;",
            ")",
            "Lcom/whoop/design/models/cards/ButtonCardModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/cards/ButtonCardModel;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/design/models/cards/ButtonCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/cards/ButtonCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/cards/ButtonCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    iget-object v3, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    iget-object p1, p1, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getDismissAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getDismissIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpandedItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageSize()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrlAlignment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getPrice()Lcom/whoop/design/models/cards/ButtonCardPriceModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    if-nez v0, :cond_a

    move v0, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v0}, Lcom/whoop/design/models/cards/ButtonCardPriceModel;->hashCode()I

    move-result v0

    :goto_a
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    if-nez v0, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v2, v3

    return v2
.end method

.method public final isExpanded()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->body:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageUrlAlignment:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->imageSize:Ljava/lang/Integer;

    iget-object v7, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v8, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v9, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->items:Ljava/util/List;

    iget-object v10, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->expandedItems:Ljava/util/List;

    iget-object v11, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded:Ljava/lang/Boolean;

    iget-object v12, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissIcon:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v14, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->style:Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    iget-object v15, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->price:Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/cards/ButtonCardModel;->titleColor:Ly81/f;

    const-string v0, ", title="

    move-object/from16 v17, v15

    const-string v15, ", body="

    move-object/from16 v18, v14

    const-string v14, "ButtonCardModel(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl="

    const-string v2, ", imageUrlAlignment="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", imageSize="

    const-string v2, ", button="

    invoke-static {v6, v5, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expandedItems="

    const-string v2, ", isExpanded="

    invoke-static {v0, v9, v1, v10, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", dismissIcon="

    const-string v2, ", dismissAction="

    invoke-static {v11, v1, v12, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
