.class public final synthetic Ll1/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lj0/i;

.field public final synthetic F:F

.field public final synthetic G:F

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ll1/s2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/s2;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Ll1/s2;->y:Z

    iput-object p3, p0, Ll1/s2;->J:Ljava/lang/Object;

    iput-boolean p4, p0, Ll1/s2;->z:Z

    iput-object p5, p0, Ll1/s2;->E:Lj0/i;

    iput-object p6, p0, Ll1/s2;->K:Ljava/lang/Object;

    iput-object p7, p0, Ll1/s2;->L:Ljava/lang/Object;

    iput p8, p0, Ll1/s2;->F:F

    iput p9, p0, Ll1/s2;->G:F

    iput p10, p0, Ll1/s2;->H:I

    iput p11, p0, Ll1/s2;->I:I

    return-void
.end method

.method public synthetic constructor <init>(Ll1/t2;ZZLj0/i;Landroidx/compose/ui/Modifier;Ll1/e4;Li2/a1;FFII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ll1/s2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/s2;->J:Ljava/lang/Object;

    iput-boolean p2, p0, Ll1/s2;->y:Z

    iput-boolean p3, p0, Ll1/s2;->z:Z

    iput-object p4, p0, Ll1/s2;->E:Lj0/i;

    iput-object p5, p0, Ll1/s2;->x:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Ll1/s2;->K:Ljava/lang/Object;

    iput-object p7, p0, Ll1/s2;->L:Ljava/lang/Object;

    iput p8, p0, Ll1/s2;->F:F

    iput p9, p0, Ll1/s2;->G:F

    iput p10, p0, Ll1/s2;->H:I

    iput p11, p0, Ll1/s2;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Ll1/s2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/s2;->J:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ll1/s2;->K:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lg1/a1;

    iget-object v0, p0, Ll1/s2;->L:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ly71/g;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v1, p0, Ll1/s2;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Ll1/s2;->y:Z

    iget-boolean v4, p0, Ll1/s2;->z:Z

    iget-object v5, p0, Ll1/s2;->E:Lj0/i;

    iget v8, p0, Ll1/s2;->F:F

    iget v9, p0, Ll1/s2;->G:F

    iget v10, p0, Ll1/s2;->H:I

    iget v11, p0, Ll1/s2;->I:I

    invoke-static/range {v1 .. v13}, Lsy0/h;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll1/s2;->J:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll1/t2;

    iget-object v0, p0, Ll1/s2;->K:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll1/e4;

    iget-object v0, p0, Ll1/s2;->L:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Li2/a1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/s2;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-boolean v2, p0, Ll1/s2;->y:Z

    iget-boolean v3, p0, Ll1/s2;->z:Z

    iget-object v4, p0, Ll1/s2;->E:Lj0/i;

    iget-object v5, p0, Ll1/s2;->x:Landroidx/compose/ui/Modifier;

    iget v8, p0, Ll1/s2;->F:F

    iget v9, p0, Ll1/s2;->G:F

    iget v12, p0, Ll1/s2;->I:I

    invoke-virtual/range {v1 .. v12}, Ll1/t2;->a(ZZLj0/i;Landroidx/compose/ui/Modifier;Ll1/e4;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
