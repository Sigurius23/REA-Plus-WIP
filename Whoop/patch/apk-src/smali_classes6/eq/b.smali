.class public final Leq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Leq/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Leq/b;->a:I

    const/4 v3, 0x2

    const-string v4, "Unknown storage: "

    sget-object v5, Lw7/b;->a:Lw7/b;

    const-string v6, "source"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "parcel"

    const/4 v10, 0x1

    packed-switch v2, :pswitch_data_0

    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    :goto_0
    move-object v3, v8

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    if-eq v5, v10, :cond_0

    invoke-static {v0, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_0
    invoke-static {v0, v4}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    new-array v6, v5, [[B

    move v9, v7

    :goto_2
    if-ge v9, v5, :cond_2

    invoke-virtual {v0}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v11

    aput-object v11, v6, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_2
    add-int/2addr v4, v3

    invoke-virtual {v0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    move-object v3, v6

    goto :goto_1

    :cond_3
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/j0;

    invoke-direct {v0, v3}, Lgp/j0;-><init>([[B)V

    return-object v0

    :pswitch_0
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    move-object v4, v8

    move-object v5, v4

    move-object v6, v5

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v9

    if-ge v9, v2, :cond_8

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    int-to-char v11, v9

    if-eq v11, v10, :cond_7

    if-eq v11, v3, :cond_6

    const/4 v12, 0x3

    if-eq v11, v12, :cond_5

    const/4 v12, 0x4

    if-eq v11, v12, :cond_4

    invoke-static {v0, v9}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_4
    invoke-static {v0, v9}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v7

    goto :goto_3

    :cond_5
    invoke-static {v0, v9}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v6

    goto :goto_3

    :cond_6
    invoke-static {v0, v9}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v5

    goto :goto_3

    :cond_7
    invoke-static {v0, v9}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v4

    goto :goto_3

    :cond_8
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/i0;

    if-nez v4, :cond_9

    move-object v2, v8

    goto :goto_4

    :cond_9
    array-length v2, v4

    invoke-static {v2, v4}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object v2

    :goto_4
    if-nez v5, :cond_a

    move-object v3, v8

    goto :goto_5

    :cond_a
    array-length v3, v5

    invoke-static {v3, v5}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object v3

    :goto_5
    if-nez v6, :cond_b

    goto :goto_6

    :cond_b
    array-length v4, v6

    invoke-static {v4, v6}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object v8

    :goto_6
    invoke-direct {v0, v2, v3, v8, v7}, Lgp/i0;-><init>(Lmp/t0;Lmp/t0;Lmp/t0;I)V

    return-object v0

    :pswitch_1
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_d

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v10, :cond_c

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_7

    :cond_c
    invoke-static {v0, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_7

    :cond_d
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/h0;

    invoke-direct {v0, v8}, Lgp/h0;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_2
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_f

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v10, :cond_e

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_8

    :cond_e
    invoke-static {v0, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_8

    :cond_f
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/p;

    invoke-direct {v0, v7}, Lgp/p;-><init>(Z)V

    return-object v0

    :pswitch_3
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_11

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v10, :cond_10

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_9

    :cond_10
    invoke-static {v0, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_9

    :cond_11
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/g0;

    invoke-direct {v0, v7}, Lgp/g0;-><init>(Z)V

    return-object v0

    :pswitch_4
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const-wide/16 v3, 0x0

    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_13

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    if-eq v6, v10, :cond_12

    invoke-static {v0, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_a

    :cond_12
    invoke-static {v0, v5}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v3

    goto :goto_a

    :cond_13
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/f0;

    invoke-direct {v0, v3, v4}, Lgp/f0;-><init>(J)V

    return-object v0

    :pswitch_5
    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_15

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    if-eq v4, v10, :cond_14

    invoke-static {v0, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_b

    :cond_14
    invoke-static {v0, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_b

    :cond_15
    invoke-static {v0, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/s0;

    invoke-direct {v0, v7}, Lgp/s0;-><init>(Z)V

    return-object v0

    :pswitch_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lgp/b;->b(Ljava/lang/String;)Lgp/b;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/fido/fido2/api/common/Attachment$UnsupportedAttachmentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_7
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lg20/u;

    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {v2, v0}, Lg20/u;-><init>(Ljava/lang/Throwable;)V

    return-object v2

    :pswitch_8
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lg20/t;->w:Lg20/t;

    return-object v0

    :pswitch_9
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lg20/s;->w:Lg20/s;

    return-object v0

    :pswitch_a
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_16

    move v5, v10

    goto :goto_c

    :cond_16
    move v5, v7

    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    move v9, v7

    :goto_d
    if-eq v9, v2, :cond_17

    invoke-static {v0, v6, v9, v10}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v9

    goto :goto_d

    :cond_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_18

    move v7, v10

    :cond_18
    const-class v2, Lg20/k;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Ly00/c8;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-nez v9, :cond_19

    :goto_e
    move-object v9, v8

    move-object v8, v2

    goto :goto_f

    :cond_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_e

    :goto_f
    new-instance v2, Lg20/k;

    invoke-direct/range {v2 .. v9}, Lg20/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLy00/c8;Ljava/lang/Integer;)V

    return-object v2

    :pswitch_b
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_1a

    move v6, v10

    goto :goto_10

    :cond_1a
    move v6, v7

    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    move v11, v7

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    move v3, v11

    :goto_11
    if-eq v3, v2, :cond_1b

    invoke-static {v0, v7, v3, v10}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v3

    goto :goto_11

    :cond_1b
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_1c

    move-object v2, v8

    move v8, v10

    goto :goto_12

    :cond_1c
    move-object v2, v8

    move v8, v11

    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_1d

    move-object v10, v2

    goto :goto_13

    :cond_1d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v10, v0

    :goto_13
    new-instance v3, Lg20/j;

    invoke-direct/range {v3 .. v10}, Lg20/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/LinkedHashSet;ZLjava/lang/String;Ljava/lang/Integer;)V

    return-object v3

    :pswitch_c
    move v11, v7

    move-object v2, v8

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_1e

    move v7, v10

    goto :goto_14

    :cond_1e
    move v7, v11

    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    move v4, v11

    :goto_15
    if-eq v4, v3, :cond_1f

    invoke-static {v0, v8, v4, v10}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v4

    goto :goto_15

    :cond_1f
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_20

    move v9, v10

    goto :goto_16

    :cond_20
    move v9, v11

    :goto_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_21

    move-object v11, v2

    goto :goto_17

    :cond_21
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v11, v0

    :goto_17
    new-instance v4, Lg20/i;

    invoke-direct/range {v4 .. v11}, Lg20/i;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/LinkedHashSet;ZLjava/lang/String;Ljava/lang/Integer;)V

    return-object v4

    :pswitch_d
    move v11, v7

    move-object v2, v8

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_22

    move v8, v10

    goto :goto_18

    :cond_22
    move v8, v11

    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    move v4, v11

    :goto_19
    if-eq v4, v3, :cond_23

    invoke-static {v0, v9, v4, v10}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v4

    goto :goto_19

    :cond_23
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_24

    goto :goto_1a

    :cond_24
    move v10, v11

    :goto_1a
    const-class v3, Lg20/h;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ly00/s;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_25

    move-object v12, v2

    goto :goto_1b

    :cond_25
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v12, v0

    :goto_1b
    new-instance v5, Lg20/h;

    invoke-direct/range {v5 .. v12}, Lg20/h;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLy00/s;Ljava/lang/Integer;)V

    return-object v5

    :pswitch_e
    move v11, v7

    move-object v2, v8

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_26

    move v8, v10

    goto :goto_1c

    :cond_26
    move v8, v11

    :goto_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    move v4, v11

    :goto_1d
    if-eq v4, v3, :cond_27

    invoke-static {v0, v9, v4, v10}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v4

    goto :goto_1d

    :cond_27
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_28

    goto :goto_1e

    :cond_28
    move v10, v11

    :goto_1e
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_29

    move-object v12, v2

    goto :goto_1f

    :cond_29
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v12, v0

    :goto_1f
    new-instance v6, Lg20/g;

    invoke-direct/range {v6 .. v12}, Lg20/g;-><init>(Ljava/lang/String;ZLjava/util/LinkedHashSet;ZLjava/lang/String;Ljava/lang/Integer;)V

    return-object v6

    :pswitch_f
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lg20/c;

    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {v2, v0}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    return-object v2

    :pswitch_10
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lg20/b;

    const-class v3, Lg20/b;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ly00/c8;

    invoke-direct {v2, v0}, Lg20/b;-><init>(Ly00/c8;)V

    return-object v2

    :pswitch_11
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lg20/a;->w:Lg20/a;

    return-object v0

    :pswitch_12
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lg10/b;

    const-class v3, Lg10/b;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ly00/d5;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ly00/u5;

    invoke-direct {v2, v4, v0}, Lg10/b;-><init>(Ly00/d5;Ly00/u5;)V

    return-object v2

    :pswitch_13
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lfy/d;->w:Lfy/d;

    return-object v0

    :pswitch_14
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lfy/c;

    sget-object v3, Ly00/c3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/c3;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lfy/c;-><init>(Ly00/c3;Ljava/lang/String;Ljava/util/List;)V

    return-object v2

    :pswitch_15
    move-object v2, v8

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_2b

    if-ne v3, v10, :cond_2a

    new-instance v2, Ld8/a;

    const/16 v3, 0xa

    invoke-direct {v2, v10, v3}, Ld8/a;-><init>(II)V

    invoke-virtual {v5, v0, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lw7/a;

    goto :goto_20

    :cond_2a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v3, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    invoke-virtual {v0}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    if-nez v0, :cond_2c

    move-object v8, v2

    goto :goto_20

    :cond_2c
    invoke-static {v0}, Landroidx/health/platform/client/proto/t2;->q([B)Landroidx/health/platform/client/proto/t2;

    move-result-object v0

    new-instance v8, Lf8/d;

    invoke-direct {v8, v0}, Lf8/d;-><init>(Landroidx/health/platform/client/proto/t2;)V

    :goto_20
    return-object v8

    :pswitch_16
    move-object v2, v8

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_2e

    if-ne v3, v10, :cond_2d

    new-instance v2, Ld8/a;

    const/16 v3, 0x9

    invoke-direct {v2, v10, v3}, Ld8/a;-><init>(II)V

    invoke-virtual {v5, v0, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lw7/a;

    goto :goto_21

    :cond_2d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v3, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    invoke-virtual {v0}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    if-nez v0, :cond_2f

    move-object v8, v2

    goto :goto_21

    :cond_2f
    invoke-static {v0}, Landroidx/health/platform/client/proto/s2;->s([B)Landroidx/health/platform/client/proto/s2;

    move-result-object v0

    new-instance v8, Lf8/c;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s2;->q()Landroidx/health/platform/client/proto/w0;

    move-result-object v0

    const-string v2, "proto.dataPointUidList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v0}, Lf8/c;-><init>(Landroidx/health/platform/client/proto/w0;)V

    :goto_21
    return-object v8

    :pswitch_17
    move-object v2, v8

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_31

    if-ne v3, v10, :cond_30

    new-instance v2, Ld8/a;

    const/16 v3, 0x8

    invoke-direct {v2, v10, v3}, Ld8/a;-><init>(II)V

    invoke-virtual {v5, v0, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lw7/a;

    goto :goto_22

    :cond_30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v3, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    invoke-virtual {v0}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    if-nez v0, :cond_32

    move-object v8, v2

    goto :goto_22

    :cond_32
    invoke-static {v0}, Landroidx/health/platform/client/proto/q2;->q([B)Landroidx/health/platform/client/proto/q2;

    move-result-object v0

    new-instance v8, Lf8/b;

    invoke-direct {v8, v0}, Lf8/b;-><init>(Landroidx/health/platform/client/proto/q2;)V

    :goto_22
    return-object v8

    :pswitch_18
    move-object v2, v8

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_34

    if-ne v3, v10, :cond_33

    new-instance v2, Ld8/a;

    const/4 v3, 0x7

    invoke-direct {v2, v10, v3}, Ld8/a;-><init>(II)V

    invoke-virtual {v5, v0, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lw7/a;

    goto :goto_23

    :cond_33
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v3, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    invoke-virtual {v0}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    if-nez v0, :cond_35

    move-object v8, v2

    goto :goto_23

    :cond_35
    invoke-static {v0}, Landroidx/health/platform/client/proto/p2;->t([B)Landroidx/health/platform/client/proto/p2;

    move-result-object v0

    new-instance v8, Lf8/a;

    invoke-direct {v8, v0}, Lf8/a;-><init>(Landroidx/health/platform/client/proto/p2;)V

    :goto_23
    return-object v8

    :pswitch_19
    move-object v2, v8

    new-instance v3, Lf/d;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    sget v4, Lf/c;->g:I

    if-nez v0, :cond_36

    move-object v8, v2

    goto :goto_24

    :cond_36
    sget-object v2, Lf/b;->e:Ljava/lang/String;

    invoke-interface {v0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    if-eqz v2, :cond_37

    instance-of v4, v2, Lf/b;

    if-eqz v4, :cond_37

    move-object v8, v2

    check-cast v8, Lf/b;

    goto :goto_24

    :cond_37
    new-instance v8, Lf/a;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v0, v8, Lf/a;->f:Landroid/os/IBinder;

    :goto_24
    iput-object v8, v3, Lf/d;->w:Lf/b;

    return-object v3

    :pswitch_1a
    move v11, v7

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move v2, v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    move v5, v11

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v5

    :goto_25
    if-eq v6, v4, :cond_38

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_25

    :cond_38
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v5

    :goto_26
    if-eq v6, v4, :cond_39

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_26

    :cond_39
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v5

    :goto_27
    if-eq v6, v4, :cond_3a

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_27

    :cond_3a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v5

    :goto_28
    if-eq v7, v4, :cond_3b

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_28

    :cond_3b
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_3c

    move/from16 v17, v2

    goto :goto_29

    :cond_3c
    move/from16 v17, v5

    :goto_29
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_3d

    move/from16 v18, v2

    goto :goto_2a

    :cond_3d
    move/from16 v18, v5

    :goto_2a
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Name is null"

    if-eqz v4, :cond_43

    const-string v7, "MAP"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3e

    move/from16 v19, v2

    goto :goto_2b

    :cond_3e
    const-string v7, "VIEWPORT"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_42

    move/from16 v19, v3

    :goto_2b
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v20

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v24

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v26

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v28

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v29

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_41

    const-string v5, "SEA"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3f

    move/from16 v30, v2

    goto :goto_2c

    :cond_3f
    const-string v2, "GROUND"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_40

    move/from16 v30, v3

    :goto_2c
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v32

    new-instance v9, Lev/d;

    move-object/from16 v16, v6

    invoke-direct/range {v9 .. v32}, Lev/d;-><init>(Ljava/lang/String;Ljava/util/List;FLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZIFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    return-object v9

    :cond_40
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "No enum constant com.mapbox.maps.plugin.ModelElevationReference."

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_41
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "No enum constant com.mapbox.maps.plugin.ModelScaleMode."

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1b
    move-object v2, v8

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lev/c;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_44

    move-object v3, v2

    goto :goto_2d

    :cond_44
    sget-object v3, Lcom/mapbox/maps/ImageHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_2d
    move-object v7, v3

    check-cast v7, Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_45

    move-object v3, v2

    goto :goto_2e

    :cond_45
    sget-object v3, Lcom/mapbox/maps/ImageHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_2e
    move-object v8, v3

    check-cast v8, Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_46

    goto :goto_2f

    :cond_46
    sget-object v2, Lcom/mapbox/maps/ImageHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_2f
    move-object v9, v2

    check-cast v9, Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v11

    invoke-direct/range {v6 .. v11}, Lev/c;-><init>(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;F)V

    return-object v6

    :pswitch_1c
    move v5, v7

    move-object v2, v8

    invoke-static {v0}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v3

    move-object v4, v2

    move-object v6, v4

    move-object v8, v6

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    :goto_30
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v12

    if-ge v12, v3, :cond_47

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v12

    int-to-char v13, v12

    packed-switch v13, :pswitch_data_1

    invoke-static {v0, v12}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_30

    :pswitch_1d
    invoke-static {v0, v12}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_30

    :pswitch_1e
    invoke-static {v0, v12}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto :goto_30

    :pswitch_1f
    invoke-static {v0, v12}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto :goto_30

    :pswitch_20
    invoke-static {v0, v12}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_30

    :pswitch_21
    invoke-static {v0, v12}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_30

    :pswitch_22
    invoke-static {v0, v12}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_30

    :pswitch_23
    invoke-static {v0, v12}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v5

    goto :goto_30

    :pswitch_24
    invoke-static {v0, v12}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v7

    goto :goto_30

    :pswitch_25
    invoke-static {v0, v12}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_30

    :cond_47
    invoke-static {v0, v3}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Leq/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v8, v0, Leq/a;->w:Ljava/lang/String;

    iput v7, v0, Leq/a;->x:I

    iput-boolean v5, v0, Leq/a;->y:Z

    iput-object v2, v0, Leq/a;->z:Ljava/lang/String;

    iput-object v4, v0, Leq/a;->E:Ljava/lang/String;

    iput-object v6, v0, Leq/a;->F:Ljava/lang/String;

    iput-object v9, v0, Leq/a;->G:Ljava/lang/String;

    iput-object v10, v0, Leq/a;->H:Ljava/lang/String;

    iput-object v11, v0, Leq/a;->I:Ljava/lang/String;

    return-object v0

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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Leq/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lgp/j0;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lgp/i0;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lgp/h0;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lgp/p;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lgp/g0;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lgp/f0;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lgp/s0;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lgp/b;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lg20/u;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lg20/t;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lg20/s;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lg20/k;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lg20/j;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lg20/i;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lg20/h;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lg20/g;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lg20/c;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lg20/b;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lg20/a;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lg10/b;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lfy/d;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lfy/c;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lf8/d;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lf8/c;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lf8/b;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lf8/a;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lf/d;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lev/d;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lev/c;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Leq/a;

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
