.class public final Lh20/j4;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lh20/k4;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lh20/k4;

.field public z:I


# direct methods
.method public constructor <init>(Lh20/k4;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh20/j4;->y:Lh20/k4;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh20/j4;->x:Ljava/lang/Object;

    iget p1, p0, Lh20/j4;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh20/j4;->z:I

    iget-object p1, p0, Lh20/j4;->y:Lh20/k4;

    invoke-static {p1, p0}, Lh20/k4;->A(Lh20/k4;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
