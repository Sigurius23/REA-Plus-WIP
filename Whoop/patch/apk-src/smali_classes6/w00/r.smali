.class public final Lw00/r;
.super Lx30/g1;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Object;

.field public final e:Z

.field public final f:F


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lj00/d0;ZLjava/lang/String;Lec3/f2;Z)V
    .locals 1

    const-string v0, "merchantName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx30/g1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Z)V

    iput-object p4, p0, Lw00/r;->c:Ljava/lang/String;

    iput-object p5, p0, Lw00/r;->d:Ljava/lang/Object;

    iput-boolean p6, p0, Lw00/r;->e:Z

    sget-object p1, Lj00/d0;->x:Lj00/d0;

    if-ne p2, p1, :cond_0

    int-to-float p1, v0

    goto :goto_1

    :cond_0
    sget-object p1, Lj00/d0;->w:Lj00/d0;

    if-ne p2, p1, :cond_1

    const/4 p1, 0x4

    :goto_0
    int-to-float p1, p1

    goto :goto_1

    :cond_1
    if-eqz p3, :cond_2

    const/4 p1, 0x6

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    goto :goto_0

    :goto_1
    iput p1, p0, Lw00/r;->f:F

    return-void
.end method


# virtual methods
.method public final e()Lec3/f2;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final g(ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "hiddenIdentifiers"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v1, 0x3ce4981

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lw00/r;->d:Ljava/lang/Object;

    const/4 v10, 0x0

    invoke-static {v1, v7, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj00/k;

    iget-object v2, v0, Lw00/r;->c:Ljava/lang/String;

    iget-boolean v3, v0, Lw00/r;->e:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v1, Lj00/k;->i:Z

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    if-nez v3, :cond_0

    const v1, 0x5d80a94e

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    const v1, 0x7f141078

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2, v7}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv8/b;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const v1, 0x5d846250

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    const v1, 0x7f141075

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2, v7}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv8/b;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_0

    :goto_1
    if-eqz v3, :cond_1

    const/4 v1, 0x3

    :goto_2
    move v4, v1

    goto :goto_3

    :cond_1
    const/4 v1, 0x5

    goto :goto_2

    :goto_3
    const/4 v15, 0x0

    const/16 v16, 0xd

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x0

    iget v13, v0, Lw00/r;->f:F

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    return-void
.end method
