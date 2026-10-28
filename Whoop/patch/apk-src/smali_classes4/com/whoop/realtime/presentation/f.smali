.class public final Lcom/whoop/realtime/presentation/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/f;",
        "",
        "<init>",
        "()V",
        "Landroid/app/Activity;",
        "activity",
        "Llm2/b;",
        "a",
        "(Landroid/app/Activity;)Llm2/b;",
        "realtime-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Llm2/b;
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    sget-object v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->u0:Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;->d(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Llm2/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Llm2/c;-><init>(Z)V

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;->c(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Llm2/c;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Llm2/c;-><init>(Z)V

    return-object p1

    :cond_1
    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;->a(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Llm2/d;

    const-string v1, "sport"

    const-class v2, Lcom/whoop/service/network/model/Sport;

    invoke-static {p1, v1, v2}, Ls4/g;->h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/network/model/Sport;

    invoke-direct {v0, p1}, Llm2/d;-><init>(Lcom/whoop/service/network/model/Sport;)V

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
