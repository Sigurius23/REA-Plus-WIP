.class public final synthetic Ld42/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Ll83/e;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lmf0/g;Lzr2/a;ZLgz0/m0;ZZLc93/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ld42/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld42/g;->I:Ljava/lang/Object;

    iput-object p2, p0, Ld42/g;->J:Ljava/lang/Object;

    iput-object p3, p0, Ld42/g;->K:Ljava/lang/Object;

    iput-boolean p4, p0, Ld42/g;->x:Z

    iput-object p5, p0, Ld42/g;->L:Ljava/lang/Object;

    iput-boolean p6, p0, Ld42/g;->y:Z

    iput-boolean p7, p0, Ld42/g;->z:Z

    iput-object p8, p0, Ld42/g;->E:Lc93/a;

    iput-object p9, p0, Ld42/g;->F:Ll83/e;

    iput p10, p0, Ld42/g;->G:I

    iput p11, p0, Ld42/g;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Ld42/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld42/g;->I:Ljava/lang/Object;

    iput-object p2, p0, Ld42/g;->E:Lc93/a;

    iput-object p3, p0, Ld42/g;->F:Ll83/e;

    iput-object p4, p0, Ld42/g;->J:Ljava/lang/Object;

    iput-boolean p5, p0, Ld42/g;->x:Z

    iput-boolean p6, p0, Ld42/g;->y:Z

    iput-object p7, p0, Ld42/g;->K:Ljava/lang/Object;

    iput-boolean p8, p0, Ld42/g;->z:Z

    iput-object p9, p0, Ld42/g;->L:Ljava/lang/Object;

    iput p10, p0, Ld42/g;->G:I

    iput p11, p0, Ld42/g;->H:I

    return-void
.end method

.method public synthetic constructor <init>(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;II)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Ld42/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld42/g;->x:Z

    iput-boolean p2, p0, Ld42/g;->y:Z

    iput-boolean p3, p0, Ld42/g;->z:Z

    iput-object p4, p0, Ld42/g;->I:Ljava/lang/Object;

    iput-object p5, p0, Ld42/g;->F:Ll83/e;

    iput-object p6, p0, Ld42/g;->E:Lc93/a;

    iput-object p7, p0, Ld42/g;->J:Ljava/lang/Object;

    iput-object p8, p0, Ld42/g;->K:Ljava/lang/Object;

    iput-object p9, p0, Ld42/g;->L:Ljava/lang/Object;

    iput p10, p0, Ld42/g;->G:I

    iput p11, p0, Ld42/g;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Ld42/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld42/g;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsl0/n0;

    iget-object v0, p0, Ld42/g;->F:Ll83/e;

    move-object v3, v0

    check-cast v3, Lc93/o;

    iget-object v0, p0, Ld42/g;->J:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Ld42/g;->K:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function3;

    iget-object v0, p0, Ld42/g;->L:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lsl0/q;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v2, p0, Ld42/g;->E:Lc93/a;

    iget-boolean v5, p0, Ld42/g;->x:Z

    iget-boolean v6, p0, Ld42/g;->y:Z

    iget-boolean v8, p0, Ld42/g;->z:Z

    iget v10, p0, Ld42/g;->G:I

    iget v11, p0, Ld42/g;->H:I

    invoke-static/range {v1 .. v13}, Lsl0/w;->f(Lsl0/n0;Lc93/a;Lc93/o;Lc93/a;ZZLkotlin/jvm/functions/Function3;ZLsl0/q;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ld42/g;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Ld42/g;->J:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lmf0/g;

    iget-object v0, p0, Ld42/g;->K:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lzr2/a;

    iget-object v0, p0, Ld42/g;->L:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lgz0/m0;

    iget-object v0, p0, Ld42/g;->F:Ll83/e;

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-boolean v4, p0, Ld42/g;->x:Z

    iget-boolean v6, p0, Ld42/g;->y:Z

    iget-boolean v7, p0, Ld42/g;->z:Z

    iget-object v8, p0, Ld42/g;->E:Lc93/a;

    iget v10, p0, Ld42/g;->G:I

    iget v11, p0, Ld42/g;->H:I

    invoke-static/range {v1 .. v13}, Lmf0/e;->k(Landroidx/compose/ui/Modifier;Lmf0/g;Lzr2/a;ZLgz0/m0;ZZLc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ld42/g;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc42/d;

    iget-object v0, p0, Ld42/g;->F:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ld42/g;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    iget-object v0, p0, Ld42/g;->K:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lc93/a;

    iget-object v0, p0, Ld42/g;->L:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lc93/a;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-boolean v1, p0, Ld42/g;->x:Z

    iget-boolean v2, p0, Ld42/g;->y:Z

    iget-boolean v3, p0, Ld42/g;->z:Z

    iget-object v6, p0, Ld42/g;->E:Lc93/a;

    iget v10, p0, Ld42/g;->G:I

    iget v11, p0, Ld42/g;->H:I

    invoke-static/range {v1 .. v13}, Ld42/j;->h(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
