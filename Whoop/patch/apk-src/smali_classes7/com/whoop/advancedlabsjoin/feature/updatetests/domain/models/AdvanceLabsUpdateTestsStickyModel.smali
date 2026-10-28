.class public final Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$$serializer;,
        Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u001aR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008+\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008-\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;",
        "",
        "",
        "text",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
        "dialog",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_join_release",
        "(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getText",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
        "getDialog",
        "Companion",
        "$serializer",
        "advanced-labs-join_release"
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

.field public static final Companion:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$Companion;


# instance fields
.field private final dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->Companion:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Leb1/a;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Leb1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$$serializer;

    invoke-virtual {p5}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
            ")V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;ILjava/lang/Object;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_join_release(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
            ")",
            "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    iget-object p1, p1, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDialog()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

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

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->text:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->items:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;->dialog:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    const-string v3, ", items="

    const-string v4, ", dialog="

    const-string v5, "AdvanceLabsUpdateTestsStickyModel(text="

    invoke-static {v5, v0, v3, v4, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
