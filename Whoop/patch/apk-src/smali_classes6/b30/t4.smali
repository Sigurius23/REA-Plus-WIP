.class public final synthetic Lb30/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/Integer;

.field public final synthetic J:Z

.field public final synthetic K:Ljava/lang/String;

.field public final synthetic L:Ljava/lang/String;

.field public final synthetic M:Lc93/a;

.field public final synthetic N:Ljava/lang/String;

.field public final synthetic O:Lc93/a;

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FZZZZZILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/t4;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lb30/t4;->x:F

    iput-boolean p3, p0, Lb30/t4;->y:Z

    iput-boolean p4, p0, Lb30/t4;->z:Z

    iput-boolean p5, p0, Lb30/t4;->E:Z

    iput-boolean p6, p0, Lb30/t4;->F:Z

    iput-boolean p7, p0, Lb30/t4;->G:Z

    iput p8, p0, Lb30/t4;->H:I

    iput-object p9, p0, Lb30/t4;->I:Ljava/lang/Integer;

    iput-boolean p10, p0, Lb30/t4;->J:Z

    iput-object p11, p0, Lb30/t4;->K:Ljava/lang/String;

    iput-object p12, p0, Lb30/t4;->L:Ljava/lang/String;

    iput-object p13, p0, Lb30/t4;->M:Lc93/a;

    iput-object p14, p0, Lb30/t4;->N:Ljava/lang/String;

    iput-object p15, p0, Lb30/t4;->O:Lc93/a;

    move/from16 p1, p16

    iput p1, p0, Lb30/t4;->P:I

    move/from16 p1, p17

    iput p1, p0, Lb30/t4;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lb30/t4;->R:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lb30/t4;->P:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v17

    iget v1, v0, Lb30/t4;->Q:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget-object v1, v0, Lb30/t4;->w:Landroidx/compose/ui/Modifier;

    iget v2, v0, Lb30/t4;->x:F

    iget-boolean v3, v0, Lb30/t4;->y:Z

    iget-boolean v4, v0, Lb30/t4;->z:Z

    iget-boolean v5, v0, Lb30/t4;->E:Z

    iget-boolean v6, v0, Lb30/t4;->F:Z

    iget-boolean v7, v0, Lb30/t4;->G:Z

    iget v8, v0, Lb30/t4;->H:I

    iget-object v9, v0, Lb30/t4;->I:Ljava/lang/Integer;

    iget-boolean v10, v0, Lb30/t4;->J:Z

    iget-object v11, v0, Lb30/t4;->K:Ljava/lang/String;

    iget-object v12, v0, Lb30/t4;->L:Ljava/lang/String;

    iget-object v13, v0, Lb30/t4;->M:Lc93/a;

    iget-object v14, v0, Lb30/t4;->N:Ljava/lang/String;

    iget-object v15, v0, Lb30/t4;->O:Lc93/a;

    move-object/from16 v19, v1

    iget v1, v0, Lb30/t4;->R:I

    move-object/from16 v20, v19

    move/from16 v19, v1

    move-object/from16 v1, v20

    invoke-static/range {v1 .. v19}, Lb30/a5;->d(Landroidx/compose/ui/Modifier;FZZZZZILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
