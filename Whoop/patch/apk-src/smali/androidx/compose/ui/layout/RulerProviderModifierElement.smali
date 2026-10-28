.class final Landroidx/compose/ui/layout/RulerProviderModifierElement;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ModifierNodeInspectableProperties"
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/RulerProviderModifierElement;",
        "La3/h1;",
        "Ly2/o1;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Ly2/q;


# direct methods
.method public constructor <init>(Ly2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/RulerProviderModifierElement;->w:Ly2/q;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Ly2/o1;

    iget-object v1, p0, Landroidx/compose/ui/layout/RulerProviderModifierElement;->w:Ly2/q;

    invoke-direct {v0, v1}, Ly2/o1;-><init>(Ly2/q;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/layout/RulerProviderModifierElement;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/compose/ui/layout/RulerProviderModifierElement;

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_2

    iget-object v2, p1, Landroidx/compose/ui/layout/RulerProviderModifierElement;->w:Ly2/q;

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/layout/RulerProviderModifierElement;->w:Ly2/q;

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/RulerProviderModifierElement;->w:Ly2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Ly2/o1;

    iget-object v0, p1, Ly2/o1;->O:Ly2/q;

    iget-object v1, p0, Landroidx/compose/ui/layout/RulerProviderModifierElement;->w:Ly2/q;

    if-eq v0, v1, :cond_0

    iput-object v1, p1, Ly2/o1;->O:Ly2/q;

    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x7

    invoke-static {p1, v0, v1}, La3/n0;->v0(La3/n0;ZI)V

    :cond_0
    return-void
.end method
