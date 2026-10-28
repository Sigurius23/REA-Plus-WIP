.class public final synthetic Llive/hms/video/factories/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Llive/hms/video/factories/HappyEyeballsDns;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/net/InetAddress;

.field public final synthetic z:Ljava/net/InetAddress;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/factories/HappyEyeballsDns;Ljava/lang/String;Ljava/net/InetAddress;Ljava/net/InetAddress;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/f;->w:Llive/hms/video/factories/HappyEyeballsDns;

    iput-object p2, p0, Llive/hms/video/factories/f;->x:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/factories/f;->y:Ljava/net/InetAddress;

    iput-object p4, p0, Llive/hms/video/factories/f;->z:Ljava/net/InetAddress;

    iput p5, p0, Llive/hms/video/factories/f;->E:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Llive/hms/video/factories/f;->z:Ljava/net/InetAddress;

    iget v1, p0, Llive/hms/video/factories/f;->E:I

    iget-object v2, p0, Llive/hms/video/factories/f;->w:Llive/hms/video/factories/HappyEyeballsDns;

    iget-object v3, p0, Llive/hms/video/factories/f;->x:Ljava/lang/String;

    iget-object v4, p0, Llive/hms/video/factories/f;->y:Ljava/net/InetAddress;

    invoke-static {v2, v3, v4, v0, v1}, Llive/hms/video/factories/HappyEyeballsDns;->b(Llive/hms/video/factories/HappyEyeballsDns;Ljava/lang/String;Ljava/net/InetAddress;Ljava/net/InetAddress;I)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
