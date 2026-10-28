.class public final synthetic Le41/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lgz0/m0;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:Lgz0/m0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;JLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;ZZZZLkotlin/jvm/functions/Function1;Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le41/e;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Le41/e;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Le41/e;->y:J

    iput-object p5, p0, Le41/e;->z:Lgz0/m0;

    iput-object p6, p0, Le41/e;->E:Lgz0/m0;

    iput-object p7, p0, Le41/e;->F:Lcom/whoop/design/util/TextResource;

    iput-boolean p8, p0, Le41/e;->G:Z

    iput-boolean p9, p0, Le41/e;->H:Z

    iput-boolean p10, p0, Le41/e;->I:Z

    iput-boolean p11, p0, Le41/e;->J:Z

    iput-object p12, p0, Le41/e;->K:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Le41/e;->L:Ljava/lang/Object;

    iput p14, p0, Le41/e;->M:I

    iput p15, p0, Le41/e;->N:I

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

    iget-object v1, v0, Le41/e;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Le41/e;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, v0, Le41/e;->y:J

    iget-object v5, v0, Le41/e;->z:Lgz0/m0;

    iget-object v6, v0, Le41/e;->E:Lgz0/m0;

    iget-object v7, v0, Le41/e;->F:Lcom/whoop/design/util/TextResource;

    iget-boolean v8, v0, Le41/e;->G:Z

    iget-boolean v9, v0, Le41/e;->H:Z

    iget-boolean v10, v0, Le41/e;->I:Z

    iget-boolean v11, v0, Le41/e;->J:Z

    iget-object v12, v0, Le41/e;->K:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Le41/e;->L:Ljava/lang/Object;

    iget v14, v0, Le41/e;->M:I

    iget v15, v0, Le41/e;->N:I

    invoke-static/range {v1 .. v17}, Le41/g;->j(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;JLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;ZZZZLkotlin/jvm/functions/Function1;Ljava/lang/Object;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
