.class public final Lp10/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lwz/g0;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Li10/a;

.field public H:I

.field public w:Li10/a;

.field public x:Lp10/h;

.field public y:Lp10/g;

.field public z:Ly00/j5;


# direct methods
.method public constructor <init>(Li10/a;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lp10/e;->G:Li10/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp10/e;->F:Ljava/lang/Object;

    iget p1, p0, Lp10/e;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp10/e;->H:I

    iget-object p1, p0, Lp10/e;->G:Li10/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Li10/a;->j(Lp10/h;Lj00/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
