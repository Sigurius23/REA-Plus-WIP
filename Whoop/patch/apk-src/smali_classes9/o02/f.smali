.class public abstract Lo02/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u00022\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lo02/d;",
        "base",
        "Lkotlin/Function1;",
        "Lo02/e;",
        "Ll83/a0;",
        "block",
        "a",
        "(Lo02/d;Lkotlin/jvm/functions/Function1;)Lo02/d;",
        "Lj02/c;",
        "NavigationScreenConfig",
        "navigation_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lo02/d;Lkotlin/jvm/functions/Function1;)Lo02/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo02/d;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lo02/d;"
        }
    .end annotation

    const-string v0, "base"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo02/e;

    invoke-direct {v0}, Lo02/e;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lo02/e;->c()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Lo02/e;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p0

    return-object p0
.end method
