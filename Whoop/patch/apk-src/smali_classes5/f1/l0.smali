.class public final Lf1/l0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lu2/b;

.field public x:Lu0/d1;

.field public y:Lu2/r;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf1/l0;->z:Ljava/lang/Object;

    iget p1, p0, Lf1/l0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf1/l0;->E:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Lf1/y0;->l(Lu2/b;Lu0/d1;Lu2/k;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
