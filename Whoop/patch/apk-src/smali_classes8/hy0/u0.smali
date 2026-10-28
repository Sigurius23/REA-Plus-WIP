.class public final synthetic Lhy0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:Z

.field public final synthetic H:Lg1/e8;

.field public final synthetic I:J

.field public final synthetic J:Z

.field public final synthetic K:Ln0/u;

.field public final synthetic L:Z

.field public final synthetic M:Z

.field public final synthetic N:Lkotlin/jvm/functions/Function1;

.field public final synthetic O:Lkotlin/jvm/functions/Function1;

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/u0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lhy0/u0;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lhy0/u0;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lhy0/u0;->z:Ljava/lang/Integer;

    iput-wide p5, p0, Lhy0/u0;->E:J

    iput p7, p0, Lhy0/u0;->F:I

    iput-boolean p8, p0, Lhy0/u0;->G:Z

    iput-object p9, p0, Lhy0/u0;->H:Lg1/e8;

    iput-wide p10, p0, Lhy0/u0;->I:J

    iput-boolean p12, p0, Lhy0/u0;->J:Z

    iput-object p13, p0, Lhy0/u0;->K:Ln0/u;

    iput-boolean p14, p0, Lhy0/u0;->L:Z

    iput-boolean p15, p0, Lhy0/u0;->M:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lhy0/u0;->N:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p17

    iput-object p1, p0, Lhy0/u0;->O:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p18

    iput p1, p0, Lhy0/u0;->P:I

    move/from16 p1, p19

    iput p1, p0, Lhy0/u0;->Q:I

    move/from16 p1, p20

    iput p1, p0, Lhy0/u0;->R:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v21, p1

    check-cast v21, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v22

    iget-object v1, v0, Lhy0/u0;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lhy0/u0;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lhy0/u0;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lhy0/u0;->z:Ljava/lang/Integer;

    iget-wide v5, v0, Lhy0/u0;->E:J

    iget v7, v0, Lhy0/u0;->F:I

    iget-boolean v8, v0, Lhy0/u0;->G:Z

    iget-object v9, v0, Lhy0/u0;->H:Lg1/e8;

    iget-wide v10, v0, Lhy0/u0;->I:J

    iget-boolean v12, v0, Lhy0/u0;->J:Z

    iget-object v13, v0, Lhy0/u0;->K:Ln0/u;

    iget-boolean v14, v0, Lhy0/u0;->L:Z

    iget-boolean v15, v0, Lhy0/u0;->M:Z

    move-object/from16 v16, v1

    iget-object v1, v0, Lhy0/u0;->N:Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, v1

    iget-object v1, v0, Lhy0/u0;->O:Lkotlin/jvm/functions/Function1;

    move-object/from16 v18, v1

    iget v1, v0, Lhy0/u0;->P:I

    move/from16 v19, v1

    iget v1, v0, Lhy0/u0;->Q:I

    move/from16 v20, v1

    iget v1, v0, Lhy0/u0;->R:I

    move/from16 v23, v20

    move/from16 v20, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v23

    invoke-static/range {v1 .. v22}, Lhy0/v0;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
