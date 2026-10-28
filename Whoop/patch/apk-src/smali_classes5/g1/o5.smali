.class public final synthetic Lg1/o5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Landroidx/compose/ui/Modifier;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLi93/f;ILc93/a;Lg1/w1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg1/o5;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/o5;->E:F

    iput-object p2, p0, Lg1/o5;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lg1/o5;->F:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lg1/o5;->z:Z

    iput-object p5, p0, Lg1/o5;->I:Ljava/lang/Object;

    iput p6, p0, Lg1/o5;->x:I

    iput-object p7, p0, Lg1/o5;->J:Ljava/lang/Object;

    iput-object p8, p0, Lg1/o5;->K:Ljava/lang/Object;

    iput p9, p0, Lg1/o5;->G:I

    iput p10, p0, Lg1/o5;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;Ljava/lang/String;ZFLandroidx/compose/ui/Modifier;Lc93/n;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lg1/o5;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/o5;->I:Ljava/lang/Object;

    iput p2, p0, Lg1/o5;->x:I

    iput-object p3, p0, Lg1/o5;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lg1/o5;->J:Ljava/lang/Object;

    iput-boolean p5, p0, Lg1/o5;->z:Z

    iput p6, p0, Lg1/o5;->E:F

    iput-object p7, p0, Lg1/o5;->F:Landroidx/compose/ui/Modifier;

    iput-object p8, p0, Lg1/o5;->K:Ljava/lang/Object;

    iput p9, p0, Lg1/o5;->G:I

    iput p10, p0, Lg1/o5;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lg1/o5;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/o5;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lg1/o5;->J:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lg1/o5;->K:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lc93/n;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget v2, p0, Lg1/o5;->x:I

    iget-object v3, p0, Lg1/o5;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v5, p0, Lg1/o5;->z:Z

    iget v6, p0, Lg1/o5;->E:F

    iget-object v7, p0, Lg1/o5;->F:Landroidx/compose/ui/Modifier;

    iget v9, p0, Lg1/o5;->G:I

    iget v10, p0, Lg1/o5;->H:I

    invoke-static/range {v1 .. v12}, Lwr0/u0;->i(Ljava/util/List;ILkotlin/jvm/functions/Function1;Ljava/lang/String;ZFLandroidx/compose/ui/Modifier;Lc93/n;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/o5;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Li93/f;

    iget-object v0, p0, Lg1/o5;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    iget-object v0, p0, Lg1/o5;->K:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lg1/w1;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/o5;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget v1, p0, Lg1/o5;->E:F

    iget-object v2, p0, Lg1/o5;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lg1/o5;->F:Landroidx/compose/ui/Modifier;

    iget-boolean v4, p0, Lg1/o5;->z:Z

    iget v6, p0, Lg1/o5;->x:I

    iget v11, p0, Lg1/o5;->H:I

    invoke-static/range {v1 .. v11}, Lg1/g6;->b(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLi93/f;ILc93/a;Lg1/w1;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
