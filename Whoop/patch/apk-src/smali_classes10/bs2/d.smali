.class public final synthetic Lbs2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:Lc93/a;

.field public final synthetic L:Lc93/a;

.field public final synthetic M:Lc93/a;

.field public final synthetic N:Lc93/a;

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZZZZZZLc93/a;Lc93/a;Lc93/a;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs2/d;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lbs2/d;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lbs2/d;->y:Z

    iput-boolean p4, p0, Lbs2/d;->z:Z

    iput-boolean p5, p0, Lbs2/d;->E:Z

    iput-boolean p6, p0, Lbs2/d;->F:Z

    iput-boolean p7, p0, Lbs2/d;->G:Z

    iput-boolean p8, p0, Lbs2/d;->H:Z

    iput-boolean p9, p0, Lbs2/d;->I:Z

    iput-boolean p10, p0, Lbs2/d;->J:Z

    iput-object p11, p0, Lbs2/d;->K:Lc93/a;

    iput-object p12, p0, Lbs2/d;->L:Lc93/a;

    iput-object p13, p0, Lbs2/d;->M:Lc93/a;

    iput-object p14, p0, Lbs2/d;->N:Lc93/a;

    iput p15, p0, Lbs2/d;->O:I

    move/from16 p1, p16

    iput p1, p0, Lbs2/d;->P:I

    move/from16 p1, p17

    iput p1, p0, Lbs2/d;->Q:I

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

    iget-object v1, v0, Lbs2/d;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lbs2/d;->x:Ljava/lang/String;

    iget-boolean v3, v0, Lbs2/d;->y:Z

    iget-boolean v4, v0, Lbs2/d;->z:Z

    iget-boolean v5, v0, Lbs2/d;->E:Z

    iget-boolean v6, v0, Lbs2/d;->F:Z

    iget-boolean v7, v0, Lbs2/d;->G:Z

    iget-boolean v8, v0, Lbs2/d;->H:Z

    iget-boolean v9, v0, Lbs2/d;->I:Z

    iget-boolean v10, v0, Lbs2/d;->J:Z

    iget-object v11, v0, Lbs2/d;->K:Lc93/a;

    iget-object v12, v0, Lbs2/d;->L:Lc93/a;

    iget-object v13, v0, Lbs2/d;->M:Lc93/a;

    iget-object v14, v0, Lbs2/d;->N:Lc93/a;

    iget v15, v0, Lbs2/d;->O:I

    move-object/from16 v16, v1

    iget v1, v0, Lbs2/d;->P:I

    move/from16 v17, v1

    iget v1, v0, Lbs2/d;->Q:I

    move/from16 v20, v17

    move/from16 v17, v1

    move-object/from16 v1, v16

    move/from16 v16, v20

    invoke-static/range {v1 .. v19}, Lbs2/f;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZZZZZZLc93/a;Lc93/a;Lc93/a;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
