.class public abstract Lu0/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/material/datepicker/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/material/datepicker/n;

    sget-object v1, Lq3/q;->a:Lq3/f0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/material/datepicker/n;-><init>(Lq3/r;II)V

    sput-object v0, Lu0/u1;->a:Lcom/google/android/material/datepicker/n;

    return-void
.end method

.method public static final a(Lq3/g0;Ll3/g;)Lq3/e0;
    .locals 8

    invoke-interface {p0, p1}, Lq3/g0;->a(Ll3/g;)Lq3/e0;

    move-result-object p0

    iget-object v0, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lq3/e0;->a:Ll3/g;

    iget-object p0, p0, Lq3/e0;->b:Lq3/r;

    iget-object v2, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x64

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_0

    invoke-interface {p0, v6}, Lq3/r;->x(I)I

    move-result v7

    invoke-static {v7, v2, v6}, Lu0/u1;->b(III)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Lq3/r;->x(I)I

    move-result v4

    invoke-static {v4, v2, v0}, Lu0/u1;->b(III)V

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :goto_1
    if-ge v5, v3, :cond_1

    invoke-interface {p0, v5}, Lq3/r;->n(I)I

    move-result v4

    invoke-static {v4, v0, v5}, Lu0/u1;->c(III)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {p0, v2}, Lq3/r;->n(I)I

    move-result v3

    invoke-static {v3, v0, v2}, Lu0/u1;->c(III)V

    new-instance v0, Lq3/e0;

    new-instance v2, Lcom/google/android/material/datepicker/n;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v3, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v2, p0, p1, v3}, Lcom/google/android/material/datepicker/n;-><init>(Lq3/r;II)V

    invoke-direct {v0, v1, v2}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v0
.end method

.method public static final b(III)V
    .locals 3

    const/4 v0, 0x0

    if-ltz p0, :cond_0

    if-gt p0, p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-nez v0, :cond_1

    const-string v0, " -> "

    const-string v1, " is not in range of transformed text [0, "

    const-string v2, "OffsetMapping.originalToTransformed returned invalid mapping: "

    invoke-static {p2, p0, v2, v0, v1}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static final c(III)V
    .locals 3

    const/4 v0, 0x0

    if-ltz p0, :cond_0

    if-gt p0, p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-nez v0, :cond_1

    const-string v0, " -> "

    const-string v1, " is not in range of original text [0, "

    const-string v2, "OffsetMapping.transformedToOriginal returned invalid mapping: "

    invoke-static {p2, p0, v2, v0, v1}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
