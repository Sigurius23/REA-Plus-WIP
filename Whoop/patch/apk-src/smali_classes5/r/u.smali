.class public final Lr/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic w:Lr/v;


# direct methods
.method public constructor <init>(Lr/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/u;->w:Lr/v;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lr/u;->w:Lr/v;

    invoke-virtual {v0}, Lr/v;->c()V

    return-void
.end method
