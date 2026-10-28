.class public final Lsj/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lsj/l;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lsj/l;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    iput p5, p0, Lsj/i;->w:I

    iput-object p1, p0, Lsj/i;->x:Lsj/l;

    iput-object p2, p0, Lsj/i;->y:Landroidx/compose/ui/Modifier;

    iput p3, p0, Lsj/i;->z:I

    iput p4, p0, Lsj/i;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsj/i;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget p2, p0, Lsj/i;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lsj/i;->E:I

    iget-object v1, p0, Lsj/i;->x:Lsj/l;

    iget-object v2, p0, Lsj/i;->y:Landroidx/compose/ui/Modifier;

    invoke-virtual {v1, v2, p2, p1, v0}, Lsj/l;->f(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget p2, p0, Lsj/i;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lsj/i;->E:I

    iget-object v1, p0, Lsj/i;->x:Lsj/l;

    iget-object v2, p0, Lsj/i;->y:Landroidx/compose/ui/Modifier;

    invoke-virtual {v1, v2, p2, p1, v0}, Lsj/l;->d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
