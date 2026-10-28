.class public final synthetic Lxl2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lxl2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lxl2/a;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lyf2/b;->b(Lxf3/c;Luf3/a;)Ldg2/c;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lyf2/b;->c(Lxf3/c;Luf3/a;)Lbg2/g;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lyf2/b;->h(Lxf3/c;Luf3/a;)Lzf2/a;

    move-result-object v1

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lyf2/b;->a(Lxf3/c;Luf3/a;)Lxf2/a;

    move-result-object v1

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lyf2/b;->d(Lxf3/c;Luf3/a;)Lwf2/a;

    move-result-object v1

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lyf2/b;->g(Lxf3/c;Luf3/a;)Lcom/whoop/sms/common/data/SmsVerificationApi;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Ly1/b;

    return-object p2

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Ly1/d;

    iget-object v2, v1, Ly1/d;->w:Ljava/util/Map;

    iget-object v1, v1, Ly1/d;->x:La0/v0;

    iget-object v3, v1, La0/v0;->b:[Ljava/lang/Object;

    iget-object v4, v1, La0/v0;->c:[Ljava/lang/Object;

    iget-object v1, v1, La0/v0;->a:[J

    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    aget-wide v8, v1, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_3

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_1
    if-ge v12, v10, :cond_2

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_1

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v14, v3, v13

    aget-object v13, v4, v13

    check-cast v13, Ly1/f;

    invoke-interface {v13}, Ly1/f;->e()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_0

    invoke-interface {v2, v14}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_0
    invoke-interface {v2, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_2
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    if-ne v10, v11, :cond_4

    :cond_3
    if-eq v7, v5, :cond_4

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    :cond_5
    return-object v2

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxv1/a;->b(Lxf3/c;Luf3/a;)Lwv1/b;

    move-result-object v1

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxv1/a;->a(Lxf3/c;Luf3/a;)Law1/b;

    move-result-object v1

    return-object v1

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxv1/a;->f(Lxf3/c;Luf3/a;)Lbw1/b;

    move-result-object v1

    return-object v1

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxv1/a;->g(Lxf3/c;Luf3/a;)Lcw1/a;

    move-result-object v1

    return-object v1

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxv1/a;->e(Lxf3/c;Luf3/a;)Lvv1/a;

    move-result-object v1

    return-object v1

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxv1/a;->d(Lxf3/c;Luf3/a;)Lcom/whoop/membership/dunning/domain/api/DunningApi;

    move-result-object v1

    return-object v1

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->m(Lxf3/c;Luf3/a;)Lvl2/l;

    move-result-object v1

    return-object v1

    :pswitch_e
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->a(Lxf3/c;Luf3/a;)Lvl2/u;

    move-result-object v1

    return-object v1

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->p(Lxf3/c;Luf3/a;)Lul2/c;

    move-result-object v1

    return-object v1

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->l(Lxf3/c;Luf3/a;)Lcm2/z;

    move-result-object v1

    return-object v1

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->e(Lxf3/c;Luf3/a;)Llf1/f;

    move-result-object v1

    return-object v1

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->g(Lxf3/c;Luf3/a;)Ltl2/a;

    move-result-object v1

    return-object v1

    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->o(Lxf3/c;Luf3/a;)Lul2/a;

    move-result-object v1

    return-object v1

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->j(Lxf3/c;Luf3/a;)Lcm2/t;

    move-result-object v1

    return-object v1

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->b(Lxf3/c;Luf3/a;)Lcm2/a;

    move-result-object v1

    return-object v1

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->i(Lxf3/c;Luf3/a;)Lcm2/c;

    move-result-object v1

    return-object v1

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->n(Lxf3/c;Luf3/a;)Lcm2/v;

    move-result-object v1

    return-object v1

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->f(Lxf3/c;Luf3/a;)Lcm2/x;

    move-result-object v1

    return-object v1

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->d(Lxf3/c;Luf3/a;)Lvl2/v;

    move-result-object v1

    return-object v1

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->k(Lxf3/c;Luf3/a;)Lzl2/a;

    move-result-object v1

    return-object v1

    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->c(Lxf3/c;Luf3/a;)Lvl2/p;

    move-result-object v1

    return-object v1

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Lxl2/b;->h(Lxf3/c;Luf3/a;)Lcom/whoop/trends/data/TrendsApi;

    move-result-object v1

    return-object v1

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
