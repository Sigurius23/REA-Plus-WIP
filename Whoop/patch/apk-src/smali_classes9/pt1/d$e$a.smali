.class public final Lpt1/d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpt1/d$e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lpt1/d;


# direct methods
.method public constructor <init>(Lec3/m;Lpt1/d;)V
    .locals 0

    iput-object p1, p0, Lpt1/d$e$a;->w:Lec3/m;

    iput-object p2, p0, Lpt1/d$e$a;->x:Lpt1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lpt1/d$e$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lpt1/d$e$a$a;

    iget v3, v2, Lpt1/d$e$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lpt1/d$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lpt1/d$e$a$a;

    invoke-direct {v2, v0, v1}, Lpt1/d$e$a$a;-><init>(Lpt1/d$e$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lpt1/d$e$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lpt1/d$e$a$a;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lpt1/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lpt1/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lpt1/d$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lpt1/d$e$a$a;->N:I

    iget-object v8, v2, Lpt1/d$e$a$a;->M:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v8, v2, Lpt1/d$e$a$a;->L:Ljava/lang/Object;

    check-cast v8, Lpt1/c$e;

    iget-object v9, v2, Lpt1/d$e$a$a;->K:Ljava/lang/Object;

    check-cast v9, Lpt1/b;

    iget-object v10, v2, Lpt1/d$e$a$a;->J:Ljava/lang/Object;

    check-cast v10, Lpt1/b;

    iget-object v10, v2, Lpt1/d$e$a$a;->I:Ljava/lang/Object;

    check-cast v10, Lq83/d;

    iget-object v10, v2, Lpt1/d$e$a$a;->H:Ljava/lang/Object;

    check-cast v10, Lec3/m;

    iget-object v11, v2, Lpt1/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v11, Lec3/m;

    iget-object v11, v2, Lpt1/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v11, Lpt1/d$e$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    move-object v15, v10

    goto/16 :goto_3

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v10, v0, Lpt1/d$e$a;->w:Lec3/m;

    move-object/from16 v15, p1

    check-cast v15, Lpt1/b;

    invoke-virtual {v15}, Lpt1/b;->c()Lpt1/c;

    move-result-object v1

    instance-of v1, v1, Lpt1/c$e;

    const/4 v4, 0x0

    if-eqz v1, :cond_9

    invoke-virtual {v15}, Lpt1/b;->c()Lpt1/c;

    move-result-object v1

    check-cast v1, Lpt1/c$e;

    invoke-virtual {v1}, Lpt1/c$e;->c()Ldk0/j;

    move-result-object v1

    invoke-virtual {v1}, Ldk0/j;->c0()[S

    move-result-object v1

    new-instance v8, Ljava/util/ArrayList;

    array-length v9, v1

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    array-length v9, v1

    move v11, v4

    :goto_2
    if-ge v11, v9, :cond_4

    aget-short v12, v1, v11

    int-to-short v12, v12

    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v12}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, La6/u;

    const/4 v6, 0x1

    invoke-direct {v1, v15, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_5

    :cond_5
    const/16 v9, 0x19

    if-ge v1, v9, :cond_7

    invoke-virtual {v15}, Lpt1/b;->c()Lpt1/c;

    move-result-object v11

    check-cast v11, Lpt1/c$e;

    iget-object v12, v0, Lpt1/d$e$a;->x:Lpt1/d;

    sget-object v13, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    iput-object v7, v2, Lpt1/d$e$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->G:Ljava/lang/Object;

    iput-object v10, v2, Lpt1/d$e$a$a;->H:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->I:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->J:Ljava/lang/Object;

    iput-object v15, v2, Lpt1/d$e$a$a;->K:Ljava/lang/Object;

    iput-object v11, v2, Lpt1/d$e$a$a;->L:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->M:Ljava/lang/Object;

    iput v4, v2, Lpt1/d$e$a$a;->N:I

    iput v4, v2, Lpt1/d$e$a$a;->O:I

    iput v1, v2, Lpt1/d$e$a$a;->P:I

    iput v9, v2, Lpt1/d$e$a$a;->Q:I

    iput v6, v2, Lpt1/d$e$a$a;->x:I

    invoke-static {v12, v8, v13, v6, v2}, Lpt1/d;->a(Lpt1/d;Ljava/util/List;Ly81/f;ZLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto :goto_6

    :cond_6
    move-object v8, v11

    move-object v9, v15

    goto :goto_1

    :goto_3
    check-cast v1, Ljava/util/List;

    invoke-static {v8, v7, v1, v6, v7}, Lpt1/c$e;->b(Lpt1/c$e;Ldk0/j;Ljava/util/List;ILjava/lang/Object;)Lpt1/c$e;

    move-result-object v10

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    new-instance v6, La6/u;

    const/4 v8, 0x1

    invoke-direct {v6, v1, v8}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object v1, v6

    move-object v10, v15

    goto :goto_5

    :cond_7
    div-int/lit8 v1, v1, 0x32

    if-ge v1, v6, :cond_8

    goto :goto_4

    :cond_8
    move v6, v1

    :goto_4
    invoke-static {v8, v6}, Lm83/s;->v0(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    move-result-object v12

    const-wide/16 v8, 0xa

    int-to-long v13, v6

    mul-long/2addr v13, v8

    new-instance v11, Lpt1/d$d;

    iget-object v1, v0, Lpt1/d$e$a;->x:Lpt1/d;

    const/16 v17, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v11 .. v17}, Lpt1/d$d;-><init>(Ljava/util/List;JLpt1/b;Lpt1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v11}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_5

    :cond_9
    new-instance v1, La6/u;

    const/4 v6, 0x1

    invoke-direct {v1, v15, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_5
    iput-object v7, v2, Lpt1/d$e$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->G:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->H:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->I:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->J:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->K:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->L:Ljava/lang/Object;

    iput-object v7, v2, Lpt1/d$e$a$a;->M:Ljava/lang/Object;

    iput v4, v2, Lpt1/d$e$a$a;->N:I

    iput v5, v2, Lpt1/d$e$a$a;->x:I

    invoke-interface {v10, v1, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    :goto_6
    return-object v3

    :cond_a
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
