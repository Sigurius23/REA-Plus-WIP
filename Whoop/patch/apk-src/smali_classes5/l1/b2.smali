.class public final Ll1/b2;
.super Lb3/a;
.source "SourceFile"

# interfaces
.implements Lc4/b0;


# instance fields
.field public final J:Landroid/view/Window;

.field public final K:Lp1/k1;

.field public L:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;)V
    .locals 0

    invoke-direct {p0, p1}, Lb3/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll1/b2;->J:Landroid/view/Window;

    sget-object p1, Ll1/q;->a:Lx1/b;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ll1/b2;->K:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p1, Lp1/q;

    const v0, 0x225fdedf

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    and-int/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll1/b2;->K:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/m;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lkk1/b;

    const/16 v1, 0x9

    invoke-direct {v0, p0, p2, v1}, Lkk1/b;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public final getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Ll1/b2;->L:Z

    return v0
.end method

.method public final getWindow()Landroid/view/Window;
    .locals 1

    iget-object v0, p0, Ll1/b2;->J:Landroid/view/Window;

    return-object v0
.end method
