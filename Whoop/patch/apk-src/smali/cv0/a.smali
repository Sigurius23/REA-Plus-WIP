.class public final Lcv0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcv0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcv0/a;",
        "",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lrr2/c;",
        "crashReporter",
        "Lbc3/c0;",
        "coroutineScope",
        "Lfy1/g;",
        "nanoClock",
        "<init>",
        "(Lci2/b;Lrr2/c;Lbc3/c0;Lfy1/g;)V",
        "Lyu0/f;",
        "realTimePacketType",
        "Ldv0/b;",
        "b",
        "(Lyu0/f;)Ldv0/b;",
        "Ljt0/b;",
        "packetType",
        "a",
        "(Ljt0/b;)Ldv0/b;",
        "Lci2/b;",
        "Lrr2/c;",
        "c",
        "Lbc3/c0;",
        "d",
        "Lfy1/g;",
        "connectivity-analytics_release"
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
.field private final a:Lci2/b;

.field private final b:Lrr2/c;

.field private final c:Lbc3/c0;

.field private final d:Lfy1/g;


# direct methods
.method public constructor <init>(Lci2/b;Lrr2/c;Lbc3/c0;Lfy1/g;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nanoClock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcv0/a;->a:Lci2/b;

    iput-object p2, p0, Lcv0/a;->b:Lrr2/c;

    iput-object p3, p0, Lcv0/a;->c:Lbc3/c0;

    iput-object p4, p0, Lcv0/a;->d:Lfy1/g;

    return-void
.end method

.method private final b(Lyu0/f;)Ldv0/b;
    .locals 7

    new-instance v0, Ldv0/b;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "RealtimeGapDetector"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    iget-object v3, p0, Lcv0/a;->a:Lci2/b;

    iget-object v4, p0, Lcv0/a;->b:Lrr2/c;

    iget-object v5, p0, Lcv0/a;->c:Lbc3/c0;

    iget-object v6, p0, Lcv0/a;->d:Lfy1/g;

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ldv0/b;-><init>(Ltr2/n;Lyu0/f;Lci2/b;Lrr2/c;Lbc3/c0;Lfy1/g;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljt0/b;)Ldv0/b;
    .locals 1

    const-string v0, "packetType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcv0/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong function called to generate Realtime Gap Detector"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget-object p1, Lyu0/f;->FILTERED_ECG:Lyu0/f;

    invoke-direct {p0, p1}, Lcv0/a;->b(Lyu0/f;)Ldv0/b;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object p1, Lyu0/f;->R11:Lyu0/f;

    invoke-direct {p0, p1}, Lcv0/a;->b(Lyu0/f;)Ldv0/b;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lyu0/f;->R10:Lyu0/f;

    invoke-direct {p0, p1}, Lcv0/a;->b(Lyu0/f;)Ldv0/b;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object p1, Lyu0/f;->IMU:Lyu0/f;

    invoke-direct {p0, p1}, Lcv0/a;->b(Lyu0/f;)Ldv0/b;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget-object p1, Lyu0/f;->R20:Lyu0/f;

    invoke-direct {p0, p1}, Lcv0/a;->b(Lyu0/f;)Ldv0/b;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget-object p1, Lyu0/f;->HR:Lyu0/f;

    invoke-direct {p0, p1}, Lcv0/a;->b(Lyu0/f;)Ldv0/b;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
