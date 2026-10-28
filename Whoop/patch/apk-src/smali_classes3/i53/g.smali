.class public final Li53/g;
.super Li53/i;
.source "SourceFile"


# static fields
.field public static final a:Li53/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li53/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li53/g;->a:Li53/g;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Disconnected.Stopped"

    return-object v0
.end method
