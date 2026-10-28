.class public final Lec3/p;
.super Ls83/c;


# instance fields
.field public E:Lec3/m;

.field public F:I

.field public G:I

.field public synthetic w:Ljava/lang/Object;

.field public x:I

.field public final synthetic y:Lbm/g;

.field public z:Lbm/g;


# direct methods
.method public constructor <init>(Lbm/g;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lec3/p;->y:Lbm/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/p;->w:Ljava/lang/Object;

    iget p1, p0, Lec3/p;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/p;->x:I

    iget-object p1, p0, Lec3/p;->y:Lbm/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lbm/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
