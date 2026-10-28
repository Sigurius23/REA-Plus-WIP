.class public final Lg1/o8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Float;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Float;Lc93/m;I)V
    .locals 0

    .line 1
    iput p5, p0, Lg1/o8;->w:I

    iput-wide p1, p0, Lg1/o8;->x:J

    iput-object p3, p0, Lg1/o8;->y:Ljava/lang/Float;

    iput-object p4, p0, Lg1/o8;->z:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Float;Lc93/m;JI)V
    .locals 0

    .line 2
    iput p5, p0, Lg1/o8;->w:I

    iput-object p1, p0, Lg1/o8;->y:Ljava/lang/Float;

    iput-object p2, p0, Lg1/o8;->z:Lc93/m;

    iput-wide p3, p0, Lg1/o8;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg1/o8;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p2, Lg1/l1;->a:Lp1/b0;

    new-instance v0, Li2/x;

    iget-wide v4, p0, Lg1/o8;->x:J

    invoke-direct {v0, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v1, Lg1/o8;

    iget-object v3, p0, Lg1/o8;->z:Lc93/m;

    const/4 v6, 0x2

    iget-object v2, p0, Lg1/o8;->y:Ljava/lang/Float;

    invoke-direct/range {v1 .. v6}, Lg1/o8;-><init>(Ljava/lang/Float;Lc93/m;JI)V

    const v0, -0x44425f9a

    invoke-static {v0, p1, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p2, 0x0

    const/16 v0, 0x8

    iget-object v1, p0, Lg1/o8;->z:Lc93/m;

    iget-object v2, p0, Lg1/o8;->y:Ljava/lang/Float;

    if-eqz v2, :cond_4

    check-cast p1, Lp1/q;

    const v3, -0x39d4a917

    invoke-virtual {p1, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v3, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    invoke-static {v2, v1, p1, v0}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    check-cast p1, Lp1/q;

    const v2, -0x39d1eedd

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg1/j1;->a:Lp1/b0;

    iget-wide v3, p0, Lg1/o8;->x:J

    invoke-static {v3, v4}, Li2/x;->e(J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    invoke-static {v2, v1, p1, v0}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_5

    move v0, v2

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    sget-object p2, Lg1/l1;->a:Lp1/b0;

    new-instance v0, Li2/x;

    iget-wide v4, p0, Lg1/o8;->x:J

    invoke-direct {v0, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v1, Lg1/o8;

    iget-object v3, p0, Lg1/o8;->z:Lc93/m;

    const/4 v6, 0x0

    iget-object v2, p0, Lg1/o8;->y:Ljava/lang/Float;

    invoke-direct/range {v1 .. v6}, Lg1/o8;-><init>(Ljava/lang/Float;Lc93/m;JI)V

    const v0, -0x60d57365

    invoke-static {v0, p1, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_7

    move v0, v2

    goto :goto_6

    :cond_7
    move v0, v3

    :goto_6
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_9

    const/16 p2, 0x8

    iget-object v0, p0, Lg1/o8;->z:Lc93/m;

    iget-object v1, p0, Lg1/o8;->y:Ljava/lang/Float;

    if-eqz v1, :cond_8

    const v2, 0x58812ba4

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v2, v1}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-static {v1, v0, p1, p2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    const v1, 0x5884373e

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lg1/j1;->a:Lp1/b0;

    iget-wide v4, p0, Lg1/o8;->x:J

    invoke-static {v4, v5}, Li2/x;->e(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-static {v1, v0, p1, p2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
