.class public final Lp0/q0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:F

.field public J:F

.field public K:F

.field public synthetic L:Ljava/lang/Object;

.field public M:I

.field public w:Ln0/r;

.field public x:Lkotlin/jvm/internal/b0;

.field public y:Lkotlin/jvm/internal/g0;

.field public z:Lkotlin/jvm/internal/e0;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lp0/q0;->L:Ljava/lang/Object;

    iget p1, p0, Lp0/q0;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp0/q0;->M:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lp0/r0;->a(Ln0/r;IIILy3/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
