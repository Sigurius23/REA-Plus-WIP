.class final Lgk2/h$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk2/h;->g(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.tombstone.Undertaker"
    f = "TombstoneManager.kt"
    l = {
        0x4e,
        0x51,
        0x58,
        0x5f,
        0x70
    }
    m = "fetchReleaseStatus"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lgk2/h;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgk2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk2/h;",
            "Lq83/d<",
            "-",
            "Lgk2/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgk2/h$c;->E:Lgk2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgk2/h$c;->z:Ljava/lang/Object;

    iget p1, p0, Lgk2/h$c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgk2/h$c;->F:I

    iget-object p1, p0, Lgk2/h$c;->E:Lgk2/h;

    invoke-virtual {p1, p0}, Lgk2/h;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
