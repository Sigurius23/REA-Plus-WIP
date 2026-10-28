.class public final Lp10/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Li10/a;

.field public G:I

.field public w:Li10/a;

.field public x:Lp10/h;

.field public y:Lwz/g0;

.field public z:Lj00/i0;


# direct methods
.method public constructor <init>(Li10/a;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lp10/f;->F:Li10/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp10/f;->E:Ljava/lang/Object;

    iget p1, p0, Lp10/f;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp10/f;->G:I

    iget-object p1, p0, Lp10/f;->F:Li10/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Li10/a;->k(Lp10/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
