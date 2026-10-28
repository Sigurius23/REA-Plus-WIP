.class final Lmy1/a$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmy1/a;->b(Lmy1/b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.metrics.memory.MemoryPressureHandler"
    f = "MemoryPressureHandler.kt"
    l = {
        0x39,
        0x3f,
        0x47
    }
    m = "emitMetrics"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmy1/a;

.field z:I


# direct methods
.method public constructor <init>(Lmy1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmy1/a;",
            "Lq83/d<",
            "-",
            "Lmy1/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmy1/a$d;->y:Lmy1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmy1/a$d;->x:Ljava/lang/Object;

    iget p1, p0, Lmy1/a$d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmy1/a$d;->z:I

    iget-object p1, p0, Lmy1/a$d;->y:Lmy1/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lmy1/a;->a(Lmy1/a;Lmy1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
