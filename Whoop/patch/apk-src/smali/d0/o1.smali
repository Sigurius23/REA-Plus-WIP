.class public final Ld0/o1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public F:I

.field public w:Ld0/m;

.field public x:Ld0/h;

.field public y:Lkotlin/jvm/functions/Function1;

.field public z:Lkotlin/jvm/internal/g0;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ld0/o1;->E:Ljava/lang/Object;

    iget p1, p0, Ld0/o1;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld0/o1;->F:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Ld0/f;->d(Ld0/m;Ld0/h;JLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
