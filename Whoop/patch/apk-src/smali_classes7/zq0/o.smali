.class public final Lzq0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R+\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lzq0/o;",
        "",
        "<init>",
        "()V",
        "Lm91/w;",
        "a",
        "Lm91/w;",
        "b",
        "()Lm91/w;",
        "declared",
        "",
        "<set-?>",
        "Lp1/a1;",
        "c",
        "()I",
        "d",
        "(I)V",
        "measuredHeightPx",
        "chromeHeightPx",
        "community-everyday-stats_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lm91/w;

.field private final b:Lp1/a1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm91/w;

    invoke-direct {v0}, Lm91/w;-><init>()V

    iput-object v0, p0, Lzq0/o;->a:Lm91/w;

    new-instance v0, Lp1/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/h1;-><init>(I)V

    iput-object v0, p0, Lzq0/o;->b:Lp1/a1;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget-object v0, p0, Lzq0/o;->a:Lm91/w;

    invoke-virtual {v0}, Lm91/w;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_1
    invoke-virtual {p0}, Lzq0/o;->c()I

    move-result v0

    return v0
.end method

.method public final b()Lm91/w;
    .locals 1

    iget-object v0, p0, Lzq0/o;->a:Lm91/w;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lzq0/o;->b:Lp1/a1;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    return v0
.end method

.method public final d(I)V
    .locals 1

    iget-object v0, p0, Lzq0/o;->b:Lp1/a1;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0, p1}, Lp1/h1;->y(I)V

    return-void
.end method
