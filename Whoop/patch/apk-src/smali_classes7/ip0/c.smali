.class public final synthetic Lip0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic w:Landroid/view/View;

.field public final synthetic x:Lip0/d;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lip0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip0/c;->w:Landroid/view/View;

    iput-object p2, p0, Lip0/c;->x:Lip0/d;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lip0/c;->w:Landroid/view/View;

    iget-object v1, p0, Lip0/c;->x:Lip0/d;

    invoke-static {v0, v1, p1, p2}, Lip0/d;->b(Landroid/view/View;Lip0/d;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
