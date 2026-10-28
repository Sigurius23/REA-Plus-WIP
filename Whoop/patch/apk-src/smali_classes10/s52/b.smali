.class public final synthetic Ls52/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:Lcom/whoop/realtime/service/b;

.field public final synthetic x:Lbh3/b;

.field public final synthetic y:Lp92/e;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/service/b;Lbh3/b;Lp92/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls52/b;->w:Lcom/whoop/realtime/service/b;

    iput-object p2, p0, Ls52/b;->x:Lbh3/b;

    iput-object p3, p0, Ls52/b;->y:Lp92/e;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ls52/b;->y:Lp92/e;

    check-cast p1, Lcom/whoop/realtime/service/RealTimeActivityService;

    iget-object v1, p0, Ls52/b;->w:Lcom/whoop/realtime/service/b;

    iget-object v2, p0, Ls52/b;->x:Lbh3/b;

    invoke-static {v1, v2, v0, p1}, Lcom/whoop/realtime/service/b;->g(Lcom/whoop/realtime/service/b;Lbh3/b;Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void
.end method
