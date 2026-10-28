.class public final Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/maps/ViewAnnotationOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private allowOverlap:Ljava/lang/Boolean;

.field private allowOverlapWithPuck:Ljava/lang/Boolean;

.field private allowZElevate:Ljava/lang/Boolean;

.field private annotatedFeature:Lcom/mapbox/maps/AnnotatedFeature;

.field private height:Ljava/lang/Double;

.field private ignoreCameraPadding:Ljava/lang/Boolean;

.field private maxZoom:Ljava/lang/Float;

.field private minZoom:Ljava/lang/Float;

.field private priority:Ljava/lang/Long;

.field private selected:Ljava/lang/Boolean;

.field private variableAnchors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ViewAnnotationAnchorConfig;",
            ">;"
        }
    .end annotation
.end field

.field private visible:Ljava/lang/Boolean;

.field private width:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public allowOverlap(Ljava/lang/Boolean;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->allowOverlap:Ljava/lang/Boolean;

    return-object p0
.end method

.method public allowOverlapWithPuck(Ljava/lang/Boolean;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->allowOverlapWithPuck:Ljava/lang/Boolean;

    return-object p0
.end method

.method public allowZElevate(Ljava/lang/Boolean;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->allowZElevate:Ljava/lang/Boolean;

    return-object p0
.end method

.method public annotatedFeature(Lcom/mapbox/maps/AnnotatedFeature;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->annotatedFeature:Lcom/mapbox/maps/AnnotatedFeature;

    return-object p0
.end method

.method public build()Lcom/mapbox/maps/ViewAnnotationOptions;
    .locals 15

    new-instance v0, Lcom/mapbox/maps/ViewAnnotationOptions;

    iget-object v1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->annotatedFeature:Lcom/mapbox/maps/AnnotatedFeature;

    iget-object v2, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->width:Ljava/lang/Double;

    iget-object v3, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->height:Ljava/lang/Double;

    iget-object v4, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->allowOverlap:Ljava/lang/Boolean;

    iget-object v5, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->allowOverlapWithPuck:Ljava/lang/Boolean;

    iget-object v6, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->allowZElevate:Ljava/lang/Boolean;

    iget-object v7, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->visible:Ljava/lang/Boolean;

    iget-object v8, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->variableAnchors:Ljava/util/List;

    iget-object v9, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->selected:Ljava/lang/Boolean;

    iget-object v10, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->priority:Ljava/lang/Long;

    iget-object v11, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->ignoreCameraPadding:Ljava/lang/Boolean;

    iget-object v12, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->minZoom:Ljava/lang/Float;

    iget-object v13, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->maxZoom:Ljava/lang/Float;

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v14}, Lcom/mapbox/maps/ViewAnnotationOptions;-><init>(Lcom/mapbox/maps/AnnotatedFeature;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Lcom/mapbox/maps/ViewAnnotationOptions$1;)V

    return-object v0
.end method

.method public height(Ljava/lang/Double;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->height:Ljava/lang/Double;

    return-object p0
.end method

.method public ignoreCameraPadding(Ljava/lang/Boolean;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->ignoreCameraPadding:Ljava/lang/Boolean;

    return-object p0
.end method

.method public maxZoom(Ljava/lang/Float;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->maxZoom:Ljava/lang/Float;

    return-object p0
.end method

.method public minZoom(Ljava/lang/Float;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->minZoom:Ljava/lang/Float;

    return-object p0
.end method

.method public priority(Ljava/lang/Long;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->priority:Ljava/lang/Long;

    return-object p0
.end method

.method public selected(Ljava/lang/Boolean;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->selected:Ljava/lang/Boolean;

    return-object p0
.end method

.method public variableAnchors(Ljava/util/List;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ViewAnnotationAnchorConfig;",
            ">;)",
            "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->variableAnchors:Ljava/util/List;

    return-object p0
.end method

.method public visible(Ljava/lang/Boolean;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->visible:Ljava/lang/Boolean;

    return-object p0
.end method

.method public width(Ljava/lang/Double;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->width:Ljava/lang/Double;

    return-object p0
.end method
