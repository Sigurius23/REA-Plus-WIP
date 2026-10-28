.class public final Lwx/j;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# static fields
.field public static final F:Ll8/d;


# instance fields
.field public final E:Lec3/w1;

.field public final w:Lt40/f;

.field public final x:Lq83/j;

.field public final y:Lq30/w0;

.field public final z:Lec3/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lb0/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb0/b;-><init>(I)V

    new-instance v1, Lwo1/e0;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lwo1/e0;-><init>(I)V

    const-class v2, Lwx/j;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lb0/b;->c()Ll8/d;

    move-result-object v0

    sput-object v0, Lwx/j;->F:Ll8/d;

    return-void
.end method

.method public constructor <init>(Lt40/f;Lq83/j;Lq30/w0;)V
    .locals 2

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lwx/j;->w:Lt40/f;

    iput-object p2, p0, Lwx/j;->x:Lq83/j;

    iput-object p3, p0, Lwx/j;->y:Lq30/w0;

    const/4 p1, 0x6

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p3, v0, v1, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lwx/j;->z:Lec3/w1;

    iput-object p1, p0, Lwx/j;->E:Lec3/w1;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p3, Lsz/q;

    const/16 v0, 0xf

    invoke-direct {p3, p0, v1, v0}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x2

    invoke-static {p1, p2, v1, p3, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final g(Lwx/j;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Lwx/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwx/i;

    iget v1, v0, Lwx/i;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwx/i;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwx/i;

    invoke-direct {v0, p0, p1}, Lwx/i;-><init>(Lwx/j;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lwx/i;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwx/i;->E:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lwx/i;->x:Ljava/lang/Object;

    iget-object v2, v0, Lwx/i;->w:Ljava/lang/Object;

    check-cast v2, Lwx/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p0, v0, Lwx/i;->w:Ljava/lang/Object;

    check-cast p0, Lwx/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    :cond_4
    move-object v9, p1

    move-object p1, p0

    move-object p0, v9

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwx/j;->y:Lq30/w0;

    iget-object v2, p1, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v2, Lbz/c;

    sget-object v6, Lbz/b;->J:Lbz/b;

    invoke-static {v2, v6}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    sget-object v2, Lxx/d;->w:Lxx/d;

    invoke-virtual {p1, v2}, Lq30/w0;->p(Lxx/e;)V

    iget-object p1, p0, Lwx/j;->w:Lt40/f;

    iput-object p0, v0, Lwx/i;->w:Ljava/lang/Object;

    iput v5, v0, Lwx/i;->E:I

    invoke-virtual {p1, v0}, Lt40/f;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :goto_1
    instance-of v2, p0, Ll83/m;

    if-nez v2, :cond_7

    move-object v2, p0

    check-cast v2, Ljava/lang/String;

    iget-object v5, p1, Lwx/j;->y:Lq30/w0;

    iget-object v6, v5, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v6, Lbz/c;

    sget-object v7, Lbz/b;->J:Lbz/b;

    check-cast v6, Lbz/a;

    invoke-virtual {v6, v7}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v6

    new-instance v7, Lxx/c;

    invoke-static {v6}, Lq30/w0;->o(Lkotlin/time/Duration;)Ljava/lang/Float;

    move-result-object v6

    const/4 v8, 0x1

    invoke-direct {v7, v8, v6}, Lxx/c;-><init>(ILjava/lang/Float;)V

    invoke-virtual {v5, v7}, Lq30/w0;->p(Lxx/e;)V

    iget-object v5, p1, Lwx/j;->z:Lec3/w1;

    new-instance v6, Lwx/d;

    invoke-direct {v6, v2}, Lwx/d;-><init>(Ljava/lang/String;)V

    iput-object p1, v0, Lwx/i;->w:Ljava/lang/Object;

    iput-object p0, v0, Lwx/i;->x:Ljava/lang/Object;

    iput v4, v0, Lwx/i;->E:I

    invoke-virtual {v5, v6, v0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v2, p1

    :goto_2
    move-object p1, v2

    :cond_7
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v4, p1, Lwx/j;->y:Lq30/w0;

    iget-object v5, v4, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v5, Lbz/c;

    sget-object v6, Lbz/b;->J:Lbz/b;

    check-cast v5, Lbz/a;

    invoke-virtual {v5, v6}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v5

    new-instance v6, Lxx/b;

    invoke-static {v5}, Lq30/w0;->o(Lkotlin/time/Duration;)Ljava/lang/Float;

    move-result-object v5

    const/4 v7, 0x1

    invoke-direct {v6, v2, v5, v7}, Lxx/b;-><init>(Ljava/lang/Throwable;Ljava/lang/Float;I)V

    invoke-virtual {v4, v6}, Lq30/w0;->p(Lxx/e;)V

    iget-object p1, p1, Lwx/j;->z:Lec3/w1;

    new-instance v4, Lwx/c;

    invoke-direct {v4, v2}, Lwx/c;-><init>(Ljava/lang/Throwable;)V

    iput-object p0, v0, Lwx/i;->w:Ljava/lang/Object;

    const/4 p0, 0x0

    iput-object p0, v0, Lwx/i;->x:Ljava/lang/Object;

    iput v3, v0, Lwx/i;->E:I

    invoke-virtual {p1, v4, v0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
