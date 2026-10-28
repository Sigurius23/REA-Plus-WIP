.class public final Lop1/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lop1/b$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lop1/b;


# direct methods
.method public constructor <init>(Lec3/m;Lop1/b;)V
    .locals 0

    iput-object p1, p0, Lop1/b$b$a;->w:Lec3/m;

    iput-object p2, p0, Lop1/b$b$a;->x:Lop1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lop1/b$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lop1/b$b$a$a;

    iget v1, v0, Lop1/b$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lop1/b$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lop1/b$b$a$a;

    invoke-direct {v0, p0, p2}, Lop1/b$b$a$a;-><init>(Lop1/b$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lop1/b$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lop1/b$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lop1/b$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lop1/b$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lop1/b$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lop1/b$b$a;->w:Lec3/m;

    check-cast p1, Lkp1/a;

    invoke-virtual {p1}, Lkp1/a;->a()Lkp1/d;

    move-result-object v2

    invoke-virtual {p1}, Lkp1/a;->b()Lkp1/f;

    move-result-object p1

    const-string v4, "null cannot be cast to non-null type com.whoop.hormonalinsights.pregnancyinsights.domain.PregnancyInsightsLocalStateAction.GraphSwitch"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkp1/f$a;

    instance-of v4, v2, Lkp1/d$d;

    if-eqz v4, :cond_3

    new-instance p1, Lnp1/j$d;

    check-cast v2, Lkp1/d$d;

    invoke-virtual {v2}, Lkp1/d$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lnp1/j$d;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    sget-object v4, Lkp1/d$f;->a:Lkp1/d$f;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object p1, Lnp1/j$f;->a:Lnp1/j$f;

    goto :goto_1

    :cond_4
    instance-of v4, v2, Lkp1/d$g;

    if-eqz v4, :cond_5

    iget-object v4, p0, Lop1/b$b$a;->x:Lop1/b;

    check-cast v2, Lkp1/d$g;

    invoke-virtual {v2}, Lkp1/d$g;->a()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    move-result-object v2

    invoke-static {v4, v2, p1}, Lop1/b;->e(Lop1/b;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lkp1/f$a;)Lnp1/j;

    move-result-object p1

    goto :goto_1

    :cond_5
    sget-object v4, Lkp1/d$c;->a:Lkp1/d$c;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object p1, Lnp1/j$c;->a:Lnp1/j$c;

    goto :goto_1

    :cond_6
    sget-object v4, Lkp1/d$b;->a:Lkp1/d$b;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object p1, Lnp1/j$b;->a:Lnp1/j$b;

    goto :goto_1

    :cond_7
    instance-of v4, v2, Lkp1/d$a;

    if-eqz v4, :cond_8

    new-instance p1, Lnp1/j$a;

    check-cast v2, Lkp1/d$a;

    invoke-virtual {v2}, Lkp1/d$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lnp1/j$a;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    instance-of v4, v2, Lkp1/d$h;

    if-eqz v4, :cond_9

    iget-object v4, p0, Lop1/b$b$a;->x:Lop1/b;

    check-cast v2, Lkp1/d$h;

    invoke-virtual {v2}, Lkp1/d$h;->a()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    move-result-object v2

    invoke-static {v4, v2, p1}, Lop1/b;->e(Lop1/b;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lkp1/f$a;)Lnp1/j;

    move-result-object p1

    goto :goto_1

    :cond_9
    instance-of p1, v2, Lkp1/d$e;

    if-eqz p1, :cond_b

    new-instance p1, Lnp1/j$e;

    check-cast v2, Lkp1/d$e;

    invoke-virtual {v2}, Lkp1/d$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lnp1/j$e;-><init>(Ljava/lang/String;)V

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, Lop1/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lop1/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lop1/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lop1/b$b$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lop1/b$b$a$a;->H:I

    iput v3, v0, Lop1/b$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
