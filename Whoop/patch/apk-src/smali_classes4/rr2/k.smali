.class public abstract Lrr2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a3\u0010\n\u001a\u00020\t2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "La6/g;",
        "Lf6/f;",
        "prefsDataStore",
        "Lzr2/a;",
        "dataTimeProvider",
        "Lor2/g;",
        "buildConfigProvider",
        "Lrr2/o;",
        "sentryReporter",
        "Lrr2/a;",
        "a",
        "(La6/g;Lzr2/a;Lor2/g;Lrr2/o;)Lrr2/a;",
        "app_prodStandardRelease"
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
.method public static final a(La6/g;Lzr2/a;Lor2/g;Lrr2/o;)Lrr2/a;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Lzr2/a;",
            "Lor2/g;",
            "Lrr2/o;",
            ")",
            "Lrr2/a;"
        }
    .end annotation

    const-string v0, "prefsDataStore"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfigProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sentryReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lrr2/h;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Lrr2/h;-><init>(Ltr2/n;La6/g;Lzr2/a;Lor2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p0, 0x2

    new-array p0, p0, [Lrr2/c;

    const/4 p1, 0x0

    aput-object v1, p0, p1

    const/4 p1, 0x1

    aput-object p3, p0, p1

    invoke-static {p0}, Lrr2/d;->a([Lrr2/c;)Lrr2/a;

    move-result-object p0

    return-object p0
.end method
