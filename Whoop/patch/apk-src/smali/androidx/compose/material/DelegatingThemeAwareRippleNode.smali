.class final Landroidx/compose/material/DelegatingThemeAwareRippleNode;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/w1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/material/DelegatingThemeAwareRippleNode;",
        "La3/o;",
        "La3/m;",
        "La3/w1;",
        "Li2/a0;",
        "color",
        "Li2/a0;",
        "material"
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
.field public final Q:Lj0/i;

.field public final R:Z

.field public final S:F

.field public T:Lk1/a;

.field private final color:Li2/a0;


# direct methods
.method public constructor <init>(Lj0/i;ZFLi2/a0;)V
    .locals 0

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p1, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->Q:Lj0/i;

    iput-boolean p2, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->R:Z

    iput p3, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->S:F

    iput-object p4, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->color:Li2/a0;

    return-void
.end method

.method public static final synthetic a1(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)Li2/a0;
    .locals 0

    iget-object p0, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->color:Li2/a0;

    return-object p0
.end method


# virtual methods
.method public final C()V
    .locals 2

    new-instance v0, Landroidx/compose/material/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/material/a;-><init>(Landroidx/compose/material/DelegatingThemeAwareRippleNode;I)V

    invoke-static {p0, v0}, La3/g;->l(Lb2/v;Lc93/a;)V

    return-void
.end method

.method public final P0()V
    .locals 2

    new-instance v0, Landroidx/compose/material/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/material/a;-><init>(Landroidx/compose/material/DelegatingThemeAwareRippleNode;I)V

    invoke-static {p0, v0}, La3/g;->l(Lb2/v;Lc93/a;)V

    return-void
.end method
