.class public final Lcx/m;
.super Lcx/a;
.source "SourceFile"


# virtual methods
.method public final m()V
    .locals 4

    iget-object v0, p0, Lcx/a;->a:Lcx/k;

    iget-object v1, v0, Lcx/k;->d:Ljava/util/LinkedHashSet;

    const-string v2, "android.permission.MANAGE_EXTERNAL_STORAGE"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v1, v3, :cond_2

    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcx/a;->a()V

    return-void

    :cond_0
    iget-object v1, v0, Lcx/k;->m:Lax/a;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcx/a;->a()V

    return-void

    :cond_1
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, v0, Lcx/k;->m:Lax/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcx/a;->c:Lcx/c;

    invoke-interface {v0, v2, v1}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcx/a;->a()V

    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 1

    iget-object p1, p0, Lcx/a;->a:Lcx/k;

    invoke-virtual {p1}, Lcx/k;->c()Lcx/j;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Lcx/j;->B(Lcx/k;Lcx/m;)V

    return-void
.end method
