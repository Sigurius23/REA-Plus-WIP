.class public final Llb3/z;
.super Llb3/y;
.source "SourceFile"


# instance fields
.field public final x:Lkb3/n;

.field public final y:Lc93/a;

.field public final z:Lkb3/i;


# direct methods
.method public constructor <init>(Lkb3/n;Lc93/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/z;->x:Lkb3/n;

    iput-object p2, p0, Llb3/z;->y:Lc93/a;

    check-cast p1, Lkb3/k;

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, p0, Llb3/z;->z:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final X()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final Y()Llb3/k0;
    .locals 1

    invoke-virtual {p0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    return-object v0
.end method

.method public final i0()Llb3/q0;
    .locals 1

    invoke-virtual {p0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    return-object v0
.end method

.method public final k0()Z
    .locals 1

    invoke-virtual {p0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->k0()Z

    move-result v0

    return v0
.end method

.method public final m0(Lmb3/f;)Llb3/y;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb3/z;

    new-instance v1, Lce/d;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p1, p0}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Llb3/z;->x:Lkb3/n;

    invoke-direct {v0, p1, v1}, Llb3/z;-><init>(Lkb3/n;Lc93/a;)V

    return-object v0
.end method

.method public final p0()Llb3/f1;
    .locals 2

    invoke-virtual {p0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Llb3/z;

    if-eqz v1, :cond_0

    check-cast v0, Llb3/z;

    invoke-virtual {v0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Llb3/f1;

    return-object v0
.end method

.method public final r0()Llb3/y;
    .locals 1

    iget-object v0, p0, Llb3/z;->z:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/y;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Llb3/z;->z:Lkb3/i;

    iget-object v1, v0, Lkb3/h;->y:Ljava/lang/Object;

    sget-object v2, Lkb3/j;->w:Lkb3/j;

    if-eq v1, v2, :cond_0

    iget-object v0, v0, Lkb3/h;->y:Ljava/lang/Object;

    sget-object v1, Lkb3/j;->x:Lkb3/j;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "<Not computed yet>"

    return-object v0
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-virtual {p0}, Llb3/z;->r0()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    return-object v0
.end method
