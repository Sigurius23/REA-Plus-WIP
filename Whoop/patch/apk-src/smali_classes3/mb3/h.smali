.class public final Lmb3/h;
.super Llb3/c0;
.source "SourceFile"

# interfaces
.implements Lob3/d;


# instance fields
.field public final E:Llb3/k0;

.field public final F:Z

.field public final G:Z

.field public final x:Lob3/b;

.field public final y:Lmb3/i;

.field public final z:Llb3/f1;


# direct methods
.method public constructor <init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZI)V
    .locals 7

    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_0

    .line 8
    sget-object p4, Llb3/k0;->x:Lwe/o;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    sget-object p4, Llb3/k0;->y:Llb3/k0;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 10
    invoke-direct/range {v0 .. v6}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZZ)V

    return-void
.end method

.method public constructor <init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZZ)V
    .locals 1

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmb3/h;->x:Lob3/b;

    .line 3
    iput-object p2, p0, Lmb3/h;->y:Lmb3/i;

    .line 4
    iput-object p3, p0, Lmb3/h;->z:Llb3/f1;

    .line 5
    iput-object p4, p0, Lmb3/h;->E:Llb3/k0;

    .line 6
    iput-boolean p5, p0, Lmb3/h;->F:Z

    .line 7
    iput-boolean p6, p0, Lmb3/h;->G:Z

    return-void
.end method


# virtual methods
.method public final A0(Lmb3/f;)Lmb3/h;
    .locals 11

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmb3/h;->y:Lmb3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lmb3/i;->w:Llb3/u0;

    invoke-virtual {v1, p1}, Llb3/u0;->d(Lmb3/f;)Llb3/u0;

    move-result-object v1

    iget-object v2, v0, Lmb3/i;->x:Lc93/a;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    new-instance v2, Lce/d;

    const/4 v4, 0x7

    invoke-direct {v2, v4, v0, p1}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    iget-object p1, v0, Lmb3/i;->y:Lmb3/i;

    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    iget-object v0, v0, Lmb3/i;->z:Lr93/x0;

    new-instance v6, Lmb3/i;

    invoke-direct {v6, v1, v2, p1, v0}, Lmb3/i;-><init>(Llb3/u0;Lc93/a;Lmb3/i;Lr93/x0;)V

    iget-object p1, p0, Lmb3/h;->z:Llb3/f1;

    if-eqz p1, :cond_2

    move-object v7, p1

    goto :goto_1

    :cond_2
    move-object v7, v3

    :goto_1
    new-instance v4, Lmb3/h;

    iget-object v5, p0, Lmb3/h;->x:Lob3/b;

    iget-object v8, p0, Lmb3/h;->E:Llb3/k0;

    iget-boolean v9, p0, Lmb3/h;->F:Z

    const/16 v10, 0x20

    invoke-direct/range {v4 .. v10}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZI)V

    return-object v4
.end method

.method public final X()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final Y()Llb3/k0;
    .locals 1

    iget-object v0, p0, Lmb3/h;->E:Llb3/k0;

    return-object v0
.end method

.method public final i0()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lmb3/h;->y:Lmb3/i;

    return-object v0
.end method

.method public final k0()Z
    .locals 1

    iget-boolean v0, p0, Lmb3/h;->F:Z

    return v0
.end method

.method public final bridge synthetic m0(Lmb3/f;)Llb3/y;
    .locals 0

    invoke-virtual {p0, p1}, Lmb3/h;->A0(Lmb3/f;)Lmb3/h;

    move-result-object p1

    return-object p1
.end method

.method public final r0(Z)Llb3/f1;
    .locals 7

    new-instance v0, Lmb3/h;

    iget-object v4, p0, Lmb3/h;->E:Llb3/k0;

    const/16 v6, 0x20

    iget-object v1, p0, Lmb3/h;->x:Lob3/b;

    iget-object v2, p0, Lmb3/h;->y:Lmb3/i;

    iget-object v3, p0, Lmb3/h;->z:Llb3/f1;

    move v5, p1

    invoke-direct/range {v0 .. v6}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZI)V

    return-object v0
.end method

.method public final bridge synthetic s0(Lmb3/f;)Llb3/f1;
    .locals 0

    invoke-virtual {p0, p1}, Lmb3/h;->A0(Lmb3/f;)Lmb3/h;

    move-result-object p1

    return-object p1
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 3

    sget-object v0, Lnb3/h;->x:Lnb3/h;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lnb3/l;->a(Lnb3/h;Z[Ljava/lang/String;)Lnb3/g;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Z)Llb3/c0;
    .locals 7

    new-instance v0, Lmb3/h;

    iget-object v4, p0, Lmb3/h;->E:Llb3/k0;

    const/16 v6, 0x20

    iget-object v1, p0, Lmb3/h;->x:Lob3/b;

    iget-object v2, p0, Lmb3/h;->y:Lmb3/i;

    iget-object v3, p0, Lmb3/h;->z:Llb3/f1;

    move v5, p1

    invoke-direct/range {v0 .. v6}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZI)V

    return-object v0
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 8

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmb3/h;

    iget-boolean v6, p0, Lmb3/h;->F:Z

    iget-boolean v7, p0, Lmb3/h;->G:Z

    iget-object v2, p0, Lmb3/h;->x:Lob3/b;

    iget-object v3, p0, Lmb3/h;->y:Lmb3/i;

    iget-object v4, p0, Lmb3/h;->z:Llb3/f1;

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZZ)V

    return-object v1
.end method

.method public final w0()Lob3/b;
    .locals 1

    iget-object v0, p0, Lmb3/h;->x:Lob3/b;

    return-object v0
.end method

.method public final x0()Lmb3/i;
    .locals 1

    iget-object v0, p0, Lmb3/h;->y:Lmb3/i;

    return-object v0
.end method

.method public final y0()Llb3/f1;
    .locals 1

    iget-object v0, p0, Lmb3/h;->z:Llb3/f1;

    return-object v0
.end method

.method public final z0()Z
    .locals 1

    iget-boolean v0, p0, Lmb3/h;->G:Z

    return v0
.end method
