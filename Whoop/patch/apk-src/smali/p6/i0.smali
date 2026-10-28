.class public final Lp6/i0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lp6/g0;

.field public x:Landroid/content/Context;

.field public y:Ljava/util/Iterator;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp6/i0;->z:Ljava/lang/Object;

    iget p1, p0, Lp6/i0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp6/i0;->E:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
