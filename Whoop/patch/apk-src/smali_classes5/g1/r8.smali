.class public final synthetic Lg1/r8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll3/v0;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Lq3/g0;

.field public final synthetic J:Lu0/r0;

.field public final synthetic K:Lu0/q0;

.field public final synthetic L:Z

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:Li2/a1;

.field public final synthetic P:Lg1/y1;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/r8;->w:Ljava/lang/String;

    iput-object p2, p0, Lg1/r8;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lg1/r8;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lg1/r8;->z:Z

    iput-object p5, p0, Lg1/r8;->E:Ll3/v0;

    iput-object p6, p0, Lg1/r8;->F:Lc93/m;

    iput-object p7, p0, Lg1/r8;->G:Lc93/m;

    iput-object p8, p0, Lg1/r8;->H:Lc93/m;

    iput-object p9, p0, Lg1/r8;->I:Lq3/g0;

    iput-object p10, p0, Lg1/r8;->J:Lu0/r0;

    iput-object p11, p0, Lg1/r8;->K:Lu0/q0;

    iput-boolean p12, p0, Lg1/r8;->L:Z

    iput p13, p0, Lg1/r8;->M:I

    iput p14, p0, Lg1/r8;->N:I

    iput-object p15, p0, Lg1/r8;->O:Li2/a1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lg1/r8;->P:Lg1/y1;

    move/from16 p1, p17

    iput p1, p0, Lg1/r8;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lg1/r8;->R:I

    move/from16 p1, p19

    iput p1, p0, Lg1/r8;->S:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/r8;->Q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget v1, v0, Lg1/r8;->R:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget-object v1, v0, Lg1/r8;->w:Ljava/lang/String;

    iget-object v2, v0, Lg1/r8;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lg1/r8;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v4, v0, Lg1/r8;->z:Z

    iget-object v5, v0, Lg1/r8;->E:Ll3/v0;

    iget-object v6, v0, Lg1/r8;->F:Lc93/m;

    iget-object v7, v0, Lg1/r8;->G:Lc93/m;

    iget-object v8, v0, Lg1/r8;->H:Lc93/m;

    iget-object v9, v0, Lg1/r8;->I:Lq3/g0;

    iget-object v10, v0, Lg1/r8;->J:Lu0/r0;

    iget-object v11, v0, Lg1/r8;->K:Lu0/q0;

    iget-boolean v12, v0, Lg1/r8;->L:Z

    iget v13, v0, Lg1/r8;->M:I

    iget v14, v0, Lg1/r8;->N:I

    iget-object v15, v0, Lg1/r8;->O:Li2/a1;

    move-object/from16 v16, v1

    iget-object v1, v0, Lg1/r8;->P:Lg1/y1;

    move-object/from16 v20, v1

    iget v1, v0, Lg1/r8;->S:I

    move-object/from16 v21, v20

    move/from16 v20, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v21

    invoke-static/range {v1 .. v20}, Lg1/u8;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
