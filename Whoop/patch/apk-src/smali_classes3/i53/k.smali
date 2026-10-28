.class public final Li53/k;
.super Li53/s;
.source "SourceFile"


# instance fields
.field public final a:Lx43/c;

.field public final b:Lstream/video/sfu/models/WebsocketReconnectStrategy;


# direct methods
.method public constructor <init>(Lx43/c;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V
    .locals 1

    const-string v0, "connectionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li53/k;->a:Lx43/c;

    iput-object p2, p0, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li53/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li53/k;

    iget-object v1, p0, Li53/k;->a:Lx43/c;

    iget-object v3, p1, Li53/k;->a:Lx43/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object p1, p1, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Li53/k;->a:Lx43/c;

    invoke-virtual {v0}, Lx43/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connect(connectionConf="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li53/k;->a:Lx43/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
