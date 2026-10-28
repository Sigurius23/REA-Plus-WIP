.class final Lpr0/c$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpr0/c;->k(Lpr0/b;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor"
    f = "CommunityHighlightsContainerInteractor.kt"
    l = {
        0x8a
    }
    m = "fetchMore"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lpr0/c;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpr0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpr0/c;",
            "Lq83/d<",
            "-",
            "Lpr0/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpr0/c$d;->E:Lpr0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpr0/c$d;->z:Ljava/lang/Object;

    iget p1, p0, Lpr0/c$d;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpr0/c$d;->F:I

    iget-object p1, p0, Lpr0/c$d;->E:Lpr0/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lpr0/c;->b(Lpr0/c;Lpr0/b;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
