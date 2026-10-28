.class public final Lug1/b$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/b$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lug1/b;


# direct methods
.method public constructor <init>(Lec3/m;Lug1/b;)V
    .locals 0

    iput-object p1, p0, Lug1/b$g$a;->w:Lec3/m;

    iput-object p2, p0, Lug1/b$g$a;->x:Lug1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lug1/b$g$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lug1/b$g$a$a;

    iget v3, v2, Lug1/b$g$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lug1/b$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lug1/b$g$a$a;

    invoke-direct {v2, v0, v1}, Lug1/b$g$a$a;-><init>(Lug1/b$g$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lug1/b$g$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lug1/b$g$a$a;->x:I

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v3, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_15

    :pswitch_1
    iget v4, v2, Lug1/b$g$a$a;->L:I

    iget-object v5, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    check-cast v5, Lgt0/h$b;

    goto :goto_1

    :pswitch_2
    iget v7, v2, Lug1/b$g$a$a;->M:I

    iget v4, v2, Lug1/b$g$a$a;->L:I

    iget-object v5, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    check-cast v5, Lgt0/h$b;

    iget-object v6, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lug1/j;

    iget-object v6, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v9, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v9, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v9, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v7

    move-object v12, v8

    move v7, v4

    goto/16 :goto_11

    :pswitch_3
    iget v7, v2, Lug1/b$g$a$a;->L:I

    iget-object v4, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v4, Lug1/j;

    iget-object v4, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    iget-object v4, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v5, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    iget-object v5, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_4
    iget v4, v2, Lug1/b$g$a$a;->L:I

    iget-object v5, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    check-cast v5, Lgt0/h;

    :goto_1
    iget-object v6, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lug1/j;

    iget-object v6, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v7, v4

    goto/16 :goto_f

    :pswitch_5
    iget v4, v2, Lug1/b$g$a$a;->N:I

    iget v5, v2, Lug1/b$g$a$a;->M:I

    iget v6, v2, Lug1/b$g$a$a;->L:I

    iget-object v7, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    check-cast v7, Lgt0/h;

    iget-object v9, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v9, Lug1/j;

    iget-object v9, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v9, Lq83/d;

    iget-object v9, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v10, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v10, Lec3/m;

    iget-object v10, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v10, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move v1, v5

    move-object v5, v7

    move v7, v6

    move-object v6, v9

    goto/16 :goto_e

    :pswitch_6
    iget v4, v2, Lug1/b$g$a$a;->N:I

    iget v5, v2, Lug1/b$g$a$a;->M:I

    iget v6, v2, Lug1/b$g$a$a;->L:I

    iget-object v7, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    check-cast v7, Lgt0/h;

    iget-object v9, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v9, Lug1/j;

    iget-object v9, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v9, Lq83/d;

    iget-object v9, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v10, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v10, Lec3/m;

    iget-object v10, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v10, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_7
    iget v4, v2, Lug1/b$g$a$a;->N:I

    iget v5, v2, Lug1/b$g$a$a;->M:I

    iget v6, v2, Lug1/b$g$a$a;->L:I

    iget-object v7, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v7, Lug1/j;

    iget-object v9, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v9, Lq83/d;

    iget-object v9, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v10, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v10, Lec3/m;

    iget-object v10, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v10, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_8
    iget v4, v2, Lug1/b$g$a$a;->L:I

    iget-object v5, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v5, Lug1/j;

    iget-object v5, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    iget-object v5, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    iget-object v6, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v6, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v6, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v5

    goto/16 :goto_8

    :pswitch_9
    iget v4, v2, Lug1/b$g$a$a;->L:I

    iget-object v6, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lug1/j;

    iget-object v6, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_a
    iget-wide v9, v2, Lug1/b$g$a$a;->O:J

    iget v4, v2, Lug1/b$g$a$a;->N:I

    iget v6, v2, Lug1/b$g$a$a;->M:I

    iget v11, v2, Lug1/b$g$a$a;->L:I

    iget-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v12, Lug1/j;

    iget-object v13, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v13, Lq83/d;

    iget-object v13, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v13, Lec3/m;

    iget-object v14, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v14, Lec3/m;

    iget-object v14, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v14, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v28, v6

    move v6, v4

    move v4, v11

    move-wide v10, v9

    move/from16 v9, v28

    goto/16 :goto_6

    :pswitch_b
    iget v4, v2, Lug1/b$g$a$a;->N:I

    iget v6, v2, Lug1/b$g$a$a;->M:I

    iget v9, v2, Lug1/b$g$a$a;->L:I

    iget-object v10, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v10, Lug1/j;

    iget-object v11, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v11, Lq83/d;

    iget-object v11, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v11, Lec3/m;

    iget-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v12, Lec3/m;

    iget-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v12, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_2
    move-object v12, v10

    goto/16 :goto_5

    :pswitch_c
    iget v4, v2, Lug1/b$g$a$a;->M:I

    iget v9, v2, Lug1/b$g$a$a;->L:I

    iget-object v10, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    check-cast v10, Lug1/j;

    iget-object v11, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    check-cast v11, Lq83/d;

    iget-object v11, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    check-cast v11, Lec3/m;

    iget-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    check-cast v12, Lec3/m;

    iget-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    check-cast v12, Lug1/b$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_d
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v0, Lug1/b$g$a;->w:Lec3/m;

    move-object/from16 v1, p1

    check-cast v1, Lug1/j;

    instance-of v9, v1, Lug1/j$f;

    if-eqz v9, :cond_2

    new-instance v5, Lgt0/h$g;

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    check-cast v1, Lug1/j$f;

    invoke-virtual {v1}, Lug1/j$f;->b()I

    move-result v10

    invoke-virtual {v1}, Lug1/j$f;->a()I

    move-result v1

    invoke-static {v9, v10, v1}, Lug1/b;->f(Lug1/b;II)I

    move-result v1

    invoke-static {v1}, Lbt0/c;->a(I)I

    move-result v1

    invoke-direct {v5, v1, v7, v6, v8}, Lgt0/h$g;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v8

    goto/16 :goto_13

    :cond_2
    instance-of v9, v1, Lug1/j$g;

    if-eqz v9, :cond_12

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v9}, Lug1/b;->h()Ltr2/n;

    move-result-object v9

    const-string v10, "Finished sending FW packets"

    new-array v11, v7, [Lqr2/a$a;

    invoke-interface {v9, v10, v11}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v9}, Lug1/b;->k(Lug1/b;)Lgt0/d;

    move-result-object v10

    sget-object v11, Lgt0/b;->BINARY_TRANSFER:Lgt0/b;

    sget-object v12, Lgt0/c;->SUCCESS:Lgt0/c;

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v9}, Lug1/b;->z(Lug1/b;)Ljava/lang/String;

    move-result-object v14

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v9}, Lug1/b;->v(Lug1/b;)Ljava/lang/String;

    move-result-object v15

    const/16 v17, 0x20

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v9}, Lug1/b;->w(Lug1/b;)Z

    move-result v9

    if-nez v9, :cond_3

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v9}, Lug1/b;->k(Lug1/b;)Lgt0/d;

    move-result-object v10

    sget-object v11, Lgt0/b;->PROMPT:Lgt0/b;

    sget-object v13, Lgt0/a;->CLICKED_UPDATE:Lgt0/a;

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v9}, Lug1/b;->z(Lug1/b;)Ljava/lang/String;

    move-result-object v14

    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v9}, Lug1/b;->v(Lug1/b;)Ljava/lang/String;

    move-result-object v15

    const/16 v17, 0x20

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_3
    iget-object v9, v0, Lug1/b$g$a;->x:Lug1/b;

    iput-object v8, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v4, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v1, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput v7, v2, Lug1/b$g$a$a;->L:I

    iput v7, v2, Lug1/b$g$a$a;->M:I

    iput v5, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v9, v2}, Lug1/b;->R(Lug1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_4

    goto/16 :goto_14

    :cond_4
    move-object v10, v1

    move-object v11, v4

    move v4, v7

    move-object v1, v9

    move v9, v4

    :goto_3
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->A(Lug1/b;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->C(Lug1/b;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v5

    goto :goto_4

    :cond_5
    move v1, v7

    :goto_4
    iget-object v12, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v12}, Lug1/b;->h()Ltr2/n;

    move-result-object v12

    iget-object v13, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v13}, Lug1/b;->A(Lug1/b;)Z

    move-result v13

    const-string v14, "isForcedFwUpdate is "

    invoke-static {v14, v13}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v13

    new-array v14, v7, [Lqr2/a$a;

    invoke-interface {v12, v13, v14}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v12, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v12}, Lug1/b;->h()Ltr2/n;

    move-result-object v12

    iget-object v13, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v13}, Lug1/b;->C(Lug1/b;)Z

    move-result v13

    const-string v14, "isNewForcedFwUpdateEnabled is "

    invoke-static {v14, v13}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v13

    new-array v14, v7, [Lqr2/a$a;

    invoke-interface {v12, v13, v14}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v12, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v12}, Lug1/b;->h()Ltr2/n;

    move-result-object v12

    const-string v13, "newForcedFwUpdate is "

    invoke-static {v13, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v13

    new-array v14, v7, [Lqr2/a$a;

    invoke-interface {v12, v13, v14}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v12, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v12}, Lug1/b;->w(Lug1/b;)Z

    move-result v12

    if-eqz v12, :cond_b

    if-nez v1, :cond_b

    iget-object v12, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v12}, Lug1/b;->n(Lug1/b;)Lsg1/a;

    move-result-object v12

    move-object v13, v10

    check-cast v13, Lug1/j$g;

    invoke-virtual {v13}, Lug1/j$g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v13

    iput-object v8, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v11, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v10, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lug1/b$g$a$a;->L:I

    iput v4, v2, Lug1/b$g$a$a;->M:I

    iput v1, v2, Lug1/b$g$a$a;->N:I

    iput v6, v2, Lug1/b$g$a$a;->x:I

    invoke-interface {v12, v13, v2}, Lsg1/a;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_6

    goto/16 :goto_14

    :cond_6
    move v12, v4

    move v4, v1

    move-object v1, v6

    move v6, v12

    goto/16 :goto_2

    :goto_5
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v13

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v1}, Lug1/b;->h()Ltr2/n;

    move-result-object v1

    const-string v10, "Re-prompt cadence is "

    invoke-static {v13, v14, v10}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-array v15, v7, [Lqr2/a$a;

    invoke-interface {v1, v10, v15}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->n(Lug1/b;)Lsg1/a;

    move-result-object v1

    move-object v10, v12

    check-cast v10, Lug1/j$g;

    invoke-virtual {v10}, Lug1/j$g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v10

    iput-object v8, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v11, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lug1/b$g$a$a;->L:I

    iput v6, v2, Lug1/b$g$a$a;->M:I

    iput v4, v2, Lug1/b$g$a$a;->N:I

    iput-wide v13, v2, Lug1/b$g$a$a;->O:J

    const/4 v15, 0x3

    iput v15, v2, Lug1/b$g$a$a;->x:I

    invoke-interface {v1, v10, v2}, Lsg1/a;->g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_14

    :cond_7
    move v10, v6

    move v6, v4

    move v4, v9

    move v9, v10

    move-wide/from16 v28, v13

    move-object v13, v11

    move-wide/from16 v10, v28

    :goto_6
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v1}, Lug1/b;->h()Ltr2/n;

    move-result-object v1

    const-string v5, "Last dialog shown time is "

    invoke-static {v14, v15, v5}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v8, v7, [Lqr2/a$a;

    invoke-interface {v1, v5, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->j(Lug1/b;)Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v7

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v1}, Lug1/b;->h()Ltr2/n;

    move-result-object v1

    const-string v5, "Current time is "

    invoke-static {v7, v8, v5}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v18, v3

    move-object/from16 v17, v12

    const/4 v12, 0x0

    new-array v3, v12, [Lqr2/a$a;

    invoke-interface {v1, v5, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sub-long v19, v7, v14

    cmp-long v1, v19, v10

    if-lez v1, :cond_9

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v1}, Lug1/b;->h()Ltr2/n;

    move-result-object v1

    const-string v3, "Show FW Update dialog"

    new-array v5, v12, [Lqr2/a$a;

    invoke-interface {v1, v3, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->k(Lug1/b;)Lgt0/d;

    move-result-object v19

    sget-object v20, Lgt0/b;->PROMPT:Lgt0/b;

    sget-object v21, Lgt0/c;->UPDATE_PROMPT:Lgt0/c;

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->z(Lug1/b;)Ljava/lang/String;

    move-result-object v23

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->v(Lug1/b;)Ljava/lang/String;

    move-result-object v24

    const/16 v26, 0x20

    const/16 v27, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    invoke-static/range {v19 .. v27}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->n(Lug1/b;)Lsg1/a;

    move-result-object v1

    move-object/from16 v12, v17

    check-cast v12, Lug1/j$g;

    invoke-virtual {v12}, Lug1/j$g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    iput-object v5, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v5, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v5, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v5, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v13, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v5, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v5, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput v4, v2, Lug1/b$g$a$a;->L:I

    iput v9, v2, Lug1/b$g$a$a;->M:I

    iput v6, v2, Lug1/b$g$a$a;->N:I

    iput-wide v10, v2, Lug1/b$g$a$a;->O:J

    iput-wide v14, v2, Lug1/b$g$a$a;->P:J

    iput-wide v7, v2, Lug1/b$g$a$a;->Q:J

    const/4 v5, 0x4

    iput v5, v2, Lug1/b$g$a$a;->x:I

    invoke-interface {v1, v3, v2}, Lsg1/a;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v3, v18

    if-ne v1, v3, :cond_8

    goto/16 :goto_14

    :cond_8
    move-object v6, v13

    :goto_7
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    new-instance v5, Lgt0/h$d;

    const/4 v7, 0x1

    invoke-direct {v5, v1, v7}, Lgt0/h$d;-><init>(ZZ)V

    move v7, v4

    goto/16 :goto_f

    :cond_9
    move-object/from16 v3, v18

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v1}, Lug1/b;->h()Ltr2/n;

    move-result-object v1

    const-string v12, "Don\'t show FW Update dialog"

    const/4 v5, 0x0

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v1, v12, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v1}, Lug1/b;->n(Lug1/b;)Lsg1/a;

    move-result-object v1

    move-object/from16 v12, v17

    check-cast v12, Lug1/j$g;

    invoke-virtual {v12}, Lug1/j$g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v3

    const/4 v12, 0x0

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v13, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput v4, v2, Lug1/b$g$a$a;->L:I

    iput v9, v2, Lug1/b$g$a$a;->M:I

    iput v6, v2, Lug1/b$g$a$a;->N:I

    iput-wide v10, v2, Lug1/b$g$a$a;->O:J

    iput-wide v14, v2, Lug1/b$g$a$a;->P:J

    iput-wide v7, v2, Lug1/b$g$a$a;->Q:J

    const/4 v6, 0x5

    iput v6, v2, Lug1/b$g$a$a;->x:I

    invoke-interface {v1, v3, v2}, Lsg1/a;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v3, v18

    if-ne v1, v3, :cond_a

    goto/16 :goto_14

    :cond_a
    :goto_8
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    new-instance v6, Lgt0/h$d;

    const/4 v5, 0x0

    invoke-direct {v6, v1, v5}, Lgt0/h$d;-><init>(ZZ)V

    move v7, v4

    move-object v5, v6

    move-object v4, v13

    :goto_9
    const/4 v12, 0x0

    goto/16 :goto_13

    :cond_b
    iget-object v5, v0, Lug1/b$g$a;->x:Lug1/b;

    const/4 v12, 0x0

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v11, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v10, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lug1/b$g$a$a;->L:I

    iput v4, v2, Lug1/b$g$a$a;->M:I

    iput v1, v2, Lug1/b$g$a$a;->N:I

    const/4 v6, 0x6

    iput v6, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v5, v2}, Lug1/b;->D(Lug1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_c

    goto/16 :goto_14

    :cond_c
    move v6, v4

    move v4, v1

    move-object v1, v5

    move v5, v6

    move v6, v9

    move-object v7, v10

    move-object v9, v11

    :goto_a
    check-cast v1, Lgt0/h;

    if-eqz v4, :cond_e

    iget-object v8, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v8}, Lug1/b;->k(Lug1/b;)Lgt0/d;

    move-result-object v17

    sget-object v18, Lgt0/b;->AUTO_INSTALL:Lgt0/b;

    sget-object v8, Lgt0/h;->a:Lgt0/h$a;

    invoke-virtual {v8, v1}, Lgt0/h$a;->e(Lgt0/h;)Z

    move-result v8

    if-eqz v8, :cond_d

    sget-object v8, Lgt0/c;->SUCCESS:Lgt0/c;

    :goto_b
    move-object/from16 v19, v8

    goto :goto_c

    :cond_d
    sget-object v8, Lgt0/c;->FAILURE:Lgt0/c;

    goto :goto_b

    :goto_c
    iget-object v8, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v8}, Lug1/b;->z(Lug1/b;)Ljava/lang/String;

    move-result-object v21

    iget-object v8, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-static {v8}, Lug1/b;->v(Lug1/b;)Ljava/lang/String;

    move-result-object v22

    const/16 v24, 0x20

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    invoke-static/range {v17 .. v25}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_e
    iget-object v8, v0, Lug1/b$g$a;->x:Lug1/b;

    check-cast v7, Lug1/j$g;

    invoke-virtual {v7}, Lug1/j$g;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v10

    invoke-virtual {v7}, Lug1/j$g;->b()Ljava/lang/String;

    move-result-object v7

    const/4 v12, 0x0

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v9, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput-object v1, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    iput v6, v2, Lug1/b$g$a$a;->L:I

    iput v5, v2, Lug1/b$g$a$a;->M:I

    iput v4, v2, Lug1/b$g$a$a;->N:I

    const/4 v11, 0x7

    iput v11, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v8, v10, v7, v1, v2}, Lug1/b;->G(Lug1/b;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_f

    goto/16 :goto_14

    :cond_f
    move-object v7, v1

    :goto_d
    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v1, 0xf

    sget-object v8, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v8}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v10

    const/4 v12, 0x0

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v9, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput-object v7, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    iput v6, v2, Lug1/b$g$a$a;->L:I

    iput v5, v2, Lug1/b$g$a$a;->M:I

    iput v4, v2, Lug1/b$g$a$a;->N:I

    const/16 v1, 0x8

    iput v1, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v10, v11, v2}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    goto/16 :goto_14

    :goto_e
    iget-object v8, v0, Lug1/b$g$a;->x:Lug1/b;

    const/4 v12, 0x0

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v6, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput-object v5, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lug1/b$g$a$a;->L:I

    iput v1, v2, Lug1/b$g$a$a;->M:I

    iput v4, v2, Lug1/b$g$a$a;->N:I

    const/16 v1, 0x9

    iput v1, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v8, v2}, Lug1/b;->i(Lug1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    goto/16 :goto_14

    :cond_10
    :goto_f
    move-object v4, v6

    goto/16 :goto_9

    :cond_11
    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v1}, Lug1/b;->h()Ltr2/n;

    move-result-object v1

    check-cast v10, Lug1/j$g;

    invoke-virtual {v10}, Lug1/j$g;->b()Ljava/lang/String;

    move-result-object v4

    const-string v7, "Firmware verification for "

    const-string v8, " failed"

    invoke-static {v7, v4, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v7, v5, [Lqr2/a$a;

    invoke-interface {v1, v4, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lgt0/h$b;

    sget-object v4, Lgt0/f$h;->b:Lgt0/f$h;

    const/4 v12, 0x0

    invoke-direct {v1, v4, v5, v6, v12}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v1

    move v7, v9

    move-object v4, v11

    goto/16 :goto_13

    :cond_12
    move-object v12, v8

    instance-of v7, v1, Lug1/j$e;

    if-eqz v7, :cond_13

    sget-object v1, Lgt0/h$e;->b:Lgt0/h$e;

    move-object v5, v1

    const/4 v7, 0x0

    goto/16 :goto_13

    :cond_13
    instance-of v7, v1, Lug1/j$c;

    if-eqz v7, :cond_15

    iget-object v1, v0, Lug1/b$g$a;->x:Lug1/b;

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v4, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v2, Lug1/b$g$a$a;->L:I

    iput v5, v2, Lug1/b$g$a$a;->M:I

    const/16 v6, 0xa

    iput v6, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v1, v2}, Lug1/b;->i(Lug1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_14

    goto/16 :goto_14

    :cond_14
    const/4 v7, 0x0

    :goto_10
    sget-object v5, Lgt0/h$e;->b:Lgt0/h$e;

    goto/16 :goto_9

    :cond_15
    instance-of v7, v1, Lug1/j$b;

    const-string v8, "Firmware update failed >> "

    if-eqz v7, :cond_17

    iget-object v7, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v7}, Lug1/b;->h()Ltr2/n;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v5, 0x0

    new-array v9, v5, [Lqr2/a$a;

    invoke-interface {v7, v8, v9}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v7, Lgt0/h$b;

    check-cast v1, Lug1/j$b;

    invoke-virtual {v1}, Lug1/j$b;->a()Lgt0/f;

    move-result-object v8

    const/4 v12, 0x0

    invoke-direct {v7, v8, v5, v6, v12}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v6, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v1}, Lug1/j$b;->b()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v8

    invoke-virtual {v1}, Lug1/j$b;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v4, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput-object v7, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v2, Lug1/b$g$a$a;->L:I

    iput v5, v2, Lug1/b$g$a$a;->M:I

    const/16 v9, 0xb

    iput v9, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v6, v8, v1, v7, v2}, Lug1/b;->G(Lug1/b;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_16

    goto/16 :goto_14

    :cond_16
    move-object v6, v4

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_11
    iget-object v4, v0, Lug1/b$g$a;->x:Lug1/b;

    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v6, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput-object v5, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lug1/b$g$a$a;->L:I

    iput v1, v2, Lug1/b$g$a$a;->M:I

    const/16 v1, 0xc

    iput v1, v2, Lug1/b$g$a$a;->x:I

    invoke-static {v4, v2}, Lug1/b;->i(Lug1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    goto/16 :goto_14

    :cond_17
    instance-of v7, v1, Lug1/j$a;

    if-eqz v7, :cond_18

    iget-object v7, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v7}, Lug1/b;->h()Ltr2/n;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    new-array v8, v5, [Lqr2/a$a;

    invoke-interface {v7, v1, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lgt0/h$b;

    sget-object v7, Lgt0/f$i;->b:Lgt0/f$i;

    const/4 v12, 0x0

    invoke-direct {v1, v7, v5, v6, v12}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_12
    move v7, v5

    move-object v5, v1

    goto :goto_13

    :cond_18
    const/4 v5, 0x0

    instance-of v7, v1, Lug1/j$i;

    if-eqz v7, :cond_19

    iget-object v7, v0, Lug1/b$g$a;->x:Lug1/b;

    invoke-virtual {v7}, Lug1/b;->h()Ltr2/n;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Firmware update interrupted >> "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v8, v5, [Lqr2/a$a;

    invoke-interface {v7, v1, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lgt0/h$b;

    sget-object v7, Lgt0/f$i;->b:Lgt0/f$i;

    const/4 v12, 0x0

    invoke-direct {v1, v7, v5, v6, v12}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_12

    :cond_19
    const/4 v12, 0x0

    new-instance v1, Lgt0/h$b;

    sget-object v7, Lgt0/f$g;->b:Lgt0/f$g;

    invoke-direct {v1, v7, v5, v6, v12}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_12

    :goto_13
    iput-object v12, v2, Lug1/b$g$a$a;->y:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->G:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->I:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->J:Ljava/lang/Object;

    iput-object v12, v2, Lug1/b$g$a$a;->K:Ljava/lang/Object;

    iput v7, v2, Lug1/b$g$a$a;->L:I

    const/16 v1, 0xd

    iput v1, v2, Lug1/b$g$a$a;->x:I

    invoke-interface {v4, v5, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1a

    :goto_14
    return-object v3

    :cond_1a
    :goto_15
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
