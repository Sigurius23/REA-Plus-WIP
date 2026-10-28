.class public final Landroidx/compose/material3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a0;


# instance fields
.field public final synthetic w:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/b;->w:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    iget-object v0, p0, Landroidx/compose/material3/b;->w:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    invoke-static {v0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->a1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)Li2/a0;

    move-result-object v1

    invoke-interface {v1}, Li2/a0;->a()J

    move-result-wide v1

    const-wide/16 v3, 0x10

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    return-wide v1

    :cond_0
    sget-object v1, Ll1/l3;->a:Lp1/b0;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/j3;

    if-eqz v1, :cond_1

    iget-wide v1, v1, Ll1/j3;->a:J

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    return-wide v1

    :cond_1
    sget-object v1, Ll1/s;->a:Lp1/b0;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    return-wide v0
.end method
