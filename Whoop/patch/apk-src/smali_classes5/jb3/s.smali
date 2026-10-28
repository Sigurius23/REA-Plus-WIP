.class public final Ljb3/s;
.super Lu93/m0;
.source "SourceFile"

# interfaces
.implements Ljb3/b;


# instance fields
.field public final b0:Lqa3/k0;

.field public final c0:Lsa3/f;

.field public final d0:Lsa3/h;

.field public final e0:Lsa3/j;

.field public final f0:Ljb3/j;


# direct methods
.method public constructor <init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;IZZZZZLqa3/k0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;)V
    .locals 16

    move-object/from16 v15, p14

    move-object/from16 v0, p15

    move-object/from16 v1, p16

    move-object/from16 v2, p17

    const-string v3, "containingDeclaration"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "annotations"

    move-object/from16 v5, p3

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "modality"

    move-object/from16 v6, p4

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "visibility"

    move-object/from16 v7, p5

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "name"

    move-object/from16 v8, p7

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "kind"

    move/from16 v9, p8

    invoke-static {v9, v3}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v3, "proto"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "nameResolver"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "typeTable"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "versionRequirementTable"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lr93/s0;->q:Lr93/v0;

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move/from16 v12, p13

    move-object v1, v4

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-object v7, v8

    move/from16 v6, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v14}, Lu93/m0;-><init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;ZZZZZ)V

    iput-object v15, v0, Ljb3/s;->b0:Lqa3/k0;

    move-object/from16 v1, p15

    iput-object v1, v0, Ljb3/s;->c0:Lsa3/f;

    move-object/from16 v1, p16

    iput-object v1, v0, Ljb3/s;->d0:Lsa3/h;

    move-object/from16 v2, p17

    iput-object v2, v0, Ljb3/s;->e0:Lsa3/j;

    move-object/from16 v1, p18

    iput-object v1, v0, Ljb3/s;->f0:Ljb3/j;

    return-void
.end method


# virtual methods
.method public final L0(Lr93/k;Lr93/a0;Lr93/r;Lr93/n0;ILva3/h;)Lu93/m0;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "newOwner"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "newModality"

    move-object/from16 v6, p2

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "newVisibility"

    move-object/from16 v7, p3

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "kind"

    move/from16 v10, p5

    invoke-static {v10, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v1, "newName"

    move-object/from16 v9, p6

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljb3/s;

    invoke-virtual {v0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v5

    invoke-virtual {v0}, Ljb3/s;->isExternal()Z

    move-result v13

    iget-object v1, v0, Ljb3/s;->e0:Lsa3/j;

    iget-object v4, v0, Ljb3/s;->f0:Ljb3/j;

    iget-boolean v8, v0, Lu93/m0;->G:Z

    iget-boolean v11, v0, Lu93/m0;->O:Z

    iget-boolean v12, v0, Lu93/m0;->P:Z

    iget-boolean v14, v0, Lu93/m0;->S:Z

    iget-boolean v15, v0, Lu93/m0;->Q:Z

    move-object/from16 v19, v1

    iget-object v1, v0, Ljb3/s;->b0:Lqa3/k0;

    move-object/from16 v16, v1

    iget-object v1, v0, Ljb3/s;->c0:Lsa3/f;

    move-object/from16 v17, v1

    iget-object v1, v0, Ljb3/s;->d0:Lsa3/h;

    move-object/from16 v18, v1

    move-object/from16 v20, v4

    move-object/from16 v4, p4

    invoke-direct/range {v2 .. v20}, Ljb3/s;-><init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;IZZZZZLqa3/k0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;)V

    return-object v2
.end method

.method public final R()Lwa3/v;
    .locals 1

    iget-object v0, p0, Ljb3/s;->b0:Lqa3/k0;

    return-object v0
.end method

.method public final isExternal()Z
    .locals 2

    sget-object v0, Lsa3/d;->E:Lsa3/b;

    iget-object v1, p0, Ljb3/s;->b0:Lqa3/k0;

    iget v1, v1, Lqa3/k0;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final t()Lsa3/h;
    .locals 1

    iget-object v0, p0, Ljb3/s;->d0:Lsa3/h;

    return-object v0
.end method

.method public final w()Lsa3/f;
    .locals 1

    iget-object v0, p0, Ljb3/s;->c0:Lsa3/f;

    return-object v0
.end method

.method public final x()Ljb3/j;
    .locals 1

    iget-object v0, p0, Ljb3/s;->f0:Ljb3/j;

    return-object v0
.end method
