.class public final Ll9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IFLq0/y;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Ll9/o;->b:Ljava/lang/Object;

    .line 3
    new-instance p3, Lp1/h1;

    invoke-direct {p3, p1}, Lp1/h1;-><init>(I)V

    .line 4
    iput-object p3, p0, Ll9/o;->c:Ljava/lang/Object;

    .line 5
    new-instance p3, Lp1/g1;

    invoke-direct {p3, p2}, Lp1/g1;-><init>(F)V

    .line 6
    iput-object p3, p0, Ll9/o;->d:Ljava/lang/Object;

    .line 7
    new-instance p2, Lp0/f0;

    const/16 p3, 0x1e

    const/16 v0, 0x64

    invoke-direct {p2, p1, p3, v0}, Lp0/f0;-><init>(III)V

    iput-object p2, p0, Ll9/o;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt9/l;Ljc/b;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Ll9/o;->b:Ljava/lang/Object;

    .line 10
    iput-object p2, p0, Ll9/o;->f:Ljava/lang/Object;

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll9/o;->c:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll9/o;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Ll9/o;->a:Z

    return-void
.end method


# virtual methods
.method public a(I)Lyr/i;
    .locals 5

    iget-object v0, p0, Ll9/o;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyr/i;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Ll9/o;->e:Ljava/lang/Object;

    check-cast v1, Lz8/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ll9/b0;

    if-eqz p1, :cond_5

    const/4 v4, 0x1

    if-eq p1, v4, :cond_4

    const/4 v4, 0x2

    if-eq p1, v4, :cond_3

    const/4 v4, 0x3

    if-eq p1, v4, :cond_2

    const/4 v2, 0x4

    if-ne p1, v2, :cond_1

    new-instance v2, Ll9/m;

    invoke-direct {v2, p0, v1, v4}, Ll9/m;-><init>(Ljava/lang/Object;Lz8/e;I)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unrecognized contentType: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string v1, "androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    new-instance v3, Ll9/n;

    invoke-direct {v3, v2, v1}, Ll9/n;-><init>(ILjava/lang/Class;)V

    :goto_0
    move-object v2, v3

    goto :goto_1

    :cond_3
    const-string v2, "androidx.media3.exoplayer.hls.HlsMediaSource$Factory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    new-instance v3, Ll9/m;

    invoke-direct {v3, v2, v1, v4}, Ll9/m;-><init>(Ljava/lang/Object;Lz8/e;I)V

    goto :goto_0

    :cond_4
    const-string v2, "androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    new-instance v3, Ll9/m;

    invoke-direct {v3, v2, v1, v4}, Ll9/m;-><init>(Ljava/lang/Object;Lz8/e;I)V

    goto :goto_0

    :cond_5
    const-class v4, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v3

    new-instance v4, Ll9/m;

    invoke-direct {v4, v3, v1, v2}, Ll9/m;-><init>(Ljava/lang/Object;Lz8/e;I)V

    move-object v2, v4

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method
