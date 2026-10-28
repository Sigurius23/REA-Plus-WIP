.class public final Lo9/g;
.super Lo9/o;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final E:I

.field public final F:I


# direct methods
.method public constructor <init>(ILu8/p0;ILo9/j;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo9/o;-><init>(ILu8/p0;I)V

    iget-boolean p1, p4, Lo9/j;->z:Z

    invoke-static {p5, p1}, Lb9/f;->m(IZ)Z

    move-result p1

    iput p1, p0, Lo9/g;->E:I

    iget-object p1, p0, Lo9/o;->z:Lu8/p;

    iget p2, p1, Lu8/p;->u:I

    const/4 p3, -0x1

    if-eq p2, p3, :cond_1

    iget p1, p1, Lu8/p;->v:I

    if-ne p1, p3, :cond_0

    goto :goto_0

    :cond_0
    mul-int p3, p2, p1

    :cond_1
    :goto_0
    iput p3, p0, Lo9/g;->F:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lo9/g;->E:I

    return v0
.end method

.method public final bridge synthetic b(Lo9/o;)Z
    .locals 0

    check-cast p1, Lo9/g;

    const/4 p1, 0x0

    return p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lo9/g;

    iget v0, p0, Lo9/g;->F:I

    iget p1, p1, Lo9/g;->F:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
