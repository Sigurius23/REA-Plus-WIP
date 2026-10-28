.class final Lc51/k$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc51/k;->q(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/s;Landroidx/compose/runtime/Composer;II)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaKt$Amoeba$4$1"
    f = "Amoeba.kt"
    l = {
        0x9f,
        0xa2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:J

.field x:I

.field final synthetic y:Lc51/s;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc51/s;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc51/s;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lc51/k$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc51/k$d;->y:Lc51/s;

    iput-object p2, p0, Lc51/k$d;->z:Lp1/c1;

    iput-object p3, p0, Lc51/k$d;->E:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lc51/k$d;

    iget-object v0, p0, Lc51/k$d;->y:Lc51/s;

    iget-object v1, p0, Lc51/k$d;->z:Lp1/c1;

    iget-object v2, p0, Lc51/k$d;->E:Lp1/c1;

    invoke-direct {p1, v0, v1, v2, p2}, Lc51/k$d;-><init>(Lc51/s;Lp1/c1;Lp1/c1;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lc51/k$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc51/k$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc51/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lc51/k$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lc51/k$d;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v3, p0, Lc51/k$d;->w:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {p1}, Lc51/s;->p()Lc51/r;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {p1}, Lc51/s;->p()Lc51/r;

    move-result-object p1

    invoke-virtual {p1}, Lc51/r;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v4

    long-to-float p1, v4

    iget-object v1, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {v1}, Lc51/s;->p()Lc51/r;

    move-result-object v1

    invoke-virtual {v1}, Lc51/r;->b()F

    move-result v1

    mul-float/2addr v1, p1

    float-to-long v4, v1

    iget-object p1, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {p1}, Lc51/s;->p()Lc51/r;

    move-result-object p1

    invoke-virtual {p1}, Lc51/r;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v6

    sub-long/2addr v6, v4

    iput-wide v4, p0, Lc51/k$d;->w:J

    iput v3, p0, Lc51/k$d;->x:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-wide v3, v4

    :goto_0
    iget-object p1, p0, Lc51/k$d;->z:Lp1/c1;

    iget-object v1, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {v1}, Lc51/s;->p()Lc51/r;

    move-result-object v1

    invoke-virtual {v1}, Lc51/r;->c()J

    move-result-wide v5

    invoke-static {p1, v5, v6}, Lc51/k;->Y(Lp1/c1;J)V

    iget-object p1, p0, Lc51/k$d;->E:Lp1/c1;

    iget-object v1, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {v1}, Lc51/s;->p()Lc51/r;

    move-result-object v1

    invoke-virtual {v1}, Lc51/r;->c()J

    move-result-wide v5

    invoke-static {p1, v5, v6}, Lc51/k;->Z(Lp1/c1;J)V

    iput-wide v3, p0, Lc51/k$d;->w:J

    iput v2, p0, Lc51/k$d;->x:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    iget-object p1, p0, Lc51/k$d;->z:Lp1/c1;

    iget-object v0, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->h()Ll83/k;

    move-result-object v0

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {p1, v0, v1}, Lc51/k;->Y(Lp1/c1;J)V

    iget-object p1, p0, Lc51/k$d;->E:Lp1/c1;

    iget-object v0, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->h()Ll83/k;

    move-result-object v0

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {p1, v0, v1}, Lc51/k;->Z(Lp1/c1;J)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lc51/k$d;->z:Lp1/c1;

    iget-object v0, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->h()Ll83/k;

    move-result-object v0

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {p1, v0, v1}, Lc51/k;->Y(Lp1/c1;J)V

    iget-object p1, p0, Lc51/k$d;->E:Lp1/c1;

    iget-object v0, p0, Lc51/k$d;->y:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->h()Ll83/k;

    move-result-object v0

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {p1, v0, v1}, Lc51/k;->Z(Lp1/c1;J)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
