.class public abstract Leq0/s3;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Landroid/widget/TextView;

.field public final c:Lcom/whoop/ui/WhoopSwitch;

.field protected d:Landroid/graphics/drawable/Drawable;

.field protected e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/TextView;Lcom/whoop/ui/WhoopSwitch;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Leq0/s3;->a:Landroid/widget/ImageView;

    iput-object p5, p0, Leq0/s3;->b:Landroid/widget/TextView;

    iput-object p6, p0, Leq0/s3;->c:Lcom/whoop/ui/WhoopSwitch;

    return-void
.end method


# virtual methods
.method public abstract c(Landroid/graphics/drawable/Drawable;)V
.end method

.method public abstract d(Ljava/lang/String;)V
.end method
