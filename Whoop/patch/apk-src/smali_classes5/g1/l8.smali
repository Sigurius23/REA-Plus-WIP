.class public final Lg1/l8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lc93/m;


# direct methods
.method public synthetic constructor <init>(JLc93/m;I)V
    .locals 0

    iput p4, p0, Lg1/l8;->w:I

    iput-wide p1, p0, Lg1/l8;->x:J

    iput-object p3, p0, Lg1/l8;->y:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lg1/l8;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v5

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v6, 0x0

    const/4 v7, 0x6

    iget-wide v1, p0, Lg1/l8;->x:J

    const/4 v3, 0x0

    iget-object v4, p0, Lg1/l8;->y:Lc93/m;

    invoke-static/range {v1 .. v7}, Lvp/c;->k(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_3

    move-object p1, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v5, 0x0

    const/4 v6, 0x6

    iget-wide v0, p0, Lg1/l8;->x:J

    const/4 v2, 0x0

    iget-object v3, p0, Lg1/l8;->y:Lc93/m;

    invoke-static/range {v0 .. v6}, Lvp/c;->k(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

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

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    and-int/2addr p2, v2

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 v6, 0x0

    const/4 v7, 0x6

    iget-wide v1, p0, Lg1/l8;->x:J

    const/4 v3, 0x0

    iget-object v4, p0, Lg1/l8;->y:Lc93/m;

    invoke-static/range {v1 .. v7}, Lg1/p8;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

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

    if-eq v0, v1, :cond_6

    move v0, v2

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    and-int/2addr p2, v2

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 v6, 0x0

    const/4 v7, 0x6

    iget-wide v1, p0, Lg1/l8;->x:J

    const/4 v3, 0x0

    iget-object v4, p0, Lg1/l8;->y:Lc93/m;

    invoke-static/range {v1 .. v7}, Lg1/p8;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

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
