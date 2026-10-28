.class public final synthetic Lbh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzt/q;


# direct methods
.method public synthetic constructor <init>(Lzt/q;I)V
    .locals 0

    iput p2, p0, Lbh/d;->w:I

    iput-object p1, p0, Lbh/d;->x:Lzt/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    iget v0, p0, Lbh/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbh/d;->x:Lzt/q;

    sget-object v1, Lqh/f;->a:Lqh/f;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lqh/f;->b:Leh/h;

    if-nez v2, :cond_1

    sget-object v7, Lne3/p;->w:Lne3/a0;

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v6, Lkc3/d;->w:Lkc3/d;

    sget-object v2, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    const-string v2, "image_cache"

    invoke-static {v0, v2}, Lx83/j;->o(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    sget-object v2, Lne3/e0;->x:Ljava/lang/String;

    invoke-static {v0}, Ljc/b;->p(Ljava/io/File;)Lne3/e0;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/32 v11, 0xa00000

    :try_start_1
    invoke-virtual {v8}, Lne3/e0;->toFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Landroid/os/StatFs;

    invoke-direct {v2, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v3

    long-to-double v3, v3

    const-wide v9, 0x3f947ae147ae147bL    # 0.02

    mul-double/2addr v9, v3

    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v2

    long-to-double v2, v2

    mul-double/2addr v9, v2

    double-to-long v9, v9

    const-wide/32 v13, 0xfa00000

    invoke-static/range {v9 .. v14}, Le93/b;->p(JJJ)J

    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    move-wide v4, v11

    :try_start_2
    new-instance v3, Leh/h;

    invoke-direct/range {v3 .. v8}, Leh/h;-><init>(JLbc3/z;Lne3/p;Lne3/e0;)V

    sput-object v3, Lqh/f;->b:Leh/h;

    move-object v2, v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-string v0, "cacheDir == null"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_0
    monitor-exit v1

    return-object v2

    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lbh/d;->x:Lzt/q;

    const-class v1, Landroid/app/ActivityManager;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    sget-object v2, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    const-wide v2, 0x3fc999999999999aL    # 0.2

    :try_start_4
    invoke-static {v0, v1}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v4, Landroid/app/ActivityManager;

    invoke-virtual {v4}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    if-eqz v4, :cond_2

    const-wide v2, 0x3fc3333333333333L    # 0.15

    :catch_1
    :cond_2
    new-instance v4, Lbd3/v;

    const/4 v5, 0x5

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Lbd3/v;-><init>(IB)V

    const-wide/16 v7, 0x0

    cmpl-double v5, v2, v7

    if-lez v5, :cond_4

    sget-object v5, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    :try_start_5
    invoke-static {v0, v1}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v5, 0x100000

    and-int/2addr v0, v5

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    move-result v0

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_2

    :catch_2
    const/16 v0, 0x100

    :goto_2
    int-to-double v0, v0

    mul-double/2addr v2, v0

    const/16 v0, 0x400

    int-to-double v0, v0

    mul-double/2addr v2, v0

    mul-double/2addr v2, v0

    double-to-int v6, v2

    :cond_4
    if-lez v6, :cond_5

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v0, v6, v4}, Lcom/google/crypto/tink/internal/l0;-><init>(ILbd3/v;)V

    goto :goto_3

    :cond_5
    new-instance v0, Lhm/d;

    const/16 v1, 0x1a

    invoke-direct {v0, v4, v1}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    :goto_3
    new-instance v1, Lkh/c;

    invoke-direct {v1, v0, v4}, Lkh/c;-><init>(Lkh/g;Lbd3/v;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
