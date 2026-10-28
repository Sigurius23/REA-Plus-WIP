.class public final Lwx/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwx/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lwx/f;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/h;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move-object v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_1

    move-object v5, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v16

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_2

    move-object/from16 v17, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ly00/j;->valueOf(Ljava/lang/String;)Ly00/j;

    move-result-object v17

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v24

    if-nez v24, :cond_3

    :goto_3
    move-object/from16 v24, v4

    move-object v4, v2

    goto :goto_4

    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly00/h8;->valueOf(Ljava/lang/String;)Ly00/h8;

    move-result-object v4

    goto :goto_3

    :goto_4
    invoke-direct/range {v3 .. v24}, Ly00/h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/i;Ly00/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/h8;)V

    return-object v3

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ly00/f;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_5

    :cond_4
    const/4 v1, 0x0

    :goto_5
    invoke-direct {v2, v3, v4, v1}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v2

    :pswitch_1
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/e;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v6, 0x0

    if-nez v2, :cond_5

    move-object v2, v6

    goto :goto_6

    :cond_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/model/BankAccount$Type;->valueOf(Ljava/lang/String;)Lcom/stripe/android/model/BankAccount$Type;

    move-result-object v2

    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-nez v13, :cond_6

    :goto_7
    move-object v13, v6

    move-object v6, v2

    goto :goto_8

    :cond_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/model/BankAccount$Status;->valueOf(Ljava/lang/String;)Lcom/stripe/android/model/BankAccount$Status;

    move-result-object v6

    goto :goto_7

    :goto_8
    invoke-direct/range {v3 .. v13}, Ly00/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Status;)V

    return-object v3

    :pswitch_2
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ly00/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ly00/d;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_3
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v3 .. v9}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_4
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/b;

    sget-object v2, Ly00/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ly00/f;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ly00/a;->valueOf(Ljava/lang/String;)Ly00/a;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ly00/j;->valueOf(Ljava/lang/String;)Ly00/j;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Ly00/b;-><init>(Ly00/f;ILy00/a;Ly00/j;Ljava/lang/String;)V

    return-object v3

    :pswitch_5
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lwz/g1;

    const-class v2, Lwz/g1;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lwz/g0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lv00/c0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lb10/d;->valueOf(Ljava/lang/String;)Lb10/d;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lwz/h0;->valueOf(Ljava/lang/String;)Lwz/h0;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v10

    invoke-virtual {v1, v10}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v10

    check-cast v10, Lwz/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lwz/n0;

    invoke-direct/range {v3 .. v12}, Lwz/g1;-><init>(Lwz/g0;Lv00/c0;Lb10/d;Ljava/lang/String;Ljava/lang/String;Lwz/h0;Lwz/d;Ljava/lang/String;Lwz/n0;)V

    return-object v3

    :pswitch_6
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/t0;

    const-class v3, Lwz/t0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lwz/q0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lwz/t0;-><init>(Lwz/q0;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_7
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/s0;

    const-class v3, Lwz/s0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Ly00/c0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lwz/s0;-><init>(Ly00/c0;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_8
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/p0;

    const-class v3, Lwz/p0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ly00/b0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ly00/d5;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/o4;

    invoke-direct {v2, v4, v5, v1}, Lwz/p0;-><init>(Ly00/b0;Ly00/d5;Ly00/o4;)V

    return-object v2

    :pswitch_9
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/o0;

    const-class v3, Lwz/o0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ly00/c0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ly00/d5;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/d5;

    invoke-direct {v2, v4, v5, v1}, Lwz/o0;-><init>(Ly00/c0;Ly00/d5;Ly00/d5;)V

    return-object v2

    :pswitch_a
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/m0;

    const-class v3, Lwz/m0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Ly00/c0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_7

    const/4 v4, 0x0

    goto :goto_9

    :cond_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lwz/v0;->valueOf(Ljava/lang/String;)Lwz/v0;

    move-result-object v4

    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_8

    move v5, v7

    goto :goto_a

    :cond_8
    move v5, v6

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_9

    move v6, v7

    :cond_9
    invoke-direct {v2, v3, v4, v5, v6}, Lwz/m0;-><init>(Ly00/c0;Lwz/v0;ZZ)V

    return-object v2

    :pswitch_b
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lwz/l0;->w:Lwz/l0;

    return-object v1

    :pswitch_c
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/k0;

    const-class v3, Lwz/k0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lwz/u0;

    invoke-direct {v2, v1}, Lwz/k0;-><init>(Lwz/u0;)V

    return-object v2

    :pswitch_d
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/j0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lwz/j0;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_e
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/i0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    :goto_b
    invoke-direct {v2, v1}, Lwz/i0;-><init>(Z)V

    return-object v2

    :pswitch_f
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwz/f0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Lwz/f0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_10
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lwz/g0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ly00/c8;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    sget-object v3, Lwz/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lwz/f0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_b

    const/4 v3, 0x0

    goto :goto_c

    :cond_b
    sget-object v3, Li20/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_c
    move-object v11, v3

    check-cast v11, Li20/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v3, :cond_c

    move v3, v12

    move v12, v13

    goto :goto_d

    :cond_c
    move v3, v12

    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    move v15, v13

    new-instance v13, Ljava/util/LinkedHashMap;

    invoke-direct {v13, v14}, Ljava/util/LinkedHashMap;-><init>(I)V

    :goto_e
    if-eq v3, v14, :cond_e

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-eqz v18, :cond_d

    move/from16 v18, v15

    goto :goto_f

    :cond_d
    const/16 v18, 0x0

    :goto_f
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-virtual {v13, v4, v15}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    const/4 v15, 0x1

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_f

    const/4 v3, 0x0

    goto :goto_10

    :cond_f
    sget-object v3, Lwz/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_10
    move-object v14, v3

    check-cast v14, Lwz/e0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lux/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lux/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_10

    const/4 v4, 0x0

    goto :goto_11

    :cond_10
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lf20/b;->valueOf(Ljava/lang/String;)Lf20/b;

    move-result-object v4

    :goto_11
    sget-object v0, Lh20/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lh20/l1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    goto :goto_12

    :cond_11
    sget-object v0, Lh20/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_12
    check-cast v0, Lh20/i1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-eqz v20, :cond_12

    const/16 v20, 0x1

    goto :goto_13

    :cond_12
    const/16 v20, 0x0

    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v21

    if-eqz v21, :cond_13

    const/16 v21, 0x1

    goto :goto_14

    :cond_13
    const/16 v21, 0x0

    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v22

    if-eqz v22, :cond_14

    const/16 v22, 0x1

    goto :goto_15

    :cond_14
    const/16 v22, 0x0

    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v24

    if-nez v24, :cond_15

    const/16 v24, 0x0

    goto :goto_16

    :cond_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Ly00/p2;->valueOf(Ljava/lang/String;)Ly00/p2;

    move-result-object v24

    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v25

    if-eqz v25, :cond_16

    const/16 v25, 0x1

    goto :goto_17

    :cond_16
    const/16 v25, 0x0

    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v27

    if-eqz v27, :cond_17

    const/16 v27, 0x1

    goto :goto_18

    :cond_17
    const/16 v27, 0x0

    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v28

    if-eqz v28, :cond_18

    const/16 v28, 0x1

    goto :goto_19

    :cond_18
    const/16 v28, 0x0

    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v29

    if-eqz v29, :cond_19

    const/16 v29, 0x1

    goto :goto_1a

    :cond_19
    const/16 v29, 0x0

    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v30

    if-eqz v30, :cond_1a

    const/16 v30, 0x1

    goto :goto_1b

    :cond_1a
    const/16 v30, 0x0

    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v31

    if-eqz v31, :cond_1b

    const/16 v31, 0x1

    goto :goto_1c

    :cond_1b
    const/16 v31, 0x0

    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v32

    move-object/from16 v17, v0

    if-nez v32, :cond_1c

    const/4 v0, 0x0

    goto :goto_1d

    :cond_1c
    sget-object v0, Lwz/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_1d
    move-object/from16 v32, v0

    check-cast v32, Lwz/d0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1d

    const/16 v33, 0x1

    goto :goto_1e

    :cond_1d
    const/16 v33, 0x0

    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1e

    const/16 v34, 0x1

    goto :goto_1f

    :cond_1e
    const/16 v34, 0x0

    :goto_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v35

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v36, v0

    check-cast v36, Lv00/i0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1f

    const/16 v37, 0x1

    goto :goto_20

    :cond_1f
    const/16 v37, 0x0

    :goto_20
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v38

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v39, v0

    check-cast v39, Ly00/n;

    move-object/from16 v19, v17

    move-object/from16 v17, v4

    new-instance v4, Lwz/g0;

    move-object/from16 v16, v3

    invoke-direct/range {v4 .. v39}, Lwz/g0;-><init>(Ly00/c8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwz/f0;Li20/b;ZLjava/util/Map;Lwz/e0;Lux/a;Lux/b;Lf20/b;Lh20/l1;Lh20/i1;ZZZLjava/lang/String;Ly00/p2;ZLjava/lang/String;ZZZZZLwz/d0;ZZLjava/lang/String;Lv00/i0;ZLjava/util/List;Ly00/n;)V

    return-object v4

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwz/e0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_20

    const/4 v2, 0x1

    goto :goto_21

    :cond_20
    const/4 v2, 0x0

    :goto_21
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lwz/e0;-><init>(ZLjava/util/List;)V

    return-object v0

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwz/c0;->valueOf(Ljava/lang/String;)Lwz/c0;

    move-result-object v0

    return-object v0

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwz/b0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_21

    move-object v2, v3

    goto :goto_22

    :cond_21
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_22

    goto :goto_23

    :cond_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :goto_23
    invoke-direct {v0, v2, v3}, Lwz/b0;-><init>(Ljava/lang/Float;Ljava/lang/Float;)V

    return-object v0

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwz/d0;

    sget-object v2, Lwz/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwz/a0;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwz/a0;

    sget-object v4, Lwz/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwz/c0;

    sget-object v5, Lwz/b0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/b0;

    invoke-direct {v0, v3, v2, v4, v1}, Lwz/d0;-><init>(Lwz/a0;Lwz/a0;Lwz/c0;Lwz/b0;)V

    return-object v0

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    new-instance v1, Lwz/a0;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-static {v4}, Li2/w0;->c(I)J

    move-result-wide v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v6

    invoke-direct/range {v1 .. v7}, Lwz/a0;-><init>(JJJ)V

    return-object v1

    :pswitch_16
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwz/p;

    const-class v2, Lwz/p;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ly00/o4;

    invoke-direct {v1, v0}, Lwz/p;-><init>(Ly00/o4;)V

    return-object v1

    :pswitch_17
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwz/o;

    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    const-class v3, Lwz/o;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lwz/e;

    invoke-direct {v1, v2, v0}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    return-object v1

    :pswitch_18
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwz/n;

    const-class v2, Lwz/n;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lwz/e;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lwz/u0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Ly00/j0;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_23

    const/4 v0, 0x0

    goto :goto_25

    :cond_23
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_24

    const/4 v0, 0x1

    goto :goto_24

    :cond_24
    const/4 v0, 0x0

    :goto_24
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_25
    invoke-direct {v1, v3, v4, v2, v0}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;)V

    return-object v1

    :pswitch_19
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwz/m;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lwz/l;->valueOf(Ljava/lang/String;)Lwz/l;

    move-result-object v2

    const-class v3, Lwz/m;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lwz/e;

    invoke-direct {v1, v2, v0}, Lwz/m;-><init>(Lwz/l;Lwz/e;)V

    return-object v1

    :pswitch_1a
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwz/d;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_25

    move-object v2, v3

    goto :goto_26

    :cond_25
    sget-object v2, Ld00/l;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_26
    check-cast v2, Ld00/l;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_26

    goto :goto_27

    :cond_26
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwz/c;->valueOf(Ljava/lang/String;)Lwz/c;

    move-result-object v3

    :goto_27
    invoke-direct {v1, v2, v3}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    return-object v1

    :pswitch_1b
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lwz/b;->w:Lwz/b;

    return-object v0

    :pswitch_1c
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwx/g;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lwx/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

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
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwx/f;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Ly00/h;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Ly00/f;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Ly00/e;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ly00/d;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ly00/c;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Ly00/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lwz/g1;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lwz/t0;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lwz/s0;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lwz/p0;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lwz/o0;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lwz/m0;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lwz/l0;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lwz/k0;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lwz/j0;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lwz/i0;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lwz/f0;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lwz/g0;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lwz/e0;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lwz/c0;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lwz/b0;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lwz/d0;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lwz/a0;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lwz/p;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lwz/o;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lwz/n;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lwz/m;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lwz/d;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lwz/b;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lwx/g;

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
