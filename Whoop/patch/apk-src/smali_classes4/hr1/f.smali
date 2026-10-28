.class public final Lhr1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhr1/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lhr1/f;",
        "",
        "Lhr1/e;",
        "integrationsDiscoveryReducer",
        "Lhr1/b;",
        "integrationsDetailsReducer",
        "Lhr1/c;",
        "integrationsDetailsV2Reducer",
        "Lhr1/d;",
        "integrationsDisclaimerReducer",
        "<init>",
        "(Lhr1/e;Lhr1/b;Lhr1/c;Lhr1/d;)V",
        "Lcr1/b;",
        "domainResult",
        "Lgr1/q;",
        "a",
        "(Lcr1/b;)Lgr1/q;",
        "Lhr1/e;",
        "b",
        "Lhr1/b;",
        "c",
        "Lhr1/c;",
        "d",
        "Lhr1/d;",
        "integrations_release"
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
.field public static final e:I


# instance fields
.field private final a:Lhr1/e;

.field private final b:Lhr1/b;

.field private final c:Lhr1/c;

.field private final d:Lhr1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lhr1/f;->e:I

    return-void
.end method

.method public constructor <init>(Lhr1/e;Lhr1/b;Lhr1/c;Lhr1/d;)V
    .locals 1

    const-string v0, "integrationsDiscoveryReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationsDetailsReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationsDetailsV2Reducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationsDisclaimerReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhr1/f;->a:Lhr1/e;

    iput-object p2, p0, Lhr1/f;->b:Lhr1/b;

    iput-object p3, p0, Lhr1/f;->c:Lhr1/c;

    iput-object p4, p0, Lhr1/f;->d:Lhr1/d;

    return-void
.end method


# virtual methods
.method public final a(Lcr1/b;)Lgr1/q;
    .locals 14

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcr1/b$h;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lcr1/b$h;

    invoke-virtual {p1}, Lcr1/b$h;->a()Lcr1/d;

    move-result-object p1

    sget-object v0, Lhr1/f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v1, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    new-instance v3, Lgr1/q;

    new-instance v4, Lgr1/k;

    invoke-direct {v4, v2, v1, v2}, Lgr1/k;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0xfe

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lgr1/q;

    new-instance v1, Lgr1/k;

    sget p1, Lzq1/b;->f:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    invoke-direct {v1, p1}, Lgr1/k;-><init>(Lcom/whoop/design/util/TextResource;)V

    const/16 v9, 0xfe

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lcr1/b$i;

    if-eqz v0, :cond_3

    new-instance v3, Lgr1/q;

    new-instance v4, Lgr1/k;

    invoke-direct {v4, v2, v1, v2}, Lgr1/k;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x7e

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v3 .. v13}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_3
    instance-of v0, p1, Lcr1/b$a;

    if-eqz v0, :cond_4

    new-instance v3, Lgr1/q;

    const/16 v12, 0xfd

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_4
    instance-of v0, p1, Lcr1/b$j;

    if-eqz v0, :cond_5

    new-instance v3, Lgr1/q;

    const/16 v12, 0xff

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_5
    instance-of v0, p1, Lcr1/b$k;

    if-eqz v0, :cond_6

    new-instance v3, Lgr1/q;

    new-instance v6, Lgr1/m;

    invoke-direct {v6, v2, v1, v2}, Lgr1/m;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0xfb

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lgr1/q;-><init>(Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_6
    instance-of v0, p1, Lcr1/b$f;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lhr1/f;->a:Lhr1/e;

    check-cast p1, Lcr1/b$f;

    invoke-virtual {v0, p1}, Lhr1/e;->c(Lcr1/b$f;)Lgr1/q;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v0, p1, Lcr1/b$b;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lhr1/f;->b:Lhr1/b;

    check-cast p1, Lcr1/b$b;

    invoke-virtual {v0, p1}, Lhr1/b;->a(Lcr1/b$b;)Lgr1/q;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v0, p1, Lcr1/b$d;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lhr1/f;->c:Lhr1/c;

    check-cast p1, Lcr1/b$d;

    invoke-virtual {v0, p1}, Lhr1/c;->a(Lcr1/b$d;)Lgr1/q;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of v0, p1, Lcr1/b$e;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lhr1/f;->d:Lhr1/d;

    check-cast p1, Lcr1/b$e;

    invoke-virtual {v0, p1}, Lhr1/d;->a(Lcr1/b$e;)Lgr1/q;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, p1, Lcr1/b$c;

    if-eqz p1, :cond_b

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
