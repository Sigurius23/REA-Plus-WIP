.class public final synthetic Lg40/a4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lg40/r3;

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Lg40/h1;

.field public final synthetic J:Z

.field public final synthetic K:Landroidx/compose/ui/Modifier;

.field public final synthetic L:Lq3/g0;

.field public final synthetic M:Ly3/m;

.field public final synthetic N:Lu0/r0;

.field public final synthetic O:Lu0/q0;

.field public final synthetic P:Lkotlin/jvm/functions/Function1;

.field public final synthetic Q:Lkotlin/jvm/functions/Function1;

.field public final synthetic R:I

.field public final synthetic w:Lq3/y;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lq3/y;ZZLjava/lang/String;Ljava/lang/String;Lg40/r3;ZZLg40/h1;ZLandroidx/compose/ui/Modifier;Lq3/g0;Ly3/m;Lu0/r0;Lu0/q0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/a4;->w:Lq3/y;

    iput-boolean p2, p0, Lg40/a4;->x:Z

    iput-boolean p3, p0, Lg40/a4;->y:Z

    iput-object p4, p0, Lg40/a4;->z:Ljava/lang/String;

    iput-object p5, p0, Lg40/a4;->E:Ljava/lang/String;

    iput-object p6, p0, Lg40/a4;->F:Lg40/r3;

    iput-boolean p7, p0, Lg40/a4;->G:Z

    iput-boolean p8, p0, Lg40/a4;->H:Z

    iput-object p9, p0, Lg40/a4;->I:Lg40/h1;

    iput-boolean p10, p0, Lg40/a4;->J:Z

    iput-object p11, p0, Lg40/a4;->K:Landroidx/compose/ui/Modifier;

    iput-object p12, p0, Lg40/a4;->L:Lq3/g0;

    iput-object p13, p0, Lg40/a4;->M:Ly3/m;

    iput-object p14, p0, Lg40/a4;->N:Lu0/r0;

    iput-object p15, p0, Lg40/a4;->O:Lu0/q0;

    move-object/from16 p1, p16

    iput-object p1, p0, Lg40/a4;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p17

    iput-object p1, p0, Lg40/a4;->Q:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p18

    iput p1, p0, Lg40/a4;->R:I

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

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg40/a4;->R:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget-object v1, v0, Lg40/a4;->w:Lq3/y;

    iget-boolean v2, v0, Lg40/a4;->x:Z

    iget-boolean v3, v0, Lg40/a4;->y:Z

    iget-object v4, v0, Lg40/a4;->z:Ljava/lang/String;

    iget-object v5, v0, Lg40/a4;->E:Ljava/lang/String;

    iget-object v6, v0, Lg40/a4;->F:Lg40/r3;

    iget-boolean v7, v0, Lg40/a4;->G:Z

    iget-boolean v8, v0, Lg40/a4;->H:Z

    iget-object v9, v0, Lg40/a4;->I:Lg40/h1;

    iget-boolean v10, v0, Lg40/a4;->J:Z

    iget-object v11, v0, Lg40/a4;->K:Landroidx/compose/ui/Modifier;

    iget-object v12, v0, Lg40/a4;->L:Lq3/g0;

    iget-object v13, v0, Lg40/a4;->M:Ly3/m;

    iget-object v14, v0, Lg40/a4;->N:Lu0/r0;

    iget-object v15, v0, Lg40/a4;->O:Lu0/q0;

    move-object/from16 v16, v1

    iget-object v1, v0, Lg40/a4;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, v1

    iget-object v1, v0, Lg40/a4;->Q:Lkotlin/jvm/functions/Function1;

    move-object/from16 v20, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v20

    invoke-static/range {v1 .. v19}, Lg40/j4;->f(Lq3/y;ZZLjava/lang/String;Ljava/lang/String;Lg40/r3;ZZLg40/h1;ZLandroidx/compose/ui/Modifier;Lq3/g0;Ly3/m;Lu0/r0;Lu0/q0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
