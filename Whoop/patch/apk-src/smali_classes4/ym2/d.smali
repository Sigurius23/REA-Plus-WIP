.class public final synthetic Lym2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic a:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lym2/d;->a:Lcom/whoop/ui/home/redesign/view/MainActivity;

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    iget-object v0, p0, Lym2/d;->a:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->v(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;)V

    return-void
.end method
