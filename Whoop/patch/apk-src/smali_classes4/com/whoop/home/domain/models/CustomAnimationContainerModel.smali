.class public final Lcom/whoop/home/domain/models/CustomAnimationContainerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/CustomAnimationContainerModel$$serializer;,
        Lcom/whoop/home/domain/models/CustomAnimationContainerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBU\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JP\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0010\u0010\'\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010-\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00084\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010#\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/CustomAnimationContainerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "key",
        "",
        "finalIndex",
        "initial",
        "completed",
        "Lcom/whoop/home/domain/models/ContainerBorderStyle;",
        "style",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/CustomAnimationContainerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()I",
        "component4",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component5",
        "component6",
        "()Lcom/whoop/home/domain/models/ContainerBorderStyle;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getKey",
        "I",
        "getFinalIndex",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getInitial",
        "getCompleted",
        "Lcom/whoop/home/domain/models/ContainerBorderStyle;",
        "getStyle",
        "Companion",
        "$serializer",
        "home_release"
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

.field public static final Companion:Lcom/whoop/home/domain/models/CustomAnimationContainerModel$Companion;


# instance fields
.field private final completed:Lcom/whoop/design/models/DesignSystemModel;

.field private final finalIndex:I

.field private final id:Ljava/lang/String;

.field private final initial:Lcom/whoop/design/models/DesignSystemModel;

.field private final key:Ljava/lang/String;

.field private final style:Lcom/whoop/home/domain/models/ContainerBorderStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->Companion:Lcom/whoop/home/domain/models/CustomAnimationContainerModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyc2/a;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lyc2/a;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lyc2/a;

    const/16 v5, 0x12

    invoke-direct {v4, v5}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x6

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v1, 0x3

    aput-object v2, v4, v1

    const/4 v1, 0x4

    aput-object v3, v4, v1

    const/4 v1, 0x5

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/home/domain/models/CustomAnimationContainerModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CustomAnimationContainerModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    iput-object p5, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p6, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lcom/whoop/home/domain/models/ContainerBorderStyle;->ONBOARDING:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    .line 3
    iput-object p1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-void

    :cond_1
    iput-object p7, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    .line 7
    iput p3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    .line 8
    iput-object p4, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    .line 9
    iput-object p5, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    .line 10
    iput-object p6, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 11
    sget-object p6, Lcom/whoop/home/domain/models/ContainerBorderStyle;->ONBOARDING:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)V

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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.home.domain.models.ContainerBorderStyle"

    invoke-static {}, Lcom/whoop/home/domain/models/ContainerBorderStyle;->values()[Lcom/whoop/home/domain/models/ContainerBorderStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/CustomAnimationContainerModel;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;ILjava/lang/Object;)Lcom/whoop/home/domain/models/CustomAnimationContainerModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->copy(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/CustomAnimationContainerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    sget-object v3, Lcom/whoop/home/domain/models/ContainerBorderStyle;->ONBOARDING:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    return v0
.end method

.method public final component4()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/home/domain/models/ContainerBorderStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerModel;
    .locals 8

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    iget v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    iget-object p1, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCompleted()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getFinalIndex()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitial()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/home/domain/models/ContainerBorderStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->key:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->finalIndex:I

    iget-object v3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->initial:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v4, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->completed:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v5, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerModel;->style:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    const-string v6, ", key="

    const-string v7, ", finalIndex="

    const-string v8, "CustomAnimationContainerModel(id="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", initial="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", completed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
