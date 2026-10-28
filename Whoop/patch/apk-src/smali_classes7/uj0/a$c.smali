.class final Luj0/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj0/a;->q(Lbc3/i0;Lqj0/h;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ble.manager.WhoopDeviceManagerImpl"
    f = "WhoopDeviceManagerImpl.kt"
    l = {
        0x94
    }
    m = "awaitOutcome"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Luj0/a;


# direct methods
.method public constructor <init>(Luj0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luj0/a;",
            "Lq83/d<",
            "-",
            "Luj0/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luj0/a$c;->z:Luj0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Luj0/a$c;->y:Ljava/lang/Object;

    iget p1, p0, Luj0/a$c;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luj0/a$c;->E:I

    iget-object p1, p0, Luj0/a$c;->z:Luj0/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Luj0/a;->f(Luj0/a;Lbc3/i0;Lqj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
