.class public final Lui/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lui/z;

.field public final synthetic F:Ly2/k;

.field public final synthetic G:Ljava/util/Map;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Lqi/i;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lqi/i;Lc93/a;Landroidx/compose/ui/Modifier;Lui/z;Ly2/k;Ljava/util/Map;IIII)V
    .locals 0

    iput p10, p0, Lui/j;->w:I

    iput-object p1, p0, Lui/j;->x:Lqi/i;

    iput-object p2, p0, Lui/j;->y:Lc93/a;

    iput-object p3, p0, Lui/j;->z:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lui/j;->E:Lui/z;

    iput-object p5, p0, Lui/j;->F:Ly2/k;

    iput-object p6, p0, Lui/j;->G:Ljava/util/Map;

    iput p7, p0, Lui/j;->H:I

    iput p8, p0, Lui/j;->I:I

    iput p9, p0, Lui/j;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lui/j;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lui/j;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget p1, p0, Lui/j;->I:I

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget v10, p0, Lui/j;->J:I

    iget-object v1, p0, Lui/j;->x:Lqi/i;

    iget-object v2, p0, Lui/j;->y:Lc93/a;

    iget-object v3, p0, Lui/j;->z:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lui/j;->E:Lui/z;

    iget-object v5, p0, Lui/j;->F:Ly2/k;

    iget-object v6, p0, Lui/j;->G:Ljava/util/Map;

    invoke-static/range {v1 .. v10}, Lpf/c;->f(Lqi/i;Lc93/a;Landroidx/compose/ui/Modifier;Lui/z;Ly2/k;Ljava/util/Map;Landroidx/compose/runtime/Composer;III)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lui/j;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget p1, p0, Lui/j;->I:I

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget v9, p0, Lui/j;->J:I

    iget-object v0, p0, Lui/j;->x:Lqi/i;

    iget-object v1, p0, Lui/j;->y:Lc93/a;

    iget-object v2, p0, Lui/j;->z:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lui/j;->E:Lui/z;

    iget-object v4, p0, Lui/j;->F:Ly2/k;

    iget-object v5, p0, Lui/j;->G:Ljava/util/Map;

    invoke-static/range {v0 .. v9}, Lpf/c;->f(Lqi/i;Lc93/a;Landroidx/compose/ui/Modifier;Lui/z;Ly2/k;Ljava/util/Map;Landroidx/compose/runtime/Composer;III)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
