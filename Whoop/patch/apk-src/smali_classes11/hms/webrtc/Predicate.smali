.class public interface abstract Lhms/webrtc/Predicate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public and(Lhms/webrtc/Predicate;)Lhms/webrtc/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/Predicate<",
            "-TT;>;)",
            "Lhms/webrtc/Predicate<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhms/webrtc/Predicate$2;

    invoke-direct {v0, p0, p1}, Lhms/webrtc/Predicate$2;-><init>(Lhms/webrtc/Predicate;Lhms/webrtc/Predicate;)V

    return-object v0
.end method

.method public negate()Lhms/webrtc/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhms/webrtc/Predicate<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhms/webrtc/Predicate$3;

    invoke-direct {v0, p0}, Lhms/webrtc/Predicate$3;-><init>(Lhms/webrtc/Predicate;)V

    return-object v0
.end method

.method public or(Lhms/webrtc/Predicate;)Lhms/webrtc/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/Predicate<",
            "-TT;>;)",
            "Lhms/webrtc/Predicate<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhms/webrtc/Predicate$1;

    invoke-direct {v0, p0, p1}, Lhms/webrtc/Predicate$1;-><init>(Lhms/webrtc/Predicate;Lhms/webrtc/Predicate;)V

    return-object v0
.end method

.method public abstract test(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method
