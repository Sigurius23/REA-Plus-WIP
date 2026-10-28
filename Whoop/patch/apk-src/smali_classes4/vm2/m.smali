.class public final Lvm2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lvm2/m;",
        "",
        "Lji0/f;",
        "configSource",
        "Lvm2/a;",
        "tabResolver",
        "<init>",
        "(Lji0/f;Lvm2/a;)V",
        "Lj02/m0;",
        "current",
        "",
        "a",
        "(Lj02/m0;)Z",
        "Lji0/f;",
        "b",
        "Lvm2/a;",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lji0/f;

.field private final b:Lvm2/a;


# direct methods
.method public constructor <init>(Lji0/f;Lvm2/a;)V
    .locals 1

    const-string v0, "configSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tabResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvm2/m;->a:Lji0/f;

    iput-object p2, p0, Lvm2/m;->b:Lvm2/a;

    return-void
.end method


# virtual methods
.method public final a(Lj02/m0;)Z
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvm2/m;->a:Lji0/f;

    invoke-interface {v0}, Lji0/f;->d()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/appconfiguration/TabConfiguration;

    iget-object v2, p0, Lvm2/m;->b:Lvm2/a;

    invoke-virtual {v2, v1}, Lvm2/a;->a(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1, p1}, Lvm2/n;->b(Lj02/m0;Lj02/m0;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    return v2

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
