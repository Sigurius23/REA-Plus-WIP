.class final Lt92/b$n;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt92/b;->q2(Lt92/b;Lvk0/g;JZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.rearchitect.gatt.WhoopStrapGatt"
    f = "WhoopStrapGatt.kt"
    l = {
        0x242
    }
    m = "sendTaskAndAwaitResponse-JXpvp54$suspendImpl"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lt92/b;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:J

.field z:Z


# direct methods
.method public constructor <init>(Lt92/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt92/b;",
            "Lq83/d<",
            "-",
            "Lt92/b$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt92/b$n;->H:Lt92/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lt92/b$n;->G:Ljava/lang/Object;

    iget p1, p0, Lt92/b$n;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt92/b$n;->I:I

    iget-object v0, p0, Lt92/b$n;->H:Lt92/b;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lt92/b;->q2(Lt92/b;Lvk0/g;JZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
