.class public interface abstract Lmk2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ`\u0010\u0014\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0016H\u00a6@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0002H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH&\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002H&\u00a2\u0006\u0004\u0008!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006$\u00c0\u0006\u0003"
    }
    d2 = {
        "Lmk2/u;",
        "",
        "Lec3/l;",
        "Lmk2/w;",
        "sessionUpdateFlow",
        "",
        "gpsTrackingEnabled",
        "",
        "sessionStartTimeMs",
        "",
        "activityInternalName",
        "enableHeartRateStream",
        "Lcom/whoop/trackactivity/domain/models/SessionTargets;",
        "targetsFlow",
        "c",
        "(Lec3/l;ZJLjava/lang/String;ZLec3/l;Lq83/d;)Ljava/lang/Object;",
        "startTimeMs",
        "",
        "Lcom/whoop/activitysession/PauseSegment;",
        "pauseSegments",
        "b",
        "(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "pause",
        "()V",
        "resume",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lmk2/l;",
        "f",
        "()Lec3/l;",
        "d",
        "()Lmk2/l;",
        "e",
        "isRunning",
        "()Z",
        "track-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "ZJ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;Z",
            "Lec3/l;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Lec3/l;ZJLjava/lang/String;ZLec3/l;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "ZJ",
            "Ljava/lang/String;",
            "Z",
            "Lec3/l;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d()Lmk2/l;
.end method

.method public abstract e()Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation
.end method

.method public abstract f()Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation
.end method

.method public abstract isRunning()Z
.end method

.method public abstract pause()V
.end method

.method public abstract resume()V
.end method
