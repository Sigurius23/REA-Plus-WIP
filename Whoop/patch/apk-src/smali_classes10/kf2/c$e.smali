.class final Lkf2/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf2/c;-><init>(Lze2/h;Lkf2/e;Li92/e;Lwe2/b;Lbc3/c0;)V
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
        "Lze2/g;",
        "domainState",
        "Li92/h;",
        "network",
        "<anonymous>",
        "(Lze2/g;Li92/h;)Lze2/g;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sleep.coach.presentation.scheduleList.SleepScheduleListViewModel$viewState$3"
    f = "SleepScheduleListViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lkf2/c$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lze2/g;Li92/h;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze2/g;",
            "Li92/h;",
            "Lq83/d<",
            "-",
            "Lze2/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkf2/c$e;

    invoke-direct {v0, p3}, Lkf2/c$e;-><init>(Lq83/d;)V

    iput-object p1, v0, Lkf2/c$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkf2/c$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkf2/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lze2/g;

    check-cast p2, Li92/h;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkf2/c$e;->f(Lze2/g;Li92/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lkf2/c$e;->x:Ljava/lang/Object;

    check-cast v0, Lze2/g;

    iget-object v1, p0, Lkf2/c$e;->y:Ljava/lang/Object;

    check-cast v1, Li92/h;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkf2/c$e;->w:I

    if-nez v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Li92/h;->a()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lze2/g$b;->a:Lze2/g$b;

    return-object p1

    :cond_0
    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
