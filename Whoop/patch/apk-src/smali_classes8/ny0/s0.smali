.class public final synthetic Lny0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lj0/i;

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic I:F

.field public final synthetic J:Ljava/lang/String;

.field public final synthetic K:Lc93/a;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lny0/v0;

.field public final synthetic z:Lny0/e1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lny0/v0;Lny0/e1;ZLj0/i;JJFLjava/lang/String;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/s0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lny0/s0;->x:Ljava/lang/String;

    iput-object p3, p0, Lny0/s0;->y:Lny0/v0;

    iput-object p4, p0, Lny0/s0;->z:Lny0/e1;

    iput-boolean p5, p0, Lny0/s0;->E:Z

    iput-object p6, p0, Lny0/s0;->F:Lj0/i;

    iput-wide p7, p0, Lny0/s0;->G:J

    iput-wide p9, p0, Lny0/s0;->H:J

    iput p11, p0, Lny0/s0;->I:F

    iput-object p12, p0, Lny0/s0;->J:Ljava/lang/String;

    iput-object p13, p0, Lny0/s0;->K:Lc93/a;

    iput p14, p0, Lny0/s0;->L:I

    iput p15, p0, Lny0/s0;->M:I

    move/from16 p1, p16

    iput p1, p0, Lny0/s0;->N:I

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

    iget-object v1, v0, Lny0/s0;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lny0/s0;->x:Ljava/lang/String;

    iget-object v3, v0, Lny0/s0;->y:Lny0/v0;

    iget-object v4, v0, Lny0/s0;->z:Lny0/e1;

    iget-boolean v5, v0, Lny0/s0;->E:Z

    iget-object v6, v0, Lny0/s0;->F:Lj0/i;

    iget-wide v7, v0, Lny0/s0;->G:J

    iget-wide v9, v0, Lny0/s0;->H:J

    iget v11, v0, Lny0/s0;->I:F

    iget-object v12, v0, Lny0/s0;->J:Ljava/lang/String;

    iget-object v13, v0, Lny0/s0;->K:Lc93/a;

    iget v14, v0, Lny0/s0;->L:I

    iget v15, v0, Lny0/s0;->M:I

    move-object/from16 v16, v1

    iget v1, v0, Lny0/s0;->N:I

    move-object/from16 v19, v16

    move/from16 v16, v1

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v18}, Lny0/u0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lny0/v0;Lny0/e1;ZLj0/i;JJFLjava/lang/String;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
