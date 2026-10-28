.class public final Lec3/c1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lkotlin/jvm/internal/g0;

.field public x:Lec3/x0;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/c1;->y:Ljava/lang/Object;

    iget p1, p0, Lec3/c1;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/c1;->z:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
