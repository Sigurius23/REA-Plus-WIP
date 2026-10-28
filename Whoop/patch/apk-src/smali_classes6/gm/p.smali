.class public final Lgm/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/e;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lgm/i;

.field public final c:Lgm/q;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lgm/i;Lgm/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/p;->a:Ljava/util/Set;

    iput-object p2, p0, Lgm/p;->b:Lgm/i;

    iput-object p3, p0, Lgm/p;->c:Lgm/q;

    return-void
.end method


# virtual methods
.method public final a(Ldm/c;Lux/f0;)La33/d;
    .locals 3

    iget-object v0, p0, Lgm/p;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, La33/d;

    iget-object v1, p0, Lgm/p;->b:Lgm/i;

    iget-object v2, p0, Lgm/p;->c:Lgm/q;

    invoke-direct {v0, v1, p1, p2, v2}, La33/d;-><init>(Lgm/i;Ldm/c;Lux/f0;Lgm/q;)V

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, "%s is not supported byt this factory. Supported encodings are: %s."

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
