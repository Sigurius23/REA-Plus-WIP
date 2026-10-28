.class public final synthetic Lk80/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lq3/g0;

.field public final synthetic F:Lqz0/c;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:Ljava/lang/String;

.field public final synthetic L:J

.field public final synthetic M:Lc93/m;

.field public final synthetic N:Lu0/q0;

.field public final synthetic O:I

.field public final synthetic P:Lc93/a;

.field public final synthetic Q:Lkotlin/jvm/functions/Function1;

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic T:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILq3/g0;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZZLjava/lang/String;JLc93/m;Lu0/q0;ILc93/a;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk80/a;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lk80/a;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lk80/a;->y:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lk80/a;->z:I

    iput-object p5, p0, Lk80/a;->E:Lq3/g0;

    iput-object p6, p0, Lk80/a;->F:Lqz0/c;

    iput-object p7, p0, Lk80/a;->G:Lcom/whoop/design/util/TextResource;

    iput-boolean p8, p0, Lk80/a;->H:Z

    iput-boolean p9, p0, Lk80/a;->I:Z

    iput-boolean p10, p0, Lk80/a;->J:Z

    iput-object p11, p0, Lk80/a;->K:Ljava/lang/String;

    iput-wide p12, p0, Lk80/a;->L:J

    iput-object p14, p0, Lk80/a;->M:Lc93/m;

    iput-object p15, p0, Lk80/a;->N:Lu0/q0;

    move/from16 p1, p16

    iput p1, p0, Lk80/a;->O:I

    move-object/from16 p1, p17

    iput-object p1, p0, Lk80/a;->P:Lc93/a;

    move-object/from16 p1, p18

    iput-object p1, p0, Lk80/a;->Q:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p19

    iput p1, p0, Lk80/a;->R:I

    move/from16 p1, p20

    iput p1, p0, Lk80/a;->S:I

    move/from16 p1, p21

    iput p1, p0, Lk80/a;->T:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v22, p1

    check-cast v22, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v23

    iget-object v1, v0, Lk80/a;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lk80/a;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lk80/a;->y:Lcom/whoop/design/util/TextResource;

    iget v4, v0, Lk80/a;->z:I

    iget-object v5, v0, Lk80/a;->E:Lq3/g0;

    iget-object v6, v0, Lk80/a;->F:Lqz0/c;

    iget-object v7, v0, Lk80/a;->G:Lcom/whoop/design/util/TextResource;

    iget-boolean v8, v0, Lk80/a;->H:Z

    iget-boolean v9, v0, Lk80/a;->I:Z

    iget-boolean v10, v0, Lk80/a;->J:Z

    iget-object v11, v0, Lk80/a;->K:Ljava/lang/String;

    iget-wide v12, v0, Lk80/a;->L:J

    iget-object v14, v0, Lk80/a;->M:Lc93/m;

    iget-object v15, v0, Lk80/a;->N:Lu0/q0;

    move-object/from16 v16, v1

    iget v1, v0, Lk80/a;->O:I

    move/from16 v17, v1

    iget-object v1, v0, Lk80/a;->P:Lc93/a;

    move-object/from16 v18, v1

    iget-object v1, v0, Lk80/a;->Q:Lkotlin/jvm/functions/Function1;

    move-object/from16 v19, v1

    iget v1, v0, Lk80/a;->R:I

    move/from16 v20, v1

    iget v1, v0, Lk80/a;->S:I

    move/from16 v21, v1

    iget v1, v0, Lk80/a;->T:I

    move/from16 v24, v21

    move/from16 v21, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v24

    invoke-static/range {v1 .. v23}, Lk80/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILq3/g0;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZZLjava/lang/String;JLc93/m;Lu0/q0;ILc93/a;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
