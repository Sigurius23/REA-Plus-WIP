.class final Lil1/e$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/e;->interact(Lec3/l;)Lec3/l;
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
        "Lil1/f;",
        "state",
        "Lil1/d;",
        "action",
        "<anonymous>",
        "(Lil1/f;Lil1/d;)Lil1/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.DismissAlertInteractor$interact$1"
    f = "DismissAlertInteractor.kt"
    l = {
        0x23,
        0x25
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lil1/e;


# direct methods
.method public constructor <init>(Lil1/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/e;",
            "Lq83/d<",
            "-",
            "Lil1/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil1/e$f;->z:Lil1/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lil1/f;Lil1/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/f;",
            "Lil1/d;",
            "Lq83/d<",
            "-",
            "Lil1/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lil1/e$f;

    iget-object v1, p0, Lil1/e$f;->z:Lil1/e;

    invoke-direct {v0, v1, p3}, Lil1/e$f;-><init>(Lil1/e;Lq83/d;)V

    iput-object p1, v0, Lil1/e$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lil1/e$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lil1/e$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lil1/f;

    check-cast p2, Lil1/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lil1/e$f;->f(Lil1/f;Lil1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lil1/e$f;->x:Ljava/lang/Object;

    check-cast v0, Lil1/f;

    iget-object v1, p0, Lil1/e$f;->y:Ljava/lang/Object;

    check-cast v1, Lil1/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lil1/e$f;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lil1/d$a;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lil1/e$f;->z:Lil1/e;

    check-cast v1, Lil1/d$a;

    invoke-virtual {v1}, Lil1/d$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lil1/e$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lil1/e$f;->y:Ljava/lang/Object;

    iput v5, p0, Lil1/e$f;->w:I

    invoke-static {p1, v0, v1, p0}, Lil1/e;->c(Lil1/e;Lil1/f;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lil1/f;

    return-object p1

    :cond_4
    sget-object p1, Lil1/d$b;->a:Lil1/d$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Lil1/f;

    invoke-direct {p1, v3, v5, v3}, Lil1/f;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    sget-object p1, Lil1/d$c;->a:Lil1/d$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lil1/e$f;->z:Lil1/e;

    iput-object v3, p0, Lil1/e$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lil1/e$f;->y:Ljava/lang/Object;

    iput v4, p0, Lil1/e$f;->w:I

    invoke-static {p1, v0, p0}, Lil1/e;->d(Lil1/e;Lil1/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    :goto_1
    return-object v2

    :cond_6
    :goto_2
    check-cast p1, Lil1/f;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
