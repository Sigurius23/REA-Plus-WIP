.class public final Lcom/squareup/wire/b;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, Lcom/squareup/wire/b;->a:I

    .line 3
    const-class v0, Ljava/lang/Void;

    .line 4
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    sget-object v2, Lcom/squareup/wire/x;->x:Lcom/squareup/wire/x;

    sget-object v3, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/squareup/wire/b;->a:I

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p6, p0, Lcom/squareup/wire/b;->a:I

    invoke-direct/range {p0 .. p5}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    return-void
.end method

.method public static a(Ljava/time/Duration;)I
    .locals 4

    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    invoke-virtual {p0}, Ljava/time/Duration;->getNano()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/time/Duration;->getNano()I

    move-result p0

    const v0, 0x3b9aca00

    sub-int/2addr p0, v0

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/time/Duration;->getNano()I

    move-result p0

    return p0
.end method

.method public static b(Ljava/time/Duration;)J
    .locals 4

    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    invoke-virtual {p0}, Ljava/time/Duration;->getNano()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->k()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    packed-switch v3, :pswitch_data_1

    invoke-virtual {p1}, Lcom/squareup/wire/r;->m()V

    goto :goto_0

    :pswitch_2
    sget-object v2, Lcom/squareup/wire/q;->STRUCT_LIST:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :pswitch_3
    sget-object v2, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :pswitch_4
    sget-object v2, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :pswitch_5
    sget-object v2, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :pswitch_6
    sget-object v2, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :pswitch_7
    sget-object v2, Lcom/squareup/wire/q;->STRUCT_NULL:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    return-object v2

    :pswitch_8
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->k()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "expected 0 but was "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_9
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_7

    const/4 v5, 0x1

    if-eq v3, v5, :cond_3

    invoke-virtual {p1}, Lcom/squareup/wire/r;->m()V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v6

    const/4 v3, 0x0

    move-object v8, v3

    :goto_2
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v9

    if-eq v9, v4, :cond_6

    if-eq v9, v5, :cond_5

    const/4 v10, 0x2

    if-eq v9, v10, :cond_4

    invoke-virtual {p1, v9}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_2

    :cond_4
    sget-object v8, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    invoke-virtual {v8, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_2

    :cond_5
    sget-object v3, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v3, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_2

    :cond_6
    invoke-virtual {p1, v6, v7}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    if-eqz v3, :cond_2

    invoke-interface {v0, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    invoke-virtual {p1, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    return-object v0

    :pswitch_a
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    :goto_3
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_9

    const/4 v4, 0x1

    if-eq v3, v4, :cond_8

    invoke-virtual {p1}, Lcom/squareup/wire/r;->m()V

    goto :goto_3

    :cond_8
    sget-object v3, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    invoke-virtual {v3, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    invoke-virtual {p1, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    return-object v0

    :pswitch_b
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->c()J

    move-result-wide v0

    iget-object p1, p1, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {p1, v0, v1}, Lne3/j;->g0(J)V

    invoke-interface {p1, v0, v1}, Lne3/j;->k0(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_c
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->l()J

    move-result-wide v0

    const/4 p1, 0x1

    ushr-long v2, v0, p1

    const-wide/16 v4, 0x1

    and-long/2addr v0, v4

    neg-long v0, v0

    xor-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_d
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->k()I

    move-result p1

    ushr-int/lit8 v0, p1, 0x1

    and-int/lit8 p1, p1, 0x1

    neg-int p1, p1

    xor-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_f
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->k()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_10
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_4
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_c

    const/4 v6, 0x1

    if-eq v5, v6, :cond_b

    const/4 v6, 0x2

    if-eq v5, v6, :cond_a

    invoke-virtual {p1, v5}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_4

    :cond_a
    sget-object v4, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    invoke-virtual {v4, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    goto :goto_4

    :cond_b
    sget-object v2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    goto :goto_4

    :cond_c
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    int-to-long v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    move-result-object p1

    const-string v0, "ofEpochSecond(epochSecond, nano)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_11
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_12
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_13
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v0

    :goto_5
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_d

    invoke-virtual {p1, v2}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_5

    :cond_d
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_6
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_10

    const/4 v6, 0x1

    if-eq v5, v6, :cond_f

    const/4 v6, 0x2

    if-eq v5, v6, :cond_e

    invoke-virtual {p1, v5}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_6

    :cond_e
    sget-object v4, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    invoke-virtual {v4, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    goto :goto_6

    :cond_f
    sget-object v2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    goto :goto_6

    :cond_10
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    int-to-long v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/time/Duration;->ofSeconds(JJ)Ljava/time/Duration;

    move-result-object p1

    const-string v0, "ofSeconds(seconds, nano)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_15
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->c()J

    move-result-wide v0

    iget-object p1, p1, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {p1, v0, v1}, Lne3/j;->g0(J)V

    invoke-interface {p1, v0, v1}, Lne3/j;->m0(J)Lne3/l;

    move-result-object p1

    return-object p1

    :pswitch_16
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->k()I

    move-result p1

    if-nez p1, :cond_11

    const/4 p1, 0x0

    goto :goto_7

    :cond_11
    const/4 p1, 0x1

    :goto_7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_17
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Operation not supported."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_18
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_19
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 8

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 2
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/s;->d(J)V

    return-void

    .line 3
    :pswitch_0
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 4
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    return-void

    :pswitch_1
    if-nez p2, :cond_0

    .line 5
    sget-object v0, Lcom/squareup/wire/q;->STRUCT_NULL:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_1
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_2
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_3
    instance-of v0, p2, Ljava/util/Map;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    check-cast p2, Ljava/util/Map;

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_4
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_LIST:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :goto_0
    return-void

    .line 11
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected struct value: "

    .line 12
    invoke-static {p2, v0}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :pswitch_2
    check-cast p2, Ljava/lang/Void;

    const/4 p2, 0x0

    .line 15
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    return-void

    .line 16
    :pswitch_3
    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_6

    goto :goto_2

    .line 17
    :cond_6
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 18
    sget-object v2, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-virtual {v2, v3, v1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v4

    sget-object v5, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    const/4 v6, 0x2

    invoke-virtual {v5, v6, v0}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v4

    .line 19
    sget-object v4, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    invoke-virtual {p1, v3, v4}, Lcom/squareup/wire/s;->b(ILcom/squareup/wire/d;)V

    .line 20
    invoke-virtual {p1, v7}, Lcom/squareup/wire/s;->c(I)V

    .line 21
    invoke-virtual {v2, p1, v3, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 22
    invoke-virtual {v5, p1, v6, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_1

    :cond_7
    :goto_2
    return-void

    .line 23
    :pswitch_4
    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_8

    goto :goto_4

    .line 24
    :cond_8
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 25
    sget-object v1, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_3

    :cond_9
    :goto_4
    return-void

    .line 26
    :pswitch_5
    check-cast p2, Ljava/lang/String;

    .line 27
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object p1, p1, Lcom/squareup/wire/s;->a:Lne3/i;

    invoke-interface {p1, p2}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    return-void

    .line 29
    :pswitch_6
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const/4 p2, 0x1

    shl-long v2, v0, p2

    const/16 p2, 0x3f

    shr-long/2addr v0, p2

    xor-long/2addr v0, v2

    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/s;->d(J)V

    return-void

    .line 31
    :pswitch_7
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    shl-int/lit8 v0, p2, 0x1

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, v0

    .line 32
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    return-void

    .line 33
    :pswitch_8
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/s;->d(J)V

    return-void

    .line 35
    :pswitch_9
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-ltz p2, :cond_a

    .line 36
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    goto :goto_5

    :cond_a
    int-to-long v0, p2

    .line 37
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/s;->d(J)V

    :goto_5
    return-void

    .line 38
    :pswitch_a
    check-cast p2, Ljava/time/Instant;

    .line 39
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_b

    .line 41
    sget-object v2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, p1, v3, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 42
    :cond_b
    invoke-virtual {p2}, Ljava/time/Instant;->getNano()I

    move-result p2

    if-eqz p2, :cond_c

    .line 43
    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :cond_c
    return-void

    .line 44
    :pswitch_b
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 45
    iget-object p1, p1, Lcom/squareup/wire/s;->a:Lne3/i;

    invoke-interface {p1, v0, v1}, Lne3/i;->H(J)Lne3/i;

    return-void

    .line 46
    :pswitch_c
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 47
    iget-object p1, p1, Lcom/squareup/wire/s;->a:Lne3/i;

    invoke-interface {p1, p2}, Lne3/i;->v0(I)Lne3/i;

    return-void

    .line 48
    :pswitch_d
    check-cast p2, Ll83/a0;

    .line 49
    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 50
    :pswitch_e
    check-cast p2, Ljava/time/Duration;

    .line 51
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-static {p2}, Lcom/squareup/wire/b;->b(Ljava/time/Duration;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_d

    .line 53
    sget-object v2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, p1, v3, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 54
    :cond_d
    invoke-static {p2}, Lcom/squareup/wire/b;->a(Ljava/time/Duration;)I

    move-result p2

    if-eqz p2, :cond_e

    .line 55
    sget-object v0, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :cond_e
    return-void

    .line 56
    :pswitch_f
    check-cast p2, Lne3/l;

    .line 57
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void

    .line 59
    :pswitch_10
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 60
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    return-void

    .line 61
    :pswitch_11
    check-cast p2, Ljava/lang/Void;

    .line 62
    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Operation not supported."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :pswitch_12
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    .line 65
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    .line 66
    iget-object p1, p1, Lcom/squareup/wire/s;->a:Lne3/i;

    invoke-interface {p1, p2}, Lne3/i;->v0(I)Lne3/i;

    return-void

    .line 67
    :pswitch_13
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    .line 68
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .line 69
    iget-object p1, p1, Lcom/squareup/wire/s;->a:Lne3/i;

    invoke-interface {p1, v0, v1}, Lne3/i;->H(J)Lne3/i;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 10

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    .line 74
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 75
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/v;->i(J)V

    return-void

    .line 76
    :pswitch_0
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 77
    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->h(I)V

    return-void

    :pswitch_1
    if-nez p2, :cond_0

    .line 78
    sget-object v0, Lcom/squareup/wire/q;->STRUCT_NULL:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    goto :goto_0

    .line 79
    :cond_0
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    goto :goto_0

    .line 80
    :cond_1
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    goto :goto_0

    .line 81
    :cond_2
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    goto :goto_0

    .line 82
    :cond_3
    instance-of v0, p2, Ljava/util/Map;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    check-cast p2, Ljava/util/Map;

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    goto :goto_0

    .line 83
    :cond_4
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_LIST:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :goto_0
    return-void

    .line 84
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected struct value: "

    .line 85
    invoke-static {p2, v0}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 86
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 87
    :pswitch_2
    check-cast p2, Ljava/lang/Void;

    const/4 p2, 0x0

    .line 88
    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->h(I)V

    return-void

    .line 89
    :pswitch_3
    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_6

    goto :goto_2

    .line 90
    :cond_6
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    const/4 v0, 0x0

    .line 91
    new-array v1, v0, [Ljava/util/Map$Entry;

    invoke-interface {p2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    .line 92
    check-cast p2, [Ljava/util/Map$Entry;

    invoke-static {p2}, Lm83/n;->J0([Ljava/lang/Object;)V

    array-length v1, p2

    :goto_1
    if-ge v0, v1, :cond_7

    aget-object v2, p2, v0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 93
    invoke-virtual {p1}, Lcom/squareup/wire/v;->b()I

    move-result v4

    .line 94
    sget-object v5, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    const/4 v6, 0x2

    invoke-virtual {v5, p1, v6, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 95
    sget-object v2, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v5, 0x1

    invoke-virtual {v2, p1, v5, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 96
    invoke-virtual {p1}, Lcom/squareup/wire/v;->b()I

    move-result v2

    sub-int/2addr v2, v4

    invoke-virtual {p1, v2}, Lcom/squareup/wire/v;->h(I)V

    .line 97
    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    invoke-virtual {p1, v5, v2}, Lcom/squareup/wire/v;->g(ILcom/squareup/wire/d;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    :goto_2
    return-void

    .line 98
    :pswitch_4
    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_8

    goto :goto_4

    .line 99
    :cond_8
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_3
    const/4 v2, -0x1

    if-ge v2, v0, :cond_9

    .line 100
    sget-object v2, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p1, v1, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_9
    :goto_4
    return-void

    .line 101
    :pswitch_5
    check-cast p2, Ljava/lang/String;

    .line 102
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_5
    if-ltz v0, :cond_11

    add-int/lit8 v2, v0, -0x1

    .line 104
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x80

    const/4 v5, -0x1

    if-ge v3, v4, :cond_b

    .line 105
    invoke-virtual {p1, v1}, Lcom/squareup/wire/v;->c(I)V

    .line 106
    iget v0, p1, Lcom/squareup/wire/v;->e:I

    .line 107
    iget-object v6, p1, Lcom/squareup/wire/v;->d:[B

    add-int/2addr v0, v5

    int-to-byte v3, v3

    .line 108
    aput-byte v3, v6, v0

    sub-int v3, v2, v0

    .line 109
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v9, v2

    move v2, v0

    move v0, v9

    :goto_6
    if-le v0, v3, :cond_a

    .line 110
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ge v5, v4, :cond_a

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v2, v2, -0x1

    int-to-byte v5, v5

    .line 111
    aput-byte v5, v6, v2

    goto :goto_6

    .line 112
    :cond_a
    iput v2, p1, Lcom/squareup/wire/v;->e:I

    goto :goto_5

    :cond_b
    const/16 v6, 0x800

    if-ge v3, v6, :cond_c

    const/4 v0, 0x2

    .line 113
    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->c(I)V

    .line 114
    iget-object v0, p1, Lcom/squareup/wire/v;->d:[B

    iget v5, p1, Lcom/squareup/wire/v;->e:I

    add-int/lit8 v6, v5, -0x1

    iput v6, p1, Lcom/squareup/wire/v;->e:I

    and-int/lit8 v7, v3, 0x3f

    or-int/2addr v4, v7

    int-to-byte v4, v4

    aput-byte v4, v0, v6

    add-int/lit8 v5, v5, -0x2

    .line 115
    iput v5, p1, Lcom/squareup/wire/v;->e:I

    shr-int/lit8 v3, v3, 0x6

    or-int/lit16 v3, v3, 0xc0

    int-to-byte v3, v3

    aput-byte v3, v0, v5

    goto/16 :goto_9

    :cond_c
    const v6, 0xd800

    const/16 v7, 0x3f

    if-lt v3, v6, :cond_10

    const v6, 0xdfff

    if-le v3, v6, :cond_d

    goto :goto_8

    :cond_d
    if-ltz v2, :cond_e

    .line 116
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_7

    :cond_e
    const v6, 0x7fffffff

    :goto_7
    const v8, 0xdbff

    if-gt v6, v8, :cond_f

    const v8, 0xdc00

    if-gt v8, v3, :cond_f

    const v8, 0xe000

    if-ge v3, v8, :cond_f

    add-int/lit8 v0, v0, -0x2

    and-int/lit16 v2, v6, 0x3ff

    shl-int/lit8 v2, v2, 0xa

    and-int/lit16 v3, v3, 0x3ff

    or-int/2addr v2, v3

    const/high16 v3, 0x10000

    add-int/2addr v2, v3

    const/4 v3, 0x4

    .line 117
    invoke-virtual {p1, v3}, Lcom/squareup/wire/v;->c(I)V

    .line 118
    iget-object v3, p1, Lcom/squareup/wire/v;->d:[B

    iget v5, p1, Lcom/squareup/wire/v;->e:I

    add-int/lit8 v6, v5, -0x1

    iput v6, p1, Lcom/squareup/wire/v;->e:I

    and-int/lit8 v8, v2, 0x3f

    or-int/2addr v8, v4

    int-to-byte v8, v8

    aput-byte v8, v3, v6

    add-int/lit8 v6, v5, -0x2

    .line 119
    iput v6, p1, Lcom/squareup/wire/v;->e:I

    shr-int/lit8 v8, v2, 0x6

    and-int/2addr v8, v7

    or-int/2addr v8, v4

    int-to-byte v8, v8

    aput-byte v8, v3, v6

    add-int/lit8 v6, v5, -0x3

    .line 120
    iput v6, p1, Lcom/squareup/wire/v;->e:I

    shr-int/lit8 v8, v2, 0xc

    and-int/2addr v7, v8

    or-int/2addr v4, v7

    int-to-byte v4, v4

    aput-byte v4, v3, v6

    add-int/lit8 v5, v5, -0x4

    .line 121
    iput v5, p1, Lcom/squareup/wire/v;->e:I

    shr-int/lit8 v2, v2, 0x12

    or-int/lit16 v2, v2, 0xf0

    int-to-byte v2, v2

    aput-byte v2, v3, v5

    goto/16 :goto_5

    .line 122
    :cond_f
    invoke-virtual {p1, v1}, Lcom/squareup/wire/v;->c(I)V

    .line 123
    iget-object v0, p1, Lcom/squareup/wire/v;->d:[B

    iget v3, p1, Lcom/squareup/wire/v;->e:I

    add-int/2addr v3, v5

    iput v3, p1, Lcom/squareup/wire/v;->e:I

    aput-byte v7, v0, v3

    goto :goto_9

    :cond_10
    :goto_8
    const/4 v0, 0x3

    .line 124
    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->c(I)V

    .line 125
    iget-object v0, p1, Lcom/squareup/wire/v;->d:[B

    iget v5, p1, Lcom/squareup/wire/v;->e:I

    add-int/lit8 v6, v5, -0x1

    iput v6, p1, Lcom/squareup/wire/v;->e:I

    and-int/lit8 v8, v3, 0x3f

    or-int/2addr v8, v4

    int-to-byte v8, v8

    aput-byte v8, v0, v6

    add-int/lit8 v6, v5, -0x2

    .line 126
    iput v6, p1, Lcom/squareup/wire/v;->e:I

    shr-int/lit8 v8, v3, 0x6

    and-int/2addr v7, v8

    or-int/2addr v4, v7

    int-to-byte v4, v4

    aput-byte v4, v0, v6

    add-int/lit8 v5, v5, -0x3

    .line 127
    iput v5, p1, Lcom/squareup/wire/v;->e:I

    shr-int/lit8 v3, v3, 0xc

    or-int/lit16 v3, v3, 0xe0

    int-to-byte v3, v3

    aput-byte v3, v0, v5

    :goto_9
    move v0, v2

    goto/16 :goto_5

    :cond_11
    return-void

    .line 128
    :pswitch_6
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const/4 p2, 0x1

    shl-long v2, v0, p2

    const/16 p2, 0x3f

    shr-long/2addr v0, p2

    xor-long/2addr v0, v2

    .line 129
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/v;->i(J)V

    return-void

    .line 130
    :pswitch_7
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    shl-int/lit8 v0, p2, 0x1

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, v0

    .line 131
    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->h(I)V

    return-void

    .line 132
    :pswitch_8
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 133
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/v;->i(J)V

    return-void

    .line 134
    :pswitch_9
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-ltz p2, :cond_12

    .line 135
    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->h(I)V

    goto :goto_a

    :cond_12
    int-to-long v0, p2

    .line 136
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/v;->i(J)V

    :goto_a
    return-void

    .line 137
    :pswitch_a
    check-cast p2, Ljava/time/Instant;

    .line 138
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-virtual {p2}, Ljava/time/Instant;->getNano()I

    move-result v0

    if-eqz v0, :cond_13

    .line 140
    sget-object v1, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, p1, v2, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 141
    :cond_13
    invoke-virtual {p2}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_14

    .line 142
    sget-object p2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, p1, v2, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_14
    return-void

    .line 143
    :pswitch_b
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 144
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/v;->f(J)V

    return-void

    .line 145
    :pswitch_c
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 146
    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->e(I)V

    return-void

    .line 147
    :pswitch_d
    check-cast p2, Ll83/a0;

    .line 148
    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 149
    :pswitch_e
    check-cast p2, Ljava/time/Duration;

    .line 150
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    invoke-static {p2}, Lcom/squareup/wire/b;->a(Ljava/time/Duration;)I

    move-result v0

    if-eqz v0, :cond_15

    .line 152
    sget-object v1, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, p1, v2, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 153
    :cond_15
    invoke-static {p2}, Lcom/squareup/wire/b;->b(Ljava/time/Duration;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_16

    .line 154
    sget-object p2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, p1, v2, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_16
    return-void

    .line 155
    :pswitch_f
    check-cast p2, Lne3/l;

    .line 156
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    return-void

    .line 158
    :pswitch_10
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 159
    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->h(I)V

    return-void

    .line 160
    :pswitch_11
    check-cast p2, Ljava/lang/Void;

    .line 161
    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Operation not supported."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 163
    :pswitch_12
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    .line 164
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->e(I)V

    return-void

    .line 165
    :pswitch_13
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    .line 166
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/v;->f(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    return-void

    :pswitch_0
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/squareup/wire/q;->getFieldEncoding$wire_runtime()Lcom/squareup/wire/d;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/squareup/wire/s;->b(ILcom/squareup/wire/d;)V

    .line 2
    invoke-virtual {p0, p3}, Lcom/squareup/wire/b;->encodedSize(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    .line 3
    invoke-virtual {p0, p1, p3}, Lcom/squareup/wire/b;->encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :goto_0
    return-void

    .line 5
    :pswitch_1
    check-cast p3, Ljava/lang/Void;

    .line 6
    const-string p3, "writer"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/squareup/wire/q;->getFieldEncoding$wire_runtime()Lcom/squareup/wire/d;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/squareup/wire/s;->b(ILcom/squareup/wire/d;)V

    const/4 p2, 0x0

    .line 8
    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    return-void

    :pswitch_0
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    .line 9
    invoke-virtual {p1}, Lcom/squareup/wire/v;->b()I

    move-result v0

    .line 10
    invoke-virtual {p0, p1, p3}, Lcom/squareup/wire/b;->encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p1}, Lcom/squareup/wire/v;->b()I

    move-result p3

    sub-int/2addr p3, v0

    invoke-virtual {p1, p3}, Lcom/squareup/wire/v;->h(I)V

    .line 12
    invoke-virtual {p0}, Lcom/squareup/wire/q;->getFieldEncoding$wire_runtime()Lcom/squareup/wire/d;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/squareup/wire/v;->g(ILcom/squareup/wire/d;)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :goto_0
    return-void

    .line 14
    :pswitch_1
    check-cast p3, Ljava/lang/Void;

    .line 15
    const-string p3, "writer"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 16
    invoke-virtual {p1, p3}, Lcom/squareup/wire/v;->h(I)V

    .line 17
    invoke-virtual {p0}, Lcom/squareup/wire/q;->getFieldEncoding$wire_runtime()Lcom/squareup/wire/d;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/squareup/wire/v;->g(ILcom/squareup/wire/d;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final encodedSize(Ljava/lang/Object;)I
    .locals 5

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lvd/e;->n0(J)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    and-int/lit16 v0, p1, -0x4000

    if-nez v0, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p1

    if-nez v0, :cond_2

    const/4 p1, 0x3

    goto :goto_0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p1, v0

    if-nez p1, :cond_3

    const/4 p1, 0x4

    goto :goto_0

    :cond_3
    const/4 p1, 0x5

    :goto_0
    return p1

    :pswitch_1
    if-nez p1, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_NULL:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_4
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->DOUBLE:Lcom/squareup/wire/q;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_5
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_6
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_7
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_8

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_8
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_9

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_LIST:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    :goto_1
    return p1

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unexpected struct value: "

    invoke-static {p1, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x1

    return p1

    :pswitch_3
    check-cast p1, Ljava/util/Map;

    const/4 v0, 0x0

    if-nez p1, :cond_a

    goto :goto_3

    :cond_a
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v4, 0x1

    invoke-virtual {v3, v4, v2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v2

    sget-object v3, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    const/4 v4, 0x2

    invoke-virtual {v3, v4, v1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v2

    const/16 v2, 0x8

    invoke-static {v2}, Lvd/e;->m0(I)I

    move-result v2

    invoke-static {v1}, Lvd/e;->m0(I)I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v3, v1

    add-int/2addr v0, v3

    goto :goto_2

    :cond_b
    :goto_3
    return v0

    :pswitch_4
    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    if-nez p1, :cond_c

    goto :goto_5

    :cond_c
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-virtual {v2, v3, v1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_4

    :cond_d
    :goto_5
    return v0

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lne3/b;->j(Ljava/lang/String;)J

    move-result-wide v0

    long-to-int p1, v0

    return p1

    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const/4 p1, 0x1

    shl-long v2, v0, p1

    const/16 p1, 0x3f

    shr-long/2addr v0, p1

    xor-long/2addr v0, v2

    invoke-static {v0, v1}, Lvd/e;->n0(J)I

    move-result p1

    return p1

    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    shl-int/lit8 v0, p1, 0x1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, v0

    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_e

    const/4 p1, 0x1

    goto :goto_6

    :cond_e
    and-int/lit16 v0, p1, -0x4000

    if-nez v0, :cond_f

    const/4 p1, 0x2

    goto :goto_6

    :cond_f
    const/high16 v0, -0x200000

    and-int/2addr v0, p1

    if-nez v0, :cond_10

    const/4 p1, 0x3

    goto :goto_6

    :cond_10
    const/high16 v0, -0x10000000

    and-int/2addr p1, v0

    if-nez p1, :cond_11

    const/4 p1, 0x4

    goto :goto_6

    :cond_11
    const/4 p1, 0x5

    :goto_6
    return p1

    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lvd/e;->n0(J)I

    move-result p1

    return p1

    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-ltz p1, :cond_16

    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_12

    const/4 p1, 0x1

    goto :goto_7

    :cond_12
    and-int/lit16 v0, p1, -0x4000

    if-nez v0, :cond_13

    const/4 p1, 0x2

    goto :goto_7

    :cond_13
    const/high16 v0, -0x200000

    and-int/2addr v0, p1

    if-nez v0, :cond_14

    const/4 p1, 0x3

    goto :goto_7

    :cond_14
    const/high16 v0, -0x10000000

    and-int/2addr p1, v0

    if-nez p1, :cond_15

    const/4 p1, 0x4

    goto :goto_7

    :cond_15
    const/4 p1, 0x5

    goto :goto_7

    :cond_16
    const/16 p1, 0xa

    :goto_7
    return p1

    :pswitch_a
    check-cast p1, Ljava/time/Instant;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_17

    sget-object v2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    goto :goto_8

    :cond_17
    const/4 v0, 0x0

    :goto_8
    invoke-virtual {p1}, Ljava/time/Instant;->getNano()I

    move-result p1

    if-eqz p1, :cond_18

    sget-object v1, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr v0, p1

    :cond_18
    return v0

    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    const/16 p1, 0x8

    return p1

    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    const/4 p1, 0x4

    return p1

    :pswitch_d
    check-cast p1, Ll83/a0;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :pswitch_e
    check-cast p1, Ljava/time/Duration;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/squareup/wire/b;->b(Ljava/time/Duration;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_19

    sget-object v2, Lcom/squareup/wire/q;->INT64:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    goto :goto_9

    :cond_19
    const/4 v0, 0x0

    :goto_9
    invoke-static {p1}, Lcom/squareup/wire/b;->a(Ljava/time/Duration;)I

    move-result p1

    if-eqz p1, :cond_1a

    sget-object v1, Lcom/squareup/wire/q;->INT32:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr v0, p1

    :cond_1a
    return v0

    :pswitch_f
    check-cast p1, Lne3/l;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lne3/l;->d()I

    move-result p1

    return p1

    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    return p1

    :pswitch_11
    check-cast p1, Ljava/lang/Void;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Operation not supported."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    const/4 p1, 0x4

    return p1

    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    const/16 p1, 0x8

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public encodedSizeWithTag(ILjava/lang/Object;)I
    .locals 1

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    if-nez p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/squareup/wire/b;->encodedSize(Ljava/lang/Object;)I

    move-result p2

    shl-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Lvd/e;->m0(I)I

    move-result p1

    invoke-static {p2}, Lvd/e;->m0(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/2addr v0, p2

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    :goto_0
    return v0

    :pswitch_1
    check-cast p2, Ljava/lang/Void;

    shl-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Lvd/e;->m0(I)I

    move-result p1

    const/4 p2, 0x1

    invoke-static {p2}, Lvd/e;->m0(I)I

    move-result p2

    add-int/2addr p2, p1

    return p2

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcom/squareup/wire/b;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_1
    if-nez p1, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_NULL:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_LIST:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unexpected struct value: "

    invoke-static {p1, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_6

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    invoke-virtual {v3, v1}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :cond_7
    return-object v0

    :pswitch_4
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_8

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/squareup/wire/q;->STRUCT_VALUE:Lcom/squareup/wire/q;

    invoke-virtual {v2, v1}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    :cond_9
    return-object v0

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_a
    check-cast p1, Ljava/time/Instant;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_d
    check-cast p1, Ll83/a0;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/time/Duration;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_f
    check-cast p1, Lne3/l;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    check-cast p1, Ljava/lang/Void;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Operation not supported."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
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
