.class public final Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$$serializer;,
        Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020\u00062\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008/\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;",
        "request",
        "",
        "showLoading",
        "fallbackBehavior",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;",
        "component3",
        "()Z",
        "component4",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;",
        "getRequest",
        "Z",
        "getShowLoading",
        "getFallbackBehavior",
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

.field public static final Companion:Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$Companion;


# instance fields
.field private final fallbackBehavior:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

.field private final showLoading:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->Companion:Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    goto :goto_0

    :cond_1
    iput-boolean p4, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    :goto_0
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_2

    .line 2
    const-string p1, "HIDE"

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    return-void

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackBehavior"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    .line 7
    iput-boolean p3, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x1

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 9
    const-string p4, "HIDE"

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    if-eq v1, v2, :cond_1

    :goto_0
    iget-boolean v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    const-string v2, "HIDE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object p0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackBehavior"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFallbackBehavior()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequest()Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    return-object v0
.end method

.method public final getShowLoading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->request:Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;

    iget-boolean v2, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->showLoading:Z

    iget-object v3, p0, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;->fallbackBehavior:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NestedBFFItemModel(id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", request="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showLoading="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fallbackBehavior="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
