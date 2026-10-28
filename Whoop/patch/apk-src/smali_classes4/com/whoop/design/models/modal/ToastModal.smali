.class public final Lcom/whoop/design/models/modal/ToastModal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/modal/Modal;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/modal/ToastModal$$serializer;,
        Lcom/whoop/design/models/modal/ToastModal$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>=BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB]\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001eJZ\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010#J\u001a\u0010/\u001a\u00020\t2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00104\u001a\u0004\u00085\u0010!R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00106\u001a\u0004\u00087\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u00089\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010\'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00101\u001a\u0004\u0008<\u0010\u001e\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/ToastModal;",
        "Lcom/whoop/design/models/modal/Modal;",
        "",
        "id",
        "message",
        "Lcom/whoop/design/models/modal/ToastStyleModel;",
        "style",
        "",
        "duration",
        "",
        "includeDismiss",
        "Lcom/whoop/design/models/modal/ToastActionButton;",
        "actionButton",
        "icon",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/modal/ToastModal;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/modal/ToastStyleModel;",
        "component4",
        "()I",
        "component5",
        "()Z",
        "component6",
        "()Lcom/whoop/design/models/modal/ToastActionButton;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)Lcom/whoop/design/models/modal/ToastModal;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getMessage",
        "Lcom/whoop/design/models/modal/ToastStyleModel;",
        "getStyle",
        "I",
        "getDuration",
        "Z",
        "getIncludeDismiss",
        "Lcom/whoop/design/models/modal/ToastActionButton;",
        "getActionButton",
        "getIcon",
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

.field public static final Companion:Lcom/whoop/design/models/modal/ToastModal$Companion;


# instance fields
.field private final actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

.field private final duration:I

.field private final icon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final includeDismiss:Z

.field private final message:Ljava/lang/String;

.field private final style:Lcom/whoop/design/models/modal/ToastStyleModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/modal/ToastModal$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/modal/ToastModal$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/modal/ToastModal;->Companion:Lcom/whoop/design/models/modal/ToastModal$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/design/models/modal/ToastModal;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/design/models/calendar/archmini/a;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lcom/whoop/design/models/calendar/archmini/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/modal/ToastModal;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0xb

    const/16 v0, 0xb

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/modal/ToastModal$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/ToastModal$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/modal/ToastModal$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lcom/whoop/design/models/modal/ToastStyleModel;->UNKNOWN:Lcom/whoop/design/models/modal/ToastStyleModel;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    :goto_0
    iput p5, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    goto :goto_1

    :cond_2
    iput-boolean p6, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    :goto_1
    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    :goto_2
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    return-void

    :cond_4
    iput-object p8, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    .line 8
    iput p4, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    .line 9
    iput-boolean p5, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    .line 12
    sget-object p3, Lcom/whoop/design/models/modal/ToastStyleModel;->UNKNOWN:Lcom/whoop/design/models/modal/ToastStyleModel;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_1

    const/4 p5, 0x1

    :cond_1
    move v5, p5

    and-int/lit8 p3, p8, 0x20

    const/4 p5, 0x0

    if-eqz p3, :cond_2

    move-object v6, p5

    goto :goto_0

    :cond_2
    move-object v6, p6

    :goto_0
    and-int/lit8 p3, p8, 0x40

    if-eqz p3, :cond_3

    move-object v7, p5

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    goto :goto_2

    :cond_3
    move-object v7, p7

    goto :goto_1

    .line 13
    :goto_2
    invoke-direct/range {v0 .. v7}, Lcom/whoop/design/models/modal/ToastModal;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/ToastStyleModel;->Companion:Lcom/whoop/design/models/modal/ToastStyleModel$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ToastStyleModel$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/modal/ToastModal;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/ToastModal;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/modal/ToastModal;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/modal/ToastModal;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/modal/ToastModal;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)Lcom/whoop/design/models/modal/ToastModal;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/modal/ToastModal;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/modal/ToastModal;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    sget-object v4, Lcom/whoop/design/models/modal/ToastStyleModel;->UNKNOWN:Lcom/whoop/design/models/modal/ToastStyleModel;

    if-eq v3, v4, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    invoke-interface {p1, p2, v1, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    if-eq v1, v2, :cond_3

    :goto_1
    iget-boolean v1, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/modal/ToastActionButton$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/ToastActionButton$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/modal/ToastStyleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    return v0
.end method

.method public final component6()Lcom/whoop/design/models/modal/ToastActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)Lcom/whoop/design/models/modal/ToastModal;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/modal/ToastModal;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/modal/ToastModal;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/modal/ToastModal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/modal/ToastModal;

    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    iget-object v3, p1, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    iget v3, p1, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    iget-object v3, p1, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getActionButton()Lcom/whoop/design/models/modal/ToastActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    return-object v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getIncludeDismiss()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/modal/ToastStyleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/modal/ToastActionButton;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/modal/ToastModal;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/modal/ToastModal;->message:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/modal/ToastModal;->style:Lcom/whoop/design/models/modal/ToastStyleModel;

    iget v3, p0, Lcom/whoop/design/models/modal/ToastModal;->duration:I

    iget-boolean v4, p0, Lcom/whoop/design/models/modal/ToastModal;->includeDismiss:Z

    iget-object v5, p0, Lcom/whoop/design/models/modal/ToastModal;->actionButton:Lcom/whoop/design/models/modal/ToastActionButton;

    iget-object v6, p0, Lcom/whoop/design/models/modal/ToastModal;->icon:Ljava/lang/String;

    const-string v7, ", message="

    const-string v8, ", style="

    const-string v9, "ToastModal(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", includeDismiss="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", actionButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
