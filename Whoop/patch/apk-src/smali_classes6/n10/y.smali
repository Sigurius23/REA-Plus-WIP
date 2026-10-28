.class public final Ln10/y;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ly00/p;

.field public F:Z

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ln10/z;

.field public I:I

.field public w:Ln10/z;

.field public x:Lh20/u2;

.field public y:Ly00/c8;

.field public z:Le10/t0;


# direct methods
.method public constructor <init>(Ln10/z;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/y;->H:Ln10/z;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Ln10/y;->G:Ljava/lang/Object;

    iget p1, p0, Ln10/y;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/y;->I:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Ln10/y;->H:Ln10/z;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Ln10/z;->g(Lh20/u2;Ly00/c8;Le10/t0;Ly00/p;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
