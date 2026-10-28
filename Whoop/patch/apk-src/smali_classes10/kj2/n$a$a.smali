.class final Lkj2/n$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressSessionInteractor$endAndSaveSession$2$1$1"
    f = "StressSessionInteractor.kt"
    l = {
        0x64,
        0x71
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lorg/joda/time/DateTime;

.field final synthetic F:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lkj2/n;

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/BreathingEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkj2/n;Ljava/util/List;Lorg/joda/time/DateTime;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/n;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/BreathingEvent;",
            ">;",
            "Lorg/joda/time/DateTime;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lkj2/n$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/n$a$a;->y:Lkj2/n;

    iput-object p2, p0, Lkj2/n$a$a;->z:Ljava/util/List;

    iput-object p3, p0, Lkj2/n$a$a;->E:Lorg/joda/time/DateTime;

    iput-object p4, p0, Lkj2/n$a$a;->F:Lec3/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkj2/n$a$a;

    iget-object v1, p0, Lkj2/n$a$a;->y:Lkj2/n;

    iget-object v2, p0, Lkj2/n$a$a;->z:Ljava/util/List;

    iget-object v3, p0, Lkj2/n$a$a;->E:Lorg/joda/time/DateTime;

    iget-object v4, p0, Lkj2/n$a$a;->F:Lec3/m;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lkj2/n$a$a;-><init>(Lkj2/n;Ljava/util/List;Lorg/joda/time/DateTime;Lec3/m;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lkj2/n$a$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lkj2/n$a$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/n$a$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lkj2/n$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkj2/n$a$a;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lkj2/n$a$a;->w:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lkj2/n$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj2/n$a$a;->y:Lkj2/n;

    invoke-static {p1}, Lkj2/n;->d(Lkj2/n;)Lzr2/a;

    move-result-object p1

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v7

    iget-object p1, p0, Lkj2/n$a$a;->y:Lkj2/n;

    invoke-static {p1}, Lkj2/n;->c(Lkj2/n;)Lcom/whoop/stress/domain/StressMonitorApi;

    move-result-object p1

    new-instance v1, Lcom/whoop/stress/domain/StressInterventionSessionData;

    iget-object v5, p0, Lkj2/n$a$a;->z:Ljava/util/List;

    invoke-static {v5, v7}, Loj2/b;->a(Ljava/util/List;Lorg/joda/time/DateTime;)Ljava/util/List;

    move-result-object v12

    new-instance v5, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-object v6, p0, Lkj2/n$a$a;->E:Lorg/joda/time/DateTime;

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getDuring()Ljava/lang/String;

    move-result-object v10

    iget-object v5, p0, Lkj2/n$a$a;->y:Lkj2/n;

    invoke-static {v5}, Lkj2/n;->f(Lkj2/n;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lkj2/n$a$a;->y:Lkj2/n;

    invoke-static {v6}, Lkj2/n;->d(Lkj2/n;)Lzr2/a;

    move-result-object v6

    invoke-interface {v6}, Lzr2/a;->e()Lorg/joda/time/DateTimeZone;

    move-result-object v6

    invoke-virtual {v6}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v13

    const-string v6, "getID(...)"

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "USER"

    move-object v8, v1

    move-object v9, v12

    move-object v12, v5

    invoke-direct/range {v8 .. v13}, Lcom/whoop/stress/domain/StressInterventionSessionData;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, p0, Lkj2/n$a$a;->w:Ljava/lang/Object;

    iput v4, p0, Lkj2/n$a$a;->x:I

    invoke-interface {p1, v8, p0}, Lcom/whoop/stress/domain/StressMonitorApi;->submitSession(Lcom/whoop/stress/domain/StressInterventionSessionData;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lkj2/n$a$a;->y:Lkj2/n;

    invoke-static {p1}, Lkj2/n;->g(Lkj2/n;)Lu92/d;

    move-result-object p1

    const-string v1, "START_ACTIVITY_COMPLETED"

    invoke-virtual {p1, v1, v4}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object p1, p0, Lkj2/n$a$a;->F:Lec3/m;

    sget-object v1, Lnj2/r$a;->a:Lnj2/r$a;

    iput-object v2, p0, Lkj2/n$a$a;->w:Ljava/lang/Object;

    iput v3, p0, Lkj2/n$a$a;->x:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
