.class public final Lae/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lae/c;->w:Ljava/lang/Object;

    iget p1, p0, Lae/c;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lae/c;->x:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lvd/e;->U(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
