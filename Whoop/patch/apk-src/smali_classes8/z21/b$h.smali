.class final Lz21/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


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
        "Lc93/o;"
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
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/util/TextResource;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic H:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic I:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic J:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Z

.field final synthetic x:Lny0/v0;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLny0/v0;Lkotlin/jvm/functions/Function1;ZLc93/a;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lny0/v0;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Lc93/a;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/util/TextResource;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lz21/b$h;->w:Z

    iput-object p2, p0, Lz21/b$h;->x:Lny0/v0;

    iput-object p3, p0, Lz21/b$h;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, Lz21/b$h;->z:Z

    iput-object p5, p0, Lz21/b$h;->E:Lc93/a;

    iput-object p6, p0, Lz21/b$h;->F:Ljava/util/List;

    iput-object p7, p0, Lz21/b$h;->G:Ljava/util/List;

    iput-object p8, p0, Lz21/b$h;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lz21/b$h;->I:Lp1/c1;

    iput-object p10, p0, Lz21/b$h;->J:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    move/from16 v1, p5

    const-string v3, "$this$RadioGroup"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_1

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    move/from16 v4, p2

    invoke-virtual {v3, v4}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x20

    goto :goto_0

    :cond_0
    const/16 v3, 0x10

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    move v3, v1

    :goto_1
    and-int/lit16 v1, v1, 0x180

    const/16 v5, 0x100

    if-nez v1, :cond_3

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v3, v1

    :cond_3
    and-int/lit16 v1, v3, 0x491

    const/16 v6, 0x490

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v1, v6, :cond_4

    move v1, v7

    goto :goto_3

    :cond_4
    move v1, v8

    :goto_3
    and-int/lit8 v6, v3, 0x1

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v6, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-boolean v1, v0, Lz21/b$h;->w:Z

    iget-object v4, v0, Lz21/b$h;->x:Lny0/v0;

    iget-object v6, v0, Lz21/b$h;->y:Lkotlin/jvm/functions/Function1;

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_8

    const v6, -0xd32166c

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    and-int/lit16 v6, v3, 0x380

    if-ne v6, v5, :cond_5

    goto :goto_4

    :cond_5
    move v7, v8

    :goto_4
    iget-boolean v5, v0, Lz21/b$h;->z:Z

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v5

    or-int/2addr v5, v7

    iget-boolean v6, v0, Lz21/b$h;->z:Z

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_6

    if-ne v7, v10, :cond_7

    :cond_6
    new-instance v7, Lz21/b$h$a;

    invoke-direct {v7, v2, v6}, Lz21/b$h$a;-><init>(Lf31/a;Z)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v6, v7

    check-cast v6, Lkotlin/jvm/functions/Function1;

    :goto_5
    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    move-object v5, v6

    goto :goto_6

    :cond_8
    const v5, 0x49e59908    # 1880865.0f

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    goto :goto_5

    :goto_6
    iget-object v6, v0, Lz21/b$h;->E:Lc93/a;

    iget-boolean v7, v0, Lz21/b$h;->z:Z

    iget-object v8, v0, Lz21/b$h;->F:Ljava/util/List;

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    iget-object v11, v0, Lz21/b$h;->G:Ljava/util/List;

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v8, v11

    iget-object v11, v0, Lz21/b$h;->H:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v8, v11

    iget-object v12, v0, Lz21/b$h;->I:Lp1/c1;

    iget-object v13, v0, Lz21/b$h;->J:Lp1/c1;

    iget-object v14, v0, Lz21/b$h;->F:Ljava/util/List;

    iget-object v15, v0, Lz21/b$h;->G:Ljava/util/List;

    iget-object v11, v0, Lz21/b$h;->H:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_9

    if-ne v0, v10, :cond_a

    :cond_9
    move-object/from16 v16, v11

    new-instance v11, Lz21/b$h$b;

    invoke-direct/range {v11 .. v16}, Lz21/b$h$b;-><init>(Lp1/c1;Lp1/c1;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v11

    :cond_a
    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v10, v0, 0x7e

    const/4 v11, 0x0

    move v3, v1

    move/from16 v1, p2

    invoke-static/range {v1 .. v11}, Lz21/b;->q(ILf31/a;ZLny0/v0;Lkotlin/jvm/functions/Function1;Lc93/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void

    :cond_b
    invoke-virtual {v9}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v3, p3

    check-cast v3, Lf31/a;

    move-object v4, p4

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lz21/b$h;->a(Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
