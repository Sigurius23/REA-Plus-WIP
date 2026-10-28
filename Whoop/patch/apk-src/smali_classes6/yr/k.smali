.class public final Lyr/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/i;


# static fields
.field public static final z:Lb9/o;


# instance fields
.field public final w:Ljava/lang/Object;

.field public volatile x:Lyr/i;

.field public y:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/o;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lb9/o;-><init>(I)V

    sput-object v0, Lyr/k;->z:Lb9/o;

    return-void
.end method

.method public constructor <init>(Lyr/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lyr/k;->w:Ljava/lang/Object;

    iput-object p1, p0, Lyr/k;->x:Lyr/i;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyr/k;->x:Lyr/i;

    sget-object v1, Lyr/k;->z:Lb9/o;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lyr/k;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lyr/k;->x:Lyr/i;

    if-eq v2, v1, :cond_0

    iget-object v2, p0, Lyr/k;->x:Lyr/i;

    invoke-interface {v2}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lyr/k;->y:Ljava/lang/Object;

    iput-object v1, p0, Lyr/k;->x:Lyr/i;

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0

    goto :goto_1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_1
    iget-object v0, p0, Lyr/k;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lyr/k;->x:Lyr/i;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Suppliers.memoize("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lyr/k;->z:Lb9/o;

    if-ne v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "<supplier that returned "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lyr/k;->y:Ljava/lang/Object;

    const-string v3, ">"

    invoke-static {v0, v3, v2}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
