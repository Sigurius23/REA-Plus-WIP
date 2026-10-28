.class final Lag1/c$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lag1/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lag1/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lag1/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lag1/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lag1/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lag1/c$h$a;->x:Lag1/c;

    iput-object p3, p0, Lag1/c$h$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lag1/a;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lag1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lag1/c$h$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lag1/c$h$a$a;

    iget v1, v0, Lag1/c$h$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lag1/c$h$a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lag1/c$h$a$a;

    invoke-direct {v0, p0, p2}, Lag1/c$h$a$a;-><init>(Lag1/c$h$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lag1/c$h$a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lag1/c$h$a$a;->E:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lag1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1
    iget-object p1, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lag1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object p1, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lag1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_3
    iget-object p1, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lag1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-object p1, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lag1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    iget-object p1, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lag1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lag1/c$h$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v2, p1, Lag1/a$b;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lag1/c$h$a;->x:Lag1/c;

    iget-object v4, p0, Lag1/c$h$a;->y:Lec3/m;

    check-cast p1, Lag1/a$b;

    invoke-virtual {p1}, Lag1/a$b;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v5, p0, Lag1/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Lag1/b;

    iput-object v3, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v0, Lag1/c$h$a$a;->E:I

    invoke-static {v2, v4, p1, v5, v0}, Lag1/c;->e(Lag1/c;Lec3/m;Ljava/lang/String;Lag1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_8

    :cond_1
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_1
    check-cast p2, Lag1/b;

    :goto_2
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto/16 :goto_7

    :cond_2
    instance-of v2, p1, Lag1/a$f;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lag1/c$h$a;->x:Lag1/c;

    iget-object v4, p0, Lag1/c$h$a;->y:Lec3/m;

    check-cast p1, Lag1/a$f;

    invoke-virtual {p1}, Lag1/a$f;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    iget-object v5, p0, Lag1/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Lag1/b;

    iput-object v3, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v0, Lag1/c$h$a$a;->E:I

    invoke-static {v2, v4, p1, v5, v0}, Lag1/c;->h(Lag1/c;Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lag1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_8

    :cond_3
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    check-cast p2, Lag1/b;

    goto :goto_2

    :cond_4
    instance-of v2, p1, Lag1/a$d;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lag1/c$h$a;->x:Lag1/c;

    iget-object v4, p0, Lag1/c$h$a;->y:Lec3/m;

    check-cast p1, Lag1/a$d;

    invoke-virtual {p1}, Lag1/a$d;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    iget-object v5, p0, Lag1/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Lag1/b;

    iput-object v3, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v0, Lag1/c$h$a$a;->E:I

    invoke-static {v2, v4, p1, v5, v0}, Lag1/c;->c(Lag1/c;Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lag1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_8

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_4
    check-cast p2, Lag1/b;

    goto :goto_2

    :cond_6
    instance-of v2, p1, Lag1/a$e;

    if-eqz v2, :cond_8

    iget-object p1, p0, Lag1/c$h$a;->x:Lag1/c;

    iget-object v2, p0, Lag1/c$h$a;->y:Lec3/m;

    iget-object v4, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lag1/b;

    iput-object v3, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    const/4 v5, 0x4

    iput v5, v0, Lag1/c$h$a$a;->E:I

    invoke-static {p1, v2, v4, v0}, Lag1/c;->g(Lag1/c;Lec3/m;Lag1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_8

    :cond_7
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_5
    check-cast p2, Lag1/b;

    goto :goto_2

    :cond_8
    instance-of v2, p1, Lag1/a$a;

    if-eqz v2, :cond_9

    iget-object p1, p0, Lag1/c$h$a;->x:Lag1/c;

    iget-object v2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lag1/b;

    invoke-static {p1, v2}, Lag1/c;->b(Lag1/c;Lag1/b;)Lag1/b;

    move-result-object p1

    goto :goto_7

    :cond_9
    instance-of p1, p1, Lag1/a$c;

    if-eqz p1, :cond_c

    iget-object p1, p0, Lag1/c$h$a;->x:Lag1/c;

    iget-object v2, p0, Lag1/c$h$a;->y:Lec3/m;

    iget-object v4, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lag1/b;

    iput-object v3, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v0, Lag1/c$h$a$a;->E:I

    invoke-static {p1, v2, v4, v0}, Lag1/c;->f(Lag1/c;Lec3/m;Lag1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_8

    :cond_a
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_6
    check-cast p2, Lag1/b;

    goto/16 :goto_2

    :goto_7
    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lag1/c$h$a;->y:Lec3/m;

    iget-object p2, p0, Lag1/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v3, v0, Lag1/c$h$a$a;->w:Ljava/lang/Object;

    iput-object v3, v0, Lag1/c$h$a$a;->x:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v0, Lag1/c$h$a$a;->E:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_8
    return-object v1

    :cond_b
    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
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

    check-cast p1, Lag1/a;

    invoke-virtual {p0, p1, p2}, Lag1/c$h$a;->b(Lag1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
