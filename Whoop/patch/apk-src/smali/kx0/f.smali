.class public final Lkx0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyh2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkx0/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0010\u0008\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lkx0/f;",
        "Lyh2/d;",
        "Lmu0/a;",
        "metricsDataDao",
        "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;",
        "rawDataDao",
        "Lau0/a;",
        "strapFirmwareEventsDao",
        "Lfu0/d;",
        "rev2RawDataDao",
        "Lfu0/a;",
        "rev2DataSettingsDao",
        "Lhu1/d;",
        "labradorPacketsDao",
        "Lyt0/d;",
        "newConsolePacketsDao",
        "<init>",
        "(Lmu0/a;Lcom/whoop/data/local/room/dao/persistent/RawDataDao;Lau0/a;Lfu0/d;Lfu0/a;Lhu1/d;Lyt0/d;)V",
        "Lyh2/a;",
        "type",
        "Lec3/l;",
        "",
        "a",
        "(Lyh2/a;)Lec3/l;",
        "Lmu0/a;",
        "b",
        "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;",
        "c",
        "Lau0/a;",
        "d",
        "Lfu0/d;",
        "e",
        "Lfu0/a;",
        "f",
        "Lhu1/d;",
        "g",
        "Lyt0/d;",
        "data-sync-service_release"
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
.field private final a:Lmu0/a;

.field private final b:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

.field private final c:Lau0/a;

.field private final d:Lfu0/d;

.field private final e:Lfu0/a;

.field private final f:Lhu1/d;

.field private final g:Lyt0/d;


# direct methods
.method public constructor <init>(Lmu0/a;Lcom/whoop/data/local/room/dao/persistent/RawDataDao;Lau0/a;Lfu0/d;Lfu0/a;Lhu1/d;Lyt0/d;)V
    .locals 1

    const-string v0, "metricsDataDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapFirmwareEventsDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rev2RawDataDao"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rev2DataSettingsDao"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labradorPacketsDao"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newConsolePacketsDao"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkx0/f;->a:Lmu0/a;

    iput-object p2, p0, Lkx0/f;->b:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput-object p3, p0, Lkx0/f;->c:Lau0/a;

    iput-object p4, p0, Lkx0/f;->d:Lfu0/d;

    iput-object p5, p0, Lkx0/f;->e:Lfu0/a;

    iput-object p6, p0, Lkx0/f;->f:Lhu1/d;

    iput-object p7, p0, Lkx0/f;->g:Lyt0/d;

    return-void
.end method


# virtual methods
.method public a(Lyh2/a;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyh2/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkx0/f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, Lkx0/f;->f:Lhu1/d;

    invoke-interface {p1}, Lhu1/d;->observeNewestTimestamp()Lec3/l;

    move-result-object p1

    new-instance v0, Lkx0/f$h;

    invoke-direct {v0, p1}, Lkx0/f$h;-><init>(Lec3/l;)V

    return-object v0

    :pswitch_1
    iget-object p1, p0, Lkx0/f;->c:Lau0/a;

    invoke-interface {p1}, Lau0/a;->observeNewestTimestamp()Lec3/l;

    move-result-object p1

    new-instance v0, Lkx0/f$g;

    invoke-direct {v0, p1}, Lkx0/f$g;-><init>(Lec3/l;)V

    return-object v0

    :pswitch_2
    iget-object p1, p0, Lkx0/f;->g:Lyt0/d;

    invoke-interface {p1}, Lyt0/d;->observeNewestTimestamp()Lec3/l;

    move-result-object p1

    new-instance v0, Lkx0/f$f;

    invoke-direct {v0, p1}, Lkx0/f$f;-><init>(Lec3/l;)V

    return-object v0

    :pswitch_3
    iget-object p1, p0, Lkx0/f;->e:Lfu0/a;

    invoke-interface {p1}, Lfu0/a;->observeNewestTimestamp()Lec3/l;

    move-result-object p1

    new-instance v0, Lkx0/f$e;

    invoke-direct {v0, p1}, Lkx0/f$e;-><init>(Lec3/l;)V

    return-object v0

    :pswitch_4
    iget-object p1, p0, Lkx0/f;->d:Lfu0/d;

    invoke-interface {p1}, Lfu0/d;->observeNewestTimestamp()Lec3/l;

    move-result-object p1

    new-instance v0, Lkx0/f$d;

    invoke-direct {v0, p1}, Lkx0/f$d;-><init>(Lec3/l;)V

    return-object v0

    :pswitch_5
    iget-object p1, p0, Lkx0/f;->b:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    invoke-interface {p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->observeNewestTimestamp()Lec3/l;

    move-result-object p1

    new-instance v0, Lkx0/f$c;

    invoke-direct {v0, p1}, Lkx0/f$c;-><init>(Lec3/l;)V

    return-object v0

    :pswitch_6
    iget-object p1, p0, Lkx0/f;->a:Lmu0/a;

    invoke-interface {p1}, Lmu0/a;->observeNewestTimestamp()Lec3/l;

    move-result-object p1

    new-instance v0, Lkx0/f$b;

    invoke-direct {v0, p1}, Lkx0/f$b;-><init>(Lec3/l;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
