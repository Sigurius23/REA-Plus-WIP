.class public final Llp/d;
.super Llp/e;
.source "SourceFile"


# instance fields
.field public final synthetic E:Llp/e;

.field public final transient y:I

.field public final transient z:I


# direct methods
.method public constructor <init>(Llp/e;II)V
    .locals 0

    iput-object p1, p0, Llp/d;->E:Llp/e;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput p2, p0, Llp/d;->y:I

    iput p3, p0, Llp/d;->z:I

    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llp/d;->E:Llp/e;

    invoke-virtual {v0}, Llp/a;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Llp/d;->E:Llp/e;

    invoke-virtual {v0}, Llp/a;->c()I

    move-result v0

    iget v1, p0, Llp/d;->y:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final d()I
    .locals 2

    iget-object v0, p0, Llp/d;->E:Llp/e;

    invoke-virtual {v0}, Llp/a;->c()I

    move-result v0

    iget v1, p0, Llp/d;->y:I

    add-int/2addr v0, v1

    iget v1, p0, Llp/d;->z:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final g(II)Llp/e;
    .locals 1

    iget v0, p0, Llp/d;->z:I

    invoke-static {p1, p2, v0}, Ljc/x;->D0(III)V

    iget v0, p0, Llp/d;->y:I

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    iget-object v0, p0, Llp/d;->E:Llp/e;

    invoke-virtual {v0, p1, p2}, Llp/e;->g(II)Llp/e;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llp/d;->z:I

    invoke-static {p1, v0}, Ljc/x;->C0(II)V

    iget v0, p0, Llp/d;->y:I

    add-int/2addr p1, v0

    iget-object v0, p0, Llp/d;->E:Llp/e;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Llp/d;->z:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Llp/d;->g(II)Llp/e;

    move-result-object p1

    return-object p1
.end method
