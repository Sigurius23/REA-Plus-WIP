.class public final Lod1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lod1/l;",
        "Lod1/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lod1/n;",
        "Lod1/g;",
        "Lod1/l;",
        "Lod1/m;",
        "Lia0/a;",
        "activityTypesRepository",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lia0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Ln82/a;",
        "selectedScreenType",
        "",
        "isStartActivityRevamp",
        "Lec3/l;",
        "Lod1/i$a;",
        "g",
        "(Ln82/a;ZLq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lia0/a;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "",
        "Lod1/a;",
        "c",
        "Ljava/util/List;",
        "mostRecentActivityListAux",
        "select-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lia0/a;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lod1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lia0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "activityTypesRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod1/n;->a:Lia0/a;

    iput-object p2, p0, Lod1/n;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lod1/n;->c:Ljava/util/List;

    return-void
.end method

.method public static final synthetic c(Lod1/n;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lod1/n;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic d(Lod1/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lod1/n;->c:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic e(Lod1/n;Ln82/a;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lod1/n;->g(Ln82/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lod1/n;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lod1/n;->c:Ljava/util/List;

    return-void
.end method

.method private final g(Ln82/a;ZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln82/a;",
            "Z",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lod1/n$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lod1/n$c;

    iget v1, v0, Lod1/n$c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lod1/n$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lod1/n$c;

    invoke-direct {v0, p0, p3}, Lod1/n$c;-><init>(Lod1/n;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lod1/n$c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lod1/n$c;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lod1/n$c;->z:I

    iget-object p2, v0, Lod1/n$c;->x:Ljava/lang/Object;

    check-cast p2, Lec3/l;

    iget-object v0, v0, Lod1/n$c;->w:Ljava/lang/Object;

    check-cast v0, Ln82/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lod1/n$c;->z:I

    iget-boolean p2, v0, Lod1/n$c;->y:Z

    iget-object v2, v0, Lod1/n$c;->w:Ljava/lang/Object;

    check-cast v2, Ln82/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p3

    move p3, p1

    move-object p1, v2

    move-object v2, v7

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_4

    iget-object p3, p0, Lod1/n;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "start-activity-revamp"

    invoke-interface {p3, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    move p3, v5

    goto :goto_1

    :cond_4
    move p3, v3

    :goto_1
    iget-object v2, p0, Lod1/n;->a:Lia0/a;

    iput-object p1, v0, Lod1/n$c;->w:Ljava/lang/Object;

    iput-boolean p2, v0, Lod1/n$c;->y:Z

    iput p3, v0, Lod1/n$c;->z:I

    iput v5, v0, Lod1/n$c;->G:I

    invoke-virtual {v2, v0}, Lia0/a;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast v2, Lec3/l;

    iget-object v6, p0, Lod1/n;->a:Lia0/a;

    iput-object p1, v0, Lod1/n$c;->w:Ljava/lang/Object;

    iput-object v2, v0, Lod1/n$c;->x:Ljava/lang/Object;

    iput-boolean p2, v0, Lod1/n$c;->y:Z

    iput p3, v0, Lod1/n$c;->z:I

    iput v4, v0, Lod1/n$c;->G:I

    invoke-virtual {v6, v0}, Lia0/a;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    move-object v0, p1

    move p1, p3

    move-object p3, p2

    move-object p2, v2

    :goto_4
    check-cast p3, Lec3/l;

    new-instance v1, Lod1/n$d;

    if-eqz p1, :cond_7

    move v3, v5

    :cond_7
    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, v3, p1}, Lod1/n$d;-><init>(Lod1/n;Ln82/a;ZLq83/d;)V

    new-instance p1, Lec3/l1;

    const/4 v0, 0x1

    invoke-direct {p1, p2, p3, v1, v0}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lod1/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lod1/n$a;-><init>(Lq83/d;Lod1/n;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lod1/m;

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lod1/m;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lod1/n$b;

    invoke-direct {v0, p0, v1}, Lod1/n$b;-><init>(Lod1/n;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
