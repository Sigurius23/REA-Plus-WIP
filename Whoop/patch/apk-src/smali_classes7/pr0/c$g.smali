.class final Lpr0/c$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpr0/c;->o(Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lpr0/b;Lq83/d;)Ljava/lang/Object;
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
        0x61,
        0x62,
        0x67,
        0x68
    }
    m = "handleLoadPage"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lpr0/c;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpr0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpr0/c;",
            "Lq83/d<",
            "-",
            "Lpr0/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpr0/c$g;->G:Lpr0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpr0/c$g;->F:Ljava/lang/Object;

    iget p1, p0, Lpr0/c$g;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpr0/c$g;->H:I

    iget-object p1, p0, Lpr0/c$g;->G:Lpr0/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lpr0/c;->h(Lpr0/c;Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lpr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
