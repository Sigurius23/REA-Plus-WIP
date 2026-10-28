.class final Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->interact(Lec3/l;)Lec3/l;
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
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;",
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
    c = "com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$interact$1$1"
    f = "ExerciseRecordsInteractor.kt"
    l = {
        0x19,
        0x1a,
        0x1a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $action:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->$action:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->this$0:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->$action:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->this$0:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$Loading;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->$action:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;

    check-cast v2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadInitial;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadInitial;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$Loading;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$0:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->label:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    move-object v11, p0

    goto :goto_2

    :cond_4
    :goto_0
    iget-object v7, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->this$0:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->$action:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;

    check-cast p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadInitial;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadInitial;->getPath()Ljava/lang/String;

    move-result-object v8

    iput-object v6, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$0:Ljava/lang/Object;

    iput-object v0, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$1:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->label:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v7 .. v13}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->fetchPage$default(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Ljava/lang/String;Ljava/lang/String;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iput-object v6, v11, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$0:Ljava/lang/Object;

    iput-object v6, v11, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->L$1:Ljava/lang/Object;

    iput v3, v11, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$1$1;->label:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
