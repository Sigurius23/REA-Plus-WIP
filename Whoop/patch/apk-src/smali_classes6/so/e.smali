.class public final synthetic Lso/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/b;
.implements Lcq/h;


# static fields
.field public static final synthetic w:Lso/e;

.field public static final synthetic x:Lso/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lso/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lso/e;->w:Lso/e;

    new-instance v0, Lso/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lso/e;->x:Lso/e;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "notification_data"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    if-eqz p1, :cond_0

    new-instance v0, Lso/a;

    invoke-direct {v0, p1}, Lso/a;-><init>(Landroid/content/Intent;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public i(Ljava/lang/Object;)Lcq/u;
    .locals 1

    check-cast p1, Landroid/os/Bundle;

    sget v0, Lso/b;->h:I

    if-eqz p1, :cond_0

    const-string v0, "google.messenger"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p1

    return-object p1
.end method
