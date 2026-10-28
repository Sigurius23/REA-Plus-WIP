.class final Lfh2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh2/b;->c(Lec3/l;)Lec3/l;
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
        "Lhh2/g;",
        "previousViewState",
        "Ldh2/c;",
        "currentDomainState",
        "<anonymous>",
        "(Lhh2/g;Ldh2/c;)Lhh2/g;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stealthmode.reducer.StealthModeViewStateReducer$reduce$1"
    f = "StealthModeViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfh2/b;


# direct methods
.method public constructor <init>(Lfh2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfh2/b;",
            "Lq83/d<",
            "-",
            "Lfh2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfh2/b$a;->z:Lfh2/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lhh2/g;Ldh2/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhh2/g;",
            "Ldh2/c;",
            "Lq83/d<",
            "-",
            "Lhh2/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lfh2/b$a;

    iget-object v1, p0, Lfh2/b$a;->z:Lfh2/b;

    invoke-direct {v0, v1, p3}, Lfh2/b$a;-><init>(Lfh2/b;Lq83/d;)V

    iput-object p1, v0, Lfh2/b$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfh2/b$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfh2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhh2/g;

    check-cast p2, Ldh2/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfh2/b$a;->f(Lhh2/g;Ldh2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lfh2/b$a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhh2/g;

    iget-object v0, p0, Lfh2/b$a;->y:Ljava/lang/Object;

    check-cast v0, Ldh2/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfh2/b$a;->w:I

    if-nez v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Ldh2/c$d;

    if-eqz p1, :cond_0

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lhh2/g;->b(Lhh2/g;ZZLhh2/f;Lhh2/a;ILjava/lang/Object;)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Ldh2/c$f;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lfh2/b$a;->z:Lfh2/b;

    check-cast v0, Ldh2/c$f;

    invoke-virtual {v0}, Ldh2/c$f;->a()Z

    move-result v0

    const/4 v2, 0x1

    invoke-static {p1, v0, v2, v1}, Lfh2/b;->b(Lfh2/b;ZZLhh2/g;)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Ldh2/c$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lfh2/b$a;->z:Lfh2/b;

    check-cast v0, Ldh2/c$a;

    invoke-virtual {v0}, Ldh2/c$a;->a()Z

    move-result v0

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Lfh2/b;->b(Lfh2/b;ZZLhh2/g;)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Ldh2/c$c;

    if-eqz p1, :cond_3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lhh2/g;->b(Lhh2/g;ZZLhh2/f;Lhh2/a;ILjava/lang/Object;)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Ldh2/c$h;

    if-eqz p1, :cond_4

    new-instance v2, Lhh2/f;

    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lhh2/f;-><init>(ZZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lhh2/g;->b(Lhh2/g;ZZLhh2/f;Lhh2/a;ILjava/lang/Object;)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Ldh2/c$e;

    if-eqz p1, :cond_5

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lhh2/g;->b(Lhh2/g;ZZLhh2/f;Lhh2/a;ILjava/lang/Object;)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Ldh2/c$b;

    if-eqz p1, :cond_7

    check-cast v0, Ldh2/c$b;

    invoke-virtual {v0}, Ldh2/c$b;->b()Z

    move-result v2

    invoke-virtual {v0}, Ldh2/c$b;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldh2/a;

    new-instance v1, Lhh2/b;

    invoke-virtual {v0}, Ldh2/a;->a()Leh2/a;

    move-result-object v3

    invoke-virtual {v0}, Ldh2/a;->b()Z

    move-result v0

    invoke-direct {v1, v3, v0}, Lhh2/b;-><init>(Leh2/a;Z)V

    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    new-instance v1, Lhh2/f;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, Lhh2/f;-><init>(ZZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lhh2/g;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xb

    const/4 v12, 0x0

    move-object v9, v1

    invoke-direct/range {v6 .. v12}, Lhh2/g;-><init>(ZZLhh2/f;Lhh2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_7
    instance-of p1, v0, Ldh2/c$g;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lfh2/b$a;->z:Lfh2/b;

    check-cast v0, Ldh2/c$g;

    invoke-virtual {v0}, Ldh2/c$g;->a()Leh2/a;

    move-result-object v2

    invoke-virtual {v0}, Ldh2/c$g;->b()Z

    move-result v0

    invoke-static {p1, v1, v2, v0}, Lfh2/b;->a(Lfh2/b;Lhh2/g;Leh2/a;Z)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_8
    return-object v1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
