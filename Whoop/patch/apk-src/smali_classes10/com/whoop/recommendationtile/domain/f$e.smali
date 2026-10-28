.class final Lcom/whoop/recommendationtile/domain/f$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/recommendationtile/domain/f;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/whoop/recommendationtile/domain/e;",
        "state",
        "Lcom/whoop/recommendationtile/domain/f$a;",
        "result",
        "<anonymous>",
        "(Lcom/whoop/recommendationtile/domain/e;Lcom/whoop/recommendationtile/domain/f$a;)Lcom/whoop/recommendationtile/domain/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractor$interact$2"
    f = "RecommendationTileHeaderInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/recommendationtile/domain/f;


# direct methods
.method public constructor <init>(Lcom/whoop/recommendationtile/domain/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/recommendationtile/domain/f;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/recommendationtile/domain/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/recommendationtile/domain/f$e;->z:Lcom/whoop/recommendationtile/domain/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/recommendationtile/domain/e;Lcom/whoop/recommendationtile/domain/f$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/recommendationtile/domain/e;",
            "Lcom/whoop/recommendationtile/domain/f$a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/recommendationtile/domain/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/recommendationtile/domain/f$e;

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/f$e;->z:Lcom/whoop/recommendationtile/domain/f;

    invoke-direct {v0, v1, p3}, Lcom/whoop/recommendationtile/domain/f$e;-><init>(Lcom/whoop/recommendationtile/domain/f;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/recommendationtile/domain/f$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/recommendationtile/domain/f$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/recommendationtile/domain/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/recommendationtile/domain/e;

    check-cast p2, Lcom/whoop/recommendationtile/domain/f$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/recommendationtile/domain/f$e;->f(Lcom/whoop/recommendationtile/domain/e;Lcom/whoop/recommendationtile/domain/f$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/f$e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/recommendationtile/domain/e;

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/f$e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/recommendationtile/domain/f$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/recommendationtile/domain/f$e;->w:I

    if-nez v2, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lcom/whoop/recommendationtile/domain/f$a$c;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/recommendationtile/domain/f$e;->z:Lcom/whoop/recommendationtile/domain/f;

    invoke-static {p1, v1}, Lcom/whoop/recommendationtile/domain/f;->j(Lcom/whoop/recommendationtile/domain/f;Lcom/whoop/recommendationtile/domain/e;)Lcom/whoop/recommendationtile/domain/e;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lcom/whoop/recommendationtile/domain/f$a$b;

    if-eqz p1, :cond_4

    check-cast v0, Lcom/whoop/recommendationtile/domain/f$a$b;

    invoke-virtual {v0}, Lcom/whoop/recommendationtile/domain/f$a$b;->a()Li31/g;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Li31/g;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/recommendationtile/domain/e;->d()Li31/g;

    move-result-object v2

    invoke-virtual {v2}, Li31/g;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/f$e;->z:Lcom/whoop/recommendationtile/domain/f;

    invoke-static {v0, v1, p1}, Lcom/whoop/recommendationtile/domain/f;->d(Lcom/whoop/recommendationtile/domain/f;Lcom/whoop/recommendationtile/domain/e;Li31/g;)Lcom/whoop/recommendationtile/domain/e;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    return-object p1

    :cond_3
    :goto_1
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/recommendationtile/domain/e;->b(Lcom/whoop/recommendationtile/domain/e;Li31/g;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/e;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lcom/whoop/recommendationtile/domain/f$a$a;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/recommendationtile/domain/f$e;->z:Lcom/whoop/recommendationtile/domain/f;

    invoke-static {p1, v1}, Lcom/whoop/recommendationtile/domain/f;->e(Lcom/whoop/recommendationtile/domain/f;Lcom/whoop/recommendationtile/domain/e;)Lcom/whoop/recommendationtile/domain/e;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lcom/whoop/recommendationtile/domain/f$a$d;

    if-eqz p1, :cond_6

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/recommendationtile/domain/e;->b(Lcom/whoop/recommendationtile/domain/e;Li31/g;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/e;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
