.class public final Lpj/g0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public G:I

.field public w:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

.field public x:Lp1/c1;

.field public y:J

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lpj/g0;->F:Ljava/lang/Object;

    iget p1, p0, Lpj/g0;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpj/g0;->G:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-static/range {v0 .. v8}, Lx43/j;->m(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
