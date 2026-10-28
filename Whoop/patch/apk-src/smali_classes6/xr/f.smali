.class public final Lxr/f;
.super Lxr/g;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lxr/g;

.field public final transient y:I

.field public final transient z:I


# direct methods
.method public constructor <init>(Lxr/g;II)V
    .locals 0

    iput-object p1, p0, Lxr/f;->E:Lxr/g;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput p2, p0, Lxr/f;->y:I

    iput p3, p0, Lxr/f;->z:I

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 2

    iget-object v0, p0, Lxr/f;->E:Lxr/g;

    invoke-virtual {v0}, Lxr/d;->d()I

    move-result v0

    iget v1, p0, Lxr/f;->y:I

    add-int/2addr v0, v1

    iget v1, p0, Lxr/f;->z:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final d()I
    .locals 2

    iget-object v0, p0, Lxr/f;->E:Lxr/g;

    invoke-virtual {v0}, Lxr/d;->d()I

    move-result v0

    iget v1, p0, Lxr/f;->y:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxr/f;->E:Lxr/g;

    invoke-virtual {v0}, Lxr/d;->e()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f(II)Lxr/g;
    .locals 1

    iget v0, p0, Lxr/f;->z:I

    invoke-static {p1, p2, v0}, Lrg/j;->d(III)V

    iget v0, p0, Lxr/f;->y:I

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    iget-object v0, p0, Lxr/f;->E:Lxr/g;

    invoke-virtual {v0, p1, p2}, Lxr/g;->f(II)Lxr/g;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxr/f;->z:I

    invoke-static {p1, v0}, Lrg/j;->b(II)V

    iget v0, p0, Lxr/f;->y:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lxr/f;->E:Lxr/g;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lxr/f;->z:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxr/f;->f(II)Lxr/g;

    move-result-object p1

    return-object p1
.end method
