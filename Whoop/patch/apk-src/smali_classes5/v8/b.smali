.class public abstract Lv8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/media/AudioManager;


# direct methods
.method public static final A(Landroidx/health/platform/client/proto/u;)Ln7/c;
    .locals 13

    new-instance v0, Ln7/c;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->c0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->U()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    const-string v2, "if (hasUid()) uid else Metadata.EMPTY_ID"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ln7/a;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->I()Landroidx/health/platform/client/proto/o;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/o;->q()Ljava/lang/String;

    move-result-object v3

    const-string v4, "dataOrigin.applicationId"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ln7/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->V()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v3

    const-string v4, "ofEpochMilli(updateTimeMillis)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->Y()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->G()Ljava/lang/String;

    move-result-object v4

    move-object v7, v5

    goto :goto_1

    :cond_1
    move-object v4, v5

    move-object v7, v4

    :goto_1
    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->H()J

    move-result-wide v5

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->Z()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->L()Landroidx/health/platform/client/proto/y;

    move-result-object v8

    const-string v9, "device"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ln7/b;

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/y;->w()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/y;->t()Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_2
    move-object v10, v7

    :goto_2
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/y;->x()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/y;->u()Ljava/lang/String;

    move-result-object v7

    :cond_3
    sget-object v11, Lg7/a;->a:Ljava/lang/Object;

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/y;->v()Ljava/lang/String;

    move-result-object v8

    const-string v12, "type"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v8, v12}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-direct {v9, v10, v7, v8}, Ln7/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object v7, v9

    :cond_4
    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->P()I

    move-result v8

    invoke-direct/range {v0 .. v8}, Ln7/c;-><init>(Ljava/lang/String;Ln7/a;Ljava/time/Instant;Ljava/lang/String;JLn7/b;I)V

    return-object v0
.end method

