.class public final synthetic Lb30/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;II)V
    .locals 0

    iput p3, p0, Lb30/v3;->w:I

    iput-object p1, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/v3;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Lsc3/l;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Ll00/f;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_1
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Ll00/f;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_2
    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Lug/m;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_3
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Lug/m;->j(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_4
    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Lse/g;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_5
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/v3;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Lb30/c4;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
