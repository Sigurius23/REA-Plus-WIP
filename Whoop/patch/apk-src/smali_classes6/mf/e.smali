.class public final Lmf/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/Iterator;

.field public F:Ljava/lang/String;

.field public G:Lmf/c;

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public synthetic L:Ljava/lang/Object;

.field public M:I

.field public w:Lmf/c;

.field public x:Lmf/c;

.field public y:Ljava/util/Iterator;

.field public z:Ljava/lang/String;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmf/e;->L:Ljava/lang/Object;

    iget p1, p0, Lmf/e;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmf/e;->M:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lvp/c;->o0(Lmf/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
