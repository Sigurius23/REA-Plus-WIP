.class public final Lq30/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lq30/j0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lq30/j0;->a:I

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

    const/4 v6, 0x2

    if-eq v5, v6, :cond_0

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v4}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lsp/c;

    invoke-direct {v1, v3}, Lsp/c;-><init>([B)V

    return-object v1

    :pswitch_0
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    invoke-static {v1, v4}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_1

    :cond_3
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lsp/b;

    invoke-direct {v1, v3}, Lsp/b;-><init>([B)V

    return-object v1

    :pswitch_1
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls40/g1;

    const-class v3, Ls40/g1;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    invoke-direct {v2, v3, v4, v1}, Ls40/g1;-><init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V

    return-object v2

    :pswitch_2
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls40/h0;

    const-class v3, Ls40/h0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/model/CountryCode;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v2, v4, v1}, Ls40/h0;-><init>(Lcom/stripe/android/core/model/CountryCode;Landroid/os/Parcelable;)V

    return-object v2

    :pswitch_3
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls40/v;

    const-class v3, Ls40/v;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    invoke-direct {v2, v3, v1}, Ls40/v;-><init>(Landroid/os/Parcelable;Z)V

    return-object v2

    :pswitch_4
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_6

    move v6, v4

    goto :goto_4

    :cond_6
    move v6, v3

    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_7

    move v7, v4

    goto :goto_5

    :cond_7
    move v7, v3

    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_8

    const/4 v2, 0x0

    :goto_6
    move-object v9, v2

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v2

    goto :goto_6

    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v3

    :goto_8
    if-eq v5, v2, :cond_9

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v3

    :goto_9
    if-eq v5, v2, :cond_a

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_b

    move v12, v4

    goto :goto_a

    :cond_b
    move v12, v3

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_c

    move v13, v4

    goto :goto_b

    :cond_c
    move v13, v3

    :goto_b
    new-instance v5, Ls40/k;

    invoke-direct/range {v5 .. v13}, Ls40/k;-><init>(ZZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZ)V

    return-object v5

    :pswitch_5
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls40/j;

    const-class v3, Ls40/j;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    sget-object v4, Ls40/k;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls40/k;

    invoke-direct {v2, v3, v1}, Ls40/j;-><init>(Landroid/os/Parcelable;Ls40/k;)V

    return-object v2

    :pswitch_6
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls40/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ls40/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_7
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Ls00/f;->w:Ls00/f;

    return-object v1

    :pswitch_8
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls00/e;

    const-class v3, Ls00/e;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lp00/q;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lwz/g0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lv00/c0;

    invoke-direct {v2, v4, v5, v1}, Ls00/e;-><init>(Lp00/q;Lwz/g0;Lv00/c0;)V

    return-object v2

    :pswitch_9
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Ls00/d;->w:Ls00/d;

    return-object v1

    :pswitch_a
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls00/c;

    const-class v3, Ls00/c;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ls00/g;

    invoke-direct {v2, v1}, Ls00/c;-><init>(Ls00/g;)V

    return-object v2

    :pswitch_b
    new-instance v2, Ls/j0;

    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    goto :goto_c

    :cond_d
    const/4 v1, 0x0

    :goto_c
    iput-boolean v1, v2, Ls/j0;->w:Z

    return-object v2

    :pswitch_c
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_10

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_f

    const/4 v7, 0x5

    if-eq v6, v7, :cond_e

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_d

    :cond_e
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    goto :goto_d

    :cond_f
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_d

    :cond_10
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-object v1

    :pswitch_d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_14

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_13

    const/4 v8, 0x2

    if-eq v7, v8, :cond_12

    const/4 v8, 0x3

    if-eq v7, v8, :cond_11

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_e

    :cond_11
    invoke-static {v1, v6}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_e

    :cond_12
    invoke-static {v1, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_e

    :cond_13
    invoke-static {v1, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_e

    :cond_14
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lro/a;

    invoke-direct {v1, v4, v5, v3}, Lro/a;-><init>(IILandroid/os/Bundle;)V

    return-object v1

    :pswitch_e
    new-instance v2, Lrn/a;

    invoke-direct {v2, v1}, Lrn/a;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_f
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_15

    const/4 v4, 0x1

    goto :goto_f

    :cond_15
    move v4, v5

    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    :goto_10
    if-eq v5, v6, :cond_16

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    :cond_16
    new-instance v1, Lr30/h;

    invoke-direct {v1, v4, v2, v3, v7}, Lr30/h;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    return-object v1

    :pswitch_10
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lr30/g;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v8, 0x0

    if-nez v2, :cond_17

    move-object v2, v8

    goto :goto_11

    :cond_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/f;->valueOf(Ljava/lang/String;)Lr30/f;

    move-result-object v2

    :goto_11
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

    if-nez v13, :cond_18

    goto :goto_12

    :cond_18
    sget-object v8, Lq30/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v8, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :goto_12
    move-object v13, v8

    check-cast v13, Lq30/q0;

    move-object v8, v2

    invoke-direct/range {v3 .. v13}, Lr30/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr30/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;)V

    return-object v3

    :pswitch_11
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lr30/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lr30/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_12
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_19

    const/4 v8, 0x0

    goto :goto_13

    :cond_19
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/j;->valueOf(Ljava/lang/String;)Lr30/j;

    move-result-object v2

    move-object v8, v2

    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_1a

    move v2, v9

    const/4 v9, 0x1

    goto :goto_14

    :cond_1a
    move v2, v9

    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    move-object v12, v11

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    move-object v13, v12

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    move-object v14, v13

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-eqz v15, :cond_1b

    move-object v15, v14

    const/4 v14, 0x1

    goto :goto_15

    :cond_1b
    move-object v15, v14

    move v14, v2

    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_1c

    const/4 v3, 0x0

    goto :goto_17

    :cond_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v10, 0x0

    :goto_16
    if-eq v10, v2, :cond_1d

    sget-object v0, Lr30/c;->CREATOR:Landroid/os/Parcelable$Creator;

    move/from16 v19, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v3, v10, v2}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v10

    move-object/from16 v0, p0

    move/from16 v2, v19

    goto :goto_16

    :cond_1d
    const/4 v2, 0x0

    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    const/4 v0, 0x0

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-nez v10, :cond_1e

    move-object v10, v0

    goto :goto_18

    :cond_1e
    sget-object v10, Lr30/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v10, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    :goto_18
    check-cast v10, Lr30/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v19

    if-nez v19, :cond_20

    move-object v2, v0

    move-object/from16 v21, v3

    :cond_1f
    move-object/from16 v22, v4

    goto :goto_1a

    :cond_20
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v21, v3

    const/4 v3, 0x0

    :goto_19
    if-eq v3, v0, :cond_1f

    move/from16 v20, v0

    sget-object v0, Lr30/h;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v22, v4

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v3

    move/from16 v0, v20

    move-object/from16 v4, v22

    goto :goto_19

    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v18, v10

    move-object v10, v15

    move-object/from16 v15, v21

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v4, v22

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_21

    const/4 v3, 0x0

    goto :goto_1b

    :cond_21
    sget-object v0, Lr30/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_1b
    move-object/from16 v24, v3

    check-cast v24, Lr30/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v25

    sget-object v0, Lq30/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lq30/q0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v28

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v29

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v31

    new-instance v3, Lr30/e;

    move-object/from16 v19, v2

    invoke-direct/range {v3 .. v31}, Lr30/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr30/j;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lr30/d;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr30/d;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr30/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lr30/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lq30/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lq30/q0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v8, 0x0

    if-nez v0, :cond_22

    move-object v0, v8

    goto :goto_1c

    :cond_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr30/a;->valueOf(Ljava/lang/String;)Lr30/a;

    move-result-object v0

    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-nez v10, :cond_23

    move-object v10, v8

    goto :goto_1e

    :cond_23
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(I)V

    move v14, v12

    :goto_1d
    if-eq v14, v10, :cond_24

    sget-object v15, Lr30/h;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v15, v1, v13, v14, v11}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v14

    goto :goto_1d

    :cond_24
    move-object v10, v13

    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-nez v13, :cond_25

    move-object v13, v8

    goto :goto_20

    :cond_25
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_26

    move v13, v11

    goto :goto_1f

    :cond_26
    move v13, v12

    :goto_1f
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    :goto_20
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-nez v14, :cond_27

    move-object v14, v8

    goto :goto_22

    :cond_27
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-eqz v14, :cond_28

    move v14, v11

    goto :goto_21

    :cond_28
    move v14, v12

    :goto_21
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    :goto_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-nez v15, :cond_29

    goto :goto_24

    :cond_29
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_2a

    goto :goto_23

    :cond_2a
    move v11, v12

    :goto_23
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    :goto_24
    new-instance v1, Lr30/b;

    move-object v11, v13

    move-object v12, v14

    move-object v13, v8

    move-object v8, v0

    invoke-direct/range {v1 .. v13}, Lr30/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Lr30/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1

    :pswitch_15
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const-string v2, ""

    const/4 v3, 0x0

    move-object v4, v3

    move-object v3, v2

    :goto_25
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_2e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x4

    if-eq v6, v7, :cond_2d

    const/4 v7, 0x7

    if-eq v6, v7, :cond_2c

    const/16 v7, 0x8

    if-eq v6, v7, :cond_2b

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_25

    :cond_2b
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_25

    :cond_2c
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    goto :goto_25

    :cond_2d
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_25

    :cond_2e
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;

    invoke-direct {v0, v2, v4, v3}, Lcom/google/android/gms/auth/api/signin/SignInAccount;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Ljava/lang/String;)V

    return-object v0

    :pswitch_16
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, v2

    move-object v7, v6

    move-object v11, v7

    move-object v12, v11

    move-object v14, v12

    move v5, v3

    move v8, v5

    move v9, v8

    move v10, v9

    :goto_26
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v0, :cond_2f

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_26

    :pswitch_17
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v14

    goto :goto_26

    :pswitch_18
    sget-object v2, Lro/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v2}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_26

    :pswitch_19
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v12

    goto :goto_26

    :pswitch_1a
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_26

    :pswitch_1b
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_26

    :pswitch_1c
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_26

    :pswitch_1d
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v8

    goto :goto_26

    :pswitch_1e
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Landroid/accounts/Account;

    goto :goto_26

    :pswitch_1f
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_26

    :pswitch_20
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_26

    :cond_2f
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-static {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f(Ljava/util/ArrayList;)Ljava/util/HashMap;

    move-result-object v13

    invoke-direct/range {v4 .. v14}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    return-object v4

    :pswitch_21
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v6, v2

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v14, v11

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-wide v12, v3

    :goto_27
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_30

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    int-to-char v3, v2

    packed-switch v3, :pswitch_data_2

    invoke-static {v1, v2}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_27

    :pswitch_22
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_27

    :pswitch_23
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_27

    :pswitch_24
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    move-object v15, v2

    goto :goto_27

    :pswitch_25
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v14, v2

    goto :goto_27

    :pswitch_26
    invoke-static {v1, v2}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide v12, v2

    goto :goto_27

    :pswitch_27
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_27

    :pswitch_28
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v2, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    move-object v10, v2

    goto :goto_27

    :pswitch_29
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    goto :goto_27

    :pswitch_2a
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    goto :goto_27

    :pswitch_2b
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_27

    :pswitch_2c
    invoke-static {v1, v2}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto :goto_27

    :cond_30
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v5, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-direct/range {v5 .. v17}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-object v5

    :pswitch_2d
    new-instance v0, Lqn/a;

    invoke-direct {v0, v1}, Lln/b;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_2e
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/q0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq30/q0;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_2f
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/n0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Lq30/n0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_30
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/l0;

    sget-object v2, Lt30/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt30/s;

    invoke-direct {v0, v1}, Lq30/l0;-><init>(Lt30/s;)V

    return-object v0

    :pswitch_31
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/k0;

    const-class v2, Lq30/k0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lq30/a0;

    invoke-direct {v0, v1}, Lq30/k0;-><init>(Lq30/a0;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_21
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
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
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
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq30/j0;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lsp/c;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lsp/b;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Ls40/g1;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ls40/h0;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ls40/v;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Ls40/k;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Ls40/j;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Ls40/d;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Ls00/f;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Ls00/e;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Ls00/d;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Ls00/c;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Ls/j0;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lro/a;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lrn/a;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lr30/h;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lr30/g;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lr30/d;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lr30/e;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lr30/c;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lr30/b;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/SignInAccount;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lqn/a;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lq30/q0;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lq30/n0;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lq30/l0;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lq30/k0;

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
