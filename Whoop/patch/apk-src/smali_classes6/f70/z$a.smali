.class final Lf70/z$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/z;->b(Lf70/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.EnterYourPasswordFetcher"
    f = "EnterYourPasswordFetcher.kt"
    l = {
        0x1e,
        0x1f
    }
    m = "fetchEnterPasswordScreen$activation_release"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lf70/z;

.field z:I


# direct methods
.method public constructor <init>(Lf70/z;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/z;",
            "Lq83/d<",
            "-",
            "Lf70/z$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/z$a;->y:Lf70/z;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf70/z$a;->x:Ljava/lang/Object;

    iget p1, p0, Lf70/z$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/z$a;->z:I

    iget-object p1, p0, Lf70/z$a;->y:Lf70/z;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lf70/z;->b(Lf70/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
