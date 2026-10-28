.class public final Lc0/c0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lc0/c1;

.field public final synthetic G:Lc0/e1;

.field public final synthetic H:Lkotlin/jvm/functions/Function3;

.field public final synthetic w:I

.field public final synthetic x:Ld0/z1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;II)V
    .locals 0

    iput p8, p0, Lc0/c0;->w:I

    iput-object p1, p0, Lc0/c0;->x:Ld0/z1;

    iput-object p2, p0, Lc0/c0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lc0/c0;->z:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lc0/c0;->F:Lc0/c1;

    iput-object p5, p0, Lc0/c0;->G:Lc0/e1;

    iput-object p6, p0, Lc0/c0;->H:Lkotlin/jvm/functions/Function3;

    iput p7, p0, Lc0/c0;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lc0/c0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc0/c0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v1, p0, Lc0/c0;->x:Ld0/z1;

    iget-object v2, p0, Lc0/c0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lc0/c0;->z:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lc0/c0;->F:Lc0/c1;

    iget-object v5, p0, Lc0/c0;->G:Lc0/e1;

    iget-object v6, p0, Lc0/c0;->H:Lkotlin/jvm/functions/Function3;

    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/b;->h(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lc0/c0;->F:Lc0/c1;

    move-object v3, p1

    check-cast v3, Lc0/d1;

    iget-object p1, p0, Lc0/c0;->G:Lc0/e1;

    move-object v4, p1

    check-cast v4, Lc0/f1;

    iget-object p1, p0, Lc0/c0;->H:Lkotlin/jvm/functions/Function3;

    move-object v5, p1

    check-cast v5, Lx1/b;

    iget p1, p0, Lc0/c0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v0, p0, Lc0/c0;->x:Ld0/z1;

    iget-object v1, p0, Lc0/c0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lc0/c0;->z:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/b;->c(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/f1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
