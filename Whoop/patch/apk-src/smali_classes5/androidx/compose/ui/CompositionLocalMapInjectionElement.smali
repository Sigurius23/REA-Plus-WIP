.class public final Landroidx/compose/ui/CompositionLocalMapInjectionElement;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/CompositionLocalMapInjectionElement;",
        "La3/h1;",
        "Lb2/s;",
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
.field public final w:Lp1/z;


# direct methods
.method public constructor <init>(Lp1/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/CompositionLocalMapInjectionElement;->w:Lp1/z;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 2

    new-instance v0, Lb2/s;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/CompositionLocalMapInjectionElement;->w:Lp1/z;

    iput-object v1, v0, Lb2/s;->O:Lp1/z;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Landroidx/compose/ui/CompositionLocalMapInjectionElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/ui/CompositionLocalMapInjectionElement;

    iget-object p1, p1, Landroidx/compose/ui/CompositionLocalMapInjectionElement;->w:Lp1/z;

    iget-object v0, p0, Landroidx/compose/ui/CompositionLocalMapInjectionElement;->w:Lp1/z;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/CompositionLocalMapInjectionElement;->w:Lp1/z;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 1

    const-string v0, "<Injected CompositionLocalMap>"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lb2/s;

    iget-object v0, p0, Landroidx/compose/ui/CompositionLocalMapInjectionElement;->w:Lp1/z;

    iput-object v0, p1, Lb2/s;->O:Lp1/z;

    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    invoke-virtual {p1, v0}, La3/n0;->z0(Lp1/z;)V

    return-void
.end method
