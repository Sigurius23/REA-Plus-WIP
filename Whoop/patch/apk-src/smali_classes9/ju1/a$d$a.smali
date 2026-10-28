.class public final Lju1/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lju1/a$d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lfu1/d;

.field final synthetic y:Lju1/a;


# direct methods
.method public constructor <init>(Lec3/m;Lfu1/d;Lju1/a;)V
    .locals 0

    iput-object p1, p0, Lju1/a$d$a;->w:Lec3/m;

    iput-object p2, p0, Lju1/a$d$a;->x:Lfu1/d;

    iput-object p3, p0, Lju1/a$d$a;->y:Lju1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lju1/a$d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lju1/a$d$a$a;

    iget v1, v0, Lju1/a$d$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lju1/a$d$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lju1/a$d$a$a;

    invoke-direct {v0, p0, p2}, Lju1/a$d$a$a;-><init>(Lju1/a$d$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lju1/a$d$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lju1/a$d$a$a;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lju1/a$d$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lju1/a$d$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lju1/a$d$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lju1/a$d$a$a;->M:I

    iget-object v2, v0, Lju1/a$d$a$a;->L:Ljava/lang/Object;

    check-cast v2, Lju1/a;

    iget-object v2, v0, Lju1/a$d$a$a;->K:Ljava/lang/Object;

    check-cast v2, Lju1/a;

    iget-object v2, v0, Lju1/a$d$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lvk0/i;

    iget-object v2, v0, Lju1/a$d$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lju1/a$d$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lju1/a$d$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lju1/a$d$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lju1/a$d$a$a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p2

    goto/16 :goto_6

    :catch_1
    move-exception p1

    goto/16 :goto_b

    :cond_3
    iget p1, v0, Lju1/a$d$a$a;->M:I

    iget-object v2, v0, Lju1/a$d$a$a;->L:Ljava/lang/Object;

    check-cast v2, Lju1/a;

    iget-object v2, v0, Lju1/a$d$a$a;->K:Ljava/lang/Object;

    check-cast v2, Lju1/a;

    iget-object v2, v0, Lju1/a$d$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lvk0/i;

    iget-object v2, v0, Lju1/a$d$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lju1/a$d$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lju1/a$d$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lju1/a$d$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lju1/a$d$a$a;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    :catch_2
    move-exception p2

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lju1/a$d$a;->w:Lec3/m;

    check-cast p1, Lvk0/i;

    iget-object p2, p0, Lju1/a$d$a;->x:Lfu1/d;

    sget-object v7, Lfu1/d$a;->a:Lfu1/d$a;

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_8

    iget-object p2, p0, Lju1/a$d$a;->y:Lju1/a;

    :try_start_2
    sget-object v4, Lxj0/d1;->LEFT:Lxj0/d1;

    iput-object v6, v0, Lju1/a$d$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lju1/a$d$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->J:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->K:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->L:Ljava/lang/Object;

    iput v8, v0, Lju1/a$d$a$a;->M:I

    iput v8, v0, Lju1/a$d$a$a;->N:I

    iput v8, v0, Lju1/a$d$a$a;->O:I

    iput v8, v0, Lju1/a$d$a$a;->P:I

    iput v5, v0, Lju1/a$d$a$a;->x:I

    invoke-static {p2, v4, p1, v0}, Lju1/a;->e(Lju1/a;Lxj0/d1;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    if-ne p2, v1, :cond_5

    goto/16 :goto_9

    :cond_5
    move p1, v8

    :goto_1
    :try_start_3
    check-cast p2, Lfu1/a;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_8

    :catch_4
    move-exception p2

    move p1, v8

    :goto_2
    instance-of v4, p2, Lcom/whoop/labradorService/domain/exception/LabradorServiceException;

    if-eqz v4, :cond_6

    move-object v4, p2

    check-cast v4, Lcom/whoop/labradorService/domain/exception/LabradorServiceException;

    goto :goto_3

    :cond_6
    move-object v4, v6

    :goto_3
    if-eqz v4, :cond_7

    move-object p2, v4

    :cond_7
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    goto :goto_8

    :goto_4
    throw p1

    :cond_8
    sget-object v5, Lfu1/d$b;->a:Lfu1/d$b;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_d

    iget-object p2, p0, Lju1/a$d$a;->y:Lju1/a;

    :try_start_4
    sget-object v5, Lxj0/d1;->RIGHT:Lxj0/d1;

    iput-object v6, v0, Lju1/a$d$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lju1/a$d$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->J:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->K:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->L:Ljava/lang/Object;

    iput v8, v0, Lju1/a$d$a$a;->M:I

    iput v8, v0, Lju1/a$d$a$a;->N:I

    iput v8, v0, Lju1/a$d$a$a;->O:I

    iput v8, v0, Lju1/a$d$a$a;->P:I

    iput v4, v0, Lju1/a$d$a$a;->x:I

    invoke-static {p2, v5, p1, v0}, Lju1/a;->e(Lju1/a;Lxj0/d1;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    if-ne p2, v1, :cond_9

    goto :goto_9

    :cond_9
    move p1, v8

    :goto_5
    :try_start_5
    check-cast p2, Lfu1/a;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_8

    :catch_5
    move-exception p2

    move p1, v8

    :goto_6
    instance-of v4, p2, Lcom/whoop/labradorService/domain/exception/LabradorServiceException;

    if-eqz v4, :cond_a

    move-object v4, p2

    check-cast v4, Lcom/whoop/labradorService/domain/exception/LabradorServiceException;

    goto :goto_7

    :cond_a
    move-object v4, v6

    :goto_7
    if-eqz v4, :cond_b

    move-object p2, v4

    :cond_b
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_8
    new-instance v4, Ll83/n;

    invoke-direct {v4, p2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    iput-object v6, v0, Lju1/a$d$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->G:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->J:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->K:Ljava/lang/Object;

    iput-object v6, v0, Lju1/a$d$a$a;->L:Ljava/lang/Object;

    iput p1, v0, Lju1/a$d$a$a;->M:I

    iput v3, v0, Lju1/a$d$a$a;->x:I

    invoke-interface {v2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_9
    return-object v1

    :cond_c
    :goto_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_b
    throw p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
