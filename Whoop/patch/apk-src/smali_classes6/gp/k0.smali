.class public final Lgp/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgp/k0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Lgp/k0;->a:I

    packed-switch v2, :pswitch_data_0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    :try_start_0
    invoke-static {v0}, Lgp/n;->b(I)Lgp/n;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/fido/fido2/api/common/ErrorCode$UnsupportedErrorCodeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_0
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_1

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_0

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {v0, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    goto :goto_0

    :cond_1
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/q0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_1
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    invoke-static {v0, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    sget-object v3, Lgp/o0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_1

    :cond_3
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/p0;

    invoke-direct {v0, v3}, Lgp/p0;-><init>(Ljava/util/ArrayList;)V

    return-object v0

    :pswitch_2
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v9, v3

    move-object v10, v9

    move-object v11, v10

    move-wide v7, v4

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_8

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_7

    const/4 v5, 0x2

    if-eq v4, v5, :cond_6

    const/4 v5, 0x3

    if-eq v4, v5, :cond_5

    const/4 v5, 0x4

    if-eq v4, v5, :cond_4

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_4
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    move-object v11, v3

    goto :goto_2

    :cond_5
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    move-object v10, v3

    goto :goto_2

    :cond_6
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    move-object v9, v3

    goto :goto_2

    :cond_7
    invoke-static {v0, v3}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v3

    move-wide v7, v3

    goto :goto_2

    :cond_8
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v6, Lgp/o0;

    invoke-direct/range {v6 .. v11}, Lgp/o0;-><init>(J[B[B[B)V

    return-object v6

    :pswitch_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    :try_start_1
    invoke-static {v0}, Lgp/l;->b(I)Lgp/l;

    move-result-object v0
    :try_end_1
    .catch Lcom/google/android/gms/fido/fido2/api/common/COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_4
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v8

    if-ge v8, v2, :cond_f

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    int-to-char v9, v8

    const/4 v10, 0x2

    if-eq v9, v10, :cond_e

    const/4 v10, 0x3

    const/4 v11, 0x4

    if-eq v9, v10, :cond_b

    if-eq v9, v11, :cond_a

    const/4 v10, 0x5

    if-eq v9, v10, :cond_9

    invoke-static {v0, v8}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_9
    invoke-static {v0, v8}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_a
    invoke-static {v0, v8}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_b
    invoke-static {v0, v8}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result v5

    if-nez v5, :cond_c

    move-object v5, v3

    goto :goto_3

    :cond_c
    invoke-static {v0, v5, v11}, Lvo/b;->H(Landroid/os/Parcel;II)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_d

    const/4 v5, 0x1

    goto :goto_4

    :cond_d
    const/4 v5, 0x0

    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_3

    :cond_e
    invoke-static {v0, v8}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_f
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/k;

    invoke-direct {v0, v4, v6, v5, v7}, Lgp/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v0

    :pswitch_5
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v4

    move v4, v3

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_13

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x2

    if-eq v7, v8, :cond_12

    const/4 v8, 0x3

    if-eq v7, v8, :cond_11

    const/4 v8, 0x4

    if-eq v7, v8, :cond_10

    invoke-static {v0, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_5

    :cond_10
    invoke-static {v0, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_5

    :cond_11
    invoke-static {v0, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_12
    invoke-static {v0, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_5

    :cond_13
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/i;

    invoke-direct {v0, v3, v4, v5}, Lgp/i;-><init>(IILjava/lang/String;)V

    return-object v0

    :pswitch_6
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_18

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x2

    if-eq v8, v9, :cond_17

    const/4 v9, 0x3

    if-eq v8, v9, :cond_16

    const/4 v9, 0x4

    if-eq v8, v9, :cond_15

    const/4 v9, 0x5

    if-eq v8, v9, :cond_14

    invoke-static {v0, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_6

    :cond_14
    invoke-static {v0, v7}, Lvo/b;->i(Landroid/os/Parcel;I)[Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_15
    invoke-static {v0, v7}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v5

    goto :goto_6

    :cond_16
    invoke-static {v0, v7}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v4

    goto :goto_6

    :cond_17
    invoke-static {v0, v7}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_6

    :cond_18
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/h;

    invoke-direct {v0, v3, v4, v5, v6}, Lgp/h;-><init>([B[B[B[Ljava/lang/String;)V

    return-object v0

    :pswitch_7
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_1e

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v10, 0x2

    if-eq v4, v10, :cond_1d

    const/4 v10, 0x3

    if-eq v4, v10, :cond_1c

    const/4 v10, 0x4

    if-eq v4, v10, :cond_1b

    const/4 v10, 0x5

    if-eq v4, v10, :cond_1a

    const/4 v10, 0x6

    if-eq v4, v10, :cond_19

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_7

    :cond_19
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v9

    goto :goto_7

    :cond_1a
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v8

    goto :goto_7

    :cond_1b
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v7

    goto :goto_7

    :cond_1c
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v6

    goto :goto_7

    :cond_1d
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v5

    goto :goto_7

    :cond_1e
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lgp/g;

    invoke-direct/range {v4 .. v9}, Lgp/g;-><init>([B[B[B[B[B)V

    return-object v4

    :pswitch_8
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_21

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_20

    const/4 v8, 0x2

    if-eq v7, v8, :cond_1f

    invoke-static {v0, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_8

    :cond_1f
    invoke-static {v0, v6}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v5

    goto :goto_8

    :cond_20
    invoke-static {v0, v6}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v4

    goto :goto_8

    :cond_21
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/n0;

    if-nez v5, :cond_22

    goto :goto_9

    :cond_22
    array-length v2, v5

    invoke-static {v2, v5}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object v3

    :goto_9
    invoke-direct {v0, v4, v3}, Lgp/n0;-><init>(ZLmp/t0;)V

    return-object v0

    :pswitch_9
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_25

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_24

    const/4 v8, 0x2

    if-eq v7, v8, :cond_23

    invoke-static {v0, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_a

    :cond_23
    invoke-static {v0, v6}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v5

    goto :goto_a

    :cond_24
    invoke-static {v0, v6}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v4

    goto :goto_a

    :cond_25
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/m0;

    if-nez v4, :cond_26

    move-object v2, v3

    goto :goto_b

    :cond_26
    array-length v2, v4

    invoke-static {v2, v4}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object v2

    :goto_b
    if-nez v5, :cond_27

    goto :goto_c

    :cond_27
    array-length v3, v5

    invoke-static {v3, v5}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object v3

    :goto_c
    invoke-direct {v0, v2, v3}, Lgp/m0;-><init>(Lmp/t0;Lmp/t0;)V

    return-object v0

    :pswitch_a
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_29

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_28

    invoke-static {v0, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_d

    :cond_28
    invoke-static {v0, v4}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    goto :goto_d

    :cond_29
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/f;

    invoke-direct {v0, v3}, Lgp/f;-><init>(Z)V

    return-object v0

    :pswitch_b
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_2a

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_e

    :pswitch_c
    sget-object v4, Lgp/i0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Lgp/i0;

    goto :goto_e

    :pswitch_d
    sget-object v4, Lgp/l0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lgp/l0;

    goto :goto_e

    :pswitch_e
    sget-object v4, Lgp/j0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lgp/j0;

    goto :goto_e

    :pswitch_f
    sget-object v4, Lgp/p;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lgp/p;

    goto :goto_e

    :pswitch_10
    sget-object v4, Lgp/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lgp/h0;

    goto :goto_e

    :pswitch_11
    sget-object v4, Lgp/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lgp/q0;

    goto :goto_e

    :pswitch_12
    sget-object v4, Lgp/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lgp/g0;

    goto :goto_e

    :pswitch_13
    sget-object v4, Lgp/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lgp/f0;

    goto :goto_e

    :pswitch_14
    sget-object v4, Lgp/s0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lgp/s0;

    goto :goto_e

    :pswitch_15
    sget-object v4, Lgp/b0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lgp/b0;

    goto :goto_e

    :pswitch_16
    sget-object v4, Lgp/p0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lgp/p0;

    goto/16 :goto_e

    :pswitch_17
    sget-object v4, Lgp/o;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lgp/o;

    goto/16 :goto_e

    :cond_2a
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lgp/d;

    invoke-direct/range {v4 .. v16}, Lgp/d;-><init>(Lgp/o;Lgp/p0;Lgp/b0;Lgp/s0;Lgp/f0;Lgp/g0;Lgp/q0;Lgp/h0;Lgp/p;Lgp/j0;Lgp/l0;Lgp/i0;)V

    return-object v4

    :pswitch_18
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_30

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v10, 0x1

    if-eq v4, v10, :cond_2f

    const/4 v10, 0x2

    if-eq v4, v10, :cond_2e

    const/4 v10, 0x3

    if-eq v4, v10, :cond_2d

    const/4 v10, 0x4

    if-eq v4, v10, :cond_2c

    const/4 v10, 0x5

    if-eq v4, v10, :cond_2b

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_f

    :cond_2b
    invoke-static {v0, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto :goto_f

    :cond_2c
    sget-object v4, Lgp/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lgp/n0;

    goto :goto_f

    :cond_2d
    sget-object v4, Lgp/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lgp/f;

    goto :goto_f

    :cond_2e
    sget-object v4, Lgp/m0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lgp/m0;

    goto :goto_f

    :cond_2f
    sget-object v4, Lgp/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lgp/d0;

    goto :goto_f

    :cond_30
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lgp/e;

    invoke-direct/range {v4 .. v9}, Lgp/e;-><init>(Lgp/d0;Lgp/m0;Lgp/f;Lgp/n0;Ljava/lang/String;)V

    return-object v4

    :pswitch_19
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_34

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_33

    const/4 v8, 0x2

    const/4 v9, 0x4

    if-eq v7, v8, :cond_32

    const/4 v8, 0x3

    if-eq v7, v8, :cond_31

    invoke-static {v0, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_10

    :cond_31
    invoke-static {v0, v6, v9}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-short v5, v5

    goto :goto_10

    :cond_32
    invoke-static {v0, v6, v9}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-short v4, v4

    goto :goto_10

    :cond_33
    invoke-static {v0, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_10

    :cond_34
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/e0;

    invoke-direct {v0, v3, v4, v5}, Lgp/e0;-><init>(ISS)V

    return-object v0

    :pswitch_1a
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_36

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_35

    invoke-static {v0, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_11

    :cond_35
    sget-object v3, Lgp/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_11

    :cond_36
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/d0;

    invoke-direct {v0, v3}, Lgp/d0;-><init>(Ljava/util/ArrayList;)V

    return-object v0

    :pswitch_1b
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    :try_start_2
    invoke-static {v0}, Lgp/c0;->b(Ljava/lang/String;)Lgp/c0;

    move-result-object v0
    :try_end_2
    .catch Lcom/google/android/gms/fido/fido2/api/common/zzbc; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_1c
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_38

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_37

    invoke-static {v0, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_12

    :cond_37
    invoke-static {v0, v4}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    goto :goto_12

    :cond_38
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/b0;

    invoke-direct {v0, v3}, Lgp/b0;-><init>(Z)V

    return-object v0

    :pswitch_1d
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    :try_start_3
    invoke-static {v0}, Lgp/c;->b(Ljava/lang/String;)Lgp/c;

    move-result-object v0
    :try_end_3
    .catch Lcom/google/android/gms/fido/fido2/api/common/AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException; {:try_start_3 .. :try_end_3} :catch_3

    return-object v0

    :catch_3
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_1e
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_3b

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_3a

    const/4 v7, 0x3

    if-eq v6, v7, :cond_39

    invoke-static {v0, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_13

    :cond_39
    invoke-static {v0, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_13

    :cond_3a
    invoke-static {v0, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_13

    :cond_3b
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/a0;

    invoke-direct {v0, v3, v4}, Lgp/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_1f
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    :try_start_4
    invoke-static {v0}, Lgp/z;->b(Ljava/lang/String;)Lgp/z;

    move-result-object v0
    :try_end_4
    .catch Lcom/google/android/gms/fido/fido2/api/common/TokenBinding$UnsupportedTokenBindingStatusException; {:try_start_4 .. :try_end_4} :catch_4

    return-object v0

    :catch_4
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_20
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_3d

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_3c

    invoke-static {v0, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_14

    :cond_3c
    invoke-static {v0, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_14

    :cond_3d
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/l0;

    invoke-direct {v0, v3}, Lgp/l0;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_21
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3e

    :try_start_5
    const-string v0, ""

    goto :goto_15

    :catch_5
    move-exception v0

    goto :goto_16

    :cond_3e
    :goto_15
    invoke-static {v0}, Lgp/y;->b(Ljava/lang/String;)Lgp/y;

    move-result-object v0
    :try_end_5
    .catch Lcom/google/android/gms/fido/fido2/api/common/ResidentKeyRequirement$UnsupportedResidentKeyRequirementException; {:try_start_5 .. :try_end_5} :catch_5

    return-object v0

    :goto_16
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_22
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_43

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x2

    if-eq v8, v9, :cond_42

    const/4 v9, 0x3

    if-eq v8, v9, :cond_41

    const/4 v9, 0x4

    if-eq v8, v9, :cond_40

    const/4 v9, 0x5

    if-eq v8, v9, :cond_3f

    invoke-static {v0, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_17

    :cond_3f
    invoke-static {v0, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_17

    :cond_40
    invoke-static {v0, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_17

    :cond_41
    invoke-static {v0, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_17

    :cond_42
    invoke-static {v0, v7}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_17

    :cond_43
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/w;

    invoke-direct {v0, v4, v5, v6, v3}, Lgp/w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object v0

    :pswitch_23
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    :try_start_6
    invoke-static {v0}, Lgp/v;->b(Ljava/lang/String;)Lgp/v;

    move-result-object v0
    :try_end_6
    .catch Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException; {:try_start_6 .. :try_end_6} :catch_6

    return-object v0

    :catch_6
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_24
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_47

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x2

    if-eq v7, v8, :cond_46

    const/4 v8, 0x3

    if-eq v7, v8, :cond_45

    const/4 v8, 0x4

    if-eq v7, v8, :cond_44

    invoke-static {v0, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_18

    :cond_44
    invoke-static {v0, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_18

    :cond_45
    invoke-static {v0, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_18

    :cond_46
    invoke-static {v0, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_18

    :cond_47
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/u;

    invoke-direct {v0, v3, v4, v5}, Lgp/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_25
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_19
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_4a

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_49

    const/4 v7, 0x3

    if-eq v6, v7, :cond_48

    invoke-static {v0, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_19

    :cond_48
    invoke-static {v0, v5}, Lvo/b;->z(Landroid/os/Parcel;I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_19

    :cond_49
    invoke-static {v0, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_19

    :cond_4a
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/t;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v3, v2}, Lgp/t;-><init>(Ljava/lang/String;I)V

    return-object v0

    :pswitch_26
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    :goto_1a
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_4e

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x2

    if-eq v7, v8, :cond_4d

    const/4 v8, 0x3

    if-eq v7, v8, :cond_4c

    const/4 v8, 0x4

    if-eq v7, v8, :cond_4b

    invoke-static {v0, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1a

    :cond_4b
    sget-object v5, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v6, v5}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v5

    goto :goto_1a

    :cond_4c
    invoke-static {v0, v6}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v4

    goto :goto_1a

    :cond_4d
    invoke-static {v0, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1a

    :cond_4e
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/s;

    invoke-direct {v0, v3, v4, v5}, Lgp/s;-><init>(Ljava/lang/String;[BLjava/util/ArrayList;)V

    return-object v0

    :pswitch_27
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    :goto_1b
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_4f

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_2

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1b

    :pswitch_28
    invoke-static {v0, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    goto :goto_1b

    :pswitch_29
    invoke-static {v0, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v12

    goto :goto_1b

    :pswitch_2a
    sget-object v4, Lgp/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lgp/e;

    goto :goto_1b

    :pswitch_2b
    sget-object v4, Lgp/i;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lgp/i;

    goto :goto_1b

    :pswitch_2c
    sget-object v4, Lgp/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lgp/g;

    goto :goto_1b

    :pswitch_2d
    sget-object v4, Lgp/h;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lgp/h;

    goto :goto_1b

    :pswitch_2e
    invoke-static {v0, v3}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v7

    goto :goto_1b

    :pswitch_2f
    invoke-static {v0, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1b

    :pswitch_30
    invoke-static {v0, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1b

    :cond_4f
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lgp/q;

    invoke-direct/range {v4 .. v12}, Lgp/q;-><init>(Ljava/lang/String;Ljava/lang/String;[BLgp/h;Lgp/g;Lgp/i;Lgp/e;Ljava/lang/String;)V

    return-object v4

    :pswitch_31
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_51

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v3, v4

    packed-switch v3, :pswitch_data_3

    invoke-static {v0, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1c

    :pswitch_32
    sget-object v3, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Landroid/os/ResultReceiver;

    goto :goto_1c

    :pswitch_33
    invoke-static {v0, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v16

    goto :goto_1c

    :pswitch_34
    sget-object v3, Lgp/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lgp/d;

    goto :goto_1c

    :pswitch_35
    invoke-static {v0, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v14

    goto :goto_1c

    :pswitch_36
    sget-object v3, Lgp/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lgp/a0;

    goto :goto_1c

    :pswitch_37
    invoke-static {v0, v4}, Lvo/b;->z(Landroid/os/Parcel;I)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_1c

    :pswitch_38
    sget-object v3, Lgp/k;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lgp/k;

    goto :goto_1c

    :pswitch_39
    sget-object v3, Lgp/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v10

    goto :goto_1c

    :pswitch_3a
    invoke-static {v0, v4}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result v3

    if-nez v3, :cond_50

    const/4 v9, 0x0

    goto :goto_1c

    :cond_50
    const/16 v4, 0x8

    invoke-static {v0, v3, v4}, Lvo/b;->H(Landroid/os/Parcel;II)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    move-object v9, v3

    goto :goto_1c

    :pswitch_3b
    sget-object v3, Lgp/t;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v8

    goto :goto_1c

    :pswitch_3c
    invoke-static {v0, v4}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v7

    goto :goto_1c

    :pswitch_3d
    sget-object v3, Lgp/w;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lgp/w;

    goto :goto_1c

    :pswitch_3e
    sget-object v3, Lgp/u;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lgp/u;

    goto/16 :goto_1c

    :cond_51
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lgp/r;

    invoke-direct/range {v4 .. v17}, Lgp/r;-><init>(Lgp/u;Lgp/w;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Lgp/k;Ljava/lang/Integer;Lgp/a0;Ljava/lang/String;Lgp/d;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_31
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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

    :pswitch_data_1
    .packed-switch 0x2
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
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgp/k0;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lgp/n;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lgp/q0;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lgp/p0;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lgp/o0;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lgp/l;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lgp/k;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lgp/i;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lgp/h;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lgp/g;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lgp/n0;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lgp/m0;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lgp/f;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lgp/d;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lgp/e;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lgp/e0;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lgp/d0;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lgp/c0;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lgp/b0;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lgp/c;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lgp/a0;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lgp/z;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lgp/l0;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lgp/y;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lgp/w;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lgp/v;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lgp/u;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lgp/t;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lgp/s;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lgp/q;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lgp/r;

    return-object p1

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
