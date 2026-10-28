.class public final Lcl0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcl0/b;",
        "Lod1/g;",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "Lcl0/a;",
        "activeResponseApiInteractor",
        "Ljs0/c;",
        "configurationRepository",
        "<init>",
        "(Lcl0/a;Ljs0/c;)V",
        "message",
        "Lec3/l;",
        "g",
        "(Lcom/whoop/bot/models/conversation/AiChatMessage;)Lec3/l;",
        "Ll83/a0;",
        "f",
        "(Lcom/whoop/bot/models/conversation/AiChatMessage;Lq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcl0/a;",
        "b",
        "Ljs0/c;",
        "bot_release"
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
.field private final a:Lcl0/a;

.field private final b:Ljs0/c;


# direct methods
.method public constructor <init>(Lcl0/a;Ljs0/c;)V
    .locals 1

    const-string v0, "activeResponseApiInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcl0/b;->a:Lcl0/a;

    iput-object p2, p0, Lcl0/b;->b:Ljs0/c;

    return-void
.end method

.method public static final synthetic c(Lcl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcl0/b;->f(Lcom/whoop/bot/models/conversation/AiChatMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcl0/b;)Lcl0/a;
    .locals 0

    iget-object p0, p0, Lcl0/b;->a:Lcl0/a;

    return-object p0
.end method

.method public static final synthetic e(Lcl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcl0/b;->g(Lcom/whoop/bot/models/conversation/AiChatMessage;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lcom/whoop/bot/models/conversation/AiChatMessage;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object p1

    sget-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v0, :cond_a

    iget-object p1, p0, Lcl0/b;->b:Ljs0/c;

    sget-object v0, Lcom/whoop/data/repositories/AiPollingDelay;->INSTANCE:Lcom/whoop/data/repositories/AiPollingDelay;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v0}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Ljava/lang/Long;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {p1, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_0

    :cond_0
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p1, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    goto :goto_0

    :cond_1
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p1, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    goto :goto_0

    :cond_2
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    goto :goto_0

    :cond_3
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p1, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_0

    :cond_4
    const-class v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p1, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_5
    move-object v6, v0

    :cond_6
    :goto_0
    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    move-object v0, v6

    :goto_1
    if-eqz v0, :cond_9

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3, p2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_8

    return-object p1

    :cond_8
    return-object v1

    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    return-object v1
.end method

.method private final g(Lcom/whoop/bot/models/conversation/AiChatMessage;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcl0/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcl0/b$c;-><init>(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcl0/b;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcl0/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcl0/b$b;-><init>(Lq83/d;Lcl0/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lcl0/b$a;

    invoke-direct {v0, p1}, Lcl0/b$a;-><init>(Lec3/l;)V

    return-object v0
.end method
