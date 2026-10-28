.class public final Leq1/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leq1/a$d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Leq1/a;


# direct methods
.method public constructor <init>(Lec3/m;Leq1/a;)V
    .locals 0

    iput-object p1, p0, Leq1/a$d$a;->w:Lec3/m;

    iput-object p2, p0, Leq1/a$d$a;->x:Leq1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Leq1/a$d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Leq1/a$d$a$a;

    iget v1, v0, Leq1/a$d$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leq1/a$d$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Leq1/a$d$a$a;

    invoke-direct {v0, p0, p2}, Leq1/a$d$a$a;-><init>(Leq1/a$d$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Leq1/a$d$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Leq1/a$d$a$a;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Leq1/a$d$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Leq1/a$d$a$a;->E:Ljava/lang/Object;

    check-cast p1, Leq1/a$d$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Leq1/a$d$a$a;->K:I

    iget-object v2, v0, Leq1/a$d$a$a;->J:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v0, Leq1/a$d$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Leq1/a$d$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Leq1/a$d$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Leq1/a$d$a$a;->E:Ljava/lang/Object;

    check-cast v4, Leq1/a$d$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Leq1/a$d$a;->w:Lec3/m;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    const/4 v6, 0x0

    if-eqz p2, :cond_5

    iget-object p1, p0, Leq1/a$d$a;->x:Leq1/a;

    invoke-static {p1}, Leq1/a;->d(Leq1/a;)Ltr2/n;

    move-result-object p1

    const-string p2, "HrZones list is empty, making an api call and returning default zones"

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {p1, p2, v7}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Leq1/a$d$a;->x:Leq1/a;

    iput-object v5, v0, Leq1/a$d$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Leq1/a$d$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Leq1/a$d$a$a;->K:I

    iput v6, v0, Leq1/a$d$a$a;->L:I

    iput v6, v0, Leq1/a$d$a$a;->M:I

    iput v4, v0, Leq1/a$d$a$a;->x:I

    invoke-static {p1, v0}, Leq1/a;->a(Leq1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move p1, v6

    :goto_1
    iget-object p2, p0, Leq1/a$d$a;->x:Leq1/a;

    invoke-static {p2}, Leq1/a;->b(Leq1/a;)Ljava/util/List;

    move-result-object p2

    move v6, p1

    move-object p1, p2

    :cond_5
    iput-object v5, v0, Leq1/a$d$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Leq1/a$d$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Leq1/a$d$a$a;->K:I

    iput v3, v0, Leq1/a$d$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
