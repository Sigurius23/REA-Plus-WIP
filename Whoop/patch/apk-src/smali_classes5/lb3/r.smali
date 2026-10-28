.class public abstract Llb3/r;
.super Llb3/f1;
.source "SourceFile"

# interfaces
.implements Lob3/f;


# instance fields
.field public final x:Llb3/c0;

.field public final y:Llb3/c0;


# direct methods
.method public constructor <init>(Llb3/c0;Llb3/c0;)V
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/r;->x:Llb3/c0;

    iput-object p2, p0, Llb3/r;->y:Llb3/c0;

    return-void
.end method


# virtual methods
.method public final X()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Llb3/r;->u0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final Y()Llb3/k0;
    .locals 1

    invoke-virtual {p0}, Llb3/r;->u0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    return-object v0
.end method

.method public final i0()Llb3/q0;
    .locals 1

    invoke-virtual {p0}, Llb3/r;->u0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    return-object v0
.end method

.method public final k0()Z
    .locals 1

    invoke-virtual {p0}, Llb3/r;->u0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->k0()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxa3/i;->e:Lxa3/i;

    invoke-virtual {v0, p0}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-virtual {p0}, Llb3/r;->u0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    return-object v0
.end method

.method public abstract u0()Llb3/c0;
.end method

.method public abstract v0(Lxa3/i;Lxa3/i;)Ljava/lang/String;
.end method
