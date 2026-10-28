.class public final Llive/hms/video/sdk/PermissionsHandlers;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/PermissionsHandlers$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J,\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u001c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/sdk/PermissionsHandlers;",
        "",
        "Llive/hms/video/audio/BluetoothPermissionHandler;",
        "bluetoothPermissionHandler",
        "<init>",
        "(Llive/hms/video/audio/BluetoothPermissionHandler;)V",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "hmsRole",
        "Llive/hms/video/sdk/RequestPermissionInterface;",
        "requestPermissionInterface",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "requestAndAwaitPermissions",
        "(Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RequestPermissionInterface;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;",
        "setPermissionsAccepted",
        "()V",
        "Llive/hms/video/audio/BluetoothPermissionHandler;",
        "Lbc3/s;",
        "",
        "permissionsDeferred",
        "Lbc3/s;",
        "",
        "AUDIO",
        "Ljava/lang/String;",
        "VIDEO",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AUDIO:Ljava/lang/String;

.field private final VIDEO:Ljava/lang/String;

.field private final bluetoothPermissionHandler:Llive/hms/video/audio/BluetoothPermissionHandler;

.field private permissionsDeferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/audio/BluetoothPermissionHandler;)V
    .locals 1

    const-string v0, "bluetoothPermissionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->bluetoothPermissionHandler:Llive/hms/video/audio/BluetoothPermissionHandler;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->permissionsDeferred:Lbc3/s;

    const-string p1, "audio"

    iput-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->AUDIO:Ljava/lang/String;

    const-string p1, "video"

    iput-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->VIDEO:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final requestAndAwaitPermissions(Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RequestPermissionInterface;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            "Llive/hms/video/sdk/RequestPermissionInterface;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;

    iget v1, v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;

    invoke-direct {v0, p0, p4}, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;-><init>(Llive/hms/video/sdk/PermissionsHandlers;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;->L$0:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/sdk/RequestPermissionInterface;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_8

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/HMSRole;->getPublishParams()Llive/hms/video/sdk/models/role/PublishParams;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/PublishParams;->getAllowed()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v4, p0, Llive/hms/video/sdk/PermissionsHandlers;->AUDIO:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {p3, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/PublishParams;->getAllowed()Ljava/util/ArrayList;

    move-result-object p1

    iget-object v2, p0, Llive/hms/video/sdk/PermissionsHandlers;->VIDEO:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "android.permission.CAMERA"

    invoke-static {p3, p1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->bluetoothPermissionHandler:Llive/hms/video/audio/BluetoothPermissionHandler;

    invoke-virtual {p1, p3}, Llive/hms/video/audio/BluetoothPermissionHandler;->hasBluetoothError(Landroid/content/Context;)Llive/hms/video/audio/BluetoothErrorType;

    move-result-object p1

    const/4 p3, -0x1

    if-nez p1, :cond_5

    move p1, p3

    goto :goto_1

    :cond_5
    sget-object v2, Llive/hms/video/sdk/PermissionsHandlers$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    :goto_1
    if-eq p1, p3, :cond_7

    if-eq p1, v3, :cond_7

    const/4 p3, 0x2

    if-ne p1, p3, :cond_6

    iget-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->bluetoothPermissionHandler:Llive/hms/video/audio/BluetoothPermissionHandler;

    invoke-virtual {p1}, Llive/hms/video/audio/BluetoothPermissionHandler;->getBLUETOOTH_CONNECT_PERMISSION()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->permissionsDeferred:Lbc3/s;

    invoke-interface {p2, p4}, Llive/hms/video/sdk/RequestPermissionInterface;->onPermissionsRequested(Ljava/util/List;)V

    iget-object p1, p0, Llive/hms/video/sdk/PermissionsHandlers;->permissionsDeferred:Lbc3/s;

    iput-object p2, v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/sdk/PermissionsHandlers$requestAndAwaitPermissions$1;->label:I

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setPermissionsAccepted()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/PermissionsHandlers;->permissionsDeferred:Lbc3/s;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method
