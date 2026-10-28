.class public final Ln10/p0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ln10/r0;

.field public F:I

.field public w:Ln10/r0;

.field public x:Ly00/c8;

.field public y:Ly00/p;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln10/r0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/p0;->E:Ln10/r0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln10/p0;->z:Ljava/lang/Object;

    iget p1, p0, Ln10/p0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/p0;->F:I

    iget-object p1, p0, Ln10/p0;->E:Ln10/r0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Ln10/r0;->b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
