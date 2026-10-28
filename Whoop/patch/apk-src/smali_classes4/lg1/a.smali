.class public final Llg1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J2\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J@\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018JB\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Llg1/a;",
        "",
        "Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;Ltr2/n;)V",
        "",
        "Ltg1/b;",
        "",
        "deviceChipVersionMap",
        "Ltg1/a;",
        "whoopDevice",
        "Ll83/n;",
        "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;",
        "b",
        "(Ljava/util/Map;Ltg1/a;Lq83/d;)Ljava/lang/Object;",
        "currentDeviceChipVersionMap",
        "",
        "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;",
        "chipFirmwareUpgrade",
        "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;",
        "c",
        "(Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;",
        "",
        "isSuccessful",
        "auxiliaryDeviceId",
        "Ll83/a0;",
        "d",
        "(Ljava/util/Map;ZLtg1/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;",
        "Ltr2/n;",
        "firmware-update-service_release"
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
.field private final a:Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg1/a;->a:Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;

    iput-object p2, p0, Llg1/a;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Llg1/a;)Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;
    .locals 0

    iget-object p0, p0, Llg1/a;->a:Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/Map;Ltg1/a;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ltg1/b;",
            "Ljava/lang/String;",
            ">;",
            "Ltg1/a;",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Llg1/a$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llg1/a$a;

    iget v1, v0, Llg1/a$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llg1/a$a;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llg1/a$a;

    invoke-direct {v0, p0, p3}, Llg1/a$a;-><init>(Llg1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Llg1/a$a;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Llg1/a$a;->F:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Llg1/a$a;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v6, Llg1/a$a;->x:Ljava/lang/Object;

    check-cast p1, Ltg1/a;

    iget-object p1, v6, Llg1/a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Ltg1/c;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Llg1/a;->b:Ltr2/n;

    new-instance v5, Llg1/a$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p2, p1, v3}, Llg1/a$b;-><init>(Llg1/a;Ltg1/a;Ljava/util/List;Lq83/d;)V

    iput-object v3, v6, Llg1/a$a;->w:Ljava/lang/Object;

    iput-object v3, v6, Llg1/a$a;->x:Ljava/lang/Object;

    iput-object v3, v6, Llg1/a$a;->y:Ljava/lang/Object;

    iput p3, v6, Llg1/a$a;->F:I

    const-string v4, "Failed to check for firmware updates"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_4

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_5

    check-cast p3, Lu02/a$b;

    invoke-virtual {p3}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c(Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ltg1/b;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;",
            ">;",
            "Ltg1/a;",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Llg1/a$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Llg1/a$c;

    iget v1, v0, Llg1/a$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llg1/a$c;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llg1/a$c;

    invoke-direct {v0, p0, p4}, Llg1/a$c;-><init>(Llg1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Llg1/a$c;->F:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Llg1/a$c;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Llg1/a$c;->E:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;

    iget-object p1, v6, Llg1/a$c;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v6, Llg1/a$c;->y:Ljava/lang/Object;

    check-cast p1, Ltg1/a;

    iget-object p1, v6, Llg1/a$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v6, Llg1/a$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Ltg1/c;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    new-instance p4, Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;

    invoke-direct {p4, p1, p2}, Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;-><init>(Ljava/util/List;Ljava/util/List;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Llg1/a;->b:Ltr2/n;

    new-instance v5, Llg1/a$d;

    const/4 p2, 0x0

    invoke-direct {v5, p0, p3, p4, p2}, Llg1/a$d;-><init>(Llg1/a;Ltg1/a;Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;Lq83/d;)V

    iput-object p2, v6, Llg1/a$c;->w:Ljava/lang/Object;

    iput-object p2, v6, Llg1/a$c;->x:Ljava/lang/Object;

    iput-object p2, v6, Llg1/a$c;->y:Ljava/lang/Object;

    iput-object p2, v6, Llg1/a$c;->z:Ljava/lang/Object;

    iput-object p2, v6, Llg1/a$c;->E:Ljava/lang/Object;

    iput p1, v6, Llg1/a$c;->H:I

    const/4 v3, 0x0

    const-string v4, "Failed to download firmware file"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p4, Lu02/a;

    instance-of p1, p4, Lu02/a$c;

    if-eqz p1, :cond_4

    check-cast p4, Lu02/a$c;

    invoke-virtual {p4}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p4, Lu02/a$b;

    if-eqz p1, :cond_5

    check-cast p4, Lu02/a$b;

    invoke-virtual {p4}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d(Ljava/util/Map;ZLtg1/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ltg1/b;",
            "Ljava/lang/String;",
            ">;Z",
            "Ltg1/a;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v2, v0, Llg1/a$e;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llg1/a$e;

    iget v3, v2, Llg1/a$e;->J:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llg1/a$e;->J:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Llg1/a$e;

    invoke-direct {v2, p0, v0}, Llg1/a$e;-><init>(Llg1/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Llg1/a$e;->H:Ljava/lang/Object;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v2, v8, Llg1/a$e;->J:I

    const/4 v7, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v7, :cond_1

    iget-object v2, v8, Llg1/a$e;->F:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Llg1/a$e;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;

    iget-object v2, v8, Llg1/a$e;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v8, Llg1/a$e;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Llg1/a$e;->x:Ljava/lang/Object;

    check-cast v2, Ltg1/a;

    iget-object v2, v8, Llg1/a$e;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Ltg1/c;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    new-instance v3, Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;

    invoke-direct {v3, v0, p2}, Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;-><init>(Ljava/util/List;Z)V

    sget-object v0, Ltg1/a;->PUFFIN:Ltg1/a;

    const/4 v9, 0x0

    move-object/from16 v2, p3

    if-ne v2, v0, :cond_3

    move-object/from16 v4, p4

    goto :goto_2

    :cond_3
    move-object v4, v9

    :goto_2
    sget-object v10, Lu02/a;->a:Lu02/a$a;

    iget-object v12, p0, Llg1/a;->b:Ltr2/n;

    new-instance v0, Llg1/a$f;

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Llg1/a$f;-><init>(Llg1/a;Ltg1/a;Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;Ljava/lang/String;Lq83/d;)V

    iput-object v9, v8, Llg1/a$e;->w:Ljava/lang/Object;

    iput-object v9, v8, Llg1/a$e;->x:Ljava/lang/Object;

    iput-object v9, v8, Llg1/a$e;->y:Ljava/lang/Object;

    iput-object v9, v8, Llg1/a$e;->z:Ljava/lang/Object;

    iput-object v9, v8, Llg1/a$e;->E:Ljava/lang/Object;

    iput-object v9, v8, Llg1/a$e;->F:Ljava/lang/Object;

    iput-boolean p2, v8, Llg1/a$e;->G:Z

    iput v7, v8, Llg1/a$e;->J:I

    const-string v6, "Failed to report firmware update result"

    const/4 v9, 0x2

    move-object v3, v10

    const/4 v10, 0x0

    move-object v7, v0

    move-object v4, v12

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_4

    return-object v11

    :cond_4
    :goto_3
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_5

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_5
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_6

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
