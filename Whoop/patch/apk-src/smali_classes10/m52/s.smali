.class public abstract Lm52/s;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field public final b:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field public final c:Landroid/widget/ImageView;

.field public final d:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field public final e:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

.field public final f:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;Landroid/widget/ImageView;Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lm52/s;->a:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object p5, p0, Lm52/s;->b:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object p6, p0, Lm52/s;->c:Landroid/widget/ImageView;

    iput-object p7, p0, Lm52/s;->d:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object p8, p0, Lm52/s;->e:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    iput-object p9, p0, Lm52/s;->f:Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm52/s;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lm52/s;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lm52/s;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lm52/s;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lk52/e;->l:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lm52/s;

    return-object p0
.end method
