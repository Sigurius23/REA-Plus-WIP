.class public final Lns/j;
.super Landroidx/datastore/preferences/protobuf/l;
.source "SourceFile"


# static fields
.field public static final E:Lns/j;

.field public static final F:Lns/j;

.field public static final z:Lns/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lns/j;

    const-string v1, "HKDF_SHA256"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/j;->z:Lns/j;

    new-instance v0, Lns/j;

    const-string v1, "HKDF_SHA384"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/j;->E:Lns/j;

    new-instance v0, Lns/j;

    const-string v1, "HKDF_SHA512"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lns/j;->F:Lns/j;

    return-void
.end method
