.class public abstract Lmk2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001aI\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00002\u0006\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lec3/l;",
        "Ll83/a0;",
        "a",
        "()Lec3/l;",
        "Lyg2/d;",
        "heartRateFlow",
        "Lfv1/b;",
        "locationFlow",
        "",
        "gpsTrackingEnabled",
        "durationTickFlow",
        "Lmk2/w;",
        "b",
        "(Lec3/l;Lec3/l;ZLec3/l;)Lec3/l;",
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
.method public static final a()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lmk2/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmk2/x$a;-><init>(Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method public static final b(Lec3/l;Lec3/l;ZLec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lec3/l;",
            "Z",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "heartRateFlow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationTickFlow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmk2/x$b;

    invoke-direct {v0, p0}, Lmk2/x$b;-><init>(Lec3/l;)V

    new-instance p0, Lmk2/x$c;

    invoke-direct {p0, p3}, Lmk2/x$c;-><init>(Lec3/l;)V

    const/4 p3, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz p2, :cond_0

    new-instance p2, Lch/i;

    invoke-direct {p2, p1, v2}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lmk2/x$d;

    invoke-direct {p1, p2}, Lmk2/x$d;-><init>(Lec3/l;)V

    const/4 p2, 0x3

    new-array p2, p2, [Lec3/l;

    aput-object v0, p2, v1

    aput-object p0, p2, p3

    aput-object p1, p2, v2

    invoke-static {p2}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object p0

    return-object p0

    :cond_0
    new-array p1, v2, [Lec3/l;

    aput-object v0, p1, v1

    aput-object p0, p1, p3

    invoke-static {p1}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lec3/l;Lec3/l;ZLec3/l;ILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    invoke-static {}, Lmk2/x;->a()Lec3/l;

    move-result-object p3

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lmk2/x;->b(Lec3/l;Lec3/l;ZLec3/l;)Lec3/l;

    move-result-object p0

    return-object p0
.end method
