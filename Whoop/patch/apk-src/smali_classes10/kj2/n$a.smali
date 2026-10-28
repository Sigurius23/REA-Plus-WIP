.class final Lkj2/n$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/n;->k(Lorg/joda/time/DateTime;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
        "Lnj2/r;",
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
    c = "com.whoop.stress.interactor.StressSessionInteractor$endAndSaveSession$2"
    f = "StressSessionInteractor.kt"
    l = {
        0x5e,
        0x61,
        0x72,
        0x79
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lorg/joda/time/DateTime;

.field final synthetic F:Lkj2/n;

.field final synthetic G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/BreathingEvent;",
            ">;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lorg/joda/time/DateTime;Lkj2/n;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            "Lkj2/n;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/BreathingEvent;",
            ">;",
            "Lq83/d<",
            "-",
            "Lkj2/n$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/n$a;->E:Lorg/joda/time/DateTime;

    iput-object p2, p0, Lkj2/n$a;->F:Lkj2/n;

    iput-object p3, p0, Lkj2/n$a;->G:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lkj2/n$a;

    iget-object v1, p0, Lkj2/n$a;->E:Lorg/joda/time/DateTime;

    iget-object v2, p0, Lkj2/n$a;->F:Lkj2/n;

    iget-object v3, p0, Lkj2/n$a;->G:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, p2}, Lkj2/n$a;-><init>(Lorg/joda/time/DateTime;Lkj2/n;Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Lkj2/n$a;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lkj2/n$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/n$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkj2/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkj2/n$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v5, p0

    iget-object v0, v5, Lkj2/n$a;->z:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lec3/m;

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lkj2/n$a;->y:I

    const/4 v13, 0x4

    const/4 v14, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v15, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v14, :cond_1

    if-ne v0, v13, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lkj2/n$a;->w:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_2
    iget v0, v5, Lkj2/n$a;->x:I

    iget-object v1, v5, Lkj2/n$a;->w:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v8, v0

    move-object/from16 v0, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lnj2/r$b;->a:Lnj2/r$b;

    iput-object v10, v5, Lkj2/n$a;->z:Ljava/lang/Object;

    iput v2, v5, Lkj2/n$a;->y:I

    invoke-interface {v10, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    iget-object v9, v5, Lkj2/n$a;->E:Lorg/joda/time/DateTime;

    if-eqz v9, :cond_8

    iget-object v7, v5, Lkj2/n$a;->F:Lkj2/n;

    iget-object v8, v5, Lkj2/n$a;->G:Ljava/util/List;

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    invoke-static {v7}, Lkj2/n;->e(Lkj2/n;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lkj2/n$a$a;

    const/4 v11, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Lkj2/n$a$a;-><init>(Lkj2/n;Ljava/util/List;Lorg/joda/time/DateTime;Lec3/m;Lq83/d;)V

    iput-object v10, v5, Lkj2/n$a;->z:Ljava/lang/Object;

    iput-object v15, v5, Lkj2/n$a;->w:Ljava/lang/Object;

    const/4 v8, 0x0

    iput v8, v5, Lkj2/n$a;->x:I

    iput v1, v5, Lkj2/n$a;->y:I

    move-object v1, v2

    const/4 v2, 0x0

    const-string v3, "endAndSubmitSession"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast v0, Lu02/a;

    new-instance v1, Lkj2/n$a$b;

    invoke-direct {v1, v10, v15}, Lkj2/n$a$b;-><init>(Lec3/m;Lq83/d;)V

    iput-object v10, v5, Lkj2/n$a;->z:Ljava/lang/Object;

    iput-object v15, v5, Lkj2/n$a;->w:Ljava/lang/Object;

    iput v8, v5, Lkj2/n$a;->x:I

    iput v14, v5, Lkj2/n$a;->y:I

    invoke-static {v0, v1, v5}, Lu02/b;->f(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast v0, Lu02/a;

    if-nez v0, :cond_9

    :cond_8
    sget-object v0, Lnj2/r$c;->a:Lnj2/r$c;

    iput-object v15, v5, Lkj2/n$a;->z:Ljava/lang/Object;

    iput-object v15, v5, Lkj2/n$a;->w:Ljava/lang/Object;

    iput v13, v5, Lkj2/n$a;->y:I

    invoke-interface {v10, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_9

    :goto_3
    return-object v12

    :cond_9
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
