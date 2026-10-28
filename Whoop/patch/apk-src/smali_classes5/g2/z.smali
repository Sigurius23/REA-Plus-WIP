.class public final Lg2/z;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lg2/x;Lg2/x;Ljava/lang/Object;ILb4/g;I)V
    .locals 0

    .line 1
    iput p6, p0, Lg2/z;->w:I

    iput-object p1, p0, Lg2/z;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg2/z;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg2/z;->F:Ljava/lang/Object;

    iput p4, p0, Lg2/z;->z:I

    iput-object p5, p0, Lg2/z;->E:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/d0;Lh0/k2;Lkotlin/jvm/internal/d0;Lx03/i;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg2/z;->w:I

    .line 2
    iput-object p1, p0, Lg2/z;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg2/z;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg2/z;->F:Ljava/lang/Object;

    iput-object p4, p0, Lg2/z;->E:Ljava/lang/Object;

    iput p5, p0, Lg2/z;->z:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lg2/z;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ld0/k;

    const-string v0, "$this$animateTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, p0, Lg2/z;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/d0;

    iget v3, v2, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v1, v3

    iget-object v3, p0, Lg2/z;->y:Ljava/lang/Object;

    check-cast v3, Lh0/k2;

    invoke-interface {v3, v1}, Lh0/k2;->a(F)F

    move-result v3

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iput v0, v2, Lkotlin/jvm/internal/d0;->w:F

    iget-object v0, p0, Lg2/z;->F:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    invoke-virtual {p1}, Ld0/k;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iput v2, v0, Lkotlin/jvm/internal/d0;->w:F

    iget-object v0, p0, Lg2/z;->E:Ljava/lang/Object;

    check-cast v0, Lx03/i;

    iget-object v2, v0, Lx03/i;->a:Lx03/b;

    invoke-virtual {v2}, Lx03/b;->e()Lx03/c;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Ld0/k;->a()V

    goto :goto_0

    :cond_0
    new-instance v4, Lv20/g;

    iget-object v5, p0, Lg2/z;->y:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Lh0/k2;

    const/4 v10, 0x0

    const/16 v11, 0xb

    const/4 v5, 0x1

    const-class v7, Lh0/k2;

    const-string v8, "scrollBy"

    const-string v9, "scrollBy(F)F"

    invoke-direct/range {v4 .. v11}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget v5, p0, Lg2/z;->z:I

    invoke-static {v0, p1, v2, v5, v4}, Lx03/i;->b(Lx03/i;Ld0/k;Lx03/c;ILkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ld0/k;->a()V

    goto :goto_0

    :cond_1
    sub-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-virtual {p1}, Ld0/k;->a()V

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/e;

    iget-object v0, p0, Lg2/z;->x:Ljava/lang/Object;

    check-cast v0, Lg2/x;

    iget-object v1, p0, Lg2/z;->y:Ljava/lang/Object;

    check-cast v1, Lg2/x;

    invoke-static {v1}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v2

    check-cast v2, Lg2/l;

    iget-object v2, v2, Lg2/l;->h:Lg2/x;

    if-eq v0, v2, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lg2/z;->F:Ljava/lang/Object;

    check-cast v0, Lh2/c;

    iget-object v2, p0, Lg2/z;->E:Ljava/lang/Object;

    check-cast v2, Lb4/g;

    iget v3, p0, Lg2/z;->z:I

    invoke-static {v3, v2, v1, v0}, Lg2/g;->H(ILb4/g;Lg2/x;Lh2/c;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v0, :cond_5

    invoke-interface {p1}, Ly2/e;->a()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    move-object p1, v1

    :goto_2
    return-object p1

    :pswitch_1
    check-cast p1, Ly2/e;

    iget-object v0, p0, Lg2/z;->x:Ljava/lang/Object;

    check-cast v0, Lg2/x;

    iget-object v1, p0, Lg2/z;->y:Ljava/lang/Object;

    check-cast v1, Lg2/x;

    invoke-static {v1}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v2

    check-cast v2, Lg2/l;

    iget-object v2, v2, Lg2/l;->h:Lg2/x;

    if-eq v0, v2, :cond_6

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lg2/z;->F:Ljava/lang/Object;

    check-cast v0, Lg2/x;

    iget-object v2, p0, Lg2/z;->E:Ljava/lang/Object;

    check-cast v2, Lb4/g;

    iget v3, p0, Lg2/z;->z:I

    invoke-static {v1, v0, v3, v2}, Lg2/g;->I(Lg2/x;Lg2/x;ILb4/g;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v0, :cond_8

    invoke-interface {p1}, Ly2/e;->a()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    const/4 p1, 0x0

    goto :goto_4

    :cond_8
    :goto_3
    move-object p1, v1

    :goto_4
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
