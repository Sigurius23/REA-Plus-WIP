.class public final Lug1/a$e$a$a;
.super Ls83/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/a$e$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$$inlined$map$1$2"
    f = "BatteryPackUpdateStrategy.kt"
    l = {
        0x42,
        0x43,
        0x44,
        0x45,
        0x4a,
        0x53,
        0x54,
        0x32
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:I

.field M:I

.field synthetic w:Ljava/lang/Object;

.field x:I

.field y:Ljava/lang/Object;

.field final synthetic z:Lug1/a$e$a;


# direct methods
.method public constructor <init>(Lug1/a$e$a;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lug1/a$e$a$a;->z:Lug1/a$e$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lug1/a$e$a$a;->w:Ljava/lang/Object;

    iget p1, p0, Lug1/a$e$a$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug1/a$e$a$a;->x:I

    iget-object p1, p0, Lug1/a$e$a$a;->z:Lug1/a$e$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lug1/a$e$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
