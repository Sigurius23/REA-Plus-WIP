.class public final Lup1/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lup1/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lup1/a;


# direct methods
.method public constructor <init>(Lec3/m;Lup1/a;)V
    .locals 0

    iput-object p1, p0, Lup1/a$a$a;->w:Lec3/m;

    iput-object p2, p0, Lup1/a$a$a;->x:Lup1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lup1/a$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lup1/a$a$a$a;

    iget v1, v0, Lup1/a$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lup1/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lup1/a$a$a$a;

    invoke-direct {v0, p0, p2}, Lup1/a$a$a$a;-><init>(Lup1/a$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lup1/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lup1/a$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lup1/a$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lup1/a$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lup1/a$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lup1/a$a$a;->w:Lec3/m;

    check-cast p1, Lqp1/b;

    invoke-virtual {p1}, Lqp1/b;->b()Lqp1/e;

    move-result-object v2

    instance-of v4, v2, Lqp1/e$b;

    if-eqz v4, :cond_3

    sget-object p1, Ltp1/o$b;->a:Ltp1/o$b;

    goto/16 :goto_2

    :cond_3
    sget-object v4, Lqp1/e$a;->a:Lqp1/e$a;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object p1, Ltp1/o$a;->a:Ltp1/o$a;

    goto/16 :goto_2

    :cond_4
    instance-of v4, v2, Lqp1/e$c;

    if-eqz v4, :cond_5

    sget-object p1, Ltp1/o$c;->a:Ltp1/o$c;

    goto/16 :goto_2

    :cond_5
    sget-object v4, Lqp1/e$d;->a:Lqp1/e$d;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object p1, Ltp1/o$d;->a:Ltp1/o$d;

    goto/16 :goto_2

    :cond_6
    sget-object v4, Lqp1/e$e;->a:Lqp1/e$e;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object p1, Ltp1/o$e;->a:Ltp1/o$e;

    goto :goto_2

    :cond_7
    instance-of v4, v2, Lqp1/e$f;

    if-eqz v4, :cond_f

    invoke-virtual {p1}, Lqp1/b;->a()Lqp1/a;

    move-result-object p1

    sget-object v4, Lqp1/a$d;->a:Lqp1/a$d;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object p1, Ltp1/o$e;->a:Ltp1/o$e;

    goto :goto_2

    :cond_8
    sget-object v4, Lqp1/a$c;->a:Lqp1/a$c;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object p1, Ltp1/o$d;->a:Ltp1/o$d;

    goto :goto_2

    :cond_9
    sget-object v4, Lqp1/a$b;->a:Lqp1/a$b;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object p1, Ltp1/o$c;->a:Ltp1/o$c;

    goto :goto_2

    :cond_a
    sget-object v4, Lqp1/a$a;->a:Lqp1/a$a;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    if-nez p1, :cond_b

    goto :goto_1

    :cond_b
    instance-of v4, p1, Lqp1/a$e;

    if-eqz v4, :cond_c

    iget-object v4, p0, Lup1/a$a$a;->x:Lup1/a;

    check-cast v2, Lqp1/e$f;

    invoke-virtual {v2}, Lqp1/e$f;->c()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    move-result-object v5

    invoke-virtual {v2}, Lqp1/e$f;->d()Z

    move-result v2

    check-cast p1, Lqp1/a$e;

    invoke-virtual {p1}, Lqp1/a$e;->a()Z

    move-result p1

    invoke-static {v4, v5, v2, p1}, Lup1/a;->a(Lup1/a;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZ)Ltp1/o;

    move-result-object p1

    goto :goto_2

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    :goto_1
    iget-object v4, p0, Lup1/a$a$a;->x:Lup1/a;

    check-cast v2, Lqp1/e$f;

    invoke-virtual {v2}, Lqp1/e$f;->c()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    move-result-object v5

    invoke-virtual {v2}, Lqp1/e$f;->d()Z

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lup1/a;->d(Lup1/a;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZILjava/lang/Object;)Ltp1/o;

    move-result-object p1

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Lup1/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lup1/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lup1/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lup1/a$a$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lup1/a$a$a$a;->H:I

    iput v3, v0, Lup1/a$a$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    return-object v1

    :cond_e
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
