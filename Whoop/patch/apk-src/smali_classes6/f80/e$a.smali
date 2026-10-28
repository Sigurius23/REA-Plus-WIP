.class final Lf80/e$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf80/e;->a(Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.passwordmanager.SaveCredentialOnAdvanceUseCase"
    f = "SaveCredentialOnAdvanceUseCase.kt"
    l = {
        0x34
    }
    m = "invoke"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Z

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lf80/e;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf80/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf80/e;",
            "Lq83/d<",
            "-",
            "Lf80/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf80/e$a;->H:Lf80/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lf80/e$a;->G:Ljava/lang/Object;

    iget p1, p0, Lf80/e$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf80/e$a;->I:I

    iget-object v0, p0, Lf80/e$a;->H:Lf80/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lf80/e;->a(Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
