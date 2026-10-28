.class public final Loj/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    iput p4, p0, Loj/r;->w:I

    iput-object p1, p0, Loj/r;->x:Ljava/lang/String;

    iput-object p2, p0, Loj/r;->y:Landroidx/compose/ui/Modifier;

    iput p3, p0, Loj/r;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Loj/r;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget p2, p0, Loj/r;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Loj/r;->x:Ljava/lang/String;

    iget-object v1, p0, Loj/r;->y:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1, p2}, Lse/b;->u(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget p2, p0, Loj/r;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Loj/r;->x:Ljava/lang/String;

    iget-object v1, p0, Loj/r;->y:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1, p2}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
