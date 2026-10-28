.class public final synthetic Lc41/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Ly71/g;

.field public final synthetic G:J

.field public final synthetic H:Z

.field public final synthetic I:Lcom/whoop/util/TrendKey;

.field public final synthetic J:Lrz0/f;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:Lc93/m;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ly71/g;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JZLcom/whoop/util/TrendKey;Lrz0/f;Lkotlin/jvm/functions/Function1;Lc93/m;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/u5;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc41/u5;->x:Ly71/g;

    iput-object p3, p0, Lc41/u5;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lc41/u5;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lc41/u5;->E:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lc41/u5;->F:Ly71/g;

    iput-wide p7, p0, Lc41/u5;->G:J

    iput-boolean p9, p0, Lc41/u5;->H:Z

    iput-object p10, p0, Lc41/u5;->I:Lcom/whoop/util/TrendKey;

    iput-object p11, p0, Lc41/u5;->J:Lrz0/f;

    iput-object p12, p0, Lc41/u5;->K:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lc41/u5;->L:Lc93/m;

    iput p14, p0, Lc41/u5;->M:I

    iput p15, p0, Lc41/u5;->N:I

    move/from16 p1, p16

    iput p1, p0, Lc41/u5;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v18

    iget-object v1, v0, Lc41/u5;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lc41/u5;->x:Ly71/g;

    iget-object v3, v0, Lc41/u5;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lc41/u5;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lc41/u5;->E:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lc41/u5;->F:Ly71/g;

    iget-wide v7, v0, Lc41/u5;->G:J

    iget-boolean v9, v0, Lc41/u5;->H:Z

    iget-object v10, v0, Lc41/u5;->I:Lcom/whoop/util/TrendKey;

    iget-object v11, v0, Lc41/u5;->J:Lrz0/f;

    iget-object v12, v0, Lc41/u5;->K:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lc41/u5;->L:Lc93/m;

    iget v14, v0, Lc41/u5;->M:I

    iget v15, v0, Lc41/u5;->N:I

    move-object/from16 v16, v1

    iget v1, v0, Lc41/u5;->O:I

    move-object/from16 v19, v16

    move/from16 v16, v1

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v18}, Lc41/v5;->b(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JZLcom/whoop/util/TrendKey;Lrz0/f;Lkotlin/jvm/functions/Function1;Lc93/m;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
