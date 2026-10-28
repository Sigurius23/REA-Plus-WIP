.class public final synthetic Lhd3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:Landroid/graphics/Bitmap;

.field public final synthetic x:Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;

.field public final synthetic y:Llive/hms/video/sdk/HMSPluginResultListener;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;Llive/hms/video/sdk/HMSPluginResultListener;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhd3/a;->w:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lhd3/a;->x:Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;

    iput-object p3, p0, Lhd3/a;->y:Llive/hms/video/sdk/HMSPluginResultListener;

    iput-wide p4, p0, Lhd3/a;->z:J

    iput-wide p6, p0, Lhd3/a;->E:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-wide v3, p0, Lhd3/a;->z:J

    iget-wide v5, p0, Lhd3/a;->E:J

    iget-object v0, p0, Lhd3/a;->w:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lhd3/a;->x:Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;

    iget-object v2, p0, Lhd3/a;->y:Llive/hms/video/sdk/HMSPluginResultListener;

    invoke-static/range {v0 .. v6}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->a(Landroid/graphics/Bitmap;Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;Llive/hms/video/sdk/HMSPluginResultListener;JJ)V

    return-void
.end method
