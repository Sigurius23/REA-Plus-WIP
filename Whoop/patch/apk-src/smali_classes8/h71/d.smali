.class public final synthetic Lh71/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lh71/j;Lh71/i;Li71/b;JLkotlin/jvm/functions/Function1;Lf0/r1;Ll0/k1;Ld61/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lh71/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh71/d;->y:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lh71/d;->F:Ljava/lang/Object;

    iput-object p3, p0, Lh71/d;->G:Ljava/lang/Object;

    iput-object p4, p0, Lh71/d;->H:Ljava/lang/Object;

    iput-wide p5, p0, Lh71/d;->x:J

    iput-object p7, p0, Lh71/d;->I:Ljava/lang/Object;

    iput-object p8, p0, Lh71/d;->K:Ljava/lang/Object;

    iput-object p9, p0, Lh71/d;->L:Ljava/lang/Object;

    iput-object p10, p0, Lh71/d;->M:Ljava/lang/Object;

    iput-object p11, p0, Lh71/d;->J:Ljava/lang/Object;

    iput p12, p0, Lh71/d;->z:I

    iput p13, p0, Lh71/d;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lh71/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh71/d;->F:Ljava/lang/Object;

    iput-object p2, p0, Lh71/d;->G:Ljava/lang/Object;

    iput-object p3, p0, Lh71/d;->H:Ljava/lang/Object;

    iput-object p4, p0, Lh71/d;->I:Ljava/lang/Object;

    iput-object p5, p0, Lh71/d;->J:Ljava/lang/Object;

    iput-object p6, p0, Lh71/d;->K:Ljava/lang/Object;

    iput-object p7, p0, Lh71/d;->L:Ljava/lang/Object;

    iput-object p8, p0, Lh71/d;->M:Ljava/lang/Object;

    iput-wide p9, p0, Lh71/d;->x:J

    iput-object p11, p0, Lh71/d;->y:Landroidx/compose/ui/Modifier;

    iput p12, p0, Lh71/d;->z:I

    iput p13, p0, Lh71/d;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lh71/d;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lh71/d;->F:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Li91/a;

    iget-object v1, v0, Lh71/d;->G:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lh71/d;->H:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ln21/i;

    iget-object v1, v0, Lh71/d;->I:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lgz0/m0;

    iget-object v1, v0, Lh71/d;->J:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Li91/a;

    iget-object v1, v0, Lh71/d;->K:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lh71/d;->L:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ln21/i;

    iget-object v1, v0, Lh71/d;->M:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lgz0/m0;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-wide v10, v0, Lh71/d;->x:J

    iget-object v12, v0, Lh71/d;->y:Landroidx/compose/ui/Modifier;

    iget v13, v0, Lh71/d;->z:I

    iget v14, v0, Lh71/d;->E:I

    invoke-static/range {v2 .. v16}, Ln21/h;->f(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lh71/d;->F:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lh71/j;

    iget-object v1, v0, Lh71/d;->G:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lh71/i;

    iget-object v1, v0, Lh71/d;->H:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Li71/b;

    iget-object v1, v0, Lh71/d;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lh71/d;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lf0/r1;

    iget-object v1, v0, Lh71/d;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ll0/k1;

    iget-object v1, v0, Lh71/d;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ld61/a;

    iget-object v1, v0, Lh71/d;->J:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v2, v0, Lh71/d;->y:Landroidx/compose/ui/Modifier;

    iget-wide v6, v0, Lh71/d;->x:J

    iget v13, v0, Lh71/d;->z:I

    iget v14, v0, Lh71/d;->E:I

    invoke-static/range {v2 .. v16}, Lh71/g;->f(Landroidx/compose/ui/Modifier;Lh71/j;Lh71/i;Li71/b;JLkotlin/jvm/functions/Function1;Lf0/r1;Ll0/k1;Ld61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
