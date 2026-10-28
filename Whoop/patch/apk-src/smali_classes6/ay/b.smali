.class public final Lay/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lay/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lay/b;->a:I

    packed-switch v2, :pswitch_data_0

    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_1

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_0

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v4}, Lvo/b;->j(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/r;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Ldq/r;->w:Ljava/util/ArrayList;

    return-object v1

    :pswitch_0
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v4

    move-object v6, v5

    move v4, v3

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_6

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x2

    if-eq v8, v9, :cond_5

    const/4 v9, 0x3

    if-eq v8, v9, :cond_4

    const/4 v9, 0x4

    if-eq v8, v9, :cond_3

    const/4 v9, 0x5

    if-eq v8, v9, :cond_2

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_1

    :cond_3
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_1

    :cond_4
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_5
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_6
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/w;

    invoke-direct {v1, v5, v6, v3, v4}, Ldq/w;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-object v1

    :pswitch_1
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_9

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_8

    const/4 v7, 0x3

    if-eq v6, v7, :cond_7

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_7
    invoke-static {v1, v5}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_2

    :cond_8
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_2

    :cond_9
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/o;

    invoke-direct {v1, v4, v3}, Ldq/o;-><init>(ILandroid/os/Bundle;)V

    return-object v1

    :pswitch_2
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_c

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_b

    const/4 v7, 0x3

    if-eq v6, v7, :cond_a

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_a
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_b
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_3

    :cond_c
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v4, v1, Ldq/n;->w:I

    iput-object v3, v1, Ldq/n;->x:Ljava/lang/String;

    return-object v1

    :pswitch_3
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v6, v3

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move v11, v4

    move v12, v5

    move v13, v12

    move v14, v13

    move-object v4, v10

    move-object v5, v4

    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v15

    if-ge v15, v2, :cond_d

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    int-to-char v0, v15

    packed-switch v0, :pswitch_data_1

    invoke-static {v1, v15}, Lvo/b;->E(Landroid/os/Parcel;I)V

    :goto_5
    move-object/from16 v0, p0

    goto :goto_4

    :pswitch_4
    invoke-static {v1, v15}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v9

    goto :goto_5

    :pswitch_5
    invoke-static {v1, v15}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v10

    goto :goto_5

    :pswitch_6
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :pswitch_7
    invoke-static {v1, v15}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v11

    goto :goto_5

    :pswitch_8
    sget-object v0, Ldq/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v15, v0}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ldq/s;

    goto :goto_5

    :pswitch_9
    sget-object v0, Ldq/o;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v15, v0}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ldq/o;

    goto :goto_5

    :pswitch_a
    invoke-static {v1, v15}, Lvo/b;->f(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    move-result-object v5

    goto :goto_5

    :pswitch_b
    sget-object v0, Ldq/r;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v15, v0}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ldq/r;

    goto :goto_5

    :pswitch_c
    invoke-static {v1, v15}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v14

    goto :goto_5

    :pswitch_d
    sget-object v0, Ldq/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v15, v0}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ldq/c;

    goto :goto_5

    :pswitch_e
    invoke-static {v1, v15}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v13

    goto :goto_5

    :pswitch_f
    invoke-static {v1, v15}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v12

    goto :goto_5

    :cond_d
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Ldq/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v12, v0, Ldq/m;->w:Z

    iput-boolean v13, v0, Ldq/m;->x:Z

    iput-object v3, v0, Ldq/m;->y:Ldq/c;

    iput-boolean v14, v0, Ldq/m;->z:Z

    iput-object v4, v0, Ldq/m;->E:Ldq/r;

    iput-object v5, v0, Ldq/m;->F:Ljava/util/ArrayList;

    iput-object v6, v0, Ldq/m;->G:Ldq/o;

    iput-object v7, v0, Ldq/m;->H:Ldq/s;

    iput-boolean v11, v0, Ldq/m;->I:Z

    iput-object v8, v0, Ldq/m;->J:Ljava/lang/String;

    iput-object v9, v0, Ldq/m;->K:[B

    iput-object v10, v0, Ldq/m;->L:Landroid/os/Bundle;

    return-object v0

    :pswitch_10
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v10

    if-ge v10, v0, :cond_e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    int-to-char v11, v10

    packed-switch v11, :pswitch_data_2

    invoke-static {v1, v10}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_6

    :pswitch_11
    invoke-static {v1, v10}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v9

    goto :goto_6

    :pswitch_12
    invoke-static {v1, v10}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_6

    :pswitch_13
    invoke-static {v1, v10}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v7

    goto :goto_6

    :pswitch_14
    invoke-static {v1, v10}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :pswitch_15
    sget-object v5, Ldq/n;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v10, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ldq/n;

    goto :goto_6

    :pswitch_16
    sget-object v4, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v10, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/identity/intents/model/UserAddress;

    goto :goto_6

    :pswitch_17
    sget-object v3, Ldq/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v10, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Ldq/b;

    goto :goto_6

    :pswitch_18
    invoke-static {v1, v10}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_e
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Ldq/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Ldq/l;->w:Ljava/lang/String;

    iput-object v3, v0, Ldq/l;->x:Ldq/b;

    iput-object v4, v0, Ldq/l;->y:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object v5, v0, Ldq/l;->z:Ldq/n;

    iput-object v6, v0, Ldq/l;->E:Ljava/lang/String;

    iput-object v7, v0, Ldq/l;->F:Landroid/os/Bundle;

    iput-object v8, v0, Ldq/l;->G:Ljava/lang/String;

    iput-object v9, v0, Ldq/l;->H:Landroid/os/Bundle;

    return-object v0

    :pswitch_19
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {v0, v1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_1a
    const-string v0, "source"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_10

    const/4 v2, 0x1

    if-ne v0, v2, :cond_f

    new-instance v0, Ld8/a;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Ld8/a;-><init>(II)V

    sget-object v2, Lw7/b;->a:Lw7/b;

    invoke-virtual {v2, v1, v0}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/a;

    goto :goto_7

    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unknown storage: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    goto :goto_7

    :cond_11
    invoke-static {v0}, Landroidx/health/platform/client/proto/w1;->s([B)Landroidx/health/platform/client/proto/w1;

    move-result-object v0

    new-instance v1, Landroidx/health/platform/client/permission/Permission;

    invoke-direct {v1, v0}, Landroidx/health/platform/client/permission/Permission;-><init>(Landroidx/health/platform/client/proto/w1;)V

    move-object v0, v1

    :goto_7
    return-object v0

    :pswitch_1b
    new-instance v0, Ld50/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Ld50/f;->w:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Ld50/f;->x:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ld50/f;->y:I

    return-object v0

    :pswitch_1c
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ld20/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lq30/q0;

    sget-object v2, Lux/r;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lux/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ly00/c8;

    sget-object v2, Ly00/v7;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ly00/v7;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lyy/f;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_12

    move v9, v3

    goto :goto_8

    :cond_12
    move v9, v2

    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_13

    const/4 v0, 0x0

    :goto_9
    move-object v10, v0

    goto :goto_a

    :cond_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_9

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v12, Ljava/util/LinkedHashSet;

    invoke-direct {v12, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    :goto_b
    if-eq v2, v0, :cond_14

    invoke-static {v1, v12, v2, v3}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v2

    goto :goto_b

    :cond_14
    new-instance v3, Ld20/l;

    invoke-direct/range {v3 .. v12}, Ld20/l;-><init>(Lq30/q0;Lux/r;Ly00/c8;Ly00/v7;Lyy/f;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)V

    return-object v3

    :pswitch_1d
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld00/m;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Ld00/m;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ld00/k;

    invoke-direct {v0, v2, v1}, Ld00/m;-><init>(Ljava/lang/String;Ld00/k;)V

    return-object v0

    :pswitch_1e
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld00/l;

    const-class v2, Ld00/l;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/model/ConsumerSession;

    move-object v4, v2

    move-object v2, v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_15

    const/4 v5, 0x0

    goto :goto_c

    :cond_15
    sget-object v5, Ld00/m;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    :goto_c
    check-cast v5, Ld00/m;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_16

    const/4 v1, 0x1

    :goto_d
    move v6, v1

    move-object v1, v0

    goto :goto_e

    :cond_16
    const/4 v1, 0x0

    goto :goto_d

    :goto_e
    invoke-direct/range {v1 .. v6}, Ld00/l;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Z)V

    return-object v1

    :pswitch_1f
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcz/y0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {v0, v1}, Lcz/y0;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_20
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcz/x0;

    const-class v2, Lcz/x0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lq20/y;

    invoke-direct {v0, v1}, Lcz/x0;-><init>(Lq20/y;)V

    return-object v0

    :pswitch_21
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcz/g;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcz/h;->valueOf(Ljava/lang/String;)Lcz/h;

    move-result-object v2

    sget-object v3, Lcz/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcz/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_17

    const/4 v1, 0x0

    goto :goto_f

    :cond_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_f
    invoke-direct {v0, v2, v3, v1}, Lcz/g;-><init>(Lcz/h;Lcz/b;Ljava/lang/Integer;)V

    return-object v0

    :pswitch_22
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh20/h1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lh20/h1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_18

    move v0, v3

    move v3, v4

    move v5, v3

    goto :goto_10

    :cond_18
    move v0, v3

    move v5, v4

    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lh20/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh20/i1;

    sget-object v7, Lh20/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v7, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh20/l1;

    move v8, v5

    move-object v5, v6

    move-object v6, v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    move v10, v8

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    move v11, v0

    :goto_11
    if-eq v11, v9, :cond_19

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_11

    :cond_19
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_1a

    move v9, v10

    move v11, v9

    goto :goto_12

    :cond_1a
    move v9, v0

    move v11, v10

    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v10

    const-class v12, Lcz/b;

    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    invoke-virtual {v1, v12}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v12

    check-cast v12, Lh20/t1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1b

    move v0, v11

    :cond_1b
    new-instance v1, Lcz/b;

    move-object v11, v12

    move v12, v0

    invoke-direct/range {v1 .. v12}, Lcz/b;-><init>(Lh20/h1;ZLjava/lang/String;Lh20/i1;Lh20/l1;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Lh20/t1;Z)V

    return-object v1

    :pswitch_23
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/q;->b(II)Lcom/google/android/material/datepicker/q;

    move-result-object v0

    return-object v0

    :pswitch_24
    new-instance v0, Lcom/google/android/material/datepicker/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/d;-><init>(J)V

    return-object v0

    :pswitch_25
    const-class v0, Lcom/google/android/material/datepicker/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/google/android/material/datepicker/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/google/android/material/datepicker/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/android/material/datepicker/q;

    const-class v0, Lcom/google/android/material/datepicker/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/material/datepicker/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    new-instance v3, Lcom/google/android/material/datepicker/b;

    invoke-direct/range {v3 .. v8}, Lcom/google/android/material/datepicker/b;-><init>(Lcom/google/android/material/datepicker/q;Lcom/google/android/material/datepicker/q;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/q;I)V

    return-object v3

    :pswitch_26
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_1e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1d

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1c

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_13

    :cond_1c
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    :cond_1d
    invoke-static {v1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_13

    :cond_1e
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    return-object v0

    :pswitch_27
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_1f

    move-object v0, v3

    goto :goto_14

    :cond_1f
    sget-object v0, Lh20/c2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_14
    check-cast v0, Lh20/c2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_20

    move-object v4, v3

    goto :goto_15

    :cond_20
    sget-object v4, Lh20/h2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    :goto_15
    check-cast v4, Lh20/h2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_21

    goto :goto_16

    :cond_21
    sget-object v3, Lh20/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_16
    move-object v5, v3

    check-cast v5, Lh20/i1;

    const-class v3, Lc10/n;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v6

    check-cast v6, Li20/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_22

    const/4 v7, 0x1

    goto :goto_17

    :cond_22
    move v7, v8

    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-eqz v10, :cond_23

    move v10, v8

    const/4 v8, 0x1

    goto :goto_18

    :cond_23
    move v10, v8

    :goto_18
    sget-object v11, Lh20/h1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v11, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lh20/h1;

    move v12, v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    sget-object v13, Lh20/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v13, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lh20/l1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    move v15, v12

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    :goto_19
    if-eq v15, v14, :cond_24

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    goto :goto_19

    :cond_24
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_25

    move-object v9, v11

    move-object v11, v13

    const/4 v13, 0x1

    goto :goto_1a

    :cond_25
    move-object v9, v11

    move-object v11, v13

    const/4 v13, 0x0

    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v14

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v15

    move-object/from16 v17, v0

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lh20/t1;

    move-object/from16 v19, v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move-object/from16 v20, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v21, v3

    const/4 v3, 0x0

    :goto_1b
    if-eq v3, v0, :cond_26

    move/from16 v22, v0

    sget-object v0, Lh20/u1;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v23, v4

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v3

    move/from16 v0, v22

    move-object/from16 v4, v23

    goto :goto_1b

    :cond_26
    move-object/from16 v23, v4

    const/4 v4, 0x1

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_1c
    if-eq v4, v0, :cond_27

    move/from16 v22, v0

    sget-object v0, Lh20/y1;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v24, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v3, v4, v2}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v4

    move/from16 v0, v22

    move-object/from16 v2, v24

    goto :goto_1c

    :cond_27
    move-object/from16 v24, v2

    const/4 v2, 0x1

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_28

    move-object/from16 v0, v19

    move/from16 v19, v2

    goto :goto_1d

    :cond_28
    move-object/from16 v0, v19

    const/16 v19, 0x0

    :goto_1d
    sget-object v4, Lh20/w2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh20/w2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lc10/o;->valueOf(Ljava/lang/String;)Lc10/o;

    move-result-object v18

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    move-object/from16 v25, v0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object/from16 v26, v3

    const/4 v3, 0x0

    :goto_1e
    if-eq v3, v2, :cond_29

    move/from16 v27, v2

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v28

    move/from16 v29, v3

    invoke-static/range {v28 .. v28}, Lh20/i3;->valueOf(Ljava/lang/String;)Lh20/i3;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v29, 0x1

    move/from16 v2, v27

    goto :goto_1e

    :cond_29
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_2a

    const/16 v16, 0x1

    :goto_1f
    move-object/from16 v3, v17

    move-object/from16 v17, v24

    goto :goto_20

    :cond_2a
    const/16 v16, 0x0

    goto :goto_1f

    :goto_20
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v24

    new-instance v1, Lc10/n;

    move-object/from16 v22, v0

    move-object/from16 v21, v18

    move-object/from16 v2, v20

    move-object/from16 v18, v26

    move-object/from16 v20, v4

    move-object/from16 v4, v23

    move/from16 v23, v16

    move-object/from16 v16, v25

    invoke-direct/range {v1 .. v24}, Lc10/n;-><init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/i1;Li20/b;ZZLh20/h1;Ljava/lang/String;Lh20/l1;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;Lh20/t1;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLh20/w2;Lc10/o;Ljava/util/LinkedHashMap;ZLjava/lang/String;)V

    return-object v1

    :pswitch_28
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc10/l;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc10/l;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_29
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lc10/k;->w:Lc10/k;

    return-object v0

    :pswitch_2a
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lc10/j;->w:Lc10/j;

    return-object v0

    :pswitch_2b
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laz/a;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Laz/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_2c
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lay/t;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    const-class v4, Lay/t;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/c8;

    invoke-direct {v0, v2, v3, v1}, Lay/t;-><init>(Ljava/lang/String;Ljava/util/List;Ly00/c8;)V

    return-object v0

    :pswitch_2d
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lay/r;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay/r;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_2e
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lay/q;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {v0, v1}, Lay/q;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_2f
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lay/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay/d;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_30
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lay/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lay/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
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
        :pswitch_10
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
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
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lay/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Ldq/r;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Ldq/w;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Ldq/o;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ldq/n;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ldq/m;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Ldq/l;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Landroidx/health/platform/client/permission/Permission;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Ld50/f;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Ld20/l;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Ld00/m;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Ld00/l;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lcz/y0;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lcz/x0;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lcz/g;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lcz/b;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lcom/google/android/material/datepicker/q;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lcom/google/android/material/datepicker/d;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lcom/google/android/material/datepicker/b;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lcom/google/android/gms/common/api/Scope;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lc10/n;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lc10/l;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lc10/k;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lc10/j;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Laz/a;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lay/t;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lay/r;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lay/q;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lay/d;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lay/c;

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
