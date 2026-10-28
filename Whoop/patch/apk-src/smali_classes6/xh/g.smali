.class public final Lxh/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/List;

.field public F:I

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public I:I

.field public w:Lxh/a;

.field public x:Lfi/i;

.field public y:Lfi/o;

.field public z:Lrh/f;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxh/g;->H:Ljava/lang/Object;

    iget p1, p0, Lxh/g;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxh/g;->I:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, Lsc3/l;->m(Lxh/a;Lfi/i;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
