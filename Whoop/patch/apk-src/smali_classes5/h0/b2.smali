.class public final Lh0/b2;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/g0;

.field public synthetic F:Ljava/lang/Object;

.field public G:I

.field public w:Ld30/f0;

.field public x:Lkotlin/jvm/internal/g0;

.field public y:Lkotlin/jvm/internal/d0;

.field public z:Lh0/c3;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lh0/b2;->F:Ljava/lang/Object;

    iget p1, p0, Lh0/b2;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/b2;->G:I

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Ld30/f0;->b(Ld30/f0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/d0;Lh0/c3;Lkotlin/jvm/internal/g0;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
