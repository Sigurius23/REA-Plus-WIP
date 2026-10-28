.class public abstract Ls7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static a(Lv00/i0;ZLq20/h;)Ly00/r3;
    .locals 1

    const-string v0, "customerRequestedSave"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_5

    instance-of p1, p0, Lv00/h0;

    if-eqz p1, :cond_0

    sget-object p0, Ly00/r3;->x:Ly00/r3;

    return-object p0

    :cond_0
    instance-of p1, p0, Lv00/e0;

    if-eqz p1, :cond_2

    check-cast p0, Lv00/e0;

    iget-object p0, p0, Lv00/e0;->w:Ly00/r3;

    if-nez p0, :cond_1

    sget-object p0, Ly00/r3;->y:Ly00/r3;

    :cond_1
    return-object p0

    :cond_2
    instance-of p0, p0, Lv00/f0;

    if-eqz p0, :cond_4

    sget-object p0, Lq20/h;->x:Lq20/h;

    if-ne p2, p0, :cond_3

    sget-object p0, Ly00/r3;->z:Ly00/r3;

    return-object p0

    :cond_3
    sget-object p0, Ly00/r3;->y:Ly00/r3;

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    instance-of p1, p0, Lv00/h0;

    if-eqz p1, :cond_6

    sget-object p0, Ly00/r3;->x:Ly00/r3;

    return-object p0

    :cond_6
    instance-of p1, p0, Lv00/e0;

    if-eqz p1, :cond_7

    sget-object p0, Ly00/r3;->x:Ly00/r3;

    return-object p0

    :cond_7
    instance-of p0, p0, Lv00/f0;

    if-eqz p0, :cond_9

    sget-object p0, Lq20/h;->x:Lq20/h;

    if-ne p2, p0, :cond_8

    sget-object p0, Ly00/r3;->z:Ly00/r3;

    return-object p0

    :cond_8
    sget-object p0, Ly00/r3;->x:Ly00/r3;

    return-object p0

    :cond_9
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static b(Lve/e;Lug/b;Lgf/c;I)Lve/e;
    .locals 6

    iget-object v1, p0, Lve/e;->a:Ljava/lang/String;

    iget-object v2, p0, Lve/e;->b:Ljava/lang/String;

    iget-object v3, p0, Lve/e;->c:Ljava/lang/String;

    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_0

    iget-object p1, p0, Lve/e;->d:Lug/b;

    :cond_0
    move-object v4, p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lve/e;->e:Lgf/b;

    sget-object v0, Lxf/b;->a:Lgf/a;

    invoke-interface {p1, v0}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    and-int/lit8 p3, p3, 0x20

    if-eqz p3, :cond_1

    iget-object p2, p0, Lve/e;->e:Lgf/b;

    :cond_1
    const-string p3, "<this>"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "accessKeyId"

    invoke-static {v1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "secretAccessKey"

    invoke-static {v2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lve/e;->e:Lgf/b;

    invoke-interface {p0, v0}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 p3, 0x0

    if-eqz p0, :cond_3

    if-nez p1, :cond_3

    invoke-static {p2}, Ljc/x;->w0(Lgf/b;)Lgf/c;

    move-result-object p0

    invoke-virtual {p0, v0}, Lgf/c;->e(Lgf/a;)V

    iget-object p2, p0, Lgf/c;->w:Ljava/util/LinkedHashMap;

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    move-object p2, p0

    goto :goto_0

    :cond_2
    move-object p2, p3

    :cond_3
    :goto_0
    if-eqz p1, :cond_7

    if-eqz p2, :cond_4

    invoke-interface {p2, v0}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    move-object p3, p0

    check-cast p3, Ljava/lang/String;

    :cond_4
    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    if-eqz p2, :cond_5

    invoke-static {p2}, Ljc/x;->w0(Lgf/b;)Lgf/c;

    move-result-object p0

    :goto_1
    move-object p2, p0

    goto :goto_2

    :cond_5
    new-instance p0, Lgf/c;

    invoke-direct {p0}, Lgf/c;-><init>()V

    goto :goto_1

    :goto_2
    invoke-static {p2, v0, p1}, Ljc/x;->s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    :cond_6
    :goto_3
    move-object v5, p2

    goto :goto_4

    :cond_7
    if-nez p2, :cond_6

    sget-object p2, Lgf/i;->w:Lgf/i;

    goto :goto_3

    :goto_4
    new-instance v0, Lve/e;

    invoke-direct/range {v0 .. v5}, Lve/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Lgf/b;)V

    return-object v0
.end method

.method public static c(Le30/c;Lv00/c0;Ljava/lang/String;Ld30/a;)Lt20/n;
    .locals 40

    move-object/from16 v2, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedPaymentMethodCode"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v8, Lv00/c0;->w:Ly00/c8;

    iget-object v1, v8, Lv00/c0;->S:Lv00/i0;

    iget-object v10, v8, Lv00/c0;->P:Lv00/p;

    const/4 v3, 0x1

    const/4 v11, 0x0

    if-eqz v10, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v11

    :goto_0
    invoke-static {v9, v1, v0, v4}, Ls4/b;->q(Ljava/lang/String;Lv00/i0;Ly00/c8;Z)Z

    move-result v1

    sget-object v4, Ly00/f4;->G:Lt9/c0;

    const-string v4, "link"

    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v1, :cond_1

    if-nez v13, :cond_1

    move/from16 v17, v3

    goto :goto_1

    :cond_1
    move/from16 v17, v11

    :goto_1
    iget-object v15, v8, Lv00/c0;->T:Ly00/p2;

    iget-object v12, v8, Lv00/c0;->g0:Ljava/lang/String;

    iget-boolean v14, v2, Le30/c;->G:Z

    instance-of v1, v0, Ly00/l3;

    invoke-interface {v0}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v20

    invoke-interface {v0}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v21

    iget-object v0, v2, Le30/c;->w:Lh20/x1;

    iget-object v0, v0, Lh20/x1;->E:Li20/b;

    iget-object v3, v2, Le30/c;->N:Ld1/j;

    invoke-virtual {v2}, Le30/c;->n()Lh20/d0;

    move-result-object v4

    const/16 v16, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v4}, Lh20/d0;->b()Lq20/y;

    move-result-object v4

    move-object/from16 v24, v4

    goto :goto_2

    :cond_2
    move-object/from16 v24, v16

    :goto_2
    new-instance v25, Landroidx/room/v0;

    iget-object v4, v2, Le30/c;->T:Lh20/z;

    const/16 v31, 0x0

    const/16 v32, 0x15

    const/16 v26, 0x2

    const-class v28, Lh20/z;

    const-string v29, "updateMandateText"

    const-string v30, "updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V"

    move-object/from16 v27, v4

    invoke-direct/range {v25 .. v32}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v28, Lq00/h0;

    const/16 v32, 0x0

    const/16 v33, 0x15

    const/16 v27, 0x1

    const-class v29, Ld30/a;

    const-string v30, "handleLinkedBankAccountChanged"

    const-string v31, "handleLinkedBankAccountChanged(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V"

    move-object/from16 v26, v28

    move-object/from16 v28, p3

    invoke-direct/range {v26 .. v33}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v28, v26

    new-instance v30, Lq00/h0;

    const/4 v6, 0x0

    const/16 v7, 0x16

    move/from16 v19, v1

    const/4 v1, 0x1

    move-object v4, v3

    const-class v3, Le30/c;

    move-object v5, v4

    const-string v4, "updatePrimaryButtonState"

    move-object/from16 v18, v5

    const-string v5, "updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V"

    move-object/from16 v23, v0

    move-object/from16 v0, v30

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v31, Lq00/h0;

    const/16 v7, 0x17

    const-class v3, Le30/c;

    const-string v4, "onError"

    const-string v5, "onError(Lcom/stripe/android/core/strings/ResolvableString;)V"

    move-object/from16 v2, p0

    move-object/from16 v0, v31

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v4, v18

    move/from16 v18, v14

    iget-object v14, v8, Lv00/c0;->V:Lq20/c;

    if-eqz v10, :cond_3

    iget-boolean v11, v10, Lv00/p;->z:Z

    :cond_3
    move/from16 v33, v11

    iget-object v0, v8, Lv00/c0;->W:Lf20/b;

    iget-object v1, v2, Le30/c;->Z:Lh20/f;

    iget-object v1, v1, Lh20/f;->c:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v35

    sget-object v1, Lv00/d0;->b:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/b0;

    if-eqz v1, :cond_4

    invoke-interface {v1}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v16

    :cond_4
    move-object/from16 v1, v16

    iget-object v3, v8, Lv00/c0;->Z:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/i3;

    if-nez v1, :cond_5

    sget-object v1, Lh20/i3;->w:Lh20/i3;

    :cond_5
    move-object/from16 v36, v1

    iget-object v1, v8, Lv00/c0;->J:Ljava/lang/String;

    iget-boolean v3, v8, Lv00/c0;->a0:Z

    iget-object v5, v8, Lv00/c0;->d0:Ly00/n;

    move-object/from16 v16, v12

    new-instance v12, Lt20/n;

    new-instance v6, Ld30/f;

    const/16 v7, 0x8

    invoke-direct {v6, v2, v7}, Ld30/f;-><init>(Le30/c;I)V

    new-instance v7, Ld30/f;

    const/16 v8, 0x9

    invoke-direct {v7, v2, v8}, Ld30/f;-><init>(Le30/c;I)V

    new-instance v8, Le30/a;

    const/4 v9, 0x4

    invoke-direct {v8, v2, v9}, Le30/a;-><init>(Le30/c;I)V

    const-string v22, "payment_element"

    move-object/from16 v34, v0

    move-object/from16 v37, v1

    move/from16 v38, v3

    move-object/from16 v39, v5

    move-object/from16 v26, v6

    move-object/from16 v29, v7

    move-object/from16 v32, v8

    move-object/from16 v27, v25

    move-object/from16 v25, v4

    invoke-direct/range {v12 .. v39}, Lt20/n;-><init>(ZLq20/c;Ly00/p2;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Li20/b;Lq20/y;Lg40/z;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLf20/b;ZLh20/i3;Ljava/lang/String;ZLy00/n;)V

    return-object v12
