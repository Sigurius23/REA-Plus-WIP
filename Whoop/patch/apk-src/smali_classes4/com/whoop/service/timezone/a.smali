.class public final Lcom/whoop/service/timezone/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\u000b\u001a\u000c\u0012\u0004\u0012\u00020\t0\u0008j\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001fR\u001e\u0010\u000b\u001a\u000c\u0012\u0004\u0012\u00020\t0\u0008j\u0002`\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010 R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/service/timezone/a;",
        "",
        "Lcom/whoop/service/network/UsersPreferenceApi;",
        "usersPreferenceApi",
        "Lda2/a;",
        "dataStoreHelper",
        "Lic/p0;",
        "workManager",
        "Lkotlin/Function0;",
        "",
        "Lcom/whoop/service/timezone/ClockFormatProvider;",
        "clockFormatProvider",
        "Lbc3/c0;",
        "scope",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/UsersPreferenceApi;Lda2/a;Lic/p0;Lc93/a;Lbc3/c0;Ltr2/n;)V",
        "",
        "timestamp",
        "Ll83/a0;",
        "e",
        "(J)V",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/service/network/UsersPreferenceApi;",
        "b",
        "Lda2/a;",
        "c",
        "()Lda2/a;",
        "Lic/p0;",
        "Lc93/a;",
        "Lbc3/c0;",
        "f",
        "Ltr2/n;",
        "core_release"
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
.field private final a:Lcom/whoop/service/network/UsersPreferenceApi;

.field private final b:Lda2/a;

.field private final c:Lic/p0;

.field private final d:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final e:Lbc3/c0;

.field private final f:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/UsersPreferenceApi;Lda2/a;Lic/p0;Lc93/a;Lbc3/c0;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/UsersPreferenceApi;",
            "Lda2/a;",
            "Lic/p0;",
            "Lc93/a;",
            "Lbc3/c0;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "usersPreferenceApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStoreHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockFormatProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/service/timezone/a;->a:Lcom/whoop/service/network/UsersPreferenceApi;

    .line 3
    iput-object p2, p0, Lcom/whoop/service/timezone/a;->b:Lda2/a;

    .line 4
    iput-object p3, p0, Lcom/whoop/service/timezone/a;->c:Lic/p0;

    .line 5
    iput-object p4, p0, Lcom/whoop/service/timezone/a;->d:Lc93/a;

    .line 6
    iput-object p5, p0, Lcom/whoop/service/timezone/a;->e:Lbc3/c0;

    .line 7
    iput-object p6, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/service/network/UsersPreferenceApi;Lda2/a;Lic/p0;Lc93/a;Lbc3/c0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 8
    sget-object p6, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "TimezoneUpdateUploader"

    invoke-virtual {p6, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/whoop/service/timezone/a;-><init>(Lcom/whoop/service/network/UsersPreferenceApi;Lda2/a;Lic/p0;Lc93/a;Lbc3/c0;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/service/timezone/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/service/timezone/a;)Lic/p0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/timezone/a;->c:Lic/p0;

    return-object p0
.end method


# virtual methods
.method public final c()Lda2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/timezone/a;->b:Lda2/a;

    return-object v0
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/service/timezone/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/service/timezone/a$a;

    iget v1, v0, Lcom/whoop/service/timezone/a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/service/timezone/a$a;->E:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/service/timezone/a$a;

    invoke-direct {v0, p0, p1}, Lcom/whoop/service/timezone/a$a;-><init>(Lcom/whoop/service/timezone/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v7, Lcom/whoop/service/timezone/a$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lcom/whoop/service/timezone/a$a;->E:I

    const-string v8, "timezone_update_retry"

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v2, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v11, :cond_4

    if-eq v1, v2, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    iget-object v0, v7, Lcom/whoop/service/timezone/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v7, Lcom/whoop/service/timezone/a$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v7, Lcom/whoop/service/timezone/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v7, Lcom/whoop/service/timezone/a$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v1, v7, Lcom/whoop/service/timezone/a$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->b:Lda2/a;

    iput v11, v7, Lcom/whoop/service/timezone/a$a;->E:I

    invoke-virtual {p1, v7}, Lda2/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto/16 :goto_6

    :cond_6
    :goto_2
    move-object v6, p1

    check-cast v6, Ljava/lang/Long;

    if-nez v6, :cond_7

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    const-string v0, "No timestamp found, returning success"

    new-array v1, v13, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_7
    iget-object p1, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Retrying timezone update with timestamp: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v13, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Li92/o;->e:Li92/o$a;

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->d:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v3

    const-string v4, "getDefault(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/whoop/service/timezone/a;->a:Lcom/whoop/service/network/UsersPreferenceApi;

    iget-object v5, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    iput-object v12, v7, Lcom/whoop/service/timezone/a$a;->w:Ljava/lang/Object;

    iput v2, v7, Lcom/whoop/service/timezone/a$a;->E:I

    move v2, p1

    invoke-virtual/range {v1 .. v7}, Li92/o$a;->a(ZLorg/joda/time/DateTimeZone;Lcom/whoop/service/network/UsersPreferenceApi;Ltr2/n;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_6

    :cond_8
    :goto_3
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_a

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->b:Lda2/a;

    iput-object v12, v7, Lcom/whoop/service/timezone/a$a;->w:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/service/timezone/a$a;->x:Ljava/lang/Object;

    iput v10, v7, Lcom/whoop/service/timezone/a$a;->E:I

    invoke-virtual {p1, v7}, Lda2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_6

    :cond_9
    :goto_4
    iget-object p1, p0, Lcom/whoop/service/timezone/a;->c:Lic/p0;

    invoke-virtual {p1, v8}, Lic/p0;->b(Ljava/lang/String;)Lic/f0;

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    const-string v0, "Timezone update retry successful"

    new-array v1, v13, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_8

    :cond_a
    instance-of v1, p1, Lu02/a$b$b;

    if-eqz v1, :cond_b

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    const-string v0, "Timezone update retry failed (network error), will retry again"

    new-array v1, v13, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_5
    move v11, v13

    goto :goto_8

    :cond_b
    instance-of p1, p1, Lu02/a$b$a;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->f:Ltr2/n;

    const-string v1, "Timezone update retry failed (HTTP error), stopping retry"

    new-array v2, v13, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/service/timezone/a;->b:Lda2/a;

    iput-object v12, v7, Lcom/whoop/service/timezone/a$a;->w:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/service/timezone/a$a;->x:Ljava/lang/Object;

    iput v9, v7, Lcom/whoop/service/timezone/a$a;->E:I

    invoke-virtual {p1, v7}, Lda2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_6
    return-object v0

    :cond_c
    :goto_7
    iget-object p1, p0, Lcom/whoop/service/timezone/a;->c:Lic/p0;

    invoke-virtual {p1, v8}, Lic/p0;->b(Ljava/lang/String;)Lic/f0;

    goto :goto_5

    :goto_8
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final e(J)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/timezone/a;->e:Lbc3/c0;

    new-instance v1, Lcom/whoop/service/timezone/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/whoop/service/timezone/a$b;-><init>(Lcom/whoop/service/timezone/a;JLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
