.class public final synthetic Lu0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Lu0/r;->w:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    const-string v4, "it"

    const/4 v5, 0x0

    const-wide v6, 0xffffffffL

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x0

    packed-switch v1, :pswitch_data_0

    invoke-static/range {p1 .. p1}, Lu71/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lm91/q;

    invoke-static {v1}, Lu70/a;->a(Lm91/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    invoke-static/range {p1 .. p1}, Lu51/c;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    invoke-static {v1}, Lu31/e;->h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lu31/e;->f(Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lu31/e;->i(I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move v3, v9

    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Lyb3/k;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lyb3/n;

    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Ljb1/b;

    invoke-static {v1}, Lu22/i;->b(Ljb1/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    invoke-static/range {p1 .. p1}, Lu21/c;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V

    return-object v8

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)V

    return-object v8

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lu11/i;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1}, Lu11/i;->q(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1}, Lu11/i;->g(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_e
    invoke-static/range {p1 .. p1}, Lu11/i;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, Ld30/x;

    const-string v2, "state"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ld30/x;->a()Lzy/b;

    move-result-object v1

    return-object v1

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, Lu10/p;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v8

    :pswitch_11
    invoke-static/range {p1 .. p1}, Lu01/d;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Li3/z;

    sget-object v2, Li3/u;->z:Li3/y;

    check-cast v1, Li3/l;

    invoke-virtual {v1, v2, v8}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v8

    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, Ll3/e;

    iget-object v2, v1, Ll3/e;->a:Ljava/lang/Object;

    instance-of v3, v2, Ll3/v;

    if-eqz v3, :cond_4

    check-cast v2, Ll3/v;

    invoke-virtual {v2}, Ll3/v;->b()Ll3/s0;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v3, v2, Ll3/s0;->a:Ll3/m0;

    if-nez v3, :cond_1

    iget-object v3, v2, Ll3/s0;->b:Ll3/m0;

    if-nez v3, :cond_1

    iget-object v3, v2, Ll3/s0;->c:Ll3/m0;

    if-nez v3, :cond_1

    iget-object v2, v2, Ll3/s0;->d:Ll3/m0;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Ll3/e;

    iget-object v3, v1, Ll3/e;->a:Ljava/lang/Object;

    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ll3/v;

    invoke-virtual {v3}, Ll3/v;->b()Ll3/s0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, v3, Ll3/s0;->a:Ll3/m0;

    if-nez v3, :cond_3

    :cond_2
    new-instance v4, Ll3/m0;

    const/16 v22, 0x0

    const v23, 0xffff

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v23}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object v3, v4

    :cond_3
    iget v4, v1, Ll3/e;->b:I

    iget v5, v1, Ll3/e;->c:I

    invoke-direct {v2, v3, v4, v5}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    filled-new-array {v1, v2}, [Ll3/e;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_2

    :cond_4
    :goto_1
    filled-new-array {v1}, [Ll3/e;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    :goto_2
    return-object v1

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    new-instance v2, Lu0/n1;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lh0/d2;->w:Lh0/d2;

    goto :goto_3

    :cond_5
    sget-object v3, Lh0/d2;->x:Lh0/d2;

    :goto_3
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {v2, v3, v1}, Lu0/n1;-><init>(Lh0/d2;F)V

    return-object v2

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Lf1/g1;

    invoke-virtual {v1}, Lf1/g1;->b()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v5, Lq3/f;

    iget-wide v3, v1, Lf1/g1;->f:J

    sget v1, Ll3/u0;->c:I

    and-long/2addr v3, v6

    long-to-int v1, v3

    sub-int/2addr v2, v1

    invoke-direct {v5, v9, v2}, Lq3/f;-><init>(II)V

    :cond_6
    return-object v5

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Lf1/g1;

    invoke-virtual {v1}, Lf1/g1;->c()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v5, Lq3/f;

    iget-wide v3, v1, Lf1/g1;->f:J

    sget v1, Ll3/u0;->c:I

    and-long/2addr v3, v6

    long-to-int v1, v3

    sub-int/2addr v1, v2

    invoke-direct {v5, v1, v9}, Lq3/f;-><init>(II)V

    :cond_7
    return-object v5

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Lf1/g1;

    invoke-virtual {v1}, Lf1/g1;->d()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v5, Lq3/f;

    iget-wide v3, v1, Lf1/g1;->f:J

    sget v1, Ll3/u0;->c:I

    and-long/2addr v3, v6

    long-to-int v1, v3

    sub-int/2addr v2, v1

    invoke-direct {v5, v9, v2}, Lq3/f;-><init>(II)V

    :cond_8
    return-object v5

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Lf1/g1;

    invoke-virtual {v1}, Lf1/g1;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v5, Lq3/f;

    iget-wide v3, v1, Lf1/g1;->f:J

    sget v1, Ll3/u0;->c:I

    and-long/2addr v3, v6

    long-to-int v1, v3

    sub-int/2addr v1, v2

    invoke-direct {v5, v1, v9}, Lq3/f;-><init>(II)V

    :cond_9
    return-object v5

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, Lf1/g1;

    iget-object v3, v1, Lf1/g1;->g:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    iget-wide v10, v1, Lf1/g1;->f:J

    sget v4, Ll3/u0;->c:I

    and-long/2addr v10, v6

    long-to-int v4, v10

    invoke-static {v4, v3}, Lu0/n0;->m(ILjava/lang/String;)I

    move-result v3

    if-eq v3, v2, :cond_a

    new-instance v5, Lq3/f;

    iget-wide v1, v1, Lf1/g1;->f:J

    and-long/2addr v1, v6

    long-to-int v1, v1

    sub-int/2addr v3, v1

    invoke-direct {v5, v9, v3}, Lq3/f;-><init>(II)V

    :cond_a
    return-object v5

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Lf1/g1;

    iget-object v3, v1, Lf1/g1;->g:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    iget-wide v10, v1, Lf1/g1;->f:J

    sget v4, Ll3/u0;->c:I

    and-long/2addr v10, v6

    long-to-int v4, v10

    if-gtz v4, :cond_b

    :goto_4
    move v3, v2

    goto :goto_5

    :cond_b
    invoke-static {}, Lu0/n0;->q()Lh6/j;

    move-result-object v8

    if-nez v8, :cond_d

    if-gtz v4, :cond_c

    goto :goto_4

    :cond_c
    invoke-static {v3, v4, v2}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    move-result v3

    goto :goto_5

    :cond_d
    add-int/lit8 v10, v4, -0x1

    invoke-virtual {v8, v10, v3}, Lh6/j;->b(ILjava/lang/CharSequence;)I

    move-result v8

    if-gez v8, :cond_f

    if-gtz v4, :cond_e

    goto :goto_4

    :cond_e
    invoke-static {v3, v4, v2}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    move-result v3

    goto :goto_5

    :cond_f
    move v3, v8

    :goto_5
    if-ne v3, v2, :cond_10

    goto :goto_6

    :cond_10
    new-instance v5, Lq3/f;

    iget-wide v1, v1, Lf1/g1;->f:J

    and-long/2addr v1, v6

    long-to-int v1, v1

    sub-int/2addr v1, v3

    invoke-direct {v5, v1, v9}, Lq3/f;-><init>(II)V

    :goto_6
    return-object v5

    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, Lq3/y;

    return-object v8

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, Ll3/r0;

    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
