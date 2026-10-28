.class public abstract Lou0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lou0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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


# direct methods
.method public static a(Lou0/a;Lpu0/b;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lou0/a;",
            "Lpu0/b;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lpu0/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lou0/a;->d(Lou0/a;Lpu0/b;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
