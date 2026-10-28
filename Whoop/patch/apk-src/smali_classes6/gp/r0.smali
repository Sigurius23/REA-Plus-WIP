.class public final Lgp/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgp/r0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lgp/r0;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Ljz/g;->w:Ljz/g;

    return-object v1

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljz/f;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Ljz/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_1
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljz/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Ljz/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_2
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljz/e;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move-object v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_1

    move-object v6, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ly00/p2;->valueOf(Ljava/lang/String;)Ly00/p2;

    move-result-object v6

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-nez v7, :cond_2

    move-object v7, v4

    goto :goto_2

    :cond_2
    sget-object v7, Ljz/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v7, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v7

    :goto_2
    check-cast v7, Ljz/a;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-nez v8, :cond_3

    goto :goto_3

    :cond_3
    sget-object v4, Ljz/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    :goto_3
    move-object v8, v4

    check-cast v8, Ljz/c;

    sget-object v4, Ljz/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljz/d;

    const-class v4, Ljz/e;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ly00/j2;

    move-object v4, v2

    invoke-direct/range {v3 .. v10}, Ljz/e;-><init>(Ljava/lang/Long;Ljava/lang/String;Ly00/p2;Ljz/a;Ljz/c;Ljz/d;Ly00/j2;)V

    return-object v3

    :pswitch_3
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljz/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_4

    const/4 v1, 0x0

    goto :goto_4

    :cond_4
    sget-object v6, Ljz/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_4
    check-cast v1, Ljz/b;

    invoke-direct {v2, v3, v4, v5, v1}, Ljz/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljz/b;)V

    return-object v2

    :pswitch_4
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljz/b;

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

    invoke-direct/range {v3 .. v9}, Ljz/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_5
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljz/a;->valueOf(Ljava/lang/String;)Ljz/a;

    move-result-object v1

    return-object v1

    :pswitch_6
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljv/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_5

    move v2, v4

    move v4, v5

    move v6, v4

    goto :goto_5

    :cond_5
    move v2, v4

    move v6, v5

    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    move v7, v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    move v8, v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    move v9, v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v8

    move v10, v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v9

    move v11, v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_6

    :cond_6
    move v11, v2

    :goto_6
    invoke-direct/range {v3 .. v11}, Ljv/c;-><init>(ZIIFFFFZ)V

    return-object v3

    :pswitch_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v3, Ljn/a;

    invoke-direct {v3, v1, v2}, Ljn/a;-><init>(ILjava/lang/String;)V

    return-object v3

    :pswitch_8
    const-string v2, "inParcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lj/l;

    const-class v3, Landroid/content/IntentSender;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Landroid/content/IntentSender;

    const-class v4, Landroid/content/Intent;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-direct {v2, v3, v4, v5, v1}, Lj/l;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v2

    :pswitch_9
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lj/a;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_7

    const/4 v1, 0x0

    goto :goto_7

    :cond_7
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    :goto_7
    invoke-direct {v2, v3, v1}, Lj/a;-><init>(ILandroid/content/Intent;)V

    return-object v2

    :pswitch_a
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Li10/f;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {v2, v1}, Li10/f;-><init>(Ljava/lang/Throwable;)V

    return-object v2

    :pswitch_b
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Li10/e;->w:Li10/e;

    return-object v1

    :pswitch_c
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Li10/d;->w:Li10/d;

    return-object v1

    :pswitch_d
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Li10/b;

    sget-object v3, Lh20/y1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/y1;

    const-class v4, Li10/b;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/v3;

    invoke-direct {v2, v3, v1}, Li10/b;-><init>(Lh20/y1;Ly00/v3;)V

    return-object v2

    :pswitch_e
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

    move-object v13, v12

    move-object v14, v13

    move-object/from16 v16, v14

    move-object/from16 v17, v16

    move v0, v4

    move-object/from16 v4, v17

    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v15

    if-ge v15, v2, :cond_8

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    move/from16 v18, v0

    int-to-char v0, v15

    packed-switch v0, :pswitch_data_1

    invoke-static {v1, v15}, Lvo/b;->E(Landroid/os/Parcel;I)V

    :goto_9
    move/from16 v0, v18

    goto :goto_8

    :pswitch_f
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_9

    :pswitch_10
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_9

    :pswitch_11
    invoke-static {v1, v15}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v0

    goto :goto_8

    :pswitch_12
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    goto :goto_9

    :pswitch_13
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    goto :goto_9

    :pswitch_14
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto :goto_9

    :pswitch_15
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    goto :goto_9

    :pswitch_16
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto :goto_9

    :pswitch_17
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    goto :goto_9

    :pswitch_18
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_9

    :pswitch_19
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_9

    :pswitch_1a
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_9

    :pswitch_1b
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_9

    :pswitch_1c
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_9

    :pswitch_1d
    invoke-static {v1, v15}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    goto :goto_9

    :cond_8
    move/from16 v18, v0

    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/identity/intents/model/UserAddress;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v3, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->w:Ljava/lang/String;

    iput-object v4, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->x:Ljava/lang/String;

    iput-object v5, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->y:Ljava/lang/String;

    iput-object v6, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->z:Ljava/lang/String;

    iput-object v7, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->E:Ljava/lang/String;

    iput-object v8, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->F:Ljava/lang/String;

    iput-object v9, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->G:Ljava/lang/String;

    iput-object v10, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->H:Ljava/lang/String;

    iput-object v11, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->I:Ljava/lang/String;

    iput-object v12, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->J:Ljava/lang/String;

    iput-object v13, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->K:Ljava/lang/String;

    iput-object v14, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->L:Ljava/lang/String;

    move/from16 v4, v18

    iput-boolean v4, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->M:Z

    move-object/from16 v3, v17

    iput-object v3, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->N:Ljava/lang/String;

    move-object/from16 v3, v16

    iput-object v3, v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->O:Ljava/lang/String;

    return-object v0

    :pswitch_1e
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh30/j;

    const-class v2, Lh30/j;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lv00/c0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lh20/g3;

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

    move-object v1, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lh30/j;-><init>(Lv00/c0;Lh20/g3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_1f
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh30/h;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {v0, v1}, Lh30/h;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_20
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lh30/g;->w:Lh30/g;

    return-object v0

    :pswitch_21
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lh30/f;->w:Lh30/f;

    return-object v0

    :pswitch_22
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v0, :cond_e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x2

    if-eq v8, v9, :cond_d

    const/4 v9, 0x3

    if-eq v8, v9, :cond_c

    const/4 v9, 0x4

    if-eq v8, v9, :cond_b

    const/4 v9, 0x5

    if-eq v8, v9, :cond_a

    const/4 v9, 0x6

    if-eq v8, v9, :cond_9

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_a

    :cond_9
    sget-object v6, Lgq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v6}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v6

    check-cast v6, Lgq/g;

    goto :goto_a

    :cond_a
    sget-object v5, Lgq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lgq/g;

    goto :goto_a

    :cond_b
    sget-object v4, Lgq/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lgq/f;

    goto :goto_a

    :cond_c
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_a

    :cond_d
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    :cond_e
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lgq/h;->w:Ljava/lang/String;

    iput-object v3, v0, Lgq/h;->x:Ljava/lang/String;

    iput-object v4, v0, Lgq/h;->y:Lgq/f;

    iput-object v5, v0, Lgq/h;->z:Lgq/g;

    iput-object v6, v0, Lgq/h;->E:Lgq/g;

    return-object v0

    :pswitch_23
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    move-object v3, v2

    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_11

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_10

    const/4 v6, 0x3

    if-eq v5, v6, :cond_f

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_b

    :cond_f
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_b

    :cond_10
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_b

    :cond_11
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lgq/g;->w:Ljava/lang/String;

    iput-object v3, v0, Lgq/g;->x:Ljava/lang/String;

    return-object v0

    :pswitch_24
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v0, :cond_14

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x2

    if-eq v7, v8, :cond_13

    const/4 v8, 0x3

    if-eq v7, v8, :cond_12

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_c

    :cond_12
    invoke-static {v1, v6}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v4

    goto :goto_c

    :cond_13
    invoke-static {v1, v6}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v2

    goto :goto_c

    :cond_14
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-wide v2, v0, Lgq/f;->w:J

    iput-wide v4, v0, Lgq/f;->x:J

    return-object v0

    :pswitch_25
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    move-object v3, v2

    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_17

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_16

    const/4 v6, 0x3

    if-eq v5, v6, :cond_15

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_d

    :cond_15
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_d

    :cond_16
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_d

    :cond_17
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lgq/e;->w:Ljava/lang/String;

    iput-object v3, v0, Lgq/e;->x:Ljava/lang/String;

    return-object v0

    :pswitch_26
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_1b

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1a

    const/4 v7, 0x3

    if-eq v6, v7, :cond_19

    const/4 v7, 0x5

    if-eq v6, v7, :cond_18

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_e

    :cond_18
    sget-object v4, Lgq/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lgq/f;

    goto :goto_e

    :cond_19
    sget-object v3, Lgq/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lgq/d;

    goto :goto_e

    :cond_1a
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_1b
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lgq/c;->w:Ljava/lang/String;

    iput-object v3, v0, Lgq/c;->x:Lgq/d;

    iput-object v4, v0, Lgq/c;->y:Lgq/f;

    return-object v0

    :pswitch_27
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, -0x1

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move v9, v8

    move-wide v7, v6

    move-object v6, v5

    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v10

    if-ge v10, v0, :cond_1c

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    int-to-char v11, v10

    packed-switch v11, :pswitch_data_2

    invoke-static {v1, v10}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_f

    :pswitch_28
    invoke-static {v1, v10}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_f

    :pswitch_29
    invoke-static {v1, v10}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v3

    goto :goto_f

    :pswitch_2a
    invoke-static {v1, v10}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_f

    :pswitch_2b
    const/16 v7, 0x8

    invoke-static {v1, v10, v7}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v7

    goto :goto_f

    :pswitch_2c
    invoke-static {v1, v10}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_f

    :pswitch_2d
    invoke-static {v1, v10}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v9

    goto :goto_f

    :cond_1c
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v9, v0, Lgq/d;->w:I

    iput-object v5, v0, Lgq/d;->x:Ljava/lang/String;

    iput-wide v7, v0, Lgq/d;->y:D

    iput-object v6, v0, Lgq/d;->z:Ljava/lang/String;

    iput-wide v3, v0, Lgq/d;->E:J

    iput v2, v0, Lgq/d;->F:I

    return-object v0

    :pswitch_2e
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move-object v4, v3

    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_20

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1f

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1e

    const/4 v7, 0x4

    if-eq v6, v7, :cond_1d

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_10

    :cond_1d
    sget-object v2, Lgq/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v2}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_10

    :cond_1e
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    :cond_1f
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_10

    :cond_20
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/b;

    invoke-direct {v0, v2, v3, v4}, Lgq/b;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_2f
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    move-object v3, v2

    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_23

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_22

    const/4 v6, 0x3

    if-eq v5, v6, :cond_21

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_11

    :cond_21
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_11

    :cond_22
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_11

    :cond_23
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgq/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lgq/a;->w:Ljava/lang/String;

    iput-object v3, v0, Lgq/a;->x:Ljava/lang/String;

    return-object v0

    :pswitch_30
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

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

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v20, v2

    move-object/from16 v22, v3

    move-object/from16 v25, v4

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move-object/from16 v29, v7

    move/from16 v19, v8

    move/from16 v26, v19

    move-object v11, v9

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v21, v18

    move-object/from16 v23, v21

    move-object/from16 v24, v23

    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_24

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    int-to-char v3, v2

    packed-switch v3, :pswitch_data_3

    invoke-static {v1, v2}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_12

    :pswitch_31
    sget-object v3, Lgq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v29

    goto :goto_12

    :pswitch_32
    sget-object v3, Lgq/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v28

    goto :goto_12

    :pswitch_33
    sget-object v3, Lgq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v27

    goto :goto_12

    :pswitch_34
    invoke-static {v1, v2}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v26

    goto :goto_12

    :pswitch_35
    sget-object v3, Lgq/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v25

    goto :goto_12

    :pswitch_36
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v24

    goto :goto_12

    :pswitch_37
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v23

    goto :goto_12

    :pswitch_38
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v22

    goto :goto_12

    :pswitch_39
    sget-object v3, Lgq/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lgq/f;

    goto :goto_12

    :pswitch_3a
    sget-object v3, Lgq/h;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v20

    goto :goto_12

    :pswitch_3b
    invoke-static {v1, v2}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v19

    goto :goto_12

    :pswitch_3c
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v18

    goto :goto_12

    :pswitch_3d
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v17

    goto :goto_12

    :pswitch_3e
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v16

    goto :goto_12

    :pswitch_3f
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v15

    goto :goto_12

    :pswitch_40
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v14

    goto :goto_12

    :pswitch_41
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v13

    goto :goto_12

    :pswitch_42
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v12

    goto :goto_12

    :pswitch_43
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v11

    goto/16 :goto_12

    :cond_24
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v10, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-direct/range {v10 .. v29}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lgq/f;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v10

    :pswitch_44
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v0, :cond_26

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_25

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_13

    :cond_25
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    :cond_26
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lgp/o;

    invoke-direct {v0, v2}, Lgp/o;-><init>(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
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
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
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
        :pswitch_31
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgp/r0;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Ljz/g;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Ljz/f;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Ljz/d;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ljz/e;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ljz/c;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Ljz/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Ljz/a;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Ljv/c;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Ljn/a;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lj/l;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lj/a;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Li10/f;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Li10/e;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Li10/d;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Li10/b;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lh30/j;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lh30/h;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lh30/g;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lh30/f;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lgq/h;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lgq/g;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lgq/f;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lgq/e;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lgq/c;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lgq/d;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lgq/b;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lgq/a;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lgp/o;

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
