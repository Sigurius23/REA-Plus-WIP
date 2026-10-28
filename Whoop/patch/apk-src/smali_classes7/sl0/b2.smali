.class public final synthetic Lsl0/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsl0/b2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget v1, v0, Lsl0/b2;->w:I

    const/16 v3, 0x2d

    const-string v9, "no alternatives matched"

    const/16 v13, 0x18

    const-string v14, "` found `"

    const-string v15, "expected `"

    const/16 v16, 0x3

    sget-object v17, Ll83/a0;->a:Ll83/a0;

    const/16 v4, 0xd

    const/16 v18, 0x3c

    const-string v5, "str"

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lv6/k;

    move-object/from16 v2, p2

    check-cast v2, Lv6/b;

    iget v2, v2, Lv6/b;->a:I

    iput v2, v1, Lv6/k;->d:I

    return-object v17

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lv6/k;

    move-object/from16 v2, p2

    check-cast v2, Lv6/a;

    iget v2, v2, Lv6/a;->a:I

    iput v2, v1, Lv6/k;->e:I

    return-object v17

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Lv6/k;

    move-object/from16 v2, p2

    check-cast v2, Ln6/o;

    iput-object v2, v1, Lv6/k;->c:Ln6/o;

    return-object v17

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lv6/j;

    move-object/from16 v2, p2

    check-cast v2, Lv6/c;

    iput-object v2, v1, Lv6/j;->d:Lv6/c;

    return-object v17

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Lv6/j;

    move-object/from16 v2, p2

    check-cast v2, Ln6/o;

    iput-object v2, v1, Lv6/j;->c:Ln6/o;

    return-object v17

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lv41/e;->c(Landroidx/compose/runtime/Composer;I)Ll0/b2;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lux0/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Luw0/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lui0/d;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v4, p2

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lug/j;

    const/16 v11, 0x2b

    invoke-direct {v5, v11}, Lug/j;-><init>(C)V

    new-instance v11, Lug/j;

    invoke-direct {v11, v3}, Lug/j;-><init>(C)V

    new-array v10, v6, [Lc93/m;

    aput-object v5, v10, v8

    aput-object v11, v10, v7

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    array-length v11, v10

    move v2, v8

    :goto_0
    if-ge v2, v11, :cond_0

    aget-object v12, v10, v2

    :try_start_0
    invoke-interface {v12, v1, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lug/f;
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_1
    if-eqz v12, :cond_4

    iget v2, v12, Lug/f;->a:I

    iget-object v4, v12, Lug/f;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Character;

    invoke-virtual {v4}, Ljava/lang/Character;->charValue()C

    move-result v4

    if-ne v4, v3, :cond_1

    const/4 v3, -0x1

    goto :goto_2

    :cond_1
    move v3, v7

    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Lug/f;

    invoke-direct {v4, v2, v3}, Lug/f;-><init>(ILjava/lang/Object;)V

    iget-object v2, v4, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v3, Li93/j;

    invoke-direct {v3, v8, v13, v7}, Li93/h;-><init>(III)V

    new-instance v5, Lsl0/j2;

    invoke-direct {v5, v6, v3}, Lsl0/j2;-><init>(ILi93/j;)V

    iget v3, v4, Lug/f;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5, v1, v3}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lug/f;

    iget v4, v3, Lug/f;->a:I

    iget-object v3, v3, Lug/f;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    :try_start_1
    invoke-static {v4, v7, v1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v9, 0x3a

    if-ne v5, v9, :cond_2

    new-instance v9, Lug/f;

    add-int/lit8 v10, v4, 0x1

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-direct {v9, v10, v5}, Lug/f;-><init>(ILjava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance v9, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v11, 0x3a

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0x60

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v9, v1, v5, v4}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v9
    :try_end_1
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v9, Lug/f;

    const/4 v5, 0x0

    invoke-direct {v9, v4, v5}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    iget v5, v9, Lug/f;->a:I

    if-ge v5, v4, :cond_3

    new-instance v4, Li93/j;

    const/16 v9, 0x3b

    invoke-direct {v4, v8, v9, v7}, Li93/h;-><init>(III)V

    new-instance v7, Lsl0/j2;

    invoke-direct {v7, v6, v4}, Lsl0/j2;-><init>(ILi93/j;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v1, v4}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lug/f;

    goto :goto_4

    :cond_3
    new-instance v1, Lug/f;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v1, v5, v4}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_4
    iget v4, v1, Lug/f;->a:I

    iget-object v1, v1, Lug/f;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    mul-int/lit16 v3, v3, 0xe10

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    new-instance v2, Lug/f;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v2, v4, v1}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v2

    :cond_4
    new-instance v2, Laws/smithy/kotlin/runtime/time/ParseException;

    invoke-direct {v2, v1, v9, v5}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v2

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_2
    const-string v5, "GMT"

    new-instance v10, Lb30/z;

    invoke-direct {v10, v5, v4, v8}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    const-string v5, "UTC"

    new-instance v11, Lb30/z;

    invoke-direct {v11, v5, v4, v8}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    const-string v5, "UT"

    new-instance v12, Lb30/z;

    invoke-direct {v12, v5, v4, v8}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    const-string v5, "Z"

    new-instance v13, Lb30/z;

    invoke-direct {v13, v5, v4, v8}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    const/4 v4, 0x4

    new-array v4, v4, [Lc93/m;

    aput-object v10, v4, v8

    aput-object v11, v4, v7

    aput-object v12, v4, v6

    aput-object v13, v4, v16

    new-instance v5, Ltx0/a;

    const/16 v10, 0xa

    invoke-direct {v5, v4, v10}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    new-instance v4, Lu71/c;

    const/16 v10, 0x14

    invoke-direct {v4, v10}, Lu71/c;-><init>(I)V

    new-instance v11, Lpp2/o;

    const/16 v12, 0x10

    invoke-direct {v11, v12, v5, v4}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lsl0/b2;

    invoke-direct {v4, v10}, Lsl0/b2;-><init>(I)V

    new-array v5, v6, [Lc93/m;

    aput-object v11, v5, v8

    aput-object v4, v5, v7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    array-length v6, v5

    :goto_5
    if-ge v8, v6, :cond_5

    aget-object v7, v5, v8
    :try_end_2
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    invoke-interface {v7, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lug/f;
    :try_end_3
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_3 .. :try_end_3} :catch_2

    move-object v10, v7

    goto :goto_6

    :catch_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_5
    const/4 v10, 0x0

    :goto_6
    if-eqz v10, :cond_6

    return-object v10

    :cond_6
    :try_start_4
    new-instance v2, Laws/smithy/kotlin/runtime/time/ParseException;

    invoke-direct {v2, v1, v9, v4}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v2
    :try_end_4
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    new-instance v2, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v4, "invalid timezone offset; expected `GMT` or `(+-)HHMM`"

    invoke-direct {v2, v1, v4, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v2

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    const-string v4, "Zz"

    new-instance v5, Lb30/z;

    const/16 v10, 0xe

    invoke-direct {v5, v4, v10, v8}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v4, Lu71/c;

    const/16 v10, 0x13

    invoke-direct {v4, v10}, Lu71/c;-><init>(I)V

    new-instance v10, Lpp2/o;

    const/16 v11, 0x10

    invoke-direct {v10, v11, v5, v4}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lsl0/b2;

    const/16 v5, 0x14

    invoke-direct {v4, v5}, Lsl0/b2;-><init>(I)V

    new-array v5, v6, [Lc93/m;

    aput-object v10, v5, v8

    aput-object v4, v5, v7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    array-length v6, v5

    :goto_7
    if-ge v8, v6, :cond_7

    aget-object v7, v5, v8
    :try_end_5
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_5 .. :try_end_5} :catch_5

    :try_start_6
    invoke-interface {v7, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lug/f;
    :try_end_6
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_6 .. :try_end_6} :catch_4

    move-object v10, v7

    goto :goto_8

    :catch_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_7
    const/4 v10, 0x0

    :goto_8
    if-eqz v10, :cond_8

    return-object v10

    :cond_8
    :try_start_7
    new-instance v2, Laws/smithy/kotlin/runtime/time/ParseException;

    invoke-direct {v2, v1, v9, v4}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v2
    :try_end_7
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_7 .. :try_end_7} :catch_5

    :catch_5
    new-instance v2, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v4, "invalid timezone offset; expected `Z|z` or `(+-)HH:MM`"

    invoke-direct {v2, v1, v4, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v2

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Li93/j;

    invoke-direct {v5, v8, v13, v7}, Li93/h;-><init>(III)V

    new-instance v9, Lsl0/j2;

    invoke-direct {v9, v6, v5}, Lsl0/j2;-><init>(ILi93/j;)V

    invoke-virtual {v9, v1, v2}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v5, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v20

    new-instance v2, Li93/j;

    const/16 v9, 0x3b

    invoke-direct {v2, v8, v9, v7}, Li93/h;-><init>(III)V

    new-instance v9, Lsl0/j2;

    invoke-direct {v9, v6, v2}, Lsl0/j2;-><init>(ILi93/j;)V

    invoke-static {v5, v7, v1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_c

    new-instance v10, Lug/f;

    add-int/2addr v5, v7

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v10, v5, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    iget v2, v10, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v9, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v5, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v21

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v5, v2, :cond_a

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_a

    new-instance v2, Li93/j;

    move/from16 v9, v18

    invoke-direct {v2, v8, v9, v7}, Li93/h;-><init>(III)V

    new-instance v9, Lsl0/j2;

    invoke-direct {v9, v6, v2}, Lsl0/j2;-><init>(ILi93/j;)V

    invoke-static {v5, v7, v1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v11, :cond_9

    new-instance v6, Lug/f;

    add-int/2addr v5, v7

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v6, v5, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    iget v2, v6, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v9, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    goto :goto_9

    :cond_9
    new-instance v3, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v11, 0x3a

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0x60

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v1, v2, v5}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v3

    :cond_a
    new-instance v2, Lug/f;

    invoke-direct {v2, v5, v3}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_9
    iget v5, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v22

    new-instance v2, Lb30/z;

    const-string v6, "."

    const/16 v10, 0xe

    invoke-direct {v2, v6, v10, v8}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v6, Lsl0/b2;

    invoke-direct {v6, v4}, Lsl0/b2;-><init>(I)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :try_start_8
    invoke-interface {v2, v1, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v2, v2, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;
    :try_end_8
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_a

    :catch_6
    new-instance v2, Lug/f;

    const/4 v4, 0x0

    invoke-direct {v2, v5, v4}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_a
    iget v4, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    if-nez v2, :cond_b

    goto :goto_b

    :cond_b
    move-object v3, v2

    :goto_b
    new-instance v2, Lug/f;

    invoke-direct {v2, v4, v3}, Lug/f;-><init>(ILjava/lang/Object;)V

    iget-object v3, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v23

    sget-object v3, Lug/r;->w:Lug/r;

    new-instance v4, Lsl0/b2;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lsl0/b2;-><init>(I)V

    iget v2, v2, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v2, v2, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lug/f;

    iget v2, v1, Lug/f;->a:I

    iget-object v1, v1, Lug/f;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v24

    new-instance v1, Lug/f;

    new-instance v19, Lug/i;

    invoke-direct/range {v19 .. v24}, Lug/i;-><init>(IIIII)V

    move-object/from16 v3, v19

    invoke-direct {v1, v2, v3}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v1

    :cond_c
    new-instance v3, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v11, 0x3a

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0x60

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v1, v2, v5}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v3

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Li93/j;

    invoke-direct {v3, v8, v13, v7}, Li93/h;-><init>(III)V

    new-instance v5, Lsl0/j2;

    invoke-direct {v5, v6, v3}, Lsl0/j2;-><init>(ILi93/j;)V

    invoke-virtual {v5, v1, v2}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v3, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v20

    :try_start_9
    invoke-static {v3, v7, v1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_d

    new-instance v5, Lug/f;

    add-int/lit8 v9, v3, 0x1

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v5, v9, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    goto :goto_c

    :cond_d
    new-instance v5, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v11, 0x3a

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0x60

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v1, v2, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v5
    :try_end_9
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_9 .. :try_end_9} :catch_7

    :catch_7
    new-instance v5, Lug/f;

    const/4 v2, 0x0

    invoke-direct {v5, v3, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_c
    new-instance v2, Li93/j;

    const/16 v9, 0x3b

    invoke-direct {v2, v8, v9, v7}, Li93/h;-><init>(III)V

    new-instance v3, Lsl0/j2;

    invoke-direct {v3, v6, v2}, Lsl0/j2;-><init>(ILi93/j;)V

    iget v2, v5, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v3, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v21

    :try_start_a
    invoke-static {v3, v7, v1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_e

    new-instance v5, Lug/f;

    add-int/lit8 v9, v3, 0x1

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v5, v9, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    goto :goto_d

    :cond_e
    new-instance v5, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v11, 0x3a

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0x60

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v1, v2, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v5
    :try_end_a
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_a .. :try_end_a} :catch_8

    :catch_8
    new-instance v5, Lug/f;

    const/4 v2, 0x0

    invoke-direct {v5, v3, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_d
    new-instance v2, Li93/j;

    const/16 v9, 0x3c

    invoke-direct {v2, v8, v9, v7}, Li93/h;-><init>(III)V

    new-instance v3, Lsl0/j2;

    invoke-direct {v3, v6, v2}, Lsl0/j2;-><init>(ILi93/j;)V

    iget v2, v5, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v3, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v22

    new-instance v2, Lb30/z;

    const-string v5, ".,"

    const/16 v10, 0xe

    invoke-direct {v2, v5, v10, v8}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v5, Lsl0/b2;

    invoke-direct {v5, v4}, Lsl0/b2;-><init>(I)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :try_start_b
    invoke-interface {v2, v1, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v2, v2, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;
    :try_end_b
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_b .. :try_end_b} :catch_9

    goto :goto_e

    :catch_9
    new-instance v2, Lug/f;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_e
    iget v3, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-nez v2, :cond_f

    move-object v2, v4

    :cond_f
    new-instance v4, Lug/f;

    invoke-direct {v4, v3, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    iget-object v2, v4, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v23

    new-instance v2, Lsl0/b2;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lsl0/b2;-><init>(I)V

    iget v3, v4, Lug/f;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lsl0/b2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lug/f;

    iget v2, v1, Lug/f;->a:I

    iget-object v1, v1, Lug/f;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v24

    new-instance v1, Lug/f;

    new-instance v19, Lug/i;

    invoke-direct/range {v19 .. v24}, Lug/i;-><init>(IIIII)V

    move-object/from16 v3, v19

    invoke-direct {v1, v2, v3}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v1

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lsl0/b2;

    const/16 v5, 0xc

    invoke-direct {v4, v5}, Lsl0/b2;-><init>(I)V

    new-instance v5, Lcom/whoop/profile/presentation/edit/b;

    const/4 v8, 0x4

    invoke-direct {v5, v4, v8, v8}, Lcom/whoop/profile/presentation/edit/b;-><init>(Lc93/m;II)V

    invoke-virtual {v5, v1, v2}, Lcom/whoop/profile/presentation/edit/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v4, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    :try_start_c
    invoke-static {v4, v7, v1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v3, :cond_10

    new-instance v8, Lug/f;

    add-int/lit8 v9, v4, 0x1

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-direct {v8, v9, v5}, Lug/f;-><init>(ILjava/lang/Object;)V

    goto :goto_f

    :cond_10
    new-instance v8, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0x60

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v8, v1, v5, v4}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v8
    :try_end_c
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_c .. :try_end_c} :catch_a

    :catch_a
    new-instance v8, Lug/f;

    const/4 v5, 0x0

    invoke-direct {v8, v4, v5}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_f
    new-instance v4, Li93/j;

    const/16 v9, 0xc

    invoke-direct {v4, v7, v9, v7}, Li93/h;-><init>(III)V

    new-instance v5, Lsl0/j2;

    invoke-direct {v5, v6, v4}, Lsl0/j2;-><init>(ILi93/j;)V

    iget v4, v8, Lug/f;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lug/f;

    iget v5, v4, Lug/f;->a:I

    iget-object v4, v4, Lug/f;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    :try_start_d
    invoke-static {v5, v7, v1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v3, :cond_11

    new-instance v3, Lug/f;

    add-int/lit8 v9, v5, 0x1

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    invoke-direct {v3, v9, v8}, Lug/f;-><init>(ILjava/lang/Object;)V

    goto :goto_10

    :cond_11
    new-instance v9, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x60

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v9, v1, v3, v5}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v9
    :try_end_d
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_d .. :try_end_d} :catch_b

    :catch_b
    new-instance v3, Lug/f;

    const/4 v8, 0x0

    invoke-direct {v3, v5, v8}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_10
    new-instance v5, Li93/j;

    const/16 v8, 0x1f

    invoke-direct {v5, v7, v8, v7}, Li93/h;-><init>(III)V

    new-instance v7, Lsl0/j2;

    invoke-direct {v7, v6, v5}, Lsl0/j2;-><init>(ILi93/j;)V

    iget v3, v3, Lug/f;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v7, v1, v3}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lug/f;

    iget v3, v1, Lug/f;->a:I

    iget-object v1, v1, Lug/f;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    new-instance v5, Lug/f;

    new-instance v6, Lug/g;

    invoke-direct {v6, v2, v4, v1}, Lug/g;-><init>(III)V

    invoke-direct {v5, v3, v6}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v5

    :pswitch_e
    const/4 v8, 0x4

    const/16 v9, 0xc

    const/16 v10, 0xa

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v3, v16

    invoke-static {v2, v3, v1}, Lug/m;->J(IILjava/lang/String;)V

    add-int/lit8 v4, v2, 0x3

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v11, "substring(...)"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_12

    :sswitch_0
    const-string v3, "Sep"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/16 v2, 0x9

    goto/16 :goto_11

    :sswitch_1
    const-string v3, "Oct"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    move v2, v10

    goto/16 :goto_11

    :sswitch_2
    const-string v3, "Nov"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/16 v2, 0xb

    goto/16 :goto_11

    :sswitch_3
    const-string v3, "May"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v2, 0x5

    goto :goto_11

    :sswitch_4
    const-string v6, "Mar"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    move v2, v3

    goto :goto_11

    :sswitch_5
    const-string v3, "Jun"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v2, 0x6

    goto :goto_11

    :sswitch_6
    const-string v3, "Jul"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v2, 0x7

    goto :goto_11

    :sswitch_7
    const-string v3, "Jan"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    move v2, v7

    goto :goto_11

    :sswitch_8
    const-string v3, "Feb"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    move v2, v6

    goto :goto_11

    :sswitch_9
    const-string v3, "Dec"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    move v2, v9

    goto :goto_11

    :sswitch_a
    const-string v3, "Aug"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/16 v2, 0x8

    goto :goto_11

    :sswitch_b
    const-string v3, "Apr"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    move v2, v8

    :goto_11
    new-instance v1, Lug/f;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v4, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v1

    :cond_12
    :goto_12
    new-instance v3, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v4, "invalid month `"

    const/16 v6, 0x60

    invoke-static {v6, v4, v5}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v4, v2}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v3

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v8, v1}, Lug/m;->J(IILjava/lang/String;)V

    sget-object v4, Lug/k;->w:Lug/k;

    new-instance v5, Lcom/whoop/profile/presentation/edit/b;

    const/16 v6, 0x9

    invoke-direct {v5, v4, v6, v7}, Lcom/whoop/profile/presentation/edit/b;-><init>(Lkotlin/jvm/functions/Function1;II)V

    invoke-virtual {v5, v1, v2}, Lcom/whoop/profile/presentation/edit/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v4, v2, Lug/f;->a:I

    iget-object v2, v2, Lug/f;->b:Ljava/lang/Object;

    check-cast v2, Li93/j;

    invoke-virtual {v2}, Li93/j;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_14

    invoke-static {v1, v2}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iget v3, v2, Li93/h;->x:I

    iget v2, v2, Li93/h;->w:I

    sub-int/2addr v3, v2

    :goto_13
    const/16 v2, 0x8

    if-ge v3, v2, :cond_13

    mul-int/lit8 v1, v1, 0xa

    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_13
    new-instance v2, Lug/f;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v2, v4, v1}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v2

    :cond_14
    new-instance v2, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v4, "expected integer"

    invoke-direct {v2, v1, v4, v3}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v2

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Li93/j;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "range"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    return-object v1

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Luf0/i;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lub2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, Ly1/b;

    move-object/from16 v1, p2

    check-cast v1, Lu0/n1;

    iget-object v2, v1, Lu0/n1;->a:Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget-object v1, v1, Lu0/n1;->f:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh0/d2;

    sget-object v3, Lh0/d2;->w:Lh0/d2;

    if-ne v1, v3, :cond_15

    goto :goto_14

    :cond_15
    move v7, v8

    :goto_14
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Ltr0/a;->b(Lxf3/c;Luf3/a;)Ltr0/b;

    move-result-object v1

    return-object v1

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Ltr0/a;->c(Lxf3/c;Luf3/a;)Ltr0/c;

    move-result-object v1

    return-object v1

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Ltr0/a;->a(Lxf3/c;Luf3/a;)Ltr0/d;

    move-result-object v1

    return-object v1

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Lxf3/c;

    move-object/from16 v2, p2

    check-cast v2, Luf3/a;

    invoke-static {v1, v2}, Ltr0/a;->d(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object v1

    return-object v1

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ltq2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/navigation/e;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lsx1/j;->r(Lcom/whoop/navigation/e;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lsx1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lso2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, Lxk0/a$a;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v1, v2}, Lsl0/d2;->m(Lxk0/a$a;Z)Ll83/a0;

    move-result-object v1

    return-object v1

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

    :sswitch_data_0
    .sparse-switch
        0x10203 -> :sswitch_b
        0x10293 -> :sswitch_a
        0x10be2 -> :sswitch_9
        0x11363 -> :sswitch_8
        0x121f7 -> :sswitch_7
        0x12461 -> :sswitch_6
        0x12463 -> :sswitch_5
        0x12d3e -> :sswitch_4
        0x12d45 -> :sswitch_3
        0x132b5 -> :sswitch_2
        0x13500 -> :sswitch_1
        0x1443e -> :sswitch_0
    .end sparse-switch
.end method
