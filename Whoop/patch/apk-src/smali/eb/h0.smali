.class public final Leb/h0;
.super Leb/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Leb/h0;",
        "Leb/i1;",
        "Leb/n0;",
        "navigation-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Leb/n0;
    .locals 2

    new-instance v0, Leb/n0;

    const-string v1, "permissive"

    invoke-direct {v0, v1}, Leb/n0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final c(Leb/n0;Landroid/os/Bundle;Leb/x0;)Leb/n0;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "navigate is not supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j()Z
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "popBackStack is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
