.class public final Ld33/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Ld33/h1;

.field public final synthetic x:Ljava/util/Set;

.field public final synthetic y:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld33/v0;->w:Ld33/h1;

    iput-object p2, p0, Ld33/v0;->x:Ljava/util/Set;

    iput-object p3, p0, Ld33/v0;->y:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lorg/webrtc/PeerConnection$IceConnectionState;

    iget-object p1, p0, Ld33/v0;->x:Ljava/util/Set;

    iget-object p2, p0, Ld33/v0;->y:Ljava/util/Set;

    iget-object v0, p0, Ld33/v0;->w:Ld33/h1;

    invoke-static {v0, p1, p2}, Ld33/d1;->f(Ld33/h1;Ljava/util/Set;Ljava/util/Set;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
