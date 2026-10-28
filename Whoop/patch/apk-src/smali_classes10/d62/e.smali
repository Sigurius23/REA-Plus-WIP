.class public final synthetic Ld62/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    iput p2, p0, Ld62/e;->w:I

    iput-object p1, p0, Ld62/e;->x:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Ld62/e;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/CharSequence;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "$this$DelimitedRangesSequence"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Ld62/e;->x:Ljava/util/List;

    move-object v8, v2

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v9, 0x0

    if-ne v2, v5, :cond_2

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v8}, Lm83/s;->o1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v5, 0x4

    invoke-static {v4, v2, v1, v3, v5}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v1

    if-gez v1, :cond_1

    :cond_0
    move-object v3, v9

    goto/16 :goto_5

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    new-instance v2, Li93/j;

    if-gez v1, :cond_3

    move v1, v3

    :cond_3
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-direct {v2, v1, v3, v5}, Li93/h;-><init>(III)V

    instance-of v3, v4, Ljava/lang/String;

    const/4 v15, 0x0

    iget v5, v2, Li93/h;->y:I

    iget v2, v2, Li93/h;->x:I

    if-eqz v3, :cond_9

    if-lez v5, :cond_4

    if-le v1, v2, :cond_5

    :cond_4
    if-gez v5, :cond_0

    if-gt v2, v1, :cond_0

    :cond_5
    move v11, v1

    :goto_0
    move-object v1, v8

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    move-object v14, v4

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v12

    const/4 v10, 0x0

    invoke-static/range {v10 .. v15}, Lyb3/y;->I(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_1

    :cond_7
    move-object v3, v9

    :goto_1
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v2

    goto/16 :goto_5

    :cond_8
    if-eq v11, v2, :cond_0

    add-int/2addr v11, v5

    goto :goto_0

    :cond_9
    if-lez v5, :cond_a

    if-le v1, v2, :cond_b

    :cond_a
    if-gez v5, :cond_0

    if-gt v2, v1, :cond_0

    :cond_b
    :goto_2
    move-object v3, v8

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move v3, v2

    move-object v2, v11

    check-cast v2, Ljava/lang/String;

    move v6, v3

    const/4 v3, 0x0

    move v7, v6

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    move v12, v5

    move v5, v1

    move v1, v12

    move v12, v7

    move v7, v15

    invoke-static/range {v2 .. v7}, Lyb3/r;->p0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_4

    :cond_c
    move v2, v5

    move v5, v1

    move v1, v2

    move v2, v12

    goto :goto_3

    :cond_d
    move v12, v5

    move v5, v1

    move v1, v12

    move v12, v2

    move-object v11, v9

    :goto_4
    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_e

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_e
    if-eq v5, v12, :cond_0

    add-int v2, v5, v1

    move v5, v1

    move v1, v2

    move v2, v12

    goto :goto_2

    :goto_5
    if-eqz v3, :cond_f

    iget-object v1, v3, Ll83/k;->w:Ljava/lang/Object;

    iget-object v2, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v9, Ll83/k;

    invoke-direct {v9, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_f
    return-object v9

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ly2/v1;

    move-object/from16 v2, p2

    check-cast v2, Ly3/a;

    iget-object v3, v0, Ld62/e;->x:Ljava/util/List;

    invoke-static {v3, v1, v2}, Ld62/g;->k(Ljava/util/List;Ly2/v1;Ly3/a;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, v0, Ld62/e;->x:Ljava/util/List;

    invoke-static {v3, v1, v2}, Ld62/g;->a(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
