.class public final Ls1/a;
.super Lm83/e;
.source "SourceFile"


# instance fields
.field public final w:Lt1/c;

.field public final x:I

.field public final y:I


# direct methods
.method public constructor <init>(Lt1/c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/a;->w:Lt1/c;

    iput p2, p0, Ls1/a;->x:I

    invoke-virtual {p1}, Lm83/a;->a()I

    move-result p1

    invoke-static {p2, p3, p1}, Lv63/b;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Ls1/a;->y:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Ls1/a;->y:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ls1/a;->y:I

    invoke-static {p1, v0}, Lv63/b;->b(II)V

    iget v0, p0, Ls1/a;->x:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ls1/a;->w:Lt1/c;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    iget v0, p0, Ls1/a;->y:I

    invoke-static {p1, p2, v0}, Lv63/b;->d(III)V

    new-instance v0, Ls1/a;

    iget v1, p0, Ls1/a;->x:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Ls1/a;->w:Lt1/c;

    invoke-direct {v0, p2, p1, v1}, Ls1/a;-><init>(Lt1/c;II)V

    return-object v0
.end method
