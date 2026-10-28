.class public final Ltc0/c$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltc0/c$d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Ltc0/c;


# direct methods
.method public constructor <init>(Lec3/m;Ltc0/c;)V
    .locals 0

    iput-object p1, p0, Ltc0/c$d$a;->w:Lec3/m;

    iput-object p2, p0, Ltc0/c$d$a;->x:Ltc0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Ltc0/c$d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltc0/c$d$a$a;

    iget v1, v0, Ltc0/c$d$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltc0/c$d$a$a;->x:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ltc0/c$d$a$a;

    invoke-direct {v0, p0, p2}, Ltc0/c$d$a$a;-><init>(Ltc0/c$d$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ltc0/c$d$a$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ltc0/c$d$a$a;->x:I

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Ltc0/c$d$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v6, Ltc0/c$d$a$a;->E:Ljava/lang/Object;

    check-cast p1, Ltc0/c$d$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v6, Ltc0/c$d$a$a;->K:I

    iget-object v1, v6, Ltc0/c$d$a$a;->J:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v6, Ltc0/c$d$a$a;->I:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, v6, Ltc0/c$d$a$a;->H:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v6, Ltc0/c$d$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v6, Ltc0/c$d$a$a;->E:Ljava/lang/Object;

    check-cast v2, Ltc0/c$d$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ltc0/c$d$a;->w:Lec3/m;

    check-cast p1, Ljava/lang/String;

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Ltc0/c$d$a;->x:Ltc0/c;

    invoke-static {v3}, Ltc0/c;->e(Ltc0/c;)Ltr2/n;

    move-result-object v3

    new-instance v5, Ltc0/c$e;

    iget-object v4, p0, Ltc0/c$d$a;->x:Ltc0/c;

    invoke-direct {v5, v4, p1, v10}, Ltc0/c$e;-><init>(Ltc0/c;Ljava/lang/String;Lq83/d;)V

    iput-object v10, v6, Ltc0/c$d$a$a;->y:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->E:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->F:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->G:Ljava/lang/Object;

    iput-object p2, v6, Ltc0/c$d$a$a;->H:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->I:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->J:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v6, Ltc0/c$d$a$a;->K:I

    iput p1, v6, Ltc0/c$d$a$a;->L:I

    iput v2, v6, Ltc0/c$d$a$a;->x:I

    move-object v2, v3

    const/4 v3, 0x0

    const-string v4, "Failed to fetch insights deep dive"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    goto :goto_4

    :cond_4
    move-object v11, v1

    move-object v1, p2

    move-object p2, v11

    :goto_2
    check-cast p2, Lu02/a;

    instance-of v2, p2, Lu02/a$c;

    if-eqz v2, :cond_5

    new-instance v2, Ltc0/b$d;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    invoke-direct {v2, p2}, Ltc0/b$d;-><init>(Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;)V

    goto :goto_3

    :cond_5
    instance-of p2, p2, Lu02/a$b;

    if-eqz p2, :cond_7

    sget-object v2, Ltc0/b$a;->a:Ltc0/b$a;

    :goto_3
    iput-object v10, v6, Ltc0/c$d$a$a;->y:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->E:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->F:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->G:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->H:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->I:Ljava/lang/Object;

    iput-object v10, v6, Ltc0/c$d$a$a;->J:Ljava/lang/Object;

    iput p1, v6, Ltc0/c$d$a$a;->K:I

    iput v9, v6, Ltc0/c$d$a$a;->x:I

    invoke-interface {v1, v2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_4
    return-object v0

    :cond_6
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
