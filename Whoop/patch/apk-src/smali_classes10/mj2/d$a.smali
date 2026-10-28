.class public final Lmj2/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmj2/d;->f(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$$inlined$flatMapLatest$1"
    f = "StressSessionViewStateReducer.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lmj2/d;


# direct methods
.method public constructor <init>(Lq83/d;Lmj2/d;)V
    .locals 0

    iput-object p2, p0, Lmj2/d$a;->z:Lmj2/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lnj2/r;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lmj2/d$a;

    iget-object v1, p0, Lmj2/d$a;->z:Lmj2/d;

    invoke-direct {v0, p3, v1}, Lmj2/d$a;-><init>(Lq83/d;Lmj2/d;)V

    iput-object p1, v0, Lmj2/d$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lmj2/d$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lmj2/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lmj2/d$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmj2/d$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lmj2/d$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmj2/d$a;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lmj2/d$a;->y:Ljava/lang/Object;

    check-cast v1, Lnj2/r;

    instance-of v3, v1, Lnj2/r$d;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget-object v3, p0, Lmj2/d$a;->z:Lmj2/d;

    check-cast v1, Lnj2/r$d;

    invoke-virtual {v1}, Lnj2/r$d;->a()Lcom/whoop/stress/domain/model/StressSession;

    move-result-object v1

    invoke-static {v3, v1}, Lmj2/d;->c(Lmj2/d;Lcom/whoop/stress/domain/model/StressSession;)Lec3/l;

    move-result-object v1

    goto/16 :goto_1

    :cond_2
    instance-of v3, v1, Lnj2/r$f;

    if-eqz v3, :cond_4

    check-cast v1, Lnj2/r$f;

    invoke-virtual {v1}, Lnj2/r$f;->b()Lcom/whoop/stress/domain/model/StressIntervention;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v5, p0, Lmj2/d$a;->z:Lmj2/d;

    invoke-virtual {v1}, Lnj2/r$f;->c()I

    move-result v1

    invoke-static {v5, v3, v1}, Lmj2/d;->d(Lmj2/d;Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;

    move-result-object v1

    if-nez v1, :cond_a

    :cond_3
    new-instance v1, Lmj2/d$b;

    invoke-direct {v1, v4}, Lmj2/d$b;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_0
    move-object v1, v3

    goto/16 :goto_1

    :cond_4
    instance-of v3, v1, Lnj2/r$g;

    if-eqz v3, :cond_6

    check-cast v1, Lnj2/r$g;

    invoke-virtual {v1}, Lnj2/r$g;->a()Lcom/whoop/stress/domain/model/StressIntervention;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v5, p0, Lmj2/d$a;->z:Lmj2/d;

    invoke-static {v5}, Lmj2/d;->a(Lmj2/d;)Loj2/a;

    move-result-object v5

    invoke-virtual {v1}, Lnj2/r$g;->b()I

    move-result v1

    invoke-virtual {v5, v3, v1}, Loj2/a;->n(Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;

    move-result-object v1

    if-nez v1, :cond_a

    :cond_5
    new-instance v1, Lmj2/d$c;

    invoke-direct {v1, v4}, Lmj2/d$c;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_6
    sget-object v3, Lnj2/r$b;->a:Lnj2/r$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v1, Lmj2/d$d;

    invoke-direct {v1, v4}, Lmj2/d$d;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_7
    sget-object v3, Lnj2/r$a;->a:Lnj2/r$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v1, Lmj2/d$e;

    invoke-direct {v1, v4}, Lmj2/d$e;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_8
    sget-object v3, Lnj2/r$e;->a:Lnj2/r$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v1, Lmj2/d$f;

    invoke-direct {v1, v4}, Lmj2/d$f;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_9
    sget-object v3, Lnj2/r$c;->a:Lnj2/r$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Lmj2/d$g;

    invoke-direct {v1, v4}, Lmj2/d$g;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_a
    :goto_1
    iput-object v4, p0, Lmj2/d$a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lmj2/d$a;->y:Ljava/lang/Object;

    iput v2, p0, Lmj2/d$a;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    return-object v0

    :cond_b
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
