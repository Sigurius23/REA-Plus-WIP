.class public abstract Ldv/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/mapbox/maps/module/TelemetryEvent;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/mapbox/maps/module/TelemetryEvent;->Companion:Lcom/mapbox/maps/module/TelemetryEvent$Companion;

    const-string v1, "style/dsl"

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/module/TelemetryEvent$Companion;->create(Ljava/lang/String;)Lcom/mapbox/maps/module/TelemetryEvent;

    move-result-object v0

    sput-object v0, Ldv/b;->a:Lcom/mapbox/maps/module/TelemetryEvent;

    return-void
.end method
