.class public final Lns/i;
.super Landroidx/datastore/preferences/protobuf/l;
.source "SourceFile"


# static fields
.field public static final E:Lns/i;

.field public static final F:Lns/i;

.field public static final z:Lns/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lns/i;

    const-string v1, "AES_128_GCM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/i;->z:Lns/i;

    new-instance v0, Lns/i;

    const-string v1, "AES_256_GCM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/i;->E:Lns/i;

    new-instance v0, Lns/i;

    const-string v1, "CHACHA20_POLY1305"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/i;->F:Lns/i;

    return-void
.end method
