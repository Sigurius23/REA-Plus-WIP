.class public final Lbe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Lcf/c;

.field public c:Lpf/a;

.field public final d:Lug/a;

.field public e:Lvg/n;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x5460

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    iput-wide v0, p0, Lbe/c;->a:J

    sget-object v0, Lcf/c;->d:Lcf/c;

    iput-object v0, p0, Lbe/c;->b:Lcf/c;

    sget-object v0, Lug/a;->a:Lug/a;

    iput-object v0, p0, Lbe/c;->d:Lug/a;

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvg/m;->b:Lvg/r;

    iput-object v0, p0, Lbe/c;->e:Lvg/n;

    return-void
.end method


# virtual methods
.method public final a(Lpf/a;)V
    .locals 0

    iput-object p1, p0, Lbe/c;->c:Lpf/a;

    return-void
.end method

.method public final b(Lvg/n;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/c;->e:Lvg/n;

    return-void
.end method
