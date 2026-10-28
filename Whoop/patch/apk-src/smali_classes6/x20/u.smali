.class public final Lx20/u;
.super Ls83/c;


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I

.field public final synthetic y:Lw;


# direct methods
.method public constructor <init>(Lw;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lx20/u;->y:Lw;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx20/u;->w:Ljava/lang/Object;

    iget p1, p0, Lx20/u;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx20/u;->x:I

    iget-object p1, p0, Lx20/u;->y:Lw;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lw;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
