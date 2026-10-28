.class public final synthetic Ltp0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Ltp0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp0/d;->H:Ljava/lang/Object;

    iput-object p2, p0, Ltp0/d;->F:Ljava/lang/Object;

    iput-object p3, p0, Ltp0/d;->I:Ljava/lang/Object;

    iput p4, p0, Ltp0/d;->y:I

    iput-boolean p5, p0, Ltp0/d;->x:Z

    iput-object p6, p0, Ltp0/d;->E:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Ltp0/d;->J:Ljava/lang/Object;

    iput p8, p0, Ltp0/d;->z:I

    iput p9, p0, Ltp0/d;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ltp0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp0/d;->H:Ljava/lang/Object;

    iput-object p2, p0, Ltp0/d;->I:Ljava/lang/Object;

    iput-object p3, p0, Ltp0/d;->J:Ljava/lang/Object;

    iput-boolean p4, p0, Ltp0/d;->x:Z

    iput p5, p0, Ltp0/d;->y:I

    iput p6, p0, Ltp0/d;->z:I

    iput-object p7, p0, Ltp0/d;->E:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Ltp0/d;->F:Ljava/lang/Object;

    iput p9, p0, Ltp0/d;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Lsp0/j;ZLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Ltp0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp0/d;->H:Ljava/lang/Object;

    iput-boolean p2, p0, Ltp0/d;->x:Z

    iput-object p3, p0, Ltp0/d;->E:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ltp0/d;->I:Ljava/lang/Object;

    iput p5, p0, Ltp0/d;->y:I

    iput-object p6, p0, Ltp0/d;->J:Ljava/lang/Object;

    iput-object p7, p0, Ltp0/d;->F:Ljava/lang/Object;

    iput p8, p0, Ltp0/d;->z:I

    iput p9, p0, Ltp0/d;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Ltp0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ltp0/d;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkm0/e;

    iget-object v0, p0, Ltp0/d;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Ltp0/d;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lv41/f$a;

    iget-object v0, p0, Ltp0/d;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v4, p0, Ltp0/d;->y:I

    iget-boolean v5, p0, Ltp0/d;->x:Z

    iget-object v6, p0, Ltp0/d;->E:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Ltp0/d;->z:I

    iget v9, p0, Ltp0/d;->G:I

    invoke-static/range {v1 .. v11}, Luw0/q;->a(Lkm0/e;Lbc3/c0;Lv41/f$a;IZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ltp0/d;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll3/g;

    iget-object v0, p0, Ltp0/d;->I:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Ltp0/d;->J:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll3/v0;

    iget-object v0, p0, Ltp0/d;->F:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ltp0/d;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-boolean v4, p0, Ltp0/d;->x:Z

    iget v5, p0, Ltp0/d;->y:I

    iget v6, p0, Ltp0/d;->z:I

    iget-object v7, p0, Ltp0/d;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v10}, Lu0/n0;->a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ltp0/d;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsp0/j;

    iget-object v0, p0, Ltp0/d;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Ltp0/d;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    iget-object v0, p0, Ltp0/d;->F:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-boolean v2, p0, Ltp0/d;->x:Z

    iget-object v3, p0, Ltp0/d;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Ltp0/d;->y:I

    iget v8, p0, Ltp0/d;->z:I

    iget v9, p0, Ltp0/d;->G:I

    invoke-static/range {v1 .. v11}, Ltp0/e;->e(Lsp0/j;ZLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
