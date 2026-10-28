.class public final synthetic Lf1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx1/b;


# direct methods
.method public synthetic constructor <init>(Lx1/b;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf1/z;->w:I

    iput-object p1, p0, Lf1/z;->x:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx1/b;II)V
    .locals 0

    .line 2
    iput p3, p0, Lf1/z;->w:I

    iput-object p1, p0, Lf1/z;->x:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/z;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Ly11/k;->g(Lx1/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Lwo1/i0;->b(Lx1/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Lp11/e;->k(Lx1/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Lp0/y;->e(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x37

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Ll1/t3;->a(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Lg1/s6;->d(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Lkotlin/jvm/internal/j;->g(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lf1/z;->x:Lx1/b;

    invoke-static {v0, p1, p2}, Lf1/y0;->a(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
