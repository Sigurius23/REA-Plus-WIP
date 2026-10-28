.class final Lcp0/q$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/q;->b(FLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollConnection"
    f = "CoachDrawerOverScroll.kt"
    l = {
        0x93
    }
    m = "settle-OhffZ5M"
    v = 0x2
.end annotation


# instance fields
.field w:F

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcp0/q;

.field z:I


# direct methods
.method public constructor <init>(Lcp0/q;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp0/q;",
            "Lq83/d<",
            "-",
            "Lcp0/q$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/q$a;->y:Lcp0/q;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcp0/q$a;->x:Ljava/lang/Object;

    iget p1, p0, Lcp0/q$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcp0/q$a;->z:I

    iget-object p1, p0, Lcp0/q$a;->y:Lcp0/q;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcp0/q;->a(Lcp0/q;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
