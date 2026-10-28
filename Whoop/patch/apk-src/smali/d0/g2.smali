.class public interface abstract Ld0/g2;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract c(Ld0/r;Ld0/r;Ld0/r;)J
.end method

.method public f(Ld0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Ld0/g2;->c(Ld0/r;Ld0/r;Ld0/r;)J

    move-result-wide v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Ld0/g2;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method

.method public abstract h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
.end method

.method public abstract m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
.end method
