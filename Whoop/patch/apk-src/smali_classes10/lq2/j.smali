.class public final synthetic Llq2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ll83/e;

.field public final synthetic L:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;ZLc93/a;Lc93/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Llq2/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq2/j;->G:Ljava/lang/Object;

    iput-object p2, p0, Llq2/j;->H:Ljava/lang/Object;

    iput-object p3, p0, Llq2/j;->I:Ljava/lang/Object;

    iput-object p4, p0, Llq2/j;->J:Ljava/lang/Object;

    iput-boolean p5, p0, Llq2/j;->x:Z

    iput-object p6, p0, Llq2/j;->y:Lc93/a;

    iput-boolean p7, p0, Llq2/j;->z:Z

    iput-object p8, p0, Llq2/j;->K:Ll83/e;

    iput-object p9, p0, Llq2/j;->L:Ll83/e;

    iput p10, p0, Llq2/j;->E:I

    iput p11, p0, Llq2/j;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Llq2/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq2/j;->G:Ljava/lang/Object;

    iput-boolean p2, p0, Llq2/j;->x:Z

    iput-object p3, p0, Llq2/j;->y:Lc93/a;

    iput-boolean p4, p0, Llq2/j;->z:Z

    iput-object p5, p0, Llq2/j;->K:Ll83/e;

    iput-object p6, p0, Llq2/j;->H:Ljava/lang/Object;

    iput-object p7, p0, Llq2/j;->I:Ljava/lang/Object;

    iput-object p8, p0, Llq2/j;->J:Ljava/lang/Object;

    iput-object p9, p0, Llq2/j;->L:Ll83/e;

    iput p10, p0, Llq2/j;->E:I

    iput p11, p0, Llq2/j;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lnl0/f;Lc93/m;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;ZLc93/a;ZII)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Llq2/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq2/j;->G:Ljava/lang/Object;

    iput-object p2, p0, Llq2/j;->H:Ljava/lang/Object;

    iput-object p3, p0, Llq2/j;->I:Ljava/lang/Object;

    iput-object p4, p0, Llq2/j;->J:Ljava/lang/Object;

    iput-object p5, p0, Llq2/j;->K:Ll83/e;

    iput-object p6, p0, Llq2/j;->L:Ll83/e;

    iput-boolean p7, p0, Llq2/j;->x:Z

    iput-object p8, p0, Llq2/j;->y:Lc93/a;

    iput-boolean p9, p0, Llq2/j;->z:Z

    iput p10, p0, Llq2/j;->E:I

    iput p11, p0, Llq2/j;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Llq2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llq2/j;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Llq2/j;->K:Ll83/e;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Llq2/j;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lsp0/d;

    iget-object v0, p0, Llq2/j;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lor2/u0;

    iget-object v0, p0, Llq2/j;->J:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lzr2/a;

    iget-object v0, p0, Llq2/j;->L:Ll83/e;

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-boolean v2, p0, Llq2/j;->x:Z

    iget-object v3, p0, Llq2/j;->y:Lc93/a;

    iget-boolean v4, p0, Llq2/j;->z:Z

    iget v10, p0, Llq2/j;->E:I

    iget v11, p0, Llq2/j;->F:I

    invoke-static/range {v1 .. v13}, Ltp0/b;->a(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llq2/j;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnl0/f;

    iget-object v0, p0, Llq2/j;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/m;

    iget-object v0, p0, Llq2/j;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lsl0/n2;

    iget-object v0, p0, Llq2/j;->J:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Llq2/j;->K:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Llq2/j;->L:Ll83/e;

    move-object v6, v0

    check-cast v6, Lc93/m;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-boolean v7, p0, Llq2/j;->x:Z

    iget-object v8, p0, Llq2/j;->y:Lc93/a;

    iget-boolean v9, p0, Llq2/j;->z:Z

    iget v10, p0, Llq2/j;->E:I

    iget v11, p0, Llq2/j;->F:I

    invoke-static/range {v1 .. v13}, Lsl0/o0;->j(Lnl0/f;Lc93/m;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;ZLc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Llq2/j;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Llq2/j;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Llq2/j;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Llq2/j;->J:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Llq2/j;->K:Ll83/e;

    move-object v8, v0

    check-cast v8, Lc93/a;

    iget-object v0, p0, Llq2/j;->L:Ll83/e;

    move-object v9, v0

    check-cast v9, Lc93/a;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-boolean v5, p0, Llq2/j;->x:Z

    iget-object v6, p0, Llq2/j;->y:Lc93/a;

    iget-boolean v7, p0, Llq2/j;->z:Z

    iget v10, p0, Llq2/j;->E:I

    iget v11, p0, Llq2/j;->F:I

    invoke-static/range {v1 .. v13}, Llq2/l;->h(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;ZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
