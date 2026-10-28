.class public final synthetic Lo52/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic w:Lix/a;

.field public final synthetic x:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

.field public final synthetic y:Lp92/e;


# direct methods
.method public synthetic constructor <init>(Lix/a;Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo52/i;->w:Lix/a;

    iput-object p2, p0, Lo52/i;->x:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iput-object p3, p0, Lo52/i;->y:Lp92/e;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    iget-object v0, p0, Lo52/i;->x:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iget-object v1, p0, Lo52/i;->y:Lp92/e;

    iget-object v2, p0, Lo52/i;->w:Lix/a;

    invoke-static {v2, v0, v1, p1}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->G(Lix/a;Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;Landroid/content/DialogInterface;)V

    return-void
.end method
