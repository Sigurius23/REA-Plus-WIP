.class public final Lx42/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx42/a$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lx42/a;


# direct methods
.method public constructor <init>(Lec3/m;Lx42/a;)V
    .locals 0

    iput-object p1, p0, Lx42/a$b$a;->w:Lec3/m;

    iput-object p2, p0, Lx42/a$b$a;->x:Lx42/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lx42/a$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lx42/a$b$a$a;

    iget v1, v0, Lx42/a$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx42/a$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx42/a$b$a$a;

    invoke-direct {v0, p0, p2}, Lx42/a$b$a$a;-><init>(Lx42/a$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lx42/a$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx42/a$b$a$a;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lx42/a$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lx42/a$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lx42/a$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lx42/a$b$a$a;->L:I

    iget-object v2, v0, Lx42/a$b$a$a;->K:Ljava/lang/Object;

    check-cast v2, Ly42/a;

    iget-object v2, v0, Lx42/a$b$a$a;->J:Ljava/lang/Object;

    check-cast v2, Ll83/k;

    iget-object v2, v0, Lx42/a$b$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lx42/a$b$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lx42/a$b$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lx42/a$b$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lx42/a$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lx42/a$b$a;->w:Lec3/m;

    check-cast p1, Ll83/k;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ly42/a;

    invoke-interface {p1}, Ly42/a;->l()Lec3/t1;

    move-result-object p2

    invoke-interface {p2}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    sget-object v6, Lc52/b$f;->a:Lc52/b$f;

    invoke-static {p2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v6, 0x0

    if-eqz p2, :cond_5

    iget-object p2, p0, Lx42/a$b$a;->x:Lx42/a;

    invoke-static {p2}, Lx42/a;->c(Lx42/a;)Ltr2/n;

    move-result-object p2

    const-string v7, "submitting hps task"

    new-array v8, v6, [Lqr2/a$a;

    invoke-interface {p2, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lx42/a$b$a;->x:Lx42/a;

    invoke-static {p2}, Lx42/a;->b(Lx42/a;)Lf52/a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lf52/a;->b(Ly42/a;)Lbc3/i0;

    move-result-object p1

    iput-object v5, v0, Lx42/a$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lx42/a$b$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->J:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->K:Ljava/lang/Object;

    iput v6, v0, Lx42/a$b$a$a;->L:I

    iput v6, v0, Lx42/a$b$a$a;->M:I

    iput v4, v0, Lx42/a$b$a$a;->x:I

    invoke-interface {p1, v0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_4

    :cond_4
    move p1, v6

    :goto_1
    check-cast p2, Lvk0/e;

    move v6, p1

    goto :goto_3

    :cond_5
    iget-object p2, p0, Lx42/a$b$a;->x:Lx42/a;

    invoke-static {p2}, Lx42/a;->c(Lx42/a;)Ltr2/n;

    move-result-object p2

    invoke-interface {p1}, Ly42/a;->O()Lc52/d;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lc52/d;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_6
    move-object p1, v5

    :goto_2
    const-string v4, "attempted to submit hps task, but puffin "

    const-string v7, " wasn\'t connected"

    invoke-static {v4, p1, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v4, v6, [Lqr2/a$a;

    invoke-interface {p2, p1, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    move-object p2, v5

    :goto_3
    iput-object v5, v0, Lx42/a$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->J:Ljava/lang/Object;

    iput-object v5, v0, Lx42/a$b$a$a;->K:Ljava/lang/Object;

    iput v6, v0, Lx42/a$b$a$a;->L:I

    iput v3, v0, Lx42/a$b$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
