.class public final Ld20/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ld20/r;

.field public G:I

.field public w:Ld20/r;

.field public x:Ly00/g7;

.field public y:La30/w0;

.field public z:I


# direct methods
.method public constructor <init>(Ld20/r;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld20/n;->F:Ld20/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld20/n;->E:Ljava/lang/Object;

    iget p1, p0, Ld20/n;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld20/n;->G:I

    iget-object p1, p0, Ld20/n;->F:Ld20/r;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ld20/r;->g(Ly00/g7;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
