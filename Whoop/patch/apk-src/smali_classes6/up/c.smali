.class public final Lup/c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final w:Lev/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lev/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lro/i;

    const/16 v2, 0xf

    invoke-direct {v1, v0, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Lev/i;->d:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lev/i;->i:Ljava/lang/Object;

    iput-object p0, v0, Lev/i;->e:Ljava/lang/Object;

    iput-object p1, v0, Lev/i;->f:Ljava/lang/Object;

    iput-object p2, v0, Lev/i;->h:Ljava/lang/Object;

    iput-object v0, p0, Lup/c;->w:Lev/i;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method
