.class public final Lx6/w;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lx30/k0;

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx6/w;->x:Ljava/lang/Object;

    iget p1, p0, Lx6/w;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/w;->y:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Ls4/i;->w(Lux/f0;Lx30/k0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
