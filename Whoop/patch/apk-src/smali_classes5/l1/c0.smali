.class public final Ll1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lx1/b;

.field public final synthetic w:Li2/a1;

.field public final synthetic x:Ll1/y;

.field public final synthetic y:F

.field public final synthetic z:Lx1/b;


# direct methods
.method public constructor <init>(Li2/a1;Ll1/y;FLx1/b;Lc93/m;Lx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/c0;->w:Li2/a1;

    iput-object p2, p0, Ll1/c0;->x:Ll1/y;

    iput p3, p0, Ll1/c0;->y:F

    iput-object p4, p0, Ll1/c0;->z:Lx1/b;

    iput-object p5, p0, Ll1/c0;->E:Lc93/m;

    iput-object p6, p0, Ll1/c0;->F:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lb2/t;->w:Lb2/t;

    sget v3, Lo1/g;->d:F

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->o(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lo1/g;->b:F

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    iget-object v2, v0, Ll1/c0;->x:Ll1/y;

    iget-wide v8, v2, Ll1/y;->a:J

    new-instance v2, Lg1/b8;

    iget-object v3, v0, Ll1/c0;->F:Lx1/b;

    const/4 v4, 0x1

    iget-object v5, v0, Ll1/c0;->z:Lx1/b;

    iget-object v7, v0, Ll1/c0;->E:Lc93/m;

    invoke-direct {v2, v5, v7, v3, v4}, Lg1/b8;-><init>(Lx1/b;Lc93/m;Lx1/b;I)V

    const v3, 0x6a376592

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const v17, 0xc00006

    const/16 v18, 0x68

    iget-object v7, v0, Ll1/c0;->w:Li2/a1;

    const-wide/16 v10, 0x0

    iget v12, v0, Ll1/c0;->y:F

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v6 .. v18}, Ll1/c4;->a(Landroidx/compose/ui/Modifier;Li2/a1;JJFFLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
