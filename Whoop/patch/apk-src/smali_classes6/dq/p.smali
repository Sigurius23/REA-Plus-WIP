.class public final Ldq/p;
.super Lcom/google/android/gms/common/api/h;
.source "SourceFile"


# virtual methods
.method public final c(Ldq/m;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v0

    new-instance v1, Lro/i;

    const/16 v2, 0x1c

    invoke-direct {v1, p1, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Le73/b;->e:Ljava/lang/Object;

    sget-object p1, Ldq/u;->b:Lcom/google/android/gms/common/c;

    filled-new-array {p1}, [Lcom/google/android/gms/common/c;

    move-result-object p1

    iput-object p1, v0, Le73/b;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Le73/b;->b:Z

    const/16 p1, 0x5c9b

    iput p1, v0, Le73/b;->d:I

    invoke-virtual {v0}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