.method public static final B(Landroid/widget/ImageView;)Lfi/t;
    .locals 4

    const v0, 0x7f0a02d8

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lfi/t;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lfi/t;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lfi/t;

    if-eqz v2, :cond_1

    move-object v3, v1

    check-cast v3, Lfi/t;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    new-instance v3, Lfi/t;

    invoke-direct {v3, p0}, Lfi/t;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {p0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit p0

    return-object v3

    :goto_3
    monitor-exit p0

    throw v0

    :cond_3
    return-object v1
.end method

.method public static final C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;
    .locals 2

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->R()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p0

    const-string v0, "ofEpochMilli(startTimeMillis)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;
    .locals 1

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->S()I

    move-result p0

    invoke-static {p0}, Ljava/time/ZoneOffset;->ofTotalSeconds(I)Ljava/time/ZoneOffset;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final E(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/g0;->z()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;
    .locals 2

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->O()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p0

    const-string v0, "ofEpochMilli(instantTimeMillis)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;
    .locals 1

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->X()I

    move-result p0

    invoke-static {p0}, Ljava/time/ZoneOffset;->ofTotalSeconds(I)Ljava/time/ZoneOffset;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static H(Lrb3/e;Lha3/e;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0, p1}, Lrb3/e;->a(Lha3/e;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p0}, Lrb3/e;->getDescription()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final I(II)Z
    .locals 7

    const/4 v0, 0x1

    const-string v1, "getInstance(...)"

    const/16 v2, 0x64

    if-ge p1, v2, :cond_2

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    div-int/lit8 v4, v3, 0x64

    rem-int/2addr v3, v2

    const/16 v5, 0x14

    const/16 v6, 0x50

    if-le v3, v6, :cond_0

    if-ge p1, v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    if-ge v3, v5, :cond_1

    if-le p1, v6, :cond_1

    add-int/lit8 v4, v4, -0x1

    :cond_1
    :goto_0
    mul-int/2addr v4, v2

    add-int/2addr p1, v4

    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-gt v0, p0, :cond_5

    const/16 v1, 0xd

    if-ge p0, v1, :cond_5

    if-ltz p1, :cond_5

    const/16 v1, 0x26fd

    if-ge p1, v1, :cond_5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ge p1, v1, :cond_3

    goto :goto_2

    :cond_3
    if-le p1, v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x2

    invoke-virtual {v2, p1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    add-int/2addr p1, v0

    if-lt p0, p1, :cond_5

    :goto_1
    return v0

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I
    .locals 1

    const-string v0, "stringToIntMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/g0;->x()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 p1, 0x0

    if-nez p0, :cond_1

    return p1

    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p0, p1}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final K(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const v0, 0x7f14101f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f141020

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "incorrect_cvc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    move-object v0, v1

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "invalid_bank_account_iban"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const p1, 0x7f14101d

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "insufficient_funds"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const p1, 0x7f14101b

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "expired_card"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const p1, 0x7f140ffe

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "invalid_expiry_year"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const p1, 0x7f141023

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "card_declined"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    const p1, 0x7f140fd7

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_6
    const-string v1, "invalid_number"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :sswitch_7
    const-string v0, "processing_error"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const p1, 0x7f1410d9

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :sswitch_8
    const-string v0, "invalid_owner_name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const p1, 0x7f141024

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :sswitch_9
    const-string v1, "incorrect_number"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :sswitch_a
    const-string v0, "invalid_cvc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_b
    const-string v0, "invalid_expiry_month"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const p1, 0x7f141022

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :sswitch_c
    const-string v0, "generic_decline"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    const p1, 0x7f14100c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_a
    :goto_0
    move-object v0, v2

    :cond_b
    :goto_1
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_c
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77e8b372 -> :sswitch_c
        -0x421dce44 -> :sswitch_b
        -0x38cb2ff8 -> :sswitch_a
        -0x331a92dd -> :sswitch_9
        -0x3106b421 -> :sswitch_8
        -0x147d7624 -> :sswitch_7
        -0x1265ed6f -> :sswitch_6
        0x8c6247d -> :sswitch_5
        0x272da181 -> :sswitch_4
        0x55a63bea -> :sswitch_3
        0x65a62b12 -> :sswitch_2
        0x678c0ab3 -> :sswitch_1
        0x796fceb6 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final L(Lne3/e0;Lne3/p;Lkotlin/jvm/functions/Function1;)Lne3/s0;
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "not a zip: size="

    const-string v3, "fileSystem"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lne3/p;->b0(Lne3/e0;)Lne3/z;

    move-result-object v3

    :try_start_0
    invoke-virtual {v3}, Lne3/z;->size()J

    move-result-wide v4

    const/16 v6, 0x16

    int-to-long v6, v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_e

    const-wide/32 v8, 0x10000

    sub-long v8, v4, v8

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    :goto_0
    invoke-virtual {v3, v4, v5}, Lne3/z;->i(J)Lne3/o;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    :try_start_1
    invoke-virtual {v10}, Lne3/j0;->Q0()I

    move-result v0

    const v11, 0x6054b50

    if-ne v0, v11, :cond_c

    invoke-virtual {v10}, Lne3/j0;->h()S

    move-result v0

    const v8, 0xffff

    and-int/2addr v0, v8

    invoke-virtual {v10}, Lne3/j0;->h()S

    move-result v9

    and-int/2addr v9, v8

    invoke-virtual {v10}, Lne3/j0;->h()S

    move-result v11

    and-int/2addr v11, v8

    int-to-long v13, v11

    invoke-virtual {v10}, Lne3/j0;->h()S

    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    and-int/2addr v11, v8

    int-to-long v11, v11

    cmp-long v11, v13, v11

    const-string v12, "unsupported zip: spanned"

    if-nez v11, :cond_b

    if-nez v0, :cond_b

    if-nez v9, :cond_b

    move-wide/from16 v18, v6

    const-wide/16 v6, 0x4

    :try_start_2
    invoke-virtual {v10, v6, v7}, Lne3/j0;->skip(J)V

    invoke-virtual {v10}, Lne3/j0;->Q0()I

    move-result v0

    int-to-long v6, v0

    const-wide v15, 0xffffffffL

    and-long/2addr v15, v6

    invoke-virtual {v10}, Lne3/j0;->h()S

    move-result v0

    and-int v17, v0, v8

    move-object v0, v12

    new-instance v12, Lna/a;

    invoke-direct/range {v12 .. v17}, Lna/a;-><init>(JJI)V

    move/from16 v6, v17

    int-to-long v7, v6

    invoke-virtual {v10, v7, v8}, Lne3/j0;->k0(J)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    :try_start_3
    invoke-virtual {v10}, Lne3/j0;->close()V

    const/16 v7, 0x14

    int-to-long v7, v7

    sub-long/2addr v4, v7

    cmp-long v7, v4, v18

    const/4 v8, 0x0

    if-lez v7, :cond_6

    invoke-virtual {v3, v4, v5}, Lne3/z;->i(J)Lne3/o;

    move-result-object v4

    invoke-static {v4}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    :try_start_4
    invoke-virtual {v4}, Lne3/j0;->Q0()I

    move-result v5

    const v7, 0x7064b50

    if-ne v5, v7, :cond_4

    invoke-virtual {v4}, Lne3/j0;->Q0()I

    move-result v5

    invoke-virtual {v4}, Lne3/j0;->e0()J

    move-result-wide v9

    invoke-virtual {v4}, Lne3/j0;->Q0()I

    move-result v7

    const/4 v11, 0x1

    if-ne v7, v11, :cond_3

    if-nez v5, :cond_3

    invoke-virtual {v3, v9, v10}, Lne3/z;->i(J)Lne3/o;

    move-result-object v5

    invoke-static {v5}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v7

    const v9, 0x6064b50

    if-ne v7, v9, :cond_1

    const-wide/16 v9, 0xc

    invoke-virtual {v5, v9, v10}, Lne3/j0;->skip(J)V

    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v7

    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v9

    invoke-virtual {v5}, Lne3/j0;->e0()J

    move-result-wide v21

    invoke-virtual {v5}, Lne3/j0;->e0()J

    move-result-wide v10

    cmp-long v10, v21, v10

    if-nez v10, :cond_0

    if-nez v7, :cond_0

    if-nez v9, :cond_0

    const-wide/16 v9, 0x8

    invoke-virtual {v5, v9, v10}, Lne3/j0;->skip(J)V

    invoke-virtual {v5}, Lne3/j0;->e0()J

    move-result-wide v23

    new-instance v20, Lna/a;

    move/from16 v25, v6

    invoke-direct/range {v20 .. v25}, Lna/a;-><init>(JJI)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v5}, Lne3/j0;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object v0, v8

    goto :goto_1

    :catchall_0
    move-exception v0

    :goto_1
    move-object/from16 v12, v20

    goto :goto_5

    :cond_0
    :try_start_7
    new-instance v6, Ljava/io/IOException;

    invoke-direct {v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "bad zip: expected "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " but was "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :goto_3
    :try_start_8
    invoke-virtual {v5}, Lne3/j0;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    :try_start_9
    invoke-static {v6, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    move-object v0, v6

    :goto_5
    if-nez v0, :cond_2

    goto :goto_6

    :cond_2
    throw v0

    :catchall_3
    move-exception v0

    move-object v5, v0

    goto :goto_7

    :cond_3
    new-instance v5, Ljava/io/IOException;

    invoke-direct {v5, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :cond_4
    :goto_6
    :try_start_a
    invoke-virtual {v4}, Lne3/j0;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    move-object v0, v8

    goto :goto_9

    :catchall_4
    move-exception v0

    goto :goto_9

    :goto_7
    :try_start_b
    invoke-virtual {v4}, Lne3/j0;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_8

    :catchall_5
    move-exception v0

    :try_start_c
    invoke-static {v5, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_8
    move-object v0, v5

    :goto_9
    if-nez v0, :cond_5

    goto :goto_a

    :cond_5
    throw v0

    :catchall_6
    move-exception v0

    move-object v1, v0

    goto/16 :goto_11

    :cond_6
    :goto_a
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-wide v5, v12, Lna/a;->b:J

    invoke-virtual {v3, v5, v6}, Lne3/z;->i(J)Lne3/o;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :try_start_d
    iget-wide v6, v12, Lna/a;->a:J

    :goto_b
    cmp-long v0, v18, v6

    if-gez v0, :cond_9

    invoke-static {v5}, Lv8/b;->O(Lne3/j0;)Loe3/i;

    move-result-object v0

    iget-wide v9, v0, Loe3/i;->h:J

    iget-wide v13, v12, Lna/a;->b:J

    cmp-long v9, v9, v13

    if-gez v9, :cond_8

    move-object/from16 v11, p2

    invoke-interface {v11, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :catchall_7
    move-exception v0

    move-object v6, v0

    goto :goto_d

    :cond_7
    :goto_c
    const-wide/16 v9, 0x1

    add-long v18, v18, v9

    goto :goto_b

    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v6, "bad zip: local file header offset >= central directory offset"

    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :cond_9
    :try_start_e
    invoke-virtual {v5}, Lne3/j0;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    goto :goto_f

    :catchall_8
    move-exception v0

    move-object v8, v0

    goto :goto_f

    :goto_d
    :try_start_f
    invoke-virtual {v5}, Lne3/j0;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    goto :goto_e

    :catchall_9
    move-exception v0

    :try_start_10
    invoke-static {v6, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_e
    move-object v8, v6

    :goto_f
    if-nez v8, :cond_a

    invoke-static {v4}, Lv8/b;->j(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v4, Lne3/s0;

    invoke-direct {v4, v1, v2, v0}, Lne3/s0;-><init>(Lne3/e0;Lne3/p;Ljava/util/LinkedHashMap;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    :try_start_11
    invoke-virtual {v3}, Lne3/z;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    :catchall_a
    return-object v4

    :cond_a
    :try_start_12
    throw v8
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :catchall_b
    move-exception v0

    goto :goto_10

    :cond_b
    move-object v0, v12

    :try_start_13
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    :cond_c
    move-object/from16 v11, p2

    move-wide/from16 v18, v6

    :try_start_14
    invoke-virtual {v10}, Lne3/j0;->close()V

    const-wide/16 v6, -0x1

    add-long/2addr v4, v6

    cmp-long v0, v4, v8

    if-ltz v0, :cond_d

    move-wide/from16 v6, v18

    goto/16 :goto_0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "not a zip: end of central directory signature not found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_10
    invoke-virtual {v10}, Lne3/j0;->close()V

    throw v0

    :cond_e
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lne3/z;->size()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    :goto_11
    if-eqz v3, :cond_f

    :try_start_15
    invoke-virtual {v3}, Lne3/z;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    goto :goto_12

    :catchall_c
    move-exception v0

    invoke-static {v1, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_f
    :goto_12
    throw v1
.end method

.method public static final M(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putSize(Ljava/lang/String;Landroid/util/Size;)V

    return-void
.end method

.method public static final N(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putSizeF(Ljava/lang/String;Landroid/util/SizeF;)V

    return-void
.end method

.method public static final O(Lne3/j0;)Loe3/i;
    .locals 24

    move-object/from16 v5, p0

    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v0

    const v1, 0x2014b50

    if-ne v0, v1, :cond_7

    const-wide/16 v0, 0x4

    invoke-virtual {v5, v0, v1}, Lne3/j0;->skip(J)V

    invoke-virtual {v5}, Lne3/j0;->h()S

    move-result v0

    const v1, 0xffff

    and-int v2, v0, v1

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_6

    invoke-virtual {v5}, Lne3/j0;->h()S

    move-result v0

    and-int v12, v0, v1

    invoke-virtual {v5}, Lne3/j0;->h()S

    move-result v0

    and-int v16, v0, v1

    invoke-virtual {v5}, Lne3/j0;->h()S

    move-result v0

    and-int v15, v0, v1

    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v0

    int-to-long v2, v0

    const-wide v6, 0xffffffffL

    and-long v13, v2, v6

    move-wide v2, v6

    new-instance v6, Lkotlin/jvm/internal/f0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v0

    int-to-long v7, v0

    and-long/2addr v7, v2

    iput-wide v7, v6, Lkotlin/jvm/internal/f0;->w:J

    new-instance v4, Lkotlin/jvm/internal/f0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v0

    int-to-long v7, v0

    and-long/2addr v7, v2

    iput-wide v7, v4, Lkotlin/jvm/internal/f0;->w:J

    invoke-virtual {v5}, Lne3/j0;->h()S

    move-result v0

    and-int/2addr v0, v1

    invoke-virtual {v5}, Lne3/j0;->h()S

    move-result v7

    and-int v11, v7, v1

    invoke-virtual {v5}, Lne3/j0;->h()S

    move-result v7

    and-int/2addr v1, v7

    const-wide/16 v7, 0x8

    invoke-virtual {v5, v7, v8}, Lne3/j0;->skip(J)V

    new-instance v7, Lkotlin/jvm/internal/f0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5}, Lne3/j0;->Q0()I

    move-result v8

    int-to-long v8, v8

    and-long/2addr v8, v2

    iput-wide v8, v7, Lkotlin/jvm/internal/f0;->w:J

    int-to-long v8, v0

    invoke-virtual {v5, v8, v9}, Lne3/j0;->k0(J)Ljava/lang/String;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v0, v8, v8}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v9

    if-nez v9, :cond_5

    iget-wide v9, v4, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v9, v9, v2

    const-wide/16 v17, 0x0

    const/16 v10, 0x8

    move-wide/from16 v19, v2

    if-nez v9, :cond_0

    int-to-long v2, v10

    goto :goto_0

    :cond_0
    move-wide/from16 v2, v17

    :goto_0
    iget-wide v8, v6, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v8, v8, v19

    if-nez v8, :cond_1

    int-to-long v8, v10

    add-long/2addr v2, v8

    :cond_1
    iget-wide v8, v7, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v8, v8, v19

    if-nez v8, :cond_2

    int-to-long v8, v10

    add-long/2addr v2, v8

    :cond_2
    new-instance v8, Lkotlin/jvm/internal/g0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v9, Lkotlin/jvm/internal/g0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v10, Lkotlin/jvm/internal/g0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    move/from16 v19, v1

    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v20, v0

    new-instance v0, Ll1/h0;

    move/from16 v21, v12

    move/from16 v12, v19

    move-wide/from16 v22, v13

    move-object/from16 v13, v20

    move-wide/from16 v19, v22

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v10}, Ll1/h0;-><init>(Lkotlin/jvm/internal/b0;JLkotlin/jvm/internal/f0;Lne3/j0;Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;)V

    invoke-static {v5, v11, v0}, Lv8/b;->P(Lne3/j0;ILc93/m;)V

    cmp-long v0, v2, v17

    if-lez v0, :cond_4

    iget-boolean v0, v1, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: zip64 extra required but absent"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    int-to-long v0, v12

    invoke-virtual {v5, v0, v1}, Lne3/j0;->k0(J)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    const-string v0, "/"

    invoke-static {v0, v14}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v1

    invoke-virtual {v1, v13}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v3

    invoke-static {v13, v0, v14}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    new-instance v2, Loe3/i;

    iget-wide v11, v6, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v13, v4, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v6, v7, Lkotlin/jvm/internal/f0;->w:J

    iget-object v1, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v17, v1

    check-cast v17, Ljava/lang/Long;

    iget-object v1, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v18, v1

    check-cast v18, Ljava/lang/Long;

    iget-object v1, v10, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    move-wide v8, v11

    move-wide v10, v13

    move-wide v13, v6

    move-wide/from16 v6, v19

    const v20, 0xe000

    move v4, v0

    move-object/from16 v19, v1

    move/from16 v12, v21

    invoke-direct/range {v2 .. v20}, Loe3/i;-><init>(Lne3/e0;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    return-object v2

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: filename contains 0x00"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "unsupported zip: general purpose bit flag="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bad zip: expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static final P(Lne3/j0;ILc93/m;)V
    .locals 11

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    int-to-long v1, p1

    :goto_0
    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_4

    const-wide/16 v5, 0x4

    cmp-long p1, v1, v5

    if-ltz p1, :cond_3

    invoke-virtual {p0}, Lne3/j0;->h()S

    move-result p1

    const v5, 0xffff

    and-int/2addr p1, v5

    invoke-virtual {p0}, Lne3/j0;->h()S

    move-result v5

    int-to-long v5, v5

    const-wide/32 v7, 0xffff

    and-long/2addr v5, v7

    const/4 v7, 0x4

    int-to-long v7, v7

    sub-long/2addr v1, v7

    cmp-long v7, v1, v5

    if-ltz v7, :cond_2

    invoke-virtual {p0, v5, v6}, Lne3/j0;->g0(J)V

    iget-wide v7, v0, Lne3/h;->x:J

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-interface {p2, v9, v10}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v9, v0, Lne3/h;->x:J

    add-long/2addr v9, v5

    sub-long/2addr v9, v7

    cmp-long v3, v9, v3

    if-ltz v3, :cond_1

    if-lez v3, :cond_0

    invoke-virtual {v0, v9, v10}, Lne3/h;->skip(J)V

    :cond_0
    sub-long/2addr v1, v5

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p2, "unsupported zip: too many bytes processed for "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated value in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated header in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-void
.end method

.method public static final Q(Lne3/j0;Loe3/i;)Loe3/i;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0}, Lne3/j0;->Q0()I

    move-result v2

    const v3, 0x4034b50

    if-ne v2, v3, :cond_2

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3}, Lne3/j0;->skip(J)V

    invoke-virtual {v0}, Lne3/j0;->h()S

    move-result v2

    const v3, 0xffff

    and-int v4, v2, v3

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_1

    const-wide/16 v4, 0x12

    invoke-virtual {v0, v4, v5}, Lne3/j0;->skip(J)V

    invoke-virtual {v0}, Lne3/j0;->h()S

    move-result v2

    int-to-long v4, v2

    const-wide/32 v6, 0xffff

    and-long/2addr v4, v6

    invoke-virtual {v0}, Lne3/j0;->h()S

    move-result v2

    and-int/2addr v2, v3

    invoke-virtual {v0, v4, v5}, Lne3/j0;->skip(J)V

    if-nez v1, :cond_0

    int-to-long v1, v2

    invoke-virtual {v0, v1, v2}, Lne3/j0;->skip(J)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/g0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Loe3/j;

    invoke-direct {v6, v0, v3, v4, v5}, Loe3/j;-><init>(Lne3/j0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;)V

    invoke-static {v0, v2, v6}, Lv8/b;->P(Lne3/j0;ILc93/m;)V

    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/Integer;

    iget-object v0, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v25, v0

    check-cast v25, Ljava/lang/Integer;

    iget-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/Integer;

    new-instance v6, Loe3/i;

    iget-object v7, v1, Loe3/i;->a:Lne3/e0;

    iget-boolean v8, v1, Loe3/i;->b:Z

    iget-object v9, v1, Loe3/i;->c:Ljava/lang/String;

    iget-wide v10, v1, Loe3/i;->d:J

    iget-wide v12, v1, Loe3/i;->e:J

    iget-wide v14, v1, Loe3/i;->f:J

    iget v0, v1, Loe3/i;->g:I

    iget-wide v2, v1, Loe3/i;->h:J

    iget v4, v1, Loe3/i;->i:I

    iget v5, v1, Loe3/i;->j:I

    move/from16 v16, v0

    iget-object v0, v1, Loe3/i;->k:Ljava/lang/Long;

    move-object/from16 v21, v0

    iget-object v0, v1, Loe3/i;->l:Ljava/lang/Long;

    iget-object v1, v1, Loe3/i;->m:Ljava/lang/Long;

    move-object/from16 v22, v0

    move-object/from16 v23, v1

    move-wide/from16 v17, v2

    move/from16 v19, v4

    move/from16 v20, v5

    invoke-direct/range {v6 .. v26}, Loe3/i;-><init>(Lne3/e0;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v6

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unsupported zip: general purpose bit flag="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "bad zip: expected "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " but was "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv8/b;->y(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final R(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<terms>"

    const-string v1, "<a href=\"https://link.com/terms\">"

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string v0, "</terms>"

    const-string v1, "</a>"

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string v0, "<privacy>"

    const-string v3, "<a href=\"https://link.com/privacy\">"

    invoke-static {p0, v0, v3, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string v0, "</privacy>"

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string v0, "<link>"

    const-string v3, "<a href=\"https://link.com\">"

    invoke-static {p0, v0, v3, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string v0, "</link>"

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-interface {p0, p1}, Lzy/c;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final T(Landroid/widget/RemoteViews;II)V
    .locals 1

    const-string v0, "setColorFilter"

    invoke-virtual {p0, p1, v0, p2}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    return-void
.end method

.method public static final U(Landroid/widget/RemoteViews;II)V
    .locals 1

    const-string v0, "setBackgroundResource"

    invoke-virtual {p0, p1, v0, p2}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    return-void
.end method

.method public static V(Lm4/f;Ln4/c;)Z
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lm4/f;->r0:Ljava/util/ArrayList;

    iget-object v2, v0, Lm4/f;->x0:Lf4/c;

    iget-object v3, v0, Lm4/e;->q0:[I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x1

    if-ge v6, v4, :cond_2

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/e;

    aget v9, v3, v5

    aget v10, v3, v7

    iget-object v11, v8, Lm4/e;->q0:[I

    aget v12, v11, v5

    aget v7, v11, v7

    invoke-static {v9, v10, v12, v7}, Lv8/b;->Z(IIII)Z

    move-result v7

    if-nez v7, :cond_0

    :goto_1
    move/from16 v16, v5

    goto/16 :goto_1c

    :cond_0
    instance-of v7, v8, Lm4/h;

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    move v8, v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2
    if-ge v8, v4, :cond_14

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lm4/e;

    move/from16 v16, v5

    aget v5, v3, v16

    aget v6, v3, v7

    move/from16 v17, v7

    iget-object v7, v15, Lm4/e;->q0:[I

    move-object/from16 v18, v3

    aget v3, v7, v16

    aget v7, v7, v17

    invoke-static {v5, v6, v3, v7}, Lv8/b;->Z(IIII)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, v0, Lm4/f;->M0:Ln4/b;

    move-object/from16 v5, p1

    invoke-static {v15, v5, v3}, Lm4/f;->b0(Lm4/e;Ln4/c;Ln4/b;)V

    goto :goto_3

    :cond_3
    move-object/from16 v5, p1

    :goto_3
    instance-of v3, v15, Lm4/i;

    if-eqz v3, :cond_7

    move-object v6, v15

    check-cast v6, Lm4/i;

    iget v7, v6, Lm4/i;->v0:I

    if-nez v7, :cond_5

    if-nez v11, :cond_4

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget v7, v6, Lm4/i;->v0:I

    move/from16 v19, v3

    move/from16 v3, v17

    if-ne v7, v3, :cond_8

    if-nez v9, :cond_6

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    move/from16 v19, v3

    :cond_8
    :goto_4
    instance-of v3, v15, Lm4/j;

    if-eqz v3, :cond_f

    instance-of v3, v15, Lm4/b;

    if-eqz v3, :cond_c

    move-object v3, v15

    check-cast v3, Lm4/b;

    invoke-virtual {v3}, Lm4/b;->Z()I

    move-result v6

    if-nez v6, :cond_a

    if-nez v10, :cond_9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_9
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v3}, Lm4/b;->Z()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_f

    if-nez v12, :cond_b

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_c
    move-object v3, v15

    check-cast v3, Lm4/j;

    if-nez v10, :cond_d

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_d
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v12, :cond_e

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_e
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_5
    iget-object v3, v15, Lm4/e;->J:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-nez v3, :cond_11

    iget-object v3, v15, Lm4/e;->L:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-nez v3, :cond_11

    if-nez v19, :cond_11

    instance-of v3, v15, Lm4/b;

    if-nez v3, :cond_11

    if-nez v13, :cond_10

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :cond_10
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    iget-object v3, v15, Lm4/e;->K:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-nez v3, :cond_13

    iget-object v3, v15, Lm4/e;->M:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-nez v3, :cond_13

    iget-object v3, v15, Lm4/e;->N:Lm4/d;

    iget-object v3, v3, Lm4/d;->f:Lm4/d;

    if-nez v3, :cond_13

    if-nez v19, :cond_13

    instance-of v3, v15, Lm4/b;

    if-nez v3, :cond_13

    if-nez v14, :cond_12

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    :cond_12
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/lit8 v8, v8, 0x1

    move/from16 v5, v16

    move-object/from16 v3, v18

    const/4 v7, 0x1

    goto/16 :goto_2

    :cond_14
    move-object/from16 v18, v3

    move/from16 v16, v5

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v9, :cond_15

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm4/i;

    move/from16 v8, v16

    const/4 v7, 0x0

    invoke-static {v6, v8, v3, v7}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_6

    :cond_15
    move/from16 v8, v16

    const/4 v7, 0x0

    if-eqz v10, :cond_16

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm4/j;

    invoke-static {v6, v8, v3, v7}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    move-result-object v9

    invoke-virtual {v6, v8, v3, v9}, Lm4/j;->W(ILjava/util/ArrayList;Ln4/o;)V

    invoke-virtual {v9, v3}, Ln4/o;->b(Ljava/util/ArrayList;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    goto :goto_7

    :cond_16
    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Lm4/e;->j(I)Lm4/d;

    move-result-object v6

    iget-object v6, v6, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v6, :cond_17

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/d;

    iget-object v7, v7, Lm4/d;->d:Lm4/e;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v7, v9, v3, v8}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_8

    :cond_17
    const/4 v6, 0x4

    invoke-virtual {v0, v6}, Lm4/e;->j(I)Lm4/d;

    move-result-object v6

    iget-object v6, v6, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/d;

    iget-object v7, v7, Lm4/d;->d:Lm4/e;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v7, v9, v3, v8}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_9

    :cond_18
    const/4 v6, 0x7

    invoke-virtual {v0, v6}, Lm4/e;->j(I)Lm4/d;

    move-result-object v7

    iget-object v7, v7, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v7, :cond_19

    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_19

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/d;

    iget-object v8, v8, Lm4/d;->d:Lm4/e;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v8, v10, v3, v9}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_a

    :cond_19
    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v13, :cond_1a

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/e;

    invoke-static {v8, v10, v3, v9}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_b

    :cond_1a
    if-eqz v11, :cond_1b

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/i;

    const/4 v10, 0x1

    invoke-static {v8, v10, v3, v9}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_c

    :cond_1b
    const/4 v10, 0x1

    if-eqz v12, :cond_1c

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/j;

    invoke-static {v8, v10, v3, v9}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    move-result-object v11

    invoke-virtual {v8, v10, v3, v11}, Lm4/j;->W(ILjava/util/ArrayList;Ln4/o;)V

    invoke-virtual {v11, v3}, Ln4/o;->b(Ljava/util/ArrayList;)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    goto :goto_d

    :cond_1c
    const/4 v7, 0x3

    invoke-virtual {v0, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object v8

    iget-object v8, v8, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v8, :cond_1d

    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm4/d;

    iget-object v9, v9, Lm4/d;->d:Lm4/e;

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v9, v10, v3, v11}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_e

    :cond_1d
    const/4 v8, 0x6

    invoke-virtual {v0, v8}, Lm4/e;->j(I)Lm4/d;

    move-result-object v8

    iget-object v8, v8, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v8, :cond_1e

    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm4/d;

    iget-object v9, v9, Lm4/d;->d:Lm4/e;

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v9, v10, v3, v11}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_f

    :cond_1e
    const/4 v8, 0x5

    invoke-virtual {v0, v8}, Lm4/e;->j(I)Lm4/d;

    move-result-object v8

    iget-object v8, v8, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v8, :cond_1f

    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm4/d;

    iget-object v9, v9, Lm4/d;->d:Lm4/e;

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v9, v10, v3, v11}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_10

    :cond_1f
    invoke-virtual {v0, v6}, Lm4/e;->j(I)Lm4/d;

    move-result-object v6

    iget-object v6, v6, Lm4/d;->a:Ljava/util/HashSet;

    if-eqz v6, :cond_20

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_20

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/d;

    iget-object v8, v8, Lm4/d;->d:Lm4/e;

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v10, v3, v11}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_11

    :cond_20
    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v14, :cond_21

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/e;

    invoke-static {v8, v10, v3, v11}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    goto :goto_12

    :cond_21
    const/4 v6, 0x0

    :goto_13
    if-ge v6, v4, :cond_27

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/e;

    iget-object v9, v8, Lm4/e;->q0:[I

    const/16 v16, 0x0

    aget v12, v9, v16

    if-ne v12, v7, :cond_26

    aget v9, v9, v10

    if-ne v9, v7, :cond_26

    iget v9, v8, Lm4/e;->o0:I

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v12, 0x0

    :goto_14
    if-ge v12, v10, :cond_23

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ln4/o;

    iget v14, v13, Ln4/o;->b:I

    if-ne v9, v14, :cond_22

    goto :goto_15

    :cond_22
    add-int/lit8 v12, v12, 0x1

    goto :goto_14

    :cond_23
    move-object v13, v11

    :goto_15
    iget v8, v8, Lm4/e;->p0:I

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_16
    if-ge v10, v9, :cond_25

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ln4/o;

    iget v14, v12, Ln4/o;->b:I

    if-ne v8, v14, :cond_24

    goto :goto_17

    :cond_24
    add-int/lit8 v10, v10, 0x1

    goto :goto_16

    :cond_25
    move-object v12, v11

    :goto_17
    if-eqz v13, :cond_26

    if-eqz v12, :cond_26

    const/4 v9, 0x0

    invoke-virtual {v13, v9, v12}, Ln4/o;->d(ILn4/o;)V

    iput v5, v12, Ln4/o;->c:I

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_26
    add-int/lit8 v6, v6, 0x1

    const/4 v10, 0x1

    goto :goto_13

    :cond_27
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v10, 0x1

    if-gt v1, v10, :cond_29

    :cond_28
    const/16 v16, 0x0

    goto/16 :goto_1c

    :cond_29
    const/4 v9, 0x0

    aget v1, v18, v9

    if-ne v1, v5, :cond_2d

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v8, v9

    move-object v7, v11

    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln4/o;

    iget v6, v4, Ln4/o;->c:I

    if-ne v6, v10, :cond_2a

    goto :goto_18

    :cond_2a
    invoke-virtual {v4, v2, v9}, Ln4/o;->c(Lf4/c;I)I

    move-result v6

    if-le v6, v8, :cond_2b

    move-object v7, v4

    move v8, v6

    :cond_2b
    const/4 v9, 0x0

    goto :goto_18

    :cond_2c
    if-eqz v7, :cond_2d

    invoke-virtual {v0, v10}, Lm4/e;->O(I)V

    invoke-virtual {v0, v8}, Lm4/e;->S(I)V

    goto :goto_19

    :cond_2d
    move-object v7, v11

    :goto_19
    aget v1, v18, v10

    if-ne v1, v5, :cond_31

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v3, v11

    const/4 v8, 0x0

    :cond_2e
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_30

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln4/o;

    iget v5, v4, Ln4/o;->c:I

    if-nez v5, :cond_2f

    goto :goto_1a

    :cond_2f
    invoke-virtual {v4, v2, v10}, Ln4/o;->c(Lf4/c;I)I

    move-result v5

    if-le v5, v8, :cond_2e

    move-object v3, v4

    move v8, v5

    goto :goto_1a

    :cond_30
    if-eqz v3, :cond_31

    invoke-virtual {v0, v10}, Lm4/e;->Q(I)V

    invoke-virtual {v0, v8}, Lm4/e;->N(I)V

    move-object v6, v3

    goto :goto_1b

    :cond_31
    move-object v6, v11

    :goto_1b
    if-nez v7, :cond_32

    if-eqz v6, :cond_28

    :cond_32
    const/16 v17, 0x1

    goto :goto_1d

    :goto_1c
    return v16

    :goto_1d
    return v17
.end method

.method public static W(Llb3/b1;ZLja3/f0;I)Lka3/a;
    .locals 8

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, p1

    :goto_0
    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    :goto_1
    move v4, v1

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    goto :goto_1

    :goto_2
    and-int/lit8 p1, p3, 0x4

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    move-object p2, p3

    :cond_2
    if-eqz p2, :cond_3

    invoke-static {p2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p3

    :cond_3
    move-object v6, p3

    new-instance v2, Lka3/a;

    const/16 v7, 0x22

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lka3/a;-><init>(Llb3/b1;ZZLjava/util/Set;I)V

    return-object v2
.end method

.method public static X(I)Ljava/lang/String;
    .locals 7

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p0

    int-to-double v3, p0

    const-wide v5, 0x406fe00000000000L    # 255.0

    div-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    move-result-object p0

    sget v0, Lx8/t;->a:I

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "rgba(%d,%d,%d,%.3f)"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final Y(Ljava/lang/String;)Ll83/k;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    const/16 v0, 0x3a

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, ":"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p0, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, p0, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected StreamCallCid format: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "StreamCallCid needs to be in the format StreamCallType:StreamCallId. For example, default:123"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "StreamCallCid can not be empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static Z(IIII)Z
    .locals 4

    const/4 v0, 0x4

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p2, v2, :cond_1

    if-eq p2, v1, :cond_1

    if-ne p2, v0, :cond_0

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    move p0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move p0, v2

    :goto_1
    if-eq p3, v2, :cond_3

    if-eq p3, v1, :cond_3

    if-ne p3, v0, :cond_2

    if-eq p1, v1, :cond_2

    goto :goto_2

    :cond_2
    move p1, v3

    goto :goto_3

    :cond_3
    :goto_2
    move p1, v2

    :goto_3
    if-nez p0, :cond_5

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    return v3

    :cond_5
    :goto_4
    return v2
.end method

.method public static synthetic a(I)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v2, "a"

    aput-object v2, v0, v1

    goto :goto_0

    :pswitch_1
    const-string v2, "typeProjection"

    aput-object v2, v0, v1

    goto :goto_0

    :pswitch_2
    const-string v2, "type"

    aput-object v2, v0, v1

    goto :goto_0

    :pswitch_3
    const-string v2, "supertype"

    aput-object v2, v0, v1

    goto :goto_0

    :pswitch_4
    const-string v2, "subtype"

    aput-object v2, v0, v1

    goto :goto_0

    :pswitch_5
    const-string v2, "typeCheckingProcedure"

    aput-object v2, v0, v1

    goto :goto_0

    :pswitch_6
    const-string v2, "b"

    aput-object v2, v0, v1

    :goto_0
    const/4 v1, 0x1

    const-string v2, "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    const-string p0, "assertEqualTypes"

    aput-object p0, v0, v1

    goto :goto_1

    :pswitch_7
    const-string p0, "noCorrespondingSupertype"

    aput-object p0, v0, v1

    goto :goto_1

    :pswitch_8
    const-string p0, "capture"

    aput-object p0, v0, v1

    goto :goto_1

    :pswitch_9
    const-string p0, "assertSubtype"

    aput-object p0, v0, v1

    goto :goto_1

    :pswitch_a
    const-string p0, "assertEqualTypeConstructors"

    aput-object p0, v0, v1

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method

.method public static final a0(Lf63/c;Lio/ktor/utils/io/n;)Lc63/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc63/a;

    invoke-virtual {p0}, Lf63/c;->a()Lw53/b;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lc63/a;-><init>(Lw53/b;Lio/ktor/utils/io/q;Lf63/c;)V

    return-object v0
.end method

.method public static final b(ZLg40/e;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p6

    const-string v1, "controller"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v1, 0x4e7f1740

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v0, 0x6

    if-nez v1, :cond_1

    move/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move/from16 v1, p0

    move v4, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit16 v5, v0, 0xc00

    move-object/from16 v7, p3

    if-nez v5, :cond_7

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v4, v5

    :cond_7
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_9

    or-int/lit16 v4, v4, 0x6000

    :cond_8
    move-object/from16 v6, p4

    :goto_5
    move v11, v4

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v0, 0x6000

    if-nez v6, :cond_8

    move-object/from16 v6, p4

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_6

    :cond_a
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v4, v9

    goto :goto_5

    :goto_7
    and-int/lit16 v4, v11, 0x2493

    const/16 v9, 0x2492

    if-ne v4, v9, :cond_c

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v5, v6

    goto/16 :goto_e

    :cond_c
    :goto_8
    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_d

    move-object v5, v4

    goto :goto_9

    :cond_d
    move-object v5, v6

    :goto_9
    iget-object v6, v2, Lg40/e;->a:Ln53/e;

    const/4 v12, 0x0

    invoke-static {v6, v8, v12}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6, v3}, Lbi/g;->x(Ljava/util/List;Ljava/util/Set;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_e

    move-object v14, v6

    goto :goto_a

    :cond_e
    const/4 v14, 0x0

    :goto_a
    if-eqz v14, :cond_15

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v9, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    const/16 p4, 0x0

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_f

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_b
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v8, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-nez v10, :cond_10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    :cond_10
    invoke-static {v9, v8, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v8, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x444c93c6

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move v15, v12

    :goto_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v16, v15, 0x1

    if-ltz v15, :cond_13

    check-cast v4, Lg40/y2;

    and-int/lit8 v6, v11, 0xe

    shr-int/lit8 v9, v11, 0x6

    and-int/lit16 v9, v9, 0x380

    or-int/2addr v6, v9

    shl-int/lit8 v9, v11, 0x3

    and-int/lit16 v10, v9, 0x1c00

    or-int/2addr v6, v10

    const v10, 0xe000

    and-int/2addr v9, v10

    or-int/2addr v9, v6

    const/4 v10, 0x0

    move-object v6, v3

    move v3, v1

    invoke-static/range {v3 .. v10}, Ls2/e;->g(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v5

    const v3, 0x444cbfe7

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-static {v14}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-eq v15, v3, :cond_12

    invoke-static {v8}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v4, v3, Ld40/n;->c:J

    invoke-static {v8}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v3

    iget v6, v3, Ld40/o;->c:F

    const/4 v9, 0x0

    const/16 v10, 0x9

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    :cond_12
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    move-object/from16 v7, p3

    move-object v5, v1

    move/from16 v15, v16

    move/from16 v1, p0

    goto :goto_c

    :cond_13
    invoke-static {}, Lwb3/f;->d0()V

    throw p4

    :cond_14
    move-object v1, v5

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_15
    move-object v1, v5

    :goto_d
    move-object v5, v1

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_16

    new-instance v0, Lbf0/g;

    const/16 v8, 0xa

    move/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static varargs b0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 10

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    if-nez v3, :cond_0

    const-string v0, "null"

    goto/16 :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v8, v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    add-int/2addr v4, v5

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "@"

    invoke-static {v6, v0, v4, v3}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "com.google.common.base.Strings"

    invoke-static {v3}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v6, "lenientToString"

    const-string v5, "Exception during lenientFormat for "

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "com.google.common.base.Strings"

    invoke-virtual/range {v3 .. v8}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x8

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v4

    add-int/lit8 v5, v5, 0x1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "<"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " threw "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ">"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    mul-int/lit8 v0, v0, 0x10

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/2addr v2, v0

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    move v0, v1

    :goto_2
    array-length v2, p1

    if-ge v1, v2, :cond_3

    const-string v4, "%s"

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v3, p0, v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v1, 0x1

    aget-object v1, p1, v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v4, 0x2

    move v9, v1

    move v1, v0

    move v0, v9

    goto :goto_2

    :cond_3
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3, p0, v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    if-ge v1, v2, :cond_5

    const-string p0, " ["

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p0, v1, 0x1

    aget-object v0, p1, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_4
    array-length v0, p1

    if-ge p0, v0, :cond_4

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, p0, 0x1

    aget-object p0, p1, p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move p0, v0

    goto :goto_4

    :cond_4
    const/16 p0, 0x5d

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v2, p1

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v1, Lb2/e;->M:Lb2/k;

    sget-object v3, Lb2/e;->E:Lb2/m;

    const-string v4, "step"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v5, -0x96270be

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/Configuration;

    new-instance v6, Lsj/l;

    const/4 v7, 0x0

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    invoke-direct {v6, v8, v2, v7, v9}, Lsj/l;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILc93/a;)V

    iget v10, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    const/16 v11, 0x258

    const/4 v14, 0x2

    if-lt v10, v11, :cond_0

    const/4 v10, 0x3

    goto :goto_0

    :cond_0
    iget v10, v5, Landroid/content/res/Configuration;->orientation:I

    if-ne v10, v14, :cond_1

    move v10, v14

    goto :goto_0

    :cond_1
    const/4 v10, 0x1

    :goto_0
    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v11

    instance-of v15, v11, Lcom/amplitude/android/engagement/types/BannerFormFactor;

    if-eqz v15, :cond_2

    check-cast v11, Lcom/amplitude/android/engagement/types/BannerFormFactor;

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    :goto_1
    if-eqz v11, :cond_3

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/BannerFormFactor;->getPosition()Lcom/amplitude/android/engagement/types/BannerPosition;

    move-result-object v11

    if-nez v11, :cond_4

    :cond_3
    sget-object v11, Lcom/amplitude/android/engagement/types/BannerPosition;->BOTTOM:Lcom/amplitude/android/engagement/types/BannerPosition;

    :cond_4
    const/high16 v15, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, Lb2/e;->w:Lb2/m;

    invoke-static {v15, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_2
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v4, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    move-object/from16 v17, v11

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-nez v11, :cond_6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    move/from16 v18, v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    goto :goto_3

    :cond_6
    move/from16 v18, v10

    :goto_3
    invoke-static {v7, v4, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v4, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, Lpj/e;->a:[I

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    const/4 v11, 0x1

    if-eq v10, v11, :cond_9

    const/4 v11, 0x2

    if-ne v10, v11, :cond_8

    sget-object v10, Lb2/e;->H:Lb2/m;

    goto :goto_4

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    sget-object v10, Lb2/e;->x:Lb2/m;

    :goto_4
    sget-object v11, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v11, v12, v10}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object/from16 p3, v11

    const/4 v11, 0x0

    const/4 v14, 0x3

    invoke-static {v10, v11, v14}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v11

    iget v11, v11, Luj/m;->M:F

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v15, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    move-object v11, v5

    move-object/from16 v17, v6

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v4}, Lp1/q;->i0()V

    move-object/from16 v19, v11

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_a

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v4, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v5, v4, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v4, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/4 v5, 0x5

    int-to-float v5, v5

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget v6, v6, Luj/m;->L:F

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v22

    const-wide/16 v26, 0x0

    const/16 v28, 0x1c

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    move/from16 v21, v5

    invoke-static/range {v20 .. v28}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget v6, v6, Luj/m;->L:F

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v4, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll1/m;

    iget-wide v10, v6, Ll1/m;->p:J

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v10, v11, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v11, 0x0

    invoke-static {v15, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v4, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    :cond_e
    invoke-static {v10, v4, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v4, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v18 .. v18}, Le4/p;->e(I)I

    move-result v5

    const/16 v11, 0x40

    if-eqz v5, :cond_26

    const-string v14, "invalid weight; must be greater than zero"

    const-wide/16 v20, 0x0

    const/16 v10, 0x30

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1b

    const/4 v6, 0x2

    if-eq v5, v6, :cond_10

    const v0, 0x303d0e3e

    invoke-virtual {v4, v0}, Lp1/q;->f0(I)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move v11, v0

    move-object/from16 v16, v15

    move-object/from16 v5, v17

    :goto_7
    const/4 v6, 0x1

    goto/16 :goto_16

    :cond_10
    const v1, 0x303d075e

    invoke-virtual {v4, v1}, Lp1/q;->f0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v1

    iget v1, v1, Luj/m;->M:F

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Ll0/m;->a:Ll0/e;

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v5

    iget v5, v5, Luj/m;->N:F

    sget-object v6, Lb2/e;->N:Lb2/k;

    invoke-static {v5, v6}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v5

    invoke-static {v5, v0, v4, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_11

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v4, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_12

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    :cond_12
    invoke-static {v5, v4, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v4, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v5, v1

    cmpl-double v0, v5, v20

    if-lez v0, :cond_14

    goto :goto_9

    :cond_14
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v1, v5

    if-lez v6, :cond_15

    move v1, v5

    :goto_a
    const/4 v6, 0x1

    goto :goto_b

    :cond_15
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_a

    :goto_b
    invoke-direct {v0, v1, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v11, v4, v6}, Lsj/l;->d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v11, v4, v6}, Lsj/l;->e(IILandroidx/compose/runtime/Composer;I)V

    move-object/from16 v6, v19

    iget v6, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v6, v6

    const/high16 v10, 0x3e800000    # 0.25f

    mul-float/2addr v6, v10

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v17, v5

    const/16 v10, 0x10

    int-to-float v5, v10

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-static {v6, v5, v10, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v3, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_16

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_16
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v4, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_17

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    :cond_17
    invoke-static {v1, v4, v1, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v4, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v4, v1}, Lsj/l;->a(Landroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v5, v1

    cmpl-double v3, v5, v20

    if-lez v3, :cond_19

    goto :goto_d

    :cond_19
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v1, v17

    if-lez v5, :cond_1a

    move/from16 v1, v17

    :goto_e
    const/4 v6, 0x1

    goto :goto_f

    :cond_1a
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_e

    :goto_f
    invoke-direct {v3, v1, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v1, 0x40

    const/4 v11, 0x0

    invoke-virtual {v0, v11, v1, v4, v6}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    move-object v5, v0

    move-object/from16 v16, v15

    goto/16 :goto_7

    :cond_1b
    move-object/from16 v5, v17

    move-object/from16 v6, v19

    const v11, 0x303d0301

    invoke-virtual {v4, v11}, Lp1/q;->f0(I)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v11

    iget v11, v11, Luj/m;->M:F

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->a:Ll0/e;

    move-object/from16 v17, v14

    const/16 v14, 0x30

    invoke-static {v11, v0, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move-object v11, v15

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v4, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v4}, Lp1/q;->i0()V

    move-object/from16 v16, v11

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_1c

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1c
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v4, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_1d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_1d
    invoke-static {v14, v4, v14, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v4, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v14, 0x3f800000    # 1.0f

    float-to-double v10, v14

    cmpl-double v0, v10, v20

    if-lez v0, :cond_1f

    goto :goto_11

    :cond_1f
    invoke-static/range {v17 .. v17}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_11
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v11, 0x1

    invoke-direct {v0, v14, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v10

    iget v10, v10, Luj/m;->N:F

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v10, v1, v4, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_20

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_20
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_21

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    :cond_21
    invoke-static {v10, v4, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v4, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/16 v1, 0x40

    const/4 v11, 0x1

    invoke-virtual {v5, v0, v1, v4, v11}, Lsj/l;->d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v5, v0, v1, v4, v11}, Lsj/l;->e(IILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    iget v0, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v0, v0

    const v1, 0x3e99999a    # 0.3f

    mul-float/2addr v0, v1

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/16 v10, 0x10

    int-to-float v0, v10

    const/16 v28, 0x0

    const/16 v29, 0xe

    const/16 v26, 0x0

    const/16 v27, 0x0

    move/from16 v25, v0

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v11, 0x0

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_23

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_23
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_24

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    :cond_24
    invoke-static {v3, v4, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    invoke-static {v4, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-virtual {v5, v4, v1}, Lsj/l;->a(Landroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    const/16 v1, 0x40

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v1, v4, v6}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto/16 :goto_7

    :cond_26
    move-object/from16 v16, v15

    move-object/from16 v5, v17

    const v0, 0x303d0bd8

    invoke-virtual {v4, v0}, Lp1/q;->f0(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget v6, v6, Luj/m;->M:F

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Ll0/m;->a:Ll0/e;

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget v6, v6, Luj/m;->N:F

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/4 v11, 0x0

    invoke-static {v6, v1, v4, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_27

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_27
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_28

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    :cond_28
    invoke-static {v6, v4, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_29
    invoke-static {v4, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x40

    const/4 v6, 0x1

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v1, v4, v6}, Lsj/l;->d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v1, v4, v6}, Lsj/l;->e(IILandroidx/compose/runtime/Composer;I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_2a

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_2a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_2b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    :cond_2b
    invoke-static {v3, v4, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    invoke-static {v4, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-virtual {v5, v4, v1}, Lsj/l;->a(Landroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    const v0, 0x6d4f53c7

    invoke-virtual {v4, v0}, Lp1/q;->f0(I)V

    move/from16 v14, v18

    if-ne v14, v6, :cond_30

    sget-object v0, Lb2/e;->y:Lb2/m;

    move-object/from16 v1, p3

    invoke-virtual {v1, v12, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v10, 0x10

    int-to-float v1, v10

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-static {v1, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_2d

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_2d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_2e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    :cond_2e
    invoke-static {v3, v4, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2f
    invoke-static {v4, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x40

    const/4 v6, 0x1

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v1, v4, v6}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    :cond_30
    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_31

    return-void

    :cond_31
    new-instance v0, Lgb/r;

    const/4 v5, 0x3

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lgb/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V
    .locals 18

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x144dc478

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    move/from16 v1, p1

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v2, v4, 0x30

    const/4 v3, 0x0

    if-nez v2, :cond_3

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v5, p0

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit16 v6, v4, 0xc00

    if-nez v6, :cond_8

    move/from16 v6, p2

    invoke-virtual {v10, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v0, v7

    goto :goto_6

    :cond_8
    move/from16 v6, p2

    :goto_6
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_a

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v5

    move-object v13, v10

    goto :goto_9

    :cond_a
    :goto_7
    if-eqz v2, :cond_b

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_8

    :cond_b
    move-object v2, v5

    :goto_8
    invoke-static {v10}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v5

    invoke-virtual {v5}, Lg1/c1;->f()J

    move-result-wide v7

    invoke-static {v10}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v5

    iget-wide v11, v5, Ld40/n;->e:J

    invoke-static {v10}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v5

    invoke-virtual {v5}, Lg1/c1;->h()J

    move-result-wide v13

    move-wide/from16 v16, v13

    move-object v13, v10

    move-wide/from16 v9, v16

    const/4 v14, 0x0

    const/16 v15, 0x18

    move-wide v5, v7

    move-wide v7, v11

    const-wide/16 v11, 0x0

    invoke-static/range {v5 .. v15}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v9

    and-int/lit16 v11, v0, 0x1ffe

    const/16 v12, 0x10

    move/from16 v8, p2

    move v5, v1

    move-object v7, v2

    move-object v6, v3

    move-object v10, v13

    invoke-static/range {v5 .. v12}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lj40/a;

    move/from16 v1, p1

    move/from16 v3, p2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lj40/a;-><init>(ZLandroidx/compose/ui/Modifier;ZII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final e(Lh00/h0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p3

    check-cast v7, Lp1/q;

    const v0, -0x6a9fc36b

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    invoke-virtual {v7, p2}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_6

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_6
    :goto_4
    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v5, p4, 0x1

    if-eqz v5, :cond_8

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :cond_8
    :goto_5
    invoke-virtual {v7}, Lp1/q;->r()V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_d

    const/4 v8, 0x1

    if-eq v5, v8, :cond_c

    if-eq v5, v2, :cond_b

    const/4 v2, 0x3

    if-eq v5, v2, :cond_a

    if-ne v5, v3, :cond_9

    const v2, 0x2d39bec4

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f141040

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v0, 0x75121a0e

    invoke-static {v0, v7, v6}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_a
    const v2, 0x2d378dfb

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f1410f0

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "<img src=\"link_logo\"> \u2022 "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    const v2, 0x2d35bf29

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f1410ed

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    const v2, 0x2d3406dd

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f1410ee

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_d
    const v2, 0x2d31ea8b

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f1410ef

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    :goto_6
    const v3, 0x75126fef

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    new-instance v3, Ln83/f;

    invoke-direct {v3}, Ln83/f;-><init>()V

    const v5, 0x75127236

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lh00/h0;->z:Lh00/h0;

    if-ne p0, v5, :cond_f

    new-instance v5, Lp40/a;

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v8

    iget-wide v8, v8, Ld40/n;->a:J

    invoke-static {v8, v9}, Ld40/r;->p(J)Z

    move-result v8

    if-eqz v8, :cond_e

    const v8, 0x7f080861

    goto :goto_7

    :cond_e
    const v8, 0x7f080862

    :goto_7
    const v9, 0x7f14102c

    const/4 v10, 0x0

    invoke-direct {v5, v8, v9, v10}, Lp40/a;-><init>(IILi2/p;)V

    const-string v8, "link_logo"

    invoke-virtual {v3, v8, v5}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v3}, Ln83/f;->b()Ln83/f;

    move-result-object v3

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    invoke-static {v2}, Lv8/b;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    and-int/lit16 v8, v0, 0x3f0

    const/4 v9, 0x0

    const/4 v5, 0x7

    move v4, p2

    move-object v6, v3

    move-object v3, p1

    invoke-static/range {v2 .. v9}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lfc0/e;

    const/16 v5, 0x9

    move-object v1, p0

    move-object v3, p1

    move v2, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final f(Lh40/k;Lh40/e;Landroidx/compose/ui/Modifier;Lc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutInfo"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismissed"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v3, -0x78dc8284

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v3, v8

    goto :goto_4

    :cond_5
    move-object/from16 v7, p2

    :goto_4
    and-int/lit16 v8, v6, 0xc00

    const/16 v9, 0x800

    if-nez v8, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v9

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v3, v8

    :cond_7
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_6

    :cond_8
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v3, v8

    :cond_9
    and-int/lit16 v8, v3, 0x2493

    const/16 v10, 0x2492

    if-ne v8, v10, :cond_b

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v20, v0

    goto :goto_9

    :cond_b
    :goto_7
    const v8, -0x65e6101

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit16 v3, v3, 0x1c00

    const/4 v10, 0x0

    if-ne v3, v9, :cond_c

    const/4 v3, 0x1

    goto :goto_8

    :cond_c
    move v3, v10

    :goto_8
    or-int/2addr v3, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_d

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v8, v3, :cond_e

    :cond_d
    new-instance v8, Lh20/i0;

    const/4 v3, 0x0

    const/4 v9, 0x7

    invoke-direct {v8, v1, v4, v3, v9}, Lh20/i0;-><init>(Lh40/k;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lc93/m;

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v8, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    iget-wide v11, v2, Lh40/e;->c:J

    iget-wide v13, v2, Lh40/e;->b:J

    int-to-float v3, v10

    move-wide/from16 v17, v11

    iget-object v11, v2, Lh40/e;->a:Lt0/i;

    iget-object v9, v1, Lh40/k;->a:Lg1/y3;

    new-instance v10, Lb30/k2;

    const/4 v12, 0x7

    invoke-direct {v10, v5, v12}, Lb30/k2;-><init>(Lx1/b;I)V

    const v12, -0x6143add6

    invoke-static {v12, v0, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    sget-object v19, Lh40/b;->a:Lx1/b;

    const v21, 0x30030e06

    const/16 v22, 0x80

    move-object v7, v10

    const/4 v10, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v20, v0

    move v12, v3

    invoke-static/range {v7 .. v22}, Landroidx/compose/material/c;->a(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/y3;ZLi2/a1;FJJJLx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_f

    new-instance v0, Laq1/c;

    const/16 v7, 0xd

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final g(Lud3/x0;)Lbi/s;
    .locals 10

    iget v1, p0, Lud3/x0;->z:I

    iget-wide v2, p0, Lud3/x0;->L:J

    iget-wide v4, p0, Lud3/x0;->M:J

    iget-object v0, p0, Lud3/x0;->F:Lud3/d0;

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Lud3/d0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v7, v0

    check-cast v7, La0/i1;

    invoke-virtual {v7}, La0/i1;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v7}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/k;

    iget-object v8, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v7, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "toLowerCase(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_0

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v9, Ljava/util/List;

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Lbi/q;

    invoke-static {v6}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    invoke-direct {v0, v6}, Lbi/q;-><init>(Ljava/util/Map;)V

    iget-object v6, p0, Lud3/x0;->G:Lud3/a1;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lud3/a1;->d1()Lne3/j;

    move-result-object v6

    if-eqz v6, :cond_2

    new-instance v7, Lbi/t;

    invoke-direct {v7, v6}, Lbi/t;-><init>(Lne3/j;)V

    :goto_1
    move-object v6, v0

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    goto :goto_1

    :goto_2
    new-instance v0, Lbi/s;

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lbi/s;-><init>(IJJLbi/q;Lbi/t;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final h(Lbi/r;Ls83/c;)Lud3/o0;
    .locals 5

    instance-of v0, p1, Lei/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lei/d;

    iget v1, v0, Lei/d;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lei/d;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lei/d;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lei/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, v0, Lei/d;->x:I

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 p0, 0x1

    if-ne v0, p0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lne3/l;

    if-eqz p1, :cond_1

    sget-object p0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lud3/r0;

    invoke-direct {p0, v1, p1}, Lud3/r0;-><init>(Lud3/h0;Lne3/l;)V

    move-object p1, v1

    move-object v0, p1

    move-object v2, v0

    goto :goto_2

    :cond_1
    move-object p0, v1

    move-object p1, p0

    move-object v0, p1

    move-object v2, v0

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lud3/n0;

    invoke-direct {p1}, Lud3/n0;-><init>()V

    iget-object v0, p0, Lbi/r;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lud3/n0;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lbi/r;->b:Ljava/lang/String;

    move-object v2, v0

    move-object v0, p1

    :goto_1
    move-object v4, p1

    move-object p1, p0

    move-object p0, v1

    move-object v1, v4

    :goto_2
    invoke-virtual {v1, v2, p0}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    iget-object p0, p1, Lbi/r;->c:Lbi/q;

    new-instance p1, Lkotlin/jvm/internal/k0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    iget-object p0, p0, Lbi/q;->a:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lud3/n0;->d(Lud3/d0;)V

    new-instance p0, Lud3/o0;

    invoke-direct {p0, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p0
.end method

.method public static final i(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lq3/y;Lq3/r;Ll3/r0;Landroid/graphics/Matrix;Lh2/c;Lh2/c;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p5

    invoke-virtual {v0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setMatrix(Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-wide v1, v6, Lq3/y;->b:J

    iget-object v10, v6, Lq3/y;->c:Ll3/u0;

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result v1

    iget-wide v2, v6, Lq3/y;->b:J

    invoke-static {v2, v3}, Ll3/u0;->e(J)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    const/4 v12, 0x0

    if-eqz p7, :cond_7

    if-gez v1, :cond_0

    goto :goto_3

    :cond_0
    invoke-interface {v7, v1}, Lq3/r;->x(I)I

    move-result v1

    invoke-virtual {v8, v1}, Ll3/r0;->c(I)Lh2/c;

    move-result-object v2

    iget v3, v2, Lh2/c;->a:F

    iget-wide v4, v8, Ll3/r0;->c:J

    const/16 v13, 0x20

    shr-long/2addr v4, v13

    long-to-int v4, v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-static {v3, v5, v4}, Le93/b;->m(FFF)F

    move-result v3

    iget v4, v2, Lh2/c;->b:F

    invoke-static {v9, v3, v4}, Lv8/b;->l(Lh2/c;FF)Z

    move-result v4

    iget v5, v2, Lh2/c;->d:F

    invoke-static {v9, v3, v5}, Lv8/b;->l(Lh2/c;FF)Z

    move-result v5

    invoke-virtual {v8, v1}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v1

    sget-object v13, Lw3/j;->x:Lw3/j;

    if-ne v1, v13, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v12

    :goto_0
    if-nez v4, :cond_3

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    move v13, v12

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v13, 0x1

    :goto_2
    if-eqz v4, :cond_4

    if-nez v5, :cond_5

    :cond_4
    or-int/lit8 v13, v13, 0x2

    :cond_5
    if-eqz v1, :cond_6

    or-int/lit8 v13, v13, 0x4

    :cond_6
    move v5, v13

    iget v1, v2, Lh2/c;->b:F

    iget v2, v2, Lh2/c;->d:F

    move v4, v2

    move/from16 v16, v2

    move v2, v1

    move v1, v3

    move/from16 v3, v16

    invoke-virtual/range {v0 .. v5}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setInsertionMarkerLocation(FFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_7
    :goto_3
    if-eqz p8, :cond_11

    const/4 v1, -0x1

    if-eqz v10, :cond_8

    iget-wide v2, v10, Ll3/u0;->a:J

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v2

    goto :goto_4

    :cond_8
    move v2, v1

    :goto_4
    if-eqz v10, :cond_9

    iget-wide v3, v10, Ll3/u0;->a:J

    invoke-static {v3, v4}, Ll3/u0;->e(J)I

    move-result v1

    :cond_9
    move v10, v1

    if-ltz v2, :cond_11

    if-ge v2, v10, :cond_11

    iget-object v1, v6, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1, v2, v10}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-interface {v7, v2}, Lq3/r;->x(I)I

    move-result v13

    invoke-interface {v7, v10}, Lq3/r;->x(I)I

    move-result v1

    sub-int v3, v1, v13

    mul-int/lit8 v3, v3, 0x4

    new-array v14, v3, [F

    iget-object v3, v8, Ll3/r0;->b:Ll3/w;

    invoke-static {v13, v1}, Lj93/l0;->f(II)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5, v14}, Ll3/w;->a(J[F)V

    move v1, v2

    :goto_5
    if-ge v1, v10, :cond_11

    invoke-interface {v7, v1}, Lq3/r;->x(I)I

    move-result v2

    sub-int v3, v2, v13

    mul-int/lit8 v3, v3, 0x4

    aget v4, v14, v3

    add-int/lit8 v5, v3, 0x1

    aget v5, v14, v5

    add-int/lit8 v6, v3, 0x2

    aget v6, v14, v6

    add-int/lit8 v3, v3, 0x3

    aget v3, v14, v3

    iget v15, v9, Lh2/c;->a:F

    cmpg-float v15, v15, v6

    if-gez v15, :cond_a

    const/4 v15, 0x1

    goto :goto_6

    :cond_a
    move v15, v12

    :goto_6
    iget v11, v9, Lh2/c;->c:F

    cmpg-float v11, v4, v11

    if-gez v11, :cond_b

    const/4 v11, 0x1

    goto :goto_7

    :cond_b
    move v11, v12

    :goto_7
    and-int/2addr v11, v15

    iget v15, v9, Lh2/c;->b:F

    cmpg-float v15, v15, v3

    if-gez v15, :cond_c

    const/4 v15, 0x1

    goto :goto_8

    :cond_c
    move v15, v12

    :goto_8
    and-int/2addr v11, v15

    iget v15, v9, Lh2/c;->d:F

    cmpg-float v15, v5, v15

    if-gez v15, :cond_d

    const/4 v15, 0x1

    goto :goto_9

    :cond_d
    move v15, v12

    :goto_9
    and-int/2addr v11, v15

    invoke-static {v9, v4, v5}, Lv8/b;->l(Lh2/c;FF)Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-static {v9, v6, v3}, Lv8/b;->l(Lh2/c;FF)Z

    move-result v15

    if-nez v15, :cond_f

    :cond_e
    or-int/lit8 v11, v11, 0x2

    :cond_f
    invoke-virtual {v8, v2}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v2

    sget-object v15, Lw3/j;->x:Lw3/j;

    if-ne v2, v15, :cond_10

    or-int/lit8 v11, v11, 0x4

    :cond_10
    move v2, v5

    move v5, v3

    move v3, v2

    move v2, v4

    move v4, v6

    move v6, v11

    invoke-virtual/range {v0 .. v6}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addCharacterBounds(IFFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_11
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_12

    if-eqz p9, :cond_12

    move-object/from16 v2, p6

    invoke-static {v0, v2}, Lc4/v;->k(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lh2/c;)V

    :cond_12
    const/16 v2, 0x22

    if-lt v1, v2, :cond_13

    if-eqz p10, :cond_13

    invoke-static {v0, v8, v9}, Lb3/g1;->b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ll3/r0;Lh2/c;)V

    :cond_13
    invoke-virtual {v0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v0

    return-object v0
.end method

.method public static final j(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;
    .locals 22

    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    const-string v0, "/"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v3

    new-instance v2, Loe3/i;

    const/16 v19, 0x0

    const v20, 0xfffc

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v2 .. v20}, Loe3/i;-><init>(Lne3/e0;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v1, Lb2/d;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lb2/d;-><init>(I)V

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loe3/i;

    iget-object v3, v2, Loe3/i;->a:Lne3/e0;

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Loe3/i;

    if-nez v3, :cond_0

    :goto_1
    iget-object v2, v2, Loe3/i;->a:Lne3/e0;

    invoke-virtual {v2}, Lne3/e0;->c()Lne3/e0;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Loe3/i;

    if-eqz v3, :cond_2

    iget-object v3, v3, Loe3/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v3, Loe3/i;

    const/16 v20, 0x0

    const v21, 0xfffc

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v3 .. v21}, Loe3/i;-><init>(Lne3/e0;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v3, Loe3/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v2, v3

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public static final k(Lcom/squareup/wire/q;Ljava/lang/String;)Lcom/squareup/wire/e;
    .locals 3

    invoke-virtual {p0}, Lcom/squareup/wire/q;->getType()Lj93/d;

    move-result-object v0

    invoke-virtual {p0}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lcom/squareup/wire/e;

    invoke-direct {v2, p1, p0, v0, v1}, Lcom/squareup/wire/e;-><init>(Ljava/lang/String;Lcom/squareup/wire/q;Lj93/d;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final l(Lh2/c;FF)Z
    .locals 2

    iget v0, p0, Lh2/c;->a:F

    iget v1, p0, Lh2/c;->c:F

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_0

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_0

    iget p1, p0, Lh2/c;->b:F

    iget p0, p0, Lh2/c;->d:F

    cmpg-float p0, p2, p0

    if-gtz p0, :cond_0

    cmpg-float p0, p1, p2

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static m(Le30/c;Lv00/c0;Lh20/f;Lh20/z4;)Lb30/q0;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    const-string v3, "viewModel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "paymentMethodMetadata"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "customerStateHolder"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "savedPaymentMethodMutator"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v4, Lh20/z4;->n:Ln53/e;

    iget-object v12, v4, Lh20/z4;->q:Lec3/h2;

    iget-object v13, v4, Lh20/z4;->o:Ln53/e;

    iget-object v14, v2, Lh20/f;->f:Ln53/e;

    new-instance v3, Lb30/i0;

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v4, 0x0

    const-class v6, Lh20/z4;

    const-string v7, "toggleEditing"

    const-string v8, "toggleEditing()V"

    move-object/from16 v5, p3

    invoke-direct/range {v3 .. v10}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v10, v3

    iget-object v15, v0, Le30/c;->Q:Lec3/r1;

    move-object/from16 v16, v12

    iget-object v12, v0, Le30/c;->P:Lec3/r1;

    iget-object v2, v2, Lh20/f;->d:Lec3/r1;

    iget-object v3, v0, Le30/c;->M:Lr20/d;

    iget-object v3, v3, Lr20/d;->g:Ln53/e;

    new-instance v4, Lb01/f;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lb01/f;-><init>(I)V

    invoke-static {v3, v4}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v17

    move-object v3, v2

    new-instance v2, La1/e;

    const/4 v8, 0x0

    const/16 v9, 0x9

    move-object v4, v3

    const/4 v3, 0x1

    const-class v5, Lh20/z4;

    const-string v6, "updatePaymentMethod"

    const-string v7, "updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V"

    move-object/from16 v18, v4

    move-object/from16 v4, p3

    invoke-direct/range {v2 .. v9}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object v3, v1, Lv00/c0;->w:Ly00/c8;

    invoke-interface {v3}, Ly00/c8;->q0()Z

    move-result v3

    new-instance v4, Lb30/q0;

    move-object v8, v14

    new-instance v14, Li;

    const/16 v5, 0x10

    invoke-direct {v14, v5, v0, v1}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lb30/h0;

    const/4 v5, 0x1

    invoke-direct {v1, v0, v5}, Lb30/h0;-><init>(Le30/c;I)V

    move-object v9, v10

    move-object v5, v11

    move-object v7, v13

    move-object v10, v15

    move-object/from16 v6, v16

    move-object/from16 v11, v17

    move-object/from16 v13, v18

    move-object/from16 v16, v1

    move-object v15, v2

    move/from16 v17, v3

    invoke-direct/range {v4 .. v17}, Lb30/q0;-><init>(Ln53/e;Lec3/h2;Ln53/e;Ln53/e;Lb30/i0;Lec3/r1;Ln53/e;Lec3/r1;Lec3/r1;Li;La1/e;Lb30/h0;Z)V

    return-object v4
.end method

.method public static final n(Lad3/c;Lwc3/b;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lro/i;

    invoke-direct {v1, p2}, Lro/i;-><init>(Ljava/io/InputStream;)V

    :try_start_0
    sget-object p2, Lbd3/h;->z:Lbd3/h;

    const/16 v0, 0x4000

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/l;->J(I)[C

    move-result-object p2

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lbd3/d0;

    invoke-direct {v5, v1, p2}, Lbd3/d0;-><init>(Lro/i;[C)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v2, Lbd3/f0;

    sget-object v4, Lbd3/l0;->y:Lbd3/l0;

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object v6

    const/4 v7, 0x0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lbd3/f0;-><init>(Lad3/c;Lbd3/l0;Lbd3/a;Lyc3/g;Lbd3/e0;)V

    invoke-virtual {v2, p1}, Lbd3/f0;->decodeSerializableValue(Lwc3/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v5}, Lbd3/a;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v5}, Lbd3/d0;->F()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v1}, Lro/i;->B()V

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    :try_start_3
    invoke-virtual {v5}, Lbd3/d0;->F()V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lro/i;->B()V

    throw p0
.end method

.method public static final o(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;
    .locals 7

    if-nez p1, :cond_0

    iget v0, p0, Lm4/e;->o0:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lm4/e;->p0:I

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-eqz p3, :cond_1

    iget v3, p3, Ln4/o;->b:I

    if-eq v0, v3, :cond_4

    :cond_1
    move v3, v1

    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln4/o;

    iget v5, v4, Ln4/o;->b:I

    if-ne v5, v0, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3, p1, v4}, Ln4/o;->d(ILn4/o;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    move-object p3, v4

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v0, v2, :cond_5

    return-object p3

    :cond_5
    :goto_2
    const/4 v0, 0x1

    if-nez p3, :cond_c

    instance-of v3, p0, Lm4/j;

    if-eqz v3, :cond_a

    move-object v3, p0

    check-cast v3, Lm4/j;

    move v4, v1

    :goto_3
    iget v5, v3, Lm4/j;->s0:I

    if-ge v4, v5, :cond_8

    iget-object v5, v3, Lm4/j;->r0:[Lm4/e;

    aget-object v5, v5, v4

    if-nez p1, :cond_6

    iget v6, v5, Lm4/e;->o0:I

    if-eq v6, v2, :cond_6

    goto :goto_4

    :cond_6
    if-ne p1, v0, :cond_7

    iget v6, v5, Lm4/e;->p0:I

    if-eq v6, v2, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    move v6, v2

    :goto_4
    if-eq v6, v2, :cond_a

    move v3, v1

    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_a

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln4/o;

    iget v5, v4, Ln4/o;->b:I

    if-ne v5, v6, :cond_9

    move-object p3, v4

    goto :goto_6

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_a
    :goto_6
    if-nez p3, :cond_b

    new-instance p3, Ln4/o;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p3, Ln4/o;->a:Ljava/util/ArrayList;

    const/4 v3, 0x0

    iput-object v3, p3, Ln4/o;->d:Ljava/util/ArrayList;

    iput v2, p3, Ln4/o;->e:I

    sget v2, Ln4/o;->f:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Ln4/o;->f:I

    iput v2, p3, Ln4/o;->b:I

    iput p1, p3, Ln4/o;->c:I

    :cond_b
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    iget v2, p3, Ln4/o;->b:I

    invoke-virtual {p3, p0}, Ln4/o;->a(Lm4/e;)Z

    move-result v3

    if-eqz v3, :cond_10

    instance-of v3, p0, Lm4/i;

    if-eqz v3, :cond_e

    move-object v3, p0

    check-cast v3, Lm4/i;

    iget-object v4, v3, Lm4/i;->u0:Lm4/d;

    iget v3, v3, Lm4/i;->v0:I

    if-nez v3, :cond_d

    move v1, v0

    :cond_d
    invoke-virtual {v4, v1, p2, p3}, Lm4/d;->c(ILjava/util/ArrayList;Ln4/o;)V

    :cond_e
    if-nez p1, :cond_f

    iput v2, p0, Lm4/e;->o0:I

    iget-object v0, p0, Lm4/e;->J:Lm4/d;

    invoke-virtual {v0, p1, p2, p3}, Lm4/d;->c(ILjava/util/ArrayList;Ln4/o;)V

    iget-object v0, p0, Lm4/e;->L:Lm4/d;

    invoke-virtual {v0, p1, p2, p3}, Lm4/d;->c(ILjava/util/ArrayList;Ln4/o;)V

    goto :goto_7

    :cond_f
    iput v2, p0, Lm4/e;->p0:I

    iget-object v0, p0, Lm4/e;->K:Lm4/d;

    invoke-virtual {v0, p1, p2, p3}, Lm4/d;->c(ILjava/util/ArrayList;Ln4/o;)V

    iget-object v0, p0, Lm4/e;->N:Lm4/d;

    invoke-virtual {v0, p1, p2, p3}, Lm4/d;->c(ILjava/util/ArrayList;Ln4/o;)V

    iget-object v0, p0, Lm4/e;->M:Lm4/d;

    invoke-virtual {v0, p1, p2, p3}, Lm4/d;->c(ILjava/util/ArrayList;Ln4/o;)V

    :goto_7
    iget-object p0, p0, Lm4/e;->Q:Lm4/d;

    invoke-virtual {p0, p1, p2, p3}, Lm4/d;->c(ILjava/util/ArrayList;Ln4/o;)V

    :cond_10
    return-object p3
.end method

.method public static q(Landroid/content/Context;Lio/sentry/u6;II)Lio/sentry/android/replay/w;
    .locals 9

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float v0, p3, v0

    iget-object v1, p1, Lio/sentry/u6;->g:Lio/sentry/t6;

    iget v2, v1, Lio/sentry/t6;->sizeScale:F

    mul-float/2addr v0, v2

    invoke-static {v0}, Le93/b;->X(F)I

    move-result v0

    rem-int/lit8 v2, v0, 0x10

    const/16 v3, 0x10

    const/16 v4, 0x8

    if-gt v2, v4, :cond_0

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_0
    rsub-int/lit8 v2, v2, 0x10

    add-int/2addr v0, v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    div-float p0, p2, p0

    iget v2, v1, Lio/sentry/t6;->sizeScale:F

    mul-float/2addr p0, v2

    invoke-static {p0}, Le93/b;->X(F)I

    move-result p0

    rem-int/lit8 v2, p0, 0x10

    if-gt v2, v4, :cond_1

    sub-int/2addr p0, v2

    invoke-static {v3, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    goto :goto_1

    :cond_1
    sub-int/2addr v3, v2

    add-int/2addr p0, v3

    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v3

    new-instance v2, Lio/sentry/android/replay/w;

    int-to-float p0, v3

    div-float v5, p0, p2

    int-to-float p0, v4

    div-float v6, p0, p3

    iget v7, p1, Lio/sentry/u6;->h:I

    iget v8, v1, Lio/sentry/t6;->bitRate:I

    invoke-direct/range {v2 .. v8}, Lio/sentry/android/replay/w;-><init>(IIFFII)V

    return-object v2
.end method

.method public static declared-synchronized r(Landroid/content/Context;)Landroid/media/AudioManager;
    .locals 5

    const-class v0, Lv8/b;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v1, 0x0

    sput-object v1, Lv8/b;->a:Landroid/media/AudioManager;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    sget-object v1, Lv8/b;->a:Landroid/media/AudioManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lb9/m1;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lb9/m1;-><init>(I)V

    invoke-static {}, Lx8/a;->i()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lr5/b;

    const/16 v4, 0x10

    invoke-direct {v3, v4, p0, v1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Lb9/m1;->a()V

    sget-object p0, Lv8/b;->a:Landroid/media/AudioManager;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_3
    :goto_1
    :try_start_2
    const-string v1, "audio"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/media/AudioManager;

    sput-object p0, Lv8/b;->a:Landroid/media/AudioManager;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D
    .locals 0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide p0

    return-wide p0

    :cond_0
    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public static t(Landroidx/health/platform/client/proto/b0;Ljava/lang/String;)D
    .locals 0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/b0;->s()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide p0

    return-wide p0

    :cond_0
    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public static final u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;
    .locals 2

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->M()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p0

    const-string v0, "ofEpochMilli(endTimeMillis)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;
    .locals 1

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->N()I

    move-result p0

    invoke-static {p0}, Ljava/time/ZoneOffset;->ofTotalSeconds(I)Ljava/time/ZoneOffset;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p3}, Lv8/b;->K(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_2

    invoke-static {p0, p2}, Lv8/b;->K(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    if-nez p1, :cond_0

    const p1, 0x7f1410fa

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "getString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    return-object p1

    :cond_1
    return-object p2

    :cond_2
    return-object p3
.end method

.method public static final x(Ljava/lang/Throwable;)Lzy/c;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/core/exception/APIConnectionException;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const p0, 0x7f141001

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    new-array v0, v2, [Ljava/lang/Object;

    new-instance v1, Lzy/d;

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lzy/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v1

    :cond_1
    const p0, 0x7f14101c

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0
.end method

.method public static final y(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Lva3/d;->c(I)V

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "0x"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static z(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)J
    .locals 0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/g0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/g0;->y()J

    move-result-wide p0

    return-wide p0

    :cond_0
    const-wide/16 p0, 0x0

    return-wide p0
.end method
