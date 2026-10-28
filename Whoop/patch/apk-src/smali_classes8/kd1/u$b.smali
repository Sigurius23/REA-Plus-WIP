.class final Lkd1/u$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd1/u;->g(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.design.util.PdfCacheManager"
    f = "PdfCacheManager.kt"
    l = {
        0x3f
    }
    m = "copyFromUri-gIAlu-s"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lkd1/u;

.field z:I


# direct methods
.method public constructor <init>(Lkd1/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/u;",
            "Lq83/d<",
            "-",
            "Lkd1/u$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkd1/u$b;->y:Lkd1/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lkd1/u$b;->x:Ljava/lang/Object;

    iget p1, p0, Lkd1/u$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkd1/u$b;->z:I

    iget-object p1, p0, Lkd1/u$b;->y:Lkd1/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lkd1/u;->g(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
