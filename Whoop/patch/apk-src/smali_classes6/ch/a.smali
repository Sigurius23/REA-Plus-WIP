.class public final synthetic Lch/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;FLf0/r1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lep0/j;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lch/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/a;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lch/a;->H:Ljava/lang/Object;

    iput p3, p0, Lch/a;->y:F

    iput-object p4, p0, Lch/a;->I:Ljava/lang/Object;

    iput-object p5, p0, Lch/a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lch/a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lch/a;->J:Ljava/lang/Object;

    iput-object p8, p0, Lch/a;->K:Ljava/lang/Object;

    iput p9, p0, Lch/a;->F:I

    iput p10, p0, Lch/a;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;FII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lch/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/a;->H:Ljava/lang/Object;

    iput-object p2, p0, Lch/a;->I:Ljava/lang/Object;

    iput-object p3, p0, Lch/a;->x:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lch/a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lch/a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lch/a;->J:Ljava/lang/Object;

    iput-object p7, p0, Lch/a;->K:Ljava/lang/Object;

    iput p8, p0, Lch/a;->y:F

    iput p9, p0, Lch/a;->F:I

    iput p10, p0, Lch/a;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lch/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch/a;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lch/a;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lf0/r1;

    iget-object v0, p0, Lch/a;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lch/a;->K:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lep0/j;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v1, p0, Lch/a;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lch/a;->y:F

    iget-object v5, p0, Lch/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lch/a;->E:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lch/a;->F:I

    iget v10, p0, Lch/a;->G:I

    invoke-static/range {v1 .. v12}, Lkk1/g;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;FLf0/r1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lep0/j;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch/a;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lch/l;

    iget-object v0, p0, Lch/a;->I:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lch/a;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lb2/h;

    iget-object v0, p0, Lch/a;->K:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ly2/k;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lch/a;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget p1, p0, Lch/a;->G:I

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v3, p0, Lch/a;->x:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lch/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lch/a;->E:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lch/a;->y:F

    invoke-static/range {v1 .. v11}, Lce/w;->k(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;FLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
