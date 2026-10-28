.class final Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;->j(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00070\u0001\u00a2\u0006\u0002\u0008\u0002*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lic/u;",
        "Lkotlin/jvm/internal/EnhancedNullability;",
        "<anonymous>",
        "(Lbc3/c0;)Lic/u;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareEvents.uploader.FirmwareEventsUploadWorker$work$2"
    f = "FirmwareEventsUploadWorker.kt"
    l = {
        0x27,
        0x29,
        0x2f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->F:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;

    iget-object v0, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->F:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;

    invoke-direct {p1, v0, p2}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;-><init>(Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->E:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->z:Z

    iget-object v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->y:Ljava/lang/Object;

    check-cast v1, Lfg1/b;

    iget-object v2, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->x:Ljava/lang/Object;

    check-cast v2, Lhg1/c;

    iget-object v2, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->w:Ljava/lang/Object;

    check-cast v2, Landroid/content/SharedPreferences;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->y:Ljava/lang/Object;

    check-cast v1, Lfg1/b;

    iget-object v3, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->x:Ljava/lang/Object;

    check-cast v3, Lhg1/c;

    iget-object v4, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->w:Ljava/lang/Object;

    check-cast v4, Landroid/content/SharedPreferences;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v3

    goto/16 :goto_2

    :cond_2
    iget-object v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->x:Ljava/lang/Object;

    check-cast v1, Lhg1/c;

    iget-object v4, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->w:Ljava/lang/Object;

    check-cast v4, Landroid/content/SharedPreferences;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->F:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;

    new-instance v1, Lvf3/c;

    const-string v6, "fw-events-shared-prefs-koin"

    invoke-direct {v1, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v7, Landroid/content/SharedPreferences;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p1, v5, v7, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->F:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;

    invoke-interface {v1}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v1

    iget-object v1, v1, Lnf3/a;->a:Lwf3/a;

    iget-object v1, v1, Lwf3/a;->d:Lxf3/c;

    const-class v7, Lhg1/c;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v1, v5, v6, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhg1/c;

    iput-object p1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->w:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->x:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->E:I

    invoke-interface {v1, p0}, Lhg1/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    :goto_0
    move-object v11, p0

    goto :goto_3

    :cond_4
    move-object v12, v4

    move-object v4, p1

    move-object p1, v12

    :goto_1
    check-cast p1, Lfg1/b;

    if-nez p1, :cond_5

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_5
    iget-object v6, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->F:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;

    invoke-interface {v6}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v6

    iget-object v6, v6, Lnf3/a;->a:Lwf3/a;

    iget-object v6, v6, Lwf3/a;->d:Lxf3/c;

    const-class v7, Lhg1/a;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v6, v5, v7, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhg1/a;

    iput-object v4, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->w:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->x:Ljava/lang/Object;

    iput-object p1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->y:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->E:I

    invoke-interface {v6, p1, p0}, Lhg1/a;->a(Lfg1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_6

    goto :goto_0

    :cond_6
    move-object v6, v1

    move-object v1, p1

    move-object p1, v3

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v1}, Lfg1/b;->b()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    if-eqz p1, :cond_8

    invoke-virtual {v1}, Lfg1/b;->e()J

    move-result-wide v7

    invoke-virtual {v1}, Lfg1/b;->c()J

    move-result-wide v9

    iput-object v4, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->x:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->y:Ljava/lang/Object;

    iput-boolean p1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->z:Z

    iput v2, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->E:I

    move-object v11, p0

    invoke-interface/range {v6 .. v11}, Lhg1/c;->a(JJLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    move v0, p1

    move-object v2, v4

    :goto_4
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    move-object v4, v2

    goto :goto_5

    :cond_8
    move-object v11, p0

    new-instance v0, Lic/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object v12, v0

    move v0, p1

    move-object p1, v12

    :goto_5
    iget-object v2, v11, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;->F:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;

    invoke-virtual {v1}, Lfg1/b;->d()I

    move-result v1

    invoke-static {v2, v0, v4, v1}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;->k(Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;ZLandroid/content/SharedPreferences;I)V

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sget-object v1, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-static {v1}, Lorg/joda/time/DateTime;->now(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v1

    const-string v3, "fw-events-last-attempt-upload-millis"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object p1
.end method
