.class public final Ln10/w;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ly00/o4;

.field public F:Ly00/p;

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ln10/z;

.field public K:I

.field public w:Ln10/z;

.field public x:Ly00/c8;

.field public y:Lh20/u2;

.field public z:Le10/v0;


# direct methods
.method public constructor <init>(Ln10/z;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/w;->J:Ln10/z;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, Ln10/w;->I:Ljava/lang/Object;

    iget p1, p0, Ln10/w;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/w;->K:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v0, p0, Ln10/w;->J:Ln10/z;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v9, p0

    invoke-virtual/range {v0 .. v9}, Ln10/z;->c(Ly00/c8;Lh20/u2;Le10/v0;Ly00/o4;ZLy00/p;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
