.class public final Lnb3/c;
.super Lu93/q0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lr93/e;)V
    .locals 17

    const-string v0, "containingDeclaration"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnb3/b;->w:[Lnb3/b;

    const-string v0, "<Error function>"

    invoke-static {v0}, Lva3/h;->g(Ljava/lang/String;)Lva3/h;

    move-result-object v5

    const/4 v6, 0x1

    sget-object v7, Lr93/s0;->q:Lr93/v0;

    const/4 v3, 0x0

    sget-object v4, Ls93/g;->a:Ls93/f;

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v7}, Lu93/q0;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILr93/s0;)V

    sget-object v0, Lnb3/k;->E:Lnb3/k;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v14

    sget-object v15, Lr93/a0;->z:Lr93/a0;

    sget-object v16, Lr93/q;->e:Lr93/p;

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lm83/y;->w:Lm83/y;

    move-object v12, v11

    move-object v13, v11

    move-object/from16 v8, p0

    invoke-virtual/range {v8 .. v16}, Lu93/q0;->W0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)Lu93/q0;

    return-void
.end method


# virtual methods
.method public final K0(Lr93/k;Lr93/a0;Lr93/r;)Lu93/q0;
    .locals 0

    const-string p2, "newOwner"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "visibility"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    const/4 p2, 0x2

    invoke-static {p2, p1}, Lih0/d0;->w(ILjava/lang/String;)V

    return-object p0
.end method

.method public final L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
    .locals 0

    const-string p3, "newOwner"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "kind"

    invoke-static {p1, p2}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string p1, "annotations"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final bridge synthetic a0(Lr93/e;Lr93/a0;Lr93/o;)Lr93/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnb3/c;->K0(Lr93/k;Lr93/a0;Lr93/r;)Lu93/q0;

    return-object p0
.end method

.method public final g0(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "overriddenDescriptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final h0(Lr93/a;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l0()Lr93/v;
    .locals 2

    new-instance v0, Lla/b;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lla/b;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method
