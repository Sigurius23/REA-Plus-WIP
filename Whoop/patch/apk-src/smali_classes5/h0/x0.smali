.class public final Lh0/x0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/f0;

.field public synthetic F:Ljava/lang/Object;

.field public G:I

.field public w:Lkotlin/jvm/functions/Function1;

.field public x:Lu2/b;

.field public y:Lh0/d2;

.field public z:Lu2/b;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lh0/x0;->F:Ljava/lang/Object;

    iget p1, p0, Lh0/x0;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/x0;->G:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, p1, p0}, Lh0/z0;->k(Lu2/b;JLd30/d1;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
