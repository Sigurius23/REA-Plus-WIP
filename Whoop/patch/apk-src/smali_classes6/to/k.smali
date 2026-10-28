.class public final Lto/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lap/a;

.field public volatile b:Lto/j;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lap/a;

    invoke-direct {v0, p1}, Lap/a;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lto/k;->a:Lap/a;

    new-instance p1, Lto/j;

    const-string v0, "Listener must not be null"

    invoke-static {p2, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Luo/w;->d(Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lto/j;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lto/k;->b:Lto/j;

    return-void
.end method


# virtual methods
.method public final a()Lto/j;
    .locals 1

    iget-object v0, p0, Lto/k;->b:Lto/j;

    return-object v0
.end method
