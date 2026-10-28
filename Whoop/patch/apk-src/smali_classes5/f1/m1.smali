.class public final Lf1/m1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lf1/s1;


# direct methods
.method public synthetic constructor <init>(Lf1/s1;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lf1/m1;->w:I

    iput-object p1, p0, Lf1/m1;->y:Lf1/s1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lf1/m1;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lf1/m1;

    iget-object v0, p0, Lf1/m1;->y:Lf1/s1;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lf1/m1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lf1/m1;

    iget-object v0, p0, Lf1/m1;->y:Lf1/s1;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lf1/m1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/m1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lf1/m1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/m1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/m1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf1/m1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/m1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/m1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    move-object/from16 v0, p0

    iget v1, v0, Lf1/m1;->w:I

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf1/m1;->x:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x2

    const/4 v6, 0x1

    iget-object v7, v0, Lf1/m1;->y:Lf1/s1;

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    move-object/from16 v40, v4

    goto/16 :goto_13

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v7, Lf1/s1;->h:Lb3/r1;

    if-eqz v2, :cond_27

    iput v6, v0, Lf1/m1;->x:I

    check-cast v2, Lb3/i;

    iget-object v2, v2, Lb3/i;->a:Lb3/j;

    iget-object v2, v2, Lb3/j;->a:Landroid/content/ClipboardManager;

    invoke-virtual {v2}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v8, Lb3/q1;

    invoke-direct {v8, v2}, Lb3/q1;-><init>(Landroid/content/ClipData;)V

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    :goto_0
    if-ne v8, v1, :cond_4

    goto/16 :goto_15

    :cond_4
    :goto_1
    check-cast v8, Lb3/q1;

    if-eqz v8, :cond_27

    iput v5, v0, Lf1/m1;->x:I

    iget-object v2, v8, Lb3/q1;->a:Landroid/content/ClipData;

    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v2

    if-eqz v2, :cond_24

    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_24

    instance-of v9, v2, Landroid/text/Spanned;

    if-nez v9, :cond_5

    new-instance v3, Ll3/g;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ll3/g;-><init>(Ljava/lang/String;)V

    move-object v2, v3

    move-object/from16 v40, v4

    goto/16 :goto_12

    :cond_5
    move-object v9, v2

    check-cast v9, Landroid/text/Spanned;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    const-class v11, Landroid/text/Annotation;

    invoke-interface {v9, v8, v10, v11}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Landroid/text/Annotation;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const-string v12, "<this>"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v10

    sub-int/2addr v12, v6

    if-ltz v12, :cond_22

    move v14, v8

    :goto_2
    aget-object v15, v10, v14

    invoke-virtual {v15}, Landroid/text/Annotation;->getKey()Ljava/lang/String;

    move-result-object v3

    move/from16 p1, v8

    const-string v8, "androidx.compose.text.SpanStyle"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    move-object/from16 v17, v2

    move-object/from16 v40, v4

    goto/16 :goto_11

    :cond_6
    invoke-interface {v9, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    invoke-interface {v9, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    new-instance v13, Lb3/b2;

    invoke-virtual {v15}, Landroid/text/Annotation;->getValue()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v13, v15}, Lb3/b2;-><init>(Ljava/lang/String;)V

    iget-object v15, v13, Lb3/b2;->b:Landroid/os/Parcel;

    sget-wide v16, Li2/x;->n:J

    sget-wide v18, Ly3/o;->c:J

    move-wide/from16 v21, v16

    move-wide/from16 v35, v21

    move-wide/from16 v23, v18

    move-wide/from16 v30, v23

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    :goto_3
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v5

    if-le v5, v6, :cond_20

    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    move-result v5

    move-object/from16 v17, v2

    const/16 v2, 0x8

    if-ne v5, v6, :cond_8

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v5

    if-lt v5, v2, :cond_7

    invoke-virtual {v13}, Lb3/b2;->a()J

    move-result-wide v21

    :goto_4
    move-object/from16 v2, v17

    goto :goto_3

    :cond_7
    :goto_5
    move-object/from16 v40, v4

    goto/16 :goto_10

    :cond_8
    const/4 v2, 0x5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_9

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v5

    if-lt v5, v2, :cond_7

    invoke-virtual {v13}, Lb3/b2;->b()J

    move-result-wide v23

    :goto_6
    move-object/from16 v2, v17

    :goto_7
    const/4 v6, 0x1

    goto :goto_3

    :cond_9
    const/4 v6, 0x3

    if-ne v5, v6, :cond_a

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/4 v5, 0x4

    if-lt v2, v5, :cond_7

    new-instance v2, Lp3/r;

    invoke-virtual {v15}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-direct {v2, v6}, Lp3/r;-><init>(I)V

    move-object/from16 v25, v2

    goto :goto_6

    :cond_a
    const/4 v6, 0x4

    if-ne v5, v6, :cond_d

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/4 v6, 0x1

    if-lt v2, v6, :cond_7

    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    move/from16 v2, p1

    goto :goto_8

    :cond_c
    if-ne v2, v6, :cond_b

    move v2, v6

    :goto_8
    new-instance v5, Lp3/n;

    invoke-direct {v5, v2}, Lp3/n;-><init>(I)V

    move-object/from16 v26, v5

    goto :goto_4

    :cond_d
    const/4 v6, 0x1

    if-ne v5, v2, :cond_12

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v6, :cond_7

    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-nez v2, :cond_e

    move/from16 v2, p1

    :goto_9
    const/4 v6, 0x2

    goto :goto_a

    :cond_e
    if-ne v2, v6, :cond_f

    const v6, 0xffff

    move v2, v6

    goto :goto_9

    :cond_f
    const/4 v5, 0x3

    if-ne v2, v5, :cond_10

    const/4 v2, 0x2

    goto :goto_9

    :cond_10
    const/4 v6, 0x2

    if-ne v2, v6, :cond_11

    const/4 v2, 0x1

    goto :goto_a

    :cond_11
    move/from16 v2, p1

    :goto_a
    new-instance v5, Lp3/o;

    invoke-direct {v5, v2}, Lp3/o;-><init>(I)V

    move-object/from16 v27, v5

    goto :goto_6

    :cond_12
    const/4 v6, 0x6

    if-ne v5, v6, :cond_13

    invoke-virtual {v15}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v29

    goto :goto_6

    :cond_13
    const/4 v6, 0x7

    if-ne v5, v6, :cond_14

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v5

    if-lt v5, v2, :cond_7

    invoke-virtual {v13}, Lb3/b2;->b()J

    move-result-wide v30

    goto :goto_6

    :cond_14
    const/16 v2, 0x8

    if-ne v5, v2, :cond_15

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/4 v5, 0x4

    if-lt v2, v5, :cond_7

    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    new-instance v5, Lw3/a;

    invoke-direct {v5, v2}, Lw3/a;-><init>(F)V

    move-object/from16 v32, v5

    goto/16 :goto_6

    :cond_15
    const/16 v6, 0x9

    if-ne v5, v6, :cond_16

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v5

    if-lt v5, v2, :cond_7

    new-instance v2, Lw3/p;

    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    move-result v5

    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    move-result v6

    invoke-direct {v2, v5, v6}, Lw3/p;-><init>(FF)V

    move-object/from16 v33, v2

    goto/16 :goto_6

    :cond_16
    const/16 v6, 0xa

    if-ne v5, v6, :cond_17

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v5

    if-lt v5, v2, :cond_7

    invoke-virtual {v13}, Lb3/b2;->a()J

    move-result-wide v35

    goto/16 :goto_6

    :cond_17
    const/16 v2, 0xb

    if-ne v5, v2, :cond_1f

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/4 v5, 0x4

    if-lt v2, v5, :cond_7

    invoke-virtual {v15}, Landroid/os/Parcel;->readInt()I

    move-result v2

    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_18

    const/4 v6, 0x1

    goto :goto_b

    :cond_18
    move/from16 v6, p1

    :goto_b
    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_19

    const/4 v2, 0x1

    goto :goto_c

    :cond_19
    move/from16 v2, p1

    :goto_c
    sget-object v5, Lw3/l;->d:Lw3/l;

    move/from16 v18, v2

    sget-object v2, Lw3/l;->c:Lw3/l;

    if-eqz v6, :cond_1b

    if-eqz v18, :cond_1b

    filled-new-array {v5, v2}, [Lw3/l;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v6, v2

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    move-object/from16 v40, v4

    move/from16 v4, p1

    :goto_d
    if-ge v4, v6, :cond_1a

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v20, v2

    move-object/from16 v2, v18

    check-cast v2, Lw3/l;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    iget v2, v2, Lw3/l;->a:I

    or-int/2addr v2, v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v2, v20

    goto :goto_d

    :cond_1a
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v4, Lw3/l;

    invoke-direct {v4, v2}, Lw3/l;-><init>(I)V

    move-object/from16 v37, v4

    goto :goto_f

    :cond_1b
    move-object/from16 v40, v4

    if-eqz v6, :cond_1c

    move-object/from16 v37, v5

    goto :goto_f

    :cond_1c
    if-eqz v18, :cond_1d

    :goto_e
    move-object/from16 v37, v2

    goto :goto_f

    :cond_1d
    sget-object v2, Lw3/l;->b:Lw3/l;

    goto :goto_e

    :cond_1e
    :goto_f
    move-object/from16 v2, v17

    move-object/from16 v4, v40

    goto/16 :goto_7

    :cond_1f
    move-object/from16 v40, v4

    const/16 v2, 0xc

    if-ne v5, v2, :cond_1e

    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/16 v4, 0x14

    if-lt v2, v4, :cond_21

    new-instance v41, Li2/z0;

    invoke-virtual {v13}, Lb3/b2;->a()J

    move-result-wide v42

    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    move-result v4

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    move-wide/from16 v38, v5

    int-to-long v4, v2

    const/16 v2, 0x20

    shl-long v38, v38, v2

    const-wide v44, 0xffffffffL

    and-long v4, v4, v44

    or-long v44, v38, v4

    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    move-result v46

    invoke-direct/range {v41 .. v46}, Li2/z0;-><init>(JJF)V

    move-object/from16 v2, v17

    move-object/from16 v4, v40

    move-object/from16 v38, v41

    goto/16 :goto_7

    :cond_20
    move-object/from16 v17, v2

    goto/16 :goto_5

    :cond_21
    :goto_10
    new-instance v20, Ll3/m0;

    const v39, 0xc000

    const/16 v28, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v20 .. v39}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v2, v20

    new-instance v4, Ll3/e;

    invoke-direct {v4, v2, v3, v8}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_11
    if-eq v14, v12, :cond_23

    add-int/lit8 v14, v14, 0x1

    move/from16 v8, p1

    move-object/from16 v2, v17

    move-object/from16 v4, v40

    const/4 v5, 0x2

    const/4 v6, 0x1

    goto/16 :goto_2

    :cond_22
    move-object/from16 v17, v2

    move-object/from16 v40, v4

    :cond_23
    new-instance v2, Ll3/g;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    invoke-direct {v2, v5, v3, v11}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_12

    :cond_24
    move-object/from16 v40, v4

    const/4 v2, 0x0

    :goto_12
    if-ne v2, v1, :cond_25

    goto/16 :goto_15

    :cond_25
    :goto_13
    check-cast v2, Ll3/g;

    if-nez v2, :cond_26

    goto :goto_14

    :cond_26
    invoke-virtual {v7}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    invoke-virtual {v7}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-object v3, v3, Lq3/y;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v3}, Lvp/c;->Z(Lq3/y;I)Ll3/g;

    move-result-object v1

    new-instance v3, Ll3/d;

    invoke-direct {v3, v1}, Ll3/d;-><init>(Ll3/g;)V

    invoke-virtual {v3, v2}, Ll3/d;->c(Ll3/g;)V

    invoke-virtual {v3}, Ll3/d;->k()Ll3/g;

    move-result-object v1

    invoke-virtual {v7}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    invoke-virtual {v7}, Lf1/s1;->m()Lq3/y;

    move-result-object v4

    iget-object v4, v4, Lq3/y;->a:Ll3/g;

    iget-object v4, v4, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v3, v4}, Lvp/c;->Y(Lq3/y;I)Ll3/g;

    move-result-object v3

    new-instance v4, Ll3/d;

    invoke-direct {v4, v1}, Ll3/d;-><init>(Ll3/g;)V

    invoke-virtual {v4, v3}, Ll3/d;->c(Ll3/g;)V

    invoke-virtual {v4}, Ll3/d;->k()Ll3/g;

    move-result-object v1

    invoke-virtual {v7}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-wide v3, v3, Lq3/y;->b:J

    invoke-static {v3, v4}, Ll3/u0;->f(J)I

    move-result v3

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v3

    invoke-static {v2, v2}, Lj93/l0;->f(II)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object v1

    iget-object v2, v7, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, v1, Lq3/y;->b:J

    new-instance v3, Ll3/u0;

    invoke-direct {v3, v1, v2}, Ll3/u0;-><init>(J)V

    iput-object v3, v7, Lf1/s1;->w:Ll3/u0;

    sget-object v1, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {v7, v1}, Lf1/s1;->p(Lu0/g0;)V

    iget-object v1, v7, Lf1/s1;->a:Lu0/t1;

    const/4 v6, 0x1

    iput-boolean v6, v1, Lu0/t1;->e:Z

    :goto_14
    move-object/from16 v1, v40

    goto :goto_15

    :cond_27
    move-object/from16 v40, v4

    goto :goto_14

    :goto_15
    return-object v1

    :pswitch_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf1/m1;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    iget-object v5, v0, Lf1/m1;->y:Lf1/s1;

    if-eqz v2, :cond_29

    if-ne v2, v4, :cond_28

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :cond_28
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_29
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-wide v6, v2, Lq3/y;->b:J

    invoke-static {v6, v7}, Ll3/u0;->c(J)Z

    move-result v2

    if-eqz v2, :cond_2a

    :goto_16
    move-object v1, v3

    goto/16 :goto_18

    :cond_2a
    iget-object v2, v5, Lf1/s1;->h:Lb3/r1;

    if-eqz v2, :cond_2b

    invoke-virtual {v5}, Lf1/s1;->m()Lq3/y;

    move-result-object v6

    invoke-static {v6}, Lvp/c;->V(Lq3/y;)Ll3/g;

    move-result-object v6

    invoke-static {v6}, Lse/a;->f0(Ll3/g;)Lb3/q1;

    move-result-object v6

    iput v4, v0, Lf1/m1;->x:I

    check-cast v2, Lb3/i;

    invoke-virtual {v2, v6}, Lb3/i;->a(Lb3/q1;)V

    if-ne v3, v1, :cond_2b

    goto :goto_18

    :cond_2b
    :goto_17
    invoke-virtual {v5}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    invoke-virtual {v5}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-object v2, v2, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, Lvp/c;->Z(Lq3/y;I)Ll3/g;

    move-result-object v1

    invoke-virtual {v5}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    invoke-virtual {v5}, Lf1/s1;->m()Lq3/y;

    move-result-object v6

    iget-object v6, v6, Lq3/y;->a:Ll3/g;

    iget-object v6, v6, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v2, v6}, Lvp/c;->Y(Lq3/y;I)Ll3/g;

    move-result-object v2

    new-instance v6, Ll3/d;

    invoke-direct {v6, v1}, Ll3/d;-><init>(Ll3/g;)V

    invoke-virtual {v6, v2}, Ll3/d;->c(Ll3/g;)V

    invoke-virtual {v6}, Ll3/d;->k()Ll3/g;

    move-result-object v1

    invoke-virtual {v5}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-wide v6, v2, Lq3/y;->b:J

    invoke-static {v6, v7}, Ll3/u0;->f(J)I

    move-result v2

    invoke-static {v2, v2}, Lj93/l0;->f(II)J

    move-result-wide v6

    invoke-static {v1, v6, v7}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object v1

    iget-object v2, v5, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, v1, Lq3/y;->b:J

    new-instance v6, Ll3/u0;

    invoke-direct {v6, v1, v2}, Ll3/u0;-><init>(J)V

    iput-object v6, v5, Lf1/s1;->w:Ll3/u0;

    sget-object v1, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {v5, v1}, Lf1/s1;->p(Lu0/g0;)V

    iget-object v1, v5, Lf1/s1;->a:Lu0/t1;

    iput-boolean v4, v1, Lu0/t1;->e:Z

    goto :goto_16

    :goto_18
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
