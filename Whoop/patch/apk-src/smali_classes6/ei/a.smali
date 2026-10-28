.class public final Lei/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Lud3/l0;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lei/a;->y:Ljava/lang/Object;

    iget p1, p0, Lei/a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lei/a;->z:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Lei/b;->a(Lud3/l0;Lbi/r;Lbi/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
