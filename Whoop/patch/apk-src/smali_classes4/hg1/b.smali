.class public final Lhg1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg1/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0016\u00a8\u0006\u001b"
    }
    d2 = {
        "Lhg1/b;",
        "Lhg1/a;",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;",
        "firmwareEventsApi",
        "",
        "releaseVersion",
        "La6/g;",
        "Lf6/f;",
        "dataStorePreferences",
        "<init>",
        "(Ltr2/n;Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;Ljava/lang/String;La6/g;)V",
        "Lfg1/b;",
        "exportedStrapEventsMetaData",
        "",
        "a",
        "(Lfg1/b;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "b",
        "Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;",
        "c",
        "Ljava/lang/String;",
        "d",
        "La6/g;",
        "e",
        "modelString",
        "firmware-events_release"
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
.field private final a:Ltr2/n;

.field private final b:Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

.field private final c:Ljava/lang/String;

.field private final d:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ltr2/n;Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;Ljava/lang/String;La6/g;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;",
            "Ljava/lang/String;",
            "La6/g;",
            ")V"
        }
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareEventsApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "releaseVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStorePreferences"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhg1/b;->a:Ltr2/n;

    iput-object p2, p0, Lhg1/b;->b:Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    iput-object p3, p0, Lhg1/b;->c:Ljava/lang/String;

    iput-object p4, p0, Lhg1/b;->d:La6/g;

    sget-object p1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object p3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object p4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "|"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lhg1/b;->e:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic b(Lhg1/b;)Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;
    .locals 0

    iget-object p0, p0, Lhg1/b;->b:Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    return-object p0
.end method

.method public static final synthetic c(Lhg1/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lhg1/b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic d(Lhg1/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lhg1/b;->c:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Lfg1/b;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg1/b;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lhg1/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhg1/b$a;

    iget v1, v0, Lhg1/b$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhg1/b$a;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lhg1/b$a;

    invoke-direct {v0, p0, p2}, Lhg1/b$a;-><init>(Lhg1/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lhg1/b$a;->F:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lhg1/b$a;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lhg1/b$a;->E:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lhg1/b$a;->z:Ljava/lang/Object;

    check-cast p1, Lud3/v0;

    iget-object p1, v6, Lhg1/b$a;->y:Ljava/lang/Object;

    check-cast p1, Loh2/a;

    iget-object p1, v6, Lhg1/b$a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    iget-object p1, v6, Lhg1/b$a;->w:Ljava/lang/Object;

    check-cast p1, Lfg1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lhg1/b$a;->z:Ljava/lang/Object;

    check-cast p1, Lud3/v0;

    iget-object v1, v6, Lhg1/b$a;->y:Ljava/lang/Object;

    check-cast v1, Loh2/a;

    iget-object v3, v6, Lhg1/b$a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    iget-object v3, v6, Lhg1/b$a;->w:Ljava/lang/Object;

    check-cast v3, Lfg1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v9, p1

    move-object v10, v1

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lfg1/b;->b()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p1}, Lfg1/b;->a()Loh2/a;

    move-result-object v1

    sget-object p1, Lud3/v0;->Companion:Lud3/u0;

    sget-object v5, Lud3/h0;->e:Lyb3/p;

    const-string v5, "application/octet-stream"

    invoke-static {v5}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v5}, Lud3/u0;->a(Ljava/io/File;Lud3/h0;)Lud3/p0;

    move-result-object p1

    iget-object p2, p0, Lhg1/b;->d:La6/g;

    invoke-interface {p2}, La6/g;->getData()Lec3/l;

    move-result-object p2

    iput-object v4, v6, Lhg1/b$a;->w:Ljava/lang/Object;

    iput-object v4, v6, Lhg1/b$a;->x:Ljava/lang/Object;

    iput-object v1, v6, Lhg1/b$a;->y:Ljava/lang/Object;

    iput-object p1, v6, Lhg1/b$a;->z:Ljava/lang/Object;

    iput v3, v6, Lhg1/b$a;->H:I

    invoke-static {p2, v6}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    goto :goto_3

    :goto_2
    check-cast p2, Lf6/f;

    sget-object p1, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;->INSTANCE:Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;

    invoke-virtual {p1}, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;->getPREF_AUXILIARY_DEVICE_ID()Lf6/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    const-string p1, "UNKNOWN"

    :cond_5
    move-object v11, p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lhg1/b;->a:Ltr2/n;

    new-instance v5, Lhg1/b$b;

    const/4 v12, 0x0

    move-object v8, p0

    move-object v7, v5

    invoke-direct/range {v7 .. v12}, Lhg1/b$b;-><init>(Lhg1/b;Lud3/v0;Loh2/a;Ljava/lang/String;Lq83/d;)V

    iput-object v4, v6, Lhg1/b$a;->w:Ljava/lang/Object;

    iput-object v4, v6, Lhg1/b$a;->x:Ljava/lang/Object;

    iput-object v4, v6, Lhg1/b$a;->y:Ljava/lang/Object;

    iput-object v4, v6, Lhg1/b$a;->z:Ljava/lang/Object;

    iput-object v4, v6, Lhg1/b$a;->E:Ljava/lang/Object;

    iput p1, v6, Lhg1/b$a;->H:I

    const/4 v3, 0x0

    const-string v4, "Failed to upload firmware events"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    instance-of p1, p2, Lu02/a$c;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
