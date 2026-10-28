.class public final Lq00/t;
.super Lq00/v;
.source "SourceFile"


# static fields
.field public static final d:Lq00/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq00/t;

    const v1, 0x7f14111e

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    const-string v2, "WALLET_MENU_SET_AS_DEFAULT_TAG"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lq00/v;-><init>(Lzy/b;Ljava/lang/String;Z)V

    sput-object v0, Lq00/t;->d:Lq00/t;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lq00/t;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x34cd6d09    # -1.1703031E7f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SetAsDefault"

    return-object v0
.end method
