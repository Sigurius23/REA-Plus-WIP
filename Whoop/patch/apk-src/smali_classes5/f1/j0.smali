.class public final Lf1/j0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lu2/b;

.field public x:Lf1/j;

.field public y:Lkotlin/jvm/internal/b0;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf1/j0;->z:Ljava/lang/Object;

    iget p1, p0, Lf1/j0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf1/j0;->E:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, Lf1/y0;->k(Lu2/b;Lf1/j;Lab/h0;Lu2/k;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
