.class public final synthetic Lb30/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ll83/e;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(La30/n1;La30/k1;Lc93/a;Lc93/a;FLandroidx/compose/ui/Modifier;Lv00/j0;Lux/b;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb30/q2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/q2;->E:Ljava/lang/Object;

    iput-object p2, p0, Lb30/q2;->F:Ljava/lang/Object;

    iput-object p3, p0, Lb30/q2;->G:Ll83/e;

    iput-object p4, p0, Lb30/q2;->H:Ljava/lang/Object;

    iput p5, p0, Lb30/q2;->y:F

    iput-object p6, p0, Lb30/q2;->x:Landroidx/compose/ui/Modifier;

    iput-object p7, p0, Lb30/q2;->I:Ljava/lang/Object;

    iput-object p8, p0, Lb30/q2;->J:Ljava/lang/Object;

    iput p9, p0, Lb30/q2;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Ll1/y;Ll3/v0;FLx1/b;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb30/q2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/q2;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb30/q2;->E:Ljava/lang/Object;

    iput-object p3, p0, Lb30/q2;->F:Ljava/lang/Object;

    iput-object p4, p0, Lb30/q2;->G:Ll83/e;

    iput-object p5, p0, Lb30/q2;->H:Ljava/lang/Object;

    iput-object p6, p0, Lb30/q2;->I:Ljava/lang/Object;

    iput p7, p0, Lb30/q2;->y:F

    iput-object p8, p0, Lb30/q2;->J:Ljava/lang/Object;

    iput p9, p0, Lb30/q2;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lb30/q2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/q2;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/m;

    iget-object v0, p0, Lb30/q2;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    iget-object v0, p0, Lb30/q2;->G:Ll83/e;

    move-object v4, v0

    check-cast v4, Lc93/m;

    iget-object v0, p0, Lb30/q2;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ll1/y;

    iget-object v0, p0, Lb30/q2;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll3/v0;

    iget-object v0, p0, Lb30/q2;->J:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lx1/b;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/q2;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v1, p0, Lb30/q2;->x:Landroidx/compose/ui/Modifier;

    iget v7, p0, Lb30/q2;->y:F

    invoke-static/range {v1 .. v10}, Ll1/f1;->a(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Ll1/y;Ll3/v0;FLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/q2;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, La30/n1;

    iget-object v0, p0, Lb30/q2;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, La30/k1;

    iget-object v0, p0, Lb30/q2;->G:Ll83/e;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lb30/q2;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Lb30/q2;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lv00/j0;

    iget-object v0, p0, Lb30/q2;->J:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lux/b;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/q2;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget v5, p0, Lb30/q2;->y:F

    iget-object v6, p0, Lb30/q2;->x:Landroidx/compose/ui/Modifier;

    invoke-static/range {v1 .. v10}, Lds/p;->p(La30/n1;La30/k1;Lc93/a;Lc93/a;FLandroidx/compose/ui/Modifier;Lv00/j0;Lux/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
