.class public final Li53/c;
.super Li53/i;
.source "SourceFile"


# static fields
.field public static final a:Li53/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li53/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li53/c;->a:Li53/c;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Disconnected.ByRequest"

    return-object v0
.end method
