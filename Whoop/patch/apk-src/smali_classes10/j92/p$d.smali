.class final Lj92/p$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj92/p;->i(Lcom/whoop/domain/model/Session;Lud3/x0;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.network.interceptor.RefreshInterceptorLock"
    f = "RefreshInterceptorLock.kt"
    l = {
        0x11e,
        0x35,
        0x3b,
        0x41,
        0x5f
    }
    m = "getTokenRefreshResult"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field J:I

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lj92/p;

.field M:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj92/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj92/p;",
            "Lq83/d<",
            "-",
            "Lj92/p$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj92/p$d;->L:Lj92/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj92/p$d;->K:Ljava/lang/Object;

    iget p1, p0, Lj92/p$d;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj92/p$d;->M:I

    iget-object p1, p0, Lj92/p$d;->L:Lj92/p;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lj92/p;->d(Lj92/p;Lcom/whoop/domain/model/Session;Lud3/x0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
