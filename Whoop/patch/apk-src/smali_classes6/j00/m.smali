.class public final synthetic Lj00/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    iput p4, p0, Lj00/m;->w:I

    iput-object p1, p0, Lj00/m;->x:Ljava/lang/String;

    iput-object p2, p0, Lj00/m;->y:Landroidx/compose/ui/Modifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj00/m;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/16 p2, 0x31

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lj00/m;->x:Ljava/lang/String;

    iget-object v1, p0, Lj00/m;->y:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1, p2}, Ls9/f;->l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lj00/m;->x:Ljava/lang/String;

    iget-object v1, p0, Lj00/m;->y:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1, p2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_1
    const/16 p2, 0x31

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lj00/m;->x:Ljava/lang/String;

    iget-object v1, p0, Lj00/m;->y:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1, p2}, Lj00/q;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
