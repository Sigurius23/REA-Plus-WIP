.class final Lum0/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum0/a;->k(Lum0/a;Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.cache.persistence.BffCacheDao"
    f = "BffCacheDao.kt"
    l = {
        0x21,
        0x22,
        0x24
    }
    m = "upsert$suspendImpl"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lum0/a;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lum0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum0/a;",
            "Lq83/d<",
            "-",
            "Lum0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lum0/a$a;->E:Lum0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lum0/a$a;->z:Ljava/lang/Object;

    iget p1, p0, Lum0/a$a;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lum0/a$a;->F:I

    iget-object p1, p0, Lum0/a$a;->E:Lum0/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lum0/a;->k(Lum0/a;Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
