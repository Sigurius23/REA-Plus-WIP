.class public final Lq20/k;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lq20/l;

.field public x:Ljava/lang/Integer;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lq20/k;->z:Ljava/lang/Object;

    iget p1, p0, Lq20/k;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq20/k;->E:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p1, p1, p0}, Lq20/l;->b(Lq20/l;ILjava/lang/Integer;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
