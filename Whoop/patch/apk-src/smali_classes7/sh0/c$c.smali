.class final Lsh0/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh0/c;->j(Lsh0/a$b;)Lec3/l;
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
        "Lsh0/b;",
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
    c = "com.whoop.aiinsights.domain.AiInsightsInteractor$loadData$1"
    f = "AiInsightsInteractor.kt"
    l = {
        0x3e,
        0x3f,
        0x48,
        0x45
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lsh0/c;

.field final synthetic F:Lsh0/a$b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsh0/c;Lsh0/a$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh0/c;",
            "Lsh0/a$b;",
            "Lq83/d<",
            "-",
            "Lsh0/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsh0/c$c;->E:Lsh0/c;

    iput-object p2, p0, Lsh0/c$c;->F:Lsh0/a$b;

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

    new-instance v0, Lsh0/c$c;

    iget-object v1, p0, Lsh0/c$c;->E:Lsh0/c;

    iget-object v2, p0, Lsh0/c$c;->F:Lsh0/a$b;

    invoke-direct {v0, v1, v2, p2}, Lsh0/c$c;-><init>(Lsh0/c;Lsh0/a$b;Lq83/d;)V

    iput-object p1, v0, Lsh0/c$c;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lsh0/c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsh0/c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsh0/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsh0/c$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lsh0/c$c;->z:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsh0/c$c;->y:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, p0, Lsh0/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lsh0/c$c;->x:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    iget-object v0, p0, Lsh0/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lsh0/b$e;->a:Lsh0/b$e;

    iput-object v8, p0, Lsh0/c$c;->z:Ljava/lang/Object;

    iput v2, p0, Lsh0/c$c;->y:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lsh0/c$c;->E:Lsh0/c;

    invoke-static {v2}, Lsh0/c;->e(Lsh0/c;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lsh0/c$c$b;

    iget-object v3, p0, Lsh0/c$c;->E:Lsh0/c;

    iget-object v6, p0, Lsh0/c$c;->F:Lsh0/a$b;

    invoke-direct {v4, v3, v6, v12}, Lsh0/c$c$b;-><init>(Lsh0/c;Lsh0/a$b;Lq83/d;)V

    iput-object v8, p0, Lsh0/c$c;->z:Ljava/lang/Object;

    iput v1, p0, Lsh0/c$c;->y:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    new-instance v1, Lsh0/c$c$a;

    invoke-direct {v1, v0, v12}, Lsh0/c$c$a;-><init>(Lu02/a;Lq83/d;)V

    iput-object v12, p0, Lsh0/c$c;->z:Ljava/lang/Object;

    iput-object v12, p0, Lsh0/c$c;->w:Ljava/lang/Object;

    iput-object v8, p0, Lsh0/c$c;->x:Ljava/lang/Object;

    iput v11, p0, Lsh0/c$c;->y:I

    const-wide/16 v2, 0x1f4

    invoke-static {v2, v3, v1, p0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast v0, Lsh0/b;

    goto :goto_3

    :cond_8
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lsh0/c$c;->E:Lsh0/c;

    invoke-static {v1}, Lsh0/c;->e(Lsh0/c;)Ltr2/n;

    move-result-object v1

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Failed to load AI insights: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v1, v2, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lsh0/b$d;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lsh0/b$d;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_3
    iput-object v12, p0, Lsh0/c$c;->z:Ljava/lang/Object;

    iput-object v12, p0, Lsh0/c$c;->w:Ljava/lang/Object;

    iput-object v12, p0, Lsh0/c$c;->x:Ljava/lang/Object;

    iput v10, p0, Lsh0/c$c;->y:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_4
    return-object v9

    :cond_9
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
