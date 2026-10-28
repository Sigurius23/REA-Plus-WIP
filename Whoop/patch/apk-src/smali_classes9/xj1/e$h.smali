.class final Lxj1/e$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxj1/e;->m(Lec3/l;)Lec3/l;
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
        "Lxj1/c;",
        "accumulator",
        "Lxj1/b;",
        "value",
        "<anonymous>",
        "(Lxj1/c;Lxj1/b;)Lxj1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor$interact$2"
    f = "ComposableHealthMonitorInteractor.kt"
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
            "Lxj1/e$h;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lxj1/c;Lxj1/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxj1/c;",
            "Lxj1/b;",
            "Lq83/d<",
            "-",
            "Lxj1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lxj1/e$h;

    invoke-direct {v0, p3}, Lxj1/e$h;-><init>(Lq83/d;)V

    iput-object p1, v0, Lxj1/e$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Lxj1/e$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lxj1/e$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxj1/c;

    check-cast p2, Lxj1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lxj1/e$h;->f(Lxj1/c;Lxj1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lxj1/e$h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxj1/c;

    iget-object v0, p0, Lxj1/e$h;->y:Ljava/lang/Object;

    check-cast v0, Lxj1/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lxj1/e$h;->w:I

    if-nez v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lxj1/b$g;

    if-eqz p1, :cond_1

    check-cast v0, Lxj1/b$g;

    invoke-virtual {v0}, Lxj1/b$g;->a()Lyg2/d;

    move-result-object p1

    new-instance v0, Lxj1/d;

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2}, Lxj1/d;-><init>(Lyg2/d;Z)V

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    sget-object p1, Lyg2/d$b;->b:Lyg2/d$b;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2}, Lxj1/d;-><init>(Lyg2/d;Z)V

    goto :goto_0

    :goto_1
    const/16 v8, 0x2f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Lxj1/b$b;

    if-eqz p1, :cond_2

    sget-object v4, Lxj1/f;->NETWORK_ERROR:Lxj1/f;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lxj1/b$h;

    if-eqz p1, :cond_3

    check-cast v0, Lxj1/b$h;

    invoke-virtual {v0}, Lxj1/b$h;->a()Lc41/w2;

    move-result-object v3

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Lxj1/b$i;

    if-eqz p1, :cond_4

    new-instance v2, Lxj1/c;

    check-cast v0, Lxj1/b$i;

    invoke-virtual {v0}, Lxj1/b$i;->a()Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;

    move-result-object v3

    invoke-virtual {v1}, Lxj1/c;->e()Lxj1/d;

    move-result-object v7

    const/16 v9, 0x2e

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lxj1/c;-><init>(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_4
    instance-of p1, v0, Lxj1/b$a;

    if-eqz p1, :cond_5

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lxj1/b$e;

    if-eqz p1, :cond_6

    sget-object v7, Lxj1/g$b;->a:Lxj1/g$b;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lxj1/b$f;

    if-eqz p1, :cond_7

    new-instance v7, Lxj1/g$c;

    check-cast v0, Lxj1/b$f;

    invoke-virtual {v0}, Lxj1/b$f;->a()Ljava/io/File;

    move-result-object p1

    invoke-direct {v7, p1}, Lxj1/g$c;-><init>(Ljava/io/File;)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v0, Lxj1/b$d;

    if-eqz p1, :cond_8

    new-instance v7, Lxj1/g$a;

    check-cast v0, Lxj1/b$d;

    invoke-virtual {v0}, Lxj1/b$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v7, p1}, Lxj1/g$a;-><init>(Ljava/lang/String;)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v0, Lxj1/b$c;

    if-eqz p1, :cond_9

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
