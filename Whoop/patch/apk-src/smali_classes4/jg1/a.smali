.class public final Ljg1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgt0/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00082\u0006\u0010\r\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017JG\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00082\u0006\u0010\r\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Ljg1/a;",
        "Lgt0/d;",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lgt0/b;",
        "category",
        "",
        "value",
        "Lgt0/a;",
        "action",
        "deviceName",
        "targetFwVersion",
        "errorCause",
        "Ll83/a0;",
        "f",
        "(Lgt0/b;Ljava/lang/String;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "userAcceptanceRequired",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "device",
        "e",
        "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lgt0/a;",
        "Lgt0/c;",
        "b",
        "(Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "c",
        "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V",
        "",
        "duration",
        "d",
        "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V",
        "a",
        "Lfi0/a;",
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljg1/a;->a:Lfi0/a;

    return-void
.end method

.method private final e(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lgt0/a;
    .locals 0

    if-nez p1, :cond_1

    invoke-virtual {p2}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object p1

    sget-object p2, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->PUFFIN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lgt0/a;->USER_INITIATED:Lgt0/a;

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lgt0/a;->APP_INITIATED:Lgt0/a;

    return-object p1
.end method

.method private final f(Lgt0/b;Ljava/lang/String;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    move-object/from16 v0, p4

    move-object/from16 v1, p6

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toLowerCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "toUpperCase(...)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v2

    :cond_1
    :goto_0
    new-instance v3, Ll83/k;

    const-string v5, "Whoop Device"

    invoke-direct {v3, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "Strap Generation"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v5, "Target FW version"

    move-object/from16 v6, p5

    invoke-direct {v0, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v9

    if-eqz v1, :cond_2

    const-string v0, "Error"

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v3, p0, Ljg1/a;->a:Lfi0/a;

    invoke-virtual {p1}, Lgt0/b;->getCategory()Ljava/lang/String;

    move-result-object v4

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lgt0/a;->getAction()Ljava/lang/String;

    move-result-object v2

    :cond_3
    move-object v5, v2

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v6, 0x0

    const-string v7, "FW Update"

    move-object v8, p2

    invoke-static/range {v3 .. v11}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b(Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetFwVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lgt0/c;->getValue()Ljava/lang/String;

    move-result-object p2

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    invoke-direct/range {v0 .. v6}, Ljg1/a;->f(Lgt0/b;Ljava/lang/String;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V
    .locals 10

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lgt0/b;->FW_UPDATE_TIME:Lgt0/b;

    sget-object v3, Lgt0/c;->TRIGGERED:Lgt0/c;

    invoke-direct {p0, p1, p2}, Ljg1/a;->e(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lgt0/a;

    move-result-object v4

    invoke-virtual {p2}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x20

    const/4 v9, 0x0

    const-string v6, ""

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public d(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V
    .locals 8

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lgt0/b;->FW_UPDATE_TIME:Lgt0/b;

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, p2}, Ljg1/a;->e(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lgt0/a;

    move-result-object v4

    invoke-virtual {p2}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const/4 v7, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ljg1/a;->f(Lgt0/b;Ljava/lang/String;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
