.class public final Lib/s;
.super Landroidx/recyclerview/widget/d;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lib/r;

.field public final synthetic e:I

.field public final synthetic f:Lib/r;

.field public final synthetic g:Landroidx/recyclerview/widget/u;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lib/r;ILib/r;Landroidx/recyclerview/widget/u;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib/s;->d:Lib/r;

    iput p2, p0, Lib/s;->e:I

    iput-object p3, p0, Lib/s;->f:Lib/r;

    iput-object p4, p0, Lib/s;->g:Landroidx/recyclerview/widget/u;

    iput p5, p0, Lib/s;->h:I

    iput p6, p0, Lib/s;->i:I

    return-void
.end method


# virtual methods
.method public final a(II)Z
    .locals 2

    iget v0, p0, Lib/s;->e:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lib/s;->d:Lib/r;

    invoke-virtual {v0, p1}, Lib/r;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lib/s;->f:Lib/r;

    iget v1, v0, Lib/r;->w:I

    add-int/2addr p2, v1

    invoke-virtual {v0, p2}, Lib/r;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lib/s;->g:Landroidx/recyclerview/widget/u;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/u;->areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(II)Z
    .locals 2

    iget v0, p0, Lib/s;->e:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lib/s;->d:Lib/r;

    invoke-virtual {v0, p1}, Lib/r;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lib/s;->f:Lib/r;

    iget v1, v0, Lib/r;->w:I

    add-int/2addr p2, v1

    invoke-virtual {v0, p2}, Lib/r;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lib/s;->g:Landroidx/recyclerview/widget/u;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/u;->areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(II)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lib/s;->e:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lib/s;->d:Lib/r;

    invoke-virtual {v0, p1}, Lib/r;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lib/s;->f:Lib/r;

    iget v1, v0, Lib/r;->w:I

    add-int/2addr p2, v1

    invoke-virtual {v0, p2}, Lib/r;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lib/s;->g:Landroidx/recyclerview/widget/u;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/u;->getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lib/s;->i:I

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lib/s;->h:I

    return v0
.end method
