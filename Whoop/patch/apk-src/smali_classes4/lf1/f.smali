.class public final Llf1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Llf1/f;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lhf1/b;",
        "experimentsChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;)V",
        "",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "Lhf1/b;",
        "experiments_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Lhf1/b;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experimentsChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf1/f;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Llf1/f;->b:Lhf1/b;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Llf1/f$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Llf1/f$a;

    iget v3, v2, Llf1/f$a;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llf1/f$a;->y:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Llf1/f$a;

    invoke-direct {v2, v0, v1}, Llf1/f$a;-><init>(Llf1/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v9, Llf1/f$a;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v9, Llf1/f$a;->y:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Llf1/f;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v3, "exercise-details-v2"

    invoke-interface {v1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1

    :cond_3
    iget-object v3, v0, Llf1/f;->b:Lhf1/b;

    new-instance v10, Llf1/e;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Llf1/e;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v4, v9, Llf1/f$a;->y:I

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v4, v10

    const/16 v10, 0xa

    invoke-static/range {v3 .. v11}, Lhf1/b;->d(Lhf1/b;Lhf1/a;JZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_4
    :goto_2
    const-string v2, "test"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method
