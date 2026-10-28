.class final Loo1/g$u;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->y(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Loo1/g$d;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$loadCalendar$1"
    f = "MciOverviewInteractor.kt"
    l = {
        0x18b,
        0x18f,
        0x190
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/Integer;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Loo1/g;


# direct methods
.method public constructor <init>(Loo1/g;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Loo1/g$u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$u;->z:Loo1/g;

    iput-object p2, p0, Loo1/g$u;->E:Ljava/lang/Integer;

    iput-object p3, p0, Loo1/g$u;->F:Ljava/lang/String;

    iput-object p4, p0, Loo1/g$u;->G:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Loo1/g$u;

    iget-object v1, p0, Loo1/g$u;->z:Loo1/g;

    iget-object v2, p0, Loo1/g$u;->E:Ljava/lang/Integer;

    iget-object v3, p0, Loo1/g$u;->F:Ljava/lang/String;

    iget-object v4, p0, Loo1/g$u;->G:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Loo1/g$u;-><init>(Loo1/g;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Loo1/g$u;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loo1/g$u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loo1/g$u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loo1/g$u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loo1/g$u;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Loo1/g$u;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Loo1/g$u;->x:I

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v1, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Loo1/g$u;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Loo1/g$u;->z:Loo1/g;

    invoke-static {v2}, Loo1/g;->j(Loo1/g;)Ltr2/n;

    move-result-object v2

    new-instance v4, Loo1/g$u$a;

    iget-object v3, p0, Loo1/g$u;->z:Loo1/g;

    iget-object v6, p0, Loo1/g$u;->F:Ljava/lang/String;

    iget-object v7, p0, Loo1/g$u;->G:Ljava/lang/String;

    invoke-direct {v4, v3, v6, v7, v12}, Loo1/g$u$a;-><init>(Loo1/g;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object v8, p0, Loo1/g$u;->y:Ljava/lang/Object;

    iput v1, p0, Loo1/g$u;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_5

    new-instance v1, Loo1/g$d$e;

    iget-object v2, p0, Loo1/g$u;->E:Ljava/lang/Integer;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;

    iget-object v3, p0, Loo1/g$u;->F:Ljava/lang/String;

    invoke-direct {v1, v2, v0, v3}, Loo1/g$d$e;-><init>(Ljava/lang/Integer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;Ljava/lang/String;)V

    iput-object v12, p0, Loo1/g$u;->y:Ljava/lang/Object;

    iput-object v12, p0, Loo1/g$u;->w:Ljava/lang/Object;

    iput v11, p0, Loo1/g$u;->x:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_2

    :cond_5
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_7

    new-instance v0, Loo1/g$d$a;

    new-instance v1, Loo1/f$a;

    const-string v2, "Fetching menstrual cycle insights calendar failed with unknown error"

    iget-object v3, p0, Loo1/g$u;->F:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Loo1/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Loo1/g$d$a;-><init>(Loo1/f;)V

    iput-object v12, p0, Loo1/g$u;->y:Ljava/lang/Object;

    iput-object v12, p0, Loo1/g$u;->w:Ljava/lang/Object;

    iput v10, p0, Loo1/g$u;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    :goto_2
    return-object v9

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
