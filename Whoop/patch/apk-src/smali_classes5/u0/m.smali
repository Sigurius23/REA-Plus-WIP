.class public final synthetic Lu0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:Ll3/v0;

.field public final synthetic G:I

.field public final synthetic H:Z

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic K:Lp3/h;

.field public final synthetic L:Le1/j;

.field public final synthetic M:Li2/a0;

.field public final synthetic N:Lkotlin/jvm/functions/Function1;

.field public final synthetic O:Lu0/z0;

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ll3/g;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ll3/g;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Ll3/v0;IZIILp3/h;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/m;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lu0/m;->x:Ll3/g;

    iput-object p3, p0, Lu0/m;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, Lu0/m;->z:Z

    iput-object p5, p0, Lu0/m;->E:Ljava/util/Map;

    iput-object p6, p0, Lu0/m;->F:Ll3/v0;

    iput p7, p0, Lu0/m;->G:I

    iput-boolean p8, p0, Lu0/m;->H:Z

    iput p9, p0, Lu0/m;->I:I

    iput p10, p0, Lu0/m;->J:I

    iput-object p11, p0, Lu0/m;->K:Lp3/h;

    iput-object p12, p0, Lu0/m;->L:Le1/j;

    iput-object p13, p0, Lu0/m;->M:Li2/a0;

    iput-object p14, p0, Lu0/m;->N:Lkotlin/jvm/functions/Function1;

    iput-object p15, p0, Lu0/m;->O:Lu0/z0;

    move/from16 p1, p16

    iput p1, p0, Lu0/m;->P:I

    move/from16 p1, p17

    iput p1, p0, Lu0/m;->Q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lu0/m;->P:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v17

    iget v1, v0, Lu0/m;->Q:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget-object v1, v0, Lu0/m;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lu0/m;->x:Ll3/g;

    iget-object v3, v0, Lu0/m;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v4, v0, Lu0/m;->z:Z

    iget-object v5, v0, Lu0/m;->E:Ljava/util/Map;

    iget-object v6, v0, Lu0/m;->F:Ll3/v0;

    iget v7, v0, Lu0/m;->G:I

    iget-boolean v8, v0, Lu0/m;->H:Z

    iget v9, v0, Lu0/m;->I:I

    iget v10, v0, Lu0/m;->J:I

    iget-object v11, v0, Lu0/m;->K:Lp3/h;

    iget-object v12, v0, Lu0/m;->L:Le1/j;

    iget-object v13, v0, Lu0/m;->M:Li2/a0;

    iget-object v14, v0, Lu0/m;->N:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lu0/m;->O:Lu0/z0;

    invoke-static/range {v1 .. v18}, Lq83/g;->e(Landroidx/compose/ui/Modifier;Ll3/g;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Ll3/v0;IZIILp3/h;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
