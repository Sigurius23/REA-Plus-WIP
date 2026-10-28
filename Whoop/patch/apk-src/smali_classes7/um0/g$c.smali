.class final Lum0/g$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum0/g;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.cache.persistence.RoomPersistentCache"
    f = "RoomPersistentCache.kt"
    l = {
        0x21
    }
    m = "evictWithUri"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lum0/g;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lum0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum0/g;",
            "Lq83/d<",
            "-",
            "Lum0/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lum0/g$c;->G:Lum0/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lum0/g$c;->F:Ljava/lang/Object;

    iget p1, p0, Lum0/g$c;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lum0/g$c;->H:I

    iget-object p1, p0, Lum0/g$c;->G:Lum0/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lum0/g;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
