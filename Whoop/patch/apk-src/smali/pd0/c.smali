.class public final Lpd0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpd0/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpd0/a;",
        "Lpd0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J#\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpd0/c;",
        "Lod1/g;",
        "Lpd0/a;",
        "Lpd0/b;",
        "Lcom/whoop/advancedlabs/domain/GrowthContentApi;",
        "api",
        "Lcom/whoop/sanguine/domain/SanguineApi;",
        "sanguineApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/GrowthContentApi;Lcom/whoop/sanguine/domain/SanguineApi;Ltr2/n;)V",
        "",
        "code",
        "g",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "actionName",
        "Ll83/a0;",
        "h",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/advancedlabs/domain/GrowthContentApi;",
        "b",
        "Lcom/whoop/sanguine/domain/SanguineApi;",
        "c",
        "Ltr2/n;",
        "d",
        "advanced-labs_release"
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
.field public static final d:Lpd0/c$a;

.field public static final e:I


# instance fields
.field private final a:Lcom/whoop/advancedlabs/domain/GrowthContentApi;

.field private final b:Lcom/whoop/sanguine/domain/SanguineApi;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpd0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpd0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpd0/c;->d:Lpd0/c$a;

    const/16 v0, 0x8

    sput v0, Lpd0/c;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/GrowthContentApi;Lcom/whoop/sanguine/domain/SanguineApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sanguineApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpd0/c;->a:Lcom/whoop/advancedlabs/domain/GrowthContentApi;

    .line 3
    iput-object p2, p0, Lpd0/c;->b:Lcom/whoop/sanguine/domain/SanguineApi;

    .line 4
    iput-object p3, p0, Lpd0/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/GrowthContentApi;Lcom/whoop/sanguine/domain/SanguineApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "RafReceiverInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpd0/c;-><init>(Lcom/whoop/advancedlabs/domain/GrowthContentApi;Lcom/whoop/sanguine/domain/SanguineApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lpd0/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpd0/c;->g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lpd0/c;)Lcom/whoop/advancedlabs/domain/GrowthContentApi;
    .locals 0

    iget-object p0, p0, Lpd0/c;->a:Lcom/whoop/advancedlabs/domain/GrowthContentApi;

    return-object p0
.end method

.method public static final synthetic e(Lpd0/c;)Lcom/whoop/sanguine/domain/SanguineApi;
    .locals 0

    iget-object p0, p0, Lpd0/c;->b:Lcom/whoop/sanguine/domain/SanguineApi;

    return-object p0
.end method

.method public static final synthetic f(Lpd0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpd0/c;->h(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpd0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lpd0/c$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lpd0/c$b;

    iget v1, v0, Lpd0/c$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpd0/c$b;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lpd0/c$b;

    invoke-direct {v0, p0, p2}, Lpd0/c$b;-><init>(Lpd0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lpd0/c$b;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lpd0/c$b;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lpd0/c$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lpd0/c;->c:Ltr2/n;

    new-instance v5, Lpd0/c$c;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lpd0/c$c;-><init>(Lpd0/c;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Lpd0/c$b;->w:Ljava/lang/Object;

    iput p2, v6, Lpd0/c$b;->z:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_4

    new-instance p1, Lpd0/b$c;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    invoke-direct {p1, p2}, Lpd0/b$c;-><init>(Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;)V

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lpd0/b$a;->a:Lpd0/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "accept_invite"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lpd0/c;->c:Ltr2/n;

    new-instance v4, Lpd0/c$d;

    const/4 p2, 0x0

    invoke-direct {v4, p0, p1, p2}, Lpd0/c$d;-><init>(Lpd0/c;Ljava/lang/String;Lq83/d;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    new-instance v0, Lpd0/c$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lpd0/c$e;-><init>(Lq83/d;Lpd0/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
