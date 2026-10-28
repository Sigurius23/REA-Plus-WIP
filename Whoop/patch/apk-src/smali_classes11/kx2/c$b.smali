.class final Lkx2/c$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkx2/c;->a(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.feature.campaigndetails.commands.CancelTaskCampaignDetailsCommand"
    f = "CancelTaskCampaignDetailsCommand.kt"
    l = {
        0x18,
        0x1a,
        0x1b,
        0x1d
    }
    m = "execute"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkx2/c;

.field F:I

.field w:Z

.field x:Z

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkx2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkx2/c;",
            "Lq83/d<",
            "-",
            "Lkx2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkx2/c$b;->E:Lkx2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lkx2/c$b;->z:Ljava/lang/Object;

    iget p1, p0, Lkx2/c$b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkx2/c$b;->F:I

    iget-object p1, p0, Lkx2/c$b;->E:Lkx2/c;

    invoke-virtual {p1, p0}, Lkx2/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
