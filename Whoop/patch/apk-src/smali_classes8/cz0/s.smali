.class public abstract Lcz0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcz0/s$a;,
        Lcz0/s$b;,
        Lcz0/s$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u0005\u0008\rB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u0082\u0001\u0003\u0014\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcz0/s;",
        "",
        "<init>",
        "()V",
        "Lcz0/q;",
        "c",
        "()Lcz0/q;",
        "",
        "b",
        "()Ljava/lang/String;",
        "id",
        "",
        "La71/a;",
        "a",
        "()Ljava/util/List;",
        "details",
        "",
        "d",
        "()F",
        "x",
        "Lcz0/s$a;",
        "Lcz0/s$b;",
        "Lcz0/s$c;",
        "design_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcz0/s;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La71/a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public final c()Lcz0/q;
    .locals 4

    instance-of v0, p0, Lcz0/s$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcz0/s$a;

    invoke-virtual {v0}, Lcz0/s$a;->e()Lj71/a;

    move-result-object v2

    sget-object v3, Lj71/a;->CENTER_DOT:Lj71/a;

    if-ne v2, v3, :cond_0

    new-instance v1, Lcz0/q;

    invoke-virtual {v0}, Lcz0/s$a;->f()F

    move-result v2

    invoke-virtual {v0}, Lcz0/s$a;->g()F

    move-result v0

    invoke-direct {v1, v2, v0}, Lcz0/q;-><init>(FF)V

    :cond_0
    return-object v1
.end method

.method public abstract d()F
.end method
