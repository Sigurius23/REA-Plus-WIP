.class public final Lw23/l;
.super Ls83/c;


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I

.field public final synthetic y:Lec3/f1;


# direct methods
.method public constructor <init>(Lec3/f1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lw23/l;->y:Lec3/f1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw23/l;->w:Ljava/lang/Object;

    iget p1, p0, Lw23/l;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw23/l;->x:I

    iget-object p1, p0, Lw23/l;->y:Lec3/f1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lec3/f1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
