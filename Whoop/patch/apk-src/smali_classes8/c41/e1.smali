.class public final synthetic Lc41/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;I)V
    .locals 0

    iput p2, p0, Lc41/e1;->w:I

    iput-object p1, p0, Lc41/e1;->x:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lc41/e1;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    iget-object v2, v0, Lc41/e1;->x:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/j1;

    invoke-static {v6, v4, v4, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lc41/e1;->x:Ljava/util/ArrayList;

    move-object/from16 v2, p1

    check-cast v2, Lk2/e;

    invoke-static {v1, v2}, Lqt2/p;->a(Ljava/util/ArrayList;Lk2/e;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    iget-object v2, v0, Lc41/e1;->x:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_4

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lq0/d;

    iget-object v7, v6, Lq0/d;->b:Ljava/util/List;

    iget-boolean v8, v6, Lq0/d;->h:Z

    iget v9, v6, Lq0/d;->l:I

    const/high16 v10, -0x80000000

    if-eq v9, v10, :cond_1

    goto :goto_2

    :cond_1
    const-string v9, "position() should be called first"

    invoke-static {v9}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_3

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly2/j1;

    iget-object v12, v6, Lq0/d;->j:[I

    mul-int/lit8 v13, v10, 0x2

    aget v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    aget v12, v12, v13

    int-to-long v13, v14

    const/16 v15, 0x20

    shl-long/2addr v13, v15

    move v15, v5

    int-to-long v4, v12

    const-wide v16, 0xffffffffL

    and-long v4, v4, v16

    or-long/2addr v4, v13

    iget-wide v12, v6, Lq0/d;->c:J

    invoke-static {v4, v5, v12, v13}, Ly3/j;->d(JJ)J

    move-result-wide v4

    if-eqz v8, :cond_2

    invoke-static {v1, v11, v4, v5}, Ly2/i1;->t(Ly2/i1;Ly2/j1;J)V

    goto :goto_4

    :cond_2
    invoke-static {v1, v11, v4, v5}, Ly2/i1;->p(Ly2/i1;Ly2/j1;J)V

    :goto_4
    add-int/lit8 v10, v10, 0x1

    move v5, v15

    goto :goto_3

    :cond_3
    move v15, v5

    add-int/lit8 v5, v15, 0x1

    goto :goto_1

    :cond_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    iget-object v1, v0, Lc41/e1;->x:Ljava/util/ArrayList;

    move-object/from16 v2, p1

    check-cast v2, Lm91/q;

    invoke-static {v1, v2}, Lni0/c;->v(Ljava/util/ArrayList;Lm91/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    iget-object v2, v0, Lc41/e1;->x:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_5
    if-ge v5, v3, :cond_5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/j1;

    invoke-static {v6, v4, v4, v1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    iget-object v1, v0, Lc41/e1;->x:Ljava/util/ArrayList;

    move-object/from16 v2, p1

    check-cast v2, Lk2/e;

    invoke-static {v1, v2}, Lc41/f1;->d(Ljava/util/ArrayList;Lk2/e;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
