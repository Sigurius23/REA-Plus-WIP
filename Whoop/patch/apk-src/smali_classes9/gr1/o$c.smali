.class final Lgr1/o$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgr1/o;-><init>(Lcr1/c;Lhr1/f;Lar1/b;Lqw2/c;Ljava/lang/String;Lbc3/c0;)V
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
        "Lgr1/q;",
        "prevState",
        "Lcr1/b;",
        "result",
        "<anonymous>",
        "(Lgr1/q;Lcr1/b;)Lgr1/q;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.integrations.presentation.IntegrationsViewModel$accumulatedViewState$2"
    f = "IntegrationsViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lhr1/f;


# direct methods
.method public constructor <init>(Lhr1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhr1/f;",
            "Lq83/d<",
            "-",
            "Lgr1/o$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgr1/o$c;->z:Lhr1/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lgr1/q;Lcr1/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/q;",
            "Lcr1/b;",
            "Lq83/d<",
            "-",
            "Lgr1/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lgr1/o$c;

    iget-object v1, p0, Lgr1/o$c;->z:Lhr1/f;

    invoke-direct {v0, v1, p3}, Lgr1/o$c;-><init>(Lhr1/f;Lq83/d;)V

    iput-object p1, v0, Lgr1/o$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lgr1/o$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lgr1/o$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgr1/q;

    check-cast p2, Lcr1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lgr1/o$c;->f(Lgr1/q;Lcr1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lgr1/o$c;->x:Ljava/lang/Object;

    check-cast v0, Lgr1/q;

    iget-object v1, p0, Lgr1/o$c;->y:Ljava/lang/Object;

    check-cast v1, Lcr1/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lgr1/o$c;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgr1/o$c;->z:Lhr1/f;

    invoke-virtual {p1, v1}, Lhr1/f;->a(Lcr1/b;)Lgr1/q;

    move-result-object v2

    instance-of p1, v1, Lcr1/b$h;

    if-nez p1, :cond_1

    instance-of p1, v1, Lcr1/b$i;

    if-nez p1, :cond_1

    instance-of p1, v1, Lcr1/b$j;

    if-nez p1, :cond_1

    instance-of p1, v1, Lcr1/b$e;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    :goto_0
    invoke-virtual {v2}, Lgr1/q;->c()Lgr1/b;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lgr1/q;->c()Lgr1/b;

    move-result-object p1

    :cond_2
    move-object v7, p1

    invoke-virtual {v2}, Lgr1/q;->d()Lgr1/c;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Lgr1/q;->d()Lgr1/c;

    move-result-object p1

    :cond_3
    move-object v8, p1

    const/16 v11, 0xcf

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, Lgr1/q;->b(Lgr1/q;Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILjava/lang/Object;)Lgr1/q;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
