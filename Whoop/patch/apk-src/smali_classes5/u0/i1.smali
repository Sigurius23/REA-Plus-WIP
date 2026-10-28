.class public final Lu0/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lq3/r;

.field public final synthetic G:Lu0/t1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:I

.field public final synthetic w:Lu0/s0;

.field public final synthetic x:Lf1/s1;

.field public final synthetic y:Lq3/y;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lu0/s0;Lf1/s1;Lq3/y;ZZLq3/r;Lu0/t1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/i1;->w:Lu0/s0;

    iput-object p2, p0, Lu0/i1;->x:Lf1/s1;

    iput-object p3, p0, Lu0/i1;->y:Lq3/y;

    iput-boolean p4, p0, Lu0/i1;->z:Z

    iput-boolean p5, p0, Lu0/i1;->E:Z

    iput-object p6, p0, Lu0/i1;->F:Lq3/r;

    iput-object p7, p0, Lu0/i1;->G:Lu0/t1;

    iput-object p8, p0, Lu0/i1;->H:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lu0/i1;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lp1/q;

    const v2, 0x32c59664

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_0

    new-instance v2, Lf1/x1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v10, v2

    check-cast v10, Lf1/x1;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_1

    new-instance v2, Lu0/d0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v2

    check-cast v13, Lu0/d0;

    new-instance v16, Lu0/h1;

    iget-object v14, v0, Lu0/i1;->H:Lkotlin/jvm/functions/Function1;

    iget v15, v0, Lu0/i1;->I:I

    iget-object v5, v0, Lu0/i1;->w:Lu0/s0;

    iget-object v6, v0, Lu0/i1;->x:Lf1/s1;

    iget-object v7, v0, Lu0/i1;->y:Lq3/y;

    iget-boolean v8, v0, Lu0/i1;->z:Z

    iget-boolean v9, v0, Lu0/i1;->E:Z

    iget-object v11, v0, Lu0/i1;->F:Lq3/r;

    iget-object v12, v0, Lu0/i1;->G:Lu0/t1;

    move-object/from16 v4, v16

    invoke-direct/range {v4 .. v15}, Lu0/h1;-><init>(Lu0/s0;Lf1/s1;Lq3/y;ZZLf1/x1;Lq3/r;Lu0/t1;Lu0/d0;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_2

    if-ne v5, v3, :cond_3

    :cond_2
    new-instance v14, Lq00/h0;

    const/16 v20, 0x0

    const/16 v21, 0x1b

    const/4 v15, 0x1

    const-class v17, Lu0/h1;

    const-string v18, "process"

    const-string v19, "process-ZmokQxo(Landroid/view/KeyEvent;)Z"

    move-object/from16 v16, v4

    invoke-direct/range {v14 .. v21}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v14

    :cond_3
    check-cast v5, Lj93/g;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v5}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    return-object v2
.end method
