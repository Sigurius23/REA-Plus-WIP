.class public final synthetic Lb30/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lc93/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb30/o;Lb30/p;Ly3/f;FZI)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb30/p1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/p1;->G:Ljava/lang/Object;

    iput-object p2, p0, Lb30/p1;->y:Ljava/lang/String;

    iput-object p3, p0, Lb30/p1;->x:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lb30/p1;->H:Ljava/lang/Object;

    iput-object p5, p0, Lb30/p1;->I:Ljava/lang/Object;

    iput-object p6, p0, Lb30/p1;->J:Ljava/lang/Object;

    iput p7, p0, Lb30/p1;->z:F

    iput-boolean p8, p0, Lb30/p1;->E:Z

    iput p9, p0, Lb30/p1;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lch/r;Landroidx/compose/ui/Modifier;Ln2/a;Ljava/lang/String;Lb2/h;Ly2/k;FZI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb30/p1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/p1;->G:Ljava/lang/Object;

    iput-object p2, p0, Lb30/p1;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lb30/p1;->H:Ljava/lang/Object;

    iput-object p4, p0, Lb30/p1;->y:Ljava/lang/String;

    iput-object p5, p0, Lb30/p1;->I:Ljava/lang/Object;

    iput-object p6, p0, Lb30/p1;->J:Ljava/lang/Object;

    iput p7, p0, Lb30/p1;->z:F

    iput-boolean p8, p0, Lb30/p1;->E:Z

    iput p9, p0, Lb30/p1;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lb30/p1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/p1;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lch/r;

    iget-object v0, p0, Lb30/p1;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ln2/a;

    iget-object v0, p0, Lb30/p1;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lb2/h;

    iget-object v0, p0, Lb30/p1;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ly2/k;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/p1;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v2, p0, Lb30/p1;->x:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lb30/p1;->y:Ljava/lang/String;

    iget v7, p0, Lb30/p1;->z:F

    iget-boolean v8, p0, Lb30/p1;->E:Z

    invoke-static/range {v1 .. v10}, Lds/p;->o(Lch/r;Landroidx/compose/ui/Modifier;Ln2/a;Ljava/lang/String;Lb2/h;Ly2/k;FZLandroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/p1;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, Lb30/p1;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb30/o;

    iget-object v0, p0, Lb30/p1;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lb30/p;

    iget-object v0, p0, Lb30/p1;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ly3/f;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/p1;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v2, p0, Lb30/p1;->y:Ljava/lang/String;

    iget-object v3, p0, Lb30/p1;->x:Landroidx/compose/ui/Modifier;

    iget v7, p0, Lb30/p1;->z:F

    iget-boolean v8, p0, Lb30/p1;->E:Z

    invoke-static/range {v1 .. v10}, Lx30/s0;->f(Lc93/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb30/o;Lb30/p;Ly3/f;FZLandroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
