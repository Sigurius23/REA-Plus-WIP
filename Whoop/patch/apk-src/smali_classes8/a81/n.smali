.class public final synthetic La81/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, La81/n;->w:I

    iput-object p1, p0, La81/n;->x:Ljava/lang/Object;

    iput-object p2, p0, La81/n;->y:Ljava/lang/Object;

    iput-object p3, p0, La81/n;->z:Ljava/lang/Object;

    iput-object p4, p0, La81/n;->E:Ljava/lang/Object;

    iput-object p5, p0, La81/n;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p6, p0, La81/n;->w:I

    iput-object p1, p0, La81/n;->x:Ljava/lang/Object;

    iput-object p2, p0, La81/n;->y:Ljava/lang/Object;

    iput-object p3, p0, La81/n;->E:Ljava/lang/Object;

    iput-object p4, p0, La81/n;->z:Ljava/lang/Object;

    iput-object p5, p0, La81/n;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p6, p0, La81/n;->w:I

    iput-object p1, p0, La81/n;->x:Ljava/lang/Object;

    iput-object p2, p0, La81/n;->E:Ljava/lang/Object;

    iput-object p3, p0, La81/n;->y:Ljava/lang/Object;

    iput-object p4, p0, La81/n;->z:Ljava/lang/Object;

    iput-object p5, p0, La81/n;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/BottomSheet;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    iput v0, p0, La81/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La81/n;->x:Ljava/lang/Object;

    iput-object p2, p0, La81/n;->E:Ljava/lang/Object;

    iput-object p3, p0, La81/n;->F:Ljava/lang/Object;

    iput-object p4, p0, La81/n;->y:Ljava/lang/Object;

    iput-object p5, p0, La81/n;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 5
    const/4 v0, 0x7

    iput v0, p0, La81/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La81/n;->E:Ljava/lang/Object;

    iput-object p2, p0, La81/n;->x:Ljava/lang/Object;

    iput-object p3, p0, La81/n;->y:Ljava/lang/Object;

    iput-object p4, p0, La81/n;->z:Ljava/lang/Object;

    iput-object p5, p0, La81/n;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, La81/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwt2/q$c;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/lazy/a;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lyt2/m;->e(Lwt2/q$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lec3/h2;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, La81/n;->E:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, La81/n;->F:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroid/view/LayoutInflater;

    check-cast p2, Landroid/view/ViewGroup;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "layoutInflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Liz/d;->a(Landroid/view/LayoutInflater;)Liz/d;

    move-result-object p1

    iget-object p2, p1, Liz/d;->c:Landroidx/appcompat/widget/Toolbar;

    const p3, 0x7f080807

    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    new-instance p3, Lb30/q1;

    const/4 v2, 0x3

    invoke-direct {p3, v1, v2}, Lb30/q1;-><init>(Lc93/a;I)V

    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p3, 0x7f14107b

    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    move-object p2, v1

    new-instance v1, Ls40/u0;

    new-instance v6, Lwz/h1;

    const/4 p3, 0x3

    invoke-direct {v6, p3}, Lwz/h1;-><init>(I)V

    new-instance v7, Lpy0/a;

    const/16 p3, 0x18

    invoke-direct {v7, p2, p3}, Lpy0/a;-><init>(Lc93/a;I)V

    sget-object v2, Lqy/e;->b:Lqy/d;

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Ls40/u0;-><init>(Lqy/d;Lec3/h2;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p1, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p2, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p2, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    iput-object p1, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object p1

    :pswitch_1
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lte0/h$e;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lve0/e;->l(Lte0/h$e;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltz1/b;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll1/w3;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Luz1/h;->a(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luw0/p;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lv41/f$a;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Luw0/n;->i(Luw0/p;Lbc3/c0;Lv41/f$a;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnl0/j;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnl0/f;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lsl0/y0;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/lazy/a;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lsl0/r3;->h(Lnl0/j;Lnl0/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lsl0/y0;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnp2/c$a;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lpp2/e;->h(Lnp2/c$a;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lot2/m;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnt2/c;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lmt2/f;

    move-object v6, p1

    check-cast v6, Leb/q;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lmt2/e;->d(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llf2/k;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg1/s0;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lmf2/f;->u(Llf2/k;Lg1/s0;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lld0/g;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lld0/h;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/Set;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Llf0/b2;->h(Lld0/g;Lld0/h;Lkotlin/jvm/functions/Function1;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lx21/a;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnl2/c$a;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/a1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lkl2/b;->a(Lx21/a;Lnl2/c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/a1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lgv1/g;->f(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgv1/o;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lgv1/g;->m(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lft1/c$g;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    move-object v7, p2

    check-cast v7, Ljava/util/List;

    move-object v8, p3

    check-cast v8, Ljava/lang/String;

    invoke-static/range {v1 .. v8}, Lgt1/n;->a(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lft1/c$g;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg22/d;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/t2;

    move-object v6, p1

    check-cast v6, Leb/q;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lf22/c;->h(Lg22/d;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbk2/g$c;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Ll0/u;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Ldk2/j;->b(Lbk2/g$c;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Leb/u0;

    move-object v6, p1

    check-cast v6, Leb/q;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->C(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzg0/i;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lch0/v0;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lg1/y3;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lch0/c1;->i(Lzg0/i;Lch0/v0;Lbc3/c0;Lg1/y3;Landroidx/compose/ui/Modifier;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, La81/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, La81/n;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/n;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v0, p0, La81/n;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    iget-object v0, p0, La81/n;->z:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, La81/o;->x(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/BottomSheet;Ljava/util/List;Ljava/util/List;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
