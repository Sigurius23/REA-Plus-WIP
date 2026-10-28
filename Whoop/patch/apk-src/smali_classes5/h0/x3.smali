.class public final Lh0/x3;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:F

.field public F:F

.field public G:F

.field public H:J

.field public I:I

.field public J:I

.field public K:I

.field public synthetic L:Ljava/lang/Object;

.field public M:I

.field public w:Lu2/b;

.field public x:Ldc3/l;

.field public y:Lkotlin/jvm/functions/Function1;

.field public z:Lu2/k;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/x3;->L:Ljava/lang/Object;

    iget p1, p0, Lh0/x3;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/x3;->M:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Landroidx/compose/foundation/gestures/c;->b(Lu2/b;Ldc3/h;Leg/j;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
