.class final Lpj1/b$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpj1/b;->e(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.healthconnect.repository.HealthConnectRepository"
    f = "HealthConnectRepository.kt"
    l = {
        0x4f
    }
    m = "getHealthConnectGrantedPermissions"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lpj1/b;


# direct methods
.method public constructor <init>(Lpj1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj1/b;",
            "Lq83/d<",
            "-",
            "Lpj1/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpj1/b$c;->z:Lpj1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpj1/b$c;->y:Ljava/lang/Object;

    iget p1, p0, Lpj1/b$c;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpj1/b$c;->E:I

    iget-object p1, p0, Lpj1/b$c;->z:Lpj1/b;

    invoke-virtual {p1, p0}, Lpj1/b;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
