.class public final synthetic Lio/getstream/chat/android/ui/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a;
.implements Lo9/n;
.implements Lcq/e;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lio/getstream/chat/android/ui/utils/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/ui/utils/a;->z:Ljava/lang/Object;

    iput-object p3, p0, Lio/getstream/chat/android/ui/utils/a;->x:Ljava/lang/Object;

    iput-object p4, p0, Lio/getstream/chat/android/ui/utils/a;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo9/j;Ljava/lang/String;[ILandroid/graphics/Point;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/ui/utils/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/ui/utils/a;->x:Ljava/lang/Object;

    iput-object p3, p0, Lio/getstream/chat/android/ui/utils/a;->z:Ljava/lang/Object;

    iput-object p4, p0, Lio/getstream/chat/android/ui/utils/a;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcx/c;Ljava/util/List;)V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/a;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/a;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/a;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/a;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->a(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcx/c;Ljava/util/List;)V

    return-void
.end method

.method public c(ILu8/p0;[I)Lzr/w0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    iget-object v1, v0, Lio/getstream/chat/android/ui/utils/a;->y:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lo9/j;

    iget-object v1, v0, Lio/getstream/chat/android/ui/utils/a;->x:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    iget-object v1, v0, Lio/getstream/chat/android/ui/utils/a;->z:Ljava/lang/Object;

    check-cast v1, [I

    iget-object v2, v0, Lio/getstream/chat/android/ui/utils/a;->E:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Point;

    aget v8, v1, p1

    if-eqz v2, :cond_0

    iget v1, v2, Landroid/graphics/Point;->x:I

    goto :goto_0

    :cond_0
    iget v1, v5, Lu8/t0;->e:I

    :goto_0
    if-eqz v2, :cond_1

    iget v2, v2, Landroid/graphics/Point;->y:I

    goto :goto_1

    :cond_1
    iget v2, v5, Lu8/t0;->f:I

    :goto_1
    iget-boolean v4, v5, Lu8/t0;->h:Z

    const v10, 0x7fffffff

    if-eq v1, v10, :cond_9

    if-ne v2, v10, :cond_2

    goto/16 :goto_7

    :cond_2
    move v9, v10

    const/4 v6, 0x0

    :goto_2
    iget v13, v3, Lu8/p0;->a:I

    if-ge v6, v13, :cond_8

    iget-object v13, v3, Lu8/p0;->d:[Lu8/p;

    aget-object v13, v13, v6

    iget v14, v13, Lu8/p;->u:I

    iget v15, v13, Lu8/p;->v:I

    if-lez v14, :cond_7

    if-lez v15, :cond_7

    if-eqz v4, :cond_5

    if-le v14, v15, :cond_3

    const/4 v11, 0x1

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    :goto_3
    if-le v1, v2, :cond_4

    const/4 v12, 0x1

    goto :goto_4

    :cond_4
    const/4 v12, 0x0

    :goto_4
    if-eq v11, v12, :cond_5

    move v11, v1

    move v12, v2

    goto :goto_5

    :cond_5
    move v12, v1

    move v11, v2

    :goto_5
    mul-int v10, v14, v11

    mul-int v0, v15, v12

    if-lt v10, v0, :cond_6

    new-instance v10, Landroid/graphics/Point;

    invoke-static {v0, v14}, Lx8/t;->e(II)I

    move-result v0

    invoke-direct {v10, v12, v0}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_6

    :cond_6
    new-instance v0, Landroid/graphics/Point;

    invoke-static {v10, v15}, Lx8/t;->e(II)I

    move-result v10

    invoke-direct {v0, v10, v11}, Landroid/graphics/Point;-><init>(II)V

    move-object v10, v0

    :goto_6
    iget v0, v13, Lu8/p;->u:I

    mul-int v11, v0, v15

    iget v12, v10, Landroid/graphics/Point;->x:I

    int-to-float v12, v12

    const v13, 0x3f7ae148    # 0.98f

    mul-float/2addr v12, v13

    float-to-int v12, v12

    if-lt v0, v12, :cond_7

    iget v0, v10, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    mul-float/2addr v0, v13

    float-to-int v0, v0

    if-lt v15, v0, :cond_7

    if-ge v11, v9, :cond_7

    move v9, v11

    :cond_7
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    const v10, 0x7fffffff

    goto :goto_2

    :cond_8
    move v0, v9

    goto :goto_8

    :cond_9
    :goto_7
    const v0, 0x7fffffff

    :goto_8
    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v10

    const/4 v4, 0x0

    :goto_9
    iget v1, v3, Lu8/p0;->a:I

    if-ge v4, v1, :cond_e

    iget-object v1, v3, Lu8/p0;->d:[Lu8/p;

    aget-object v1, v1, v4

    iget v2, v1, Lu8/p;->u:I

    const/4 v6, -0x1

    if-eq v2, v6, :cond_b

    iget v1, v1, Lu8/p;->v:I

    if-ne v1, v6, :cond_a

    goto :goto_b

    :cond_a
    mul-int/2addr v2, v1

    :goto_a
    const v11, 0x7fffffff

    goto :goto_c

    :cond_b
    :goto_b
    move v2, v6

    goto :goto_a

    :goto_c
    if-eq v0, v11, :cond_d

    if-eq v2, v6, :cond_c

    if-gt v2, v0, :cond_c

    goto :goto_d

    :cond_c
    const/4 v9, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 v9, 0x1

    :goto_e
    new-instance v1, Lo9/p;

    aget v6, p3, v4

    move/from16 v2, p1

    invoke-direct/range {v1 .. v9}, Lo9/p;-><init>(ILu8/p0;ILo9/j;ILjava/lang/String;IZ)V

    invoke-virtual {v10, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v3, p2

    goto :goto_9

    :cond_e
    invoke-virtual {v10}, Lzr/d0;->f()Lzr/w0;

    move-result-object v0

    return-object v0
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/ui/utils/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/a;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

    iget-object v1, p0, Lio/getstream/chat/android/ui/utils/a;->z:Ljava/lang/Object;

    check-cast v1, Landroid/os/CancellationSignal;

    iget-object v2, p0, Lio/getstream/chat/android/ui/utils/a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lio/getstream/chat/android/ui/utils/a;->E:Ljava/lang/Object;

    check-cast v3, Lm5/g;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$DXdUqnt3NaHNieUz1yrHmEmv-IE(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;Ljava/lang/Exception;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/a;->y:Ljava/lang/Object;

    check-cast v0, Lj/d;

    iget-object v1, p0, Lio/getstream/chat/android/ui/utils/a;->z:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, Lio/getstream/chat/android/ui/utils/a;->x:Ljava/lang/Object;

    check-cast v2, Lor2/y0;

    iget-object v3, p0, Lio/getstream/chat/android/ui/utils/a;->E:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    invoke-static {v0, v1, v2, v3, p1}, Lor2/y0;->d(Lj/d;Landroid/app/Activity;Lor2/y0;Lc93/a;Ljava/lang/Exception;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
