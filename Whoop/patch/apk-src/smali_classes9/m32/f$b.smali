.class final Lm32/f$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm32/f;->b(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.permissions.PushNotificationPermissionRequestValidator"
    f = "PushNotificationPermissionRequestValidator.kt"
    l = {
        0x1a,
        0x20
    }
    m = "shouldRequestForPushNotificationPermission"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lm32/f;

.field F:I

.field w:J

.field x:J

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm32/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm32/f;",
            "Lq83/d<",
            "-",
            "Lm32/f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm32/f$b;->E:Lm32/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm32/f$b;->z:Ljava/lang/Object;

    iget p1, p0, Lm32/f$b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm32/f$b;->F:I

    iget-object p1, p0, Lm32/f$b;->E:Lm32/f;

    invoke-virtual {p1, p0}, Lm32/f;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
