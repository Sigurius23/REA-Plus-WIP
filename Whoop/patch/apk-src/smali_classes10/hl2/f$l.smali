.class final Lhl2/f$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhl2/f;->s(ZLhl2/d;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$postManualHrZones$2"
    f = "HrSettingsInteractor.kt"
    l = {
        0xc4
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lhl2/f;

.field final synthetic y:Z

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hrZones/network/Zone;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhl2/f;ZLjava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl2/f;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/hrZones/network/Zone;",
            ">;",
            "Lq83/d<",
            "-",
            "Lhl2/f$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhl2/f$l;->x:Lhl2/f;

    iput-boolean p2, p0, Lhl2/f$l;->y:Z

    iput-object p3, p0, Lhl2/f$l;->z:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhl2/f$l;

    iget-object v1, p0, Lhl2/f$l;->x:Lhl2/f;

    iget-boolean v2, p0, Lhl2/f$l;->y:Z

    iget-object v3, p0, Lhl2/f$l;->z:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, p1}, Lhl2/f$l;-><init>(Lhl2/f;ZLjava/util/List;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lhl2/f$l;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lhl2/f$l;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhl2/f$l;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lhl2/f$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lhl2/f$l;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lhl2/f$l;->x:Lhl2/f;

    invoke-static {p1}, Lhl2/f;->a(Lhl2/f;)Lcom/whoop/training/data/network/api/HrSettingsApi;

    move-result-object p1

    new-instance v1, Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;

    iget-boolean v3, p0, Lhl2/f$l;->y:Z

    xor-int/2addr v3, v2

    iget-object v4, p0, Lhl2/f$l;->z:Ljava/util/List;

    invoke-direct {v1, v3, v4}, Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;-><init>(ZLjava/util/List;)V

    iput v2, p0, Lhl2/f$l;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/training/data/network/api/HrSettingsApi;->postCustomZones(Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
