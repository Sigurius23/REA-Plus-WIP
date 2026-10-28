.class public final synthetic Lg1/s8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Z

.field public final synthetic H:F

.field public final synthetic I:I

.field public final synthetic J:Lc93/m;

.field public final synthetic K:Ll0/k1;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/k1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg1/s8;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/s8;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/s8;->y:Lc93/m;

    iput-object p3, p0, Lg1/s8;->E:Lc93/m;

    iput-object p4, p0, Lg1/s8;->z:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lg1/s8;->F:Lc93/m;

    iput-object p6, p0, Lg1/s8;->J:Lc93/m;

    iput-boolean p7, p0, Lg1/s8;->G:Z

    iput p8, p0, Lg1/s8;->H:F

    iput-object p9, p0, Lg1/s8;->K:Ll0/k1;

    iput p10, p0, Lg1/s8;->I:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/l1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lg1/s8;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/s8;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/s8;->J:Lc93/m;

    iput-object p3, p0, Lg1/s8;->y:Lc93/m;

    iput-object p4, p0, Lg1/s8;->z:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lg1/s8;->E:Lc93/m;

    iput-object p6, p0, Lg1/s8;->F:Lc93/m;

    iput-boolean p7, p0, Lg1/s8;->G:Z

    iput p8, p0, Lg1/s8;->H:F

    iput-object p9, p0, Lg1/s8;->K:Ll0/k1;

    iput p10, p0, Lg1/s8;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lg1/s8;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/s8;->J:Lc93/m;

    move-object v2, v0

    check-cast v2, Lx1/b;

    iget-object v0, p0, Lg1/s8;->K:Ll0/k1;

    move-object v9, v0

    check-cast v9, Ll0/l1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/s8;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v1, p0, Lg1/s8;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lg1/s8;->y:Lc93/m;

    iget-object v4, p0, Lg1/s8;->z:Lkotlin/jvm/functions/Function3;

    iget-object v5, p0, Lg1/s8;->E:Lc93/m;

    iget-object v6, p0, Lg1/s8;->F:Lc93/m;

    iget-boolean v7, p0, Lg1/s8;->G:Z

    iget v8, p0, Lg1/s8;->H:F

    invoke-static/range {v1 .. v11}, Li40/j;->a(Landroidx/compose/ui/Modifier;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/l1;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lg1/s8;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Lg1/s8;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg1/s8;->y:Lc93/m;

    iget-object v2, p0, Lg1/s8;->E:Lc93/m;

    iget-object v3, p0, Lg1/s8;->z:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lg1/s8;->F:Lc93/m;

    iget-object v5, p0, Lg1/s8;->J:Lc93/m;

    iget-boolean v6, p0, Lg1/s8;->G:Z

    iget v7, p0, Lg1/s8;->H:F

    iget-object v8, p0, Lg1/s8;->K:Ll0/k1;

    invoke-static/range {v0 .. v10}, Lg1/u8;->c(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/k1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
