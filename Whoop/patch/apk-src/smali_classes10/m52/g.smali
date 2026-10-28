.class public abstract Lm52/g;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Landroid/view/View;

.field public final c:Landroid/view/View;

.field public final d:Lcom/whoop/realtime/presentation/views/RealTimeCell;

.field public final e:Lcom/whoop/realtime/presentation/views/RealTimeCell;

.field public final f:Lcom/whoop/realtime/presentation/views/RealTimeCell;

.field public final g:Landroidx/databinding/c0;

.field public final h:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;Lcom/whoop/realtime/presentation/views/RealTimeCell;Lcom/whoop/realtime/presentation/views/RealTimeCell;Lcom/whoop/realtime/presentation/views/RealTimeCell;Landroidx/databinding/c0;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lm52/g;->a:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lm52/g;->b:Landroid/view/View;

    iput-object p6, p0, Lm52/g;->c:Landroid/view/View;

    iput-object p7, p0, Lm52/g;->d:Lcom/whoop/realtime/presentation/views/RealTimeCell;

    iput-object p8, p0, Lm52/g;->e:Lcom/whoop/realtime/presentation/views/RealTimeCell;

    iput-object p9, p0, Lm52/g;->f:Lcom/whoop/realtime/presentation/views/RealTimeCell;

    iput-object p10, p0, Lm52/g;->g:Landroidx/databinding/c0;

    iput-object p11, p0, Lm52/g;->h:Landroid/widget/ImageView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm52/g;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lm52/g;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lm52/g;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lm52/g;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lk52/e;->e:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lm52/g;

    return-object p0
.end method
