.class final Lpr0/c$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpr0/c;->m(Lec3/m;Ljava/lang/String;Lpr0/b;ZLq83/d;)Ljava/lang/Object;
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
        0x4a,
        0x4b
    }
    m = "handleLoadInitial"
    v = 0x2
.end annotation


# instance fields
.field E:Z

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
            "Lpr0/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpr0/c$f;->G:Lpr0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lpr0/c$f;->F:Ljava/lang/Object;

    iget p1, p0, Lpr0/c$f;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpr0/c$f;->H:I

    iget-object v0, p0, Lpr0/c$f;->G:Lpr0/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lpr0/c;->g(Lpr0/c;Lec3/m;Ljava/lang/String;Lpr0/b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
