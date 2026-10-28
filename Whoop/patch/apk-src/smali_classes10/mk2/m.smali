.class public abstract Lmk2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lcom/whoop/activitysession/PauseSegment;",
        "",
        "sessionElapsedMs",
        "Lmk2/d;",
        "a",
        "(Ljava/util/List;J)Lmk2/d;",
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
.method public static final a(Ljava/util/List;J)Lmk2/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;J)",
            "Lmk2/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmk2/d;

    invoke-static {p0, p1, p2}, Lx90/h;->a(Ljava/util/List;J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/time/Duration;->ofMillis(J)Ljava/time/Duration;

    move-result-object p1

    const-string p2, "ofMillis(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p0}, Lmk2/d;-><init>(Ljava/time/Duration;Ljava/util/List;)V

    return-object v0
.end method
