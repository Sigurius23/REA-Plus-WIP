.class final Lmm0/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmm0/c;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.cache.CompositeCache"
    f = "CompositeCache.kt"
    l = {
        0x13,
        0x14
    }
    m = "contains"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmm0/c;

.field z:I


# direct methods
.method public constructor <init>(Lmm0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmm0/c;",
            "Lq83/d<",
            "-",
            "Lmm0/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmm0/c$a;->y:Lmm0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmm0/c$a;->x:Ljava/lang/Object;

    iget p1, p0, Lmm0/c$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmm0/c$a;->z:I

    iget-object p1, p0, Lmm0/c$a;->y:Lmm0/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lmm0/c;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
