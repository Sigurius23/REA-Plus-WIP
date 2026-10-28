.class public final Lnj/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ll83/e;III)V
    .locals 0

    iput p5, p0, Lnj/g;->w:I

    iput-object p1, p0, Lnj/g;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lnj/g;->E:Ll83/e;

    iput p3, p0, Lnj/g;->y:I

    iput p4, p0, Lnj/g;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lnj/g;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Lnj/g;->E:Ll83/e;

    check-cast p2, Lc93/m;

    iget v0, p0, Lnj/g;->y:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v0

    iget v1, p0, Lnj/g;->z:I

    iget-object v2, p0, Lnj/g;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v2, p2, p1, v0, v1}, Ly2/q1;->b(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p2, p0, Lnj/g;->E:Ll83/e;

    check-cast p2, Lc93/a;

    iget v0, p0, Lnj/g;->y:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v0

    iget v1, p0, Lnj/g;->z:I

    iget-object v2, p0, Lnj/g;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v2, p2, p1, v0, v1}, Le4/a;->c(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
