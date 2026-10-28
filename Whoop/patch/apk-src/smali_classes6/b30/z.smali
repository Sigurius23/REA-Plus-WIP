.class public final synthetic Lb30/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    const/4 p2, 0x4

    iput p2, p0, Lb30/z;->w:I

    sget-object p2, Lh20/n1;->w:Lh20/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/z;->x:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .line 2
    iput p2, p0, Lb30/z;->w:I

    iput-object p1, p0, Lb30/z;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 3
    iput p3, p0, Lb30/z;->w:I

    iput-object p1, p0, Lb30/z;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb30/z;->w:I

    const/4 v1, 0x0

    const-string v2, "str"

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    iget-object v6, p0, Lb30/z;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v5, p1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v0, :cond_0

    new-instance v1, Lug/f;

    add-int/lit8 v2, p2, 0x1

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lug/f;-><init>(ILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance v1, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "expected one of `"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "` found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0, p2}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p2, v0, p1}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    :goto_2
    if-ge v3, v0, :cond_4

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    add-int v2, p2, v3

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v1, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    new-instance v0, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v1, "expected `"

    const-string v2, "` found `"

    invoke-static {v1, v6, v2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {p1, p2, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x60

    invoke-static {v1, v2, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v0

    :cond_4
    new-instance p1, Lug/f;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p2

    invoke-direct {p1, v0, v6}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/lifecycle/g0;

    check-cast p2, Ls40/d0;

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const-string v0, "$this$doWithCardWidgetViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewModel"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, p2, Ls40/d0;->F:Ljava/lang/String;

    invoke-static {p2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    iget-object v0, p2, Ls40/d0;->y:Lbc3/z;

    new-instance v2, Ls40/c0;

    invoke-direct {v2, p2, v1, v3}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p2, 0x2

    invoke-static {p1, v0, v1, v2, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v4

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, p1, p2}, Lse/h;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, p1, p2}, Ln03/i;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, p1, p2}, Ln03/h;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, p1, p2}, Ln03/g;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, p1, p2}, Ll00/f;->l(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_7
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, p1, p2}, Ll00/f;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_8
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, p1, p2}, Lk03/n;->f(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    sget-object v0, Lh20/n1;->w:Lh20/n1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, p1, p2}, Lh00/o;->g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_a
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, p1, p2}, Ldl1/d;->i(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, p1, p2}, Ldp/d;->b(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_c
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, p1, p2}, Lug/m;->i(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_d
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, p1, p2}, Luf/c0;->k(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
