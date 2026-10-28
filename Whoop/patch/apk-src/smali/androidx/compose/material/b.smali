.class public final Landroidx/compose/material/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a0;


# instance fields
.field public final synthetic w:Landroidx/compose/material/DelegatingThemeAwareRippleNode;


# direct methods
.method public constructor <init>(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material/b;->w:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    iget-object v0, p0, Landroidx/compose/material/b;->w:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    invoke-static {v0}, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->a1(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)Li2/a0;

    move-result-object v1

    invoke-interface {v1}, Li2/a0;->a()J

    move-result-wide v1

    const-wide/16 v3, 0x10

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    return-wide v1

    :cond_0
    sget-object v1, Lg1/z4;->a:Lp1/b0;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/y4;

    if-eqz v1, :cond_1

    iget-wide v1, v1, Lg1/y4;->a:J

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    return-wide v1

    :cond_1
    sget-object v1, Lg1/l1;->a:Lp1/b0;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v1, v1, Li2/x;->a:J

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-static {v0, v3}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    invoke-static {v1, v2, v0}, Lse/a;->Z(JZ)J

    move-result-wide v0

    return-wide v0
.end method
