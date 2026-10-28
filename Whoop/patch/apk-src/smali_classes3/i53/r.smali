.class public final Li53/r;
.super Li53/s;
.source "SourceFile"


# static fields
.field public static final a:Li53/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li53/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li53/r;->a:Li53/r;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WebSocketEventLost"

    return-object v0
.end method
