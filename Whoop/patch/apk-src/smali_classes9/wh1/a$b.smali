.class final Lwh1/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh1/a;->b(ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.gps.data.repository.RoomGpsStorage"
    f = "RoomGpsStorage.kt"
    l = {
        0x19
    }
    m = "fetchGpsLocation"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lwh1/a;

.field z:I


# direct methods
.method public constructor <init>(Lwh1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh1/a;",
            "Lq83/d<",
            "-",
            "Lwh1/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwh1/a$b;->y:Lwh1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwh1/a$b;->x:Ljava/lang/Object;

    iget p1, p0, Lwh1/a$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwh1/a$b;->z:I

    iget-object p1, p0, Lwh1/a$b;->y:Lwh1/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lwh1/a;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
