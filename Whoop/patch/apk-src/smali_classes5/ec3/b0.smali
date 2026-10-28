.class public final Lec3/b0;
.super Ls83/c;


# instance fields
.field public E:Lec3/m;

.field public synthetic w:Ljava/lang/Object;

.field public x:I

.field public final synthetic y:Lec3/a0;

.field public z:Lec3/a0;


# direct methods
.method public constructor <init>(Lec3/a0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lec3/b0;->y:Lec3/a0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/b0;->w:Ljava/lang/Object;

    iget p1, p0, Lec3/b0;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/b0;->x:I

    iget-object p1, p0, Lec3/b0;->y:Lec3/a0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lec3/a0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
