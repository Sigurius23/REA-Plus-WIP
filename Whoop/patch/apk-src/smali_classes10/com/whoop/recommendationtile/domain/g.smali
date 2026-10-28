.class public abstract Lcom/whoop/recommendationtile/domain/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aE\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "T",
        "R",
        "Lec3/l;",
        "Lkotlin/Function1;",
        "transform",
        "b",
        "(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;",
        "recommendation-tile-arch-mini_release"
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
.method public static final synthetic a(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/recommendationtile/domain/g;->b(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/l;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/recommendationtile/domain/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/recommendationtile/domain/g$a;-><init>(Lec3/l;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->l(Lc93/m;)Lec3/h;

    move-result-object p0

    return-object p0
.end method
