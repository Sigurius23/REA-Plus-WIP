.class public final synthetic Lcom/mapbox/maps/viewannotation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic w:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;

.field public final synthetic x:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/viewannotation/a;->w:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;

    iput-object p2, p0, Lcom/mapbox/maps/viewannotation/a;->x:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/a;->w:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;

    iget-object v1, p0, Lcom/mapbox/maps/viewannotation/a;->x:Ljava/util/List;

    invoke-static {v0, v1, p1, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->c(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Ljava/util/List;J)V

    return-void
.end method
