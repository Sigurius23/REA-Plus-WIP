.class public final Lh0/r0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lu2/r;

.field public F:F

.field public synthetic G:Ljava/lang/Object;

.field public H:I

.field public w:Lc93/m;

.field public x:Lu2/b;

.field public y:Lkotlin/jvm/internal/f0;

.field public z:Lan/d;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lh0/r0;->G:Ljava/lang/Object;

    iget p1, p0, Lh0/r0;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/r0;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lh0/z0;->e(Lu2/b;JILh0/u0;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
