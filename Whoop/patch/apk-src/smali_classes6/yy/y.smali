.class public final Lyy/y;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lwy/a;

.field public x:Lyy/g;

.field public y:Lwy/b;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyy/y;->z:Ljava/lang/Object;

    iget p1, p0, Lyy/y;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyy/y;->E:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, Lyy/q;->e(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
