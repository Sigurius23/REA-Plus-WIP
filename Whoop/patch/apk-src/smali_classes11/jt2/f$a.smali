.class final Ljt2/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljt2/f;->j(Ljt2/l$b;)Lec3/l;
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
        "Ljt2/p;",
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
    c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$cancelCurrentPlan$1"
    f = "HubAndSpokeApiInteractor.kt"
    l = {
        0x85,
        0x86,
        0x89
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljt2/l$b;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljt2/f;


# direct methods
.method public constructor <init>(Ljt2/f;Ljt2/l$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/f;",
            "Ljt2/l$b;",
            "Lq83/d<",
            "-",
            "Ljt2/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljt2/f$a;->z:Ljt2/f;

    iput-object p2, p0, Ljt2/f$a;->E:Ljt2/l$b;

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

    new-instance v0, Ljt2/f$a;

    iget-object v1, p0, Ljt2/f$a;->z:Ljt2/f;

    iget-object v2, p0, Ljt2/f$a;->E:Ljt2/l$b;

    invoke-direct {v0, v1, v2, p2}, Ljt2/f$a;-><init>(Ljt2/f;Ljt2/l$b;Lq83/d;)V

    iput-object p1, v0, Ljt2/f$a;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ljt2/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljt2/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljt2/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljt2/f$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Ljt2/f$a;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Ljt2/f$a;->x:I

    const/4 v10, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v11, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, p0, Ljt2/f$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ljt2/p$c;->a:Ljt2/p$c;

    iput-object v8, p0, Ljt2/f$a;->y:Ljava/lang/Object;

    iput v2, p0, Ljt2/f$a;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Ljt2/f$a;->z:Ljt2/f;

    invoke-static {v2}, Ljt2/f;->h(Ljt2/f;)Ltr2/n;

    move-result-object v2

    new-instance v4, Ljt2/f$a$a;

    iget-object v3, p0, Ljt2/f$a;->z:Ljt2/f;

    iget-object v6, p0, Ljt2/f$a;->E:Ljt2/l$b;

    invoke-direct {v4, v3, v6, v11}, Ljt2/f$a$a;-><init>(Ljt2/f;Ljt2/l$b;Lq83/d;)V

    iput-object v8, p0, Ljt2/f$a;->y:Ljava/lang/Object;

    iput v1, p0, Ljt2/f$a;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_6

    sget-object v0, Ljt2/p$d;->a:Ljt2/p$d;

    goto :goto_2

    :cond_6
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_8

    new-instance v0, Ljt2/p$b;

    iget-object v1, p0, Ljt2/f$a;->E:Ljt2/l$b;

    invoke-virtual {v1}, Ljt2/l$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljt2/p$b;-><init>(Ljava/lang/String;)V

    :goto_2
    iput-object v11, p0, Ljt2/f$a;->y:Ljava/lang/Object;

    iput-object v11, p0, Ljt2/f$a;->w:Ljava/lang/Object;

    iput v10, p0, Ljt2/f$a;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    :goto_3
    return-object v9

    :cond_7
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
