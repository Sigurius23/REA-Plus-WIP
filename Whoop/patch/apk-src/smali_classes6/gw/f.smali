.class public final Lgw/f;
.super Lgw/a;
.source "SourceFile"


# static fields
.field public static final E:Lgw/f;

.field public static final F:Lgw/f;

.field public static final G:Lgw/f;

.field public static final H:Lgw/f;

.field public static final I:Lgw/f;

.field public static final J:Lgw/f;

.field public static final K:Lgw/f;

.field public static final L:Lgw/f;

.field public static final z:Lgw/f;


# instance fields
.field public final y:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgw/f;

    const-string v1, "A128CBC-HS256"

    const/16 v2, 0x100

    invoke-direct {v0, v1, v2}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->z:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "A192CBC-HS384"

    const/16 v3, 0x180

    invoke-direct {v0, v1, v3}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->E:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "A256CBC-HS512"

    const/16 v3, 0x200

    invoke-direct {v0, v1, v3}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->F:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "A128CBC+HS256"

    invoke-direct {v0, v1, v2}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->G:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "A256CBC+HS512"

    invoke-direct {v0, v1, v3}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->H:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "A128GCM"

    const/16 v3, 0x80

    invoke-direct {v0, v1, v3}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->I:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "A192GCM"

    const/16 v3, 0xc0

    invoke-direct {v0, v1, v3}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->J:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "A256GCM"

    invoke-direct {v0, v1, v2}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->K:Lgw/f;

    new-instance v0, Lgw/f;

    const-string v1, "XC20P"

    invoke-direct {v0, v1, v2}, Lgw/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgw/f;->L:Lgw/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1}, Lgw/a;-><init>(Ljava/lang/String;)V

    iput p2, p0, Lgw/f;->y:I

    return-void
.end method
