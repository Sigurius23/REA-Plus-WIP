.class final Lw92/b$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw92/b;->e(ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.store.heartdata.HeartDataTableRoom"
    f = "HeartDataTableRoom.kt"
    l = {
        0x35
    }
    m = "count"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lw92/b;

.field z:I


# direct methods
.method public constructor <init>(Lw92/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw92/b;",
            "Lq83/d<",
            "-",
            "Lw92/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw92/b$a;->y:Lw92/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw92/b$a;->x:Ljava/lang/Object;

    iget p1, p0, Lw92/b$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw92/b$a;->z:I

    iget-object p1, p0, Lw92/b$a;->y:Lw92/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lw92/b;->e(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
