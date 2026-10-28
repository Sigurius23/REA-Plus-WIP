.class public final Lec3/c0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lkotlin/jvm/internal/g0;

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/c0;->x:Ljava/lang/Object;

    iget p1, p0, Lec3/c0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/c0;->y:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lec3/v;->k(Lec3/l;Lec3/m;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
