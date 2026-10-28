.class public final synthetic Lg1/q8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll3/v0;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lq3/g0;

.field public final synthetic I:Lu0/r0;

.field public final synthetic J:Lu0/q0;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic M:Lj0/i;

.field public final synthetic N:Li2/a1;

.field public final synthetic O:Lg1/y1;

.field public final synthetic P:I

.field public final synthetic w:Lq3/y;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILj0/i;Li2/a1;Lg1/y1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/q8;->w:Lq3/y;

    iput-object p2, p0, Lg1/q8;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lg1/q8;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lg1/q8;->z:Z

    iput-object p5, p0, Lg1/q8;->E:Ll3/v0;

    iput-object p6, p0, Lg1/q8;->F:Lc93/m;

    iput-object p7, p0, Lg1/q8;->G:Lc93/m;

    iput-object p8, p0, Lg1/q8;->H:Lq3/g0;

    iput-object p9, p0, Lg1/q8;->I:Lu0/r0;

    iput-object p10, p0, Lg1/q8;->J:Lu0/q0;

    iput p11, p0, Lg1/q8;->K:I

    iput p12, p0, Lg1/q8;->L:I

    iput-object p13, p0, Lg1/q8;->M:Lj0/i;

    iput-object p14, p0, Lg1/q8;->N:Li2/a1;

    iput-object p15, p0, Lg1/q8;->O:Lg1/y1;

    move/from16 p1, p16

    iput p1, p0, Lg1/q8;->P:I

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

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/q8;->P:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v17

    iget-object v1, v0, Lg1/q8;->w:Lq3/y;

    iget-object v2, v0, Lg1/q8;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lg1/q8;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v4, v0, Lg1/q8;->z:Z

    iget-object v5, v0, Lg1/q8;->E:Ll3/v0;

    iget-object v6, v0, Lg1/q8;->F:Lc93/m;

    iget-object v7, v0, Lg1/q8;->G:Lc93/m;

    iget-object v8, v0, Lg1/q8;->H:Lq3/g0;

    iget-object v9, v0, Lg1/q8;->I:Lu0/r0;

    iget-object v10, v0, Lg1/q8;->J:Lu0/q0;

    iget v11, v0, Lg1/q8;->K:I

    iget v12, v0, Lg1/q8;->L:I

    iget-object v13, v0, Lg1/q8;->M:Lj0/i;

    iget-object v14, v0, Lg1/q8;->N:Li2/a1;

    iget-object v15, v0, Lg1/q8;->O:Lg1/y1;

    invoke-static/range {v1 .. v17}, Lg1/u8;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILj0/i;Li2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
