.class public final synthetic Lhy0/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:Lb91/a;

.field public final synthetic L:Z

.field public final synthetic M:Lkotlin/jvm/functions/Function1;

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIZZZLb91/a;ZLkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/k1;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lhy0/k1;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lhy0/k1;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lhy0/k1;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lhy0/k1;->E:Lcom/whoop/design/util/TextResource;

    iput p6, p0, Lhy0/k1;->F:I

    iput p7, p0, Lhy0/k1;->G:I

    iput-boolean p8, p0, Lhy0/k1;->H:Z

    iput-boolean p9, p0, Lhy0/k1;->I:Z

    iput-boolean p10, p0, Lhy0/k1;->J:Z

    iput-object p11, p0, Lhy0/k1;->K:Lb91/a;

    iput-boolean p12, p0, Lhy0/k1;->L:Z

    iput-object p13, p0, Lhy0/k1;->M:Lkotlin/jvm/functions/Function1;

    iput p14, p0, Lhy0/k1;->N:I

    iput p15, p0, Lhy0/k1;->O:I

    move/from16 p1, p16

    iput p1, p0, Lhy0/k1;->P:I

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

    iget-object v1, v0, Lhy0/k1;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lhy0/k1;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lhy0/k1;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lhy0/k1;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lhy0/k1;->E:Lcom/whoop/design/util/TextResource;

    iget v6, v0, Lhy0/k1;->F:I

    iget v7, v0, Lhy0/k1;->G:I

    iget-boolean v8, v0, Lhy0/k1;->H:Z

    iget-boolean v9, v0, Lhy0/k1;->I:Z

    iget-boolean v10, v0, Lhy0/k1;->J:Z

    iget-object v11, v0, Lhy0/k1;->K:Lb91/a;

    iget-boolean v12, v0, Lhy0/k1;->L:Z

    iget-object v13, v0, Lhy0/k1;->M:Lkotlin/jvm/functions/Function1;

    iget v14, v0, Lhy0/k1;->N:I

    iget v15, v0, Lhy0/k1;->O:I

    move-object/from16 v16, v1

    iget v1, v0, Lhy0/k1;->P:I

    move-object/from16 v19, v16

    move/from16 v16, v1

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v18}, Lhy0/l1;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIZZZLb91/a;ZLkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
