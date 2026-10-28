.class public final Lb3/f3;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lb3/f3;->w:I

    iput-object p1, p0, Lb3/f3;->x:Ljava/lang/Object;

    iput-object p2, p0, Lb3/f3;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb3/f3;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 39

    move-object/from16 v1, p0

    iget v0, v1, Lb3/f3;->w:I

    iget-object v2, v1, Lb3/f3;->z:Ljava/lang/Object;

    iget-object v3, v1, Lb3/f3;->y:Ljava/lang/Object;

    iget-object v4, v1, Lb3/f3;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "about to boot; userId="

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", deviceId="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", userProperties="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v4, Ljava/util/List;

    check-cast v3, Le4/m;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v0, :cond_2

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    invoke-interface {v8}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Le4/i;

    if-eqz v9, :cond_0

    move-object v7, v8

    check-cast v7, Le4/i;

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_1

    iget-object v8, v7, Le4/i;->w:Le4/f;

    iget-object v9, v3, Le4/m;->w:Le4/k;

    invoke-virtual {v9, v8}, Le4/k;->a(Le4/q;)Li4/g;

    move-result-object v9

    new-instance v10, Le4/e;

    iget-object v8, v8, Le4/f;->c:Ljava/lang/Object;

    invoke-direct {v10, v8, v9}, Le4/e;-><init>(Ljava/lang/Object;Li4/g;)V

    iget-object v8, v7, Le4/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v8, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v8, v3, Le4/m;->F:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, v3, Le4/m;->w:Le4/k;

    check-cast v2, Le4/s;

    iget-object v3, v0, Le4/k;->a:Li4/g;

    new-instance v4, La3/p;

    const/16 v0, 0xe

    invoke-direct {v4, v0, v5}, La3/p;-><init>(IZ)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, La3/p;->x:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, La3/p;->y:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, La3/p;->z:Ljava/lang/Object;

    invoke-virtual {v3}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_99

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v3, v8}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_0

    :goto_3
    const/4 v9, -0x1

    goto :goto_4

    :sswitch_0
    const-string v9, "Variables"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_3

    :cond_3
    const/4 v9, 0x2

    goto :goto_4

    :sswitch_1
    const-string v9, "Generate"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_3

    :cond_4
    const/4 v9, 0x1

    goto :goto_4

    :sswitch_2
    const-string v9, "Helpers"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_3

    :cond_5
    move v9, v5

    :goto_4
    packed-switch v9, :pswitch_data_1

    instance-of v9, v0, Li4/g;

    if-eqz v9, :cond_82

    move-object v9, v0

    check-cast v9, Li4/g;

    invoke-virtual {v9}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    const-string v15, "type"

    if-eqz v14, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-virtual {v9, v15}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_80

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/16 v16, 0x9

    sparse-switch v14, :sswitch_data_1

    :goto_6
    const/4 v14, -0x1

    goto/16 :goto_7

    :sswitch_3
    const-string v14, "hGuideline"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    goto :goto_6

    :cond_8
    move/from16 v14, v16

    goto/16 :goto_7

    :sswitch_4
    const-string v14, "vFlow"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    goto :goto_6

    :cond_9
    const/16 v14, 0x8

    goto/16 :goto_7

    :sswitch_5
    const-string v14, "hFlow"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_6

    :cond_a
    const/4 v14, 0x7

    goto :goto_7

    :sswitch_6
    const-string v14, "grid"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_b

    goto :goto_6

    :cond_b
    const/4 v14, 0x6

    goto :goto_7

    :sswitch_7
    const-string v14, "row"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_c

    goto :goto_6

    :cond_c
    const/4 v14, 0x5

    goto :goto_7

    :sswitch_8
    const-string v14, "barrier"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_d

    goto :goto_6

    :cond_d
    const/4 v14, 0x4

    goto :goto_7

    :sswitch_9
    const-string v14, "vChain"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_e

    goto :goto_6

    :cond_e
    const/4 v14, 0x3

    goto :goto_7

    :sswitch_a
    const-string v14, "hChain"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_f

    goto :goto_6

    :cond_f
    const/4 v14, 0x2

    goto :goto_7

    :sswitch_b
    const-string v14, "column"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_10

    goto :goto_6

    :cond_10
    const/4 v14, 0x1

    goto :goto_7

    :sswitch_c
    const-string v14, "vGuideline"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    goto :goto_6

    :cond_11
    move v14, v5

    :goto_7
    const-string v13, "start"

    const-string v12, "end"

    const-string v11, "top"

    const-string v10, "bottom"

    const/16 v20, 0xb

    const/16 v21, 0xa

    const-string v7, "contains"

    const/16 v22, 0x0

    const-string v5, "\""

    const-string v1, " contains should be an array \""

    move-object/from16 v23, v3

    const-string v3, ""

    const/high16 v24, 0x7fc00000    # Float.NaN

    packed-switch v14, :pswitch_data_2

    :goto_8
    move-object/from16 v27, v6

    move-object v6, v4

    goto/16 :goto_46

    :pswitch_1
    const/4 v14, 0x0

    invoke-static {v14, v2, v8, v9}, Lpf/c;->N(ILe4/s;Ljava/lang/String;Li4/g;)V

    goto :goto_8

    :pswitch_2
    const/4 v14, 0x0

    const/high16 v25, 0x3f000000    # 0.5f

    invoke-static/range {v25 .. v25}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v14, 0x76

    if-ne v0, v14, :cond_12

    const/4 v0, 0x1

    goto :goto_9

    :cond_12
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {v2, v8}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v14

    move/from16 v27, v0

    iget-object v0, v14, Lj4/b;->c:Ljava/lang/Object;

    if-eqz v0, :cond_14

    instance-of v0, v0, Lk4/e;

    if-nez v0, :cond_13

    goto :goto_a

    :cond_13
    move-object/from16 v27, v6

    const/4 v6, 0x7

    goto :goto_c

    :cond_14
    :goto_a
    if-eqz v27, :cond_15

    new-instance v0, Lk4/e;

    move-object/from16 v27, v6

    const/16 v6, 0x8

    invoke-direct {v0, v2, v6}, Lk4/e;-><init>(Le4/s;I)V

    const/4 v6, 0x7

    goto :goto_b

    :cond_15
    move-object/from16 v27, v6

    const/16 v6, 0x8

    new-instance v0, Lk4/e;

    const/4 v6, 0x7

    invoke-direct {v0, v2, v6}, Lk4/e;-><init>(Le4/s;I)V

    :goto_b
    iput-object v0, v14, Lj4/b;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Lj4/g;->a()Lm4/e;

    move-result-object v0

    invoke-virtual {v14, v0}, Lj4/b;->b(Lm4/e;)V

    :goto_c
    iget-object v0, v14, Lj4/b;->c:Ljava/lang/Object;

    check-cast v0, Lk4/e;

    invoke-virtual {v9}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_d
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_43

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v6, v19

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v19

    sparse-switch v19, :sswitch_data_2

    move-object/from16 v19, v14

    :goto_e
    const/4 v14, -0x1

    goto/16 :goto_10

    :sswitch_d
    move-object/from16 v19, v14

    const-string v14, "wrap"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_16

    goto/16 :goto_f

    :cond_16
    const/16 v14, 0xc

    goto/16 :goto_10

    :sswitch_e
    move-object/from16 v19, v14

    const-string v14, "vGap"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_17

    goto/16 :goto_f

    :cond_17
    move/from16 v14, v20

    goto/16 :goto_10

    :sswitch_f
    move-object/from16 v19, v14

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_18

    goto/16 :goto_f

    :cond_18
    move/from16 v14, v21

    goto/16 :goto_10

    :sswitch_10
    move-object/from16 v19, v14

    const-string v14, "hGap"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_19

    goto/16 :goto_f

    :cond_19
    move/from16 v14, v16

    goto/16 :goto_10

    :sswitch_11
    move-object/from16 v19, v14

    const-string v14, "maxElement"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1a

    goto/16 :goto_f

    :cond_1a
    const/16 v14, 0x8

    goto/16 :goto_10

    :sswitch_12
    move-object/from16 v19, v14

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1b

    goto/16 :goto_f

    :cond_1b
    const/4 v14, 0x7

    goto/16 :goto_10

    :sswitch_13
    move-object/from16 v19, v14

    const-string v14, "vFlowBias"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1c

    goto :goto_f

    :cond_1c
    const/4 v14, 0x6

    goto :goto_10

    :sswitch_14
    move-object/from16 v19, v14

    const-string v14, "padding"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1d

    goto :goto_f

    :cond_1d
    const/4 v14, 0x5

    goto :goto_10

    :sswitch_15
    move-object/from16 v19, v14

    const-string v14, "vStyle"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1e

    goto :goto_f

    :cond_1e
    const/4 v14, 0x4

    goto :goto_10

    :sswitch_16
    move-object/from16 v19, v14

    const-string v14, "vAlign"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1f

    goto :goto_f

    :cond_1f
    const/4 v14, 0x3

    goto :goto_10

    :sswitch_17
    move-object/from16 v19, v14

    const-string v14, "hFlowBias"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_20

    goto :goto_f

    :cond_20
    const/4 v14, 0x2

    goto :goto_10

    :sswitch_18
    move-object/from16 v19, v14

    const-string v14, "hStyle"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_21

    goto :goto_f

    :cond_21
    const/4 v14, 0x1

    goto :goto_10

    :sswitch_19
    move-object/from16 v19, v14

    const-string v14, "hAlign"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_22

    :goto_f
    goto/16 :goto_e

    :cond_22
    const/4 v14, 0x0

    :goto_10
    packed-switch v14, :pswitch_data_3

    invoke-virtual {v2, v8}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v14

    invoke-static {v4, v2, v9, v14, v6}, Lpf/c;->k(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V

    :goto_11
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v15

    goto/16 :goto_23

    :pswitch_3
    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    invoke-virtual {v6}, Li4/c;->c()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lj4/j;->a(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v6}, Lk4/e;->O(I)V

    goto :goto_11

    :pswitch_4
    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    invoke-virtual {v6}, Li4/c;->e()I

    move-result v6

    invoke-virtual {v0, v6}, Lk4/e;->M(I)V

    goto :goto_11

    :pswitch_5
    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    invoke-virtual {v6}, Li4/c;->c()Ljava/lang/String;

    move-result-object v6

    const-string v14, "hFlow"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lk4/e;->G(I)V

    goto :goto_11

    :cond_23
    const/4 v6, 0x1

    invoke-virtual {v0, v6}, Lk4/e;->G(I)V

    goto :goto_11

    :pswitch_6
    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    invoke-virtual {v6}, Li4/c;->e()I

    move-result v6

    invoke-virtual {v0, v6}, Lk4/e;->z(I)V

    goto :goto_11

    :pswitch_7
    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    invoke-virtual {v6}, Li4/c;->e()I

    move-result v6

    invoke-virtual {v0, v6}, Lk4/e;->F(I)V

    goto :goto_11

    :pswitch_8
    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    instance-of v14, v6, Li4/a;

    if-eqz v14, :cond_2c

    move-object v14, v6

    check-cast v14, Li4/a;

    move-object/from16 v28, v6

    iget-object v6, v14, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    move-object/from16 v29, v15

    const/4 v15, 0x1

    if-ge v6, v15, :cond_24

    :goto_12
    move-object/from16 v31, v4

    goto/16 :goto_18

    :cond_24
    const/4 v6, 0x0

    :goto_13
    iget-object v15, v14, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v6, v15, :cond_2a

    invoke-virtual {v14, v6}, Li4/b;->n(I)Li4/c;

    move-result-object v15

    move/from16 v28, v6

    instance-of v6, v15, Li4/a;

    if-eqz v6, :cond_29

    check-cast v15, Li4/a;

    iget-object v6, v15, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_28

    const/4 v6, 0x0

    invoke-virtual {v15, v6}, Li4/b;->n(I)Li4/c;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Li4/c;->c()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v30, v14

    iget-object v14, v15, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object/from16 v31, v4

    const/4 v4, 0x2

    if-eq v14, v4, :cond_27

    const/4 v4, 0x3

    if-eq v14, v4, :cond_26

    const/4 v4, 0x4

    if-eq v14, v4, :cond_25

    move/from16 v4, v24

    move v14, v4

    move v15, v14

    goto :goto_15

    :cond_25
    const/4 v4, 0x1

    invoke-virtual {v15, v4}, Li4/b;->p(I)F

    move-result v14

    move/from16 v18, v14

    const/4 v4, 0x2

    invoke-virtual {v15, v4}, Li4/b;->p(I)F

    move-result v14

    iget-object v4, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v4, v14}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v4

    const/4 v14, 0x3

    invoke-virtual {v15, v14}, Li4/b;->p(I)F

    move-result v15

    iget-object v14, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v14, v15}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v14

    move v15, v14

    move/from16 v14, v18

    goto :goto_15

    :cond_26
    const/4 v4, 0x1

    invoke-virtual {v15, v4}, Li4/b;->p(I)F

    move-result v14

    const/4 v4, 0x2

    invoke-virtual {v15, v4}, Li4/b;->p(I)F

    move-result v15

    iget-object v4, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v4, v15}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v4

    :goto_14
    move v15, v4

    goto :goto_15

    :cond_27
    const/4 v4, 0x1

    invoke-virtual {v15, v4}, Li4/b;->p(I)F

    move-result v14

    move/from16 v4, v24

    goto :goto_14

    :goto_15
    invoke-virtual {v0, v6, v14, v4, v15}, Lk4/e;->t(Ljava/lang/String;FFF)V

    goto :goto_16

    :cond_28
    move-object/from16 v31, v4

    move-object/from16 v30, v14

    goto :goto_16

    :cond_29
    move-object/from16 v31, v4

    move-object/from16 v30, v14

    invoke-virtual {v15}, Li4/c;->c()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Lj4/g;->q([Ljava/lang/Object;)V

    :goto_16
    add-int/lit8 v6, v28, 0x1

    move-object/from16 v14, v30

    move-object/from16 v4, v31

    goto/16 :goto_13

    :cond_2a
    move-object/from16 v31, v4

    :catch_0
    :cond_2b
    :goto_17
    move-object/from16 v28, v5

    goto/16 :goto_23

    :cond_2c
    move-object/from16 v28, v6

    goto/16 :goto_12

    :goto_18
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-static {v8, v1}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v28 .. v28}, Li4/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_39

    :pswitch_9
    move-object/from16 v31, v4

    move-object/from16 v29, v15

    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v6, v4, Li4/a;

    if-eqz v6, :cond_2e

    move-object v6, v4

    check-cast v6, Li4/a;

    iget-object v14, v6, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x1

    if-le v14, v15, :cond_2e

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Li4/b;->p(I)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    iget-object v15, v6, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    move-object/from16 v28, v4

    const/4 v4, 0x2

    if-le v15, v4, :cond_2d

    invoke-virtual {v6, v4}, Li4/b;->p(I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    move-object v6, v4

    :goto_19
    move-object/from16 v4, v28

    goto :goto_1a

    :cond_2d
    move-object/from16 v6, v26

    goto :goto_19

    :cond_2e
    invoke-virtual {v4}, Li4/c;->d()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    move-object/from16 v4, v26

    move-object v6, v4

    :goto_1a
    :try_start_0
    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v14

    iput v14, v0, Lj4/b;->i:F

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v14

    cmpl-float v14, v14, v25

    if-eqz v14, :cond_2f

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->w(F)V

    :cond_2f
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v4

    cmpl-float v4, v4, v25

    if-eqz v4, :cond_2b

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->D(F)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_17

    :pswitch_a
    move-object/from16 v31, v4

    move-object/from16 v29, v15

    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v6, v4, Li4/a;

    if-eqz v6, :cond_31

    move-object v6, v4

    check-cast v6, Li4/a;

    iget-object v14, v6, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x1

    if-le v14, v15, :cond_31

    move-object/from16 v28, v4

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Li4/b;->r(I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v6, v15}, Li4/b;->r(I)I

    move-result v14

    int-to-float v14, v14

    iget-object v15, v6, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    move/from16 v30, v4

    const/4 v4, 0x2

    if-le v15, v4, :cond_30

    invoke-virtual {v6, v4}, Li4/b;->r(I)I

    move-result v6

    int-to-float v4, v6

    :try_start_1
    move-object/from16 v6, v28

    check-cast v6, Li4/a;

    const/4 v15, 0x3

    invoke-virtual {v6, v15}, Li4/b;->r(I)I

    move-result v6
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    int-to-float v6, v6

    move-object/from16 v28, v5

    move v15, v6

    move v6, v4

    :goto_1b
    move/from16 v4, v30

    goto :goto_1c

    :catch_1
    move v6, v4

    move-object/from16 v28, v5

    move/from16 v15, v22

    goto :goto_1b

    :cond_30
    move-object/from16 v28, v5

    move v15, v14

    move/from16 v4, v30

    move v6, v4

    goto :goto_1c

    :cond_31
    move-object/from16 v28, v4

    invoke-virtual/range {v28 .. v28}, Li4/c;->e()I

    move-result v4

    int-to-float v4, v4

    move v6, v4

    move v14, v6

    move v15, v14

    move-object/from16 v28, v5

    :goto_1c
    iget-object v5, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v5, v4}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->I(I)V

    iget-object v4, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v4, v14}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->K(I)V

    iget-object v4, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v4, v6}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->J(I)V

    iget-object v4, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v4, v15}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->H(I)V

    goto/16 :goto_23

    :pswitch_b
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v15

    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/a;

    if-eqz v5, :cond_33

    move-object v5, v4

    check-cast v5, Li4/a;

    iget-object v6, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v15, 0x1

    if-le v6, v15, :cond_33

    const/4 v14, 0x0

    invoke-virtual {v5, v14}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v15}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v6

    iget-object v14, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x2

    if-le v14, v15, :cond_32

    invoke-virtual {v5, v15}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1d

    :cond_32
    move-object v5, v3

    goto :goto_1d

    :cond_33
    invoke-virtual {v4}, Li4/c;->c()Ljava/lang/String;

    move-result-object v6

    move-object v4, v3

    move-object v5, v4

    :goto_1d
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_34

    invoke-static {v6}, Lj4/i;->a(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v6}, Lk4/e;->N(I)V

    :cond_34
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_35

    invoke-static {v4}, Lj4/i;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->x(I)V

    :cond_35
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_42

    invoke-static {v5}, Lj4/i;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->E(I)V

    goto/16 :goto_23

    :pswitch_c
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v15

    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    invoke-virtual {v4}, Li4/c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_3

    :goto_1e
    const/4 v4, -0x1

    goto :goto_1f

    :sswitch_1a
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_36

    goto :goto_1e

    :cond_36
    const/4 v4, 0x2

    goto :goto_1f

    :sswitch_1b
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_37

    goto :goto_1e

    :cond_37
    const/4 v4, 0x1

    goto :goto_1f

    :sswitch_1c
    const-string v5, "baseline"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_38

    goto :goto_1e

    :cond_38
    const/4 v4, 0x0

    :goto_1f
    packed-switch v4, :pswitch_data_4

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Lk4/e;->L(I)V

    :goto_20
    const/4 v15, 0x1

    goto/16 :goto_23

    :pswitch_d
    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lk4/e;->L(I)V

    goto :goto_20

    :pswitch_e
    const/4 v15, 0x1

    invoke-virtual {v0, v15}, Lk4/e;->L(I)V

    goto/16 :goto_23

    :pswitch_f
    const/4 v4, 0x3

    const/4 v15, 0x1

    invoke-virtual {v0, v4}, Lk4/e;->L(I)V

    goto/16 :goto_23

    :pswitch_10
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v15

    const/4 v15, 0x1

    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/a;

    if-eqz v5, :cond_3a

    move-object v5, v4

    check-cast v5, Li4/a;

    iget-object v6, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-le v6, v15, :cond_3a

    const/4 v14, 0x0

    invoke-virtual {v5, v14}, Li4/b;->p(I)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v5, v15}, Li4/b;->p(I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    iget-object v14, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x2

    if-le v14, v15, :cond_39

    invoke-virtual {v5, v15}, Li4/b;->p(I)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    goto :goto_21

    :cond_39
    move-object/from16 v5, v26

    goto :goto_21

    :cond_3a
    invoke-virtual {v4}, Li4/c;->d()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object/from16 v4, v26

    move-object v5, v4

    :goto_21
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    iput v6, v0, Lj4/b;->h:F

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v6

    cmpl-float v6, v6, v25

    if-eqz v6, :cond_3b

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->u(F)V

    :cond_3b
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v4

    cmpl-float v4, v4, v25

    if-eqz v4, :cond_42

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->B(F)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_23

    :pswitch_11
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v15

    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/a;

    if-eqz v5, :cond_3d

    move-object v5, v4

    check-cast v5, Li4/a;

    iget-object v6, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v15, 0x1

    if-le v6, v15, :cond_3d

    const/4 v14, 0x0

    invoke-virtual {v5, v14}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v15}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v6

    iget-object v14, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x2

    if-le v14, v15, :cond_3c

    invoke-virtual {v5, v15}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_22

    :cond_3c
    move-object v5, v3

    goto :goto_22

    :cond_3d
    invoke-virtual {v4}, Li4/c;->c()Ljava/lang/String;

    move-result-object v6

    move-object v4, v3

    move-object v5, v4

    :goto_22
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3e

    invoke-static {v6}, Lj4/i;->a(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v6}, Lk4/e;->A(I)V

    :cond_3e
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3f

    invoke-static {v4}, Lj4/i;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->v(I)V

    :cond_3f
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_42

    invoke-static {v5}, Lj4/i;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v4}, Lk4/e;->C(I)V

    goto :goto_23

    :pswitch_12
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v15

    invoke-virtual {v9, v6}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    invoke-virtual {v4}, Li4/c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_41

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_40

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Lk4/e;->y(I)V

    goto :goto_23

    :cond_40
    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lk4/e;->y(I)V

    goto :goto_23

    :cond_41
    const/4 v15, 0x1

    invoke-virtual {v0, v15}, Lk4/e;->y(I)V

    :catch_2
    :cond_42
    :goto_23
    move-object/from16 v14, v19

    move-object/from16 v5, v28

    move-object/from16 v15, v29

    move-object/from16 v4, v31

    const/4 v6, 0x7

    goto/16 :goto_d

    :cond_43
    move-object/from16 v31, v4

    goto/16 :goto_39

    :pswitch_13
    move-object/from16 v31, v4

    move-object/from16 v27, v6

    iget-boolean v0, v2, Le4/s;->b:Z

    invoke-virtual {v2, v8}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v1

    iget-object v3, v1, Lj4/b;->c:Ljava/lang/Object;

    if-eqz v3, :cond_44

    instance-of v3, v3, Lk4/b;

    if-nez v3, :cond_45

    :cond_44
    new-instance v3, Lk4/b;

    invoke-direct {v3, v2}, Lk4/b;-><init>(Le4/s;)V

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lk4/b;->t(I)V

    iput-object v3, v1, Lj4/b;->c:Ljava/lang/Object;

    invoke-virtual {v3}, Lj4/g;->a()Lm4/e;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj4/b;->b(Lm4/e;)V

    :cond_45
    iget-object v1, v1, Lj4/b;->c:Ljava/lang/Object;

    check-cast v1, Lk4/b;

    invoke-virtual {v9}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_46
    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_69

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_4

    :goto_25
    const/4 v5, -0x1

    goto :goto_26

    :sswitch_1d
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_47

    goto :goto_25

    :cond_47
    const/4 v5, 0x2

    goto :goto_26

    :sswitch_1e
    const-string v5, "direction"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_48

    goto :goto_25

    :cond_48
    const/4 v5, 0x1

    goto :goto_26

    :sswitch_1f
    const-string v5, "margin"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_49

    goto :goto_25

    :cond_49
    const/4 v5, 0x0

    :goto_26
    packed-switch v5, :pswitch_data_5

    goto :goto_24

    :pswitch_14
    invoke-virtual {v9, v4}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/a;

    if-eqz v5, :cond_4a

    check-cast v4, Li4/a;

    goto :goto_27

    :cond_4a
    const/4 v4, 0x0

    :goto_27
    if-eqz v4, :cond_46

    const/4 v5, 0x0

    :goto_28
    iget-object v6, v4, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_46

    invoke-virtual {v4, v5}, Li4/b;->n(I)Li4/c;

    move-result-object v6

    invoke-virtual {v6}, Li4/c;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v6}, Lj4/g;->q([Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_28

    :pswitch_15
    invoke-virtual {v9, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_5

    :goto_29
    const/4 v4, -0x1

    goto :goto_2a

    :sswitch_20
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4b

    goto :goto_29

    :cond_4b
    const/4 v4, 0x5

    goto :goto_2a

    :sswitch_21
    const-string v5, "right"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4c

    goto :goto_29

    :cond_4c
    const/4 v4, 0x4

    goto :goto_2a

    :sswitch_22
    const-string v5, "left"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4d

    goto :goto_29

    :cond_4d
    const/4 v4, 0x3

    goto :goto_2a

    :sswitch_23
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4e

    goto :goto_29

    :cond_4e
    const/4 v4, 0x2

    goto :goto_2a

    :sswitch_24
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4f

    goto :goto_29

    :cond_4f
    const/4 v4, 0x1

    goto :goto_2a

    :sswitch_25
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_50

    goto :goto_29

    :cond_50
    const/4 v4, 0x0

    :goto_2a
    packed-switch v4, :pswitch_data_6

    goto/16 :goto_24

    :pswitch_16
    if-eqz v0, :cond_51

    const/4 v15, 0x1

    invoke-virtual {v1, v15}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :cond_51
    const/4 v4, 0x2

    const/4 v15, 0x1

    invoke-virtual {v1, v4}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :pswitch_17
    const/4 v4, 0x2

    const/4 v15, 0x1

    invoke-virtual {v1, v4}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :pswitch_18
    const/4 v4, 0x2

    const/4 v15, 0x1

    invoke-virtual {v1, v15}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :pswitch_19
    const/4 v4, 0x2

    const/4 v5, 0x5

    const/4 v15, 0x1

    invoke-virtual {v1, v5}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :pswitch_1a
    const/4 v4, 0x2

    const/4 v15, 0x1

    if-eqz v0, :cond_52

    invoke-virtual {v1, v4}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :cond_52
    invoke-virtual {v1, v15}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :pswitch_1b
    const/4 v4, 0x6

    invoke-virtual {v1, v4}, Lk4/b;->t(I)V

    goto/16 :goto_24

    :pswitch_1c
    invoke-virtual {v9, v4}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/e;

    if-eqz v5, :cond_53

    invoke-virtual {v4}, Li4/c;->d()F

    move-result v4

    goto :goto_2b

    :cond_53
    move/from16 v4, v24

    :goto_2b
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_46

    iget-object v5, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v5, v4}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v1, v4}, Lk4/b;->l(Ljava/lang/Float;)Lj4/b;

    goto/16 :goto_24

    :pswitch_1d
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move-object/from16 v27, v6

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x68

    if-ne v0, v3, :cond_54

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Le4/s;->e(I)Lj4/g;

    move-result-object v0

    check-cast v0, Lk4/h;

    goto :goto_2c

    :cond_54
    const/4 v4, 0x2

    invoke-virtual {v2, v4}, Le4/s;->e(I)Lj4/g;

    move-result-object v0

    check-cast v0, Lk4/i;

    :goto_2c
    iput-object v8, v0, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v9}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_69

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_6

    :goto_2e
    const/4 v5, -0x1

    goto :goto_2f

    :sswitch_26
    const-string v5, "style"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_55

    goto :goto_2e

    :cond_55
    const/4 v5, 0x7

    goto :goto_2f

    :sswitch_27
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_56

    goto :goto_2e

    :cond_56
    const/4 v5, 0x6

    goto :goto_2f

    :sswitch_28
    const-string v5, "right"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_57

    goto :goto_2e

    :cond_57
    const/4 v5, 0x5

    goto :goto_2f

    :sswitch_29
    const-string v5, "left"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_58

    goto :goto_2e

    :cond_58
    const/4 v5, 0x4

    goto :goto_2f

    :sswitch_2a
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_59

    goto :goto_2e

    :cond_59
    const/4 v5, 0x3

    goto :goto_2f

    :sswitch_2b
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5a

    goto :goto_2e

    :cond_5a
    const/4 v5, 0x2

    goto :goto_2f

    :sswitch_2c
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5b

    goto :goto_2e

    :cond_5b
    const/4 v5, 0x1

    goto :goto_2f

    :sswitch_2d
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5c

    goto :goto_2e

    :cond_5c
    const/4 v5, 0x0

    :goto_2f
    packed-switch v5, :pswitch_data_7

    :cond_5d
    :goto_30
    move-object/from16 v5, v28

    move-object/from16 v6, v31

    goto/16 :goto_3a

    :pswitch_1e
    invoke-virtual {v9, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/a;

    if-eqz v5, :cond_5e

    move-object v5, v4

    check-cast v5, Li4/a;

    iget-object v6, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v15, 0x1

    if-le v6, v15, :cond_5e

    const/4 v14, 0x0

    invoke-virtual {v5, v14}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v15}, Li4/b;->p(I)F

    move-result v5

    invoke-virtual {v0, v5}, Lk4/c;->u(F)V

    goto :goto_31

    :cond_5e
    invoke-virtual {v4}, Li4/c;->c()Ljava/lang/String;

    move-result-object v4

    :goto_31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "packed"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_60

    const-string v5, "spread_inside"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5f

    sget-object v4, Lj4/i;->w:Lj4/i;

    invoke-virtual {v0, v4}, Lk4/c;->z(Lj4/i;)V

    goto :goto_30

    :cond_5f
    sget-object v4, Lj4/i;->x:Lj4/i;

    invoke-virtual {v0, v4}, Lk4/c;->z(Lj4/i;)V

    goto :goto_30

    :cond_60
    sget-object v4, Lj4/i;->y:Lj4/i;

    invoke-virtual {v0, v4}, Lk4/c;->z(Lj4/i;)V

    goto :goto_30

    :pswitch_1f
    invoke-virtual {v9, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/a;

    if-eqz v5, :cond_68

    move-object v5, v4

    check-cast v5, Li4/a;

    iget-object v6, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v15, 0x1

    if-ge v6, v15, :cond_61

    goto/16 :goto_38

    :cond_61
    const/4 v4, 0x0

    :goto_32
    iget-object v6, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v4, v6, :cond_5d

    invoke-virtual {v5, v4}, Li4/b;->n(I)Li4/c;

    move-result-object v6

    instance-of v14, v6, Li4/a;

    if-eqz v14, :cond_66

    check-cast v6, Li4/a;

    iget-object v14, v6, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-lez v14, :cond_67

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Li4/b;->n(I)Li4/c;

    move-result-object v15

    invoke-virtual {v15}, Li4/c;->c()Ljava/lang/String;

    move-result-object v33

    iget-object v14, v6, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x2

    if-eq v14, v15, :cond_65

    const/4 v15, 0x3

    if-eq v14, v15, :cond_64

    const/4 v15, 0x4

    if-eq v14, v15, :cond_63

    const/4 v15, 0x6

    if-eq v14, v15, :cond_62

    move-object/from16 v32, v0

    move/from16 v34, v24

    move/from16 v35, v34

    :goto_33
    move/from16 v36, v35

    move/from16 v37, v36

    :goto_34
    move/from16 v38, v37

    goto/16 :goto_36

    :cond_62
    const/4 v14, 0x1

    invoke-virtual {v6, v14}, Li4/b;->p(I)F

    move-result v16

    const/4 v14, 0x2

    invoke-virtual {v6, v14}, Li4/b;->p(I)F

    move-result v15

    iget-object v14, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v14, v15}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v14

    move-object/from16 v32, v0

    const/4 v15, 0x3

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v0

    iget-object v15, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v15, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    move/from16 v17, v0

    const/4 v15, 0x4

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v0

    iget-object v15, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v15, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    const/4 v15, 0x5

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v6

    iget-object v15, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v15, v6}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v6

    move/from16 v37, v0

    move/from16 v38, v6

    move/from16 v35, v14

    move/from16 v34, v16

    move/from16 v36, v17

    goto :goto_36

    :cond_63
    move-object/from16 v32, v0

    const/4 v15, 0x1

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v16

    const/4 v14, 0x2

    invoke-virtual {v6, v14}, Li4/b;->p(I)F

    move-result v0

    iget-object v14, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v14, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v14

    const/4 v15, 0x3

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v0

    iget-object v6, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v6, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    move/from16 v36, v0

    move/from16 v35, v14

    :goto_35
    move/from16 v34, v16

    move/from16 v37, v24

    goto :goto_34

    :cond_64
    move-object/from16 v32, v0

    const/4 v15, 0x1

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v16

    const/4 v14, 0x2

    invoke-virtual {v6, v14}, Li4/b;->p(I)F

    move-result v0

    iget-object v6, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v6, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v14

    move/from16 v35, v14

    move/from16 v36, v35

    goto :goto_35

    :cond_65
    move-object/from16 v32, v0

    const/4 v15, 0x1

    invoke-virtual {v6, v15}, Li4/b;->p(I)F

    move-result v16

    move/from16 v34, v16

    move/from16 v35, v24

    goto/16 :goto_33

    :goto_36
    invoke-virtual/range {v32 .. v38}, Lk4/c;->t(Ljava/lang/String;FFFFF)V

    move-object/from16 v0, v32

    goto :goto_37

    :cond_66
    invoke-virtual {v6}, Li4/c;->c()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v6}, Lj4/g;->q([Ljava/lang/Object;)V

    :cond_67
    :goto_37
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_32

    :cond_68
    :goto_38
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-static {v8, v1}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Li4/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v28

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_69
    :goto_39
    move-object/from16 v6, v31

    goto/16 :goto_46

    :pswitch_20
    move-object/from16 v5, v28

    move-object/from16 v6, v31

    invoke-static {v6, v2, v9, v0, v4}, Lpf/c;->K(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V

    :goto_3a
    move-object/from16 v28, v5

    move-object/from16 v31, v6

    goto/16 :goto_2d

    :pswitch_21
    move-object/from16 v27, v6

    move-object v6, v4

    invoke-virtual {v2, v8}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v1

    iget-object v4, v1, Lj4/b;->c:Ljava/lang/Object;

    if-eqz v4, :cond_6a

    instance-of v4, v4, Lk4/f;

    if-nez v4, :cond_6d

    :cond_6a
    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x72

    if-ne v4, v5, :cond_6b

    move/from16 v0, v21

    goto :goto_3b

    :cond_6b
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x63

    if-ne v0, v4, :cond_6c

    move/from16 v0, v20

    goto :goto_3b

    :cond_6c
    move/from16 v0, v16

    :goto_3b
    new-instance v4, Lk4/f;

    invoke-direct {v4, v2, v0}, Lk4/f;-><init>(Le4/s;I)V

    iput-object v4, v1, Lj4/b;->c:Ljava/lang/Object;

    invoke-virtual {v4}, Lj4/g;->a()Lm4/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lj4/b;->b(Lm4/e;)V

    :cond_6d
    iget-object v0, v1, Lj4/b;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lk4/f;

    invoke-virtual {v9}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_81

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_7

    :goto_3d
    const/4 v5, -0x1

    goto/16 :goto_3e

    :sswitch_2e
    const-string v5, "columnWeights"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6e

    goto :goto_3d

    :cond_6e
    move/from16 v5, v20

    goto/16 :goto_3e

    :sswitch_2f
    const-string v5, "columns"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6f

    goto :goto_3d

    :cond_6f
    move/from16 v5, v21

    goto/16 :goto_3e

    :sswitch_30
    const-string v5, "rowWeights"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_70

    goto :goto_3d

    :cond_70
    move/from16 v5, v16

    goto/16 :goto_3e

    :sswitch_31
    const-string v5, "spans"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_71

    goto :goto_3d

    :cond_71
    const/16 v5, 0x8

    goto :goto_3e

    :sswitch_32
    const-string v5, "skips"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_72

    goto :goto_3d

    :cond_72
    const/4 v5, 0x7

    goto :goto_3e

    :sswitch_33
    const-string v5, "flags"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_73

    goto :goto_3d

    :cond_73
    const/4 v5, 0x6

    goto :goto_3e

    :sswitch_34
    const-string v5, "vGap"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_74

    goto :goto_3d

    :cond_74
    const/4 v5, 0x5

    goto :goto_3e

    :sswitch_35
    const-string v5, "rows"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_75

    goto :goto_3d

    :cond_75
    const/4 v5, 0x4

    goto :goto_3e

    :sswitch_36
    const-string v5, "hGap"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_76

    goto :goto_3d

    :cond_76
    const/4 v5, 0x3

    goto :goto_3e

    :sswitch_37
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_77

    goto :goto_3d

    :cond_77
    const/4 v5, 0x2

    goto :goto_3e

    :sswitch_38
    const-string v5, "padding"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_78

    goto :goto_3d

    :cond_78
    const/4 v5, 0x1

    goto :goto_3e

    :sswitch_39
    const-string v5, "orientation"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_79

    goto/16 :goto_3d

    :cond_79
    const/4 v5, 0x0

    :goto_3e
    const-string v10, ":"

    const-string v11, ","

    packed-switch v5, :pswitch_data_8

    invoke-virtual {v2, v8}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v5

    invoke-static {v6, v2, v9, v5, v0}, Lpf/c;->k(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V

    :cond_7a
    :goto_3f
    const/4 v14, 0x3

    const/4 v15, 0x2

    goto/16 :goto_3c

    :pswitch_22
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7a

    invoke-virtual {v0, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7a

    invoke-virtual {v1, v0}, Lk4/f;->t(Ljava/lang/String;)V

    goto :goto_3f

    :pswitch_23
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->e()I

    move-result v0

    if-lez v0, :cond_7a

    invoke-virtual {v1, v0}, Lk4/f;->u(I)V

    goto :goto_3f

    :pswitch_24
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7a

    invoke-virtual {v0, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7a

    invoke-virtual {v1, v0}, Lk4/f;->D(Ljava/lang/String;)V

    goto :goto_3f

    :pswitch_25
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7a

    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7a

    invoke-virtual {v1, v0}, Lk4/f;->G(Ljava/lang/String;)V

    goto :goto_3f

    :pswitch_26
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7a

    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7a

    invoke-virtual {v1, v0}, Lk4/f;->F(Ljava/lang/String;)V

    goto :goto_3f

    :pswitch_27
    :try_start_3
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    instance-of v5, v0, Li4/e;

    if-eqz v5, :cond_7b

    invoke-virtual {v0}, Li4/c;->e()I

    move-result v0

    move v5, v0

    move-object v0, v3

    goto :goto_42

    :catch_3
    move-exception v0

    goto :goto_40

    :cond_7b
    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_41

    :goto_40
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Error parsing grid flags "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move-object v0, v3

    :goto_41
    const/4 v5, 0x0

    :goto_42
    if-eqz v0, :cond_7c

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_7c

    invoke-virtual {v1, v0}, Lk4/f;->w(Ljava/lang/String;)V

    goto/16 :goto_3f

    :cond_7c
    invoke-virtual {v1, v5}, Lk4/f;->v(I)V

    goto/16 :goto_3f

    :pswitch_28
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->d()F

    move-result v0

    iget-object v5, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v5, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    invoke-virtual {v1, v0}, Lk4/f;->H(F)V

    goto/16 :goto_3f

    :pswitch_29
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->e()I

    move-result v0

    if-lez v0, :cond_7a

    invoke-virtual {v1, v0}, Lk4/f;->E(I)V

    goto/16 :goto_3f

    :pswitch_2a
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->d()F

    move-result v0

    iget-object v5, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v5, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    invoke-virtual {v1, v0}, Lk4/f;->x(F)V

    goto/16 :goto_3f

    :pswitch_2b
    invoke-virtual {v9, v0}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object v0

    instance-of v5, v0, Li4/a;

    if-eqz v5, :cond_7d

    check-cast v0, Li4/a;

    goto :goto_43

    :cond_7d
    const/4 v0, 0x0

    :goto_43
    if-eqz v0, :cond_7a

    const/4 v5, 0x0

    :goto_44
    iget-object v10, v0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v5, v10, :cond_7a

    invoke-virtual {v0, v5}, Li4/b;->n(I)Li4/c;

    move-result-object v10

    invoke-virtual {v10}, Li4/c;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v1, v10}, Lj4/g;->q([Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_44

    :pswitch_2c
    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    instance-of v5, v0, Li4/a;

    if-eqz v5, :cond_7f

    move-object v5, v0

    check-cast v5, Li4/a;

    iget-object v10, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v15, 0x1

    if-le v10, v15, :cond_7f

    const/4 v14, 0x0

    invoke-virtual {v5, v14}, Li4/b;->r(I)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v5, v15}, Li4/b;->r(I)I

    move-result v11

    int-to-float v11, v11

    iget-object v12, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v15, 0x2

    if-le v12, v15, :cond_7e

    invoke-virtual {v5, v15}, Li4/b;->r(I)I

    move-result v5

    int-to-float v5, v5

    :try_start_4
    check-cast v0, Li4/a;
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v14, 0x3

    :try_start_5
    invoke-virtual {v0, v14}, Li4/b;->r(I)I

    move-result v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_5

    int-to-float v0, v0

    goto :goto_45

    :catch_4
    const/4 v14, 0x3

    :catch_5
    move/from16 v0, v22

    goto :goto_45

    :cond_7e
    const/4 v14, 0x3

    move v5, v10

    move v0, v11

    goto :goto_45

    :cond_7f
    const/4 v14, 0x3

    const/4 v15, 0x2

    invoke-virtual {v0}, Li4/c;->e()I

    move-result v0

    int-to-float v10, v0

    move v0, v10

    move v5, v0

    move v11, v5

    :goto_45
    iget-object v12, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v12, v10}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    invoke-virtual {v1, v10}, Lk4/f;->B(I)V

    iget-object v10, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v10, v11}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    invoke-virtual {v1, v10}, Lk4/f;->C(I)V

    iget-object v10, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v10, v5}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v1, v5}, Lk4/f;->A(I)V

    iget-object v5, v2, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v5, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v1, v0}, Lk4/f;->z(I)V

    goto/16 :goto_3c

    :pswitch_2d
    const/4 v14, 0x3

    const/4 v15, 0x2

    invoke-virtual {v9, v0}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    invoke-virtual {v0}, Li4/c;->e()I

    move-result v0

    invoke-virtual {v1, v0}, Lk4/f;->y(I)V

    goto/16 :goto_3c

    :pswitch_2e
    move-object/from16 v27, v6

    const/4 v15, 0x1

    move-object v6, v4

    invoke-static {v15, v2, v8, v9}, Lpf/c;->N(ILe4/s;Ljava/lang/String;Li4/g;)V

    goto :goto_46

    :cond_80
    move-object/from16 v23, v3

    move-object/from16 v27, v6

    move-object v6, v4

    invoke-static {v2, v6, v8, v9}, Lpf/c;->O(Le4/s;La3/p;Ljava/lang/String;Li4/g;)V

    :cond_81
    :goto_46
    const/4 v7, 0x0

    goto/16 :goto_53

    :cond_82
    move-object/from16 v23, v3

    move-object/from16 v27, v6

    move-object v6, v4

    instance-of v1, v0, Li4/e;

    if-eqz v1, :cond_81

    invoke-virtual {v0}, Li4/c;->e()I

    move-result v0

    iget-object v1, v6, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_46

    :pswitch_2f
    move-object/from16 v23, v3

    move-object/from16 v27, v6

    move-object v6, v4

    instance-of v1, v0, Li4/g;

    if-eqz v1, :cond_81

    check-cast v0, Li4/g;

    invoke-virtual {v0}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_83
    :goto_47
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_81

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/e;

    if-eqz v5, :cond_84

    invoke-virtual {v4}, Li4/c;->e()I

    move-result v4

    iget-object v5, v6, La3/p;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_47

    :cond_84
    instance-of v5, v4, Li4/g;

    if-eqz v5, :cond_83

    check-cast v4, Li4/g;

    const-string v5, "from"

    invoke-virtual {v4, v5}, Li4/b;->z(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_86

    const-string v7, "to"

    invoke-virtual {v4, v7}, Li4/b;->z(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_86

    invoke-virtual {v4, v5}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v5

    invoke-virtual {v6, v5}, La3/p;->v(Li4/c;)F

    move-result v5

    invoke-virtual {v4, v7}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v7

    invoke-virtual {v6, v7}, La3/p;->v(Li4/c;)F

    move-result v7

    const-string v8, "prefix"

    invoke-virtual {v4, v8}, Li4/b;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "postfix"

    invoke-virtual {v4, v9}, Li4/b;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v9, v6, La3/p;->y:Ljava/lang/Object;

    check-cast v9, Ljava/util/HashMap;

    invoke-virtual {v9, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_85

    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_85
    new-instance v10, Lj4/c;

    invoke-direct {v10, v8, v4, v5, v7}, Lj4/c;-><init>(Ljava/lang/String;Ljava/lang/String;FF)V

    invoke-virtual {v9, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v6, La3/p;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v10}, Lj4/c;->a()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_47

    :cond_86
    invoke-virtual {v4, v5}, Li4/b;->z(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_88

    const-string v7, "step"

    invoke-virtual {v4, v7}, Li4/b;->z(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_88

    invoke-virtual {v4, v5}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v5

    invoke-virtual {v6, v5}, La3/p;->v(Li4/c;)F

    move-result v5

    invoke-virtual {v4, v7}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    invoke-virtual {v6, v4}, La3/p;->v(Li4/c;)F

    move-result v4

    iget-object v7, v6, La3/p;->y:Ljava/lang/Object;

    check-cast v7, Ljava/util/HashMap;

    invoke-virtual {v7, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_87

    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_87
    new-instance v8, Lj4/e;

    invoke-direct {v8, v5, v4}, Lj4/e;-><init>(FF)V

    invoke-virtual {v7, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_47

    :cond_88
    const-string v5, "ids"

    invoke-virtual {v4, v5}, Li4/b;->z(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8b

    invoke-virtual {v4, v5}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v5

    instance-of v7, v5, Li4/a;

    if-eqz v7, :cond_8a

    check-cast v5, Li4/a;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    :goto_48
    iget-object v8, v5, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v7, v8, :cond_89

    invoke-virtual {v5, v7}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_48

    :cond_89
    iget-object v5, v6, La3/p;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_47

    :cond_8a
    new-instance v0, Landroidx/constraintlayout/core/parser/CLParsingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no array found for key <ids>, found ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Li4/c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v0

    :cond_8b
    const-string v5, "tag"

    invoke-virtual {v4, v5}, Li4/b;->z(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_83

    invoke-virtual {v4, v5}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Le4/s;->e:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8c

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    goto :goto_49

    :cond_8c
    const/4 v4, 0x0

    :goto_49
    iget-object v5, v6, La3/p;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_47

    :pswitch_30
    move-object/from16 v23, v3

    move-object/from16 v27, v6

    move-object v6, v4

    instance-of v1, v0, Li4/g;

    if-eqz v1, :cond_81

    check-cast v0, Li4/g;

    invoke-virtual {v0}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_81

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    iget-object v5, v6, La3/p;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8e

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    goto :goto_4a

    :cond_8e
    const/4 v3, 0x0

    :goto_4a
    if-eqz v3, :cond_8d

    instance-of v5, v4, Li4/g;

    if-eqz v5, :cond_8d

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v7, v4

    check-cast v7, Li4/g;

    invoke-static {v2, v6, v5, v7}, Lpf/c;->O(Le4/s;La3/p;Ljava/lang/String;Li4/g;)V

    goto :goto_4b

    :pswitch_31
    move-object/from16 v23, v3

    move-object/from16 v27, v6

    const/4 v14, 0x3

    const/4 v15, 0x2

    move-object v6, v4

    instance-of v1, v0, Li4/a;

    if-eqz v1, :cond_81

    check-cast v0, Li4/a;

    const/4 v1, 0x0

    :goto_4c
    iget-object v3, v0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_81

    invoke-virtual {v0, v1}, Li4/b;->n(I)Li4/c;

    move-result-object v3

    instance-of v4, v3, Li4/a;

    if-eqz v4, :cond_93

    check-cast v3, Li4/a;

    iget-object v4, v3, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_98

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_8

    :goto_4d
    const/4 v4, -0x1

    goto :goto_4e

    :sswitch_3a
    const-string v4, "hGuideline"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8f

    goto :goto_4d

    :cond_8f
    move v4, v14

    goto :goto_4e

    :sswitch_3b
    const-string v4, "vChain"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_90

    goto :goto_4d

    :cond_90
    move v4, v15

    goto :goto_4e

    :sswitch_3c
    const-string v4, "hChain"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_91

    goto :goto_4d

    :cond_91
    const/4 v4, 0x1

    goto :goto_4e

    :sswitch_3d
    const-string v4, "vGuideline"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_92

    goto :goto_4d

    :cond_92
    const/4 v4, 0x0

    :goto_4e
    const-string v5, "id"

    packed-switch v4, :pswitch_data_9

    :cond_93
    const/4 v4, 0x1

    :goto_4f
    const/4 v7, 0x0

    goto :goto_52

    :pswitch_32
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Li4/b;->n(I)Li4/c;

    move-result-object v3

    instance-of v4, v3, Li4/g;

    if-nez v4, :cond_94

    goto :goto_50

    :cond_94
    check-cast v3, Li4/g;

    invoke-virtual {v3, v5}, Li4/b;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_95

    :goto_50
    const/4 v7, 0x0

    goto :goto_51

    :cond_95
    const/4 v7, 0x0

    invoke-static {v7, v2, v4, v3}, Lpf/c;->N(ILe4/s;Ljava/lang/String;Li4/g;)V

    :goto_51
    const/4 v4, 0x1

    goto :goto_52

    :pswitch_33
    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v2, v6, v3}, Lpf/c;->J(ILe4/s;La3/p;Li4/a;)V

    goto :goto_52

    :pswitch_34
    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-static {v7, v2, v6, v3}, Lpf/c;->J(ILe4/s;La3/p;Li4/a;)V

    goto :goto_52

    :pswitch_35
    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-virtual {v3, v4}, Li4/b;->n(I)Li4/c;

    move-result-object v3

    instance-of v8, v3, Li4/g;

    if-nez v8, :cond_96

    goto :goto_52

    :cond_96
    check-cast v3, Li4/g;

    invoke-virtual {v3, v5}, Li4/b;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_97

    goto :goto_52

    :cond_97
    invoke-static {v4, v2, v5, v3}, Lpf/c;->N(ILe4/s;Ljava/lang/String;Li4/g;)V

    goto :goto_52

    :cond_98
    move v4, v5

    goto :goto_4f

    :goto_52
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_4c

    :goto_53
    move-object/from16 v1, p0

    move-object v4, v6

    move v5, v7

    move-object/from16 v3, v23

    move-object/from16 v6, v27

    goto/16 :goto_2

    :cond_99
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_36
    check-cast v4, Lb3/a;

    check-cast v3, Lb3/c0;

    invoke-virtual {v4, v3}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    check-cast v2, Lb3/e3;

    const-string v0, "listener"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lge3/g;->B(Landroid/view/View;)Lu5/a;

    move-result-object v0

    iget-object v0, v0, Lu5/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_36
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x6cbf819b -> :sswitch_2
        0x6fc27995 -> :sswitch_1
        0x72879d57 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x6a6caee6 -> :sswitch_c
        -0x50c12caa -> :sswitch_b
        -0x4aa718c7 -> :sswitch_a
        -0x32c34015 -> :sswitch_9
        -0x13db5c49 -> :sswitch_8
        0x1b9da -> :sswitch_7
        0x308b46 -> :sswitch_6
        0x5db01b6 -> :sswitch_5
        0x6a04ac4 -> :sswitch_4
        0x398f2168 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2e
        :pswitch_21
        :pswitch_1d
        :pswitch_1d
        :pswitch_13
        :pswitch_21
        :pswitch_21
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x4ac15883 -> :sswitch_19
        -0x49bfd1d7 -> :sswitch_18
        -0x47693271 -> :sswitch_17
        -0x32dd7fd1 -> :sswitch_16
        -0x31dbf925 -> :sswitch_15
        -0x300fc3ef -> :sswitch_14
        -0x2bab2063 -> :sswitch_13
        -0x21d289e1 -> :sswitch_12
        -0x1d240708 -> :sswitch_11
        0x305d4e -> :sswitch_10
        0x368f3a -> :sswitch_f
        0x36ba80 -> :sswitch_e
        0x37d04a -> :sswitch_d
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x669119bb -> :sswitch_1c
        -0x527265d5 -> :sswitch_1b
        0x1c155 -> :sswitch_1a
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        -0x40737a52 -> :sswitch_1f
        -0x395ff881 -> :sswitch_1e
        -0x21d289e1 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x527265d5 -> :sswitch_25
        0x188db -> :sswitch_24
        0x1c155 -> :sswitch_23
        0x32a007 -> :sswitch_22
        0x677c21c -> :sswitch_21
        0x68ac462 -> :sswitch_20
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
    .end packed-switch

    :sswitch_data_6
    .sparse-switch
        -0x527265d5 -> :sswitch_2d
        -0x21d289e1 -> :sswitch_2c
        0x188db -> :sswitch_2b
        0x1c155 -> :sswitch_2a
        0x32a007 -> :sswitch_29
        0x677c21c -> :sswitch_28
        0x68ac462 -> :sswitch_27
        0x68b1db1 -> :sswitch_26
    .end sparse-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1e
    .end packed-switch

    :sswitch_data_7
    .sparse-switch
        -0x55cd0a30 -> :sswitch_39
        -0x300fc3ef -> :sswitch_38
        -0x21d289e1 -> :sswitch_37
        0x305d4e -> :sswitch_36
        0x3581d9 -> :sswitch_35
        0x36ba80 -> :sswitch_34
        0x5cfee87 -> :sswitch_33
        0x686cad4 -> :sswitch_32
        0x688f269 -> :sswitch_31
        0x89c01c1 -> :sswitch_30
        0x389b97dd -> :sswitch_2f
        0x793284c5 -> :sswitch_2e
    .end sparse-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    :sswitch_data_8
    .sparse-switch
        -0x6a6caee6 -> :sswitch_3d
        -0x4aa718c7 -> :sswitch_3c
        -0x32c34015 -> :sswitch_3b
        0x398f2168 -> :sswitch_3a
    .end sparse-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch
.end method
