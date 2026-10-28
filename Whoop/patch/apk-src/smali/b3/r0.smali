.class public final Lb3/r0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/Owner;Lb3/b3;Lc93/m;I)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Lb3/r0;->w:I

    .line 1
    iput-object p1, p0, Lb3/r0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb3/r0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb3/r0;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lb3/r0;->w:I

    iput-object p1, p0, Lb3/r0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb3/r0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb3/r0;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lb3/r0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    iget-object p2, p0, Lb3/r0;->y:Ljava/lang/Object;

    check-cast p2, Lbc3/c0;

    new-instance v0, Lgb/y;

    iget-object v1, p0, Lb3/r0;->z:Ljava/lang/Object;

    check-cast v1, Ld0/f1;

    iget-object v2, p0, Lb3/r0;->x:Ljava/lang/Object;

    check-cast v2, Leb/q;

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lgb/y;-><init>(FLd0/f1;Leb/q;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v3, v3, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lb3/r0;->y:Ljava/lang/Object;

    check-cast p2, Landroidx/compose/ui/node/Owner;

    iget-object v0, p0, Lb3/r0;->z:Ljava/lang/Object;

    check-cast v0, Lb3/b3;

    iget-object v1, p0, Lb3/r0;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    const/4 v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lb3/v1;->a(Landroidx/compose/ui/node/Owner;Lb3/b3;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lb3/r0;->y:Ljava/lang/Object;

    check-cast p2, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v0, p0, Lb3/r0;->z:Ljava/lang/Object;

    check-cast v0, Lb3/e1;

    iget-object v1, p0, Lb3/r0;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    invoke-static {p2, v0, v1, p1, v2}, Lb3/v1;->a(Landroidx/compose/ui/node/Owner;Lb3/b3;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
