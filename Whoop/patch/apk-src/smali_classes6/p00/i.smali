.class public final synthetic Lp00/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ld00/l;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p7, p0, Lp00/i;->w:I

    iput-object p1, p0, Lp00/i;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lp00/i;->y:Ld00/l;

    iput-object p3, p0, Lp00/i;->z:Lc93/a;

    iput-object p4, p0, Lp00/i;->E:Lc93/a;

    iput-object p5, p0, Lp00/i;->F:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lp00/i;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lp00/i;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lp00/i;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v1, p0, Lp00/i;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lp00/i;->y:Ld00/l;

    iget-object v3, p0, Lp00/i;->z:Lc93/a;

    iget-object v4, p0, Lp00/i;->E:Lc93/a;

    iget-object v5, p0, Lp00/i;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v7}, Lkotlin/jvm/internal/j;->r(Landroidx/compose/ui/Modifier;Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lp00/i;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Lp00/i;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lp00/i;->y:Ld00/l;

    iget-object v2, p0, Lp00/i;->z:Lc93/a;

    iget-object v3, p0, Lp00/i;->E:Lc93/a;

    iget-object v4, p0, Lp00/i;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v6}, Lkotlin/jvm/internal/j;->r(Landroidx/compose/ui/Modifier;Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
