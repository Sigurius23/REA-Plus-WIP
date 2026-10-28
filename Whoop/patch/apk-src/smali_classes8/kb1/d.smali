.class public abstract Lkb1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\n\u001a\u00020\t\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0008\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "DateModel",
        "Lh91/b;",
        "domainState",
        "",
        "monthIndex",
        "Lkotlin/Function1;",
        "Lkb1/e;",
        "Lqy0/a;",
        "mapper",
        "Lg51/c;",
        "a",
        "(Lh91/b;ILkotlin/jvm/functions/Function1;)Lg51/c;",
        "design-models_release"
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
.method public static final a(Lh91/b;ILkotlin/jvm/functions/Function1;)Lg51/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DateModel:",
            "Ljava/lang/Object;",
            ">(",
            "Lh91/b<",
            "TDateModel;>;I",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lg51/c;"
        }
    .end annotation

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkb1/c;

    invoke-direct {v0, p2}, Lkb1/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, p1}, Lkb1/c;->e(Lh91/b;I)Lg51/c;

    move-result-object p0

    return-object p0
.end method
