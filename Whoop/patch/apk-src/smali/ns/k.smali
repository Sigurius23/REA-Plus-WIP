.class public final Lns/k;
.super Landroidx/datastore/preferences/protobuf/l;
.source "SourceFile"


# static fields
.field public static final E:Lns/k;

.field public static final F:Lns/k;

.field public static final G:Lns/k;

.field public static final z:Lns/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lns/k;

    const-string v1, "DHKEM_P256_HKDF_SHA256"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/k;->z:Lns/k;

    new-instance v0, Lns/k;

    const-string v1, "DHKEM_P384_HKDF_SHA384"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/k;->E:Lns/k;

    new-instance v0, Lns/k;

    const-string v1, "DHKEM_P521_HKDF_SHA512"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/k;->F:Lns/k;

    new-instance v0, Lns/k;

    const-string v1, "DHKEM_X25519_HKDF_SHA256"

    const/16 v2, 0x20

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/k;->G:Lns/k;

    return-void
.end method
