.class public final Lc20/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ly00/r7;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lc20/n;

.field public z:I


# direct methods
.method public constructor <init>(Lc20/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lc20/m;->y:Lc20/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lc20/m;->x:Ljava/lang/Object;

    iget p1, p0, Lc20/m;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lc20/m;->z:I

    iget-object p1, p0, Lc20/m;->y:Lc20/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lc20/n;->f(Ly00/r7;Ly00/c8;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
