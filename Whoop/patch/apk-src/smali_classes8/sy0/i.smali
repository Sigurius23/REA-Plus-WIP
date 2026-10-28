.class public final synthetic Lsy0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:J

.field public final synthetic G:Landroidx/compose/ui/Modifier;

.field public final synthetic H:Ll0/k1;

.field public final synthetic I:Z

.field public final synthetic J:J

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lsy0/k;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy0/i;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lsy0/i;->x:Lsy0/k;

    iput-boolean p3, p0, Lsy0/i;->y:Z

    iput-boolean p4, p0, Lsy0/i;->z:Z

    iput p5, p0, Lsy0/i;->E:I

    iput-wide p6, p0, Lsy0/i;->F:J

    iput-object p8, p0, Lsy0/i;->G:Landroidx/compose/ui/Modifier;

    iput-object p9, p0, Lsy0/i;->H:Ll0/k1;

    iput-boolean p10, p0, Lsy0/i;->I:Z

    iput-wide p11, p0, Lsy0/i;->J:J

    iput-object p13, p0, Lsy0/i;->K:Lkotlin/jvm/functions/Function1;

    iput p14, p0, Lsy0/i;->L:I

    iput p15, p0, Lsy0/i;->M:I

    move/from16 p1, p16

    iput p1, p0, Lsy0/i;->N:I

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

    iget-object v1, v0, Lsy0/i;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lsy0/i;->x:Lsy0/k;

    iget-boolean v3, v0, Lsy0/i;->y:Z

    iget-boolean v4, v0, Lsy0/i;->z:Z

    iget v5, v0, Lsy0/i;->E:I

    iget-wide v6, v0, Lsy0/i;->F:J

    iget-object v8, v0, Lsy0/i;->G:Landroidx/compose/ui/Modifier;

    iget-object v9, v0, Lsy0/i;->H:Ll0/k1;

    iget-boolean v10, v0, Lsy0/i;->I:Z

    iget-wide v11, v0, Lsy0/i;->J:J

    iget-object v13, v0, Lsy0/i;->K:Lkotlin/jvm/functions/Function1;

    iget v14, v0, Lsy0/i;->L:I

    iget v15, v0, Lsy0/i;->M:I

    move-object/from16 v16, v1

    iget v1, v0, Lsy0/i;->N:I

    move-object/from16 v19, v16

    move/from16 v16, v1

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v18}, Lsy0/j;->a(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
