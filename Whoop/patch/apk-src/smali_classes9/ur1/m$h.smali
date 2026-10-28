.class final Lur1/m$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/m;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lur1/n;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$interact$1$1"
    f = "JournalFetchInteractor.kt"
    l = {
        0x45,
        0x48,
        0x4b,
        0x4a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lur1/m;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lur1/l;


# direct methods
.method public constructor <init>(Lur1/l;Lur1/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lur1/l;",
            "Lur1/m;",
            "Lq83/d<",
            "-",
            "Lur1/m$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur1/m$h;->z:Lur1/l;

    iput-object p2, p0, Lur1/m$h;->E:Lur1/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lur1/m$h;

    iget-object v1, p0, Lur1/m$h;->z:Lur1/l;

    iget-object v2, p0, Lur1/m$h;->E:Lur1/m;

    invoke-direct {v0, v1, v2, p2}, Lur1/m$h;-><init>(Lur1/l;Lur1/m;Lq83/d;)V

    iput-object p1, v0, Lur1/m$h;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lur1/m$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lur1/m$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lur1/m$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lur1/m$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lur1/m$h;->y:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lec3/m;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lur1/m$h;->x:I

    const/4 v11, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v11, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lur1/m$h;->w:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v0, Lur1/l$d;

    invoke-virtual {v0}, Lur1/l$d;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lur1/n$d;->a:Lur1/n$d;

    iput-object v9, p0, Lur1/m$h;->y:Ljava/lang/Object;

    iput v3, p0, Lur1/m$h;->x:I

    invoke-interface {v9, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_0
    iget-object v0, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v0, Lur1/l$d;

    invoke-virtual {v0}, Lur1/l$d;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lur1/n$o;->a:Lur1/n$o;

    iput-object v9, p0, Lur1/m$h;->y:Ljava/lang/Object;

    iput v2, p0, Lur1/m$h;->x:I

    invoke-interface {v9, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    iget-object v0, p0, Lur1/m$h;->E:Lur1/m;

    iget-object v2, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v2, Lur1/l$d;

    invoke-virtual {v2}, Lur1/l$d;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v3, Lur1/l$d;

    invoke-virtual {v3}, Lur1/l$d;->a()J

    move-result-wide v3

    iget-object v5, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v5, Lur1/l$d;

    invoke-virtual {v5}, Lur1/l$d;->h()Z

    move-result v5

    iget-object v6, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v6, Lur1/l$d;

    invoke-virtual {v6}, Lur1/l$d;->g()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v7, Lur1/l$d;

    invoke-virtual {v7}, Lur1/l$d;->c()Ljava/lang/String;

    move-result-object v7

    iget-object v13, p0, Lur1/m$h;->z:Lur1/l;

    check-cast v13, Lur1/l$d;

    invoke-virtual {v13}, Lur1/l$d;->b()Lyr1/b;

    move-result-object v13

    iput-object v12, p0, Lur1/m$h;->y:Ljava/lang/Object;

    iput-object v9, p0, Lur1/m$h;->w:Ljava/lang/Object;

    iput v1, p0, Lur1/m$h;->x:I

    move-object v8, p0

    move-object v1, v2

    move-wide v2, v3

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v13

    invoke-static/range {v0 .. v8}, Lur1/m;->j(Lur1/m;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Lyr1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    iput-object v12, p0, Lur1/m$h;->y:Ljava/lang/Object;

    iput-object v12, p0, Lur1/m$h;->w:Ljava/lang/Object;

    iput v11, p0, Lur1/m$h;->x:I

    invoke-interface {v9, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_8

    :goto_3
    return-object v10

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
