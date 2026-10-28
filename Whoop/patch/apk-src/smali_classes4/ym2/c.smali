.class public final synthetic Lym2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field public final synthetic a:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lym2/c;->a:Lcom/whoop/ui/home/redesign/view/MainActivity;

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    iget-object v0, p0, Lym2/c;->a:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/whoop/ui/home/redesign/view/MainActivity;->o(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;II)Z

    move-result p1

    return p1
.end method
