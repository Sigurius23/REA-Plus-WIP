.class public final Li53/n;
.super Li53/s;
.source "SourceFile"


# static fields
.field public static final a:Li53/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li53/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li53/n;->a:Li53/n;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NetworkNotAvailable"

    return-object v0
.end method
