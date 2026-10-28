.class public final Lxi/b;
.super Lal/a;
.source "SourceFile"


# virtual methods
.method public final H0()Lti/h;
    .locals 2

    new-instance v0, Lti/h;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-direct {v0, v1}, Lti/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final bridge synthetic k0()Lti/d;
    .locals 1

    invoke-virtual {p0}, Lxi/b;->H0()Lti/h;

    move-result-object v0

    return-object v0
.end method
