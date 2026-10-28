.class public final synthetic Lqz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:F

.field public final synthetic J:J

.field public final synthetic K:Lb91/a;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqz0/a;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lqz0/a;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lqz0/a;->y:Lc93/a;

    iput-object p4, p0, Lqz0/a;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lqz0/a;->E:Ljava/lang/String;

    iput-object p6, p0, Lqz0/a;->F:Lcom/whoop/design/util/TextResource;

    iput-boolean p7, p0, Lqz0/a;->G:Z

    iput-boolean p8, p0, Lqz0/a;->H:Z

    iput p9, p0, Lqz0/a;->I:F

    iput-wide p10, p0, Lqz0/a;->J:J

    iput-object p12, p0, Lqz0/a;->K:Lb91/a;

    iput p13, p0, Lqz0/a;->L:I

    iput p14, p0, Lqz0/a;->M:I

    iput p15, p0, Lqz0/a;->N:I

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

    iget-object v1, v0, Lqz0/a;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lqz0/a;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lqz0/a;->y:Lc93/a;

    iget-object v4, v0, Lqz0/a;->z:Landroidx/compose/ui/Modifier;

    iget-object v5, v0, Lqz0/a;->E:Ljava/lang/String;

    iget-object v6, v0, Lqz0/a;->F:Lcom/whoop/design/util/TextResource;

    iget-boolean v7, v0, Lqz0/a;->G:Z

    iget-boolean v8, v0, Lqz0/a;->H:Z

    iget v9, v0, Lqz0/a;->I:F

    iget-wide v10, v0, Lqz0/a;->J:J

    iget-object v12, v0, Lqz0/a;->K:Lb91/a;

    iget v13, v0, Lqz0/a;->L:I

    iget v14, v0, Lqz0/a;->M:I

    iget v15, v0, Lqz0/a;->N:I

    invoke-static/range {v1 .. v17}, Lqz0/b;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
