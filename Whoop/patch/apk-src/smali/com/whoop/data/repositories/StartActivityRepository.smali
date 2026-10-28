.class public final Lcom/whoop/data/repositories/StartActivityRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0006R$\u0010\r\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/data/repositories/StartActivityRepository;",
        "",
        "Lu92/d;",
        "sharedPreferences",
        "<init>",
        "(Lu92/d;)V",
        "Lu92/d;",
        "",
        "enabledTrackRoute",
        "getTrackRoute",
        "()Z",
        "setTrackRoute",
        "(Z)V",
        "trackRoute",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final sharedPreferences:Lu92/d;


# direct methods
.method public constructor <init>(Lu92/d;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/StartActivityRepository;->sharedPreferences:Lu92/d;

    return-void
.end method


# virtual methods
.method public final getTrackRoute()Z
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/StartActivityRepository;->sharedPreferences:Lu92/d;

    const-string v1, "TrackRoute_On_Or_Off"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final setTrackRoute(Z)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/StartActivityRepository;->sharedPreferences:Lu92/d;

    const-string v1, "TrackRoute_On_Or_Off"

    invoke-virtual {v0, v1, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method
