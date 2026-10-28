.class final Lod1/b0$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod1/b0;->e(Lpg3/v0;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.domain.UserStateLifecycleObserver"
    f = "UserStateLifecycleObserver.kt"
    l = {
        0x6a
    }
    m = "shouldCorrectToIdle"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lod1/b0;

.field z:I


# direct methods
.method public constructor <init>(Lod1/b0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/b0;",
            "Lq83/d<",
            "-",
            "Lod1/b0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lod1/b0$b;->y:Lod1/b0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lod1/b0$b;->x:Ljava/lang/Object;

    iget p1, p0, Lod1/b0$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lod1/b0$b;->z:I

    iget-object p1, p0, Lod1/b0$b;->y:Lod1/b0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lod1/b0;->c(Lod1/b0;Lpg3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
