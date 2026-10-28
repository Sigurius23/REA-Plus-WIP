.class final Ly42/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/e;-><init>(Ltr2/n;Lbc3/c0;Ljava/lang/String;)V
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
        "Lc52/b;",
        "currentState",
        "Lc52/a;",
        "event",
        "<anonymous>",
        "(Lc52/b;Lc52/a;)Lc52/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.ble.PuffinConnectionStateManager$connectionState$1"
    f = "PuffinConnectionStateManager.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ly42/e;


# direct methods
.method public constructor <init>(Ly42/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/e;",
            "Lq83/d<",
            "-",
            "Ly42/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly42/e$a;->z:Ly42/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lc52/b;Lc52/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc52/b;",
            "Lc52/a;",
            "Lq83/d<",
            "-",
            "Lc52/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ly42/e$a;

    iget-object v1, p0, Ly42/e$a;->z:Ly42/e;

    invoke-direct {v0, v1, p3}, Ly42/e$a;-><init>(Ly42/e;Lq83/d;)V

    iput-object p1, v0, Ly42/e$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Ly42/e$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ly42/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc52/b;

    check-cast p2, Lc52/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ly42/e$a;->f(Lc52/b;Lc52/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ly42/e$a;->x:Ljava/lang/Object;

    check-cast v0, Lc52/b;

    iget-object v1, p0, Ly42/e$a;->y:Ljava/lang/Object;

    check-cast v1, Lc52/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ly42/e$a;->w:I

    if-nez v2, :cond_c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ly42/e$a;->z:Ly42/e;

    invoke-static {p1}, Ly42/e;->a(Ly42/e;)Ltr2/n;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "New event - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ly42/e$a;->z:Ly42/e;

    invoke-static {p1}, Ly42/e;->a(Ly42/e;)Ltr2/n;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Current state - "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lc52/b$c;->a:Lc52/b$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    instance-of p1, v1, Lc52/a$b;

    if-eqz p1, :cond_0

    sget-object p1, Lc52/b$b;->a:Lc52/b$b;

    return-object p1

    :cond_0
    instance-of p1, v1, Lc52/a$a;

    if-eqz p1, :cond_a

    sget-object p1, Lc52/b$a;->a:Lc52/b$a;

    return-object p1

    :cond_1
    sget-object v2, Lc52/b$b;->a:Lc52/b$b;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, Lc52/a$a;

    if-eqz v2, :cond_2

    sget-object p1, Lc52/b$a;->a:Lc52/b$a;

    return-object p1

    :cond_2
    instance-of v1, v1, Lc52/a$e;

    if-eqz v1, :cond_a

    goto :goto_0

    :cond_3
    sget-object v2, Lc52/b$a;->a:Lc52/b$a;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    instance-of v2, v1, Lc52/a$d;

    if-eqz v2, :cond_4

    sget-object p1, Lc52/b$d;->a:Lc52/b$d;

    return-object p1

    :cond_4
    instance-of v1, v1, Lc52/a$e;

    if-eqz v1, :cond_a

    goto :goto_0

    :cond_5
    sget-object v2, Lc52/b$d;->a:Lc52/b$d;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    instance-of v2, v1, Lc52/a$f;

    if-eqz v2, :cond_6

    sget-object p1, Lc52/b$e;->a:Lc52/b$e;

    return-object p1

    :cond_6
    instance-of v1, v1, Lc52/a$e;

    if-eqz v1, :cond_a

    goto :goto_0

    :cond_7
    sget-object v2, Lc52/b$e;->a:Lc52/b$e;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    instance-of v2, v1, Lc52/a$g;

    if-eqz v2, :cond_8

    sget-object p1, Lc52/b$f;->a:Lc52/b$f;

    return-object p1

    :cond_8
    instance-of v1, v1, Lc52/a$e;

    if-eqz v1, :cond_a

    goto :goto_0

    :cond_9
    sget-object v2, Lc52/b$f;->a:Lc52/b$f;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    instance-of v1, v1, Lc52/a$c;

    if-eqz v1, :cond_a

    :goto_0
    return-object p1

    :cond_a
    return-object v0

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
