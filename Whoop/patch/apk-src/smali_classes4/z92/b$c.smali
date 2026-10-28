.class final Lz92/b$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz92/b;->g(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.store.user.cache.UserInfoCache"
    f = "UserInfoCache.kt"
    l = {
        0x8e,
        0x52,
        0x53
    }
    m = "getUserFromDb"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lz92/b;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lz92/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz92/b;",
            "Lq83/d<",
            "-",
            "Lz92/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz92/b$c;->F:Lz92/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lz92/b$c;->E:Ljava/lang/Object;

    iget p1, p0, Lz92/b$c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz92/b$c;->G:I

    iget-object p1, p0, Lz92/b$c;->F:Lz92/b;

    invoke-static {p1, p0}, Lz92/b;->f(Lz92/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
