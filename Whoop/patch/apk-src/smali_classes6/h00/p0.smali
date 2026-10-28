.class public final synthetic Lh00/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lx1/b;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lx1/b;II)V
    .locals 0

    iput p4, p0, Lh00/p0;->w:I

    iput-object p1, p0, Lh00/p0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lh00/p0;->y:Lx1/b;

    iput p3, p0, Lh00/p0;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh00/p0;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    iget p2, p0, Lh00/p0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lh00/p0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lh00/p0;->y:Lx1/b;

    invoke-static {v0, v1, p1, p2}, Ls2/a;->c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget p2, p0, Lh00/p0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lh00/p0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lh00/p0;->y:Lx1/b;

    invoke-static {v0, v1, p1, p2}, Ls2/a;->d(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_1
    iget p2, p0, Lh00/p0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lh00/p0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lh00/p0;->y:Lx1/b;

    invoke-static {v0, v1, p1, p2}, Lz0/i;->d(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_2
    iget p2, p0, Lh00/p0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lh00/p0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lh00/p0;->y:Lx1/b;

    invoke-static {v0, v1, p1, p2}, Ls/s;->c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_3
    iget p2, p0, Lh00/p0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lh00/p0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lh00/p0;->y:Lx1/b;

    invoke-static {v0, v1, p1, p2}, Ls/s;->b(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_4
    iget p2, p0, Lh00/p0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lh00/p0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lh00/p0;->y:Lx1/b;

    invoke-static {v0, v1, p1, p2}, Lvd/f;->c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
