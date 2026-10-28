.class public final synthetic Landroidx/compose/material3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;I)V
    .locals 0

    iput p2, p0, Landroidx/compose/material3/a;->w:I

    iput-object p1, p0, Landroidx/compose/material3/a;->x:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Landroidx/compose/material3/a;->w:I

    iget-object v1, p0, Landroidx/compose/material3/a;->x:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ll1/l3;->a:Lp1/b0;

    invoke-static {v1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/j3;

    sget-object v0, Ll1/k3;->a:Lk1/b;

    return-object v0

    :pswitch_0
    sget-object v0, Ll1/l3;->a:Lp1/b0;

    invoke-static {v1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/j3;

    if-nez v0, :cond_1

    iget-object v0, v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, La3/o;->Y0(La3/n;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    goto :goto_0

    :cond_1
    iget-object v0, v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    if-nez v0, :cond_2

    new-instance v6, Landroidx/compose/material3/b;

    invoke-direct {v6, v1}, Landroidx/compose/material3/b;-><init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V

    new-instance v7, Landroidx/compose/material3/a;

    const/4 v0, 0x1

    invoke-direct {v7, v1, v0}, Landroidx/compose/material3/a;-><init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;I)V

    iget-object v3, v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->Q:Lj0/i;

    iget-boolean v4, v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->R:Z

    iget v5, v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->S:F

    sget-object v0, Lk1/f;->a:Ld0/e2;

    new-instance v2, Lk1/a;

    invoke-direct/range {v2 .. v7}, Landroidx/compose/material/ripple/RippleNode;-><init>(Lj0/i;ZFLi2/a0;Lc93/a;)V

    invoke-virtual {v1, v2}, La3/o;->X0(La3/n;)La3/n;

    iput-object v2, v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->T:Lk1/a;

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
