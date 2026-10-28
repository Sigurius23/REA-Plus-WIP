.class public final Lil1/r$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/r$j;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lil1/u$c;

.field final synthetic y:Lil1/r;


# direct methods
.method public constructor <init>(Lec3/m;Lil1/u$c;Lil1/r;)V
    .locals 0

    iput-object p1, p0, Lil1/r$j$a;->w:Lec3/m;

    iput-object p2, p0, Lil1/r$j$a;->x:Lil1/u$c;

    iput-object p3, p0, Lil1/r$j$a;->y:Lil1/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lil1/r$j$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lil1/r$j$a$a;

    iget v3, v2, Lil1/r$j$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lil1/r$j$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lil1/r$j$a$a;

    invoke-direct {v2, v0, v1}, Lil1/r$j$a$a;-><init>(Lil1/r$j$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lil1/r$j$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lil1/r$j$a$a;->x:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lil1/r$j$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lil1/r$j$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lil1/r$j$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lil1/r$j$a$a;->M:I

    iget-object v6, v2, Lil1/r$j$a$a;->L:Ljava/lang/Object;

    check-cast v6, Lil1/r$b;

    iget-object v7, v2, Lil1/r$j$a$a;->K:Ljava/lang/Object;

    check-cast v7, Lil1/r$b;

    iget-object v7, v2, Lil1/r$j$a$a;->J:Ljava/lang/Object;

    check-cast v7, Lpm0/a;

    iget-object v7, v2, Lil1/r$j$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Lil1/r$j$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v9, v2, Lil1/r$j$a$a;->G:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v9, v2, Lil1/r$j$a$a;->E:Ljava/lang/Object;

    check-cast v9, Lil1/r$j$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lil1/r$j$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v9, v4, Lpm0/a$a$a;

    const/4 v10, 0x0

    if-eqz v9, :cond_6

    new-instance v6, Lil1/r$b;

    new-instance v7, Lil1/r$a$b;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v9, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v9}, Lil1/u$c;->e()Ljava/time/LocalDate;

    move-result-object v9

    if-nez v9, :cond_4

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v9

    :cond_4
    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v11, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v11}, Lil1/u$c;->d()Lem1/r;

    move-result-object v11

    invoke-direct {v7, v4, v9, v11}, Lil1/r$a$b;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;)V

    iget-object v4, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v4}, Lil1/u$c;->c()Lfm1/g;

    move-result-object v4

    if-nez v4, :cond_5

    sget-object v4, Lfm1/g;->OVERVIEW:Lfm1/g;

    :cond_5
    invoke-direct {v6, v7, v4}, Lil1/r$b;-><init>(Lil1/r$a;Lfm1/g;)V

    goto/16 :goto_2

    :cond_6
    instance-of v9, v4, Lpm0/a$a$b;

    if-eqz v9, :cond_9

    new-instance v6, Lil1/r$b;

    new-instance v7, Lil1/r$a$e;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v9, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v9}, Lil1/u$c;->e()Ljava/time/LocalDate;

    move-result-object v9

    if-nez v9, :cond_7

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v9

    :cond_7
    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v11, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v11}, Lil1/u$c;->d()Lem1/r;

    move-result-object v11

    invoke-direct {v7, v4, v9, v11}, Lil1/r$a$e;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;)V

    iget-object v4, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v4}, Lil1/u$c;->c()Lfm1/g;

    move-result-object v4

    if-nez v4, :cond_8

    sget-object v4, Lfm1/g;->OVERVIEW:Lfm1/g;

    :cond_8
    invoke-direct {v6, v7, v4}, Lil1/r$b;-><init>(Lil1/r$a;Lfm1/g;)V

    goto/16 :goto_2

    :cond_9
    instance-of v9, v4, Lpm0/a$e;

    if-eqz v9, :cond_a

    new-instance v4, Lil1/r$b;

    sget-object v7, Lil1/r$a$c;->a:Lil1/r$a$c;

    invoke-direct {v4, v7, v8, v6, v8}, Lil1/r$b;-><init>(Lil1/r$a;Lfm1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v4

    goto/16 :goto_2

    :cond_a
    instance-of v9, v4, Lpm0/a$c;

    if-eqz v9, :cond_c

    new-instance v9, Lil1/r$b;

    new-instance v11, Lil1/r$a$a;

    move-object v12, v4

    check-cast v12, Lpm0/a$b;

    invoke-static {v12}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result v12

    xor-int/lit8 v15, v12, 0x1

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v17}, Lil1/r$a$a;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v9, v11, v8, v6, v8}, Lil1/r$b;-><init>(Lil1/r$a;Lfm1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v6, v0, Lil1/r$j$a;->y:Lil1/r;

    check-cast v4, Lpm0/a$c;

    invoke-virtual {v4}, Lpm0/a$c;->b()I

    move-result v4

    iput-object v8, v2, Lil1/r$j$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lil1/r$j$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->J:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->K:Ljava/lang/Object;

    iput-object v9, v2, Lil1/r$j$a$a;->L:Ljava/lang/Object;

    iput v10, v2, Lil1/r$j$a$a;->M:I

    iput v10, v2, Lil1/r$j$a$a;->N:I

    iput v10, v2, Lil1/r$j$a$a;->O:I

    iput v7, v2, Lil1/r$j$a$a;->x:I

    invoke-static {v6, v4, v2}, Lil1/r;->m(Lil1/r;ILq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_b

    goto/16 :goto_3

    :cond_b
    move-object v7, v1

    move-object v6, v9

    move v4, v10

    :goto_1
    move v10, v4

    move-object v1, v7

    goto :goto_2

    :cond_c
    instance-of v9, v4, Lpm0/a$d;

    if-eqz v9, :cond_f

    new-instance v9, Lil1/r$b;

    new-instance v11, Lil1/r$a$a;

    move-object v12, v4

    check-cast v12, Lpm0/a$d;

    invoke-virtual {v12}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v14, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v14}, Lil1/u$c;->e()Ljava/time/LocalDate;

    move-result-object v14

    iget-object v15, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v15}, Lil1/u$c;->d()Lem1/r;

    move-result-object v15

    check-cast v4, Lpm0/a$b;

    invoke-static {v4}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result v4

    xor-int/2addr v4, v7

    invoke-direct {v11, v13, v14, v15, v4}, Lil1/r$a$a;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;Z)V

    iget-object v4, v0, Lil1/r$j$a;->x:Lil1/u$c;

    invoke-virtual {v4}, Lil1/u$c;->c()Lfm1/g;

    move-result-object v4

    if-nez v4, :cond_d

    sget-object v4, Lfm1/g;->OVERVIEW:Lfm1/g;

    :cond_d
    invoke-direct {v9, v11, v4}, Lil1/r$b;-><init>(Lil1/r$a;Lfm1/g;)V

    iget-object v4, v0, Lil1/r$j$a;->y:Lil1/r;

    invoke-virtual {v12}, Lpm0/a$d;->b()I

    move-result v7

    iput-object v8, v2, Lil1/r$j$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lil1/r$j$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->J:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->K:Ljava/lang/Object;

    iput-object v9, v2, Lil1/r$j$a$a;->L:Ljava/lang/Object;

    iput v10, v2, Lil1/r$j$a$a;->M:I

    iput v10, v2, Lil1/r$j$a$a;->N:I

    iput v10, v2, Lil1/r$j$a$a;->O:I

    iput v6, v2, Lil1/r$j$a$a;->x:I

    invoke-static {v4, v7, v2}, Lil1/r;->m(Lil1/r;ILq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_b

    goto :goto_3

    :goto_2
    iput-object v8, v2, Lil1/r$j$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->G:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->J:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->K:Ljava/lang/Object;

    iput-object v8, v2, Lil1/r$j$a$a;->L:Ljava/lang/Object;

    iput v10, v2, Lil1/r$j$a$a;->M:I

    iput v5, v2, Lil1/r$j$a$a;->x:I

    invoke-interface {v1, v6, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    :goto_3
    return-object v3

    :cond_e
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
