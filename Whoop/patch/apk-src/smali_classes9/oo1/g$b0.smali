.class final Loo1/g$b0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->C(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Loo1/g$a;",
        "accumulator",
        "Loo1/e;",
        "domainAction",
        "<anonymous>",
        "(Loo1/g$a;Loo1/e;)Loo1/g$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$saveDateForRefresh$1"
    f = "MciOverviewInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Loo1/g;


# direct methods
.method public constructor <init>(Loo1/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Lq83/d<",
            "-",
            "Loo1/g$b0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$b0;->z:Loo1/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Loo1/g$a;Loo1/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g$a;",
            "Loo1/e;",
            "Lq83/d<",
            "-",
            "Loo1/g$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Loo1/g$b0;

    iget-object v1, p0, Loo1/g$b0;->z:Loo1/g;

    invoke-direct {v0, v1, p3}, Loo1/g$b0;-><init>(Loo1/g;Lq83/d;)V

    iput-object p1, v0, Loo1/g$b0;->x:Ljava/lang/Object;

    iput-object p2, v0, Loo1/g$b0;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Loo1/g$b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loo1/g$a;

    check-cast p2, Loo1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Loo1/g$b0;->f(Loo1/g$a;Loo1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Loo1/g$b0;->x:Ljava/lang/Object;

    check-cast v0, Loo1/g$a;

    iget-object v1, p0, Loo1/g$b0;->y:Ljava/lang/Object;

    check-cast v1, Loo1/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Loo1/g$b0;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Loo1/g$a;

    instance-of v2, v1, Loo1/e$k;

    if-eqz v2, :cond_0

    new-instance v2, Loo1/e$e;

    invoke-virtual {v0}, Loo1/g$a;->b()Ljava/lang/String;

    move-result-object v3

    move-object v4, v1

    check-cast v4, Loo1/e$k;

    invoke-virtual {v4}, Loo1/e$k;->a()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Loo1/e$e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    goto :goto_0

    :cond_0
    instance-of v2, v1, Loo1/e$d;

    if-eqz v2, :cond_1

    move-object v3, v1

    check-cast v3, Loo1/e$d;

    invoke-virtual {v0}, Loo1/g$a;->b()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Loo1/e$d;->b(Loo1/e$d;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Loo1/e$d;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    instance-of v3, v1, Loo1/e$e;

    if-eqz v3, :cond_2

    iget-object v0, p0, Loo1/g$b0;->z:Loo1/g;

    check-cast v1, Loo1/e$e;

    invoke-static {v0, v1}, Loo1/g;->o(Loo1/g;Loo1/e$e;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Loo1/g$a;->b()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {p1, v2, v0}, Loo1/g$a;-><init>(Loo1/e;Ljava/lang/String;)V

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
