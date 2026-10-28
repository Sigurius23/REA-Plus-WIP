.class public final Lh0/m0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:F

.field public synthetic G:Ljava/lang/Object;

.field public H:I

.field public w:Lu2/b;

.field public x:Lu2/l;

.field public y:Lkotlin/jvm/internal/f0;

.field public z:Lan/d;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/m0;->G:Ljava/lang/Object;

    iget p1, p0, Lh0/m0;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/m0;->H:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Lh0/z0;->a(Lu2/b;Lu2/r;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
