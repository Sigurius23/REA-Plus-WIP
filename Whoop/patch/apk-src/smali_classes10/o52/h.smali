.class public final synthetic Lo52/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

.field public final synthetic x:Lp92/e;

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo52/h;->w:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iput-object p2, p0, Lo52/h;->x:Lp92/e;

    iput-wide p3, p0, Lo52/h;->y:J

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object v1, p0, Lo52/h;->x:Lp92/e;

    iget-wide v2, p0, Lo52/h;->y:J

    iget-object v0, p0, Lo52/h;->w:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->E(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;JLandroid/content/DialogInterface;I)V

    return-void
.end method
