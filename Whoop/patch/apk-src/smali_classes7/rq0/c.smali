.class public final synthetic Lrq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:Lrq0/d;

.field public final synthetic x:I

.field public final synthetic y:Landroid/widget/ImageView;

.field public final synthetic z:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Lrq0/d;ILandroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq0/c;->w:Lrq0/d;

    iput p2, p0, Lrq0/c;->x:I

    iput-object p3, p0, Lrq0/c;->y:Landroid/widget/ImageView;

    iput-object p4, p0, Lrq0/c;->z:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lrq0/c;->y:Landroid/widget/ImageView;

    iget-object v1, p0, Lrq0/c;->z:Landroid/widget/ImageView;

    iget-object v2, p0, Lrq0/c;->w:Lrq0/d;

    iget v3, p0, Lrq0/c;->x:I

    invoke-static {v2, v3, v0, v1, p1}, Lrq0/d;->t(Lrq0/d;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/view/View;)V

    return-void
.end method
