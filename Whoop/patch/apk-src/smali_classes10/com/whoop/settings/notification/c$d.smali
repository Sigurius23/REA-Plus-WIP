.class final Lcom/whoop/settings/notification/c$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/notification/c;->k(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.notification.SettingsNotificationInteractor"
    f = "SettingsNotificationInteractor.kt"
    l = {
        0x2f,
        0x3b
    }
    m = "refresh"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/settings/notification/c;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/notification/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/notification/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/notification/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/notification/c$d;->z:Lcom/whoop/settings/notification/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/settings/notification/c$d;->y:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/settings/notification/c$d;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/settings/notification/c$d;->E:I

    iget-object p1, p0, Lcom/whoop/settings/notification/c$d;->z:Lcom/whoop/settings/notification/c;

    invoke-static {p1, p0}, Lcom/whoop/settings/notification/c;->f(Lcom/whoop/settings/notification/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
