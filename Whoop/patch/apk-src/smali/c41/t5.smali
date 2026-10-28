.class public final synthetic Lc41/t5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Ly71/g;

.field public final synthetic K:J

.field public final synthetic L:Ly71/g;

.field public final synthetic M:Lcom/whoop/design/util/TextResource;

.field public final synthetic w:Lcom/whoop/util/TrendKey;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/util/TrendKey;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JLy71/g;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/t5;->w:Lcom/whoop/util/TrendKey;

    iput-object p2, p0, Lc41/t5;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lc41/t5;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lc41/t5;->z:Lc93/m;

    iput-boolean p5, p0, Lc41/t5;->E:Z

    iput-boolean p6, p0, Lc41/t5;->F:Z

    iput-object p7, p0, Lc41/t5;->G:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p8, p0, Lc41/t5;->H:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lc41/t5;->I:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Lc41/t5;->J:Ly71/g;

    iput-wide p11, p0, Lc41/t5;->K:J

    iput-object p13, p0, Lc41/t5;->L:Ly71/g;

    iput-object p14, p0, Lc41/t5;->M:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Lc41/t5;->w:Lcom/whoop/util/TrendKey;

    iget-object v2, v0, Lc41/t5;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lc41/t5;->y:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Lc41/t5;->z:Lc93/m;

    iget-boolean v5, v0, Lc41/t5;->E:Z

    iget-boolean v6, v0, Lc41/t5;->F:Z

    iget-object v7, v0, Lc41/t5;->G:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v8, v0, Lc41/t5;->H:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, Lc41/t5;->I:Lcom/whoop/design/util/TextResource;

    iget-object v10, v0, Lc41/t5;->J:Ly71/g;

    iget-wide v11, v0, Lc41/t5;->K:J

    iget-object v13, v0, Lc41/t5;->L:Ly71/g;

    iget-object v14, v0, Lc41/t5;->M:Lcom/whoop/design/util/TextResource;

    invoke-static/range {v1 .. v16}, Lc41/v5;->a(Lcom/whoop/util/TrendKey;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JLy71/g;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
