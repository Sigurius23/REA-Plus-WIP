.class public final Lc20/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lc20/n;

.field public G:I

.field public w:Lc20/n;

.field public x:Ls40/a;

.field public y:Ly00/c8;

.field public z:Lyy/f;


# direct methods
.method public constructor <init>(Lc20/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lc20/l;->F:Lc20/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lc20/l;->E:Ljava/lang/Object;

    iget p1, p0, Lc20/l;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lc20/l;->G:I

    iget-object p1, p0, Lc20/l;->F:Lc20/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lc20/n;->e(Ls40/a;Ly00/c8;Lyy/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
