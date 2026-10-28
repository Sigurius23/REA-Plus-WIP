.class final Li70/a$k;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li70/a;->B(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
        0x6a,
        0x6b
    }
    m = "fetchEnterEmailScreen"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Li70/a;

.field z:I


# direct methods
.method public constructor <init>(Li70/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li70/a;",
            "Lq83/d<",
            "-",
            "Li70/a$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li70/a$k;->y:Li70/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li70/a$k;->x:Ljava/lang/Object;

    iget p1, p0, Li70/a$k;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li70/a$k;->z:I

    iget-object p1, p0, Li70/a$k;->y:Li70/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Li70/a;->j(Li70/a;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
