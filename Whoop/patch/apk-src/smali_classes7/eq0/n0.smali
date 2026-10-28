.class public abstract Leq0/n0;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Lcom/whoop/ui/ThrobberView;

.field public final b:Leq0/y2;

.field public final c:Leq0/t;

.field public final d:Leq0/f0;

.field public final e:Leq0/d0;

.field public final f:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

.field public final g:Landroid/view/View;

.field public final h:Leq0/x;

.field public final i:Landroid/widget/ImageView;

.field public final j:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/whoop/ui/ThrobberView;Leq0/y2;Leq0/t;Leq0/f0;Leq0/d0;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Landroid/view/View;Leq0/x;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/n0;->a:Lcom/whoop/ui/ThrobberView;

    iput-object p5, p0, Leq0/n0;->b:Leq0/y2;

    iput-object p6, p0, Leq0/n0;->c:Leq0/t;

    iput-object p7, p0, Leq0/n0;->d:Leq0/f0;

    iput-object p8, p0, Leq0/n0;->e:Leq0/d0;

    iput-object p9, p0, Leq0/n0;->f:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iput-object p10, p0, Leq0/n0;->g:Landroid/view/View;

    iput-object p11, p0, Leq0/n0;->h:Leq0/x;

    iput-object p12, p0, Leq0/n0;->i:Landroid/widget/ImageView;

    iput-object p13, p0, Leq0/n0;->j:Landroid/widget/TextView;

    return-void
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/n0;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Leq0/n0;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/n0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Leq0/n0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lxp0/b0;->B:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/a0;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Leq0/n0;

    return-object p0
.end method
