.class public final Ldq/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldq/x;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ldq/x;->a:I

    packed-switch v2, :pswitch_data_0

    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_3

    const/4 v9, 0x2

    if-eq v8, v9, :cond_2

    const/4 v9, 0x3

    if-eq v8, v9, :cond_1

    const/4 v9, 0x4

    if-eq v8, v9, :cond_0

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_0

    :cond_2
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_0

    :cond_3
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_0

    :cond_4
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v4, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    iput v5, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    iput v6, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    invoke-static {v3}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object v3, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->z:Ljava/lang/String;

    return-object v1

    :pswitch_0
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_6

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    new-instance v2, Ld8/a;

    const/4 v4, 0x6

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    if-nez v1, :cond_7

    const/4 v1, 0x0

    goto :goto_1

    :cond_7
    invoke-static {v1}, Landroidx/health/platform/client/proto/o2;->s([B)Landroidx/health/platform/client/proto/o2;

    move-result-object v1

    new-instance v2, Le8/f;

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/o2;->q()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    const-string v3, "proto.dataPointList"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1}, Le8/f;-><init>(Ljava/util/List;)V

    move-object v1, v2

    :goto_1
    return-object v1

    :pswitch_1
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_9

    const/4 v3, 0x1

    if-ne v2, v3, :cond_8

    new-instance v2, Ld8/a;

    const/4 v4, 0x5

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_2

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    if-nez v1, :cond_a

    const/4 v1, 0x0

    goto :goto_2

    :cond_a
    invoke-static {v1}, Landroidx/health/platform/client/proto/m2;->y([B)Landroidx/health/platform/client/proto/m2;

    move-result-object v1

    new-instance v2, Le8/e;

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/m2;->t()Ljava/lang/String;

    move-result-object v3

    const-string v4, "callingPackage"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/m2;->w()I

    move-result v4

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/m2;->v()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/m2;->u()Z

    move-result v1

    invoke-direct {v2, v3, v4, v5, v1}, Le8/e;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    move-object v1, v2

    :goto_2
    return-object v1

    :pswitch_2
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_c

    const/4 v3, 0x1

    if-ne v2, v3, :cond_b

    new-instance v2, Ld8/a;

    const/4 v4, 0x4

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_3

    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    if-nez v1, :cond_d

    const/4 v1, 0x0

    goto :goto_3

    :cond_d
    invoke-static {v1}, Landroidx/health/platform/client/proto/k2;->v([B)Landroidx/health/platform/client/proto/k2;

    move-result-object v1

    new-instance v2, Le8/d;

    invoke-direct {v2, v1}, Le8/d;-><init>(Landroidx/health/platform/client/proto/k2;)V

    move-object v1, v2

    :goto_3
    return-object v1

    :pswitch_3
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_f

    const/4 v3, 0x1

    if-ne v2, v3, :cond_e

    new-instance v2, Ld8/a;

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_4

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    if-nez v1, :cond_10

    const/4 v1, 0x0

    goto :goto_4

    :cond_10
    invoke-static {v1}, Landroidx/health/platform/client/proto/i2;->s([B)Landroidx/health/platform/client/proto/i2;

    move-result-object v1

    new-instance v2, Le8/c;

    invoke-direct {v2, v1}, Le8/c;-><init>(Landroidx/health/platform/client/proto/i2;)V

    move-object v1, v2

    :goto_4
    return-object v1

    :pswitch_4
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_12

    const/4 v3, 0x1

    if-ne v2, v3, :cond_11

    new-instance v2, Ld8/a;

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_5

    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    if-nez v1, :cond_13

    const/4 v1, 0x0

    goto :goto_5

    :cond_13
    invoke-static {v1}, Landroidx/health/platform/client/proto/g2;->r([B)Landroidx/health/platform/client/proto/g2;

    move-result-object v1

    new-instance v2, Le8/b;

    invoke-direct {v2, v1}, Le8/b;-><init>(Landroidx/health/platform/client/proto/g2;)V

    move-object v1, v2

    :goto_5
    return-object v1

    :pswitch_5
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_15

    const/4 v3, 0x1

    if-ne v2, v3, :cond_14

    new-instance v2, Ld8/a;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_6

    :cond_14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_15
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    if-nez v1, :cond_16

    const/4 v1, 0x0

    goto :goto_6

    :cond_16
    invoke-static {v1}, Landroidx/health/platform/client/proto/e2;->u([B)Landroidx/health/platform/client/proto/e2;

    move-result-object v1

    new-instance v2, Le8/a;

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e2;->s()Landroidx/health/platform/client/proto/w0;

    move-result-object v3

    const-string v4, "proto.uidsList"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e2;->r()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    const-string v4, "proto.clientIdsList"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, v1}, Le8/a;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v1, v2

    :goto_6
    return-object v1

    :pswitch_6
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Le10/u0;

    const-class v2, Le10/u0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ly00/o4;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ly00/u5;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_17

    const/4 v2, 0x1

    :goto_7
    move v6, v2

    goto :goto_8

    :cond_17
    const/4 v2, 0x0

    goto :goto_7

    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Le10/u0;-><init>(Ly00/o4;Ly00/u5;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_7
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Le10/t0;

    const-class v2, Le10/t0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ly00/d5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ly00/u5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ly00/j5;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_18

    move v2, v7

    move v7, v8

    goto :goto_9

    :cond_18
    move v2, v7

    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_19

    move v9, v8

    goto :goto_a

    :cond_19
    move v9, v8

    move v8, v2

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_b

    :cond_1a
    move v9, v2

    :goto_b
    invoke-direct/range {v3 .. v9}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;ZZZ)V

    return-object v3

    :pswitch_8
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Le10/m0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    const-class v4, Le10/m0;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Le10/l;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1b

    const/4 v1, 0x1

    goto :goto_c

    :cond_1b
    const/4 v1, 0x0

    :goto_c
    invoke-direct {v2, v3, v4, v1}, Le10/m0;-><init>(Ljava/lang/String;Le10/l;Z)V

    return-object v2

    :pswitch_9
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Le10/g0;

    const-class v3, Le10/g0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Le10/l;

    sget-object v4, Le10/k;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le10/k;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_1c

    const/4 v1, 0x0

    goto :goto_d

    :cond_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ln10/c0;->valueOf(Ljava/lang/String;)Ln10/c0;

    move-result-object v1

    :goto_d
    invoke-direct {v2, v3, v4, v1}, Le10/g0;-><init>(Le10/l;Le10/k;Ln10/c0;)V

    return-object v2

    :pswitch_a
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Le10/k;

    const-class v3, Le10/k;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Le10/l;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lv00/c0;

    invoke-direct {v2, v4, v1}, Le10/k;-><init>(Le10/l;Lv00/c0;)V

    return-object v2

    :pswitch_b
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ldy/g;

    sget-object v3, Ly00/c3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/c3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Ldy/g;-><init>(Ly00/c3;Ljava/lang/String;Ljava/util/List;)V

    return-object v2

    :pswitch_c
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ldy/e;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ldy/e;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_d
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ldy/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {v2, v1}, Ldy/d;-><init>(Ljava/lang/Throwable;)V

    return-object v2

    :pswitch_e
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_1e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1d

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_e

    :cond_1d
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    goto :goto_e

    :cond_1e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/j;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Ldq/j;->w:Landroid/app/PendingIntent;

    return-object v1

    :pswitch_f
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_20

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_1f

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_f

    :cond_1f
    invoke-static {v1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_f

    :cond_20
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v3, v1, Ldq/i;->w:I

    return-object v1

    :pswitch_10
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_23

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_22

    const/4 v7, 0x2

    if-eq v6, v7, :cond_21

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_10

    :cond_21
    sget-object v4, Ldq/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ldq/d;

    goto :goto_10

    :cond_22
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_10

    :cond_23
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Ldq/k;->w:Ljava/lang/String;

    iput-object v4, v1, Ldq/k;->x:Ldq/d;

    return-object v1

    :pswitch_11
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move v6, v4

    move-object v4, v5

    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_28

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_27

    const/4 v9, 0x2

    if-eq v8, v9, :cond_26

    const/4 v9, 0x3

    if-eq v8, v9, :cond_25

    const/4 v9, 0x4

    if-eq v8, v9, :cond_24

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_11

    :cond_24
    sget-object v5, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    goto :goto_11

    :cond_25
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_11

    :cond_26
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_11

    :cond_27
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_11

    :cond_28
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/h;

    invoke-direct {v1, v6, v3, v4, v5}, Ldq/h;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/wobs/CommonWalletObject;)V

    return-object v1

    :pswitch_12
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v14

    if-ge v14, v2, :cond_29

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    int-to-char v15, v14

    packed-switch v15, :pswitch_data_1

    invoke-static {v1, v14}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_12

    :pswitch_13
    sget-object v13, Ldq/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v13}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [Ldq/e;

    goto :goto_12

    :pswitch_14
    sget-object v12, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v12}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/identity/intents/model/UserAddress;

    goto :goto_12

    :pswitch_15
    sget-object v11, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v11}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/identity/intents/model/UserAddress;

    goto :goto_12

    :pswitch_16
    sget-object v10, Ldq/h;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v10}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ldq/h;

    goto :goto_12

    :pswitch_17
    sget-object v9, Ldq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v9}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ldq/g;

    goto :goto_12

    :pswitch_18
    sget-object v8, Ldq/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v8}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v8

    check-cast v8, Ldq/v;

    goto :goto_12

    :pswitch_19
    sget-object v7, Ldq/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v7}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Ldq/v;

    goto :goto_12

    :pswitch_1a
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_12

    :pswitch_1b
    invoke-static {v1, v14}, Lvo/b;->i(Landroid/os/Parcel;I)[Ljava/lang/String;

    move-result-object v5

    goto :goto_12

    :pswitch_1c
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_12

    :pswitch_1d
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_12

    :cond_29
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/wallet/MaskedWallet;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Lcom/google/android/gms/wallet/MaskedWallet;->w:Ljava/lang/String;

    iput-object v4, v1, Lcom/google/android/gms/wallet/MaskedWallet;->x:Ljava/lang/String;

    iput-object v5, v1, Lcom/google/android/gms/wallet/MaskedWallet;->y:[Ljava/lang/String;

    iput-object v6, v1, Lcom/google/android/gms/wallet/MaskedWallet;->z:Ljava/lang/String;

    iput-object v7, v1, Lcom/google/android/gms/wallet/MaskedWallet;->E:Ldq/v;

    iput-object v8, v1, Lcom/google/android/gms/wallet/MaskedWallet;->F:Ldq/v;

    iput-object v9, v1, Lcom/google/android/gms/wallet/MaskedWallet;->G:[Ldq/g;

    iput-object v10, v1, Lcom/google/android/gms/wallet/MaskedWallet;->H:[Ldq/h;

    iput-object v11, v1, Lcom/google/android/gms/wallet/MaskedWallet;->I:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object v12, v1, Lcom/google/android/gms/wallet/MaskedWallet;->J:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object v13, v1, Lcom/google/android/gms/wallet/MaskedWallet;->K:[Ldq/e;

    return-object v1

    :pswitch_1e
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v28, v5

    move-object/from16 v30, v6

    move-object/from16 v31, v7

    move-object/from16 v32, v8

    move-object v12, v9

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v24, v21

    move-object/from16 v26, v24

    move-object/from16 v27, v26

    move-object/from16 v33, v27

    move/from16 v22, v10

    move/from16 v29, v22

    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_2a

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_2

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_13

    :pswitch_1f
    sget-object v4, Lgq/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v33, v3

    check-cast v33, Lgq/c;

    goto :goto_13

    :pswitch_20
    sget-object v4, Lgq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v32

    goto :goto_13

    :pswitch_21
    sget-object v4, Lgq/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v31

    goto :goto_13

    :pswitch_22
    sget-object v4, Lgq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v30

    goto :goto_13

    :pswitch_23
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v29

    goto :goto_13

    :pswitch_24
    sget-object v4, Lgq/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v28

    goto :goto_13

    :pswitch_25
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v27

    goto :goto_13

    :pswitch_26
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v26

    goto :goto_13

    :pswitch_27
    sget-object v4, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v25

    goto :goto_13

    :pswitch_28
    sget-object v4, Lgq/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v24, v3

    check-cast v24, Lgq/f;

    goto :goto_13

    :pswitch_29
    sget-object v4, Lgq/h;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v23

    goto :goto_13

    :pswitch_2a
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v22

    goto :goto_13

    :pswitch_2b
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v21

    goto :goto_13

    :pswitch_2c
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v20

    goto :goto_13

    :pswitch_2d
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v19

    goto :goto_13

    :pswitch_2e
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v18

    goto :goto_13

    :pswitch_2f
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v17

    goto :goto_13

    :pswitch_30
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v16

    goto/16 :goto_13

    :pswitch_31
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v15

    goto/16 :goto_13

    :pswitch_32
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v14

    goto/16 :goto_13

    :pswitch_33
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v13

    goto/16 :goto_13

    :pswitch_34
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_13

    :cond_2a
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v11, Ldq/g;

    invoke-direct/range {v11 .. v33}, Ldq/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lgq/f;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lgq/c;)V

    return-object v11

    :pswitch_35
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move v8, v4

    move-object v4, v7

    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v9

    if-ge v9, v2, :cond_2b

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    int-to-char v10, v9

    packed-switch v10, :pswitch_data_3

    :pswitch_36
    invoke-static {v1, v9}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_14

    :pswitch_37
    invoke-static {v1, v9}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto :goto_14

    :pswitch_38
    invoke-static {v1, v9}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v8

    goto :goto_14

    :pswitch_39
    invoke-static {v1, v9}, Lvo/b;->f(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_14

    :pswitch_3a
    invoke-static {v1, v9}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_14

    :pswitch_3b
    invoke-static {v1, v9}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_14

    :pswitch_3c
    invoke-static {v1, v9}, Lvo/b;->f(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_14

    :cond_2b
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/f;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Ldq/f;->w:Ljava/util/ArrayList;

    iput-object v4, v1, Ldq/f;->x:Ljava/lang/String;

    iput-object v5, v1, Ldq/f;->y:Ljava/lang/String;

    iput-object v6, v1, Ldq/f;->z:Ljava/util/ArrayList;

    iput-boolean v8, v1, Ldq/f;->E:Z

    iput-object v7, v1, Ldq/f;->F:Ljava/lang/String;

    return-object v1

    :pswitch_3d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v4

    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_2f

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x2

    if-eq v7, v8, :cond_2e

    const/4 v8, 0x3

    if-eq v7, v8, :cond_2d

    const/4 v8, 0x4

    if-eq v7, v8, :cond_2c

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_15

    :cond_2c
    invoke-static {v1, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_15

    :cond_2d
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_15

    :cond_2e
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_15

    :cond_2f
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v4, v1, Ldq/e;->w:Ljava/lang/String;

    iput-object v5, v1, Ldq/e;->x:Ljava/lang/String;

    iput v3, v1, Ldq/e;->y:I

    return-object v1

    :pswitch_3e
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v14

    if-ge v14, v2, :cond_30

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    int-to-char v15, v14

    packed-switch v15, :pswitch_data_4

    invoke-static {v1, v14}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_16

    :pswitch_3f
    sget-object v13, Ldq/n;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v13}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v13

    check-cast v13, Ldq/n;

    goto :goto_16

    :pswitch_40
    sget-object v12, Ldq/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v12}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ldq/e;

    goto :goto_16

    :pswitch_41
    sget-object v11, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v11}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/identity/intents/model/UserAddress;

    goto :goto_16

    :pswitch_42
    sget-object v10, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v10}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/identity/intents/model/UserAddress;

    goto :goto_16

    :pswitch_43
    invoke-static {v1, v14}, Lvo/b;->i(Landroid/os/Parcel;I)[Ljava/lang/String;

    move-result-object v9

    goto :goto_16

    :pswitch_44
    sget-object v8, Ldq/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v8}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v8

    check-cast v8, Ldq/v;

    goto :goto_16

    :pswitch_45
    sget-object v7, Ldq/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v7}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Ldq/v;

    goto :goto_16

    :pswitch_46
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_16

    :pswitch_47
    sget-object v5, Ldq/w;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v14, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ldq/w;

    goto :goto_16

    :pswitch_48
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_16

    :pswitch_49
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_16

    :cond_30
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/wallet/FullWallet;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Lcom/google/android/gms/wallet/FullWallet;->w:Ljava/lang/String;

    iput-object v4, v1, Lcom/google/android/gms/wallet/FullWallet;->x:Ljava/lang/String;

    iput-object v5, v1, Lcom/google/android/gms/wallet/FullWallet;->y:Ldq/w;

    iput-object v6, v1, Lcom/google/android/gms/wallet/FullWallet;->z:Ljava/lang/String;

    iput-object v7, v1, Lcom/google/android/gms/wallet/FullWallet;->E:Ldq/v;

    iput-object v8, v1, Lcom/google/android/gms/wallet/FullWallet;->F:Ldq/v;

    iput-object v9, v1, Lcom/google/android/gms/wallet/FullWallet;->G:[Ljava/lang/String;

    iput-object v10, v1, Lcom/google/android/gms/wallet/FullWallet;->H:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object v11, v1, Lcom/google/android/gms/wallet/FullWallet;->I:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object v12, v1, Lcom/google/android/gms/wallet/FullWallet;->J:[Ldq/e;

    iput-object v13, v1, Lcom/google/android/gms/wallet/FullWallet;->K:Ldq/n;

    return-object v1

    :pswitch_4a
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_33

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_32

    const/4 v7, 0x2

    if-eq v6, v7, :cond_31

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_17

    :cond_31
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_17

    :cond_32
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_17

    :cond_33
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/d;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v3, v1, Ldq/d;->w:I

    iput v4, v1, Ldq/d;->x:I

    return-object v1

    :pswitch_4b
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v7, v4

    move-object v6, v5

    move v5, v3

    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v8

    if-ge v8, v2, :cond_38

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    int-to-char v9, v8

    if-eq v9, v4, :cond_37

    const/4 v10, 0x2

    if-eq v9, v10, :cond_36

    const/4 v10, 0x3

    if-eq v9, v10, :cond_35

    const/4 v10, 0x4

    if-eq v9, v10, :cond_34

    invoke-static {v1, v8}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_18

    :cond_34
    invoke-static {v1, v8}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_18

    :cond_35
    invoke-static {v1, v8}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    goto :goto_18

    :cond_36
    invoke-static {v1, v8}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_18

    :cond_37
    invoke-static {v1, v8}, Lvo/b;->f(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_18

    :cond_38
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v6, v1, Ldq/c;->w:Ljava/util/ArrayList;

    iput-boolean v7, v1, Ldq/c;->x:Z

    iput-boolean v3, v1, Ldq/c;->y:Z

    iput v5, v1, Ldq/c;->z:I

    return-object v1

    :pswitch_4c
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move-object v6, v5

    move v7, v4

    move-object v4, v6

    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v8

    if-ge v8, v2, :cond_3e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    int-to-char v9, v8

    const/4 v10, 0x1

    if-eq v9, v10, :cond_3d

    const/4 v10, 0x2

    if-eq v9, v10, :cond_3c

    const/4 v10, 0x3

    if-eq v9, v10, :cond_3b

    const/4 v10, 0x4

    if-eq v9, v10, :cond_3a

    const/4 v10, 0x5

    if-eq v9, v10, :cond_39

    invoke-static {v1, v8}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_19

    :cond_39
    sget-object v6, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v8, v6}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/identity/intents/model/UserAddress;

    goto :goto_19

    :cond_3a
    invoke-static {v1, v8}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v7

    goto :goto_19

    :cond_3b
    invoke-static {v1, v8}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_19

    :cond_3c
    invoke-static {v1, v8}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_19

    :cond_3d
    invoke-static {v1, v8}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_19

    :cond_3e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Ldq/b;->w:Ljava/lang/String;

    iput-object v4, v1, Ldq/b;->x:Ljava/lang/String;

    iput-object v5, v1, Ldq/b;->y:Ljava/lang/String;

    iput v7, v1, Ldq/b;->z:I

    iput-object v6, v1, Ldq/b;->E:Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object v1

    :pswitch_4d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move v13, v4

    move-object v4, v12

    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v14

    if-ge v14, v2, :cond_3f

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    int-to-char v15, v14

    packed-switch v15, :pswitch_data_5

    invoke-static {v1, v14}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1a

    :pswitch_4e
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v12

    goto :goto_1a

    :pswitch_4f
    invoke-static {v1, v14}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v13

    goto :goto_1a

    :pswitch_50
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_1a

    :pswitch_51
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto :goto_1a

    :pswitch_52
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto :goto_1a

    :pswitch_53
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1a

    :pswitch_54
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1a

    :pswitch_55
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1a

    :pswitch_56
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1a

    :pswitch_57
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1a

    :pswitch_58
    invoke-static {v1, v14}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1a

    :cond_3f
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/v;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Ldq/v;->w:Ljava/lang/String;

    iput-object v4, v1, Ldq/v;->x:Ljava/lang/String;

    iput-object v5, v1, Ldq/v;->y:Ljava/lang/String;

    iput-object v6, v1, Ldq/v;->z:Ljava/lang/String;

    iput-object v7, v1, Ldq/v;->E:Ljava/lang/String;

    iput-object v8, v1, Ldq/v;->F:Ljava/lang/String;

    iput-object v9, v1, Ldq/v;->G:Ljava/lang/String;

    iput-object v10, v1, Ldq/v;->H:Ljava/lang/String;

    iput-object v11, v1, Ldq/v;->I:Ljava/lang/String;

    iput-boolean v13, v1, Ldq/v;->J:Z

    iput-object v12, v1, Ldq/v;->K:Ljava/lang/String;

    return-object v1

    :pswitch_59
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_42

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_41

    const/4 v7, 0x3

    if-eq v6, v7, :cond_40

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1b

    :cond_40
    invoke-static {v1, v5}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v4

    goto :goto_1b

    :cond_41
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1b

    :cond_42
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/z;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Ldq/z;->w:Ljava/lang/String;

    iput-object v4, v1, Ldq/z;->x:Landroid/os/Bundle;

    return-object v1

    :pswitch_5a
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    move-object v4, v3

    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_46

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_45

    const/4 v8, 0x2

    if-eq v7, v8, :cond_44

    const/4 v8, 0x3

    if-eq v7, v8, :cond_43

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1c

    :cond_43
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1c

    :cond_44
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1c

    :cond_45
    invoke-static {v1, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_1c

    :cond_46
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ldq/s;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v5, v1, Ldq/s;->w:I

    iput-object v3, v1, Ldq/s;->x:Ljava/lang/String;

    iput-object v4, v1, Ldq/s;->y:Ljava/lang/String;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5a
        :pswitch_59
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_3e
        :pswitch_3d
        :pswitch_35
        :pswitch_1e
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
    .packed-switch 0x2
        :pswitch_1d
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
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
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
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_3c
        :pswitch_36
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x2
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldq/x;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lcom/google/android/gms/wallet/button/ButtonOptions;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Le8/f;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Le8/e;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Le8/d;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Le8/c;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Le8/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Le8/a;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Le10/u0;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Le10/t0;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Le10/m0;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Le10/g0;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Le10/k;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Ldy/g;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Ldy/e;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Ldy/d;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Ldq/j;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Ldq/i;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Ldq/k;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Ldq/h;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lcom/google/android/gms/wallet/MaskedWallet;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Ldq/g;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Ldq/f;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Ldq/e;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lcom/google/android/gms/wallet/FullWallet;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Ldq/d;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Ldq/c;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Ldq/b;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Ldq/v;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Ldq/z;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Ldq/s;

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
