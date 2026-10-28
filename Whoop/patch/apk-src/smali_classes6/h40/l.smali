.class public final Lh40/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:I

.field public x:I

.field public y:Lkotlin/jvm/functions/Function1;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh40/l;->z:Ljava/lang/Object;

    iget p1, p0, Lh40/l;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh40/l;->E:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lvd/e;->g(ILkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
