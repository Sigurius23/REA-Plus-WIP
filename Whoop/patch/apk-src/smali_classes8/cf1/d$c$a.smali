.class public final Lcf1/d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf1/d$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Z

.field final synthetic y:Lcf1/d;

.field final synthetic z:La12/a;


# direct methods
.method public constructor <init>(Lec3/m;ZLcf1/d;La12/a;)V
    .locals 0

    iput-object p1, p0, Lcf1/d$c$a;->w:Lec3/m;

    iput-boolean p2, p0, Lcf1/d$c$a;->x:Z

    iput-object p3, p0, Lcf1/d$c$a;->y:Lcf1/d;

    iput-object p4, p0, Lcf1/d$c$a;->z:La12/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lcf1/d$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcf1/d$c$a$a;

    iget v1, v0, Lcf1/d$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcf1/d$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcf1/d$c$a$a;

    invoke-direct {v0, p0, p2}, Lcf1/d$c$a$a;-><init>(Lcf1/d$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcf1/d$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcf1/d$c$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcf1/d$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcf1/d$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lcf1/d$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcf1/d$c$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    if-eqz v2, :cond_5

    iget-boolean p1, p0, Lcf1/d$c$a;->x:Z

    if-eqz p1, :cond_3

    new-instance v4, Lcf1/c;

    sget-object v5, Lcf1/a$a;->a:Lcf1/a$a;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_3
    iget-object p1, p0, Lcf1/d$c$a;->y:Lcf1/d;

    invoke-static {p1}, Lcf1/d;->d(Lcf1/d;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v4, Lcf1/c;

    iget-object p1, p0, Lcf1/d$c$a;->y:Lcf1/d;

    invoke-static {p1}, Lcf1/d;->d(Lcf1/d;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object v6

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_4
    new-instance v5, Lcf1/c;

    sget-object v6, Lcf1/a$a;->a:Lcf1/a$a;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v4, v5

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$a;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcf1/d$c$a;->y:Lcf1/d;

    check-cast p1, Lpm0/a$a;

    invoke-interface {p1}, Lpm0/a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    invoke-static {v2, v4}, Lcf1/d;->e(Lcf1/d;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;)V

    new-instance v5, Lcf1/c;

    iget-object v2, p0, Lcf1/d$c$a;->y:Lcf1/d;

    invoke-static {v2}, Lcf1/d;->d(Lcf1/d;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object v7

    invoke-interface {p1}, Lpm0/a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    invoke-virtual {p1}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->getSegmentController()Lcom/whoop/design/models/items/SegmentControllerModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/SegmentControllerModel;->getInitialIndex()I

    move-result p1

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, p1}, Ljava/lang/Integer;-><init>(I)V

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v5 .. v10}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lpm0/a$d;

    if-eqz v2, :cond_7

    new-instance v4, Lcf1/c;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_7
    instance-of p1, p1, Lpm0/a$c;

    if-eqz p1, :cond_9

    new-instance v4, Lcf1/c;

    new-instance v5, Lcf1/a$c;

    iget-object p1, p0, Lcf1/d$c$a;->z:La12/a;

    invoke-virtual {p1}, La12/a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v5, p1}, Lcf1/a$c;-><init>(Ljava/lang/String;)V

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    const/4 p1, 0x0

    iput-object p1, v0, Lcf1/d$c$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lcf1/d$c$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lcf1/d$c$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lcf1/d$c$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lcf1/d$c$a$a;->H:I

    iput v3, v0, Lcf1/d$c$a$a;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
