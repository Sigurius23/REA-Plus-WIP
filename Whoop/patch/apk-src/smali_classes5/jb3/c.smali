.class public final Ljb3/c;
.super Lu93/j;
.source "SourceFile"

# interfaces
.implements Ljb3/b;


# instance fields
.field public final f0:Lqa3/o;

.field public final g0:Lsa3/f;

.field public final h0:Lsa3/h;

.field public final i0:Lsa3/j;

.field public final j0:Ljb3/j;


# direct methods
.method public constructor <init>(Lr93/e;Lr93/j;Ls93/i;ZILqa3/o;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;Lr93/s0;)V
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

    move v4, p4

    move-object v0, p0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    :goto_0
    invoke-direct/range {v0 .. v6}, Lu93/j;-><init>(Lr93/e;Lr93/j;Ls93/i;ZILr93/s0;)V

    iput-object v7, p0, Ljb3/c;->f0:Lqa3/o;

    iput-object v8, p0, Ljb3/c;->g0:Lsa3/f;

    iput-object v9, p0, Ljb3/c;->h0:Lsa3/h;

    iput-object v10, p0, Ljb3/c;->i0:Lsa3/j;

    move-object/from16 v1, p10

    iput-object v1, p0, Ljb3/c;->j0:Ljb3/j;

    return-void
.end method


# virtual methods
.method public final bridge synthetic L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
    .locals 0

    move-object p6, p4

    move p4, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Ljb3/c;->a1(Lr93/k;Lr93/w;ILs93/i;Lr93/s0;)Ljb3/c;

    move-result-object p2

    return-object p2
.end method

.method public final R()Lwa3/v;
    .locals 1

    iget-object v0, p0, Ljb3/c;->f0:Lqa3/o;

    return-object v0
.end method

.method public final bridge synthetic U0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/j;
    .locals 0

    move-object p6, p4

    move p4, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Ljb3/c;->a1(Lr93/k;Lr93/w;ILs93/i;Lr93/s0;)Ljb3/c;

    move-result-object p2

    return-object p2
.end method

.method public final a1(Lr93/k;Lr93/w;ILs93/i;Lr93/s0;)Ljb3/c;
    .locals 13

    const-string v0, "newOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move/from16 v6, p3

    invoke-static {v6, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v0, "annotations"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljb3/c;

    move-object v2, p1

    check-cast v2, Lr93/e;

    move-object v3, p2

    check-cast v3, Lr93/j;

    iget-object v10, p0, Ljb3/c;->i0:Lsa3/j;

    iget-object v11, p0, Ljb3/c;->j0:Ljb3/j;

    iget-boolean v5, p0, Lu93/j;->e0:Z

    iget-object v7, p0, Ljb3/c;->f0:Lqa3/o;

    iget-object v8, p0, Ljb3/c;->g0:Lsa3/f;

    iget-object v9, p0, Ljb3/c;->h0:Lsa3/h;

    move-object/from16 v12, p5

    invoke-direct/range {v1 .. v12}, Ljb3/c;-><init>(Lr93/e;Lr93/j;Ls93/i;ZILqa3/o;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;Lr93/s0;)V

    iget-boolean p1, p0, Lu93/x;->W:Z

    iput-boolean p1, v1, Lu93/x;->W:Z

    return-object v1
.end method

.method public final isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t()Lsa3/h;
    .locals 1

    iget-object v0, p0, Ljb3/c;->h0:Lsa3/h;

    return-object v0
.end method

.method public final w()Lsa3/f;
    .locals 1

    iget-object v0, p0, Ljb3/c;->g0:Lsa3/f;

    return-object v0
.end method

.method public final x()Ljb3/j;
    .locals 1

    iget-object v0, p0, Ljb3/c;->j0:Ljb3/j;

    return-object v0
.end method
