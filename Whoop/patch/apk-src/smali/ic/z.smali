.class public final Lic/z;
.super Lic/q0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "workerClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final c()Lic/r0;
    .locals 4

    iget-boolean v0, p0, Lic/q0;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lic/q0;->c:Lqc/q;

    iget-object v0, v0, Lqc/q;->j:Lic/e;

    iget-boolean v0, v0, Lic/e;->d:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lic/a0;

    iget-object v1, p0, Lic/q0;->b:Ljava/util/UUID;

    iget-object v2, p0, Lic/q0;->c:Lqc/q;

    iget-object v3, p0, Lic/q0;->d:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3}, Lic/r0;-><init>(Ljava/util/UUID;Lqc/q;Ljava/util/Set;)V

    return-object v0
.end method

.method public final d()Lic/q0;
    .locals 0

    return-object p0
.end method
