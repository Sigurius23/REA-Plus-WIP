.class public final Lh0/p0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lu2/r;

.field public x:Lkotlin/jvm/internal/g0;

.field public y:Lkotlin/jvm/internal/b0;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lh0/p0;->z:Ljava/lang/Object;

    iget p1, p0, Lh0/p0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/p0;->E:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, p0}, Lh0/z0;->d(Lu2/b;JLs83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
