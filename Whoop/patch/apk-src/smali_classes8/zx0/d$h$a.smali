.class public final Lzx0/d$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzx0/d$h;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ljava/lang/String;

.field final synthetic w:Lec3/m;

.field final synthetic x:Z

.field final synthetic y:Lzx0/d;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;ZLzx0/d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lzx0/d$h$a;->w:Lec3/m;

    iput-boolean p2, p0, Lzx0/d$h$a;->x:Z

    iput-object p3, p0, Lzx0/d$h$a;->y:Lzx0/d;

    iput-object p4, p0, Lzx0/d$h$a;->z:Ljava/lang/String;

    iput-object p5, p0, Lzx0/d$h$a;->E:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lzx0/d$h$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lzx0/d$h$a$a;

    iget v3, v2, Lzx0/d$h$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lzx0/d$h$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lzx0/d$h$a$a;

    invoke-direct {v2, v0, v1}, Lzx0/d$h$a$a;-><init>(Lzx0/d$h$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lzx0/d$h$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lzx0/d$h$a$a;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lzx0/d$h$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lzx0/d$h$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lzx0/d$h$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lzx0/d$h$a$a;->O:I

    iget v9, v2, Lzx0/d$h$a$a;->N:I

    iget v10, v2, Lzx0/d$h$a$a;->L:I

    iget-object v11, v2, Lzx0/d$h$a$a;->K:Ljava/lang/Object;

    check-cast v11, Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    iget-object v12, v2, Lzx0/d$h$a$a;->J:Ljava/lang/Object;

    check-cast v12, Lpm0/a;

    iget-object v12, v2, Lzx0/d$h$a$a;->I:Ljava/lang/Object;

    check-cast v12, Lq83/d;

    iget-object v12, v2, Lzx0/d$h$a$a;->H:Ljava/lang/Object;

    check-cast v12, Lec3/m;

    iget-object v13, v2, Lzx0/d$h$a$a;->G:Ljava/lang/Object;

    check-cast v13, Lec3/m;

    iget-object v13, v2, Lzx0/d$h$a$a;->E:Ljava/lang/Object;

    check-cast v13, Lzx0/d$h$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    move-object v13, v11

    move-object/from16 v19, v12

    goto/16 :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v12, v0, Lzx0/d$h$a;->w:Lec3/m;

    move-object/from16 v1, p1

    check-cast v1, Lpm0/a;

    instance-of v4, v1, Lpm0/a$e;

    if-eqz v4, :cond_4

    new-instance v13, Lzx0/c;

    sget-object v14, Lzx0/a$d;->a:Lzx0/a$d;

    const/16 v19, 0x1e

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_5

    :cond_4
    instance-of v4, v1, Lpm0/a$a$b;

    if-eqz v4, :cond_5

    new-instance v13, Lzx0/c;

    check-cast v1, Lpm0/a$a$b;

    invoke-virtual {v1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    iget-boolean v1, v0, Lzx0/d$h$a;->x:Z

    const/16 v19, 0x11

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    move/from16 v16, v1

    invoke-direct/range {v13 .. v20}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_5

    :cond_5
    instance-of v4, v1, Lpm0/a$a$a;

    if-eqz v4, :cond_9

    check-cast v1, Lpm0/a$a$a;

    invoke-virtual {v1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    iget-object v1, v0, Lzx0/d$h$a;->y:Lzx0/d;

    iput-object v8, v2, Lzx0/d$h$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->G:Ljava/lang/Object;

    iput-object v12, v2, Lzx0/d$h$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->J:Ljava/lang/Object;

    iput-object v11, v2, Lzx0/d$h$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lzx0/d$h$a$a;->L:I

    iput v7, v2, Lzx0/d$h$a$a;->M:I

    iput v7, v2, Lzx0/d$h$a$a;->N:I

    iput v7, v2, Lzx0/d$h$a$a;->O:I

    iput v6, v2, Lzx0/d$h$a$a;->x:I

    invoke-static {v1, v2}, Lzx0/d;->e(Lzx0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_6

    :cond_6
    move v4, v7

    move v9, v4

    move v10, v9

    goto :goto_1

    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    new-instance v11, Lzx0/c;

    if-eqz v4, :cond_7

    move v14, v6

    goto :goto_3

    :cond_7
    move v14, v7

    :goto_3
    if-eqz v9, :cond_8

    move v15, v6

    goto :goto_4

    :cond_8
    move v15, v7

    :goto_4
    const/4 v12, 0x0

    const/16 v17, 0xd

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v18}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v7, v10

    move-object v13, v11

    move-object/from16 v12, v19

    goto :goto_5

    :cond_9
    instance-of v4, v1, Lpm0/a$d;

    if-eqz v4, :cond_a

    new-instance v13, Lzx0/c;

    check-cast v1, Lpm0/a$d;

    invoke-virtual {v1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    const/16 v19, 0x1d

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_a
    instance-of v4, v1, Lpm0/a$c;

    if-eqz v4, :cond_c

    iget-object v4, v0, Lzx0/d$h$a;->y:Lzx0/d;

    check-cast v1, Lpm0/a$c;

    iget-object v6, v0, Lzx0/d$h$a;->z:Ljava/lang/String;

    iget-object v9, v0, Lzx0/d$h$a;->E:Ljava/lang/String;

    invoke-static {v4, v1, v6, v9}, Lzx0/d;->d(Lzx0/d;Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzx0/c;

    move-result-object v13

    :goto_5
    iput-object v8, v2, Lzx0/d$h$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->G:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->J:Ljava/lang/Object;

    iput-object v8, v2, Lzx0/d$h$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lzx0/d$h$a$a;->L:I

    iput v5, v2, Lzx0/d$h$a$a;->x:I

    invoke-interface {v12, v13, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    :goto_6
    return-object v3

    :cond_b
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
