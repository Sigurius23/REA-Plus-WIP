.class public abstract Lf6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method

.method public abstract b(Lf6/d;)Ljava/lang/Object;
.end method

.method public final c()Lf6/a;
    .locals 3

    new-instance v0, Lf6/a;

    invoke-virtual {p0}, Lf6/f;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf6/a;-><init>(Ljava/util/LinkedHashMap;Z)V

    return-object v0
.end method

.method public final d()Lf6/a;
    .locals 3

    new-instance v0, Lf6/a;

    invoke-virtual {p0}, Lf6/f;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf6/a;-><init>(Ljava/util/LinkedHashMap;Z)V

    return-object v0
.end method
