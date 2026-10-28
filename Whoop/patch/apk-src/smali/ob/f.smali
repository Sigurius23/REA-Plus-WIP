.class public final Lob/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public F:I

.field public w:Landroidx/room/z0;

.field public x:Lkotlin/jvm/functions/Function1;

.field public y:Z

.field public z:Z


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lob/f;->E:Ljava/lang/Object;

    iget p1, p0, Lob/f;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lob/f;->F:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p1, p0}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
