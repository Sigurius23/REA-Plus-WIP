.class final Lf70/x0$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/x0;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper"
    f = "RemoteValidationHelper.kt"
    l = {
        0x33
    }
    m = "checkUsernameAuthenticated"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lf70/x0;

.field z:I


# direct methods
.method public constructor <init>(Lf70/x0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/x0;",
            "Lq83/d<",
            "-",
            "Lf70/x0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/x0$b;->y:Lf70/x0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf70/x0$b;->x:Ljava/lang/Object;

    iget p1, p0, Lf70/x0$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/x0$b;->z:I

    iget-object p1, p0, Lf70/x0$b;->y:Lf70/x0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lf70/x0;->a(Lf70/x0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
