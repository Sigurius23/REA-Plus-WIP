.class final Lf70/d0$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/d0;->g(Lu02/a$b$a;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.HwOnlyPermissionsHelper"
    f = "HwOnlyPermissionsHelper.kt"
    l = {
        0x89
    }
    m = "handleSubscriptionStyleHwOnlyError"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lf70/d0;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf70/d0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/d0;",
            "Lq83/d<",
            "-",
            "Lf70/d0$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/d0$e;->G:Lf70/d0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lf70/d0$e;->F:Ljava/lang/Object;

    iget p1, p0, Lf70/d0$e;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/d0$e;->H:I

    iget-object p1, p0, Lf70/d0$e;->G:Lf70/d0;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lf70/d0;->c(Lf70/d0;Lu02/a$b$a;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
