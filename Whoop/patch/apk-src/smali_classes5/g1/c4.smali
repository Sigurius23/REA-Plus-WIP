.class public final synthetic Lg1/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ll3/v0;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Lc93/m;

.field public final synthetic J:Z

.field public final synthetic K:Lq3/g0;

.field public final synthetic L:Lu0/r0;

.field public final synthetic M:Lu0/q0;

.field public final synthetic N:Z

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic Q:Li2/a1;

.field public final synthetic R:Lg1/y1;

.field public final synthetic S:I

.field public final synthetic T:I

.field public final synthetic U:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/c4;->w:Ljava/lang/String;

    iput-object p2, p0, Lg1/c4;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lg1/c4;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lg1/c4;->z:Z

    iput-boolean p5, p0, Lg1/c4;->E:Z

    iput-object p6, p0, Lg1/c4;->F:Ll3/v0;

    iput-object p7, p0, Lg1/c4;->G:Lc93/m;

    iput-object p8, p0, Lg1/c4;->H:Lc93/m;

    iput-object p9, p0, Lg1/c4;->I:Lc93/m;

    iput-boolean p10, p0, Lg1/c4;->J:Z

    iput-object p11, p0, Lg1/c4;->K:Lq3/g0;

    iput-object p12, p0, Lg1/c4;->L:Lu0/r0;

    iput-object p13, p0, Lg1/c4;->M:Lu0/q0;

    iput-boolean p14, p0, Lg1/c4;->N:Z

    iput p15, p0, Lg1/c4;->O:I

    move/from16 p1, p16

    iput p1, p0, Lg1/c4;->P:I

    move-object/from16 p1, p17

    iput-object p1, p0, Lg1/c4;->Q:Li2/a1;

    move-object/from16 p1, p18

    iput-object p1, p0, Lg1/c4;->R:Lg1/y1;

    move/from16 p1, p19

    iput p1, p0, Lg1/c4;->S:I

    move/from16 p1, p20

    iput p1, p0, Lg1/c4;->T:I

    move/from16 p1, p21

    iput p1, p0, Lg1/c4;->U:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/c4;->S:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v20

    iget v1, v0, Lg1/c4;->T:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v21

    iget-object v1, v0, Lg1/c4;->w:Ljava/lang/String;

    iget-object v2, v0, Lg1/c4;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lg1/c4;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v4, v0, Lg1/c4;->z:Z

    iget-boolean v5, v0, Lg1/c4;->E:Z

    iget-object v6, v0, Lg1/c4;->F:Ll3/v0;

    iget-object v7, v0, Lg1/c4;->G:Lc93/m;

    iget-object v8, v0, Lg1/c4;->H:Lc93/m;

    iget-object v9, v0, Lg1/c4;->I:Lc93/m;

    iget-boolean v10, v0, Lg1/c4;->J:Z

    iget-object v11, v0, Lg1/c4;->K:Lq3/g0;

    iget-object v12, v0, Lg1/c4;->L:Lu0/r0;

    iget-object v13, v0, Lg1/c4;->M:Lu0/q0;

    iget-boolean v14, v0, Lg1/c4;->N:Z

    iget v15, v0, Lg1/c4;->O:I

    move-object/from16 v16, v1

    iget v1, v0, Lg1/c4;->P:I

    move/from16 v17, v1

    iget-object v1, v0, Lg1/c4;->Q:Li2/a1;

    move-object/from16 v18, v1

    iget-object v1, v0, Lg1/c4;->R:Lg1/y1;

    move-object/from16 v22, v1

    iget v1, v0, Lg1/c4;->U:I

    move-object/from16 v23, v22

    move/from16 v22, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v23

    invoke-static/range {v1 .. v22}, Lg1/j4;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
