.class public interface abstract Lou0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lou0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u0016\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJV\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J&\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\u0019H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d\u00c0\u0006\u0003"
    }
    d2 = {
        "Lou0/a;",
        "",
        "",
        "Lpu0/b;",
        "batteryEventsDtoList",
        "Ll83/a0;",
        "insertList",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "serial",
        "",
        "hardwareFamily",
        "pcbaRevision",
        "firmwareMajor",
        "firmwareMinor",
        "firmwarePoint",
        "firmwareExtra",
        "limit",
        "b",
        "(Ljava/lang/String;IIIIIIILq83/d;)Ljava/lang/Object;",
        "type",
        "e",
        "(Lpu0/b;ILq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "a",
        "([JLq83/d;)Ljava/lang/Object;",
        "connectivity-data-packets-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic d(Lou0/a;Lpu0/b;ILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lou0/a;->e(Lpu0/b;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lou0/a;Lpu0/b;ILq83/d;)Ljava/lang/Object;
    .locals 11
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

    invoke-virtual {p1}, Lpu0/b;->b()Lpu0/a;

    move-result-object v0

    invoke-virtual {v0}, Lpu0/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpu0/b;->b()Lpu0/a;

    move-result-object v0

    invoke-virtual {v0}, Lpu0/a;->f()I

    move-result v3

    invoke-virtual {p1}, Lpu0/b;->b()Lpu0/a;

    move-result-object v0

    invoke-virtual {v0}, Lpu0/a;->h()I

    move-result v4

    invoke-virtual {p1}, Lpu0/b;->b()Lpu0/a;

    move-result-object v0

    invoke-virtual {v0}, Lpu0/a;->c()I

    move-result v5

    invoke-virtual {p1}, Lpu0/b;->b()Lpu0/a;

    move-result-object v0

    invoke-virtual {v0}, Lpu0/a;->d()I

    move-result v6

    invoke-virtual {p1}, Lpu0/b;->b()Lpu0/a;

    move-result-object v0

    invoke-virtual {v0}, Lpu0/a;->e()I

    move-result v7

    invoke-virtual {p1}, Lpu0/b;->b()Lpu0/a;

    move-result-object p1

    invoke-virtual {p1}, Lpu0/a;->b()I

    move-result v8

    move-object v1, p0

    move v9, p2

    move-object v10, p3

    invoke-interface/range {v1 .. v10}, Lou0/a;->b(Ljava/lang/String;IIIIIIILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a([JLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;IIIIIIILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIIIIII",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lpu0/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpu0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public e(Lpu0/b;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    invoke-static {p0, p1, p2, p3}, Lou0/a;->f(Lou0/a;Lpu0/b;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpu0/b;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
