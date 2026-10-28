.class final Lrv1/a$m;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrv1/a;->B(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.membership.data.repositories.MembershipRepository"
    f = "MembershipRepository.kt"
    l = {
        0x101
    }
    m = "fetchWhoopCommunityOfferV2"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:I

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lrv1/a;


# direct methods
.method public constructor <init>(Lrv1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrv1/a;",
            "Lq83/d<",
            "-",
            "Lrv1/a$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrv1/a$m;->z:Lrv1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lrv1/a$m;->y:Ljava/lang/Object;

    iget p1, p0, Lrv1/a$m;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrv1/a$m;->E:I

    iget-object p1, p0, Lrv1/a$m;->z:Lrv1/a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lrv1/a;->B(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
