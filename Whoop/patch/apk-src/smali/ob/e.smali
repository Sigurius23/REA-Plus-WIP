.class public final Lob/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Landroidx/room/z0;

.field public x:Lkotlin/jvm/functions/Function1;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lob/e;->y:Ljava/lang/Object;

    iget p1, p0, Lob/e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lob/e;->z:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
