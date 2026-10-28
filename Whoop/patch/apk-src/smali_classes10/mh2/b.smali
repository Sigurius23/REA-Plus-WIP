.class public abstract Lmh2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Loh2/b;",
        "Loh2/b$b;",
        "b",
        "(Loh2/b;)Loh2/b$b;",
        "legacyOrZero",
        "strap-metadata_release"
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
.method public static final synthetic a(Loh2/b;)Loh2/b$b;
    .locals 0

    invoke-static {p0}, Lmh2/b;->b(Loh2/b;)Loh2/b$b;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Loh2/b;)Loh2/b$b;
    .locals 9

    instance-of v0, p0, Loh2/b$b;

    if-eqz v0, :cond_0

    check-cast p0, Loh2/b$b;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    new-instance v0, Loh2/b$b;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v8}, Loh2/b$b;-><init>(JJJJ)V

    return-object v0

    :cond_1
    return-object p0
.end method
