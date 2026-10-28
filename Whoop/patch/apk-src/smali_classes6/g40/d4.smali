.class public final Lg40/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    iput p2, p0, Lg40/d4;->w:I

    iput-boolean p1, p0, Lg40/d4;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lg40/d4;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lg40/d4;->x:Z

    if-eqz p1, :cond_0

    sget-object p1, Lh00/h0;->z:Lh00/h0;

    goto :goto_0

    :cond_0
    sget-object p1, Lh00/h0;->y:Lh00/h0;

    :goto_0
    const/16 p3, 0x10

    int-to-float v2, p3

    const/4 v4, 0x0

    const/16 v5, 0xd

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p3

    const/4 v0, 0x5

    const/16 v1, 0x30

    invoke-static {p1, p3, v0, p2, v1}, Lv8/b;->e(Lh00/h0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v0, p1

    check-cast v0, Lg40/q3;

    move-object v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p1

    const-string p2, "it"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p1, 0x6

    if-nez p2, :cond_2

    move-object p2, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p1, p2

    :cond_2
    and-int/lit8 p2, p1, 0x13

    const/16 p3, 0x12

    if-ne p2, p3, :cond_4

    move-object p2, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_4
    :goto_2
    and-int/lit8 v4, p1, 0xe

    const/4 v5, 0x4

    iget-boolean v1, p0, Lg40/d4;->x:Z

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lg40/j4;->h(Lg40/q3;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
