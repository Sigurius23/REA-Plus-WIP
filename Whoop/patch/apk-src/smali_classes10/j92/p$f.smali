.class final Lj92/p$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj92/p;->n(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;
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
        0x67,
        0x72
    }
    m = "updateLocalStorageWith"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lj92/p;


# direct methods
.method public constructor <init>(Lj92/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj92/p;",
            "Lq83/d<",
            "-",
            "Lj92/p$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj92/p$f;->z:Lj92/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj92/p$f;->y:Ljava/lang/Object;

    iget p1, p0, Lj92/p$f;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj92/p$f;->E:I

    iget-object p1, p0, Lj92/p$f;->z:Lj92/p;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lj92/p;->e(Lj92/p;Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
