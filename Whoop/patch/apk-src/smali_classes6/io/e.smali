.class public final Lio/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:Z

.field public final x:Z


# direct methods
.method public constructor <init>(Lrm/c0;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p1, p1, Lrm/c0;->z:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lio/e;->w:Z

    invoke-static {p2, v1}, Lio/m;->b(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lio/e;->x:Z

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Lio/e;

    iget-boolean v0, p0, Lio/e;->x:Z

    iget-boolean v1, p1, Lio/e;->x:Z

    sget-object v2, Lzr/y;->a:Lzr/w;

    invoke-virtual {v2, v0, v1}, Lzr/w;->c(ZZ)Lzr/y;

    move-result-object v0

    iget-boolean v1, p0, Lio/e;->w:Z

    iget-boolean p1, p1, Lio/e;->w:Z

    invoke-virtual {v0, v1, p1}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object p1

    invoke-virtual {p1}, Lzr/y;->e()I

    move-result p1

    return p1
.end method
