.class public final Lcom/whoop/design/models/items/UpsellCardCalloutModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/UpsellCardCalloutModel$$serializer;,
        Lcom/whoop/design/models/items/UpsellCardCalloutModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JD\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010!\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/design/models/items/UpsellCardCalloutModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "description",
        "imageUrl",
        "tierImage",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "callout",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "cardButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/UpsellCardCalloutModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "component5",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/UpsellCardCalloutModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getDescription",
        "getImageUrl",
        "getTierImage",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getCallout",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getCardButton",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/UpsellCardCalloutModel$Companion;


# instance fields
.field private final callout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final cardButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final description:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final tierImage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/UpsellCardCalloutModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/UpsellCardCalloutModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->Companion:Lcom/whoop/design/models/items/UpsellCardCalloutModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/items/UpsellCardCalloutModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/UpsellCardCalloutModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/items/UpsellCardCalloutModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iput-object p6, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)V
    .locals 1

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callout"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/UpsellCardCalloutModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/UpsellCardCalloutModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/UpsellCardCalloutModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/UpsellCardCalloutModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/UpsellCardCalloutModel;
    .locals 7

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callout"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/UpsellCardCalloutModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getCardButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTierImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->description:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->imageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->tierImage:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    const-string v5, ", imageUrl="

    const-string v6, ", tierImage="

    const-string v7, "UpsellCardCalloutModel(description="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", callout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
