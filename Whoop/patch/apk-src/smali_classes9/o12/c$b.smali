.class final Lo12/c$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo12/c;->j(Lo12/h;ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.onboarding.story.OnboardingStoryInteractor"
    f = "OnboardingStoryInteractor.kt"
    l = {
        0x91
    }
    m = "handleCompleteOnboarding"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lo12/c;


# direct methods
.method public constructor <init>(Lo12/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo12/c;",
            "Lq83/d<",
            "-",
            "Lo12/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo12/c$b;->z:Lo12/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lo12/c$b;->y:Ljava/lang/Object;

    iget p1, p0, Lo12/c$b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo12/c$b;->E:I

    iget-object p1, p0, Lo12/c$b;->z:Lo12/c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lo12/c;->b(Lo12/c;Lo12/h;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
