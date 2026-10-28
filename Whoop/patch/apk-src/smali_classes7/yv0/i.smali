.class public abstract Lyv0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyv0/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/core/details/activitytargets/ActivityTarget;",
        "Lyv0/e;",
        "h",
        "(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e;",
        "Lyv0/e$b;",
        "j",
        "(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$b;",
        "Lyv0/e$a;",
        "k",
        "(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$a;",
        "Lcom/whoop/core/details/activitytargets/ActivityTargetZone;",
        "Lyv0/f;",
        "i",
        "(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;)Lyv0/f;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "g",
        "()Ljb1/a;",
        "activityTargetsDesignItemReducer",
        "core-details_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyk2/k;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lyk2/k;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyv0/i;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyv0/i;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyv0/i;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;)Lyv0/g;
    .locals 0

    invoke-static {p0}, Lyv0/i;->f(Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;)Lyv0/g;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyk2/k;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lyk2/k;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyv0/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    const-class v1, Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lyv0/i$b;

    invoke-direct {v2, v0}, Lyv0/i$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;)Lyv0/g;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;->getTargets()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/activitytargets/ActivityTarget;

    invoke-static {v2}, Lyv0/i;->h(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Lyv0/g;

    invoke-direct {p0, v0, v1}, Lyv0/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public static final g()Ljb1/a;
    .locals 1

    sget-object v0, Lyv0/i;->a:Ljb1/a;

    return-object v0
.end method

.method private static final h(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getType()Lcom/whoop/core/details/activitytargets/ActivityTargetType;

    move-result-object v0

    sget-object v1, Lyv0/i$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    invoke-static {p0}, Lyv0/i;->k(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$a;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0}, Lyv0/i;->j(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$b;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;)Lyv0/f;
    .locals 6

    new-instance v0, Lyv0/f;

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->getTarget()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->getColor()Ly81/f;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted()Z

    move-result v5

    invoke-direct/range {v0 .. v5}, Lyv0/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)V

    return-object v0
.end method

.method private static final j(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$b;
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getZones()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getIcon()Lgz0/m0;

    move-result-object p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;

    invoke-static {v3}, Lyv0/i;->i(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;)Lyv0/f;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Lyv0/e$b;

    invoke-direct {v0, v1, p0, v2}, Lyv0/e$b;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/util/List;)V

    return-object v0
.end method

.method private static final k(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$a;
    .locals 6

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getValue()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getTarget()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->isCompleted()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    new-instance v0, Lyv0/e$a;

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->getIcon()Lgz0/m0;

    move-result-object v2

    invoke-direct/range {v0 .. v5}, Lyv0/e$a;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
