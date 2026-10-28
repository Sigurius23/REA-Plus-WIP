.class public interface abstract Ld0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/l;


# virtual methods
.method public a(Ld0/f2;)Ld0/g2;
    .locals 0

    new-instance p1, Lzt/q;

    invoke-direct {p1, p0}, Lzt/q;-><init>(Ld0/d0;)V

    return-object p1
.end method

.method public abstract b(FFFJ)F
.end method

.method public c(FFF)F
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Ld0/d0;->d(FFF)J

    move-result-wide v4

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Ld0/d0;->b(FFFJ)F

    move-result p1

    return p1
.end method

.method public abstract d(FFF)J
.end method

.method public abstract e(FFFJ)F
.end method
