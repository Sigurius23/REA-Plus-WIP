.class public final Lv30/k;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ld0/o2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld0/o2;-><init>(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ld0/o2;->o(I)V

    new-instance v6, Ldq/t;

    invoke-direct {v6, v0}, Ldq/t;-><init>(Ld0/o2;)V

    new-instance v2, Ldq/p;

    sget-object v5, Ldq/u;->a:Lcom/google/android/gms/common/api/f;

    sget-object v7, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v4, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    new-instance p1, Ldq/i;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput v1, p1, Ldq/i;->w:I

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v3, Lro/i;

    const/16 v4, 0x1d

    invoke-direct {v3, p1, v4}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object v3, v0, Le73/b;->e:Ljava/lang/Object;

    sget-object p1, Ldq/u;->c:Lcom/google/android/gms/common/c;

    filled-new-array {p1}, [Lcom/google/android/gms/common/c;

    move-result-object p1

    iput-object p1, v0, Le73/b;->c:Ljava/lang/Object;

    iput-boolean v1, v0, Le73/b;->b:Z

    const/16 p1, 0x5ca4

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lsg2/b;

    const/16 v1, 0x1d

    invoke-direct {v0, p3, v1}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance p3, Lrm/p;

    const/16 v1, 0xe

    invoke-direct {p3, v0, v1}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lcom/mapbox/common/location/a;

    const/16 v0, 0x9

    invoke-direct {p3, p2, v0}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
