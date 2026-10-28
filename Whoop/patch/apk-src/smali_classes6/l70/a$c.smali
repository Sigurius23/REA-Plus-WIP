.class final Ll70/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll70/a;->d(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.experiments.ActivationExperimentsHelper"
    f = "ActivationExperimentsHelper.kt"
    l = {
        0x44
    }
    m = "isPasswordPolicyExperimentTest"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ll70/a;

.field z:I


# direct methods
.method public constructor <init>(Ll70/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll70/a;",
            "Lq83/d<",
            "-",
            "Ll70/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll70/a$c;->y:Ll70/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ll70/a$c;->x:Ljava/lang/Object;

    iget p1, p0, Ll70/a$c;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ll70/a$c;->z:I

    iget-object p1, p0, Ll70/a$c;->y:Ll70/a;

    invoke-virtual {p1, p0}, Ll70/a;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
