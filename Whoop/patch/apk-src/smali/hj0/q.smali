.class public Lhj0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/content/Intent;

.field private c:Landroidx/core/app/ActivityOptionsCompat;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p0, p1}, Lhj0/q;->l(Landroid/content/Context;)V

    .line 6
    iput-object p2, p0, Lhj0/q;->b:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lhj0/q;->l(Landroid/content/Context;)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lhj0/q;->b:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 7
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Lhj0/q;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method private g()Landroidx/core/app/ActivityOptionsCompat;
    .locals 1

    iget-object v0, p0, Lhj0/q;->c:Landroidx/core/app/ActivityOptionsCompat;

    return-object v0
.end method


# virtual methods
.method public a()Lhj0/q;
    .locals 2

    iget-object v0, p0, Lhj0/q;->b:Landroid/content/Intent;

    const v1, 0x8000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object p0
.end method

.method public b()Lhj0/q;
    .locals 2

    iget-object v0, p0, Lhj0/q;->b:Landroid/content/Intent;

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object p0
.end method

.method public c()Lhj0/q;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object p0
.end method

.method public d()Lhj0/q;
    .locals 3

    iget-object v0, p0, Lhj0/q;->a:Landroid/content/Context;

    sget v1, Lnf1/a;->l:I

    sget v2, Lnf1/a;->s:I

    invoke-static {v0, v1, v2}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhj0/q;->k(Landroidx/core/app/ActivityOptionsCompat;)V

    return-object p0
.end method

.method public e()Lhj0/q;
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lhj0/f;->y(Landroid/content/Intent;)V

    iget-object v0, p0, Lhj0/q;->a:Landroid/content/Context;

    sget v1, Lnf1/a;->o:I

    sget v2, Lnf1/a;->q:I

    invoke-static {v0, v1, v2}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhj0/q;->k(Landroidx/core/app/ActivityOptionsCompat;)V

    return-object p0
.end method

.method public f()Landroid/content/Intent;
    .locals 1

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lhj0/q;->a:Landroid/content/Context;

    return-object v0
.end method

.method public i()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lhj0/q;->b:Landroid/content/Intent;

    return-object v0
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lhj0/q;->a:Landroid/content/Context;

    return-void
.end method

.method public k(Landroidx/core/app/ActivityOptionsCompat;)V
    .locals 0

    iput-object p1, p0, Lhj0/q;->c:Landroidx/core/app/ActivityOptionsCompat;

    return-void
.end method

.method public l(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lhj0/q;->a:Landroid/content/Context;

    return-void
.end method

.method public m()V
    .locals 3

    invoke-direct {p0}, Lhj0/q;->g()Landroidx/core/app/ActivityOptionsCompat;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhj0/q;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lhj0/q;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0}, Landroidx/core/app/ActivityOptionsCompat;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v1, v2, v0}, Ls4/c;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "setPausedForTransition"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    throw v0
.end method

.method public n(Landroid/app/Activity;I)V
    .locals 2

    invoke-direct {p0}, Lhj0/q;->g()Landroidx/core/app/ActivityOptionsCompat;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/core/app/ActivityOptionsCompat;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {p1, v1, p2, v0}, Landroidx/core/app/ActivityCompat;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public o(Landroid/net/Uri;)Lhj0/q;
    .locals 1

    iget-object v0, p0, Lhj0/q;->b:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object p0
.end method

.method public p(Landroid/os/Bundle;)Lhj0/q;
    .locals 2

    iget-object v0, p0, Lhj0/q;->b:Landroid/content/Intent;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v0, p0, Lhj0/q;->b:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    return-object p0
.end method
