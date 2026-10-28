.class final Lbk1/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbk1/a;->b(Lec3/l;)Lec3/l;
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
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lbk1/a$a;",
        "accumulation",
        "Ll83/q;",
        "Lxj1/c;",
        "Lyg2/d;",
        "Lsl1/b;",
        "<destruct>",
        "<anonymous>",
        "(Lbk1/a$a;Ll83/q;)Lbk1/a$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthmonitor.presentation.reducers.ComposableHealthMonitorCombiner$useLiveHrOnceActive$1"
    f = "ComposableHealthMonitorCombiner.kt"
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
            "Lbk1/a$d;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lbk1/a$a;Ll83/q;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk1/a$a;",
            "Ll83/q;",
            "Lq83/d<",
            "-",
            "Lbk1/a$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbk1/a$d;

    invoke-direct {v0, p3}, Lbk1/a$d;-><init>(Lq83/d;)V

    iput-object p1, v0, Lbk1/a$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lbk1/a$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbk1/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbk1/a$a;

    check-cast p2, Ll83/q;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lbk1/a$d;->f(Lbk1/a$a;Ll83/q;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lbk1/a$d;->x:Ljava/lang/Object;

    check-cast v0, Lbk1/a$a;

    iget-object v1, p0, Lbk1/a$d;->y:Ljava/lang/Object;

    check-cast v1, Ll83/q;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbk1/a$d;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v1, Ll83/q;->w:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lxj1/c;

    iget-object p1, v1, Ll83/q;->x:Ljava/lang/Object;

    check-cast p1, Lyg2/d;

    iget-object v1, v1, Ll83/q;->y:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lsl1/b;

    invoke-virtual {v0}, Lbk1/a$a;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    instance-of v0, p1, Lyg2/d$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_3

    invoke-virtual {v2}, Lxj1/c;->e()Lxj1/d;

    move-result-object v3

    invoke-virtual {v3}, Lxj1/d;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lxj1/c;->e()Lxj1/d;

    move-result-object p1

    move-object v7, p1

    goto :goto_3

    :cond_3
    :goto_2
    new-instance v3, Lxj1/d;

    invoke-direct {v3, p1, v1}, Lxj1/d;-><init>(Lyg2/d;Z)V

    move-object v7, v3

    :goto_3
    const/16 v9, 0x27

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lxj1/c;->b(Lxj1/c;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;ILjava/lang/Object;)Lxj1/c;

    move-result-object p1

    new-instance v1, Lbk1/a$a;

    invoke-direct {v1, p1, v0}, Lbk1/a$a;-><init>(Lxj1/c;Z)V

    return-object v1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
