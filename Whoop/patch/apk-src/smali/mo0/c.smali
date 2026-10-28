.class public final Lmo0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lmo0/c;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lio0/f;",
        "domainState",
        "Llo0/n;",
        "d",
        "(Lio0/f;)Llo0/n;",
        "Lio0/b;",
        "modal",
        "b",
        "(Lio0/b;)Llo0/n;",
        "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;",
        "Llo0/l;",
        "c",
        "(Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Llo0/l;",
        "a",
        "Ljb1/a;",
        "clinician-in-the-loop_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lmo0/c;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo0/c;->a:Ljb1/a;

    return-void
.end method

.method private final b(Lio0/b;)Llo0/n;
    .locals 1

    sget-object v0, Lio0/c;->a:Lio0/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Llo0/n$b;->b:Llo0/n$b;

    return-object p1

    :cond_0
    sget-object v0, Lio0/d;->a:Lio0/d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Llo0/n$a;->b:Llo0/n$a;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Llo0/l;
    .locals 4

    iget-object v0, p0, Lmo0/c;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;->getProgressButton()Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object v1

    invoke-static {v1}, Llb1/t3;->g(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-static {v2}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    sget-object v2, Lkd1/o$b;->b:Lkd1/o$b;

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;->getGradientColor()Ly81/f;

    move-result-object p1

    new-instance v3, Llo0/l;

    invoke-direct {v3, v0, v1, v2, p1}, Llo0/l;-><init>(Ljava/util/List;Lc31/k;Lkd1/o;Ly81/f;)V

    return-object v3
.end method

.method private final d(Lio0/f;)Llo0/n;
    .locals 1

    invoke-virtual {p1}, Lio0/f;->c()Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Llo0/n$b;->b:Llo0/n$b;

    return-object p1

    :cond_0
    new-instance v0, Llo0/n$c;

    invoke-direct {p0, p1}, Lmo0/c;->c(Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Llo0/l;

    move-result-object p1

    invoke-direct {v0, p1}, Llo0/n$c;-><init>(Llo0/l;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lio0/f;)Llo0/n;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio0/f;->b()Lio0/b;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lmo0/c;->d(Lio0/f;)Llo0/n;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, v0}, Lmo0/c;->b(Lio0/b;)Llo0/n;

    move-result-object p1

    return-object p1
.end method
