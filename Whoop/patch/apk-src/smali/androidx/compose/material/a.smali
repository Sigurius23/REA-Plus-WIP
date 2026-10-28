.class public final synthetic Landroidx/compose/material/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/material/DelegatingThemeAwareRippleNode;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material/DelegatingThemeAwareRippleNode;I)V
    .locals 0

    iput p2, p0, Landroidx/compose/material/a;->w:I

    iput-object p1, p0, Landroidx/compose/material/a;->x:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Landroidx/compose/material/a;->w:I

    iget-object v1, p0, Landroidx/compose/material/a;->x:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lg1/z4;->a:Lp1/b0;

    invoke-static {v1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/y4;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg1/y4;->b:Lk1/b;

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lg1/l1;->a:Lp1/b0;

    invoke-static {v1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v2, v0, Li2/x;->a:J

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-static {v1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    invoke-static {v2, v3, v0}, Lse/a;->Y(JZ)Lk1/b;

    move-result-object v0

    :cond_1
    return-object v0

    :pswitch_0
    sget-object v0, Lg1/z4;->a:Lp1/b0;

    invoke-static {v1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/y4;

    if-nez v0, :cond_3

    iget-object v0, v1, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    if-eqz v0, :cond_2

    invoke-virtual {v1, v0}, La3/o;->Y0(La3/n;)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, v1, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    goto :goto_0

    :cond_3
    iget-object v0, v1, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    if-nez v0, :cond_4

    new-instance v6, Landroidx/compose/material/b;

    invoke-direct {v6, v1}, Landroidx/compose/material/b;-><init>(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)V

    new-instance v7, Landroidx/compose/material/a;

    const/4 v0, 0x1

    invoke-direct {v7, v1, v0}, Landroidx/compose/material/a;-><init>(Landroidx/compose/material/DelegatingThemeAwareRippleNode;I)V

    iget-object v3, v1, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->Q:Lj0/i;

    iget-boolean v4, v1, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->R:Z

    iget v5, v1, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->S:F

    sget-object v0, Lk1/f;->a:Ld0/e2;

    new-instance v2, Lk1/a;

    invoke-direct/range {v2 .. v7}, Landroidx/compose/material/ripple/RippleNode;-><init>(Lj0/i;ZFLi2/a0;Lc93/a;)V

    invoke-virtual {v1, v2}, La3/o;->X0(La3/n;)La3/n;

    iput-object v2, v1, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    :cond_4
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
