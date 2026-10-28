.class final Lvh2/e$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/e;->q(Ljk0/d;Lzj0/t$b;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl"
    f = "StrapUnlockServiceImpl.kt"
    l = {
        0xff,
        0x75
    }
    m = "refreshAttempt"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lvh2/e;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lvh2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh2/e;",
            "Lq83/d<",
            "-",
            "Lvh2/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/e$f;->H:Lvh2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lvh2/e$f;->G:Ljava/lang/Object;

    iget p1, p0, Lvh2/e$f;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvh2/e$f;->I:I

    iget-object p1, p0, Lvh2/e$f;->H:Lvh2/e;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lvh2/e;->k(Lvh2/e;Ljk0/d;Lzj0/t$b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
