.class public final Lcom/whoop/home/domain/models/WhatToExpectCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/WhatToExpectCardModel$$serializer;,
        Lcom/whoop/home/domain/models/WhatToExpectCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBM\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JB\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00084\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010#\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/WhatToExpectCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "body",
        "Lcom/whoop/home/domain/models/DailyProgressModel;",
        "dailyProgress",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "<init>",
        "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/WhatToExpectCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lgz0/m0;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "component4",
        "()Lcom/whoop/home/domain/models/DailyProgressModel;",
        "component5",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/WhatToExpectCardModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lgz0/m0;",
        "getIcon",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getBody",
        "Lcom/whoop/home/domain/models/DailyProgressModel;",
        "getDailyProgress",
        "Lcom/whoop/navigation/e;",
        "getNavigation",
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

.field public static final Companion:Lcom/whoop/home/domain/models/WhatToExpectCardModel$Companion;


# instance fields
.field private final body:Lcom/whoop/design/util/TextResource;

.field private final dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

.field private final icon:Lgz0/m0;

.field private final navigation:Lcom/whoop/navigation/e;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/home/domain/models/WhatToExpectCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/WhatToExpectCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->Companion:Lcom/whoop/home/domain/models/WhatToExpectCardModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyc2/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lyc2/a;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/home/domain/models/WhatToExpectCardModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/WhatToExpectCardModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/home/domain/models/WhatToExpectCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    iput-object p3, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    iput-object p6, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyProgress"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    .line 4
    iput-object p2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/WhatToExpectCardModel;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/home/domain/models/WhatToExpectCardModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->copy(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/WhatToExpectCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/WhatToExpectCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/home/domain/models/DailyProgressModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/DailyProgressModel$$serializer;

    iget-object v2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/home/domain/models/DailyProgressModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/WhatToExpectCardModel;
    .locals 7

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyProgress"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/home/domain/models/WhatToExpectCardModel;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;

    iget-object v1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    iget-object v3, p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBody()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDailyProgress()Lcom/whoop/home/domain/models/DailyProgressModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    return-object v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    invoke-virtual {v2}, Lcom/whoop/home/domain/models/DailyProgressModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->icon:Lgz0/m0;

    iget-object v1, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->body:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->dailyProgress:Lcom/whoop/home/domain/models/DailyProgressModel;

    iget-object v4, p0, Lcom/whoop/home/domain/models/WhatToExpectCardModel;->navigation:Lcom/whoop/navigation/e;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "WhatToExpectCardModel(icon="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dailyProgress="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigation="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
