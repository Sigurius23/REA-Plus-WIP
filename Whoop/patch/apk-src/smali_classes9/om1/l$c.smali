.class final Lom1/l$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lom1/l;->x(Lec3/m;Lom1/j$a;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor"
    f = "DayZeroNotificationCardsInteractor.kt"
    l = {
        0xa4,
        0xa5,
        0xa6,
        0xa7,
        0xa8,
        0xa9,
        0xaa,
        0xab,
        0xac,
        0xad,
        0xae,
        0xaf,
        0xb0
    }
    m = "handleCompleteAnimations"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lom1/l;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Z

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lom1/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lom1/l;",
            "Lq83/d<",
            "-",
            "Lom1/l$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lom1/l$c;->E:Lom1/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lom1/l$c;->z:Ljava/lang/Object;

    iget p1, p0, Lom1/l$c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lom1/l$c;->F:I

    iget-object p1, p0, Lom1/l$c;->E:Lom1/l;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lom1/l;->i(Lom1/l;Lec3/m;Lom1/j$a;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
