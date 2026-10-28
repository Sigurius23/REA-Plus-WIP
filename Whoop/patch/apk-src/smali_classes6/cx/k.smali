.class public final Lcx/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/fragment/app/r0;

.field public b:I

.field public c:Ljava/util/LinkedHashSet;

.field public d:Ljava/util/LinkedHashSet;

.field public e:Ljava/util/LinkedHashSet;

.field public f:Ljava/util/LinkedHashSet;

.field public g:Ljava/util/LinkedHashSet;

.field public h:Ljava/util/LinkedHashSet;

.field public i:Ljava/util/LinkedHashSet;

.field public j:Ljava/util/LinkedHashSet;

.field public k:Ljava/util/LinkedHashSet;

.field public l:Lax/c;

.field public m:Lax/a;

.field public n:Lax/b;


# virtual methods
.method public final a()Landroidx/fragment/app/r0;
    .locals 1

    iget-object v0, p0, Lcx/k;->a:Landroidx/fragment/app/r0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "activity"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final b()Landroidx/fragment/app/o1;
    .locals 2

    invoke-virtual {p0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Lcx/j;
    .locals 5

    invoke-virtual {p0}, Lcx/k;->b()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "InvisibleFragment"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lcx/j;

    return-object v0

    :cond_0
    new-instance v0, Lcx/j;

    invoke-direct {v0}, Lcx/j;-><init>()V

    invoke-virtual {p0}, Lcx/k;->b()Landroidx/fragment/app/o1;

    move-result-object v2

    new-instance v3, Landroidx/fragment/app/a;

    invoke-direct {v3, v2}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v1, v4}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    iget-boolean v1, v3, Landroidx/fragment/app/c2;->i:Z

    if-nez v1, :cond_1

    iput-boolean v2, v3, Landroidx/fragment/app/c2;->j:Z

    iget-object v1, v3, Landroidx/fragment/app/a;->t:Landroidx/fragment/app/o1;

    invoke-virtual {v1, v3, v4}, Landroidx/fragment/app/o1;->A(Landroidx/fragment/app/a;Z)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    return v0
.end method

.method public final e(Lax/c;)V
    .locals 3

    iput-object p1, p0, Lcx/k;->l:Lax/c;

    invoke-virtual {p0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result p1

    iput p1, p0, Lcx/k;->b:I

    invoke-virtual {p0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object p1

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcx/k;->a()Landroidx/fragment/app/r0;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :goto_0
    new-instance p1, Lcx/l;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, Lcx/l;-><init>(Lcx/k;I)V

    new-instance v0, Lcx/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcx/l;-><init>(Lcx/k;I)V

    iput-object v0, p1, Lcx/a;->b:Lcx/a;

    new-instance v1, Lcx/l;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lcx/l;-><init>(Lcx/k;I)V

    iput-object v1, v0, Lcx/a;->b:Lcx/a;

    new-instance v0, Lcx/l;

    const/4 v2, 0x6

    invoke-direct {v0, p0, v2}, Lcx/l;-><init>(Lcx/k;I)V

    iput-object v0, v1, Lcx/a;->b:Lcx/a;

    new-instance v1, Lcx/m;

    invoke-direct {v1, p0}, Lcx/a;-><init>(Lcx/k;)V

    iput-object v1, v0, Lcx/a;->b:Lcx/a;

    new-instance v0, Lcx/l;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Lcx/l;-><init>(Lcx/k;I)V

    iput-object v0, v1, Lcx/a;->b:Lcx/a;

    new-instance v1, Lcx/l;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lcx/l;-><init>(Lcx/k;I)V

    iput-object v1, v0, Lcx/a;->b:Lcx/a;

    new-instance v0, Lcx/l;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lcx/l;-><init>(Lcx/k;I)V

    iput-object v0, v1, Lcx/a;->b:Lcx/a;

    invoke-interface {p1}, Lcx/b;->m()V

    return-void
.end method

.method public final f(Ljava/util/HashSet;Lcx/l;)V
    .locals 1

    const-string v0, "permissions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    iput-object p0, v0, Lcx/j;->x:Lcx/k;

    iput-object p2, v0, Lcx/j;->y:Lcx/b;

    iget-object p2, v0, Lcx/j;->z:Lj/d;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method
