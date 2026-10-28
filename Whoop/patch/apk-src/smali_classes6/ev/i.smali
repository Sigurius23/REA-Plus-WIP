.class public final Lev/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static synthetic j:[I


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj93/d;Lj93/d;)V
    .locals 1

    const-string v0, "inputType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outputType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lev/i;->a:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, Lev/i;->b:Ljava/lang/Object;

    .line 28
    new-instance p1, Lb30/m;

    const/16 p2, 0x14

    .line 29
    invoke-direct {p1, p2}, Lb30/m;-><init>(I)V

    .line 30
    sget-object p2, Lmg/h;->a:Lmg/g;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lmg/g;->b:Lmg/f;

    iput-object p2, p1, Lb30/m;->x:Ljava/lang/Object;

    .line 31
    sget-object p2, Lrg/d;->x:Lrg/d;

    iput-object p2, p1, Lb30/m;->y:Ljava/lang/Object;

    .line 32
    sget-object p2, Lgf/i;->w:Lgf/i;

    iput-object p2, p1, Lb30/m;->z:Ljava/lang/Object;

    .line 33
    sget-object p2, Luf/t;->n:Luf/t;

    .line 34
    iput-object p2, p1, Lb30/m;->E:Ljava/lang/Object;

    .line 35
    iput-object p1, p0, Lev/i;->c:Ljava/lang/Object;

    .line 36
    new-instance p1, Lio/sentry/android/replay/video/d;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lio/sentry/android/replay/video/d;-><init>(I)V

    iput-object p1, p0, Lev/i;->f:Ljava/lang/Object;

    .line 37
    new-instance p1, Ldg/a;

    invoke-direct {p1}, Ldg/a;-><init>()V

    iput-object p1, p0, Lev/i;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lev/i;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Lzg/a;

    .line 4
    invoke-direct {v0, p0, p1}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    .line 5
    iput-object v0, p0, Lev/i;->b:Ljava/lang/Object;

    .line 6
    new-instance v0, Lzg/b;

    .line 7
    invoke-direct {v0, p0, p1}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    .line 8
    iput-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    .line 9
    new-instance v0, Lzg/a;

    .line 10
    invoke-direct {v0, p0, p1}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    .line 11
    iput-object v0, p0, Lev/i;->d:Ljava/lang/Object;

    .line 12
    new-instance v0, Lzg/a;

    .line 13
    invoke-direct {v0, p0, p1}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    .line 14
    iput-object v0, p0, Lev/i;->e:Ljava/lang/Object;

    .line 15
    new-instance v0, Lzg/a;

    .line 16
    invoke-direct {v0, p0, p1}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    .line 17
    iput-object v0, p0, Lev/i;->f:Ljava/lang/Object;

    .line 18
    new-instance v0, Lzg/a;

    .line 19
    invoke-direct {v0, p0, p1}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    .line 20
    iput-object v0, p0, Lev/i;->g:Ljava/lang/Object;

    .line 21
    new-instance v0, Lzg/a;

    .line 22
    invoke-direct {v0, p0, p1}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    .line 23
    iput-object v0, p0, Lev/i;->h:Ljava/lang/Object;

    .line 24
    new-instance v0, Lzg/c;

    invoke-direct {v0, p0, p1}, Lzg/c;-><init>(Lev/i;Ljava/io/ByteArrayInputStream;)V

    iput-object v0, p0, Lev/i;->i:Ljava/lang/Object;

    return-void
.end method

