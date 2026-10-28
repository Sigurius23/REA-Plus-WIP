.class public final Lh00/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh00/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lh00/n;->w:I

    const v1, 0x7f08085f

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    if-ne p2, v3, :cond_1

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
    sget-object p2, Lh20/n1;->w:Lh20/n1;

    invoke-static {p1}, Lh00/o;->i(Landroidx/compose/runtime/Composer;)I

    invoke-static {v1, p1, v4}, Lh00/o;->b(ILandroidx/compose/runtime/Composer;I)V

    :goto_1
    return-object v2

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    if-ne p2, v3, :cond_3

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
    sget-object p2, Lh20/n1;->w:Lh20/n1;

    move-object p2, p1

    check-cast p2, Lp1/q;

    const v0, -0x632e68e2

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    const v0, -0x6c2a1eee

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/d;->a:Lg00/b;

    const v0, -0x1a6f7841

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->c:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    const-string v1, "$this$separatorOnPrimaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v0, Lg00/a;->k:J

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    invoke-static {v0, v1, p1, v4}, Lh00/o;->c(JLandroidx/compose/runtime/Composer;I)V

    :goto_3
    return-object v2

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    if-ne p2, v3, :cond_5

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_5

    :cond_5
    :goto_4
    sget-object p2, Lh20/n1;->w:Lh20/n1;

    invoke-static {p1}, Lh00/o;->i(Landroidx/compose/runtime/Composer;)I

    invoke-static {v1, p1, v4}, Lh00/o;->b(ILandroidx/compose/runtime/Composer;I)V

    :goto_5
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
