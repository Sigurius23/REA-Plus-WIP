.class final Lkj2/k$h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lnj2/l$e;",
        "<anonymous>",
        "()Lnj2/l$e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshState$2$result$1"
    f = "StressMonitorInteractor.kt"
    l = {
        0xbc,
        0xbd,
        0xc0,
        0xc4
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field H:I

.field final synthetic I:Lkj2/k;

.field final synthetic J:Ljava/lang/String;

.field final synthetic K:Z

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkj2/k;Ljava/lang/String;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/k;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lkj2/k$h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/k$h$a;->I:Lkj2/k;

    iput-object p2, p0, Lkj2/k$h$a;->J:Ljava/lang/String;

    iput-boolean p3, p0, Lkj2/k$h$a;->K:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lkj2/k$h$a;

    iget-object v1, p0, Lkj2/k$h$a;->I:Lkj2/k;

    iget-object v2, p0, Lkj2/k$h$a;->J:Ljava/lang/String;

    iget-boolean v3, p0, Lkj2/k$h$a;->K:Z

    invoke-direct {v0, v1, v2, v3, p1}, Lkj2/k$h$a;-><init>(Lkj2/k;Ljava/lang/String;ZLq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lkj2/k$h$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lnj2/l$e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lkj2/k$h$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/k$h$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lkj2/k$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkj2/k$h$a;->H:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget v0, p0, Lkj2/k$h$a;->F:I

    iget-object v1, p0, Lkj2/k$h$a;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/educationModels/FeatureEducationDto;

    iget-object v2, p0, Lkj2/k$h$a;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/stress/domain/model/StressMonitorDto;

    iget-object v3, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    check-cast v3, Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lkj2/k$h$a;->E:I

    iget-object v3, p0, Lkj2/k$h$a;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/stress/domain/model/StressMonitorDto;

    iget-object v4, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    check-cast v4, Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget v1, p0, Lkj2/k$h$a;->E:I

    iget-object v4, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    check-cast v4, Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget v1, p0, Lkj2/k$h$a;->E:I

    iget-object v4, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    check-cast v4, Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p1, "yyyy-MM-dd"

    invoke-static {p1}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p1

    iget-object v1, p0, Lkj2/k$h$a;->I:Lkj2/k;

    invoke-static {v1}, Lkj2/k;->d(Lkj2/k;)Lzr2/a;

    move-result-object v1

    invoke-interface {v1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lkj2/k$h$a;->J:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    move v1, v6

    goto :goto_0

    :cond_5
    move v1, v5

    :goto_0
    const-string p1, "<get-TIME_STAMP_ON_SYNC>(...)"

    if-eqz v1, :cond_7

    iget-object v4, p0, Lkj2/k$h$a;->I:Lkj2/k;

    invoke-static {v4}, Lkj2/k;->c(Lkj2/k;)Lcom/whoop/stress/domain/StressMonitorApi;

    move-result-object v4

    iget-object v8, p0, Lkj2/k$h$a;->J:Ljava/lang/String;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {}, Lkj2/l;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    iput v1, p0, Lkj2/k$h$a;->E:I

    iput v6, p0, Lkj2/k$h$a;->H:I

    invoke-interface {v4, v8, v9, p0}, Lcom/whoop/stress/domain/StressMonitorApi;->getStressMonitorOnSpecificDate(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto/16 :goto_6

    :cond_6
    :goto_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressMonitorDto;

    goto :goto_3

    :cond_7
    iget-object v8, p0, Lkj2/k$h$a;->I:Lkj2/k;

    invoke-static {v8}, Lkj2/k;->c(Lkj2/k;)Lcom/whoop/stress/domain/StressMonitorApi;

    move-result-object v8

    invoke-static {}, Lkj2/l;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    iput v1, p0, Lkj2/k$h$a;->E:I

    iput v4, p0, Lkj2/k$h$a;->H:I

    invoke-interface {v8, v9, p0}, Lcom/whoop/stress/domain/StressMonitorApi;->getStressMonitor(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_6

    :cond_8
    :goto_2
    check-cast p1, Lcom/whoop/stress/domain/model/StressMonitorDto;

    :goto_3
    iget-object v4, p0, Lkj2/k$h$a;->I:Lkj2/k;

    invoke-static {v4}, Lkj2/k;->c(Lkj2/k;)Lcom/whoop/stress/domain/StressMonitorApi;

    move-result-object v4

    iput-object v7, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    iput-object p1, p0, Lkj2/k$h$a;->y:Ljava/lang/Object;

    iput v1, p0, Lkj2/k$h$a;->E:I

    iput v3, p0, Lkj2/k$h$a;->H:I

    invoke-interface {v4, p0}, Lcom/whoop/stress/domain/StressMonitorApi;->getStressEducation(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_9

    goto :goto_6

    :cond_9
    move-object v11, v3

    move-object v3, p1

    move-object p1, v11

    :goto_4
    check-cast p1, Lcom/whoop/educationModels/FeatureEducationDto;

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressMonitorDto;->getLoadingData()Lcom/whoop/stress/domain/model/LoadingData;

    move-result-object v4

    if-eqz v4, :cond_a

    iget-boolean v4, p0, Lkj2/k$h$a;->K:Z

    if-eqz v4, :cond_a

    move v4, v6

    goto :goto_5

    :cond_a
    move v4, v5

    :goto_5
    if-eqz v4, :cond_c

    iget-object v8, p0, Lkj2/k$h$a;->I:Lkj2/k;

    invoke-static {v8}, Lkj2/k;->e(Lkj2/k;)Lcom/whoop/data/interactor/ExportedMetricsInteractor;

    move-result-object v8

    new-instance v9, Lcom/whoop/data/interactor/ExportedMetricsAction$StartForcedSync;

    const/16 v10, 0x21c

    invoke-direct {v9, v10}, Lcom/whoop/data/interactor/ExportedMetricsAction$StartForcedSync;-><init>(I)V

    iput-object v7, p0, Lkj2/k$h$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lkj2/k$h$a;->x:Ljava/lang/Object;

    iput-object v3, p0, Lkj2/k$h$a;->y:Ljava/lang/Object;

    iput-object p1, p0, Lkj2/k$h$a;->z:Ljava/lang/Object;

    iput v1, p0, Lkj2/k$h$a;->E:I

    iput v4, p0, Lkj2/k$h$a;->F:I

    iput v10, p0, Lkj2/k$h$a;->G:I

    iput v2, p0, Lkj2/k$h$a;->H:I

    invoke-virtual {v8, v9, p0}, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->sendAction(Lcom/whoop/data/interactor/ExportedMetricsAction;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_b

    :goto_6
    return-object v0

    :cond_b
    move-object v1, p1

    move-object v2, v3

    move v0, v4

    :goto_7
    move v4, v0

    move-object p1, v1

    move-object v3, v2

    :cond_c
    iget-object v0, p0, Lkj2/k$h$a;->I:Lkj2/k;

    if-eqz v4, :cond_d

    move v5, v6

    :cond_d
    invoke-static {v0, v3, p1, v5}, Lkj2/k;->q(Lkj2/k;Lcom/whoop/stress/domain/model/StressMonitorDto;Lcom/whoop/educationModels/FeatureEducationDto;Z)Lnj2/l$e;

    move-result-object p1

    return-object p1
.end method
