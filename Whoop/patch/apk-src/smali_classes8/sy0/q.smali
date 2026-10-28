.class public final synthetic Lsy0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:J

.field public final synthetic G:Landroidx/compose/ui/Modifier;

.field public final synthetic H:Ll0/k1;

.field public final synthetic I:Lb2/g;

.field public final synthetic J:J

.field public final synthetic K:Landroidx/compose/ui/Modifier;

.field public final synthetic L:Lkotlin/jvm/functions/Function1;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lsy0/k;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy0/q;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lsy0/q;->x:Lsy0/k;

    iput-boolean p3, p0, Lsy0/q;->y:Z

    iput-boolean p4, p0, Lsy0/q;->z:Z

    iput p5, p0, Lsy0/q;->E:I

    iput-wide p6, p0, Lsy0/q;->F:J

    iput-object p8, p0, Lsy0/q;->G:Landroidx/compose/ui/Modifier;

    iput-object p9, p0, Lsy0/q;->H:Ll0/k1;

    iput-object p10, p0, Lsy0/q;->I:Lb2/g;

    iput-wide p11, p0, Lsy0/q;->J:J

    iput-object p13, p0, Lsy0/q;->K:Landroidx/compose/ui/Modifier;

    iput-object p14, p0, Lsy0/q;->L:Lkotlin/jvm/functions/Function1;

    iput p15, p0, Lsy0/q;->M:I

    move/from16 p1, p16

    iput p1, p0, Lsy0/q;->N:I

    move/from16 p1, p17

    iput p1, p0, Lsy0/q;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v19

    iget-object v1, v0, Lsy0/q;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lsy0/q;->x:Lsy0/k;

    iget-boolean v3, v0, Lsy0/q;->y:Z

    iget-boolean v4, v0, Lsy0/q;->z:Z

    iget v5, v0, Lsy0/q;->E:I

    iget-wide v6, v0, Lsy0/q;->F:J

    iget-object v8, v0, Lsy0/q;->G:Landroidx/compose/ui/Modifier;

    iget-object v9, v0, Lsy0/q;->H:Ll0/k1;

    iget-object v10, v0, Lsy0/q;->I:Lb2/g;

    iget-wide v11, v0, Lsy0/q;->J:J

    iget-object v13, v0, Lsy0/q;->K:Landroidx/compose/ui/Modifier;

    iget-object v14, v0, Lsy0/q;->L:Lkotlin/jvm/functions/Function1;

    iget v15, v0, Lsy0/q;->M:I

    move-object/from16 v16, v1

    iget v1, v0, Lsy0/q;->N:I

    move/from16 v17, v1

    iget v1, v0, Lsy0/q;->O:I

    move/from16 v20, v17

    move/from16 v17, v1

    move-object/from16 v1, v16

    move/from16 v16, v20

    invoke-static/range {v1 .. v19}, Lsy0/r;->b(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
