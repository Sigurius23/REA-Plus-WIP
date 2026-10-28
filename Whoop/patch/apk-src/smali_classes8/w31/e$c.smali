.class public final Lw31/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw31/e;->j(ZZLw31/b;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lw31/b;

.field final synthetic x:Z

.field final synthetic y:Z


# direct methods
.method public constructor <init>(Lw31/b;ZZ)V
    .locals 0

    iput-object p1, p0, Lw31/e$c;->w:Lw31/b;

    iput-boolean p2, p0, Lw31/e$c;->x:Z

    iput-boolean p3, p0, Lw31/e$c;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    const v1, -0xf0f78c1

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lw31/e$c;->w:Lw31/b;

    invoke-static {v1, v3, v4}, Lj93/l0;->W(Ljava/lang/Object;Lp1/q;I)Lg1/n7;

    move-result-object v6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    iget-boolean v1, v0, Lw31/e$c;->y:Z

    invoke-static {v1, v3}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v1

    :cond_1
    move-object v9, v1

    check-cast v9, Lp1/c1;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2

    iget-boolean v1, v0, Lw31/e$c;->x:Z

    invoke-static {v1, v3}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v1

    :cond_2
    move-object v10, v1

    check-cast v10, Lp1/c1;

    iget-boolean v1, v0, Lw31/e$c;->x:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v5, v0, Lw31/e$c;->y:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v7, v0, Lw31/e$c;->y:Z

    invoke-virtual {v3, v7}, Lp1/q;->h(Z)Z

    move-result v7

    iget-boolean v8, v0, Lw31/e$c;->x:Z

    invoke-virtual {v3, v8}, Lp1/q;->h(Z)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_4

    if-ne v8, v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v11, v10

    move-object v10, v9

    goto :goto_2

    :cond_4
    :goto_1
    new-instance v7, Lw31/e$d;

    iget-boolean v8, v0, Lw31/e$c;->y:Z

    move-object v11, v10

    move-object v10, v9

    iget-boolean v9, v0, Lw31/e$c;->x:Z

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v12}, Lw31/e$d;-><init>(ZZLp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v3, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v8, v7

    :goto_2
    check-cast v8, Lc93/m;

    invoke-static {v1, v5, v8, v3}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    iget-object v1, v6, Lg1/n7;->c:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    iget-boolean v7, v0, Lw31/e$c;->y:Z

    invoke-virtual {v3, v7}, Lp1/q;->h(Z)Z

    move-result v7

    or-int/2addr v5, v7

    iget-boolean v7, v0, Lw31/e$c;->x:Z

    invoke-virtual {v3, v7}, Lp1/q;->h(Z)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_5

    if-ne v7, v2, :cond_6

    :cond_5
    new-instance v5, Lw31/e$e;

    iget-boolean v7, v0, Lw31/e$c;->y:Z

    iget-boolean v8, v0, Lw31/e$c;->x:Z

    move-object v9, v10

    move-object v10, v11

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lw31/e$e;-><init>(Lg1/n7;ZZLp1/c1;Lp1/c1;Lq83/d;)V

    move-object v10, v9

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v5

    :cond_6
    check-cast v7, Lc93/m;

    invoke-static {v3, v7, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x50

    int-to-float v1, v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_7

    new-instance v5, Lw31/e$f;

    invoke-direct {v5, v10}, Lw31/e$f;-><init>(Lp1/c1;)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v9, v5

    check-cast v9, Lc93/a;

    sget-object v2, Lw31/a;->a:Lw31/a;

    invoke-virtual {v2}, Lw31/a;->d()Lkotlin/jvm/functions/Function3;

    move-result-object v16

    const v18, 0x30006c30

    const/16 v19, 0x1c5

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    move-object/from16 v17, v3

    move-object v10, v6

    move v6, v1

    invoke-static/range {v5 .. v19}, Lw31/e;->n(Landroidx/compose/ui/Modifier;FZZLc93/a;Lg1/n7;Lgz0/m0;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    return-void

    :cond_8
    move-object v1, v3

    invoke-virtual {v1}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw31/e$c;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
