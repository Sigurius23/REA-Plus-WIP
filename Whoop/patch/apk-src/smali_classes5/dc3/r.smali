.class public final Ldc3/r;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lc93/a;

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldc3/r;->x:Ljava/lang/Object;

    iget p1, p0, Ldc3/r;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldc3/r;->y:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
