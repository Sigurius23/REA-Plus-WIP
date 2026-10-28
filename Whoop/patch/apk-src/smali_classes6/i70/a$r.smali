.class final Li70/a$r;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li70/a;->I(Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher"
    f = "ScreenFetchDispatcher.kt"
    l = {
        0x96,
        0x9b
    }
    m = "fetchPostPairingEmailScreen"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Li70/a;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li70/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li70/a;",
            "Lq83/d<",
            "-",
            "Li70/a$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li70/a$r;->G:Li70/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li70/a$r;->F:Ljava/lang/Object;

    iget p1, p0, Li70/a$r;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li70/a$r;->H:I

    iget-object p1, p0, Li70/a$r;->G:Li70/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Li70/a;->q(Li70/a;Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
