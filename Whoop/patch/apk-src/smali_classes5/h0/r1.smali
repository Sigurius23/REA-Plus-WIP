.class public final Lh0/r1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lu2/v;

.field public x:Lc93/m;

.field public y:Lq83/j;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/r1;->z:Ljava/lang/Object;

    iget p1, p0, Lh0/r1;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/r1;->E:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lh0/q3;->m(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
