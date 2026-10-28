.class public final Lec3/w;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ljava/lang/Throwable;

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/w;->x:Ljava/lang/Object;

    iget p1, p0, Lec3/w;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/w;->y:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Lec3/v;->e(Lec3/n2;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
