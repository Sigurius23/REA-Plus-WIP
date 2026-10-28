.class public final Lci/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lbi/t;

.field public x:Lne3/h;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lci/c;->y:Ljava/lang/Object;

    iget p1, p0, Lci/c;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lci/c;->z:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lds/q;->E(Lbi/t;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
