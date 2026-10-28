.class public final Landroidx/fragment/app/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/fragment/app/q1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Luo/g;Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    iget v1, p0, Luo/g;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x4

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget v1, p0, Luo/g;->x:I

    const/4 v2, 0x2

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget v1, p0, Luo/g;->y:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Luo/g;->z:Ljava/lang/String;

    invoke-static {p1, v3, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Luo/g;->E:Landroid/os/IBinder;

    invoke-static {p1, v1, v2}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    const/4 v1, 0x6

    iget-object v2, p0, Luo/g;->F:[Lcom/google/android/gms/common/api/Scope;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/4 v1, 0x7

    iget-object v2, p0, Luo/g;->G:Landroid/os/Bundle;

    invoke-static {p1, v1, v2}, Lvo/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    const/16 v1, 0x8

    iget-object v2, p0, Luo/g;->H:Landroid/accounts/Account;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xa

    iget-object v2, p0, Luo/g;->I:[Lcom/google/android/gms/common/c;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/16 v1, 0xb

    iget-object v2, p0, Luo/g;->J:[Lcom/google/android/gms/common/c;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Luo/g;->K:Z

    const/16 v1, 0xc

    invoke-static {p1, v1, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Luo/g;->L:I

    const/16 v1, 0xd

    invoke-static {p1, v1, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Luo/g;->M:Z

    const/16 v1, 0xe

    invoke-static {p1, v1, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0xf

    iget-object p0, p0, Luo/g;->N:Ljava/lang/String;

    invoke-static {p1, p2, p0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Landroidx/fragment/app/q1;->a:I

    packed-switch v2, :pswitch_data_0

    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    sget-object v4, Luo/g;->O:[Lcom/google/android/gms/common/api/Scope;

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Luo/g;->P:[Lcom/google/android/gms/common/c;

    move-object v15, v3

    move-object v14, v4

    move-object v12, v5

    move-object v13, v12

    move-object/from16 v16, v13

    move-object/from16 v22, v16

    move v9, v6

    move v10, v9

    move v11, v10

    move/from16 v19, v11

    move/from16 v20, v19

    move/from16 v21, v20

    move-object/from16 v17, v7

    move-object/from16 v18, v17

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_0

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    :pswitch_0
    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_1
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v22

    goto :goto_0

    :pswitch_2
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v21

    goto :goto_0

    :pswitch_3
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v20

    goto :goto_0

    :pswitch_4
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v19

    goto :goto_0

    :pswitch_5
    sget-object v4, Lcom/google/android/gms/common/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, [Lcom/google/android/gms/common/c;

    goto :goto_0

    :pswitch_6
    sget-object v4, Lcom/google/android/gms/common/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, [Lcom/google/android/gms/common/c;

    goto :goto_0

    :pswitch_7
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Landroid/accounts/Account;

    goto :goto_0

    :pswitch_8
    invoke-static {v1, v3}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v15

    goto :goto_0

    :pswitch_9
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, [Lcom/google/android/gms/common/api/Scope;

    goto :goto_0

    :pswitch_a
    invoke-static {v1, v3}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v13

    goto :goto_0

    :pswitch_b
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    :pswitch_c
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v11

    goto :goto_0

    :pswitch_d
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v10

    goto :goto_0

    :pswitch_e
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v9

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v8, Luo/g;

    invoke-direct/range {v8 .. v22}, Luo/g;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/c;[Lcom/google/android/gms/common/c;ZIZLjava/lang/String;)V

    return-object v8

    :pswitch_f
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move v6, v4

    move-object v4, v5

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_4

    const/4 v9, 0x2

    if-eq v8, v9, :cond_3

    const/4 v9, 0x3

    if-eq v8, v9, :cond_2

    const/4 v9, 0x4

    if-eq v8, v9, :cond_1

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_1
    sget-object v5, Luo/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Luo/f;

    goto :goto_1

    :cond_2
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_1

    :cond_3
    sget-object v4, Lcom/google/android/gms/common/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v4}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lcom/google/android/gms/common/c;

    goto :goto_1

    :cond_4
    invoke-static {v1, v7}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_1

    :cond_5
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Luo/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Luo/d0;->w:Landroid/os/Bundle;

    iput-object v4, v1, Luo/d0;->x:[Lcom/google/android/gms/common/c;

    iput v6, v1, Luo/d0;->y:I

    iput-object v5, v1, Luo/d0;->z:Luo/f;

    return-object v1

    :pswitch_10
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move v5, v3

    move v6, v5

    move v7, v6

    move v8, v7

    move v9, v8

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_b

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v10, 0x1

    if-eq v4, v10, :cond_a

    const/4 v10, 0x2

    if-eq v4, v10, :cond_9

    const/4 v10, 0x3

    if-eq v4, v10, :cond_8

    const/4 v10, 0x4

    if-eq v4, v10, :cond_7

    const/4 v10, 0x5

    if-eq v4, v10, :cond_6

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_6
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v9

    goto :goto_2

    :cond_7
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v8

    goto :goto_2

    :cond_8
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_2

    :cond_9
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v6

    goto :goto_2

    :cond_a
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_2

    :cond_b
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Luo/l;

    invoke-direct/range {v4 .. v9}, Luo/l;-><init>(IZZII)V

    return-object v4

    :pswitch_11
    new-instance v2, Lqi/f;

    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lqi/f;->w:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    iput v3, v2, Lqi/f;->y:F

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_c

    goto :goto_3

    :cond_c
    const/4 v4, 0x0

    :goto_3
    iput-boolean v4, v2, Lqi/f;->z:Z

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lqi/f;->E:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, Lqi/f;->F:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Lqi/f;->G:I

    return-object v2

    :pswitch_12
    new-instance v2, Lnd3/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    iput-object v1, v2, Lnd3/a;->w:[B

    return-object v2

    :pswitch_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v3, :cond_d

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_d
    new-instance v1, Lkh/a;

    invoke-direct {v1, v2, v4}, Lkh/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v1

    :pswitch_14
    const-string v2, "inParcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Leb/r;

    invoke-direct {v2, v1}, Leb/r;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_15
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const-wide/16 v3, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_11

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_10

    const/4 v9, 0x2

    if-eq v8, v9, :cond_f

    const/4 v9, 0x3

    if-eq v8, v9, :cond_e

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_5

    :cond_e
    invoke-static {v1, v7}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v3

    goto :goto_5

    :cond_f
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_5

    :cond_10
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_11
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/common/c;

    invoke-direct {v1, v6, v5, v3, v4}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;IJ)V

    return-object v1

    :pswitch_16
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    move-object v4, v3

    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_16

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_15

    const/4 v9, 0x2

    if-eq v8, v9, :cond_14

    const/4 v9, 0x3

    if-eq v8, v9, :cond_13

    const/4 v9, 0x4

    if-eq v8, v9, :cond_12

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_6

    :cond_12
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_13
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    goto :goto_6

    :cond_14
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_6

    :cond_15
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_6

    :cond_16
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/common/a;

    invoke-direct {v1, v5, v6, v3, v4}, Lcom/google/android/gms/common/a;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    return-object v1

    :pswitch_17
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move v6, v4

    move-object v4, v5

    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_1b

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_1a

    const/4 v9, 0x2

    if-eq v8, v9, :cond_19

    const/4 v9, 0x3

    if-eq v8, v9, :cond_18

    const/4 v9, 0x4

    if-eq v8, v9, :cond_17

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_7

    :cond_17
    sget-object v5, Lcom/google/android/gms/common/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/common/a;

    goto :goto_7

    :cond_18
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/app/PendingIntent;

    goto :goto_7

    :cond_19
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_1a
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_7

    :cond_1b
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, v6, v3, v4, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    return-object v1

    :pswitch_18
    new-instance v2, Landroidx/fragment/app/x1;

    invoke-direct {v2, v1}, Landroidx/fragment/app/x1;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_19
    new-instance v2, Landroidx/fragment/app/r1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    iput-object v3, v2, Landroidx/fragment/app/r1;->E:Ljava/lang/String;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Landroidx/fragment/app/r1;->F:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Landroidx/fragment/app/r1;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/r1;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/r1;->x:Ljava/util/ArrayList;

    sget-object v3, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Landroidx/fragment/app/b;

    iput-object v3, v2, Landroidx/fragment/app/r1;->y:[Landroidx/fragment/app/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v2, Landroidx/fragment/app/r1;->z:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/r1;->E:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/r1;->F:Ljava/util/ArrayList;

    sget-object v3, Landroidx/fragment/app/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Landroidx/fragment/app/r1;->G:Ljava/util/ArrayList;

    sget-object v3, Landroidx/fragment/app/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v2, Landroidx/fragment/app/r1;->H:Ljava/util/ArrayList;

    return-object v2

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
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/fragment/app/q1;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Luo/g;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Luo/d0;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Luo/l;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lqi/f;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lnd3/a;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lkh/a;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Leb/r;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lcom/google/android/gms/common/c;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lcom/google/android/gms/common/a;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lcom/google/android/gms/common/api/Status;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Landroidx/fragment/app/x1;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Landroidx/fragment/app/r1;

    return-object p1

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
