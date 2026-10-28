.class final Lhl2/f$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhl2/f;->p(ILjava/util/List;Lhl2/d;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor"
    f = "HrSettingsInteractor.kt"
    l = {
        0xb3
    }
    m = "handleMaxHrSuccess"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lhl2/f;

.field J:I

.field w:I

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhl2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl2/f;",
            "Lq83/d<",
            "-",
            "Lhl2/f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhl2/f$d;->I:Lhl2/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lhl2/f$d;->H:Ljava/lang/Object;

    iget p1, p0, Lhl2/f$d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhl2/f$d;->J:I

    iget-object p1, p0, Lhl2/f$d;->I:Lhl2/f;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1, p0}, Lhl2/f;->d(Lhl2/f;ILjava/util/List;Lhl2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
