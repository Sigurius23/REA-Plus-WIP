.class final Lz21/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz21/b;->k(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZLny0/v0;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Le4/k;

.field final synthetic x:Le4/f;

.field final synthetic y:Le4/f;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le4/k;Le4/f;Le4/f;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/k;",
            "Le4/f;",
            "Le4/f;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lz21/b$f;->w:Le4/k;

    iput-object p2, p0, Lz21/b$f;->x:Le4/f;

    iput-object p3, p0, Lz21/b$f;->y:Le4/f;

    iput-object p4, p0, Lz21/b$f;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lz21/b$f;->w:Le4/k;

    iget-object v2, v0, Lz21/b$f;->x:Le4/f;

    iget-object v5, v0, Lz21/b$f;->y:Le4/f;

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, v0, Lz21/b$f;->y:Le4/f;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_2

    :cond_1
    new-instance v7, Lz21/b$f$a;

    invoke-direct {v7, v6}, Lz21/b$f$a;-><init>(Le4/f;)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v1, v0, Lz21/b$f;->z:Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v4, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lx81/b;->a:Lx81/b;

    const/4 v3, 0x6

    invoke-virtual {v2, v4, v3}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v2

    invoke-virtual {v2}, Ly81/a;->b()J

    move-result-wide v6

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    new-instance v2, Lw3/k;

    invoke-direct {v2, v3}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v29, 0x2fdf8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, v2

    move-object/from16 v26, v4

    move-object v4, v1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    return-void

    :cond_3
    move-object/from16 v26, v4

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lz21/b$f;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
