.class public final Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$$serializer;,
        Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bu\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&Jv\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008<\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008>\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008?\u0010\u0019R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008@\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010 R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008H\u0010&\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "description",
        "Lcom/whoop/design/models/ContentType;",
        "contentType",
        "contentUrl",
        "ctaText",
        "Lgz0/m0;",
        "ctaIcon",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "ctaInteraction",
        "Lcom/whoop/design/models/items/TagModel;",
        "tag",
        "Ls31/d;",
        "size",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/ContentType;",
        "component4",
        "component5",
        "component6",
        "()Lgz0/m0;",
        "component7",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component8",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component9",
        "()Ls31/d;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;",
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
        "(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getDescription",
        "Lcom/whoop/design/models/ContentType;",
        "getContentType",
        "getContentUrl",
        "getCtaText",
        "Lgz0/m0;",
        "getCtaIcon",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getCtaInteraction",
        "Lcom/whoop/design/models/items/TagModel;",
        "getTag",
        "Ls31/d;",
        "getSize",
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

.field public static final Companion:Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$Companion;


# instance fields
.field private final contentType:Lcom/whoop/design/models/ContentType;

.field private final contentUrl:Ljava/lang/String;

.field private final ctaIcon:Lgz0/m0;

.field private final ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final ctaText:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final size:Ls31/d;

.field private final tag:Lcom/whoop/design/models/items/TagModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->Companion:Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcu2/l;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lcu2/l;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcu2/l;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, Lcu2/l;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lcu2/l;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, Lcu2/l;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x9

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v3, v5, v6

    const/4 v3, 0x3

    aput-object v1, v5, v3

    const/4 v3, 0x4

    aput-object v1, v5, v3

    const/4 v3, 0x5

    aput-object v4, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v1, v5, v3

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    iput-object p5, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    iput-object p8, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p9, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iput-object p10, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ContentType;->Companion:Lcom/whoop/design/models/ContentType$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/ContentType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.molecule.shopmediacard.ShopMediaCardSize"

    invoke-static {}, Ls31/d;->values()[Ls31/d;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;ILjava/lang/Object;)Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    :cond_8
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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/ContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component9()Ls31/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;
    .locals 11

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    iget-object p1, p1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getContentType()Lcom/whoop/design/models/ContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    return-object v0
.end method

.method public final getContentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    return-object v0
.end method

.method public final getCtaInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()Ls31/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->description:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentType:Lcom/whoop/design/models/ContentType;

    iget-object v3, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->contentUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaText:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaIcon:Lgz0/m0;

    iget-object v6, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->ctaInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v7, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v8, p0, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->size:Ls31/d;

    const-string v9, ", description="

    const-string v10, ", contentType="

    const-string v11, "ShopMediaCardModel(title="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
