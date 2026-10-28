.class final Lzp2/f$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp2/f;->i(Lzp2/c;ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.user.journey.domain.UserJourneyDomainCombiner"
    f = "UserJourneyDomainCombiner.kt"
    l = {
        0x25
    }
    m = "handleRefresh"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzp2/f;


# direct methods
.method public constructor <init>(Lzp2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzp2/f;",
            "Lq83/d<",
            "-",
            "Lzp2/f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzp2/f$b;->z:Lzp2/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lzp2/f$b;->y:Ljava/lang/Object;

    iget p1, p0, Lzp2/f$b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzp2/f$b;->E:I

    iget-object p1, p0, Lzp2/f$b;->z:Lzp2/f;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lzp2/f;->d(Lzp2/f;Lzp2/c;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
