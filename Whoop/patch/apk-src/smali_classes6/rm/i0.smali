.class public final Lrm/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/util/List;

.field public final c:Lzr/g0;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lrm/f1;Ljava/util/List;Lzr/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/i0;->a:Landroid/net/Uri;

    iput-object p3, p0, Lrm/i0;->b:Ljava/util/List;

    iput-object p4, p0, Lrm/i0;->c:Lzr/g0;

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p4}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lrm/j0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lrm/j0;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p3}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lzr/d0;->f()Lzr/w0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lrm/i0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lrm/i0;

    iget-object v0, p0, Lrm/i0;->a:Landroid/net/Uri;

    iget-object v1, p1, Lrm/i0;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Llo/y;->a:I

    const/4 v0, 0x0

    invoke-static {v0, v0}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrm/i0;->b:Ljava/util/List;

    iget-object v1, p1, Lrm/i0;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrm/i0;->c:Lzr/g0;

    iget-object p1, p1, Lrm/i0;->c:Lzr/g0;

    invoke-virtual {v0, p1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lrm/i0;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    const v1, 0xe1781

    mul-int/2addr v0, v1

    iget-object v1, p0, Lrm/i0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit16 v1, v1, 0x3c1

    iget-object v0, p0, Lrm/i0;->c:Lzr/g0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
