.class public final synthetic Lux/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;
.implements Lrm/e;
.implements Lme3/b;
.implements Lt9/r;
.implements Lk83/a;
.implements Lcq/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lux/f0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly33/c;)V
    .locals 0

    .line 2
    const/16 p1, 0xb

    iput p1, p0, Lux/f0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/os/IInterface;)Ljava/lang/Integer;
    .locals 4

    check-cast p0, Lg8/c;

    check-cast p0, Lg8/a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "androidx.health.platform.client.service.IHealthDataService"

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    iget-object p0, p0, Lg8/a;->f:Landroid/os/IBinder;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {p0, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    throw p0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 0

    const/16 p1, 0x193

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public d()[Lt9/n;
    .locals 3

    iget v0, p0, Lux/f0;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lz9/b;

    invoke-direct {v0}, Lz9/b;-><init>()V

    new-array v2, v2, [Lt9/n;

    aput-object v0, v2, v1

    return-object v2

    :pswitch_0
    new-instance v0, Ly9/b;

    invoke-direct {v0}, Ly9/b;-><init>()V

    new-array v2, v2, [Lt9/n;

    aput-object v0, v2, v1

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroid/os/Bundle;)Lrm/f;
    .locals 23

    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/16 v2, 0x24

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v6, v3

    goto :goto_0

    :cond_0
    move-object v6, v4

    :goto_0
    const/4 v3, 0x1

    invoke-static {v3, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v5

    check-cast v5, Landroid/text/Layout$Alignment;

    if-eqz v5, :cond_1

    move-object v7, v5

    goto :goto_1

    :cond_1
    move-object v7, v4

    :goto_1
    const/4 v5, 0x2

    invoke-static {v5, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v5

    check-cast v5, Landroid/text/Layout$Alignment;

    if-eqz v5, :cond_2

    move-object v8, v5

    goto :goto_2

    :cond_2
    move-object v8, v4

    :goto_2
    const/4 v5, 0x3

    invoke-static {v5, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap;

    if-eqz v5, :cond_3

    move-object v9, v5

    goto :goto_3

    :cond_3
    move-object v9, v4

    :goto_3
    const/4 v4, 0x4

    invoke-static {v4, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x5

    invoke-static {v5, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-static {v4, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v4

    invoke-static {v5, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    goto :goto_4

    :cond_4
    const v4, -0x800001

    const/high16 v5, -0x80000000

    :goto_4
    const/4 v12, 0x6

    invoke-static {v12, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-static {v12, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v12

    goto :goto_5

    :cond_5
    const/high16 v12, -0x80000000

    :goto_5
    const/4 v13, 0x7

    invoke-static {v13, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-static {v13, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v13

    goto :goto_6

    :cond_6
    const v13, -0x800001

    :goto_6
    const/16 v14, 0x8

    invoke-static {v14, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0, v15}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-static {v14, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v14

    goto :goto_7

    :cond_7
    const/high16 v14, -0x80000000

    :goto_7
    const/16 v15, 0xa

    invoke-static {v15, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x9

    invoke-static {v3, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-static {v15, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v10

    invoke-static {v3, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    move v15, v3

    goto :goto_8

    :cond_8
    const v10, -0x800001

    const/high16 v15, -0x80000000

    :goto_8
    const/16 v3, 0xb

    invoke-static {v3, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-static {v3, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v3

    goto :goto_9

    :cond_9
    const v3, -0x800001

    :goto_9
    const/16 v11, 0xc

    invoke-static {v11, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {v11, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    goto :goto_a

    :cond_a
    const v1, -0x800001

    :goto_a
    const/16 v11, 0xd

    move/from16 v17, v1

    invoke-static {v11, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {v11, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const/16 v16, 0x1

    :goto_b
    move/from16 v20, v1

    goto :goto_c

    :cond_b
    const/high16 v1, -0x1000000

    const/16 v16, 0x0

    goto :goto_b

    :goto_c
    const/16 v1, 0xe

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x0

    invoke-virtual {v0, v1, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_c

    move/from16 v19, v11

    goto :goto_d

    :cond_c
    move/from16 v19, v16

    :goto_d
    const/16 v1, 0xf

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v11

    move/from16 v21, v11

    goto :goto_e

    :cond_d
    const/high16 v21, -0x80000000

    :goto_e
    const/16 v1, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    :goto_f
    move/from16 v22, v0

    move v11, v5

    goto :goto_10

    :cond_e
    const/4 v0, 0x0

    goto :goto_f

    :goto_10
    new-instance v5, Lxn/b;

    move/from16 v16, v10

    move/from16 v18, v17

    move/from16 v17, v3

    move v10, v4

    invoke-direct/range {v5 .. v22}, Lxn/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    return-object v5
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lbz/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public log(Ljava/lang/String;)V
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/g;->y:Lb23/g;

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    const-string v2, "Video:Http"

    invoke-interface {v1, v0, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lb23/i;->c:Lb23/j;

    const/4 v3, 0x0

    invoke-interface {v1, v0, v2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 3

    iget v0, p0, Lux/f0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lcom/whoop/community/CommunityLandingHostFragment;->L(Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget v0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->x:I

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    iget-object p2, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p2, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p2

    const-string v0, "getInsets(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p2, Lv4/b;->d:I

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    sget-object p1, Lh5/q1;->b:Lh5/q1;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
