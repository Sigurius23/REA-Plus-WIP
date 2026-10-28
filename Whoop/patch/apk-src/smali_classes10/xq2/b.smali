.class public final synthetic Lxq2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lxq2/b;->w:I

    iput-object p1, p0, Lxq2/b;->y:Ljava/lang/Object;

    iput p2, p0, Lxq2/b;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lxq2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxq2/b;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/k;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lxq2/b;->x:I

    invoke-static {v0, v1, p1, p2}, Lxq2/q0;->h(Lxq2/k;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxq2/b;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lxq2/b;->x:I

    invoke-static {v0, v1, p1, p2}, Lxq2/q0;->i(Lxq2/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lxq2/b;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/m0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lxq2/b;->x:I

    invoke-static {v0, v1, p1, p2}, Lxq2/l0;->e(Lxq2/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lxq2/b;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/u;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lxq2/b;->x:I

    invoke-static {v0, v1, p1, p2}, Lxq2/w;->a(Lxq2/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lxq2/b;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/n;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lxq2/b;->x:I

    invoke-static {v0, v1, p1, p2}, Lxq2/p;->a(Lxq2/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lxq2/b;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lxq2/b;->x:I

    invoke-static {v0, v1, p1, p2}, Lxq2/c;->a(Lxq2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
