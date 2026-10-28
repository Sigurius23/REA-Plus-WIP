.class public abstract Lwz0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwz0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "",
        "authoredMinDurationMs",
        "",
        "animationFailed",
        "a",
        "(Ljava/lang/Long;Z)Ljava/lang/Long;",
        "",
        "stepIndex",
        "lastIndex",
        "Li51/a;",
        "repeatMode",
        "animationFinished",
        "minimumDurationElapsed",
        "Lwz0/g;",
        "b",
        "(IILi51/a;ZZ)Lwz0/g;",
        "play",
        "stepCount",
        "c",
        "(IILi51/a;)I",
        "design_release"
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
.method public static final a(Ljava/lang/Long;Z)Ljava/lang/Long;
    .locals 2

    if-nez p0, :cond_1

    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    :cond_1
    return-object p0
.end method

.method public static final b(IILi51/a;ZZ)Lwz0/g;
    .locals 1

    const-string v0, "repeatMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li51/a;->OFF:Li51/a;

    if-ne p2, v0, :cond_0

    sget-object p0, Lwz0/g;->WAIT:Lwz0/g;

    return-object p0

    :cond_0
    if-eqz p3, :cond_4

    if-nez p4, :cond_1

    goto :goto_1

    :cond_1
    if-lt p0, p1, :cond_3

    sget-object p0, Li51/a;->LOOP:Li51/a;

    if-ne p2, p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Lwz0/g;->COMPLETE:Lwz0/g;

    return-object p0

    :cond_3
    :goto_0
    sget-object p0, Lwz0/g;->NEXT:Lwz0/g;

    return-object p0

    :cond_4
    :goto_1
    sget-object p0, Lwz0/g;->WAIT:Lwz0/g;

    return-object p0
.end method

.method public static final c(IILi51/a;)I
    .locals 1

    const-string v0, "repeatMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwz0/a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    rem-int/2addr p0, p1

    return p0

    :cond_0
    sub-int/2addr p1, v0

    if-le p0, p1, :cond_1

    return p1

    :cond_1
    return p0
.end method
