.class public abstract Lev0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001b\u0010\u0008\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lev0/a;",
        "a",
        "(Lev0/a;)Lev0/a;",
        "",
        "newDuration",
        "d",
        "(Lev0/a;J)Lev0/a;",
        "currentTimeMillis",
        "b",
        "Ltd1/e;",
        "newState",
        "c",
        "(Lev0/a;Ltd1/e;)Lev0/a;",
        "connectivity-analytics_release"
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
.method public static final a(Lev0/a;)Lev0/a;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lev0/a;->c()I

    move-result v0

    add-int/lit8 v2, v0, 0x1

    const/16 v8, 0xe

    const/4 v9, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lev0/a;->b(Lev0/a;IJJLtd1/e;ILjava/lang/Object;)Lev0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lev0/a;J)Lev0/a;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0xb

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-wide v5, p1

    invoke-static/range {v1 .. v9}, Lev0/a;->b(Lev0/a;IJJLtd1/e;ILjava/lang/Object;)Lev0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lev0/a;Ltd1/e;)Lev0/a;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Lev0/a;->b(Lev0/a;IJJLtd1/e;ILjava/lang/Object;)Lev0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lev0/a;J)Lev0/a;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-wide v3, p1

    invoke-static/range {v1 .. v9}, Lev0/a;->b(Lev0/a;IJJLtd1/e;ILjava/lang/Object;)Lev0/a;

    move-result-object p0

    return-object p0
.end method
