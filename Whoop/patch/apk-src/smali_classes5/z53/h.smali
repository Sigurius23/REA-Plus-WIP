.class public final Lz53/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li63/m;


# instance fields
.field public final synthetic c:Lud3/d0;


# direct methods
.method public constructor <init>(Lud3/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz53/h;->c:Lud3/d0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lz53/h;->c:Lud3/d0;

    invoke-virtual {v0}, Lud3/d0;->e()Ljava/util/TreeMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lc93/m;)V
    .locals 0

    check-cast p1, Lb2/r;

    invoke-static {p0, p1}, Lwb3/f;->z(Lo63/m;Lc93/m;)V

    return-void
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final get(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz53/h;->c:Lud3/d0;

    invoke-virtual {v0, p1}, Lud3/d0;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
