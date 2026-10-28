.class public final Lo9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/Spatializer$OnSpatializerStateChangedListener;


# instance fields
.field public final synthetic a:Lo9/q;


# direct methods
.method public constructor <init>(Lo9/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/k;->a:Lo9/q;

    return-void
.end method


# virtual methods
.method public final onSpatializerAvailableChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    sget-object p1, Lo9/q;->j:Lzr/v0;

    iget-object p1, p0, Lo9/k;->a:Lo9/q;

    invoke-virtual {p1}, Lo9/q;->O()V

    return-void
.end method

.method public final onSpatializerEnabledChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    sget-object p1, Lo9/q;->j:Lzr/v0;

    iget-object p1, p0, Lo9/k;->a:Lo9/q;

    invoke-virtual {p1}, Lo9/q;->O()V

    return-void
.end method
