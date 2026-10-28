.class public final Lf70/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0086B\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lf70/s0;",
        "",
        "Ln70/c;",
        "progressInteractor",
        "<init>",
        "(Ln70/c;)V",
        "Lf70/e$b;",
        "prevDomainResult",
        "",
        "a",
        "(Lf70/e$b;)I",
        "",
        "authenticated",
        "b",
        "(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;",
        "Ln70/c;",
        "activation_release"
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
.field private final a:Ln70/c;


# direct methods
.method public constructor <init>(Ln70/c;)V
    .locals 1

    const-string v0, "progressInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf70/s0;->a:Ln70/c;

    return-void
.end method

.method private final a(Lf70/e$b;)I
    .locals 5

    invoke-virtual {p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v0

    invoke-virtual {v0}, Ln70/e;->d()I

    move-result v0

    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    instance-of v4, v4, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;

    if-eqz v4, :cond_0

    move-object v2, v3

    :cond_1
    check-cast v2, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    :cond_2
    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object p1

    const/4 v1, -0x1

    if-eqz p1, :cond_3

    invoke-interface {p1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_3
    move p1, v1

    :goto_0
    if-eq p1, v1, :cond_4

    sub-int/2addr p1, v0

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final b(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e$b;",
            "Z",
            "Lq83/d<",
            "-",
            "Lf70/e$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lf70/s0$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lf70/s0$a;

    iget v4, v3, Lf70/s0$a;->F:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lf70/s0$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v3, Lf70/s0$a;

    invoke-direct {v3, v0, v2}, Lf70/s0$a;-><init>(Lf70/s0;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lf70/s0$a;->z:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lf70/s0$a;->F:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lf70/s0$a;->x:Ljava/lang/Object;

    check-cast v1, Lf70/e$b;

    iget-object v3, v3, Lf70/s0$a;->w:Ljava/lang/Object;

    check-cast v3, Lf70/e$b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lf70/s0;->a:Ln70/c;

    new-instance v5, Ln70/a;

    new-instance v7, Ln70/b$a;

    invoke-direct/range {p0 .. p1}, Lf70/s0;->a(Lf70/e$b;)I

    move-result v8

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-direct {v7, v8, v10, v9, v10}, Ln70/b$a;-><init>(ILn70/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v8

    invoke-direct {v5, v7, v8, v1}, Ln70/a;-><init>(Ln70/b;Ln70/e;Z)V

    iput-object v10, v3, Lf70/s0$a;->w:Ljava/lang/Object;

    move-object/from16 v7, p1

    iput-object v7, v3, Lf70/s0$a;->x:Ljava/lang/Object;

    iput-boolean v1, v3, Lf70/s0$a;->y:Z

    iput v6, v3, Lf70/s0$a;->F:I

    invoke-virtual {v2, v5, v3}, Ln70/c;->k(Ln70/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_3

    return-object v4

    :cond_3
    move-object v5, v7

    :goto_1
    move-object v7, v2

    check-cast v7, Ln70/e;

    const v23, 0x1ffdd

    const/16 v24, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v5 .. v24}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    return-object v1
.end method
