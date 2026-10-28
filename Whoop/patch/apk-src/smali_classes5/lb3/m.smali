.class public abstract Llb3/m;
.super Llb3/c0;
.source "SourceFile"


# virtual methods
.method public final X()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Llb3/m;->w0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public Y()Llb3/k0;
    .locals 1

    invoke-virtual {p0}, Llb3/m;->w0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    return-object v0
.end method

.method public final i0()Llb3/q0;
    .locals 1

    invoke-virtual {p0}, Llb3/m;->w0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    return-object v0
.end method

.method public k0()Z
    .locals 1

    invoke-virtual {p0}, Llb3/m;->w0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->k0()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic m0(Lmb3/f;)Llb3/y;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/m;->x0(Lmb3/f;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s0(Lmb3/f;)Llb3/f1;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/m;->x0(Lmb3/f;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-virtual {p0}, Llb3/m;->w0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    return-object v0
.end method

.method public abstract w0()Llb3/c0;
.end method

.method public x0(Lmb3/f;)Llb3/c0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/m;->w0()Llb3/c0;

    move-result-object p1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Llb3/m;->y0(Llb3/c0;)Llb3/m;

    move-result-object p1

    return-object p1
.end method

.method public abstract y0(Llb3/c0;)Llb3/m;
.end method
