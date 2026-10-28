.class final Lqj1/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj1/a;->j(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectBaseManager"
    f = "HealthConnectBaseManager.kt"
    l = {
        0x78
    }
    m = "tryHealthConnectOperation"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lqj1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqj1/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field z:I


# direct methods
.method public constructor <init>(Lqj1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj1/a<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lqj1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj1/a$c;->y:Lqj1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqj1/a$c;->x:Ljava/lang/Object;

    iget p1, p0, Lqj1/a$c;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqj1/a$c;->z:I

    iget-object p1, p0, Lqj1/a$c;->y:Lqj1/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lqj1/a;->f(Lqj1/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
