.class public final Ln10/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ly00/g6;

.field public x:Ln10/k;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ln10/k;


# direct methods
.method public constructor <init>(Ln10/k;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/j;->z:Ln10/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln10/j;->y:Ljava/lang/Object;

    iget p1, p0, Ln10/j;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/j;->E:I

    iget-object p1, p0, Ln10/j;->z:Ln10/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Ln10/k;->b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
