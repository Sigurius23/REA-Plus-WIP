.class final Lf70/m0$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/m0;->i(Lf70/q0;Ld70/c;ZLcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler"
    f = "LoginClickedHandler.kt"
    l = {
        0xb3
    }
    m = "handleExistingUser"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lf70/m0;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lf70/m0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/m0;",
            "Lq83/d<",
            "-",
            "Lf70/m0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/m0$d;->F:Lf70/m0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lf70/m0$d;->E:Ljava/lang/Object;

    iget p1, p0, Lf70/m0$d;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/m0$d;->G:I

    iget-object v0, p0, Lf70/m0$d;->F:Lf70/m0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lf70/m0;->d(Lf70/m0;Lf70/q0;Ld70/c;ZLcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
