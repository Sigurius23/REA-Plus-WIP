.class public final Lp30/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq30/p0;

.field public final b:Ln30/c;

.field public final c:Ld1/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLq83/j;)V
    .locals 10

    sget-object v0, Ls30/c;->a:Ls30/c;

    new-instance v1, Ln30/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v7, "getApplicationContext(...)"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object p2, Lq30/o0;->d:Lq30/o0;

    :goto_0
    move-object v5, p2

    goto :goto_1

    :cond_0
    sget-object p2, Lq30/o0;->c:Lq30/o0;

    goto :goto_0

    :goto_1
    const/16 v6, 0xf6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ln30/c;-><init>(Landroid/content/Context;Ln30/f;Lq83/j;Lx30/s0;I)V

    new-instance p2, Lo30/f;

    invoke-direct {p2, v1}, Lo30/f;-><init>(Ln30/c;)V

    new-instance v2, Ll30/c;

    invoke-direct {v2}, Ll30/c;-><init>()V

    new-instance v3, Lq30/p0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lai/j;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    instance-of v6, v0, Ll83/m;

    if-eqz v6, :cond_1

    move-object v0, v5

    :cond_1
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v5, Lab/h0;

    invoke-direct {v5, p1, v0, p3}, Lab/h0;-><init>(Landroid/content/Context;ILq83/j;)V

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v5, v4, Lai/j;->x:Ljava/lang/Object;

    iput v0, v4, Lai/j;->w:I

    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v5, Lkd/f;

    const/4 v6, 0x6

    const/4 v8, 0x0

    invoke-direct {v5, v4, v8, v6}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v6, 0x3

    invoke-static {v0, v8, v8, v5, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Ld1/j;

    new-instance v5, Lev/i;

    new-instance v6, Ll30/e;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v8, v4, v3}, Ll30/e;-><init>(Landroid/content/Context;Lai/j;Lq30/p0;)V

    new-instance v8, Ld0/o2;

    const/4 v9, 0x4

    invoke-direct {v8, v9}, Ld0/o2;-><init>(I)V

    new-instance v9, Lgm/r;

    invoke-direct {v9, p2, v1}, Lgm/r;-><init>(Lo30/f;Ln30/c;)V

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v6, v5, Lev/i;->a:Ljava/lang/Object;

    iput-object v8, v5, Lev/i;->b:Ljava/lang/Object;

    iput-object v2, v5, Lev/i;->c:Ljava/lang/Object;

    iput-object v4, v5, Lev/i;->d:Ljava/lang/Object;

    iput-object v9, v5, Lev/i;->e:Ljava/lang/Object;

    iput-object v3, v5, Lev/i;->f:Ljava/lang/Object;

    const-string v4, "3DS_LOA_SDK_STIN_020200_00960"

    iput-object v4, v5, Lev/i;->g:Ljava/lang/Object;

    iput-object v1, v5, Lev/i;->h:Ljava/lang/Object;

    iput-object p3, v5, Lev/i;->i:Ljava/lang/Object;

    const/16 p3, 0x1b

    invoke-direct {v0, p3, v5, p2}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ll30/c;->a()Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lp30/a;->a:Lq30/p0;

    iput-object v1, p0, Lp30/a;->b:Ln30/c;

    iput-object v0, p0, Lp30/a;->c:Ld1/j;

    return-void
.end method
