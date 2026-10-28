.class public final synthetic Lod1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/g;


# instance fields
.field public final synthetic w:Lod1/f;

.field public final synthetic x:Lcom/whoop/service/network/model/cycles/SleepActivity;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lod1/f;Lcom/whoop/service/network/model/cycles/SleepActivity;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod1/e;->w:Lod1/f;

    iput-object p2, p0, Lod1/e;->x:Lcom/whoop/service/network/model/cycles/SleepActivity;

    iput-boolean p3, p0, Lod1/e;->y:Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lod1/e;->y:Z

    check-cast p1, Lpg3/v0;

    iget-object v1, p0, Lod1/e;->w:Lod1/f;

    iget-object v2, p0, Lod1/e;->x:Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-static {v1, v2, v0, p1}, Lod1/f;->c(Lod1/f;Lcom/whoop/service/network/model/cycles/SleepActivity;ZLpg3/v0;)Lod1/k;

    move-result-object p1

    return-object p1
.end method
