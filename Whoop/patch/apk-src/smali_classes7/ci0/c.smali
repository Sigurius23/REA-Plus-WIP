.class public final synthetic Lci0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lci0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lci0/c;->x:F

    iput-object p2, p0, Lci0/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Lci0/c;->E:Ljava/lang/Object;

    iput-object p4, p0, Lci0/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Lci0/c;->G:Ljava/lang/Object;

    iput p6, p0, Lci0/c;->y:I

    return-void
.end method

.method public synthetic constructor <init>(FLx1/b;Lc93/m;Lg1/k5;ILx1/b;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lci0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lci0/c;->x:F

    iput-object p2, p0, Lci0/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Lci0/c;->E:Ljava/lang/Object;

    iput-object p4, p0, Lci0/c;->F:Ljava/lang/Object;

    iput p5, p0, Lci0/c;->y:I

    iput-object p6, p0, Lci0/c;->G:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lf61/i;Lh2/c;Lcom/whoop/design/util/TextResource;Lp91/a;FI)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lci0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lci0/c;->z:Ljava/lang/Object;

    iput-object p2, p0, Lci0/c;->E:Ljava/lang/Object;

    iput-object p3, p0, Lci0/c;->F:Ljava/lang/Object;

    iput-object p4, p0, Lci0/c;->G:Ljava/lang/Object;

    iput p5, p0, Lci0/c;->x:F

    iput p6, p0, Lci0/c;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lci0/c;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lci0/c;->z:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    iget-object v2, v0, Lci0/c;->E:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lc93/m;

    iget-object v2, v0, Lci0/c;->F:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Lg1/k5;

    iget-object v2, v0, Lci0/c;->G:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lx1/b;

    move-object/from16 v6, p1

    check-cast v6, Ly2/v1;

    move-object/from16 v10, p2

    check-cast v10, Ly3/a;

    sget v2, Lg1/c8;->a:F

    invoke-interface {v6, v2}, Ly3/c;->F(F)I

    move-result v16

    iget v2, v0, Lci0/c;->x:F

    invoke-interface {v6, v2}, Ly3/c;->F(F)I

    move-result v4

    iget-wide v14, v10, Ly3/a;->a:J

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Ly3/a;->b(JIIIII)J

    move-result-wide v2

    sget-object v5, Lg1/d8;->w:Lg1/d8;

    invoke-interface {v6, v5, v1}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v1

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    move-object v9, v1

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v11, 0x0

    move v12, v11

    :goto_0
    if-ge v12, v9, :cond_0

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly2/q0;

    invoke-interface {v14, v2, v3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v14

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlin/jvm/internal/e0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 v2, v4, 0x2

    iput v2, v1, Lkotlin/jvm/internal/e0;->w:I

    new-instance v12, Lkotlin/jvm/internal/e0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_1
    if-ge v11, v2, :cond_1

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/j1;

    iget v9, v1, Lkotlin/jvm/internal/e0;->w:I

    iget v14, v3, Ly2/j1;->w:I

    add-int/2addr v9, v14

    iput v9, v1, Lkotlin/jvm/internal/e0;->w:I

    iget v9, v12, Lkotlin/jvm/internal/e0;->w:I

    iget v3, v3, Ly2/j1;->x:I

    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v12, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    iget v2, v1, Lkotlin/jvm/internal/e0;->w:I

    iget v14, v12, Lkotlin/jvm/internal/e0;->w:I

    new-instance v3, Lg1/k4;

    iget v9, v0, Lci0/c;->y:I

    move-object v11, v1

    invoke-direct/range {v3 .. v13}, Lg1/k4;-><init>(ILjava/util/ArrayList;Ly2/v1;Lc93/m;Lg1/k5;ILy3/a;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lx1/b;)V

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-interface {v6, v2, v14, v1, v3}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lci0/c;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lf61/i;

    iget-object v1, v0, Lci0/c;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lh2/c;

    iget-object v1, v0, Lci0/c;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lci0/c;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lp91/a;

    move-object/from16 v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v6, v0, Lci0/c;->x:F

    iget v7, v0, Lci0/c;->y:I

    invoke-static/range {v2 .. v9}, Lf61/i;->l(Lf61/i;Lh2/c;Lcom/whoop/design/util/TextResource;Lp91/a;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lci0/c;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, v0, Lci0/c;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-object v1, v0, Lci0/c;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, v0, Lci0/c;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, v0, Lci0/c;->x:F

    iget v7, v0, Lci0/c;->y:I

    invoke-static/range {v2 .. v9}, Lci0/d;->g(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
