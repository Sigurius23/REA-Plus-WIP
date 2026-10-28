.class final Ldt1/h$r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->C(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;
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
        "Ldt1/b;",
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
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$updateSymptomsAndNotesForExistingReading$1"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0xe4,
        0xe5,
        0xe7,
        0xee,
        0xef,
        0xf0,
        0xf1,
        0xfc
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldt1/h;

.field final synthetic F:Ljava/time/Instant;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic I:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldt1/h;Ljava/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/h;",
            "Ljava/time/Instant;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ldt1/h$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$r;->E:Ldt1/h;

    iput-object p2, p0, Ldt1/h$r;->F:Ljava/time/Instant;

    iput-object p3, p0, Ldt1/h$r;->G:Ljava/lang/String;

    iput-object p4, p0, Ldt1/h$r;->H:Ljava/util/List;

    iput-object p5, p0, Ldt1/h$r;->I:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Ldt1/h$r;

    iget-object v1, p0, Ldt1/h$r;->E:Ldt1/h;

    iget-object v2, p0, Ldt1/h$r;->F:Ljava/time/Instant;

    iget-object v3, p0, Ldt1/h$r;->G:Ljava/lang/String;

    iget-object v4, p0, Ldt1/h$r;->H:Ljava/util/List;

    iget-object v5, p0, Ldt1/h$r;->I:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ldt1/h$r;-><init>(Ldt1/h;Ljava/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Ldt1/h$r;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ldt1/h$r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/h$r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/h$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/h$r;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v5, p0

    iget-object v0, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lec3/m;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v5, Ldt1/h$r;->y:I

    const/4 v8, 0x1

    const/4 v9, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget-object v0, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object v0, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget-object v0, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object v0, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ldt1/b$m;->a:Ldt1/b$m;

    iput-object v6, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    iput v8, v5, Ldt1/h$r;->y:I

    invoke-interface {v6, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_0
    iget-object v0, v5, Ldt1/h$r;->E:Ldt1/h;

    invoke-static {v0}, Ldt1/h;->h(Ldt1/h;)Lqk1/b;

    move-result-object v0

    iget-object v1, v5, Ldt1/h$r;->F:Ljava/time/Instant;

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    iput-object v6, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v5, Ldt1/h$r;->y:I

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3, v5}, Lqk1/b;->d(JZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_1
    new-instance v0, Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;

    new-instance v1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    iget-object v2, v5, Ldt1/h$r;->G:Ljava/lang/String;

    iget-object v3, v5, Ldt1/h$r;->H:Ljava/util/List;

    iget-object v4, v5, Ldt1/h$r;->I:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;-><init>(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;)V

    new-instance v1, Ldt1/h$r$a;

    iget-object v2, v5, Ldt1/h$r;->E:Ldt1/h;

    invoke-direct {v1, v2, v0, v9}, Ldt1/h$r$a;-><init>(Ldt1/h;Lcom/whoop/labrador/feature/details/domain/UpdateSymptomsRequest;Lq83/d;)V

    iput-object v6, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, v5, Ldt1/h$r;->y:I

    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3, v1, v5}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_2

    goto/16 :goto_6

    :cond_2
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_6

    iget-object v0, v5, Ldt1/h$r;->E:Ldt1/h;

    invoke-static {v0}, Ldt1/h;->h(Ldt1/h;)Lqk1/b;

    move-result-object v0

    iget-object v1, v5, Ldt1/h$r;->F:Ljava/time/Instant;

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    iget-object v3, v5, Ldt1/h$r;->H:Ljava/util/List;

    iget-object v4, v5, Ldt1/h$r;->I:Ljava/lang/String;

    iput-object v6, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    const/4 v10, 0x4

    iput v10, v5, Ldt1/h$r;->y:I

    invoke-interface/range {v0 .. v5}, Lqk1/b;->a(JLjava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_3
    iget-object v0, v5, Ldt1/h$r;->E:Ldt1/h;

    invoke-static {v0}, Ldt1/h;->h(Ldt1/h;)Lqk1/b;

    move-result-object v0

    iget-object v1, v5, Ldt1/h$r;->F:Ljava/time/Instant;

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    iput-object v6, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v5, Ldt1/h$r;->y:I

    invoke-interface {v0, v1, v2, v8, v5}, Lqk1/b;->d(JZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_4

    goto :goto_6

    :cond_4
    :goto_4
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v8, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    iput-object v6, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v5, Ldt1/h$r;->y:I

    invoke-static {v0, v1, v5}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    sget-object v0, Ldt1/b$l;->a:Ldt1/b$l;

    iput-object v9, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    const/4 v1, 0x7

    iput v1, v5, Ldt1/h$r;->y:I

    invoke-interface {v6, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_7

    goto :goto_6

    :cond_6
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_8

    sget-object v10, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->F:Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;

    iget-object v0, v5, Ldt1/h$r;->E:Ldt1/h;

    invoke-static {v0}, Ldt1/h;->n(Ldt1/h;)Lic/p0;

    move-result-object v11

    iget-object v12, v5, Ldt1/h$r;->G:Ljava/lang/String;

    iget-object v0, v5, Ldt1/h$r;->F:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v13

    iget-object v15, v5, Ldt1/h$r;->H:Ljava/util/List;

    iget-object v0, v5, Ldt1/h$r;->I:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v10 .. v16}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;->c(Lic/p0;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)Lic/e0;

    new-instance v0, Ldt1/b$p;

    iget-object v1, v5, Ldt1/h$r;->G:Ljava/lang/String;

    iget-object v2, v5, Ldt1/h$r;->F:Ljava/time/Instant;

    iget-object v3, v5, Ldt1/h$r;->H:Ljava/util/List;

    iget-object v4, v5, Ldt1/h$r;->I:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Ldt1/b$p;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    iput-object v9, v5, Ldt1/h$r;->z:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->w:Ljava/lang/Object;

    iput-object v9, v5, Ldt1/h$r;->x:Ljava/lang/Object;

    const/16 v1, 0x8

    iput v1, v5, Ldt1/h$r;->y:I

    invoke-interface {v6, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_7

    :goto_6
    return-object v7

    :cond_7
    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
