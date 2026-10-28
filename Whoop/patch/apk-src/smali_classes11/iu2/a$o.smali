.class final Liu2/a$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liu2/a;->t(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$startStreamingRawData$2"
    f = "StrengthTrainerPacketManager.kt"
    l = {
        0x100,
        0x10c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Z

.field x:I

.field final synthetic y:Liu2/a;


# direct methods
.method public constructor <init>(Liu2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu2/a;",
            "Lq83/d<",
            "-",
            "Liu2/a$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liu2/a$o;->y:Liu2/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Liu2/a$o;

    iget-object v0, p0, Liu2/a$o;->y:Liu2/a;

    invoke-direct {p1, v0, p2}, Liu2/a$o;-><init>(Liu2/a;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Liu2/a$o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liu2/a$o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liu2/a$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liu2/a$o;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Liu2/a$o;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-boolean v0, p0, Liu2/a$o;->w:Z

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

    iget-object p1, p0, Liu2/a$o;->y:Liu2/a;

    invoke-static {p1}, Liu2/a;->d(Liu2/a;)Lu92/d;

    move-result-object p1

    const-string v1, "RawDataStreamingEnabled"

    invoke-virtual {p1, v1, v4}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object p1, p0, Liu2/a$o;->y:Liu2/a;

    iput v4, p0, Liu2/a$o;->x:I

    invoke-static {p1, v4, v2, p0}, Liu2/a;->g(Liu2/a;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object v1, p0, Liu2/a$o;->y:Liu2/a;

    invoke-static {v1}, Liu2/a;->b(Liu2/a;)Lfi0/a;

    move-result-object v1

    const/4 v4, 0x0

    const-string v5, "Workout Builder"

    const-string v6, "Connectivity"

    const-string v7, "R10 Stream Not On"

    invoke-interface {v1, v6, v7, v4, v5}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Liu2/a$o;->y:Liu2/a;

    invoke-static {v1}, Liu2/a;->c(Liu2/a;)Ltr2/n;

    move-result-object v1

    const-string v4, "Failed to turnOnOrOffR10StreamingWithRetry"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v4, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Liu2/a$o;->y:Liu2/a;

    invoke-static {v1}, Liu2/a;->e(Liu2/a;)Ltd1/b;

    move-result-object v4

    iput-boolean p1, p0, Liu2/a$o;->w:Z

    iput v3, p0, Liu2/a$o;->x:I

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v4 .. v10}, Ltd1/b;->v(Ltd1/b;ZJLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move v0, p1

    :goto_2
    move p1, v0

    :cond_5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
