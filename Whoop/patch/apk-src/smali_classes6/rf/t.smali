.class public final Lrf/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmf/h;


# instance fields
.field public final c:Lud3/d0;


# direct methods
.method public constructor <init>(Lud3/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/t;->c:Lud3/d0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lrf/t;->c:Lud3/d0;

    invoke-virtual {v0}, Lud3/d0;->e()Ljava/util/TreeMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lrf/t;->c:Lud3/d0;

    invoke-virtual {v0, p1}, Lud3/d0;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final f()Z
    .locals 2

    const-string v0, "Accept-Encoding"

    iget-object v1, p0, Lrf/t;->c:Lud3/d0;

    invoke-virtual {v1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lrf/t;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lrf/t;->c:Lud3/d0;

    invoke-virtual {v0}, Lud3/d0;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
