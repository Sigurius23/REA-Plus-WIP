.class final Lmh0/a$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmh0/a;->interact(Lec3/l;)Lec3/l;
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
        "Lmh0/e;",
        "state",
        "Lmh0/a$a;",
        "result",
        "<anonymous>",
        "(Lmh0/e;Lmh0/a$a;)Lmh0/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.view.startturnbutton.StartTurnButtonInteractor$interact$2"
    f = "StartTurnButtonInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lmh0/a$f;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lmh0/e;Lmh0/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh0/e;",
            "Lmh0/a$a;",
            "Lq83/d<",
            "-",
            "Lmh0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lmh0/a$f;

    invoke-direct {v0, p3}, Lmh0/a$f;-><init>(Lq83/d;)V

    iput-object p1, v0, Lmh0/a$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lmh0/a$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lmh0/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmh0/e;

    check-cast p2, Lmh0/a$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lmh0/a$f;->f(Lmh0/e;Lmh0/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lmh0/a$f;->x:Ljava/lang/Object;

    check-cast v0, Lmh0/e;

    iget-object v1, p0, Lmh0/a$f;->y:Ljava/lang/Object;

    check-cast v1, Lmh0/a$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmh0/a$f;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lmh0/a$a$c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {v0, v2, v3}, Lmh0/e;->a(ZLjava/lang/String;)Lmh0/e;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Lmh0/a$a$d;

    if-eqz p1, :cond_1

    check-cast v1, Lmh0/a$a$d;

    invoke-virtual {v1}, Lmh0/a$a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lmh0/e;->a(ZLjava/lang/String;)Lmh0/e;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v1, Lmh0/a$a$b;

    const/4 v4, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v4, v3}, Lmh0/e;->a(ZLjava/lang/String;)Lmh0/e;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Lmh0/a$a$a;

    if-eqz p1, :cond_3

    invoke-static {v0, v2, v3, v4, v3}, Lmh0/e;->b(Lmh0/e;ZLjava/lang/String;ILjava/lang/Object;)Lmh0/e;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
