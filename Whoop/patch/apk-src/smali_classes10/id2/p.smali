.class public final synthetic Lid2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Lcom/whoop/share/view/WhoopShareFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/share/view/WhoopShareFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lid2/p;->a:Lcom/whoop/share/view/WhoopShareFragment;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lid2/p;->a:Lcom/whoop/share/view/WhoopShareFragment;

    invoke-static {v0, p1}, Lcom/whoop/share/view/WhoopShareFragment;->D(Lcom/whoop/share/view/WhoopShareFragment;Landroid/content/DialogInterface;)V

    return-void
.end method
