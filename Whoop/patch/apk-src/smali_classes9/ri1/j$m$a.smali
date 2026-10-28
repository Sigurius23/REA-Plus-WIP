.class public final Lri1/j$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lri1/j$m;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic y:Lri1/j;


# direct methods
.method public constructor <init>(Lec3/m;ZLri1/j;)V
    .locals 0

    iput-object p1, p0, Lri1/j$m$a;->w:Lec3/m;

    iput-boolean p2, p0, Lri1/j$m$a;->x:Z

    iput-object p3, p0, Lri1/j$m$a;->y:Lri1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lri1/j$m$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lri1/j$m$a$a;

    iget v3, v2, Lri1/j$m$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lri1/j$m$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lri1/j$m$a$a;

    invoke-direct {v2, v0, v1}, Lri1/j$m$a$a;-><init>(Lri1/j$m$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lri1/j$m$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lri1/j$m$a$a;->x:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v8, :cond_2

    if-eq v4, v7, :cond_2

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lri1/j$m$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lri1/j$m$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lri1/j$m$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lri1/j$m$a$a;->K:I

    iget-object v6, v2, Lri1/j$m$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lpm0/a;

    iget-object v6, v2, Lri1/j$m$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Lri1/j$m$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, v2, Lri1/j$m$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v2, Lri1/j$m$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lri1/j$m$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lri1/j$m$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v10, v4, Lpm0/a$e;

    const/4 v11, 0x0

    if-eqz v10, :cond_4

    new-instance v12, Lri1/h;

    sget-object v13, Lri1/g$c;->a:Lri1/g$c;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lri1/h;-><init>(Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_4
    instance-of v10, v4, Lpm0/a$a$b;

    if-eqz v10, :cond_5

    new-instance v12, Lri1/h;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lcom/whoop/health/domain/models/HealthTabResponse;

    iget-boolean v15, v0, Lri1/j$m$a;->x:Z

    const/16 v19, 0x31

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lri1/h;-><init>(Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_5
    instance-of v10, v4, Lpm0/a$a$a;

    if-eqz v10, :cond_7

    iget-object v6, v0, Lri1/j$m$a;->y:Lri1/j;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/health/domain/models/HealthTabResponse;

    iput-object v9, v2, Lri1/j$m$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lri1/j$m$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->I:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lri1/j$m$a$a;->K:I

    iput v11, v2, Lri1/j$m$a$a;->L:I

    iput v8, v2, Lri1/j$m$a$a;->x:I

    invoke-static {v6, v4, v2}, Lri1/j;->o(Lri1/j;Lcom/whoop/health/domain/models/HealthTabResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto/16 :goto_3

    :cond_6
    move-object v6, v1

    move-object v1, v4

    move v4, v11

    :goto_1
    move-object v12, v1

    move v11, v4

    move-object v1, v6

    goto :goto_2

    :cond_7
    instance-of v8, v4, Lpm0/a$d;

    if-eqz v8, :cond_8

    iget-object v6, v0, Lri1/j$m$a;->y:Lri1/j;

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/health/domain/models/HealthTabResponse;

    iput-object v9, v2, Lri1/j$m$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lri1/j$m$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->I:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lri1/j$m$a$a;->K:I

    iput v11, v2, Lri1/j$m$a$a;->L:I

    iput v7, v2, Lri1/j$m$a$a;->x:I

    invoke-static {v6, v4, v2}, Lri1/j;->o(Lri1/j;Lcom/whoop/health/domain/models/HealthTabResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto :goto_3

    :cond_8
    instance-of v4, v4, Lpm0/a$c;

    if-eqz v4, :cond_9

    iget-object v4, v0, Lri1/j$m$a;->y:Lri1/j;

    iput-object v9, v2, Lri1/j$m$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lri1/j$m$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->I:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lri1/j$m$a$a;->K:I

    iput v11, v2, Lri1/j$m$a$a;->L:I

    iput v6, v2, Lri1/j$m$a$a;->x:I

    invoke-static {v4, v2}, Lri1/j;->k(Lri1/j;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto :goto_3

    :cond_9
    new-instance v12, Lri1/h;

    sget-object v13, Lri1/g$f;->a:Lri1/g$f;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lri1/h;-><init>(Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    iput-object v9, v2, Lri1/j$m$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->G:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->I:Ljava/lang/Object;

    iput-object v9, v2, Lri1/j$m$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lri1/j$m$a$a;->K:I

    iput v5, v2, Lri1/j$m$a$a;->x:I

    invoke-interface {v1, v12, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    :goto_3
    return-object v3

    :cond_a
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
