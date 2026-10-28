.class public final Leb/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final E:Z

.field public final F:I

.field public final w:Leb/n0;

.field public final x:Landroid/os/Bundle;

.field public final y:Z

.field public final z:I


# direct methods
.method public constructor <init>(Leb/n0;Landroid/os/Bundle;ZIZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/l0;->w:Leb/n0;

    iput-object p2, p0, Leb/l0;->x:Landroid/os/Bundle;

    iput-boolean p3, p0, Leb/l0;->y:Z

    iput p4, p0, Leb/l0;->z:I

    iput-boolean p5, p0, Leb/l0;->E:Z

    iput p6, p0, Leb/l0;->F:I

    return-void
.end method


# virtual methods
.method public final a(Leb/l0;)I
    .locals 6

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Leb/l0;->E:Z

    iget-boolean v1, p1, Leb/l0;->y:Z

    iget-object v2, p1, Leb/l0;->x:Landroid/os/Bundle;

    const/4 v3, 0x1

    iget-boolean v4, p0, Leb/l0;->y:Z

    if-eqz v4, :cond_0

    if-nez v1, :cond_0

    return v3

    :cond_0
    const/4 v5, -0x1

    if-nez v4, :cond_1

    if-eqz v1, :cond_1

    return v5

    :cond_1
    iget v1, p0, Leb/l0;->z:I

    iget v4, p1, Leb/l0;->z:I

    sub-int/2addr v1, v4

    if-lez v1, :cond_2

    return v3

    :cond_2
    if-gez v1, :cond_3

    return v5

    :cond_3
    iget-object v1, p0, Leb/l0;->x:Landroid/os/Bundle;

    if-eqz v1, :cond_4

    if-nez v2, :cond_4

    return v3

    :cond_4
    if-nez v1, :cond_5

    if-eqz v2, :cond_5

    return v5

    :cond_5
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    move-result v1

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v2

    sub-int/2addr v1, v2

    if-lez v1, :cond_6

    return v3

    :cond_6
    if-gez v1, :cond_7

    return v5

    :cond_7
    iget-boolean v1, p0, Leb/l0;->E:Z

    if-eqz v1, :cond_8

    if-nez v0, :cond_8

    return v3

    :cond_8
    if-nez v1, :cond_9

    if-eqz v0, :cond_9

    return v5

    :cond_9
    iget v0, p0, Leb/l0;->F:I

    iget p1, p1, Leb/l0;->F:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Leb/l0;

    invoke-virtual {p0, p1}, Leb/l0;->a(Leb/l0;)I

    move-result p1

    return p1
.end method
