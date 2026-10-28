.class public final Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$$serializer;,
        Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J<\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00082\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010!\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "",
        "Lcom/whoop/design/models/items/CollapsableHeaderModel;",
        "header",
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "content",
        "Lcom/whoop/weightlifting/data/dto/MetaData;",
        "metadata",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "emptyStateCard",
        "<init>",
        "(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/CollapsableHeaderModel;",
        "component2",
        "()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "component3",
        "()Lcom/whoop/weightlifting/data/dto/MetaData;",
        "component4",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "copy",
        "(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/CollapsableHeaderModel;",
        "getHeader",
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "getContent",
        "Lcom/whoop/weightlifting/data/dto/MetaData;",
        "getMetadata",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getEmptyStateCard",
        "Companion",
        "$serializer",
        "weightlifting_release"
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$Companion;


# instance fields
.field private final content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

.field private final emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

.field private final header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

.field private final metadata:Lcom/whoop/weightlifting/data/dto/MetaData;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->Companion:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lkt2/a;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lkt2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    :goto_0
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    return-void

    :cond_2
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)V
    .locals 1

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;-><init>(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->copy(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/CollapsableHeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CollapsableHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/weightlifting/data/dto/MetaData$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/MetaData$$serializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/CollapsableHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/weightlifting/data/dto/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;
    .locals 1

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;-><init>(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getContent()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    return-object v0
.end method

.method public final getEmptyStateCard()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/items/CollapsableHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/weightlifting/data/dto/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CollapsableHeaderModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/MetaData;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->header:Lcom/whoop/design/models/items/CollapsableHeaderModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->content:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->emptyStateCard:Lcom/whoop/design/models/DesignSystemModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ExerciseDetailsModel(header="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", emptyStateCard="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
