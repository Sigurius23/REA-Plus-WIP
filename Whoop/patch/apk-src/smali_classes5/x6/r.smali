.class public final Lx6/r;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lx6/d;

.field public F:Lbc3/c2;

.field public G:Lp1/y1;

.field public H:Lp1/w;

.field public synthetic I:Ljava/lang/Object;

.field public J:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lx6/r;->I:Ljava/lang/Object;

    iget p1, p0, Lx6/r;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/r;->J:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Ls4/g;->c(Lx6/u;Landroid/content/Context;Lp6/l;Lx6/t;Lwr1/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
