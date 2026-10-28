.class public abstract Lic/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/String;Lic/a0;)Ljc/o;
    .locals 6

    sget-object v3, Lic/l;->w:Lic/l;

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move-object v1, p0

    check-cast v1, Ljc/v;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    new-instance v0, Ljc/o;

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Ljc/o;-><init>(Ljc/v;Ljava/lang/String;Lic/l;Ljava/util/List;I)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "beginUniqueWork needs at least one OneTimeWorkRequest."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract b(Ljava/lang/String;)Lic/f0;
.end method

.method public final c(Lic/r0;)Lic/e0;
    .locals 7

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v2, p0

    check-cast v2, Ljc/v;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance v1, Ljc/o;

    sget-object v4, Lic/l;->x:Lic/l;

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Ljc/o;-><init>(Ljc/v;Ljava/lang/String;Lic/l;Ljava/util/List;I)V

    invoke-virtual {v1}, Ljc/o;->U()Lic/e0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;
.end method

.method public final e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;
    .locals 7

    const-string v0, "uniqueWorkName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v2, p0

    check-cast v2, Ljc/v;

    new-instance v1, Ljc/o;

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Ljc/o;-><init>(Ljc/v;Ljava/lang/String;Lic/l;Ljava/util/List;I)V

    invoke-virtual {v1}, Ljc/o;->U()Lic/e0;

    move-result-object p1

    return-object p1
.end method
