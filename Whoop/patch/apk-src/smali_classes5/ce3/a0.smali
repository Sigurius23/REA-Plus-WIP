.class public final Lce3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/i2;
.implements Lz8/e;


# instance fields
.field public w:I

.field public x:I

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x100

    .line 3
    new-array p1, p1, [Lce3/a0;

    iput-object p1, p0, Lce3/a0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lce3/a0;->w:I

    .line 5
    iput p1, p0, Lce3/a0;->x:I

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Lp0/n0;

    const/16 v0, 0xc

    invoke-direct {p1, v0}, Lp0/n0;-><init>(I)V

    iput-object p1, p0, Lce3/a0;->y:Ljava/lang/Object;

    const/16 p1, 0x1f40

    .line 8
    iput p1, p0, Lce3/a0;->w:I

    .line 9
    iput p1, p0, Lce3/a0;->x:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lce3/a0;->y:Ljava/lang/Object;

    .line 12
    iput p1, p0, Lce3/a0;->w:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 13
    :cond_0
    iput p1, p0, Lce3/a0;->x:I

    return-void
.end method

.method public constructor <init>(IILd0/z;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lce3/a0;->w:I

    .line 16
    iput p2, p0, Lce3/a0;->x:I

    .line 17
    new-instance v0, Lzt/q;

    new-instance v1, Ld0/h0;

    invoke-direct {v1, p1, p2, p3}, Ld0/h0;-><init>(IILd0/z;)V

    invoke-direct {v0, v1}, Lzt/q;-><init>(Ld0/d0;)V

    iput-object v0, p0, Lce3/a0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lce3/a0;->x:I

    iput-object p1, p0, Lce3/a0;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public declared-synchronized b()I
    .locals 3

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lce3/a0;->w:I

    if-nez v0, :cond_0

    const-string v0, "com.google.android.gms"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lce3/a0;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lbp/c;->a(Landroid/content/Context;)Laj/d;

    move-result-object v1

    iget-object v1, v1, Laj/d;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    const-string v1, "Failed to find package "

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Metadata"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v0, p0, Lce3/a0;->w:I

    :cond_0
    iget v0, p0, Lce3/a0;->w:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public createDataSource()Lz8/f;
    .locals 4

    new-instance v0, Lz8/i;

    iget v1, p0, Lce3/a0;->w:I

    iget v2, p0, Lce3/a0;->x:I

    iget-object v3, p0, Lce3/a0;->y:Ljava/lang/Object;

    check-cast v3, Lp0/n0;

    invoke-direct {v0, v1, v2, v3}, Lz8/i;-><init>(IILp0/n0;)V

    return-object v0
.end method

.method public declared-synchronized d()I
    .locals 4

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lce3/a0;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lce3/a0;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0}, Lbp/c;->a(Landroid/content/Context;)Laj/d;

    move-result-object v0

    const-string v2, "com.google.android.c2dm.permission.SEND"

    const-string v3, "com.google.android.gms"

    iget-object v0, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    const-string v0, "Metadata"

    const-string v1, "Google Play services missing or without correct permission."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v3

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.google.iid.TOKEN_REQUEST"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "com.google.android.gms"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iput v1, p0, Lce3/a0;->x:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v1

    :cond_2
    :try_start_3
    const-string v0, "Metadata"

    const-string v2, "Failed to resolve IID implementation package, falling back"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput v1, p0, Lce3/a0;->x:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v1

    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 7

    iget-object v0, p0, Lce3/a0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzt/q;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lzt/q;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lce3/a0;->x:I

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lce3/a0;->w:I

    return v0
.end method

.method public m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 7

    iget-object v0, p0, Lce3/a0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzt/q;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lzt/q;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method
