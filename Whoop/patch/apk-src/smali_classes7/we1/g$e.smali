.class final Lwe1/g$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe1/g;->u(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.entitlements.EntitlementsRepository"
    f = "EntitlementsRepository.kt"
    l = {
        0x45,
        0x49
    }
    m = "update"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lwe1/g;

.field z:I


# direct methods
.method public constructor <init>(Lwe1/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe1/g;",
            "Lq83/d<",
            "-",
            "Lwe1/g$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwe1/g$e;->y:Lwe1/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwe1/g$e;->x:Ljava/lang/Object;

    iget p1, p0, Lwe1/g$e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwe1/g$e;->z:I

    iget-object p1, p0, Lwe1/g$e;->y:Lwe1/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lwe1/g;->u(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
