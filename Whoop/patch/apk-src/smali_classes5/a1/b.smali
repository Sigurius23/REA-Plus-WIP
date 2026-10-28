.class public final synthetic La1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La1/b;La1/e;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput p2, p0, La1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/b;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, La1/b;->w:I

    iput-object p1, p0, La1/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;

    invoke-static {v0, p1}, Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;->A(Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcc2/c;

    check-cast p1, Landroid/webkit/WebView;

    invoke-static {v0, p1}, Lcc2/f;->c(Lcc2/c;Landroid/webkit/WebView;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lc51/s;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lc51/k;->m(Lc51/s;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, La42/a;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->c0(La42/a;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;

    check-cast p1, Lf22/d;

    invoke-static {v0, p1}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->y(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;Lf22/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lc21/d;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Lc21/b;->a(Lc21/d;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lc01/h;

    check-cast p1, Lo0/s;

    invoke-static {v0, p1}, Lc01/e;->b(Lc01/h;Lo0/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lbl2/d;

    check-cast p1, Lpg3/v0;

    invoke-static {v0, p1}, Lbl2/d;->y(Lbl2/d;Lpg3/v0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lbh0/a;

    check-cast p1, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-static {v0, p1}, Lbh0/a;->a(Lbh0/a;Lcom/whoop/ai/chat/models/AIMessage;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lbg/k;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, v0, Lbg/k;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/z;

    iget-object v0, v0, Ll83/z;->w:[S

    aget-short p1, v0, p1

    const v0, 0xffff

    and-int/2addr p1, v0

    const/16 v0, 0x10

    invoke-static {v0}, Lva3/d;->c(I)V

    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_9
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lbd3/t;

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    const-string v1, "node"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlinx/serialization/internal/TaggedEncoder;->getCurrentTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/o1;->D(I)Landroidx/fragment/app/m0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/o1;->Q()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Landroidx/fragment/app/a;

    invoke-direct {v1, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    invoke-virtual {v1, p1}, Landroidx/fragment/app/a;->n(Landroidx/fragment/app/m0;)Landroidx/fragment/app/a;

    invoke-virtual {v1}, Landroidx/fragment/app/a;->l()V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lb3/x2;

    check-cast p1, Lu0/p0;

    const-string v1, "$this$KeyboardActions"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->a()V

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Ln20/u;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Ln20/u;->z:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lb30/q;

    check-cast p1, Li3/z;

    const-string v1, "$this$semantics"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lb30/q;->a:Ly00/i;

    iget-object v0, v0, Ly00/i;->x:Ljava/lang/String;

    invoke-static {v0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lb30/j;

    check-cast p1, Lg/t;

    const-string v1, "$this$addCallback"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lb30/j;->o()Le30/c;

    move-result-object p1

    invoke-virtual {p1}, Le30/c;->t()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lb1/c;

    check-cast p1, Lp1/i0;

    new-instance p1, Lb1/e;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_10
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lzy1/b;

    check-cast p1, Lwy1/a;

    invoke-static {v0, p1}, Laz1/g;->j(Lzy1/b;Lwy1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lxx1/a;

    check-cast p1, Lxx1/b;

    invoke-static {v0, p1}, Lcom/whoop/membership/returns/view/ReturnsFragment;->B(Lxx1/a;Lxx1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lay/v;

    check-cast p1, Ls40/a;

    const-string v1, "host"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lay/v;->d:Lj/d;

    if-eqz v0, :cond_3

    new-instance p1, Lay/y;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lay/y;-><init>(Lj/d;I)V

    goto :goto_1

    :cond_3
    new-instance v0, Lay/x;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lay/x;-><init>(Ls40/a;I)V

    move-object p1, v0

    :goto_1
    return-object p1

    :pswitch_13
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lbh3/b;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Las2/a;->a(Lbh3/b;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lyp1/b$c;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Laq1/f;->c(Lyp1/b$c;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/ContentResolver;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Laq0/q;->i0(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/room/n0;

    check-cast p1, Lub/a;

    const-string v1, "db"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Landroidx/room/n0;->h:Lub/a;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lyd1/b;

    check-cast p1, Lyd1/a;

    invoke-static {v0, p1}, Lcom/whoop/edit/view/EditActivityFragment;->y(Lyd1/b;Lyd1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Laa2/f;

    check-cast p1, Lq83/d;

    invoke-static {v0, p1}, Laa2/f;->i(Laa2/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    check-cast p1, Ly00/c8;

    new-instance v1, Lz10/n;

    new-instance v2, Lz10/m;

    invoke-direct {v2, v0}, Lz10/m;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    const/4 v0, 0x0

    invoke-direct {v1, p1, v2, v0}, Lz10/n;-><init>(Ly00/c8;Lz10/m;Lz10/l;)V

    return-object v1

    :pswitch_1a
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, Lw0/a;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, La1/b;

    check-cast p1, La3/p2;

    instance-of v1, p1, La1/a;

    if-eqz v1, :cond_4

    check-cast p1, La1/a;

    iget-object p1, p1, La1/a;->O:La1/b;

    invoke-virtual {v0, p1}, La1/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1c
    iget-object v0, p0, La1/b;->x:Ljava/lang/Object;

    check-cast v0, La1/c;

    check-cast p1, Lw0/a;

    iget-object v1, v0, La1/c;->Q:Lc93/m;

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-static {v0, v2}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
