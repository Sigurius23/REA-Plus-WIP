.class public final synthetic Ls52/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:Lcom/whoop/realtime/service/b;

.field public final synthetic x:Ljava/lang/Long;

.field public final synthetic y:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/service/b;Ljava/lang/Long;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls52/a;->w:Lcom/whoop/realtime/service/b;

    iput-object p2, p0, Ls52/a;->x:Ljava/lang/Long;

    iput-object p3, p0, Ls52/a;->y:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ls52/a;->y:Ljava/lang/Runnable;

    check-cast p1, Lcom/whoop/realtime/service/RealTimeActivityService;

    iget-object v1, p0, Ls52/a;->w:Lcom/whoop/realtime/service/b;

    iget-object v2, p0, Ls52/a;->x:Ljava/lang/Long;

    invoke-static {v1, v2, v0, p1}, Lcom/whoop/realtime/service/b;->e(Lcom/whoop/realtime/service/b;Ljava/lang/Long;Ljava/lang/Runnable;Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void
.end method
