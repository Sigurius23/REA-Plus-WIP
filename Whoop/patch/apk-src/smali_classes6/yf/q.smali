.class public final Lyf/q;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lyf/k;

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyf/q;->x:Ljava/lang/Object;

    iget p1, p0, Lyf/q;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyf/q;->y:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lyf/j;->e(Lt9/u;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
