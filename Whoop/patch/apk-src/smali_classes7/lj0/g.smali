.class public abstract Llj0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Llj0/f;",
        "c",
        "(Llj0/f;)Llj0/f;",
        "b",
        "",
        "a",
        "(Llj0/f;)I",
        "total",
        "connectivity_release"
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
.method public static final a(Llj0/f;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llj0/f;->d()I

    move-result v0

    invoke-virtual {p0}, Llj0/f;->c()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final b(Llj0/f;)Llj0/f;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llj0/f;->c()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v1, v2}, Llj0/f;->b(Llj0/f;IIILjava/lang/Object;)Llj0/f;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Llj0/f;)Llj0/f;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llj0/f;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, Llj0/f;->b(Llj0/f;IIILjava/lang/Object;)Llj0/f;

    move-result-object p0

    return-object p0
.end method
