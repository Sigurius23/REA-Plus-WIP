.class final Lfh0/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh0/a;->interact(Lec3/l;)Lec3/l;
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
        "Lfh0/e;",
        "state",
        "Lfh0/a$a;",
        "result",
        "<anonymous>",
        "(Lfh0/e;Lfh0/a$a;)Lfh0/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.view.contextstatustoggle.ContextStatusToggleInteractor$interact$2"
    f = "ContextStatusToggleInteractor.kt"
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
            "Lfh0/a$d;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lfh0/e;Lfh0/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfh0/e;",
            "Lfh0/a$a;",
            "Lq83/d<",
            "-",
            "Lfh0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lfh0/a$d;

    invoke-direct {v0, p3}, Lfh0/a$d;-><init>(Lq83/d;)V

    iput-object p1, v0, Lfh0/a$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfh0/a$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfh0/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfh0/e;

    check-cast p2, Lfh0/a$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfh0/a$d;->f(Lfh0/e;Lfh0/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lfh0/a$d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfh0/e;

    iget-object v0, p0, Lfh0/a$d;->y:Ljava/lang/Object;

    check-cast v0, Lfh0/a$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfh0/a$d;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lfh0/a$a$a;

    if-eqz p1, :cond_0

    check-cast v0, Lfh0/a$a$a;

    invoke-virtual {v0}, Lfh0/a$a$a;->a()Z

    move-result v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lfh0/e;->b(Lfh0/e;ZZZILjava/lang/Object;)Lfh0/e;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lfh0/a$a$c;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lfh0/e;->d()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-virtual {v1, p1, v3, v2}, Lfh0/e;->a(ZZZ)Lfh0/e;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Lfh0/a$a$b;

    if-eqz p1, :cond_3

    check-cast v0, Lfh0/a$a$b;

    invoke-virtual {v0}, Lfh0/a$a$b;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lfh0/e;->b(Lfh0/e;ZZZILjava/lang/Object;)Lfh0/e;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v1}, Lfh0/e;->d()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-virtual {v1, p1, v2, v3}, Lfh0/e;->a(ZZZ)Lfh0/e;

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
