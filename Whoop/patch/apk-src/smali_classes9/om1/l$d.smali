.class final Lom1/l$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lom1/l;->z(Lec3/m;Lom1/j$a;Lq83/d;)Ljava/lang/Object;
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
        0xb4,
        0xb5,
        0xb6,
        0xb7,
        0xb8,
        0xb9,
        0xba,
        0xbb,
        0xbc,
        0xbd,
        0xbe,
        0xbf,
        0xc0,
        0xc1,
        0xc2,
        0xc3,
        0xc4
    }
    m = "handleGlowAnimation"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lom1/l;


# direct methods
.method public constructor <init>(Lom1/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lom1/l;",
            "Lq83/d<",
            "-",
            "Lom1/l$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lom1/l$d;->z:Lom1/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lom1/l$d;->y:Ljava/lang/Object;

    iget p1, p0, Lom1/l$d;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lom1/l$d;->E:I

    iget-object p1, p0, Lom1/l$d;->z:Lom1/l;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lom1/l;->j(Lom1/l;Lec3/m;Lom1/j$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
