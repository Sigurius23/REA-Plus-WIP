.class final Lza2/c$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza2/c;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.settings.banner.SettingsBannerCoordinator"
    f = "SettingsBannerCoordinator.kt"
    l = {
        0x40,
        0x44
    }
    m = "fetchBannerItems"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lza2/c;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lza2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/c;",
            "Lq83/d<",
            "-",
            "Lza2/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lza2/c$d;->F:Lza2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lza2/c$d;->E:Ljava/lang/Object;

    iget p1, p0, Lza2/c$d;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lza2/c$d;->G:I

    iget-object p1, p0, Lza2/c$d;->F:Lza2/c;

    invoke-static {p1, p0}, Lza2/c;->b(Lza2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
