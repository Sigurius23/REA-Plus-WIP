.class public final synthetic Lt11/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:F

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:F

.field public final synthetic L:Lkotlin/jvm/functions/Function1;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;IIFZZZFLkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt11/d;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lt11/d;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lt11/d;->y:Ljava/lang/String;

    iput-object p4, p0, Lt11/d;->z:Lcom/whoop/design/util/TextResource;

    iput p5, p0, Lt11/d;->E:I

    iput p6, p0, Lt11/d;->F:I

    iput p7, p0, Lt11/d;->G:F

    iput-boolean p8, p0, Lt11/d;->H:Z

    iput-boolean p9, p0, Lt11/d;->I:Z

    iput-boolean p10, p0, Lt11/d;->J:Z

    iput p11, p0, Lt11/d;->K:F

    iput-object p12, p0, Lt11/d;->L:Lkotlin/jvm/functions/Function1;

    iput p13, p0, Lt11/d;->M:I

    iput p14, p0, Lt11/d;->N:I

    iput p15, p0, Lt11/d;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v1, v0, Lt11/d;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lt11/d;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lt11/d;->y:Ljava/lang/String;

    iget-object v4, v0, Lt11/d;->z:Lcom/whoop/design/util/TextResource;

    iget v5, v0, Lt11/d;->E:I

    iget v6, v0, Lt11/d;->F:I

    iget v7, v0, Lt11/d;->G:F

    iget-boolean v8, v0, Lt11/d;->H:Z

    iget-boolean v9, v0, Lt11/d;->I:Z

    iget-boolean v10, v0, Lt11/d;->J:Z

    iget v11, v0, Lt11/d;->K:F

    iget-object v12, v0, Lt11/d;->L:Lkotlin/jvm/functions/Function1;

    iget v13, v0, Lt11/d;->M:I

    iget v14, v0, Lt11/d;->N:I

    iget v15, v0, Lt11/d;->O:I

    invoke-static/range {v1 .. v17}, Lt11/e;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;IIFZZZFLkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
