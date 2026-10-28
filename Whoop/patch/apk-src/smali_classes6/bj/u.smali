.class public abstract Lbj/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-string v9, "hd"

    const-string v10, "d"

    const-string v0, "nm"

    const-string v1, "sy"

    const-string v2, "pt"

    const-string v3, "p"

    const-string v4, "r"

    const-string v5, "or"

    const-string v6, "os"

    const-string v7, "ir"

    const-string v8, "is"

    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/u;->a:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;I)Lyi/h;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x3

    move/from16 v5, p2

    if-ne v5, v4, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    move v5, v2

    :goto_0
    const/4 v6, 0x0

    move v9, v2

    move/from16 v17, v9

    move/from16 v18, v5

    move-object v8, v6

    move-object v10, v8

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    :goto_1
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    sget-object v5, Lbj/u;->a:Lwe/o;

    invoke-virtual {v0, v5}, Lcj/d;->m(Lwe/o;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_1

    :pswitch_0
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v5

    if-ne v5, v4, :cond_1

    move/from16 v18, v3

    goto :goto_1

    :cond_1
    move/from16 v18, v2

    goto :goto_1

    :pswitch_1
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v17

    goto :goto_1

    :pswitch_2
    invoke-static {v0, v1, v2}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v15

    goto :goto_1

    :pswitch_3
    invoke-static {v0, v1, v3}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v13

    goto :goto_1

    :pswitch_4
    invoke-static {v0, v1, v2}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v16

    goto :goto_1

    :pswitch_5
    invoke-static {v0, v1, v3}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v14

    goto :goto_1

    :pswitch_6
    invoke-static {v0, v1, v2}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v12

    goto :goto_1

    :pswitch_7
    invoke-static/range {p0 .. p1}, Lbj/a;->b(Lcj/d;Lqi/i;)Lxi/f;

    move-result-object v11

    goto :goto_1

    :pswitch_8
    invoke-static {v0, v1, v2}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v10

    goto :goto_1

    :pswitch_9
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v5

    const/4 v6, 0x2

    invoke-static {v6}, Le4/p;->f(I)[I

    move-result-object v6

    array-length v7, v6

    move v9, v2

    :goto_2
    if-ge v9, v7, :cond_5

    aget v2, v6, v9

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    throw v0

    :cond_3
    :goto_3
    if-ne v3, v5, :cond_4

    move v9, v2

    goto :goto_4

    :cond_4
    add-int/lit8 v9, v9, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v9, 0x0

    :goto_4
    const/4 v2, 0x0

    const/4 v3, 0x1

    goto :goto_1

    :pswitch_a
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :cond_6
    new-instance v7, Lyi/h;

    invoke-direct/range {v7 .. v18}, Lyi/h;-><init>(Ljava/lang/String;ILxi/b;Lxi/f;Lxi/b;Lxi/b;Lxi/b;Lxi/b;Lxi/b;ZZ)V

    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
