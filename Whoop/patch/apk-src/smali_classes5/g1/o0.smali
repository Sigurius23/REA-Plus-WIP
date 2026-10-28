.class public final synthetic Lg1/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx1/b;

.field public final synthetic y:Lx1/b;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lx1/b;Landroidx/compose/ui/Modifier;Lx1/b;I)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    iput p4, p0, Lg1/o0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/o0;->x:Lx1/b;

    iput-object p2, p0, Lg1/o0;->z:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/o0;->y:Lx1/b;

    return-void
.end method

.method public synthetic constructor <init>(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 2
    const/4 p4, 0x1

    iput p4, p0, Lg1/o0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/o0;->x:Lx1/b;

    iput-object p2, p0, Lg1/o0;->y:Lx1/b;

    iput-object p3, p0, Lg1/o0;->z:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg1/o0;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/16 p2, 0x37

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lg1/o0;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg1/o0;->x:Lx1/b;

    iget-object v2, p0, Lg1/o0;->y:Lx1/b;

    invoke-static {p2, p1, v0, v1, v2}, Lvp/c;->e(ILandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/16 p2, 0x187

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lg1/o0;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg1/o0;->x:Lx1/b;

    iget-object v2, p0, Lg1/o0;->y:Lx1/b;

    invoke-static {p2, p1, v0, v1, v2}, Lg1/p0;->a(ILandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