.end method

.method public static final d(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$encodeUTF8"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0xffff

    add-int v3, p2, v2

    move/from16 v4, p3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    move/from16 v4, p5

    if-le v4, v2, :cond_0

    move v4, v2

    :cond_0
    move/from16 v6, p2

    move/from16 v5, p4

    :goto_0
    if-ge v5, v4, :cond_1

    if-lt v6, v3, :cond_2

    :cond_1
    move/from16 v16, v2

    goto/16 :goto_d

    :cond_2
    add-int/lit8 v7, v6, 0x1

    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    and-int v9, v8, v2

    const v10, 0xff80

    and-int/2addr v8, v10

    if-nez v8, :cond_3

    add-int/lit8 v6, v5, 0x1

    int-to-byte v8, v9

    invoke-virtual {v0, v5, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v5, v6

    move v6, v7

    goto :goto_0

    :cond_3
    add-int/lit8 v7, v4, -0x3

    :goto_1
    sub-int v8, v7, v5

    const v10, 0xd7c0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x4

    const/high16 v14, 0x110000

    const/high16 v15, 0x10000

    move/from16 v16, v2

    const/16 v2, 0x800

    const/16 v17, 0x2

    const/16 v18, 0x3f

    const p3, 0xdc00

    const/16 v9, 0x80

    const/16 v19, 0x3

    if-lez v8, :cond_c

    if-lt v6, v3, :cond_4

    goto/16 :goto_6

    :cond_4
    add-int/lit8 v8, v6, 0x1

    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v20

    invoke-static/range {v20 .. v20}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v21

    if-eqz v21, :cond_7

    if-eq v8, v3, :cond_6

    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v21

    if-nez v21, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, 0x2

    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    sub-int v20, v20, v10

    sub-int v8, v8, p3

    shl-int/lit8 v10, v20, 0xa

    or-int v20, v10, v8

    :goto_2
    move/from16 v8, v20

    goto :goto_4

    :cond_6
    :goto_3
    move v6, v8

    move/from16 v8, v18

    goto :goto_4

    :cond_7
    move v6, v8

    goto :goto_2

    :goto_4
    if-ltz v8, :cond_8

    if-ge v8, v9, :cond_8

    int-to-byte v2, v8

    invoke-virtual {v0, v5, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    goto :goto_5

    :cond_8
    if-gt v9, v8, :cond_9

    if-ge v8, v2, :cond_9

    shr-int/lit8 v2, v8, 0x6

    and-int/lit8 v2, v2, 0x1f

    or-int/lit16 v2, v2, 0xc0

    int-to-byte v2, v2

    invoke-virtual {v0, v5, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v5, 0x1

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-virtual {v0, v2, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move/from16 v12, v17

    goto :goto_5

    :cond_9
    if-gt v2, v8, :cond_a

    if-ge v8, v15, :cond_a

    shr-int/lit8 v2, v8, 0xc

    and-int/lit8 v2, v2, 0xf

    or-int/lit16 v2, v2, 0xe0

    int-to-byte v2, v2

    invoke-virtual {v0, v5, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v5, 0x1

    shr-int/lit8 v10, v8, 0x6

    and-int/lit8 v10, v10, 0x3f

    or-int/2addr v10, v9

    int-to-byte v10, v10

    invoke-virtual {v0, v2, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v5, 0x2

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-virtual {v0, v2, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move/from16 v12, v19

    goto :goto_5

    :cond_a
    if-gt v15, v8, :cond_b

    if-ge v8, v14, :cond_b

    shr-int/lit8 v2, v8, 0x12

    and-int/lit8 v2, v2, 0x7

    or-int/lit16 v2, v2, 0xf0

    int-to-byte v2, v2

    invoke-virtual {v0, v5, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v5, 0x1

    shr-int/lit8 v10, v8, 0xc

    and-int/lit8 v10, v10, 0x3f

    or-int/2addr v10, v9

    int-to-byte v10, v10

    invoke-virtual {v0, v2, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v5, 0x2

    shr-int/lit8 v10, v8, 0x6

    and-int/lit8 v10, v10, 0x3f

    or-int/2addr v10, v9

    int-to-byte v10, v10

    invoke-virtual {v0, v2, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v5, 0x3

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-virtual {v0, v2, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v12, v13

    :goto_5
    add-int/2addr v5, v12

    move/from16 v2, v16

    goto/16 :goto_1

    :cond_b
    invoke-static {v8}, Ls7/a;->o(I)V

    throw v11

    :cond_c
    :goto_6
    if-ne v5, v7, :cond_1a

    :goto_7
    sub-int v7, v4, v5

    if-lez v7, :cond_1a

    if-lt v6, v3, :cond_d

    goto/16 :goto_d

    :cond_d
    add-int/lit8 v8, v6, 0x1

    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v20

    invoke-static/range {v20 .. v20}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v21

    if-nez v21, :cond_e

    move v6, v8

    :goto_8
    move/from16 v8, v20

    goto :goto_a

    :cond_e
    if-eq v8, v3, :cond_10

    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v21

    if-nez v21, :cond_f

    goto :goto_9

    :cond_f
    add-int/lit8 v6, v6, 0x2

    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    sub-int v20, v20, v10

    sub-int v8, v8, p3

    shl-int/lit8 v20, v20, 0xa

    or-int v20, v20, v8

    goto :goto_8

    :cond_10
    :goto_9
    move v6, v8

    move/from16 v8, v18

    :goto_a
    if-gt v12, v8, :cond_11

    if-ge v8, v9, :cond_11

    move v10, v12

    goto :goto_b

    :cond_11
    if-gt v9, v8, :cond_12

    if-ge v8, v2, :cond_12

    move/from16 v10, v17

    goto :goto_b

    :cond_12
    if-gt v2, v8, :cond_13

    if-ge v8, v15, :cond_13

    move/from16 v10, v19

    goto :goto_b

    :cond_13
    if-gt v15, v8, :cond_19

    if-ge v8, v14, :cond_19

    move v10, v13

    :goto_b
    if-le v10, v7, :cond_14

    add-int/lit8 v6, v6, -0x1

    goto/16 :goto_d

    :cond_14
    if-ltz v8, :cond_15

    if-ge v8, v9, :cond_15

    int-to-byte v7, v8

    invoke-virtual {v0, v5, v7}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v7, v12

    goto :goto_c

    :cond_15
    if-gt v9, v8, :cond_16

    if-ge v8, v2, :cond_16

    shr-int/lit8 v7, v8, 0x6

    and-int/lit8 v7, v7, 0x1f

    or-int/lit16 v7, v7, 0xc0

    int-to-byte v7, v7

    invoke-virtual {v0, v5, v7}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v5, 0x1

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-virtual {v0, v7, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move/from16 v7, v17

    goto :goto_c

    :cond_16
    if-gt v2, v8, :cond_17

    if-ge v8, v15, :cond_17

    shr-int/lit8 v7, v8, 0xc

    and-int/lit8 v7, v7, 0xf

    or-int/lit16 v7, v7, 0xe0

    int-to-byte v7, v7

    invoke-virtual {v0, v5, v7}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v5, 0x1

    shr-int/lit8 v10, v8, 0x6

    and-int/lit8 v10, v10, 0x3f

    or-int/2addr v10, v9

    int-to-byte v10, v10

    invoke-virtual {v0, v7, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v5, 0x2

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-virtual {v0, v7, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move/from16 v7, v19

    goto :goto_c

    :cond_17
    if-gt v15, v8, :cond_18

    if-ge v8, v14, :cond_18

    shr-int/lit8 v7, v8, 0x12

    and-int/lit8 v7, v7, 0x7

    or-int/lit16 v7, v7, 0xf0

    int-to-byte v7, v7

    invoke-virtual {v0, v5, v7}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v5, 0x1

    shr-int/lit8 v10, v8, 0xc

    and-int/lit8 v10, v10, 0x3f

    or-int/2addr v10, v9

    int-to-byte v10, v10

    invoke-virtual {v0, v7, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v5, 0x2

    shr-int/lit8 v10, v8, 0x6

    and-int/lit8 v10, v10, 0x3f

    or-int/2addr v10, v9

    int-to-byte v10, v10

    invoke-virtual {v0, v7, v10}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v5, 0x3

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-virtual {v0, v7, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    move v7, v13

    :goto_c
    add-int/2addr v5, v7

    const v10, 0xd7c0

    goto/16 :goto_7

    :cond_18
    invoke-static {v8}, Ls7/a;->o(I)V

    throw v11

    :cond_19
    invoke-static {v8}, Ls7/a;->o(I)V

    throw v11

    :cond_1a
    :goto_d
    sub-int v6, v6, p2

    int-to-short v0, v6

    sub-int v5, v5, p4

    int-to-short v1, v5

    and-int v0, v0, v16

    shl-int/lit8 v0, v0, 0x10

    and-int v1, v1, v16

    or-int/2addr v0, v1

    return v0
.end method

.method public static final e([Ljava/lang/annotation/Annotation;Lva3/e;)Lx93/d;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_1

    aget-object v3, p0, v1

    invoke-static {v3}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v4

    invoke-static {v4}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v4

    invoke-virtual {v4}, Lva3/c;->a()Lva3/e;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_2

    new-instance p0, Lx93/d;

    invoke-direct {p0, v3}, Lx93/d;-><init>(Ljava/lang/annotation/Annotation;)V

    return-object p0

    :cond_2
    return-object v2
.end method

.method public static final f([Ljava/lang/annotation/Annotation;)Ljava/util/ArrayList;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    new-instance v4, Lx93/d;

    invoke-direct {v4, v3}, Lx93/d;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)Lv7/b;
    .locals 3

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ldb/j0;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Ldb/j0;-><init>(Ljava/lang/String;IZ)V

    new-instance p1, Lv7/b;

    invoke-direct {p1, p0, v0}, Lv7/b;-><init>(Landroid/content/Context;Ldb/j0;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Service package name must not be empty."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final h(I)I
    .locals 1

    ushr-int/lit8 p0, p0, 0xa

    const v0, 0xd7c0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final i(I)Z
    .locals 0

    ushr-int/lit8 p0, p0, 0x10

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final j(I)Z
    .locals 1

    const v0, 0x10ffff

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final k(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ComposeInternal"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static final l(I)I
    .locals 1

    and-int/lit16 p0, p0, 0x3ff

    const v0, 0xdc00

    add-int/2addr p0, v0

    return p0
.end method

.method public static final n(I)V
    .locals 3

    new-instance v0, Lio/ktor/utils/io/core/internal/MalformedUTF8InputException;

    const-string v1, "Expected "

    const-string v2, " more character bytes"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/ktor/utils/io/core/internal/MalformedUTF8InputException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final o(I)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Malformed code-point "

    const-string v2, " found"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static p(Lorg/json/JSONObject;)Ly00/l6;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "address"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "state"

    const-string v4, "postal_code"

    const-string v5, "line2"

    const-string v6, "line1"

    const-string v7, "country"

    const-string v8, "city"

    if-eqz v1, :cond_0

    invoke-static {v8, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v6, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v5, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v4, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    new-instance v9, Ly00/c;

    invoke-direct/range {v9 .. v15}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v11, v9

    goto :goto_0

    :cond_0
    move-object v11, v2

    :goto_0
    const-string v1, "email"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v1, "name"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v1, "phone"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v1, "verified_address"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v8, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    invoke-static {v7, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v17

    invoke-static {v6, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    invoke-static {v5, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v19

    invoke-static {v4, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v20

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v21

    new-instance v15, Ly00/c;

    invoke-direct/range {v15 .. v21}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v15, v2

    :goto_1
    const-string v1, "verified_email"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    const-string v1, "verified_name"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v17

    const-string v1, "verified_phone"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    new-instance v10, Ly00/l6;

    invoke-direct/range {v10 .. v18}, Ly00/l6;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v10
.end method

.method public static final q(Ljava/lang/String;)B
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-static {v0, p0}, Ls7/a;->r(ILjava/lang/String;)Ll83/t;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, Ll83/t;->w:I

    const/16 v2, 0xff

    invoke-static {v0, v2}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-byte v0, v0

    new-instance v2, Ll83/r;

    invoke-direct {v2, v0}, Ll83/r;-><init>(B)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_2

    iget-byte p0, v2, Ll83/r;->w:B

    return p0

    :cond_2
    invoke-static {p0}, Lyb3/y;->H(Ljava/lang/String;)V

    throw v1
.end method

.method public static final r(ILjava/lang/String;)Ll83/t;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lva3/d;->c(I)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v3

    if-gez v3, :cond_1

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    const/16 v4, 0x2b

    if-eq v2, v4, :cond_2

    goto :goto_1

    :cond_1
    move v3, v1

    :cond_2
    const v2, 0x71c71c7

    move v4, v2

    :goto_0
    if-ge v3, v0, :cond_7

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, p0}, Ljava/lang/Character;->digit(II)I

    move-result v5

    if-gez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v6

    if-lez v6, :cond_4

    if-ne v4, v2, :cond_5

    const/4 v4, -0x1

    invoke-static {v4, p0}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v6

    if-lez v6, :cond_4

    goto :goto_1

    :cond_4
    mul-int/2addr v1, p0

    add-int/2addr v5, v1

    invoke-static {v5, v1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v1

    if-gez v1, :cond_6

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return-object p0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    move v1, v5

    goto :goto_0

    :cond_7
    new-instance p0, Ll83/t;

    invoke-direct {p0, v1}, Ll83/t;-><init>(I)V

    return-object p0
.end method

.method public static final s(Ljava/lang/String;)Ll83/v;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-static {v0}, Lva3/d;->c(I)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-gez v4, :cond_1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/16 v4, 0x2b

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    int-to-long v3, v0

    const-wide v5, 0x71c71c71c71c71cL

    const-wide/16 v7, 0x0

    move-wide v9, v5

    :goto_0
    if-ge v2, v1, :cond_6

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11, v0}, Ljava/lang/Character;->digit(II)I

    move-result v11

    if-gez v11, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v12

    if-lez v12, :cond_3

    cmp-long v9, v9, v5

    if-nez v9, :cond_4

    const-wide/16 v9, -0x1

    invoke-static {v9, v10, v3, v4}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v12

    if-lez v12, :cond_3

    goto :goto_1

    :cond_3
    mul-long/2addr v7, v3

    int-to-long v11, v11

    const-wide v13, 0xffffffffL

    and-long/2addr v11, v13

    add-long/2addr v11, v7

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v7

    if-gez v7, :cond_5

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return-object p0

    :cond_5
    add-int/lit8 v2, v2, 0x1

    move-wide v7, v11

    goto :goto_0

    :cond_6
    new-instance p0, Ll83/v;

    invoke-direct {p0, v7, v8}, Ll83/v;-><init>(J)V

    return-object p0
.end method

.method public static final t(Ljava/lang/String;)S
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    invoke-static {v0, p0}, Ls7/a;->r(ILjava/lang/String;)Ll83/t;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, Ll83/t;->w:I

    const v2, 0xffff

    invoke-static {v0, v2}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-short v0, v0

    new-instance v2, Ll83/y;

    invoke-direct {v2, v0}, Ll83/y;-><init>(S)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_2

    iget-short p0, v2, Ll83/y;->w:S

    return p0

    :cond_2
    invoke-static {p0}, Lyb3/y;->H(Ljava/lang/String;)V

    throw v1
.end method
