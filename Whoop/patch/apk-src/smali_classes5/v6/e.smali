.class public final synthetic Lv6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll83/e;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IILl83/e;III)V
    .locals 0

    iput p7, p0, Lv6/e;->w:I

    iput-object p1, p0, Lv6/e;->x:Ljava/lang/Object;

    iput p2, p0, Lv6/e;->y:I

    iput p3, p0, Lv6/e;->z:I

    iput-object p4, p0, Lv6/e;->E:Ll83/e;

    iput p5, p0, Lv6/e;->F:I

    iput p6, p0, Lv6/e;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lv6/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv6/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lv6/e;->E:Ll83/e;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v2, p0, Lv6/e;->y:I

    iget v3, p0, Lv6/e;->z:I

    iget v5, p0, Lv6/e;->F:I

    iget v6, p0, Lv6/e;->G:I

    invoke-static/range {v1 .. v8}, Lg31/c;->b(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lv6/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln6/o;

    iget-object v0, p0, Lv6/e;->E:Ll83/e;

    move-object v4, v0

    check-cast v4, Lx1/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lv6/e;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v2, p0, Lv6/e;->y:I

    iget v3, p0, Lv6/e;->z:I

    iget v7, p0, Lv6/e;->G:I

    invoke-static/range {v1 .. v7}, Ls2/a;->e(Ln6/o;IILx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lv6/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln6/o;

    iget-object v0, p0, Lv6/e;->E:Ll83/e;

    move-object v4, v0

    check-cast v4, Lx1/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lv6/e;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v2, p0, Lv6/e;->y:I

    iget v3, p0, Lv6/e;->z:I

    iget v7, p0, Lv6/e;->G:I

    invoke-static/range {v1 .. v7}, Lrv/n;->a(Ln6/o;IILx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
