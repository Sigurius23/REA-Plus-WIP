.class public final Ll00/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/ui/Modifier;)V
    .locals 0

    iput p1, p0, Ll00/d;->w:I

    iput-object p2, p0, Ll00/d;->x:Landroidx/compose/ui/Modifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll00/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$StripeImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Ll00/d;->x:Landroidx/compose/ui/Modifier;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$StripeImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_3

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p1, p0, Ll00/d;->x:Landroidx/compose/ui/Modifier;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Ll00/f;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$StripeImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_5

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_5

    :cond_5
    :goto_4
    iget-object p1, p0, Ll00/d;->x:Landroidx/compose/ui/Modifier;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$StripeImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_7

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_7

    :cond_7
    :goto_6
    iget-object p1, p0, Ll00/d;->x:Landroidx/compose/ui/Modifier;

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Ll00/f;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

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
