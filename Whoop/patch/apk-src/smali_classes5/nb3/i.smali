.class public final Lnb3/i;
.super Llb3/c0;
.source "SourceFile"


# instance fields
.field public final E:Ljava/util/List;

.field public final F:Z

.field public final G:[Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final x:Llb3/q0;

.field public final y:Lnb3/g;

.field public final z:Lnb3/k;


# direct methods
.method public varargs constructor <init>(Llb3/q0;Lnb3/g;Lnb3/k;Ljava/util/List;Z[Ljava/lang/String;)V
    .locals 1

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb3/i;->x:Llb3/q0;

    iput-object p2, p0, Lnb3/i;->y:Lnb3/g;

    iput-object p3, p0, Lnb3/i;->z:Lnb3/k;

    iput-object p4, p0, Lnb3/i;->E:Ljava/util/List;

    iput-boolean p5, p0, Lnb3/i;->F:Z

    iput-object p6, p0, Lnb3/i;->G:[Ljava/lang/String;

    iget-object p1, p3, Lnb3/k;->w:Ljava/lang/String;

    array-length p2, p6

    invoke-static {p6, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length p3, p2

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnb3/i;->H:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final X()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lnb3/i;->E:Ljava/util/List;

    return-object v0
.end method

.method public final Y()Llb3/k0;
    .locals 1

    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Llb3/k0;->y:Llb3/k0;

    return-object v0
.end method

.method public final i0()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lnb3/i;->x:Llb3/q0;

    return-object v0
.end method

.method public final k0()Z
    .locals 1

    iget-boolean v0, p0, Lnb3/i;->F:Z

    return v0
.end method

.method public final m0(Lmb3/f;)Llb3/y;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final s0(Lmb3/f;)Llb3/f1;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final t0(Llb3/k0;)Llb3/f1;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lnb3/i;->y:Lnb3/g;

    return-object v0
.end method

.method public final u0(Z)Llb3/c0;
    .locals 7

    new-instance v0, Lnb3/i;

    iget-object v1, p0, Lnb3/i;->G:[Ljava/lang/String;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, [Ljava/lang/String;

    iget-object v1, p0, Lnb3/i;->x:Llb3/q0;

    iget-object v2, p0, Lnb3/i;->y:Lnb3/g;

    iget-object v3, p0, Lnb3/i;->z:Lnb3/k;

    iget-object v4, p0, Lnb3/i;->E:Ljava/util/List;

    move v5, p1

    invoke-direct/range {v0 .. v6}, Lnb3/i;-><init>(Llb3/q0;Lnb3/g;Lnb3/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v0
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
