.class public final Ljb3/t;
.super Lu93/q0;
.source "SourceFile"

# interfaces
.implements Ljb3/b;


# instance fields
.field public final e0:Lqa3/c0;

.field public final f0:Lsa3/f;

.field public final g0:Lsa3/h;

.field public final h0:Lsa3/j;

.field public final i0:Ljb3/j;


# direct methods
.method public constructor <init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILqa3/c0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;Lr93/s0;)V
    .locals 11

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move/from16 v5, p5

    invoke-static {v5, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p11, :cond_0

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    move-object v6, v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v0, p0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    :goto_0
    invoke-direct/range {v0 .. v6}, Lu93/q0;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILr93/s0;)V

    iput-object v7, p0, Ljb3/t;->e0:Lqa3/c0;

    iput-object v8, p0, Ljb3/t;->f0:Lsa3/f;

    iput-object v9, p0, Ljb3/t;->g0:Lsa3/h;

    iput-object v10, p0, Ljb3/t;->h0:Lsa3/j;

    move-object/from16 v1, p10

    iput-object v1, p0, Ljb3/t;->i0:Ljb3/j;

    return-void
.end method


# virtual methods
.method public final L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
    .locals 13

    const-string v0, "newOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v0, "annotations"

    move-object/from16 v4, p5

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljb3/t;

    move-object/from16 v3, p3

    check-cast v3, Lu93/q0;

    if-nez p6, :cond_0

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    const-string v2, "getName(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object/from16 v5, p6

    :goto_0
    iget-object v10, p0, Ljb3/t;->h0:Lsa3/j;

    iget-object v11, p0, Ljb3/t;->i0:Ljb3/j;

    iget-object v7, p0, Ljb3/t;->e0:Lqa3/c0;

    iget-object v8, p0, Ljb3/t;->f0:Lsa3/f;

    iget-object v9, p0, Ljb3/t;->g0:Lsa3/h;

    move v6, p1

    move-object v2, p2

    move-object/from16 v12, p4

    invoke-direct/range {v1 .. v12}, Ljb3/t;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILqa3/c0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;Lr93/s0;)V

    iget-boolean p1, p0, Lu93/x;->W:Z

    iput-boolean p1, v1, Lu93/x;->W:Z

    return-object v1
.end method

.method public final R()Lwa3/v;
    .locals 1

    iget-object v0, p0, Ljb3/t;->e0:Lqa3/c0;

    return-object v0
.end method

.method public final t()Lsa3/h;
    .locals 1

    iget-object v0, p0, Ljb3/t;->g0:Lsa3/h;

    return-object v0
.end method

.method public final w()Lsa3/f;
    .locals 1

    iget-object v0, p0, Ljb3/t;->f0:Lsa3/f;

    return-object v0
.end method

.method public final x()Ljb3/j;
    .locals 1

    iget-object v0, p0, Ljb3/t;->i0:Ljb3/j;

    return-object v0
.end method
