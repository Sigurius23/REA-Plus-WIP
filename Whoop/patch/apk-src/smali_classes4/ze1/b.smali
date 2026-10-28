.class public abstract Lze1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\u0008\u001a\u00020\u0001*\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "",
        "e",
        "([B)Ljava/lang/String;",
        "c",
        "Ljava/nio/ByteBuffer;",
        "d",
        "(Ljava/nio/ByteBuffer;)Ljava/lang/String;",
        "b",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "essentials_release"
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
.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->S(Ljava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, "-"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    sget-object v0, Lze1/a;->a:Lze1/a;

    invoke-virtual {v0, p0}, Lze1/a;->b(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lze1/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "null"

    return-object p0
.end method

.method public static final c([B)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_1

    sget-object v0, Lze1/a;->a:Lze1/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lze1/a;->d(Lze1/a;[BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lze1/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "null"

    return-object p0
.end method

.method public static final d(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    sget-object v0, Lze1/a;->a:Lze1/a;

    invoke-virtual {v0, p0}, Lze1/a;->b(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "null"

    return-object p0
.end method

.method public static final e([B)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_1

    sget-object v0, Lze1/a;->a:Lze1/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lze1/a;->d(Lze1/a;[BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "null"

    return-object p0
.end method
