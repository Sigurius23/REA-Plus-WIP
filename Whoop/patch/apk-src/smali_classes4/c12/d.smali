.class public Lc12/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lc12/b;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Lc12/b;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p2}, Lc12/d;->g(Ljava/lang/String;)Lc12/d;

    invoke-virtual {p0, p3}, Lc12/d;->h(I)Lc12/d;

    invoke-virtual {p0, p1}, Lc12/d;->i(Lc12/b;)Lc12/d;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc12/d;->k(Z)Lc12/d;

    return-void
.end method

.method private b(Landroidx/core/app/NotificationCompat$Builder;)V
    .locals 5

    sget-object v0, Lc12/d$a;->a:[I

    iget-object v1, p0, Lc12/d;->a:Lc12/b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_0
    invoke-virtual {p1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_1
    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_2
    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_3
    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_4
    const/4 v0, -0x2

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    return-void
.end method

.method private c(Landroid/content/Context;)Landroid/app/NotificationChannel;
    .locals 4

    iget v0, p0, Lc12/d;->c:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lc12/d;->b:Ljava/lang/String;

    invoke-direct {p0}, Lc12/d;->d()I

    move-result v3

    invoke-direct {v1, v2, v0, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    iget v0, p0, Lc12/d;->d:I

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    :cond_0
    iget-boolean p1, p0, Lc12/d;->e:Z

    invoke-virtual {v1, p1}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    iget-boolean p1, p0, Lc12/d;->f:Z

    invoke-virtual {v1, p1}, Landroid/app/NotificationChannel;->enableLights(Z)V

    iget-boolean p1, p0, Lc12/d;->g:Z

    invoke-virtual {v1, p1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    return-object v1
.end method

.method private d()I
    .locals 3

    sget-object v0, Lc12/d$a;->a:[I

    iget-object v1, p0, Lc12/d;->a:Lc12/b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v2, 0x5

    if-eq v0, v2, :cond_0

    const/4 v0, 0x3

    return v0

    :cond_0
    return v1
.end method


# virtual methods
.method public a(Landroidx/core/app/NotificationCompat$Builder;)V
    .locals 2

    iget-object v0, p0, Lc12/d;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {p0, p1}, Lc12/d;->b(Landroidx/core/app/NotificationCompat$Builder;)V

    iget-object v0, p0, Lc12/d;->a:Lc12/b;

    invoke-virtual {v0}, Lc12/b;->hasSound()Z

    move-result v0

    iget-boolean v1, p0, Lc12/d;->e:Z

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x2

    :cond_0
    iget-boolean v1, p0, Lc12/d;->f:Z

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x4

    :cond_1
    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    return-void
.end method

.method public e(Landroid/app/NotificationManager;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p2}, Lc12/d;->c(Landroid/content/Context;)Landroid/app/NotificationChannel;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public f(I)Lc12/d;
    .locals 0

    iput p1, p0, Lc12/d;->d:I

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lc12/d;
    .locals 0

    iput-object p1, p0, Lc12/d;->b:Ljava/lang/String;

    return-object p0
.end method

.method public h(I)Lc12/d;
    .locals 0

    iput p1, p0, Lc12/d;->c:I

    return-object p0
.end method

.method public i(Lc12/b;)Lc12/d;
    .locals 0

    iput-object p1, p0, Lc12/d;->a:Lc12/b;

    return-object p0
.end method

.method public j(Z)Lc12/d;
    .locals 0

    iput-boolean p1, p0, Lc12/d;->f:Z

    return-object p0
.end method

.method public k(Z)Lc12/d;
    .locals 0

    iput-boolean p1, p0, Lc12/d;->g:Z

    return-object p0
.end method

.method public l(Z)Lc12/d;
    .locals 0

    iput-boolean p1, p0, Lc12/d;->e:Z

    return-object p0
.end method
