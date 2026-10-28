.class final Lf70/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lf70/h;

.field final synthetic x:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic y:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf70/h;Lec3/m;Lkotlin/jvm/internal/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/h;",
            "Lec3/m;",
            "Lkotlin/jvm/internal/g0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    iput-object p2, p0, Lf70/h$b$a;->x:Lec3/m;

    iput-object p3, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lf70/d;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lf70/h$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf70/h$b$a$a;

    iget v1, v0, Lf70/h$b$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/h$b$a$a;->E:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lf70/h$b$a$a;

    invoke-direct {v0, p0, p2}, Lf70/h$b$a$a;-><init>(Lf70/h$b$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Lf70/h$b$a$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lf70/h$b$a$a;->E:I

    const/4 v8, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v7, Lf70/h$b$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lf70/e;

    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_1
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_2
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_4
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_6
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_7
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_8
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_9
    iget-object p1, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lf70/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_a
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lf70/d$y;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object v1, p0, Lf70/h$b$a;->x:Lec3/m;

    iget-object v2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lf70/e;

    check-cast p1, Lf70/d$y;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v7, Lf70/h$b$a$a;->E:I

    invoke-static {p2, v1, v2, p1, v7}, Lf70/h;->o(Lf70/h;Lec3/m;Lf70/e;Lf70/d$y;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_1

    goto/16 :goto_c

    :cond_1
    :goto_2
    check-cast p2, Lf70/e;

    goto/16 :goto_b

    :cond_2
    instance-of p2, p1, Lf70/d$a;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lf70/h$b$a;->w:Lf70/h;

    invoke-static {p2}, Lf70/h;->h(Lf70/h;)Li70/a;

    move-result-object p2

    iget-object v1, p0, Lf70/h$b$a;->x:Lec3/m;

    check-cast p1, Lf70/d$a;

    iget-object v2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lf70/e;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v7, Lf70/h$b$a$a;->E:I

    invoke-virtual {p2, v1, p1, v2, v7}, Li70/a;->r(Lec3/m;Lf70/d$a;Lf70/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    goto/16 :goto_c

    :cond_3
    :goto_3
    check-cast p2, Lf70/e;

    goto/16 :goto_b

    :cond_4
    instance-of p2, p1, Lf70/d$a0;

    if-eqz p2, :cond_6

    iget-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object p2, p0, Lf70/h$b$a;->x:Lec3/m;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v7, Lf70/h$b$a$a;->E:I

    invoke-static {p1, p2, v7}, Lf70/h;->j(Lf70/h;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    goto/16 :goto_c

    :cond_5
    :goto_4
    check-cast p2, Lf70/e;

    goto/16 :goto_b

    :cond_6
    instance-of p2, p1, Lf70/d$z;

    if-eqz p2, :cond_8

    iget-object p2, p0, Lf70/h$b$a;->w:Lf70/h;

    invoke-static {p2}, Lf70/h;->f(Lf70/h;)Lj70/a;

    move-result-object v1

    iget-object v2, p0, Lf70/h$b$a;->x:Lec3/m;

    iget-object p2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lf70/e;

    check-cast p1, Lf70/d$z;

    invoke-virtual {p1}, Lf70/d$z;->c()Z

    move-result v4

    invoke-virtual {p1}, Lf70/d$z;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v5

    invoke-virtual {p1}, Lf70/d$z;->b()Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-result-object v6

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, v7, Lf70/h$b$a$a;->E:I

    invoke-virtual/range {v1 .. v7}, Lj70/a;->c(Lec3/m;Lf70/e;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    goto/16 :goto_c

    :cond_7
    :goto_5
    check-cast p2, Lf70/e;

    goto/16 :goto_b

    :cond_8
    instance-of p2, p1, Lf70/d$b0;

    if-eqz p2, :cond_a

    iget-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object p2, p0, Lf70/h$b$a;->x:Lec3/m;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, v7, Lf70/h$b$a$a;->E:I

    invoke-static {p1, p2, v7}, Lf70/h;->k(Lf70/h;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_9

    goto/16 :goto_c

    :cond_9
    :goto_6
    check-cast p2, Lf70/e;

    goto/16 :goto_b

    :cond_a
    instance-of p2, p1, Lf70/d$c0;

    if-eqz p2, :cond_c

    iget-object p2, p0, Lf70/h$b$a;->w:Lf70/h;

    invoke-static {p2}, Lf70/h;->g(Lf70/h;)Lg70/a;

    move-result-object p2

    iget-object v1, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    check-cast p1, Lf70/d$c0;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v7, Lf70/h$b$a$a;->E:I

    invoke-virtual {p2, v1, p1, v7}, Lg70/a;->a(Lf70/e;Lf70/d$c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_b

    goto/16 :goto_c

    :cond_b
    :goto_7
    check-cast p2, Lf70/e;

    goto/16 :goto_b

    :cond_c
    instance-of p2, p1, Lf70/d$x;

    if-eqz p2, :cond_e

    iget-object p2, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object v1, p0, Lf70/h$b$a;->x:Lec3/m;

    check-cast p1, Lf70/d$x;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, v7, Lf70/h$b$a$a;->E:I

    invoke-static {p2, v1, p1, v7}, Lf70/h;->i(Lf70/h;Lec3/m;Lf70/d$x;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_d

    goto/16 :goto_c

    :cond_d
    :goto_8
    check-cast p2, Lf70/e;

    goto/16 :goto_b

    :cond_e
    instance-of p2, p1, Lf70/d$f;

    if-eqz p2, :cond_f

    iget-object p2, p0, Lf70/h$b$a;->w:Lf70/h;

    invoke-static {p2}, Lf70/h;->e(Lf70/h;)Lh70/a;

    move-result-object p2

    iget-object v1, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    check-cast p1, Lf70/d$f;

    invoke-virtual {p1}, Lf70/d$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Lh70/a;->e(Lf70/e;Ljava/lang/String;)Lf70/e;

    move-result-object p2

    goto/16 :goto_b

    :cond_f
    instance-of p2, p1, Lf70/d$e;

    if-eqz p2, :cond_10

    iget-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    invoke-static {p1}, Lf70/h;->e(Lf70/h;)Lh70/a;

    move-result-object p1

    iget-object p2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lf70/e;

    invoke-virtual {p1, p2}, Lh70/a;->d(Lf70/e;)Lf70/e;

    move-result-object p2

    goto/16 :goto_b

    :cond_10
    instance-of p2, p1, Lf70/d$d;

    if-eqz p2, :cond_12

    iget-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    invoke-static {p1}, Lf70/h;->e(Lf70/h;)Lh70/a;

    move-result-object p1

    iget-object p2, p0, Lf70/h$b$a;->x:Lec3/m;

    iget-object v1, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, v7, Lf70/h$b$a$a;->E:I

    invoke-virtual {p1, p2, v1, v7}, Lh70/a;->c(Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_11

    goto/16 :goto_c

    :cond_11
    :goto_9
    check-cast p2, Lf70/e;

    goto :goto_b

    :cond_12
    instance-of p2, p1, Lf70/d$b;

    if-eqz p2, :cond_13

    iget-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object p2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lf70/e;

    invoke-static {p1, p2}, Lf70/h;->c(Lf70/h;Lf70/e;)Lf70/e;

    move-result-object p2

    goto :goto_b

    :cond_13
    instance-of p2, p1, Lf70/d$c;

    if-eqz p2, :cond_15

    iget-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object p2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lf70/e;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    const/16 v1, 0x9

    iput v1, v7, Lf70/h$b$a$a;->E:I

    invoke-static {p1, p2, v7}, Lf70/h;->d(Lf70/h;Lf70/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_14

    goto :goto_c

    :cond_14
    :goto_a
    check-cast p2, Lf70/e;

    goto :goto_b

    :cond_15
    instance-of p2, p1, Lf70/d$d0;

    if-eqz p2, :cond_16

    iget-object p2, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object v1, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lf70/e;

    check-cast p1, Lf70/d$d0;

    invoke-virtual {p1}, Lf70/d$d0;->a()Z

    move-result p1

    invoke-static {p2, v1, p1}, Lf70/h;->m(Lf70/h;Lf70/e;Z)Lf70/e;

    move-result-object p2

    goto :goto_b

    :cond_16
    instance-of p1, p1, Lf70/d$e0;

    if-eqz p1, :cond_18

    iget-object p1, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object p2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lf70/e;

    invoke-static {p1, p2}, Lf70/h;->n(Lf70/h;Lf70/e;)Lf70/e;

    move-result-object p2

    :goto_b
    iget-object p1, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lf70/h$b$a;->w:Lf70/h;

    iget-object v2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lf70/e;

    invoke-static {v1, p2, v2}, Lf70/h;->l(Lf70/h;Lf70/e;Lf70/e;)Lf70/e;

    move-result-object p2

    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lf70/h$b$a;->x:Lec3/m;

    iget-object p2, p0, Lf70/h$b$a;->y:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v8, v7, Lf70/h$b$a$a;->w:Ljava/lang/Object;

    iput-object v8, v7, Lf70/h$b$a$a;->x:Ljava/lang/Object;

    const/16 v1, 0xa

    iput v1, v7, Lf70/h$b$a$a;->E:I

    invoke-interface {p1, p2, v7}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_17

    :goto_c
    return-object v0

    :cond_17
    :goto_d
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_18
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf70/d;

    invoke-virtual {p0, p1, p2}, Lf70/h$b$a;->b(Lf70/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
