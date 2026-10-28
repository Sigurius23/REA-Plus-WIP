.class public final Lcom/whoop/ai/chat/domain/formwidget/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/domain/formwidget/f$a;,
        Lcom/whoop/ai/chat/domain/formwidget/f$b;,
        Lcom/whoop/ai/chat/domain/formwidget/f$c;,
        Lcom/whoop/ai/chat/domain/formwidget/f$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/ai/chat/domain/formwidget/c;",
        "Lcom/whoop/ai/chat/domain/formwidget/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004QSUOB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J4\u0010\u0019\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00142\u001c\u0010\u0018\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\'\u0010#\u001a\u0004\u0018\u00010\u001d2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u001d\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u001d\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010&\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u0008,\u0010-J \u00100\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%2\u0006\u0010/\u001a\u00020.H\u0082@\u00a2\u0006\u0004\u00080\u00101J(\u00104\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u000202H\u0082@\u00a2\u0006\u0004\u00084\u00105J)\u0010:\u001a\u0004\u0018\u00010.2\u0008\u0010&\u001a\u0004\u0018\u0001062\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020807H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u0001022\u0008\u0010&\u001a\u0004\u0018\u000106H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0013\u0010?\u001a\u00020>*\u000208H\u0002\u00a2\u0006\u0004\u0008?\u0010@J\'\u0010D\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u0017\u0010H\u001a\u00020G*\u0006\u0012\u0002\u0008\u00030FH\u0002\u00a2\u0006\u0004\u0008H\u0010IJ\u0017\u0010J\u001a\u00020\u001d*\u0006\u0012\u0002\u0008\u00030FH\u0002\u00a2\u0006\u0004\u0008J\u0010KJ\u001f\u0010M\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008M\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0018\u0010`\u001a\u00020]*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010_\u00a8\u0006b"
    }
    d2 = {
        "Lcom/whoop/ai/chat/domain/formwidget/f;",
        "Lod1/g;",
        "Lcom/whoop/ai/chat/domain/formwidget/c;",
        "Lcom/whoop/ai/chat/domain/formwidget/d;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcom/whoop/bot/api/SubmitFormApi;",
        "submitFormApi",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lwm0/a;",
        "scopeCoordinator",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lcom/whoop/bot/api/SubmitFormApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Ltr2/n;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "T",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "",
        "block",
        "B",
        "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "",
        "formKey",
        "Lcom/whoop/ai/chat/domain/formwidget/f$b;",
        "y",
        "(Ljava/lang/String;)Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "cacheResult",
        "u",
        "(Lpm0/a;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;",
        "Lcom/whoop/ai/chat/domain/formwidget/c$h;",
        "action",
        "C",
        "(Lcom/whoop/ai/chat/domain/formwidget/c$h;)Lec3/l;",
        "Lcom/whoop/ai/chat/domain/formwidget/c$d;",
        "w",
        "(Lcom/whoop/ai/chat/domain/formwidget/c$d;)Lec3/l;",
        "s",
        "(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/domain/formwidget/f$c;",
        "answer",
        "r",
        "(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/domain/formwidget/f$d;",
        "complete",
        "q",
        "(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lcom/whoop/ai/chat/domain/formwidget/f$d;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "",
        "Lcom/whoop/ai/chat/domain/formwidget/h;",
        "selections",
        "z",
        "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/f$c;",
        "A",
        "(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/ai/chat/domain/formwidget/f$d;",
        "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;",
        "D",
        "(Lcom/whoop/ai/chat/domain/formwidget/h;)Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;",
        "field",
        "formId",
        "questionId",
        "v",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;",
        "Lu02/a$b;",
        "Lc91/b;",
        "F",
        "(Lu02/a$b;)Lc91/b;",
        "E",
        "(Lu02/a$b;)Lcom/whoop/ai/chat/domain/formwidget/f$b;",
        "state",
        "x",
        "(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/f$b;)Lcom/whoop/ai/chat/domain/formwidget/d;",
        "a",
        "Lnm0/e;",
        "b",
        "Lcom/whoop/bot/api/SubmitFormApi;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "d",
        "Lwm0/a;",
        "e",
        "Ltr2/n;",
        "Lmc3/a;",
        "f",
        "Lmc3/a;",
        "writeMutex",
        "",
        "t",
        "(Lcom/whoop/ai/chat/domain/formwidget/d;)Z",
        "isUserInteracting",
        "g",
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


# static fields
.field public static final g:Lcom/whoop/ai/chat/domain/formwidget/f$a;

.field public static final h:I


# instance fields
.field private final a:Lnm0/e;

.field private final b:Lcom/whoop/bot/api/SubmitFormApi;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Lwm0/a;

.field private final e:Ltr2/n;

.field private final f:Lmc3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/domain/formwidget/f;->g:Lcom/whoop/ai/chat/domain/formwidget/f$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/domain/formwidget/f;->h:I

    return-void
.end method

.method public constructor <init>(Lnm0/e;Lcom/whoop/bot/api/SubmitFormApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitFormApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->a:Lnm0/e;

    iput-object p2, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->b:Lcom/whoop/bot/api/SubmitFormApi;

    iput-object p3, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p4, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->d:Lwm0/a;

    iput-object p5, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->f:Lmc3/a;

    return-void
.end method

.method private final A(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/ai/chat/domain/formwidget/f$d;
    .locals 4

    instance-of v0, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/Request;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-string v2, "PUT"

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/Request;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    :try_start_0
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;->Companion:Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest$a;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest$a;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {v2, v3, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_1
    instance-of v2, v0, Ll83/m;

    if-eqz v2, :cond_4

    move-object v0, v1

    :cond_4
    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/f$d;

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/Request;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/whoop/ai/chat/domain/formwidget/f$d;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;)V

    :cond_6
    :goto_2
    return-object v1
.end method

.method private final B(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/ai/chat/domain/formwidget/f$p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;

    iget v1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;

    invoke-direct {v0, p0, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$p;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->y:I

    iget-object v2, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->x:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v5, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->w:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    move v2, p1

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->f:Lmc3/a;

    iput-object p1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->x:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->y:I

    iput v5, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->G:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_1
    :try_start_1
    sget-object v5, Lbc3/y1;->w:Lbc3/y1;

    new-instance v7, Lcom/whoop/ai/chat/domain/formwidget/f$q;

    invoke-direct {v7, p1, v6}, Lcom/whoop/ai/chat/domain/formwidget/f$q;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object v6, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->x:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->y:I

    iput v3, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->z:I

    iput v4, v0, Lcom/whoop/ai/chat/domain/formwidget/f$p;->G:I

    invoke-static {v5, v7, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_3
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_4
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method private final C(Lcom/whoop/ai/chat/domain/formwidget/c$h;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/domain/formwidget/c$h;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$r;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$r;-><init>(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final D(Lcom/whoop/ai/chat/domain/formwidget/h;)Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;
    .locals 4

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/h;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;

    invoke-direct {v3, v0, v1, v2, p1}, Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method private final E(Lu02/a$b;)Lcom/whoop/ai/chat/domain/formwidget/f$b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/a$b<",
            "*>;)",
            "Lcom/whoop/ai/chat/domain/formwidget/f$b;"
        }
    .end annotation

    instance-of v0, p1, Lu02/a$b$a;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lu02/a$b$a;

    invoke-virtual {v0}, Lu02/a$b$a;->d()I

    move-result v0

    const/16 v1, 0x193

    if-ne v0, v1, :cond_6

    const/4 v0, 0x0

    :try_start_0
    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->b()Ljava/lang/Exception;

    move-result-object p1

    instance-of v1, p1, Lretrofit2/HttpException;

    if-eqz v1, :cond_0

    check-cast p1, Lretrofit2/HttpException;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lretrofit2/HttpException;->y:Lpg3/v0;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lpg3/v0;->c:Lud3/a1;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    move-object p1, v0

    goto :goto_2

    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    instance-of v1, p1, Ll83/m;

    if-eqz v1, :cond_2

    move-object p1, v0

    :cond_2
    check-cast p1, Ljava/lang/String;

    const-string v1, ""

    if-nez p1, :cond_3

    move-object p1, v1

    :cond_3
    :try_start_1
    invoke-static {}, Lcom/whoop/ai/chat/domain/formwidget/g;->b()Lad3/c;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/ModerationErrorBody;->Companion:Lcom/whoop/ai/chat/domain/formwidget/ModerationErrorBody$a;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/ModerationErrorBody$a;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {v2, v3, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/ModerationErrorBody;

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/ModerationErrorBody;->getMessage()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    instance-of v2, p1, Ll83/m;

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    move-object v0, p1

    :goto_4
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, v0

    :goto_5
    new-instance p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$o;

    invoke-direct {p1, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$b$o;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_6
    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$b$n;

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/i$b;

    invoke-direct {p0, p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->F(Lu02/a$b;)Lc91/b;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/whoop/ai/chat/domain/formwidget/i$b;-><init>(Lc91/b;)V

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$b$n;-><init>(Lcom/whoop/ai/chat/domain/formwidget/i;)V

    return-object v0
.end method

.method private final F(Lu02/a$b;)Lc91/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/a$b<",
            "*>;)",
            "Lc91/b;"
        }
    .end annotation

    instance-of v0, p1, Lu02/a$b$b;

    if-eqz v0, :cond_0

    sget-object p1, Lc91/b$a;->b:Lc91/b$a;

    return-object p1

    :cond_0
    instance-of v0, p1, Lu02/a$b$a$a;

    if-eqz v0, :cond_1

    sget-object p1, Lc91/b$b;->b:Lc91/b$b;

    return-object p1

    :cond_1
    instance-of p1, p1, Lu02/a$b$a;

    if-eqz p1, :cond_2

    sget-object p1, Lc91/b$b;->b:Lc91/b$b;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static final synthetic c(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lcom/whoop/ai/chat/domain/formwidget/f$d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/ai/chat/domain/formwidget/f;->q(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lcom/whoop/ai/chat/domain/formwidget/f$d;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ai/chat/domain/formwidget/f;->r(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$h;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->s(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/ai/chat/domain/formwidget/f;)Lnm0/e;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->a:Lnm0/e;

    return-object p0
.end method

.method public static final synthetic g(Lcom/whoop/ai/chat/domain/formwidget/f;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic h(Lcom/whoop/ai/chat/domain/formwidget/f;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic i(Lcom/whoop/ai/chat/domain/formwidget/f;)Lcom/whoop/bot/api/SubmitFormApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->b:Lcom/whoop/bot/api/SubmitFormApi;

    return-object p0
.end method

.method public static final synthetic j(Lcom/whoop/ai/chat/domain/formwidget/f;Lpm0/a;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->u(Lpm0/a;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$d;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->w(Lcom/whoop/ai/chat/domain/formwidget/c$d;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/f$b;)Lcom/whoop/ai/chat/domain/formwidget/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->x(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/f$b;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/whoop/ai/chat/domain/formwidget/f;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->y(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/f$c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->z(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/f$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/whoop/ai/chat/domain/formwidget/f;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->B(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$h;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->C(Lcom/whoop/ai/chat/domain/formwidget/c$h;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final q(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lcom/whoop/ai/chat/domain/formwidget/f$d;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/domain/formwidget/c$h;",
            "Lcom/whoop/ai/chat/domain/formwidget/f$c;",
            "Lcom/whoop/ai/chat/domain/formwidget/f$d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ai/chat/domain/formwidget/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/whoop/ai/chat/domain/formwidget/f$e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/ai/chat/domain/formwidget/f$e;

    iget v3, v2, Lcom/whoop/ai/chat/domain/formwidget/f$e;->H:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/ai/chat/domain/formwidget/f$e;->H:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/whoop/ai/chat/domain/formwidget/f$e;

    invoke-direct {v2, v0, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$e;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->F:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->H:I

    const-string v11, ". "

    const-string v12, ", questionId="

    const/4 v13, 0x3

    const/4 v14, 0x2

    const/4 v4, 0x1

    const/4 v15, 0x0

    const-string v5, "FormWidget"

    const/4 v6, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v4, :cond_3

    if-eq v3, v14, :cond_2

    if-ne v3, v13, :cond_1

    iget-object v2, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->E:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->z:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/domain/formwidget/f$d;

    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/domain/formwidget/c$h;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v5

    move-object v1, v6

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->z:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/domain/formwidget/f$d;

    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/domain/formwidget/c$h;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v3

    move-object v13, v5

    move-object v3, v1

    move-object v1, v6

    goto/16 :goto_3

    :cond_3
    iget-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/ai/chat/domain/formwidget/f$d;

    iget-object v4, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->x:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    iget-object v4, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/ai/chat/domain/formwidget/c$h;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v4

    move-object v4, v3

    move-object v3, v13

    move-object v13, v5

    move-object v5, v1

    move-object v1, v6

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    new-instance v7, Lcom/whoop/ai/chat/domain/formwidget/f$f;

    move-object/from16 v9, p2

    invoke-direct {v7, v0, v9, v6}, Lcom/whoop/ai/chat/domain/formwidget/f$f;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)V

    move-object/from16 v9, p1

    iput-object v9, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->w:Ljava/lang/Object;

    iput-object v6, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->x:Ljava/lang/Object;

    move-object/from16 v10, p3

    iput-object v10, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->y:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->H:I

    move-object v4, v5

    const/4 v5, 0x0

    move-object/from16 v16, v6

    const/4 v6, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v13, v4

    move-object v4, v1

    move-object/from16 v1, v16

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object/from16 v4, p3

    move-object v5, v3

    move-object/from16 v3, p1

    :goto_2
    check-cast v5, Lu02/a;

    instance-of v6, v5, Lu02/a$b;

    if-eqz v6, :cond_6

    iget-object v1, v0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object v3

    check-cast v5, Lu02/a$b;

    invoke-virtual {v5}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v4

    const-string v6, "Submit failed for formId="

    invoke-static {v6, v2, v12, v3, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v15, [Lqr2/a$a;

    invoke-interface {v1, v13, v2, v3}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {v0, v5}, Lcom/whoop/ai/chat/domain/formwidget/f;->E(Lu02/a$b;)Lcom/whoop/ai/chat/domain/formwidget/f$b;

    move-result-object v1

    return-object v1

    :cond_6
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object v6, v0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    new-instance v7, Lcom/whoop/ai/chat/domain/formwidget/f$g;

    invoke-direct {v7, v0, v4, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$g;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/f$d;Lq83/d;)V

    iput-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->w:Ljava/lang/Object;

    iput-object v1, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->x:Ljava/lang/Object;

    iput-object v1, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->y:Ljava/lang/Object;

    iput-object v1, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->z:Ljava/lang/Object;

    iput v14, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->H:I

    move-object v4, v3

    move-object v3, v5

    const/4 v5, 0x0

    move-object v9, v4

    move-object v4, v6

    const/4 v6, 0x0

    move-object v10, v9

    const/4 v9, 0x6

    move-object v14, v10

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    check-cast v3, Lu02/a;

    iget-object v4, v0, Lcom/whoop/ai/chat/domain/formwidget/f;->d:Lwm0/a;

    iput-object v14, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->w:Ljava/lang/Object;

    iput-object v1, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->x:Ljava/lang/Object;

    iput-object v1, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->y:Ljava/lang/Object;

    iput-object v1, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->z:Ljava/lang/Object;

    iput-object v3, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->E:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v8, Lcom/whoop/ai/chat/domain/formwidget/f$e;->H:I

    const-string v5, "FormCompletionRefreshScope"

    invoke-virtual {v4, v5, v8}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_8

    :goto_4
    return-object v2

    :cond_8
    move-object v2, v3

    move-object v3, v14

    :goto_5
    instance-of v4, v2, Lu02/a$c;

    if-eqz v4, :cond_b

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpg3/v0;

    iget-object v2, v2, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/domain/formwidget/UpdateFormResponse;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/whoop/ai/chat/domain/formwidget/UpdateFormResponse;->getTurnId()Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_9
    move-object v6, v1

    :goto_6
    if-eqz v6, :cond_a

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->e()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lcom/whoop/ai/chat/domain/formwidget/i$a;

    invoke-direct {v4, v6}, Lcom/whoop/ai/chat/domain/formwidget/i$a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, v4}, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/ai/chat/domain/formwidget/i;)V

    return-object v1

    :cond_a
    iget-object v2, v0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->a()Ljava/lang/String;

    move-result-object v4

    const-string v5, "markComplete returned no turn_id. formId="

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v15, [Lqr2/a$a;

    invoke-interface {v2, v13, v4, v5}, Ltr2/n;->p(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->e()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v4, v3, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/ai/chat/domain/formwidget/i;)V

    return-object v2

    :cond_b
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_c

    iget-object v1, v0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object v3

    check-cast v2, Lu02/a$b;

    invoke-virtual {v2}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v5

    const-string v6, "markComplete failed for formId="

    invoke-static {v6, v4, v12, v3, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v15, [Lqr2/a$a;

    invoke-interface {v1, v13, v3, v4}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {v0, v2}, Lcom/whoop/ai/chat/domain/formwidget/f;->E(Lu02/a$b;)Lcom/whoop/ai/chat/domain/formwidget/f$b;

    move-result-object v1

    return-object v1

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final r(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/domain/formwidget/c$h;",
            "Lcom/whoop/ai/chat/domain/formwidget/f$c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ai/chat/domain/formwidget/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/ai/chat/domain/formwidget/f$h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/f$h;

    iget v1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$h;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$h;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$h;

    invoke-direct {v0, p0, p3}, Lcom/whoop/ai/chat/domain/formwidget/f$h;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->F:I

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->y:Ljava/lang/Object;

    check-cast p1, Lu02/a;

    iget-object p1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    iget-object p1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/c$h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    iget-object p1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/c$h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    new-instance v5, Lcom/whoop/ai/chat/domain/formwidget/f$i;

    invoke-direct {v5, p0, p2, v10}, Lcom/whoop/ai/chat/domain/formwidget/f$i;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)V

    iput-object p1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->w:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->x:Ljava/lang/Object;

    iput p3, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p2, p3, Lu02/a$c;

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->d:Lwm0/a;

    iput-object p1, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->w:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->x:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->y:Ljava/lang/Object;

    iput v9, v6, Lcom/whoop/ai/chat/domain/formwidget/f$h;->F:I

    const-string p3, "FormCompletionRefreshScope"

    invoke-virtual {p2, p3, v6}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    :goto_4
    new-instance p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$l;

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->e()Ljava/util/List;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lcom/whoop/ai/chat/domain/formwidget/f$b$l;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p2

    :cond_6
    instance-of p2, p3, Lu02/a$b;

    if-eqz p2, :cond_7

    iget-object p2, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object p1

    check-cast p3, Lu02/a$b;

    invoke-virtual {p3}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, ", questionId="

    const-string v3, ". "

    const-string v4, "Submit failed for formId="

    invoke-static {v4, v0, v2, p1, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "FormWidget"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0, p3}, Lcom/whoop/ai/chat/domain/formwidget/f;->E(Lu02/a$b;)Lcom/whoop/ai/chat/domain/formwidget/f$b;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final s(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/domain/formwidget/c$h;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ai/chat/domain/formwidget/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->b()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->e()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/whoop/ai/chat/domain/formwidget/f;->z(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/f$c;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "onAnswer"

    invoke-direct {p0, v0, p2, p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whoop/ai/chat/domain/formwidget/f;->A(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/ai/chat/domain/formwidget/f$d;

    move-result-object v6

    if-nez v6, :cond_1

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/c$h;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "onComplete"

    invoke-direct {p0, v0, p2, p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v2, Lcom/whoop/ai/chat/domain/formwidget/f$j;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Lcom/whoop/ai/chat/domain/formwidget/f$j;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lcom/whoop/ai/chat/domain/formwidget/f$d;Lq83/d;)V

    invoke-direct {p0, v2, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->B(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    move-object v3, p0

    move-object v4, p1

    new-instance p1, Lcom/whoop/ai/chat/domain/formwidget/f$k;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v4, v5, v0}, Lcom/whoop/ai/chat/domain/formwidget/f$k;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->B(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final t(Lcom/whoop/ai/chat/domain/formwidget/d;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->h()Lcom/whoop/ai/chat/domain/formwidget/j;

    move-result-object v0

    sget-object v1, Lcom/whoop/ai/chat/domain/formwidget/j$c;->a:Lcom/whoop/ai/chat/domain/formwidget/j$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->d()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->g()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/ai/chat/domain/formwidget/d;->e()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final u(Lpm0/a;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/ai/chat/domain/formwidget/f$b;"
        }
    .end annotation

    instance-of v0, p1, Lpm0/a$e;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    instance-of v0, p1, Lpm0/a$a$a;

    if-eqz v0, :cond_1

    new-instance p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$i;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-direct {p2, p1}, Lcom/whoop/ai/chat/domain/formwidget/f$b$i;-><init>(Lcom/whoop/design/models/DesignSystemModel;)V

    return-object p2

    :cond_1
    instance-of v0, p1, Lpm0/a$a$b;

    if-eqz v0, :cond_2

    new-instance p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$i;

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-direct {p2, p1}, Lcom/whoop/ai/chat/domain/formwidget/f$b$i;-><init>(Lcom/whoop/design/models/DesignSystemModel;)V

    return-object p2

    :cond_2
    instance-of v0, p1, Lpm0/a$c;

    const/4 v1, 0x0

    const-string v2, ". "

    const-string v3, "FormWidget"

    if-eqz v0, :cond_4

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v4

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v5, "Fetch failed with HTTP "

    const-string v6, ". formKey="

    invoke-static {v4, v5, v6, p2, v2}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v3, p1, v1}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$g;

    invoke-direct {p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$g;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v4, "Fetch failed with network error (no data). formKey="

    invoke-static {v4, p2, v2, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Lqr2/a$a;

    invoke-interface {v0, v3, p1, p2}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$f;->a:Lcom/whoop/ai/chat/domain/formwidget/f$b$f;

    return-object p1

    :cond_4
    instance-of v0, p1, Lpm0/a$d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object p1

    const-string v4, "Fetch failed with network error (stale data returned). formKey="

    invoke-static {v4, p2, v2, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Lqr2/a$a;

    invoke-interface {v0, v3, p1, p2}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$f;->a:Lcom/whoop/ai/chat/domain/formwidget/f$b$f;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/f$b;
    .locals 4

    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f;->e:Ltr2/n;

    const-string v1, " action for formId="

    const-string v2, ", questionId="

    const-string v3, "Submit missing/invalid "

    invoke-static {v3, p1, v1, p2, v2}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " \u2014 no client-built fallback"

    invoke-static {p3, p2, p1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string p3, "FormWidget"

    invoke-interface {v0, p3, p1, p2}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$n;

    new-instance p2, Lcom/whoop/ai/chat/domain/formwidget/i$b;

    sget-object p3, Lc91/b$b;->b:Lc91/b$b;

    invoke-direct {p2, p3}, Lcom/whoop/ai/chat/domain/formwidget/i$b;-><init>(Lc91/b;)V

    invoke-direct {p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$n;-><init>(Lcom/whoop/ai/chat/domain/formwidget/i;)V

    return-object p1
.end method

.method private final w(Lcom/whoop/ai/chat/domain/formwidget/c$d;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/domain/formwidget/c$d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$n;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$d;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final x(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/f$b;)Lcom/whoop/ai/chat/domain/formwidget/d;
    .locals 11

    instance-of v0, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$h;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/d;

    sget-object v2, Lcom/whoop/ai/chat/domain/formwidget/b$a;->a:Lcom/whoop/ai/chat/domain/formwidget/b$a;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/ai/chat/domain/formwidget/d;-><init>(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$i;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/d;

    check-cast p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$i;

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$i;->a()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    const/16 v9, 0x7d

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/ai/chat/domain/formwidget/d;-><init>(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$f;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/d;

    sget-object v2, Lcom/whoop/ai/chat/domain/formwidget/b$b;->a:Lcom/whoop/ai/chat/domain/formwidget/b$b;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/ai/chat/domain/formwidget/d;-><init>(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of v0, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$g;

    if-eqz v0, :cond_3

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/d;

    new-instance v2, Lcom/whoop/ai/chat/domain/formwidget/b$c;

    check-cast p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$g;

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/ai/chat/domain/formwidget/b$c;-><init>(Ljava/lang/String;)V

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/ai/chat/domain/formwidget/d;-><init>(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    instance-of v0, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$k;

    if-eqz v0, :cond_5

    invoke-direct {p0, p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->t(Lcom/whoop/ai/chat/domain/formwidget/d;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object v0, p1

    goto/16 :goto_2

    :cond_4
    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/d;

    check-cast p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$k;

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$k;->a()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    const/16 v9, 0x7d

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/ai/chat/domain/formwidget/d;-><init>(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    instance-of v0, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$q;

    if-eqz v0, :cond_6

    sget-object v4, Lcom/whoop/ai/chat/domain/formwidget/j$d;->a:Lcom/whoop/ai/chat/domain/formwidget/j$d;

    const/16 v9, 0x33

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_6
    move-object v0, p1

    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$p;

    if-eqz p1, :cond_7

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/j$a;->a:Lcom/whoop/ai/chat/domain/formwidget/j$a;

    const/16 v8, 0x33

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$l;

    if-eqz p1, :cond_8

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/j$c;->a:Lcom/whoop/ai/chat/domain/formwidget/j$c;

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->d()I

    move-result p1

    add-int/lit8 v5, p1, 0x1

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->g()Ljava/util/Map;

    move-result-object p1

    check-cast p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$l;

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$l;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$l;->b()Ljava/util/List;

    move-result-object p2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/16 v8, 0x43

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;

    if-eqz p1, :cond_9

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/j$a;->a:Lcom/whoop/ai/chat/domain/formwidget/j$a;

    check-cast p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;->b()Lcom/whoop/ai/chat/domain/formwidget/i;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->g()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$m;->c()Ljava/util/List;

    move-result-object p2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/16 v8, 0x53

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$n;

    if-eqz p1, :cond_a

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/j$b;->a:Lcom/whoop/ai/chat/domain/formwidget/j$b;

    check-cast p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$n;

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$n;->a()Lcom/whoop/ai/chat/domain/formwidget/i;

    move-result-object v4

    const/16 v8, 0x73

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$o;

    if-eqz p1, :cond_b

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/j$c;->a:Lcom/whoop/ai/chat/domain/formwidget/j$c;

    check-cast p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$o;

    invoke-virtual {p2}, Lcom/whoop/ai/chat/domain/formwidget/f$b$o;->a()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x33

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$b;

    if-eqz p1, :cond_c

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->d()I

    move-result p1

    if-lez p1, :cond_f

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->d()I

    move-result p1

    add-int/lit8 v5, p1, -0x1

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->h()Lcom/whoop/ai/chat/domain/formwidget/j;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/ai/chat/domain/formwidget/e;->a(Lcom/whoop/ai/chat/domain/formwidget/j;)Lcom/whoop/ai/chat/domain/formwidget/j;

    move-result-object v3

    const/16 v8, 0x23

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_c
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$c;

    if-eqz p1, :cond_10

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->i()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    instance-of p2, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    if-eqz p2, :cond_d

    check-cast p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    goto :goto_0

    :cond_d
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getQuestions()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_1

    :cond_e
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->d()I

    move-result p2

    add-int/lit8 p1, p1, -0x1

    if-ge p2, p1, :cond_f

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->d()I

    move-result p1

    add-int/lit8 v5, p1, 0x1

    invoke-virtual {v0}, Lcom/whoop/ai/chat/domain/formwidget/d;->h()Lcom/whoop/ai/chat/domain/formwidget/j;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/ai/chat/domain/formwidget/e;->a(Lcom/whoop/ai/chat/domain/formwidget/j;)Lcom/whoop/ai/chat/domain/formwidget/j;

    move-result-object v3

    const/16 v8, 0x63

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_f
    :goto_2
    return-object v0

    :cond_10
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$d;

    if-nez p1, :cond_14

    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$e;

    if-eqz p1, :cond_11

    return-object v0

    :cond_11
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$a;

    if-eqz p1, :cond_12

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;->b(Lcom/whoop/ai/chat/domain/formwidget/d;Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/d;

    move-result-object p1

    return-object p1

    :cond_12
    instance-of p1, p2, Lcom/whoop/ai/chat/domain/formwidget/f$b$j;

    if-eqz p1, :cond_13

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/d;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/ai/chat/domain/formwidget/d;-><init>(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_14
    return-object v0
.end method

.method private final y(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$o;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$o;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final z(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/f$c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/domain/formwidget/h;",
            ">;)",
            "Lcom/whoop/ai/chat/domain/formwidget/f$c;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/Request;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-string v2, "PUT"

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/Request;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    :try_start_0
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;->Companion:Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$a;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$a;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {v2, v3, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_1
    instance-of v2, v0, Ll83/m;

    if-eqz v2, :cond_4

    move-object v0, v1

    :cond_4
    move-object v2, v0

    check-cast v2, Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/Request;->getPath()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/h;

    invoke-direct {p0, v0}, Lcom/whoop/ai/chat/domain/formwidget/f;->D(Lcom/whoop/ai/chat/domain/formwidget/h;)Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;->copy$default(Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;

    move-result-object p2

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    invoke-direct {v0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$c;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;)V

    return-object v0

    :cond_7
    :goto_3
    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 12
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

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$l;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/ai/chat/domain/formwidget/f$l;-><init>(Lq83/d;Lcom/whoop/ai/chat/domain/formwidget/f;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lcom/whoop/ai/chat/domain/formwidget/d;

    const/16 v10, 0x7f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/whoop/ai/chat/domain/formwidget/d;-><init>(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$m;

    invoke-direct {v0, p0, v1}, Lcom/whoop/ai/chat/domain/formwidget/f$m;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v1, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