.method public static l(Landroid/widget/FrameLayout;)V
    .locals 8

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v2

    invoke-static {v1, v2}, Luo/o;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2}, Luo/o;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v6, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p0, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, v2, p0}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const v2, 0x1020019

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Lcp/d;

    invoke-direct {v2, v1, p0}, Lcp/d;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lm63/d;
    .locals 9

    iget-object v0, p0, Lev/i;->g:Ljava/lang/Object;

    check-cast v0, Ldg/a;

    iget-object v1, p0, Lev/i;->d:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Luf/l;

    if-eqz v5, :cond_3

    iget-object v1, p0, Lev/i;->e:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Luf/h;

    if-eqz v6, :cond_2

    iget-object v1, p0, Lev/i;->h:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lev/i;->i:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    sget-object v2, Lcf/l;->a:Lgf/a;

    invoke-virtual {v0, v2, v1}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    sget-object v1, Lcf/l;->b:Lgf/a;

    iget-object v2, p0, Lev/i;->i:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v7, Luf/v;

    iget-object v0, p0, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Lj93/d;

    iget-object v1, p0, Lev/i;->b:Ljava/lang/Object;

    check-cast v1, Lj93/d;

    invoke-direct {v7, v0, v1}, Luf/v;-><init>(Lj93/d;Lj93/d;)V

    new-instance v2, Lm63/d;

    iget-object v0, p0, Lev/i;->f:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lio/sentry/android/replay/video/d;

    iget-object v0, p0, Lev/i;->g:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ldg/a;

    iget-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lb30/m;

    invoke-direct/range {v2 .. v8}, Lm63/d;-><init>(Lio/sentry/android/replay/video/d;Ldg/a;Luf/l;Luf/h;Luf/v;Lb30/m;)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "serviceName is a required HTTP execution attribute"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "operationName is a required HTTP execution attribute"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SdkHttpOperation.deserializeWith must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SdkHttpOperation.serializeWith must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lib/n;
    .locals 6

    iget-object v0, p0, Lev/i;->g:Ljava/lang/Object;

    check-cast v0, Lg73/a;

    iget-object v1, p0, Lev/i;->e:Ljava/lang/Object;

    check-cast v1, Lib/n;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lib/n;->g()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    iget-object v2, p0, Lev/i;->f:Ljava/lang/Object;

    check-cast v2, Lib/j;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v0}, Lib/j;->d(Lib/h;)V

    :cond_2
    iget-object v2, p0, Lev/i;->h:Ljava/lang/Object;

    check-cast v2, Lcom/squareup/wire/n;

    invoke-virtual {v2}, Lcom/squareup/wire/n;->s()Lib/j;

    move-result-object v2

    iput-object v2, p0, Lev/i;->f:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Lib/j;->a(Lib/h;)V

    iget-object v2, p0, Lev/i;->f:Ljava/lang/Object;

    check-cast v2, Lib/j;

    iget-object v3, p0, Lev/i;->i:Ljava/lang/Object;

    check-cast v3, Lib/m;

    if-eqz v2, :cond_7

    sget v4, Lib/n;->K:I

    invoke-virtual {v2}, Lib/j;->b()Z

    move-result v4

    if-nez v4, :cond_5

    iget-boolean v4, v3, Lib/m;->c:Z

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    new-instance v4, Lib/c0;

    check-cast v2, Lib/a0;

    if-eqz v1, :cond_4

    move-object v5, v1

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    invoke-direct {v4, v2, v3, v5}, Lib/c0;-><init>(Lib/a0;Lib/m;I)V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-virtual {v2}, Lib/j;->b()Z

    move-result v4

    const/4 v5, -0x1

    if-nez v4, :cond_6

    check-cast v2, Lib/a0;

    invoke-virtual {v2}, Lib/a0;->k()Lib/d;

    move-result-object v2

    if-eqz v1, :cond_6

    move-object v4, v1

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_6
    check-cast v2, Lib/d;

    new-instance v4, Lib/g;

    invoke-direct {v4, v2, v3, v1, v5}, Lib/g;-><init>(Lib/d;Lib/m;Ljava/lang/Object;I)V

    :goto_3
    iput-object v4, p0, Lev/i;->e:Ljava/lang/Object;

    invoke-virtual {v4}, Lib/n;->l()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lev/i;->e:Ljava/lang/Object;

    check-cast v0, Lib/n;

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DataSource may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lah/d;
    .locals 22

    move-object/from16 v1, p0

    :try_start_0
    iget-object v0, v1, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return-object v2

    :cond_0
    sget-object v4, Lev/i;->j:[I

    const/16 v5, 0x9

    const/4 v6, 0x2

    const/4 v7, 0x3

    const/4 v8, 0x4

    const/4 v9, 0x5

    const/4 v10, 0x6

    const/4 v11, 0x7

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v5}, Le4/p;->f(I)[I

    move-result-object v4

    array-length v4, v4

    new-array v4, v4, [I

    :try_start_1
    aput v10, v4, v9
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    aput v8, v4, v7
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :try_start_3
    aput v14, v4, v13
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    aput v11, v4, v10
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :try_start_5
    aput v7, v4, v6
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_4

    :catch_4
    :try_start_6
    aput v5, v4, v12
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_5

    :catch_5
    :try_start_7
    aput v12, v4, v11
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_6

    :catch_6
    :try_start_8
    aput v9, v4, v8
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_7

    :catch_7
    :try_start_9
    aput v6, v4, v14
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_8

    :catch_8
    sput-object v4, Lev/i;->j:[I

    :goto_0
    shr-int/lit8 v15, v0, 0x5

    packed-switch v15, :pswitch_data_0

    move v5, v14

    goto :goto_1

    :pswitch_0
    move v5, v12

    goto :goto_1

    :pswitch_1
    move v5, v11

    goto :goto_1

    :pswitch_2
    move v5, v10

    goto :goto_1

    :pswitch_3
    move v5, v9

    goto :goto_1

    :pswitch_4
    move v5, v8

    goto :goto_1

    :pswitch_5
    move v5, v7

    goto :goto_1

    :pswitch_6
    move v5, v6

    :goto_1
    :pswitch_7
    invoke-static {v5}, Le4/p;->e(I)I

    move-result v5

    aget v4, v4, v5

    const-string v5, "Unexpected major type "

    const-wide/16 v15, 0x1

    const-wide/16 v17, 0x0

    const-wide/16 v19, -0x1

    const-string v2, "Unexpected end of stream"

    packed-switch v4, :pswitch_data_1

    new-instance v2, Lco/nstant/in/cbor/CborException;

    const-string v3, "Not implemented major type "

    invoke-static {v0, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_8
    iget-object v2, v1, Lev/i;->i:Ljava/lang/Object;

    check-cast v2, Lzg/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x1f

    and-int/2addr v0, v4

    sget-object v5, Lah/l;->y:Lah/l;

    sget-object v15, Lah/l;->z:Lah/l;

    packed-switch v0, :pswitch_data_2

    sget-object v16, Lah/l;->w:Lah/l;

    goto :goto_2

    :pswitch_9
    sget-object v16, Lah/l;->G:Lah/l;

    goto :goto_2

    :pswitch_a
    sget-object v16, Lah/l;->F:Lah/l;

    goto :goto_2

    :pswitch_b
    sget-object v16, Lah/l;->E:Lah/l;

    goto :goto_2

    :pswitch_c
    move-object/from16 v16, v15

    goto :goto_2

    :pswitch_d
    move-object/from16 v16, v5

    goto :goto_2

    :pswitch_e
    sget-object v16, Lah/l;->x:Lah/l;

    :goto_2
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    move/from16 v21, v11

    const-string v11, "Not implemented"

    if-eqz v3, :cond_d

    if-eq v3, v14, :cond_c

    if-eq v3, v6, :cond_5

    if-eq v3, v7, :cond_4

    if-eq v3, v8, :cond_3

    if-ne v3, v10, :cond_2

    sget-object v0, Lah/k;->d:Lah/k;

    goto/16 :goto_a

    :cond_2
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, v2, Lzg/c;->f:Lzg/a;

    invoke-virtual {v0, v12}, Lb3/b;->A(I)[B

    move-result-object v0

    aget-byte v2, v0, v13

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    shl-long/2addr v2, v12

    aget-byte v4, v0, v14

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    shl-long/2addr v2, v12

    aget-byte v4, v0, v6

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    shl-long/2addr v2, v12

    aget-byte v4, v0, v7

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    shl-long/2addr v2, v12

    aget-byte v4, v0, v8

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    shl-long/2addr v2, v12

    aget-byte v4, v0, v9

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    shl-long/2addr v2, v12

    aget-byte v4, v0, v10

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    or-long/2addr v2, v4

    shl-long/2addr v2, v12

    aget-byte v0, v0, v21

    and-int/lit16 v0, v0, 0xff

    int-to-long v4, v0

    or-long/2addr v2, v4

    new-instance v0, Lah/e;

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Lah/e;-><init>(D)V

    goto/16 :goto_a

    :cond_4
    iget-object v0, v2, Lzg/c;->e:Lzg/a;

    invoke-virtual {v0, v8}, Lb3/b;->A(I)[B

    move-result-object v0

    aget-byte v2, v0, v13

    and-int/lit16 v2, v2, 0xff

    shl-int/2addr v2, v12

    aget-byte v3, v0, v14

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    shl-int/2addr v2, v12

    aget-byte v3, v0, v6

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    shl-int/2addr v2, v12

    aget-byte v0, v0, v7

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    new-instance v2, Lah/f;

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-direct {v2, v15, v0}, Lah/f;-><init>(Lah/l;F)V

    :goto_3
    move-object v0, v2

    goto/16 :goto_a

    :cond_5
    iget-object v0, v2, Lzg/c;->d:Lzg/a;

    invoke-virtual {v0, v6}, Lb3/b;->A(I)[B

    move-result-object v0

    aget-byte v2, v0, v13

    and-int/lit16 v2, v2, 0xff

    shl-int/2addr v2, v12

    aget-byte v0, v0, v14

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    new-instance v2, Lah/f;

    const v3, 0x8000

    and-int/2addr v3, v0

    shr-int/lit8 v3, v3, 0xf

    and-int/lit16 v6, v0, 0x7c00

    shr-int/lit8 v6, v6, 0xa

    and-int/lit16 v0, v0, 0x3ff

    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    if-nez v6, :cond_7

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    goto :goto_4

    :cond_6
    move v3, v14

    :goto_4
    int-to-double v3, v3

    const-wide/high16 v11, -0x3fd4000000000000L    # -14.0

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    mul-double/2addr v11, v3

    int-to-double v3, v0

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    div-double/2addr v3, v6

    :goto_5
    mul-double/2addr v3, v11

    double-to-float v0, v3

    goto :goto_8

    :cond_7
    if-ne v6, v4, :cond_a

    if-eqz v0, :cond_8

    const/high16 v0, 0x7fc00000    # Float.NaN

    goto :goto_8

    :cond_8
    if-eqz v3, :cond_9

    const/4 v3, -0x1

    goto :goto_6

    :cond_9
    move v3, v14

    :goto_6
    int-to-float v0, v3

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    mul-float/2addr v0, v3

    goto :goto_8

    :cond_a
    if-eqz v3, :cond_b

    const/4 v3, -0x1

    goto :goto_7

    :cond_b
    move v3, v14

    :goto_7
    int-to-double v3, v3

    add-int/lit8 v6, v6, -0xf

    int-to-double v11, v6

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    mul-double/2addr v11, v3

    int-to-double v3, v0

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    div-double/2addr v3, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v3, v6

    goto :goto_5

    :goto_8
    invoke-direct {v2, v5, v0}, Lah/f;-><init>(Lah/l;F)V

    goto :goto_3

    :cond_c
    new-instance v0, Lah/j;

    invoke-virtual {v2}, Lb3/b;->z()I

    move-result v2

    invoke-direct {v0, v2}, Lah/j;-><init>(I)V

    goto :goto_a

    :cond_d
    packed-switch v0, :pswitch_data_3

    move v8, v10

    goto :goto_9

    :pswitch_f
    move v8, v9

    goto :goto_9

    :pswitch_10
    move v8, v7

    goto :goto_9

    :pswitch_11
    move v8, v6

    goto :goto_9

    :pswitch_12
    move v8, v14

    :goto_9
    :pswitch_13
    invoke-static {v8}, Le4/p;->e(I)I

    move-result v2

    if-eqz v2, :cond_12

    if-eq v2, v14, :cond_11

    if-eq v2, v6, :cond_10

    if-eq v2, v7, :cond_f

    if-ne v2, v9, :cond_e

    new-instance v2, Lah/j;

    invoke-direct {v2, v0}, Lah/j;-><init>(I)V

    goto/16 :goto_3

    :cond_e
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    sget-object v0, Lah/j;->j:Lah/j;

    goto :goto_a

    :cond_10
    sget-object v0, Lah/j;->i:Lah/j;

    goto :goto_a

    :cond_11
    sget-object v0, Lah/j;->h:Lah/j;

    goto :goto_a

    :cond_12
    sget-object v0, Lah/j;->g:Lah/j;

    :goto_a
    return-object v0

    :pswitch_14
    iget-object v2, v1, Lev/i;->h:Ljava/lang/Object;

    check-cast v2, Lzg/a;

    new-instance v3, Lah/m;

    invoke-virtual {v2, v0}, Lb3/b;->p(I)J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lah/m;-><init>(J)V

    invoke-virtual {v1}, Lev/i;->c()Lah/d;

    move-result-object v0

    if-eqz v0, :cond_1f

    iget-wide v4, v3, Lah/m;->c:J

    const-wide/16 v7, 0x1e

    cmp-long v2, v4, v7

    if-nez v2, :cond_18

    instance-of v2, v0, Lah/a;

    if-eqz v2, :cond_17

    check-cast v0, Lah/a;

    iget-object v0, v0, Lah/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v2, v6, :cond_16

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lah/d;

    instance-of v3, v2, Lah/i;

    if-eqz v3, :cond_15

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lah/d;

    instance-of v3, v0, Lah/i;

    if-eqz v3, :cond_14

    check-cast v2, Lah/i;

    check-cast v0, Lah/i;

    new-instance v3, Lah/g;

    invoke-direct {v3}, Lah/a;-><init>()V

    new-instance v4, Lah/m;

    invoke-direct {v4, v7, v8}, Lah/m;-><init>(J)V

    iput-object v4, v3, Lah/d;->b:Lah/m;

    iget-object v4, v0, Lah/i;->c:Ljava/math/BigInteger;

    sget-object v5, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    invoke-virtual {v3, v2}, Lah/a;->a(Lah/d;)V

    invoke-virtual {v3, v0}, Lah/a;->a(Lah/d;)V

    return-object v3

    :cond_13
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Denominator is zero"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding RationalNumber: second data item is not a number"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding RationalNumber: first data item is not a number"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding RationalNumber: array size is not 2"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding RationalNumber: not an array"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    const-wide/16 v7, 0x26

    cmp-long v2, v4, v7

    if-nez v2, :cond_1d

    instance-of v2, v0, Lah/a;

    if-eqz v2, :cond_1c

    check-cast v0, Lah/a;

    iget-object v0, v0, Lah/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v2, v6, :cond_1b

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lah/d;

    instance-of v3, v2, Lah/n;

    if-eqz v3, :cond_1a

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lah/d;

    instance-of v3, v0, Lah/n;

    if-eqz v3, :cond_19

    check-cast v2, Lah/n;

    check-cast v0, Lah/n;

    new-instance v3, Lah/g;

    invoke-direct {v3}, Lah/a;-><init>()V

    new-instance v4, Lah/m;

    invoke-direct {v4, v7, v8}, Lah/m;-><init>(J)V

    iput-object v4, v3, Lah/d;->b:Lah/m;

    invoke-virtual {v3, v2}, Lah/a;->a(Lah/d;)V

    invoke-virtual {v3, v0}, Lah/a;->a(Lah/d;)V

    return-object v3

    :cond_19
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding LanguageTaggedString: second data item is not an UnicodeString"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding LanguageTaggedString: first data item is not an UnicodeString"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding LanguageTaggedString: array size is not 2"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Error decoding LanguageTaggedString: not an array"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    move-object v2, v0

    :goto_b
    iget-object v4, v2, Lah/d;->b:Lah/m;

    if-eqz v4, :cond_1e

    move-object v2, v4

    goto :goto_b

    :cond_1e
    iput-object v3, v2, Lah/d;->b:Lah/m;

    return-object v0

    :cond_1f
    new-instance v0, Lco/nstant/in/cbor/CborException;

    const-string v2, "Unexpected end of stream: tag without following data item."

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_15
    iget-object v3, v1, Lev/i;->g:Ljava/lang/Object;

    check-cast v3, Lzg/a;

    iget-object v4, v3, Lb3/b;->c:Ljava/lang/Object;

    check-cast v4, Lev/i;

    invoke-virtual {v3, v0}, Lb3/b;->p(I)J

    move-result-wide v5

    cmp-long v0, v5, v19

    if-nez v0, :cond_23

    new-instance v0, Lah/h;

    invoke-direct {v0}, Lah/h;-><init>()V

    iput-boolean v14, v0, Lah/c;->c:Z

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_20
    :goto_c
    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v3

    sget-object v5, Lah/k;->d:Lah/k;

    invoke-virtual {v5, v3}, Lah/k;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    goto :goto_e

    :cond_21
    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v5

    if-eqz v3, :cond_22

    if-eqz v5, :cond_22

    iget-object v6, v0, Lah/h;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v3, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_20

    iget-object v5, v0, Lah/h;->e:Ljava/util/LinkedList;

    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_22
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v0, Lah/h;

    long-to-int v3, v5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-direct {v0, v3}, Lah/h;-><init>(I)V

    :goto_d
    cmp-long v3, v17, v5

    if-gez v3, :cond_26

    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v3

    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v7

    if-eqz v3, :cond_25

    if-eqz v7, :cond_25

    iget-object v8, v0, Lah/h;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v8, v3, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_24

    iget-object v7, v0, Lah/h;->e:Ljava/util/LinkedList;

    invoke-virtual {v7, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_24
    add-long v17, v17, v15

    goto :goto_d

    :cond_25
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    :goto_e
    return-object v0

    :pswitch_16
    iget-object v3, v1, Lev/i;->f:Ljava/lang/Object;

    check-cast v3, Lzg/a;

    iget-object v4, v3, Lb3/b;->c:Ljava/lang/Object;

    check-cast v4, Lev/i;

    invoke-virtual {v3, v0}, Lb3/b;->p(I)J

    move-result-wide v5

    cmp-long v0, v5, v19

    if-nez v0, :cond_29

    new-instance v0, Lah/a;

    invoke-direct {v0}, Lah/a;-><init>()V

    iput-boolean v14, v0, Lah/c;->c:Z

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_f
    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v3

    if-eqz v3, :cond_28

    sget-object v5, Lah/k;->d:Lah/k;

    invoke-virtual {v5, v3}, Lah/k;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-virtual {v0, v5}, Lah/a;->a(Lah/d;)V

    goto :goto_11

    :cond_27
    invoke-virtual {v0, v3}, Lah/a;->a(Lah/d;)V

    goto :goto_f

    :cond_28
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance v0, Lah/a;

    long-to-int v3, v5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-direct {v0, v3}, Lah/a;-><init>(I)V

    :goto_10
    cmp-long v3, v17, v5

    if-gez v3, :cond_2b

    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v3

    if-eqz v3, :cond_2a

    invoke-virtual {v0, v3}, Lah/a;->a(Lah/d;)V

    add-long v17, v17, v15

    goto :goto_10

    :cond_2a
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    :goto_11
    return-object v0

    :pswitch_17
    iget-object v3, v1, Lev/i;->e:Ljava/lang/Object;

    check-cast v3, Lzg/a;

    iget-object v4, v3, Lb3/b;->c:Ljava/lang/Object;

    check-cast v4, Lev/i;

    invoke-virtual {v3, v0}, Lb3/b;->p(I)J

    move-result-wide v6

    cmp-long v0, v6, v19

    if-nez v0, :cond_2f

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :goto_12
    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v3

    if-eqz v3, :cond_2e

    iget v6, v3, Lah/d;->a:I

    sget-object v7, Lah/k;->d:Lah/k;

    invoke-virtual {v7, v3}, Lah/k;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2c

    new-instance v2, Lah/n;

    new-instance v3, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v0, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Lah/n;-><init>(Ljava/lang/String;)V

    goto :goto_13

    :cond_2c
    if-ne v6, v9, :cond_2d

    check-cast v3, Lah/n;

    invoke-virtual {v3}, Lah/n;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    array-length v6, v3

    invoke-virtual {v0, v3, v13, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_12

    :cond_2d
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-static {v6}, Lr;->B(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2f
    new-instance v2, Lah/n;

    new-instance v0, Ljava/lang/String;

    invoke-virtual {v3, v6, v7}, Lb3/b;->j(J)[B

    move-result-object v3

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v2, v0}, Lah/n;-><init>(Ljava/lang/String;)V

    :goto_13
    return-object v2

    :pswitch_18
    iget-object v3, v1, Lev/i;->d:Ljava/lang/Object;

    check-cast v3, Lzg/a;

    iget-object v4, v3, Lb3/b;->c:Ljava/lang/Object;

    check-cast v4, Lev/i;

    invoke-virtual {v3, v0}, Lb3/b;->p(I)J

    move-result-wide v6

    cmp-long v0, v6, v19

    if-nez v0, :cond_35

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :cond_30
    :goto_14
    invoke-virtual {v4}, Lev/i;->c()Lah/d;

    move-result-object v3

    if-eqz v3, :cond_34

    iget v6, v3, Lah/d;->a:I

    sget-object v7, Lah/k;->d:Lah/k;

    invoke-virtual {v7, v3}, Lah/k;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_31

    new-instance v2, Lah/b;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v2, v0}, Lah/b;-><init>([B)V

    goto :goto_15

    :cond_31
    if-ne v6, v8, :cond_33

    check-cast v3, Lah/b;

    iget-object v3, v3, Lah/b;->d:[B

    if-nez v3, :cond_32

    const/4 v3, 0x0

    :cond_32
    if-eqz v3, :cond_30

    array-length v6, v3

    invoke-virtual {v0, v3, v13, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_14

    :cond_33
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-static {v6}, Lr;->B(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Lco/nstant/in/cbor/CborException;

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v2, Lah/b;

    invoke-virtual {v3, v6, v7}, Lb3/b;->j(J)[B

    move-result-object v0

    invoke-direct {v2, v0}, Lah/b;-><init>([B)V

    :goto_15
    return-object v2

    :pswitch_19
    iget-object v2, v1, Lev/i;->c:Ljava/lang/Object;

    check-cast v2, Lzg/b;

    new-instance v3, Lah/i;

    sget-object v4, Lzg/b;->d:Ljava/math/BigInteger;

    invoke-virtual {v2, v0}, Lb3/b;->q(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v3, v7, v0}, Lah/i;-><init>(ILjava/math/BigInteger;)V

    return-object v3

    :pswitch_1a
    iget-object v2, v1, Lev/i;->b:Ljava/lang/Object;

    check-cast v2, Lzg/a;

    new-instance v3, Lah/i;

    invoke-virtual {v2, v0}, Lb3/b;->q(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v3, v6, v0}, Lah/i;-><init>(ILjava/math/BigInteger;)V

    return-object v3

    :catch_9
    move-exception v0

    new-instance v2, Lco/nstant/in/cbor/CborException;

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_8
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x18
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x14
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_13
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch
.end method

.method public d(Lq30/q0;Ls83/c;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lq30/c0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lq30/c0;

    iget v3, v2, Lq30/c0;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lq30/c0;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lq30/c0;

    invoke-direct {v2, v0, v1}, Lq30/c0;-><init>(Lev/i;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lq30/c0;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lq30/c0;->F:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lq30/c0;->y:Ljava/lang/String;

    iget-object v4, v2, Lq30/c0;->x:Lorg/json/JSONObject;

    iget-object v2, v2, Lq30/c0;->w:Lev/i;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "DV"

    const-string v6, "1.6"

    invoke-virtual {v1, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    iget-object v1, v0, Lev/i;->a:Ljava/lang/Object;

    check-cast v1, Ll30/e;

    iget-object v6, v0, Lev/i;->g:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iput-object v0, v2, Lq30/c0;->w:Lev/i;

    iput-object v4, v2, Lq30/c0;->x:Lorg/json/JSONObject;

    const-string v7, "DD"

    iput-object v7, v2, Lq30/c0;->y:Ljava/lang/String;

    iput v5, v2, Lq30/c0;->F:I

    move-object/from16 v5, p1

    invoke-virtual {v1, v6, v5, v2}, Ll30/e;->a(Ljava/lang/String;Lq30/q0;Ls83/c;)Ljava/io/Serializable;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v0

    move-object v3, v7

    :goto_1
    check-cast v1, Ljava/util/Map;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, v2, Lev/i;->b:Ljava/lang/Object;

    check-cast v4, Ld0/o2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sget-object v6, Ll30/f;->x:Ll30/f;

    sget-object v7, Ll30/f;->y:Ll30/f;

    sget-object v8, Ll30/f;->z:Ll30/f;

    sget-object v9, Ll30/f;->E:Ll30/f;

    sget-object v10, Ll30/f;->F:Ll30/f;

    sget-object v11, Ll30/f;->G:Ll30/f;

    sget-object v12, Ll30/f;->H:Ll30/f;

    sget-object v13, Ll30/f;->I:Ll30/f;

    sget-object v14, Ll30/f;->J:Ll30/f;

    sget-object v15, Ll30/f;->K:Ll30/f;

    sget-object v16, Ll30/f;->L:Ll30/f;

    sget-object v17, Ll30/f;->M:Ll30/f;

    sget-object v18, Ll30/f;->N:Ll30/f;

    sget-object v19, Ll30/f;->O:Ll30/f;

    sget-object v20, Ll30/f;->W:Ll30/f;

    sget-object v21, Ll30/f;->X:Ll30/f;

    sget-object v22, Ll30/f;->Y:Ll30/f;

    sget-object v23, Ll30/f;->Z:Ll30/f;

    sget-object v24, Ll30/f;->a0:Ll30/f;

    sget-object v25, Ll30/f;->P:Ll30/f;

    sget-object v26, Ll30/f;->Q:Ll30/f;

    sget-object v27, Ll30/f;->R:Ll30/f;

    sget-object v28, Ll30/f;->S:Ll30/f;

    sget-object v29, Ll30/f;->T:Ll30/f;

    sget-object v30, Ll30/f;->U:Ll30/f;

    sget-object v31, Ll30/f;->V:Ll30/f;

    filled-new-array/range {v6 .. v31}, [Ll30/f;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    sget-object v7, Ll30/f;->c0:Lt83/b;

    invoke-virtual {v7}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll30/f;

    invoke-interface {v6, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    iget-object v8, v8, Ll30/f;->w:Ljava/lang/String;

    sget-object v9, Ll30/g;->x:[Ll30/g;

    const-string v9, "RE01"

    invoke-virtual {v5, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iget v4, v4, Ld0/o2;->x:I

    const/16 v7, 0x1a

    const-string v8, "A076"

    const-string v9, "A053"

    const-string v10, "A003"

    const-string v11, "RE02"

    if-ge v4, v7, :cond_6

    sget-object v7, Ll30/f;->x:Ll30/f;

    sget-object v7, Ll30/g;->x:[Ll30/g;

    invoke-virtual {v6, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v8, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    const-string v7, "A027"

    const-string v12, "A025"

    const/16 v13, 0x17

    if-ge v4, v13, :cond_7

    sget-object v14, Ll30/f;->x:Ll30/f;

    sget-object v14, Ll30/g;->x:[Ll30/g;

    const-string v14, "A012"

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v14, "A022"

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v14, "A062"

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v14, "A063"

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v14, "A064"

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v14, "A103"

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v14, "A123"

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    if-le v4, v13, :cond_8

    sget-object v13, Ll30/f;->x:Ll30/f;

    sget-object v13, Ll30/g;->x:[Ll30/g;

    const-string v13, "A079"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    const/16 v13, 0x16

    if-ge v4, v13, :cond_9

    sget-object v13, Ll30/f;->x:Ll30/f;

    sget-object v13, Ll30/g;->x:[Ll30/g;

    const-string v13, "A026"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    const/16 v13, 0x1c

    if-ge v4, v13, :cond_a

    sget-object v13, Ll30/f;->x:Ll30/f;

    sget-object v13, Ll30/g;->x:[Ll30/g;

    const-string v13, "A138"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v13, "A139"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v13, "A150"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    const/16 v13, 0x1d

    const-string v14, "A143"

    if-ge v4, v13, :cond_b

    sget-object v13, Ll30/f;->x:Ll30/f;

    sget-object v13, Ll30/g;->x:[Ll30/g;

    const-string v13, "A141"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v13, "A142"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v13, "A152"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    const/16 v13, 0x1e

    const-string v15, "A149"

    if-ge v4, v13, :cond_c

    sget-object v13, Ll30/f;->x:Ll30/f;

    sget-object v13, Ll30/g;->x:[Ll30/g;

    const-string v13, "A145"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v15, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v13, "A151"

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    const/16 v13, 0x1f

    if-ge v4, v13, :cond_d

    sget-object v4, Ll30/f;->x:Ll30/f;

    sget-object v4, Ll30/g;->x:[Ll30/g;

    const-string v4, "A153"

    invoke-virtual {v6, v4, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "A154"

    invoke-virtual {v6, v4, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "A155"

    invoke-virtual {v6, v4, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    invoke-static {v5, v6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sget-object v6, Ll30/f;->x:Ll30/f;

    sget-object v6, Ll30/g;->x:[Ll30/g;

    const-string v6, "A028"

    const-string v11, "RE03"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A029"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A030"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A031"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A032"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A033"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A034"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A035"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A036"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A037"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A038"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "C011"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "C012"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "C009"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A039"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A040"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A041"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A001"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A002"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A004"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A017"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A019"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A020"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v8, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A146"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A147"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "A148"

    invoke-virtual {v5, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v15, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4, v5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v6, "A140"

    const-string v7, "RE04"

    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4, v5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v4, "DPNA"

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v2, v2, Lev/i;->c:Ljava/lang/Object;

    check-cast v2, Ll30/c;

    invoke-virtual {v2}, Ll30/c;->a()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll30/o;

    iget-object v4, v4, Ll30/o;->w:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_e
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string v3, "SW"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "put(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public e()Lio/sentry/android/replay/video/d;
    .locals 1

    iget-object v0, p0, Lev/i;->f:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/d;

    return-object v0
.end method

.method public f()Lb30/m;
    .locals 1

    iget-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    return-object v0
.end method

.method public g(Lgm/i;I)V
    .locals 47

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v2, v3, Lgm/i;->b:[B

    iget-object v0, v1, Lev/i;->f:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lom/b;

    iget-object v0, v1, Lev/i;->b:Ljava/lang/Object;

    check-cast v0, Lhm/e;

    iget-object v5, v3, Lgm/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lhm/e;->a(Ljava/lang/String;)Lhm/f;

    move-result-object v5

    move-object v8, v4

    move-object v9, v5

    const-wide/16 v4, 0x0

    :goto_0
    new-instance v0, Lmm/e;

    const/4 v10, 0x0

    invoke-direct {v0, v1, v3, v10}, Lmm/e;-><init>(Lev/i;Lgm/i;I)V

    move-object v11, v8

    check-cast v11, Lnm/i;

    invoke-virtual {v11, v0}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_20

    new-instance v0, Lmm/e;

    const/4 v12, 0x1

    invoke-direct {v0, v1, v3, v12}, Lmm/e;-><init>(Lev/i;Lgm/i;I)V

    invoke-virtual {v11, v0}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    const-wide/16 v6, -0x1

    const/4 v15, 0x4

    if-nez v9, :cond_1

    const-string v10, "Uploader"

    const-string v14, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v3, v10, v14}, Ldp/d;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lhm/a;

    invoke-direct {v10, v0, v6, v7}, Lhm/a;-><init>(IJ)V

    move-object/from16 v32, v2

    move-wide/from16 v33, v4

    :goto_1
    const/4 v1, 0x2

    goto/16 :goto_12

    :cond_1
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v0, v17

    check-cast v0, Lnm/b;

    iget-object v0, v0, Lnm/b;->c:Lgm/h;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x3

    goto :goto_2

    :cond_2
    const-string v0, "proto"

    if-eqz v2, :cond_3

    iget-object v6, v1, Lev/i;->i:Ljava/lang/Object;

    check-cast v6, Lnm/c;

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lhn/p;

    const/16 v12, 0x1d

    invoke-direct {v7, v6, v12}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v7}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljm/a;

    new-instance v7, La30/w0;

    invoke-direct {v7, v15}, La30/w0;-><init>(I)V

    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    iput-object v12, v7, La30/w0;->G:Ljava/lang/Object;

    iget-object v12, v1, Lev/i;->g:Ljava/lang/Object;

    check-cast v12, Lpm/a;

    invoke-interface {v12}, Lpm/a;->getTime()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    iput-object v12, v7, La30/w0;->E:Ljava/lang/Object;

    iget-object v12, v1, Lev/i;->h:Ljava/lang/Object;

    check-cast v12, Lpm/a;

    invoke-interface {v12}, Lpm/a;->getTime()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    iput-object v12, v7, La30/w0;->F:Ljava/lang/Object;

    const-string v12, "GDT_CLIENT_METRICS"

    iput-object v12, v7, La30/w0;->z:Ljava/lang/Object;

    new-instance v12, Lgm/m;

    new-instance v15, Ldm/c;

    invoke-direct {v15, v0}, Ldm/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, Lgm/o;->a:Lgm/r;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {v10, v6, v1}, Lgm/r;->A(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-direct {v12, v15, v1}, Lgm/m;-><init>(Ldm/c;[B)V

    iput-object v12, v7, La30/w0;->y:Ljava/lang/Object;

    invoke-virtual {v7}, La30/w0;->m()Lgm/h;

    move-result-object v1

    move-object v6, v9

    check-cast v6, Lem/c;

    invoke-virtual {v6, v1}, Lem/c;->a(Lgm/h;)Lgm/h;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    move-object v1, v9

    check-cast v1, Lem/c;

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lgm/h;

    iget-object v12, v10, Lgm/h;->a:Ljava/lang/String;

    invoke-virtual {v6, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v12, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    invoke-virtual {v6, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    invoke-interface {v12, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const-string v15, "CctTransportBackend"

    if-eqz v10, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v12, v21

    check-cast v12, Ljava/util/List;

    const/4 v14, 0x0

    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lgm/h;

    sget-object v20, Lfm/w;->w:Lfm/w;

    iget-object v14, v1, Lem/c;->f:Lpm/a;

    invoke-interface {v14}, Lpm/a;->getTime()J

    move-result-wide v24

    iget-object v14, v1, Lem/c;->e:Lpm/a;

    invoke-interface {v14}, Lpm/a;->getTime()J

    move-result-wide v26

    const-string v14, "sdk-version"

    invoke-virtual {v12, v14}, Lgm/h;->b(Ljava/lang/String;)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    const-string v14, "model"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v14, "hardware"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    const-string v14, "device"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v32

    const-string v14, "product"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    const-string v14, "os-uild"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    const-string v14, "manufacturer"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    const-string v14, "fingerprint"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    const-string v14, "country"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    const-string v14, "locale"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    const-string v14, "mcc_mnc"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v39

    const-string v14, "application_build"

    invoke-virtual {v12, v14}, Lgm/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    new-instance v28, Lfm/h;

    invoke-direct/range {v28 .. v40}, Lfm/h;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v12, v28

    new-instance v14, Lfm/j;

    invoke-direct {v14, v12}, Lfm/j;-><init>(Lfm/h;)V

    :try_start_1
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v29, v12

    const/16 v30, 0x0

    goto :goto_5

    :catch_1
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v30, v12

    const/16 v29, 0x0

    :goto_5
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v32, v2

    move-object/from16 v2, v22

    check-cast v2, Lgm/h;

    iget-object v3, v2, Lgm/h;->c:Lgm/m;

    move-wide/from16 v33, v4

    iget-object v4, v3, Lgm/m;->a:Ldm/c;

    iget-object v3, v3, Lgm/m;->b:[B

    new-instance v5, Ldm/c;

    invoke-direct {v5, v0}, Ldm/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ldm/c;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    new-instance v4, Lm63/d;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lm63/d;-><init>(I)V

    iput-object v3, v4, Lm63/d;->E:Ljava/lang/Object;

    move-object/from16 v35, v0

    :goto_7
    move-object v0, v6

    goto :goto_8

    :cond_6
    new-instance v5, Ldm/c;

    move-object/from16 v35, v0

    const-string v0, "json"

    invoke-direct {v5, v0}, Ldm/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ldm/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance v0, Ljava/lang/String;

    const-string v4, "UTF-8"

    invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v4, Lm63/d;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lm63/d;-><init>(I)V

    iput-object v0, v4, Lm63/d;->F:Ljava/lang/Object;

    goto :goto_7

    :goto_8
    iget-wide v5, v2, Lgm/h;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lm63/d;->x:Ljava/lang/Object;

    iget-wide v5, v2, Lgm/h;->e:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lm63/d;->z:Ljava/lang/Object;

    const-string v3, "tz-offset"

    iget-object v5, v2, Lgm/h;->f:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_7

    const-wide/16 v5, 0x0

    goto :goto_9

    :cond_7
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_9
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lm63/d;->G:Ljava/lang/Object;

    const-string v3, "net-type"

    invoke-virtual {v2, v3}, Lgm/h;->b(Ljava/lang/String;)I

    move-result v3

    sget-object v5, Lfm/u;->w:Landroid/util/SparseArray;

    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfm/u;

    const-string v5, "mobile-subtype"

    invoke-virtual {v2, v5}, Lgm/h;->b(Ljava/lang/String;)I

    move-result v5

    sget-object v6, Lfm/t;->w:Landroid/util/SparseArray;

    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfm/t;

    new-instance v6, Lfm/n;

    invoke-direct {v6, v3, v5}, Lfm/n;-><init>(Lfm/u;Lfm/t;)V

    iput-object v6, v4, Lm63/d;->H:Ljava/lang/Object;

    iget-object v2, v2, Lgm/h;->b:Ljava/lang/Integer;

    if-eqz v2, :cond_8

    iput-object v2, v4, Lm63/d;->y:Ljava/lang/Object;

    :cond_8
    iget-object v2, v4, Lm63/d;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    if-nez v2, :cond_9

    const-string v2, " eventTimeMs"

    goto :goto_a

    :cond_9
    const-string v2, ""

    :goto_a
    iget-object v3, v4, Lm63/d;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    if-nez v3, :cond_a

    const-string v3, " eventUptimeMs"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_a
    iget-object v3, v4, Lm63/d;->G:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    if-nez v3, :cond_b

    const-string v3, " timezoneOffsetSeconds"

    invoke-static {v2, v3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_d

    new-instance v36, Lfm/k;

    iget-object v2, v4, Lm63/d;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v37

    iget-object v2, v4, Lm63/d;->y:Ljava/lang/Object;

    move-object/from16 v39, v2

    check-cast v39, Ljava/lang/Integer;

    iget-object v2, v4, Lm63/d;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v40

    iget-object v2, v4, Lm63/d;->E:Ljava/lang/Object;

    move-object/from16 v42, v2

    check-cast v42, [B

    iget-object v2, v4, Lm63/d;->F:Ljava/lang/Object;

    move-object/from16 v43, v2

    check-cast v43, Ljava/lang/String;

    iget-object v2, v4, Lm63/d;->G:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v44

    iget-object v2, v4, Lm63/d;->H:Ljava/lang/Object;

    move-object/from16 v46, v2

    check-cast v46, Lfm/n;

    invoke-direct/range {v36 .. v46}, Lfm/k;-><init>(JLjava/lang/Integer;J[BLjava/lang/String;JLfm/v;)V

    move-object/from16 v2, v36

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    :goto_b
    move-object/from16 v3, p1

    move-object v6, v0

    move-object/from16 v2, v32

    move-wide/from16 v4, v33

    move-object/from16 v0, v35

    goto/16 :goto_6

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties:"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object v0, v6

    const-string v2, "TRuntime."

    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_c

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Received event of unsupported encoding "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ". Skipping..."

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_b

    :cond_f
    move-object/from16 v35, v0

    move-object/from16 v32, v2

    move-wide/from16 v33, v4

    move-object v0, v6

    new-instance v23, Lfm/l;

    move-object/from16 v31, v12

    move-object/from16 v28, v14

    invoke-direct/range {v23 .. v31}, Lfm/l;-><init>(JJLfm/j;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V

    move-object/from16 v2, v23

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p1

    move-object/from16 v2, v32

    move-object/from16 v0, v35

    goto/16 :goto_4

    :cond_10
    move-object/from16 v32, v2

    move-wide/from16 v33, v4

    const/4 v3, 0x5

    new-instance v0, Lfm/i;

    invoke-direct {v0, v7}, Lfm/i;-><init>(Ljava/util/ArrayList;)V

    iget-object v2, v1, Lem/c;->d:Ljava/net/URL;

    if-eqz v32, :cond_12

    :try_start_2
    invoke-static/range {v32 .. v32}, Lem/a;->a([B)Lem/a;

    move-result-object v4

    iget-object v5, v4, Lem/a;->b:Ljava/lang/String;

    if-eqz v5, :cond_11

    goto :goto_c

    :cond_11
    const/4 v5, 0x0

    :goto_c
    iget-object v4, v4, Lem/a;->a:Ljava/lang/String;

    if-eqz v4, :cond_13

    invoke-static {v4}, Lem/c;->b(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_e

    :catch_2
    new-instance v0, Lhm/a;

    const/4 v1, 0x3

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lhm/a;-><init>(IJ)V

    :goto_d
    move-object v10, v0

    goto/16 :goto_1

    :cond_12
    const/4 v5, 0x0

    :cond_13
    :goto_e
    :try_start_3
    new-instance v4, La33/d;

    const/16 v6, 0x13

    invoke-direct {v4, v2, v0, v5, v6}, La33/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v0, Lab/g0;

    const/16 v2, 0x1c

    invoke-direct {v0, v1, v2}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    move v14, v3

    :cond_14
    invoke-virtual {v0, v4}, Lab/g0;->c(La33/d;)Lem/b;

    move-result-object v1

    iget-object v2, v1, Lem/b;->c:Ljava/lang/Object;

    check-cast v2, Ljava/net/URL;

    if-eqz v2, :cond_15

    const-string v3, "Following redirect to: %s"

    invoke-static {v2, v15, v3}, Ldp/d;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, La33/d;

    iget-object v5, v4, La33/d;->y:Ljava/lang/Object;

    check-cast v5, Lfm/i;

    iget-object v4, v4, La33/d;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-direct {v3, v2, v5, v4, v6}, La33/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v4, v3

    goto :goto_f

    :cond_15
    const/4 v4, 0x0

    :goto_f
    if-eqz v4, :cond_16

    add-int/lit8 v14, v14, -0x1

    const/4 v5, 0x1

    if-ge v14, v5, :cond_14

    :cond_16
    iget v0, v1, Lem/b;->a:I

    const/16 v2, 0xc8

    if-ne v0, v2, :cond_17

    iget-wide v0, v1, Lem/b;->b:J

    new-instance v2, Lhm/a;

    const/4 v5, 0x1

    invoke-direct {v2, v5, v0, v1}, Lhm/a;-><init>(IJ)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    move-object v10, v2

    goto/16 :goto_1

    :catch_3
    move-exception v0

    goto :goto_11

    :cond_17
    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_18

    const/16 v1, 0x194

    if-ne v0, v1, :cond_19

    :cond_18
    const-wide/16 v2, -0x1

    goto :goto_10

    :cond_19
    const/16 v1, 0x190

    if-ne v0, v1, :cond_1a

    :try_start_4
    new-instance v0, Lhm/a;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v1, 0x4

    const-wide/16 v2, -0x1

    :try_start_5
    invoke-direct {v0, v1, v2, v3}, Lhm/a;-><init>(IJ)V

    goto :goto_d

    :catch_4
    move-exception v0

    const-wide/16 v2, -0x1

    goto :goto_11

    :cond_1a
    const-wide/16 v2, -0x1

    new-instance v0, Lhm/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2, v3}, Lhm/a;-><init>(IJ)V

    goto :goto_d

    :goto_10
    new-instance v0, Lhm/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2, v3}, Lhm/a;-><init>(IJ)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_d

    :goto_11
    const-string v1, "Could not make request to the backend"

    invoke-static {v15, v1, v0}, Ldp/d;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    new-instance v0, Lhm/a;

    const/4 v1, 0x2

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lhm/a;-><init>(IJ)V

    move-object v10, v0

    :goto_12
    iget v0, v10, Lhm/a;->a:I

    if-ne v0, v1, :cond_1b

    new-instance v0, Lht/b;

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object v2, v13

    move-wide/from16 v4, v33

    invoke-direct/range {v0 .. v5}, Lht/b;-><init>(Lev/i;Ljava/lang/Iterable;Lgm/i;J)V

    invoke-virtual {v11, v0}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    iget-object v0, v1, Lev/i;->d:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    const/4 v5, 0x1

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {v0, v3, v2, v5}, Lgm/r;->O(Lgm/i;IZ)V

    return-void

    :cond_1b
    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object v2, v13

    move-wide/from16 v6, v33

    const/4 v5, 0x1

    new-instance v4, Lc9/c;

    const/16 v12, 0x14

    invoke-direct {v4, v12, v1, v2}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v4}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    if-ne v0, v5, :cond_1d

    iget-wide v12, v10, Lhm/a;->b:J

    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    if-eqz v32, :cond_1c

    new-instance v0, Lmm/d;

    invoke-direct {v0, v1, v5}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v0}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    :cond_1c
    :goto_13
    move-wide v4, v6

    goto :goto_15

    :cond_1d
    const/4 v4, 0x4

    if-ne v0, v4, :cond_1c

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnm/b;

    iget-object v4, v4, Lnm/b;->c:Lgm/h;

    iget-object v4, v4, Lgm/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    const/16 v18, 0x1

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :cond_1e
    const/16 v18, 0x1

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :cond_1f
    new-instance v2, Lc9/c;

    const/16 v4, 0x15

    invoke-direct {v2, v4, v1, v0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v2}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    goto :goto_13

    :goto_15
    move-object/from16 v2, v32

    goto/16 :goto_0

    :cond_20
    move-wide v6, v4

    new-instance v0, Lio/seon/androidsdk/service/h1;

    invoke-direct {v0, v6, v7, v1, v3}, Lio/seon/androidsdk/service/h1;-><init>(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v0}, Lnm/i;->s(Lom/a;)Ljava/lang/Object;

    return-void
.end method

.method public h(Luf/h;)V
    .locals 0

    iput-object p1, p0, Lev/i;->e:Ljava/lang/Object;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lev/i;->h:Ljava/lang/Object;

    return-void
.end method

.method public j(Luf/l;)V
    .locals 0

    iput-object p1, p0, Lev/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lev/i;->i:Ljava/lang/Object;

    return-void
.end method

.method public m(Lq30/i0;Ls83/c;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    const-string v3, "getEncoded(...)"

    instance-of v4, v0, Lq30/d0;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lq30/d0;

    iget v5, v4, Lq30/d0;->H:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lq30/d0;->H:I

    goto :goto_0

    :cond_0
    new-instance v4, Lq30/d0;

    invoke-direct {v4, v1, v0}, Lq30/d0;-><init>(Lev/i;Ls83/c;)V

    :goto_0
    iget-object v0, v4, Lq30/d0;->F:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lq30/d0;->H:I

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v2, v4, Lq30/d0;->E:Lq30/n;

    iget-object v3, v4, Lq30/d0;->z:Lq30/v0;

    iget-object v5, v4, Lq30/d0;->y:Lev/i;

    iget-object v6, v4, Lq30/d0;->x:Lq30/i0;

    iget-object v4, v4, Lq30/d0;->w:Lev/i;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v13, v2

    move-object v2, v6

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v6

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lev/i;->i:Ljava/lang/Object;

    check-cast v0, Lx30/s0;

    invoke-virtual {v0}, Lx30/s0;->s()V

    :try_start_1
    iget-object v0, v1, Lev/i;->d:Ljava/lang/Object;

    check-cast v0, Lla/b;

    iget-object v6, v1, Lev/i;->b:Ljava/lang/Object;

    check-cast v6, Lq30/e0;

    iget-object v9, v2, Lq30/i0;->y:Lq30/l;

    iget-object v9, v9, Lq30/l;->z:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-string v10, "Required value was null."

    if-eqz v9, :cond_b

    :try_start_2
    invoke-virtual {v6, v9}, Lq30/e0;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v0, v6}, Lla/b;->C(Lorg/json/JSONObject;)Lq30/a;

    move-result-object v0

    iget-object v15, v0, Lq30/a;->w:Ljava/lang/String;

    iget-object v0, v0, Lq30/a;->x:Ljava/security/interfaces/ECPublicKey;

    iget-object v6, v1, Lev/i;->a:Ljava/lang/Object;

    move-object/from16 v20, v6

    check-cast v20, Lq30/q0;

    iget-object v6, v2, Lq30/i0;->y:Lq30/l;

    iget-object v9, v6, Lq30/l;->x:Ljava/lang/String;

    if-eqz v9, :cond_a

    iget-object v11, v6, Lq30/l;->w:Ljava/lang/String;

    if-eqz v11, :cond_9

    const-string v17, "2.2.0"

    iget-object v6, v6, Lq30/l;->E:Ljava/lang/String;

    new-instance v14, Lr30/b;

    const/16 v22, 0x0

    const/16 v23, 0xfe0

    move-object/from16 v21, v6

    move-object/from16 v19, v9

    move-object/from16 v18, v11

    move-object/from16 v16, v14

    invoke-direct/range {v16 .. v23}, Lr30/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/util/List;I)V

    iget-object v6, v1, Lev/i;->f:Ljava/lang/Object;

    check-cast v6, Lq30/u0;

    iget-object v9, v1, Lev/i;->h:Ljava/lang/Object;

    check-cast v9, Ln30/c;

    const-string v10, "acsUrl"

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lq30/v0;

    new-instance v11, Lq30/w0;

    iget-object v6, v6, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v6, Lq83/j;

    invoke-direct {v11, v15, v9, v6}, Lq30/w0;-><init>(Ljava/lang/String;Ln30/d;Lq83/j;)V

    sget-object v6, Lbc3/q0;->a:Lkc3/e;

    sget-object v6, Lkc3/d;->w:Lkc3/d;

    invoke-direct {v10, v11, v9, v6}, Lq30/v0;-><init>(Lq30/w0;Ln30/d;Lq83/j;)V

    new-instance v11, Lq30/n;

    iget-object v6, v1, Lev/i;->c:Ljava/lang/Object;

    move-object v12, v6

    check-cast v12, Lo30/b;

    iget-object v13, v2, Lq30/i0;->w:Ljava/lang/String;

    new-instance v6, Lq30/m;

    iget-object v9, v2, Lq30/i0;->x:Ljava/security/KeyPair;

    invoke-virtual {v9}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v9

    invoke-interface {v9}, Ljava/security/Key;->getEncoded()[B

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v9, v0}, Lq30/m;-><init>([B[B)V

    move-object/from16 v16, v6

    invoke-direct/range {v11 .. v16}, Lq30/n;-><init>(Lo30/d;Ljava/lang/String;Lr30/b;Ljava/lang/String;Lq30/m;)V

    iget-object v0, v1, Lev/i;->e:Ljava/lang/Object;

    check-cast v0, Lxl/a;

    iput-object v1, v4, Lq30/d0;->w:Lev/i;

    iput-object v2, v4, Lq30/d0;->x:Lq30/i0;

    iput-object v1, v4, Lq30/d0;->y:Lev/i;

    iput-object v10, v4, Lq30/d0;->z:Lq30/v0;

    iput-object v11, v4, Lq30/d0;->E:Lq30/n;

    iput v7, v4, Lq30/d0;->H:I

    new-instance v3, Lq30/r0;

    invoke-direct {v3, v11}, Lq30/r0;-><init>(Lq30/n;)V

    iget-object v6, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v6, Ln30/c;

    iget-object v0, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    invoke-virtual {v3, v6, v0}, Lq30/r0;->a(Ln30/d;Lq83/j;)Lq30/t0;

    move-result-object v0

    invoke-virtual {v0, v14, v4}, Lq30/t0;->b(Lr30/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v5, :cond_3

    return-object v5

    :cond_3
    move-object v4, v1

    move-object v5, v4

    move-object v3, v10

    move-object v13, v11

    :goto_1
    :try_start_3
    check-cast v0, Lq30/t;

    instance-of v6, v0, Lq30/r;

    if-eqz v6, :cond_4

    new-instance v3, Lq30/l0;

    new-instance v9, Lt30/s;

    move-object v6, v0

    check-cast v6, Lq30/r;

    iget-object v10, v6, Lq30/r;->x:Lr30/e;

    check-cast v0, Lq30/r;

    iget-object v11, v0, Lq30/r;->w:Lr30/b;

    iget-object v0, v5, Lev/i;->g:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Lm30/h;

    new-instance v14, Lq30/r0;

    invoke-direct {v14, v13}, Lq30/r0;-><init>(Lq30/n;)V

    iget v15, v2, Lq30/i0;->z:I

    iget-object v0, v2, Lq30/i0;->E:Lq30/n0;

    move-object/from16 v16, v0

    invoke-direct/range {v9 .. v16}, Lt30/s;-><init>(Lr30/e;Lr30/b;Lm30/h;Lq30/n;Lq30/r0;ILq30/n0;)V

    invoke-direct {v3, v9}, Lq30/l0;-><init>(Lt30/s;)V

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    goto/16 :goto_3

    :cond_4
    instance-of v5, v0, Lq30/p;

    if-eqz v5, :cond_6

    move-object v5, v0

    check-cast v5, Lq30/p;

    iget-object v5, v5, Lq30/p;->w:Lr30/g;

    iget-object v5, v5, Lr30/g;->E:Lr30/f;

    sget-object v6, Lr30/f;->y:Lr30/f;

    if-ne v5, v6, :cond_5

    move-object v5, v0

    check-cast v5, Lq30/p;

    iget-object v5, v5, Lq30/p;->w:Lr30/g;

    invoke-virtual {v3, v5}, Lq30/v0;->a(Lr30/g;)V

    :cond_5
    new-instance v3, Lq30/k0;

    new-instance v5, Lq30/w;

    check-cast v0, Lq30/p;

    iget-object v0, v0, Lq30/p;->w:Lr30/g;

    iget-object v6, v2, Lq30/i0;->E:Lq30/n0;

    invoke-direct {v5, v0, v8, v6}, Lq30/w;-><init>(Lr30/g;Lr30/j;Lq30/n0;)V

    invoke-direct {v3, v5}, Lq30/k0;-><init>(Lq30/a0;)V

    goto :goto_4

    :cond_6
    instance-of v5, v0, Lq30/s;

    if-eqz v5, :cond_7

    check-cast v0, Lq30/s;

    iget-object v0, v0, Lq30/s;->w:Lr30/g;

    invoke-virtual {v3, v0}, Lq30/v0;->a(Lr30/g;)V

    new-instance v3, Lq30/k0;

    new-instance v0, Lq30/z;

    iget-object v5, v2, Lq30/i0;->E:Lq30/n0;

    invoke-direct {v0, v8, v8, v5}, Lq30/z;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    invoke-direct {v3, v0}, Lq30/k0;-><init>(Lq30/a0;)V

    goto :goto_4

    :cond_7
    instance-of v3, v0, Lq30/q;

    if-eqz v3, :cond_8

    new-instance v3, Lq30/k0;

    new-instance v5, Lq30/x;

    check-cast v0, Lq30/q;

    iget-object v0, v0, Lq30/q;->w:Ljava/lang/Throwable;

    iget-object v6, v2, Lq30/i0;->E:Lq30/n0;

    invoke-direct {v5, v0, v8, v6}, Lq30/x;-><init>(Ljava/lang/Throwable;Lr30/j;Lq30/n0;)V

    invoke-direct {v3, v5}, Lq30/k0;-><init>(Lq30/a0;)V

    goto :goto_4

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    move-object v4, v1

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_2

    :cond_9
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_4
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_5

    :cond_c
    iget-object v3, v4, Lev/i;->h:Ljava/lang/Object;

    check-cast v3, Ln30/c;

    invoke-virtual {v3, v0}, Ln30/c;->c(Ljava/lang/Throwable;)V

    iget-object v3, v4, Lev/i;->i:Ljava/lang/Object;

    check-cast v3, Lx30/s0;

    const-string v4, "Exception during initial challenge request."

    invoke-virtual {v3, v4, v0}, Lx30/s0;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v3, Lq30/k0;

    new-instance v4, Lq30/x;

    iget-object v2, v2, Lq30/i0;->E:Lq30/n0;

    invoke-direct {v4, v0, v8, v2}, Lq30/x;-><init>(Ljava/lang/Throwable;Lr30/j;Lq30/n0;)V

    invoke-direct {v3, v4}, Lq30/k0;-><init>(Lq30/a0;)V

    :goto_5
    return-object v3
.end method

.method public n(I)V
    .locals 1

    :goto_0
    iget-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcp/f;

    invoke-interface {v0}, Lcp/f;->a()I

    move-result v0

    if-lt v0, p1, :cond_0

    iget-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Landroid/os/Bundle;Lcp/f;)V
    .locals 2

    iget-object v0, p0, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lcp/f;->b()V

    return-void

    :cond_0
    iget-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedList;

    invoke-virtual {v0, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_3

    iget-object p2, p0, Lev/i;->b:Ljava/lang/Object;

    check-cast p2, Landroid/os/Bundle;

    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    iput-object p1, p0, Lev/i;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lev/i;->d:Ljava/lang/Object;

    check-cast p1, Lro/i;

    iput-object p1, p0, Lev/i;->g:Ljava/lang/Object;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lev/i;->a:Ljava/lang/Object;

    check-cast p1, Lq30/w0;

    if-nez p1, :cond_6

    :try_start_0
    iget-object p1, p0, Lev/i;->f:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    const-class p2, Lup/d;

    monitor-enter p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {p1}, Lup/d;->B(Landroid/content/Context;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p2

    iget-object p1, p0, Lev/i;->f:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lrj/j;->y(Landroid/content/Context;)Lvp/d;

    move-result-object p1

    iget-object p2, p0, Lev/i;->f:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    new-instance v0, Lcp/b;

    invoke-direct {v0, p2}, Lcp/b;-><init>(Ljava/lang/Object;)V

    iget-object p2, p0, Lev/i;->h:Ljava/lang/Object;

    check-cast p2, Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {p1, v0, p2}, Lvp/d;->n0(Lcp/b;Lcom/google/android/gms/maps/GoogleMapOptions;)Lvp/f;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    iget-object p2, p0, Lev/i;->g:Ljava/lang/Object;

    check-cast p2, Lro/i;

    new-instance v0, Lq30/w0;

    iget-object v1, p0, Lev/i;->e:Ljava/lang/Object;

    check-cast v1, Lup/c;

    invoke-direct {v0, v1, p1}, Lq30/w0;-><init>(Lup/c;Lvp/f;)V

    invoke-virtual {p2, v0}, Lro/i;->y(Lq30/w0;)V

    iget-object p1, p0, Lev/i;->i:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leu/t;

    iget-object v0, p0, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    invoke-virtual {v0, p2}, Lq30/w0;->t(Leu/t;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lev/i;->i:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_4 .. :try_end_4} :catch_1

    :goto_2
    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    :cond_6
    :goto_3
    return-void
.end method
