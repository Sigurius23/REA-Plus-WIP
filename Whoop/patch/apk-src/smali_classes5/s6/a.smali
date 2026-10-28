.class public abstract Ls6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# static fields
.field public static w:Lop/k;

.field public static x:Lso/q;


# direct methods
.method public static final a(Lt20/w;Lt20/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move/from16 v8, p4

    const-string v0, "usBankAccountFormArgs"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFormCompleted"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x387e336a

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v8, 0x180

    const/16 v4, 0x100

    if-nez v3, :cond_5

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_7

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v9}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    iget-object v3, v1, Lt20/w;->Z:Ln53/e;

    const/4 v10, 0x0

    invoke-static {v3, v9, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    iget-object v5, v1, Lt20/w;->d0:Ln53/e;

    invoke-static {v5, v9, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    invoke-static {v9}, Lh/g;->a(Landroidx/compose/runtime/Composer;)Lj/k;

    move-result-object v11

    const v6, 0x7352c598

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v6, v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    const/4 v14, 0x0

    if-nez v6, :cond_8

    if-ne v12, v13, :cond_9

    :cond_8
    new-instance v12, Lt20/l;

    const/4 v6, 0x0

    invoke-direct {v12, v1, v2, v14, v6}, Lt20/l;-><init>(Lt20/w;Lt20/n;Lq83/d;I)V

    invoke-virtual {v9, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v12, Lc93/m;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    sget-object v15, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v12, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, 0x7352da84

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v6, v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_a

    if-ne v12, v13, :cond_b

    :cond_a
    new-instance v12, Lt20/l;

    const/4 v6, 0x1

    invoke-direct {v12, v1, v2, v14, v6}, Lt20/l;-><init>(Lt20/w;Lt20/n;Lq83/d;I)V

    invoke-virtual {v9, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v12, Lc93/m;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    invoke-static {v9, v12, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    const v12, 0x7352f9be

    invoke-virtual {v9, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v4, :cond_c

    const/4 v0, 0x1

    goto :goto_5

    :cond_c
    move v0, v10

    :goto_5
    or-int/2addr v0, v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_d

    if-ne v4, v13, :cond_e

    :cond_d
    new-instance v4, Lo23/p;

    const/16 v0, 0x9

    invoke-direct {v4, v7, v5, v14, v0}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lc93/m;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    invoke-static {v9, v4, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x7353072d

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_f

    if-ne v4, v13, :cond_10

    :cond_f
    new-instance v4, Lt20/l;

    const/4 v0, 0x2

    invoke-direct {v4, v1, v2, v14, v0}, Lt20/l;-><init>(Lt20/w;Lt20/n;Lq83/d;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lc93/m;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    invoke-static {v9, v4, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lt20/g;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x73531abd

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_11

    if-ne v4, v13, :cond_12

    :cond_11
    new-instance v0, Ld0;

    move-object v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x7

    invoke-direct/range {v0 .. v6}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_12
    check-cast v4, Lc93/m;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    invoke-static {v12, v14, v4, v9}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    const v0, 0x73534b98

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_13

    if-ne v3, v13, :cond_14

    :cond_13
    new-instance v3, Ls90/f;

    const/4 v0, 0x7

    invoke-direct {v3, v1, v11, v2, v0}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    invoke-static {v15, v3, v9}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    :goto_6
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v0, Ls01/e;

    const/16 v5, 0xf

    move-object v3, v7

    move v4, v8

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method public static final b(I)S
    .locals 0

    ushr-int/lit8 p0, p0, 0x10

    int-to-short p0, p0

    return p0
.end method

.method public static final c(I)S
    .locals 1

    const v0, 0xffff

    and-int/2addr p0, v0

    int-to-short p0, p0

    return p0
.end method

.method public static final d(Lzd3/o;Lrf/n;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Ls;

    const/16 v1, 0x1a

    invoke-direct {p1, p0, v1}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Leu/f;

    const/16 v1, 0xa

    invoke-direct {p1, v0, v1}, Leu/f;-><init>(Lbc3/m;I)V

    invoke-virtual {p0, p1}, Lzd3/o;->d(Lud3/k;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static e(Landroid/graphics/Bitmap;)Lwp/b;
    .locals 3

    const-string v0, "image must not be null"

    invoke-static {p0, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lwp/b;

    sget-object v1, Ls6/a;->w:Lop/k;

    const-string v2, "IBitmapDescriptorFactory is not initialized"

    invoke-static {v1, v2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lop/i;

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {v2, p0}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p0, 0x6

    invoke-virtual {v1, v2, p0}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    invoke-direct {v0, v1}, Lwp/b;-><init>(Lcp/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static f(Lyb3/n;)Lty/c;
    .locals 2

    new-instance v0, Lty/c;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Lty/c;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static g(Ljava/util/Map;)I
    .locals 24

    const-string v0, "Content-Type"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    const/4 v2, -0x1

    if-nez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-static {v0}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0x15

    const/16 v5, 0x14

    const/16 v6, 0x13

    const/16 v7, 0x12

    const/16 v8, 0x11

    const/16 v9, 0x10

    const/16 v10, 0xf

    const/16 v11, 0xe

    const/16 v12, 0xd

    const/16 v13, 0xc

    const/16 v14, 0xb

    const/16 v15, 0xa

    const/16 v16, 0x9

    const/16 v17, 0x8

    const/16 v18, 0x7

    const/16 v19, 0x6

    const/16 v20, 0x5

    const/16 v21, 0x4

    const/16 v22, 0x3

    const/16 v23, 0x1

    sparse-switch v3, :sswitch_data_0

    :goto_2
    move v0, v2

    goto/16 :goto_3

    :sswitch_0
    const-string v3, "video/x-matroska"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/16 v0, 0x1f

    goto/16 :goto_3

    :sswitch_1
    const-string v3, "audio/webm"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    const/16 v0, 0x1e

    goto/16 :goto_3

    :sswitch_2
    const-string v3, "audio/mpeg"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    const/16 v0, 0x1d

    goto/16 :goto_3

    :sswitch_3
    const-string v3, "audio/midi"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    const/16 v0, 0x1c

    goto/16 :goto_3

    :sswitch_4
    const-string v3, "audio/flac"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    const/16 v0, 0x1b

    goto/16 :goto_3

    :sswitch_5
    const-string v3, "audio/eac3"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_2

    :cond_8
    const/16 v0, 0x1a

    goto/16 :goto_3

    :sswitch_6
    const-string v3, "audio/3gpp"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_2

    :cond_9
    const/16 v0, 0x19

    goto/16 :goto_3

    :sswitch_7
    const-string v3, "video/mp4"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_2

    :cond_a
    const/16 v0, 0x18

    goto/16 :goto_3

    :sswitch_8
    const-string v3, "audio/wav"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_2

    :cond_b
    const/16 v0, 0x17

    goto/16 :goto_3

    :sswitch_9
    const-string v3, "audio/ogg"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_2

    :cond_c
    const/16 v0, 0x16

    goto/16 :goto_3

    :sswitch_a
    const-string v3, "audio/mp4"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_2

    :cond_d
    move v0, v4

    goto/16 :goto_3

    :sswitch_b
    const-string v3, "audio/amr"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_2

    :cond_e
    move v0, v5

    goto/16 :goto_3

    :sswitch_c
    const-string v3, "audio/ac4"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_2

    :cond_f
    move v0, v6

    goto/16 :goto_3

    :sswitch_d
    const-string v3, "audio/ac3"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_2

    :cond_10
    move v0, v7

    goto/16 :goto_3

    :sswitch_e
    const-string v3, "video/x-flv"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_2

    :cond_11
    move v0, v8

    goto/16 :goto_3

    :sswitch_f
    const-string v3, "application/webm"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_2

    :cond_12
    move v0, v9

    goto/16 :goto_3

    :sswitch_10
    const-string v3, "audio/x-matroska"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_2

    :cond_13
    move v0, v10

    goto/16 :goto_3

    :sswitch_11
    const-string v3, "image/png"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_2

    :cond_14
    move v0, v11

    goto/16 :goto_3

    :sswitch_12
    const-string v3, "image/bmp"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_2

    :cond_15
    move v0, v12

    goto/16 :goto_3

    :sswitch_13
    const-string v3, "text/vtt"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_2

    :cond_16
    move v0, v13

    goto/16 :goto_3

    :sswitch_14
    const-string v3, "video/x-msvideo"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_2

    :cond_17
    move v0, v14

    goto/16 :goto_3

    :sswitch_15
    const-string v3, "application/mp4"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_2

    :cond_18
    move v0, v15

    goto/16 :goto_3

    :sswitch_16
    const-string v3, "image/webp"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_2

    :cond_19
    move/from16 v0, v16

    goto/16 :goto_3

    :sswitch_17
    const-string v3, "image/jpeg"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_2

    :cond_1a
    move/from16 v0, v17

    goto/16 :goto_3

    :sswitch_18
    const-string v3, "image/heif"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_2

    :cond_1b
    move/from16 v0, v18

    goto :goto_3

    :sswitch_19
    const-string v3, "image/heic"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_2

    :cond_1c
    move/from16 v0, v19

    goto :goto_3

    :sswitch_1a
    const-string v3, "image/avif"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_2

    :cond_1d
    move/from16 v0, v20

    goto :goto_3

    :sswitch_1b
    const-string v3, "audio/amr-wb"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_2

    :cond_1e
    move/from16 v0, v21

    goto :goto_3

    :sswitch_1c
    const-string v3, "video/webm"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_2

    :cond_1f
    move/from16 v0, v22

    goto :goto_3

    :sswitch_1d
    const-string v3, "video/mp2t"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_2

    :cond_20
    const/4 v0, 0x2

    goto :goto_3

    :sswitch_1e
    const-string v3, "video/mp2p"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_2

    :cond_21
    move/from16 v0, v23

    goto :goto_3

    :sswitch_1f
    const-string v3, "audio/eac3-joc"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_2

    :cond_22
    move v0, v1

    :goto_3
    packed-switch v0, :pswitch_data_0

    :goto_4
    return v2

    :pswitch_0
    return v18

    :pswitch_1
    return v10

    :pswitch_2
    return v21

    :pswitch_3
    return v13

    :pswitch_4
    return v16

    :pswitch_5
    return v23

    :pswitch_6
    return v20

    :pswitch_7
    return v8

    :pswitch_8
    return v6

    :pswitch_9
    return v12

    :pswitch_a
    return v9

    :pswitch_b
    return v17

    :pswitch_c
    return v7

    :pswitch_d
    return v11

    :pswitch_e
    return v5

    :pswitch_f
    return v4

    :pswitch_10
    return v22

    :pswitch_11
    return v19

    :pswitch_12
    return v14

    :pswitch_13
    return v15

    :pswitch_14
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_1f
        -0x6315f78b -> :sswitch_1e
        -0x6315f787 -> :sswitch_1d
        -0x63118f53 -> :sswitch_1c
        -0x5fc6f775 -> :sswitch_1b
        -0x58abd7ba -> :sswitch_1a
        -0x58a8e8f5 -> :sswitch_19
        -0x58a8e8f2 -> :sswitch_18
        -0x58a7d764 -> :sswitch_17
        -0x58a21830 -> :sswitch_16
        -0x4a681e4e -> :sswitch_15
        -0x405dba54 -> :sswitch_14
        -0x3be2f26c -> :sswitch_13
        -0x3468a12f -> :sswitch_12
        -0x34686c8b -> :sswitch_11
        -0x17118226 -> :sswitch_10
        -0x2974308 -> :sswitch_f
        0xd45707 -> :sswitch_e
        0xb269698 -> :sswitch_d
        0xb269699 -> :sswitch_c
        0xb26980d -> :sswitch_b
        0xb26c538 -> :sswitch_a
        0xb26cbd6 -> :sswitch_9
        0xb26e933 -> :sswitch_8
        0x4f62635d -> :sswitch_7
        0x59976a2d -> :sswitch_6
        0x59ae0c65 -> :sswitch_5
        0x59aeaa01 -> :sswitch_4
        0x59b1cdba -> :sswitch_3
        0x59b1e81e -> :sswitch_2
        0x59b64a32 -> :sswitch_1
        0x79909c15 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_11
        :pswitch_11
        :pswitch_6
        :pswitch_14
        :pswitch_5
        :pswitch_10
        :pswitch_b
        :pswitch_4
        :pswitch_3
        :pswitch_b
        :pswitch_10
        :pswitch_14
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_11
        :pswitch_11
    .end packed-switch
.end method

.method public static h(Landroid/net/Uri;)I
    .locals 6

    invoke-virtual {p0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p0

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, ".ac3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_23

    const-string v1, ".ec3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_c

    :cond_1
    const-string v1, ".ac4"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const-string v1, ".adts"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_22

    const-string v1, ".aac"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_b

    :cond_3
    const-string v1, ".amr"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p0, 0x3

    return p0

    :cond_4
    const-string v1, ".flac"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_5

    return v2

    :cond_5
    const-string v1, ".flv"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x5

    if-eqz v1, :cond_6

    return v3

    :cond_6
    const-string v1, ".mid"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_21

    const-string v1, ".midi"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_21

    const-string v1, ".smf"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto/16 :goto_a

    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    const-string v4, ".mk"

    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_20

    const-string v1, ".webm"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v1, ".mp3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 p0, 0x7

    return p0

    :cond_9
    const-string v1, ".mp4"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1f

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    const-string v5, ".m4"

    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v4

    if-nez v4, :cond_1f

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_1f

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v3

    const-string v3, ".cmf"

    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto/16 :goto_8

    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    const-string v3, ".og"

    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_1e

    const-string v1, ".opus"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto/16 :goto_7

    :cond_b
    const-string v1, ".ps"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1d

    const-string v1, ".mpeg"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1d

    const-string v1, ".mpg"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1d

    const-string v1, ".m2p"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto/16 :goto_6

    :cond_c
    const-string v1, ".ts"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1c

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_d

    goto/16 :goto_5

    :cond_d
    const-string v1, ".wav"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1b

    const-string v1, ".wave"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto/16 :goto_4

    :cond_e
    const-string v1, ".vtt"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1a

    const-string v1, ".webvtt"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_3

    :cond_f
    const-string v1, ".jpg"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_19

    const-string v1, ".jpeg"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_2

    :cond_10
    const-string v1, ".avi"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    const/16 p0, 0x10

    return p0

    :cond_11
    const-string v1, ".png"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/16 p0, 0x11

    return p0

    :cond_12
    const-string v1, ".webp"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    const/16 p0, 0x12

    return p0

    :cond_13
    const-string v1, ".bmp"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_18

    const-string v1, ".dib"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_1

    :cond_14
    const-string v1, ".heic"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    const-string v1, ".heif"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_0

    :cond_15
    const-string v1, ".avif"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_16

    const/16 p0, 0x15

    return p0

    :cond_16
    return v0

    :cond_17
    :goto_0
    const/16 p0, 0x14

    return p0

    :cond_18
    :goto_1
    const/16 p0, 0x13

    return p0

    :cond_19
    :goto_2
    const/16 p0, 0xe

    return p0

    :cond_1a
    :goto_3
    const/16 p0, 0xd

    return p0

    :cond_1b
    :goto_4
    const/16 p0, 0xc

    return p0

    :cond_1c
    :goto_5
    const/16 p0, 0xb

    return p0

    :cond_1d
    :goto_6
    const/16 p0, 0xa

    return p0

    :cond_1e
    :goto_7
    const/16 p0, 0x9

    return p0

    :cond_1f
    :goto_8
    const/16 p0, 0x8

    return p0

    :cond_20
    :goto_9
    const/4 p0, 0x6

    return p0

    :cond_21
    :goto_a
    const/16 p0, 0xf

    return p0

    :cond_22
    :goto_b
    const/4 p0, 0x2

    return p0

    :cond_23
    :goto_c
    const/4 p0, 0x0

    return p0
.end method

.method public static i(Lorg/json/JSONObject;)Ly00/y6;
    .locals 13

    new-instance v0, Ly00/y6;

    const-string v1, "address_line1_check"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "address_zip_check"

    invoke-static {v2, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "brand"

    invoke-static {v3, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ly00/g;->b(Ljava/lang/String;)Ly00/i;

    move-result-object v3

    const-string v4, "country"

    invoke-static {v4, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "cvc_check"

    invoke-static {v5, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "dynamic_last4"

    invoke-static {v6, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "exp_month"

    invoke-virtual {p0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_0

    move-object v7, v9

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_0
    const-string v8, "exp_year"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_1

    :goto_1
    move-object v8, v9

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_1

    :goto_2
    sget-object v9, Ly00/j;->x:Lt9/p;

    const-string v10, "funding"

    invoke-static {v10, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Lt9/p;->k(Ljava/lang/String;)Ly00/j;

    move-result-object v9

    const-string v10, "last4"

    invoke-static {v10, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ly00/h8;->x:Lt9/c0;

    const-string v12, "tokenization_method"

    invoke-static {v12, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lt9/c0;->m(Ljava/lang/String;)Ly00/h8;

    move-result-object v11

    invoke-direct/range {v0 .. v11}, Ly00/y6;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ly00/j;Ljava/lang/String;Ly00/h8;)V

    return-object v0
.end method

.method public static final j(Ly00/u1;)Lv00/i0;
    .locals 1

    iget-object p0, p0, Ly00/u1;->H:Ly00/p1;

    if-eqz p0, :cond_0

    iget-object p0, p0, Ly00/p1;->y:Ly00/o1;

    if-eqz p0, :cond_0

    iget-object p0, p0, Ly00/o1;->F:Ly00/n1;

    if-eqz p0, :cond_0

    iget-object p0, p0, Ly00/n1;->w:Ly00/k1;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    instance-of v0, p0, Ly00/j1;

    if-eqz v0, :cond_2

    check-cast p0, Ly00/j1;

    iget-boolean v0, p0, Ly00/j1;->w:Z

    if-eqz v0, :cond_1

    sget-object p0, Lv00/f0;->w:Lv00/f0;

    return-object p0

    :cond_1
    new-instance v0, Lv00/e0;

    iget-object p0, p0, Ly00/j1;->z:Ly00/r3;

    invoke-direct {v0, p0}, Lv00/e0;-><init>(Ly00/r3;)V

    return-object v0

    :cond_2
    instance-of v0, p0, Ly00/i1;

    if-nez v0, :cond_4

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :goto_1
    sget-object p0, Lv00/h0;->w:Lv00/h0;

    return-object p0
.end method

.method public static final k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lbi/k;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p2, v1, v2}, Lbi/k;-><init>(Lc93/m;Lq83/d;I)V

    sget-object p2, Ly6/h;->a:Ly6/h;

    invoke-static {p0, p2, p1, v0, p3}, Ls6/a;->l(Landroid/content/Context;Ly6/g;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroid/content/Context;Ly6/g;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lp6/b;

    if-eqz v0, :cond_0

    sget-object v1, Ly6/f;->a:Ly6/f;

    check-cast p2, Lp6/b;

    iget p2, p2, Lp6/b;->a:I

    invoke-static {p2}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object v4

    move-object v2, p0

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Ly6/f;->d(Landroid/content/Context;Ly6/g;Ljava/lang/String;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The glance ID is not the one of an App Widget"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
