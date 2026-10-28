.class final Lo92/j0$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo92/j0;->a(Ljava/lang/String;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.push.notifications.StressMonitorPushNotificationTitleGetter"
    f = "StressMonitorPushNotificationTitleGetter.kt"
    l = {
        0x2f
    }
    m = "getTitleOrDefault"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lo92/j0;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lo92/j0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo92/j0;",
            "Lq83/d<",
            "-",
            "Lo92/j0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo92/j0$a;->F:Lo92/j0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo92/j0$a;->E:Ljava/lang/Object;

    iget p1, p0, Lo92/j0$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo92/j0$a;->G:I

    iget-object p1, p0, Lo92/j0$a;->F:Lo92/j0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lo92/j0;->a(Ljava/lang/String;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
