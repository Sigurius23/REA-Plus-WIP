.class public abstract Lmk2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001ak\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n0\t\"\u0004\u0008\u0000\u0010\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u001a\u0008\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n0\t0\u0008H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000f*\u0006\u0012\u0002\u0008\u00030\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "T",
        "",
        "maxAttempts",
        "",
        "delayMs",
        "Lkotlin/Function2;",
        "Ll83/a0;",
        "onRetry",
        "Lkotlin/Function0;",
        "Lec3/l;",
        "Lpm0/a;",
        "fetch",
        "c",
        "(IJLc93/m;Lc93/a;)Lec3/l;",
        "Lpm0/a$c;",
        "",
        "b",
        "(Lpm0/a$c;)Z",
        "track-activity_release"
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
.method public static final synthetic a(Lpm0/a$c;)Z
    .locals 0

    invoke-static {p0}, Lmk2/h;->b(Lpm0/a$c;)Z

    move-result p0

    return p0
.end method

.method private static final b(Lpm0/a$c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lpm0/a$c;->b()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lpm0/a$c;->b()I

    move-result p0

    const/16 v0, 0x1f4

    if-gt v0, p0, :cond_0

    const/16 v0, 0x258

    if-ge p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final c(IJLc93/m;Lc93/a;)Lec3/l;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(IJ",
            "Lc93/m;",
            "Lc93/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "onRetry"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetch"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmk2/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p4, v1}, Lmk2/h$a;-><init>(Lc93/a;Lq83/d;)V

    new-instance p4, Lec3/s1;

    invoke-direct {p4, v0}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance v0, Lmk2/h$b;

    invoke-direct {v0, v1}, Lmk2/h$b;-><init>(Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, p4, v0, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v4, Lmk2/h$c;

    const/4 v9, 0x0

    move v5, p0

    move-wide v7, p1

    move-object v6, p3

    invoke-direct/range {v4 .. v9}, Lmk2/h$c;-><init>(ILc93/m;JLq83/d;)V

    new-instance p0, Lec3/a0;

    invoke-direct {p0, v2, v4}, Lec3/a0;-><init>(Lec3/l;Lc93/n;)V

    new-instance p1, Lmk2/h$d;

    invoke-direct {p1, v1}, Lmk2/h$d;-><init>(Lq83/d;)V

    new-instance p2, Lec3/a0;

    invoke-direct {p2, p0, p1}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object p2
.end method
