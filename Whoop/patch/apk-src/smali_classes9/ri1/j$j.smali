.class final Lri1/j$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lri1/j;->interact(Lec3/l;)Lec3/l;
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
        "Lri1/h;",
        "previousState",
        "Lri1/d;",
        "action",
        "<anonymous>",
        "(Lri1/h;Lri1/d;)Lri1/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.health.domain.HealthTabInteractor$interact$2"
    f = "HealthTabInteractor.kt"
    l = {
        0x69
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lri1/j;


# direct methods
.method public constructor <init>(Lri1/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri1/j;",
            "Lq83/d<",
            "-",
            "Lri1/j$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lri1/j$j;->z:Lri1/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lri1/h;Lri1/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri1/h;",
            "Lri1/d;",
            "Lq83/d<",
            "-",
            "Lri1/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lri1/j$j;

    iget-object v1, p0, Lri1/j$j;->z:Lri1/j;

    invoke-direct {v0, v1, p3}, Lri1/j$j;-><init>(Lri1/j;Lq83/d;)V

    iput-object p1, v0, Lri1/j$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Lri1/j$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lri1/j$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lri1/h;

    check-cast p2, Lri1/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lri1/j$j;->f(Lri1/h;Lri1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lri1/j$j;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lri1/h;

    iget-object v0, p0, Lri1/j$j;->y:Ljava/lang/Object;

    check-cast v0, Lri1/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lri1/j$j;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lri1/f;

    if-eqz p1, :cond_3

    check-cast v0, Lri1/f;

    invoke-virtual {v0}, Lri1/f;->a()Lri1/h;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    return-object p1

    :cond_3
    instance-of p1, v0, Lri1/a;

    if-eqz p1, :cond_4

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lri1/h;->b(Lri1/h;Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILjava/lang/Object;)Lri1/h;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lri1/e;

    if-eqz p1, :cond_5

    sget-object v2, Lri1/g$a;->a:Lri1/g$a;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lri1/h;->b(Lri1/h;Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILjava/lang/Object;)Lri1/h;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lri1/c;

    if-eqz p1, :cond_6

    const/16 v8, 0x33

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lri1/h;->b(Lri1/h;Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILjava/lang/Object;)Lri1/h;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lri1/b;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lri1/j$j;->z:Lri1/j;

    check-cast v0, Lri1/b;

    invoke-virtual {v0}, Lri1/b;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    iput-object v3, p0, Lri1/j$j;->x:Ljava/lang/Object;

    iput-object v3, p0, Lri1/j$j;->y:Ljava/lang/Object;

    iput v4, p0, Lri1/j$j;->w:I

    invoke-static {p1, v1, v0, p0}, Lri1/j;->c(Lri1/j;Lri1/h;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    return-object v2

    :cond_7
    :goto_0
    check-cast p1, Lri1/h;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
