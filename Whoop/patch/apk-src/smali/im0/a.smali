.class public final Lim0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lim0/a;",
        "",
        "<init>",
        "()V",
        "Lfm0/b;",
        "domainState",
        "Lhm0/d;",
        "a",
        "(Lfm0/b;)Lhm0/d;",
        "bottom-navigation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfm0/b;)Lhm0/d;
    .locals 4

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhm0/d;

    invoke-virtual {p1}, Lfm0/b;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lfm0/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lfm0/b;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lfm0/b;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p1}, Lfm0/b;->c()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Lfm0/b;->e()Z

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lhm0/d;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-object v0
.end method
