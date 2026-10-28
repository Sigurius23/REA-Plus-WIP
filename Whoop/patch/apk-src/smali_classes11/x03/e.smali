.class public final Lx03/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lx03/i;

.field public G:I

.field public w:Lx03/i;

.field public x:Lh0/k2;

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>(Lx03/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lx03/e;->F:Lx03/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lx03/e;->E:Ljava/lang/Object;

    iget p1, p0, Lx03/e;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx03/e;->G:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lx03/e;->F:Lx03/i;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1, v0, p0}, Lx03/i;->d(Lh0/k2;IFLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
