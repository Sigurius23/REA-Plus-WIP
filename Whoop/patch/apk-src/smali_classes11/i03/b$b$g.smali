.class final Li03/b$b$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li03/b$b;->b(Lcom/whoop/domain/model/Logout;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2"
    f = "WidgetLogoutUpdater.kt"
    l = {
        0x24,
        0x25,
        0x2b,
        0x2c,
        0x31,
        0x32,
        0x37,
        0x38,
        0x3d,
        0x3e,
        0x47,
        0x48,
        0x4d,
        0x4f,
        0x50,
        0x51,
        0x52,
        0x53,
        0x54
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Li03/b$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li03/b$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field L:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li03/b$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li03/b$b<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Li03/b$b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li03/b$b$g;->K:Li03/b$b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li03/b$b$g;->J:Ljava/lang/Object;

    iget p1, p0, Li03/b$b$g;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li03/b$b$g;->L:I

    iget-object p1, p0, Li03/b$b$g;->K:Li03/b$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Li03/b$b;->b(Lcom/whoop/domain/model/Logout;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
