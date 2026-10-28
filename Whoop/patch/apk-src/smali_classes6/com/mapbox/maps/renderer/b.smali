.class public final synthetic Lcom/mapbox/maps/renderer/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/util/concurrent/locks/Condition;

.field public final synthetic w:Ljava/util/concurrent/locks/ReentrantLock;

.field public final synthetic x:Lkotlin/jvm/internal/g0;

.field public final synthetic y:Lcom/mapbox/maps/renderer/MapboxRenderer;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/g0;Lcom/mapbox/maps/renderer/MapboxRenderer;ZLjava/util/concurrent/locks/Condition;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/b;->w:Ljava/util/concurrent/locks/ReentrantLock;

    iput-object p2, p0, Lcom/mapbox/maps/renderer/b;->x:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lcom/mapbox/maps/renderer/b;->y:Lcom/mapbox/maps/renderer/MapboxRenderer;

    iput-boolean p4, p0, Lcom/mapbox/maps/renderer/b;->z:Z

    iput-object p5, p0, Lcom/mapbox/maps/renderer/b;->E:Ljava/util/concurrent/locks/Condition;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/b;->z:Z

    iget-object v1, p0, Lcom/mapbox/maps/renderer/b;->E:Ljava/util/concurrent/locks/Condition;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/b;->w:Ljava/util/concurrent/locks/ReentrantLock;

    iget-object v3, p0, Lcom/mapbox/maps/renderer/b;->x:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lcom/mapbox/maps/renderer/b;->y:Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-static {v2, v3, v4, v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->a(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/g0;Lcom/mapbox/maps/renderer/MapboxRenderer;ZLjava/util/concurrent/locks/Condition;)V

    return-void
.end method
