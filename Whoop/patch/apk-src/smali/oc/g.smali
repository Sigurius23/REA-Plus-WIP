.class public abstract Loc/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "NetworkStateTracker"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Loc/g;->a:Ljava/lang/String;

    return-void
.end method

.method public static final a(Landroid/net/NetworkCapabilities;Z)Lmc/e;
    .locals 7

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v3

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    xor-int/lit8 v4, v0, 0x1

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v5

    new-instance v1, Lmc/e;

    move v6, p1

    invoke-direct/range {v1 .. v6}, Lmc/e;-><init>(ZZZZZ)V

    return-object v1
.end method
