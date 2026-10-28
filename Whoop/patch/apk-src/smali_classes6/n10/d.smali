.class public final Ln10/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/String;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ln10/g;

.field public H:I

.field public w:Ln10/g;

.field public x:Ly00/c8;

.field public y:Ly00/u;

.field public z:Ly00/p;


# direct methods
.method public constructor <init>(Ln10/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/d;->G:Ln10/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ln10/d;->F:Ljava/lang/Object;

    iget p1, p0, Ln10/d;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/d;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Ln10/d;->G:Ln10/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ln10/g;->d(Ly00/c8;Ly00/u;Ly00/p;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
