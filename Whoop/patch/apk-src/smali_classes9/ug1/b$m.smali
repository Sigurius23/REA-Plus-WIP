.class final Lug1/b$m;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/b;->i0(ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy"
    f = "DefaultUpdateStrategy.kt"
    l = {
        0x179,
        0x17f,
        0x17f,
        0x183
    }
    m = "sendFwChunks"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lug1/b;

.field F:I

.field w:I

.field x:I

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lug1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/b;",
            "Lq83/d<",
            "-",
            "Lug1/b$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/b$m;->E:Lug1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lug1/b$m;->z:Ljava/lang/Object;

    iget p1, p0, Lug1/b$m;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug1/b$m;->F:I

    iget-object p1, p0, Lug1/b$m;->E:Lug1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lug1/b;->J(Lug1/b;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
