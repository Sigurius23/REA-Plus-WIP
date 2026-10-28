.class final Lj31/o$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/o;->b(Lj31/d;JLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.reordable.SpringDragCancelledAnimation"
    f = "DragCancelledAnimation.kt"
    l = {
        0x32,
        0x33
    }
    m = "dragCancelled-d-4ec7I"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:J

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lj31/o;


# direct methods
.method public constructor <init>(Lj31/o;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/o;",
            "Lq83/d<",
            "-",
            "Lj31/o$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj31/o$a;->z:Lj31/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lj31/o$a;->y:Ljava/lang/Object;

    iget p1, p0, Lj31/o$a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj31/o$a;->E:I

    iget-object p1, p0, Lj31/o$a;->z:Lj31/o;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lj31/o;->b(Lj31/d;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
