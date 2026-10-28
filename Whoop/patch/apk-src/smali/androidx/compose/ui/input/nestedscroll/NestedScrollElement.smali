.class final Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;",
        "La3/h1;",
        "Lt2/g;",
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
.field public final w:Lt2/a;

.field public final x:Lt2/d;


# direct methods
.method public constructor <init>(Lt2/a;Lt2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->w:Lt2/a;

    iput-object p2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->x:Lt2/d;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Lt2/g;

    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->w:Lt2/a;

    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->x:Lt2/d;

    invoke-direct {v0, v1, v2}, Lt2/g;-><init>(Lt2/a;Lt2/d;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;

    iget-object v0, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->w:Lt2/a;

    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->w:Lt2/a;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object p1, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->x:Lt2/d;

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->x:Lt2/d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->w:Lt2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->x:Lt2/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "nestedScroll"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v1, "connection"

    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->w:Lt2/a;

    invoke-virtual {v0, v2, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "dispatcher"

    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->x:Lt2/d;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 3

    check-cast p1, Lt2/g;

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->w:Lt2/a;

    iput-object v0, p1, Lt2/g;->O:Lt2/a;

    iget-object v0, p1, Lt2/g;->P:Lt2/d;

    iget-object v1, v0, Lt2/d;->a:Lt2/g;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_0

    iput-object v2, v0, Lt2/d;->a:Lt2/g;

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->x:Lt2/d;

    if-nez v1, :cond_1

    new-instance v0, Lt2/d;

    invoke-direct {v0}, Lt2/d;-><init>()V

    iput-object v0, p1, Lt2/g;->P:Lt2/d;

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v1, p1, Lt2/g;->P:Lt2/d;

    :cond_2
    :goto_0
    iget-boolean v0, p1, Lb2/v;->N:Z

    if-eqz v0, :cond_3

    iget-object v0, p1, Lt2/g;->P:Lt2/d;

    iput-object p1, v0, Lt2/d;->a:Lt2/g;

    iput-object v2, v0, Lt2/d;->b:Lt2/g;

    iput-object v2, p1, Lt2/g;->Q:Lt2/g;

    new-instance v1, La3/l0;

    const/16 v2, 0x14

    invoke-direct {v1, p1, v2}, La3/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Lt2/d;->c:Lkotlin/jvm/internal/m;

    invoke-virtual {p1}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p1

    iput-object p1, v0, Lt2/d;->d:Lbc3/c0;

    :cond_3
    return-void
.end method
