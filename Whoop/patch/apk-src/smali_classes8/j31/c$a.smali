.class final Lj31/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/c;->b(Lu2/v;Lu2/r;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.design.atomic.molecule.reordable.DragGestureKt"
    f = "DragGesture.kt"
    l = {
        0x63
    }
    m = "awaitLongPressOrCancellation"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field synthetic F:Ljava/lang/Object;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lj31/c$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj31/c$a;->F:Ljava/lang/Object;

    iget p1, p0, Lj31/c$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj31/c$a;->G:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lj31/c;->b(Lu2/v;Lu2/r;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
