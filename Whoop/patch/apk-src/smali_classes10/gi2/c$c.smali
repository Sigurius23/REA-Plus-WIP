.class final Lgi2/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi2/c;->interact(Lec3/l;)Lec3/l;
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
        "Lgi2/d;",
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
    c = "com.whoop.strava.domain.StravaDomainInteractor$interact$1$1"
    f = "StravaDomainInteractor.kt"
    l = {
        0x1a,
        0x1b,
        0x1c,
        0x20
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lgi2/c;

.field final synthetic G:Lgi2/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lgi2/c;Lgi2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/c;",
            "Lgi2/b;",
            "Lq83/d<",
            "-",
            "Lgi2/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgi2/c$c;->F:Lgi2/c;

    iput-object p2, p0, Lgi2/c$c;->G:Lgi2/b;

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

    new-instance v0, Lgi2/c$c;

    iget-object v1, p0, Lgi2/c$c;->F:Lgi2/c;

    iget-object v2, p0, Lgi2/c$c;->G:Lgi2/b;

    invoke-direct {v0, v1, v2, p2}, Lgi2/c$c;-><init>(Lgi2/c;Lgi2/b;Lq83/d;)V

    iput-object p1, v0, Lgi2/c$c;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lgi2/c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgi2/c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgi2/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgi2/c$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lgi2/c$c;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lgi2/c$c;->z:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lgi2/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lgi2/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lgi2/d$a;

    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget v2, p0, Lgi2/c$c;->y:I

    iget-object v3, p0, Lgi2/c$c;->x:Ljava/lang/Object;

    check-cast v3, Lgi2/d$a;

    iget-object v3, p0, Lgi2/c$c;->w:Ljava/lang/Object;

    check-cast v3, Lgi2/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgi2/c$c;->F:Lgi2/c;

    invoke-virtual {p1}, Lgi2/c;->k()Lgi2/e;

    move-result-object p1

    iget-object v2, p0, Lgi2/c$c;->G:Lgi2/b;

    iput-object v0, p0, Lgi2/c$c;->E:Ljava/lang/Object;

    iput v6, p0, Lgi2/c$c;->z:I

    invoke-virtual {p1, v2, p0}, Lgi2/e;->i(Lgi2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    instance-of v2, p1, Lgi2/d$a;

    if-eqz v2, :cond_6

    check-cast p1, Lgi2/d$a;

    goto :goto_2

    :cond_6
    move-object p1, v7

    :goto_2
    const/4 v2, 0x0

    if-eqz p1, :cond_8

    iget-object v3, p0, Lgi2/c$c;->F:Lgi2/c;

    iput-object v0, p0, Lgi2/c$c;->E:Ljava/lang/Object;

    iput-object v3, p0, Lgi2/c$c;->w:Ljava/lang/Object;

    iput-object v7, p0, Lgi2/c$c;->x:Ljava/lang/Object;

    iput v2, p0, Lgi2/c$c;->y:I

    iput v5, p0, Lgi2/c$c;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    new-instance p1, Lgi2/c$c$a;

    invoke-direct {p1, v0, v3, v7}, Lgi2/c$c$a;-><init>(Lec3/m;Lgi2/c;Lq83/d;)V

    iput-object v0, p0, Lgi2/c$c;->E:Ljava/lang/Object;

    iput-object v7, p0, Lgi2/c$c;->w:Ljava/lang/Object;

    iput-object v7, p0, Lgi2/c$c;->x:Ljava/lang/Object;

    iput v2, p0, Lgi2/c$c;->y:I

    iput v4, p0, Lgi2/c$c;->z:I

    const-wide/16 v2, 0x5dc

    invoke-static {v2, v3, p1, p0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_4

    :cond_8
    sget-object p1, Lgi2/d$c;->a:Lgi2/d$c;

    iput-object v7, p0, Lgi2/c$c;->E:Ljava/lang/Object;

    iput-object v7, p0, Lgi2/c$c;->w:Ljava/lang/Object;

    iput v2, p0, Lgi2/c$c;->y:I

    iput v3, p0, Lgi2/c$c;->z:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
