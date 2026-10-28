.class public final Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$$serializer;,
        Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0081\u0008\u0018\u0000 22\u00020\u0001:\u000232B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J>\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u00081\u0010 \u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "subtitle",
        "",
        "Lcom/whoop/bot/models/conversation/WorkoutListModel;",
        "workoutList",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "navigationButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "Ljava/util/List;",
        "getWorkoutList",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "getNavigationButton",
        "Companion",
        "$serializer",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$Companion;


# instance fields
.field private final navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final workoutList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/WorkoutListModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->Companion:Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljl0/a;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/WorkoutListModel;",
            ">;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationButton"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/bot/models/conversation/WorkoutListModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/WorkoutListModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/WorkoutListModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/WorkoutListModel;",
            ">;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")",
            "Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationButton"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getNavigationButton()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkoutList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/WorkoutListModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->subtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->workoutList:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->navigationButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const-string v4, ", subtitle="

    const-string v5, ", workoutList="

    const-string v6, "StrengthTrainerWidgetModel(title="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigationButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
