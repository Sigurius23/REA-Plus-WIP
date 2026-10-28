.class public final Lbg2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0010\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0012\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J!\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u000c\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lbg2/g;",
        "",
        "Lcom/whoop/sms/common/data/SmsVerificationApi;",
        "api",
        "Lwf2/a;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/sms/common/data/SmsVerificationApi;Lwf2/a;Ltr2/n;)V",
        "",
        "phoneNumber",
        "Lec3/l;",
        "Lbg2/d;",
        "n",
        "(Ljava/lang/String;)Lec3/l;",
        "code",
        "m",
        "destinationPhoneNumber",
        "l",
        "k",
        "()Lec3/l;",
        "o",
        "p",
        "Lbg2/c;",
        "upstream",
        "j",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/sms/common/data/SmsVerificationApi;",
        "b",
        "Lwf2/a;",
        "c",
        "Ltr2/n;",
        "sms_release"
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
.field private final a:Lcom/whoop/sms/common/data/SmsVerificationApi;

.field private final b:Lwf2/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/sms/common/data/SmsVerificationApi;Lwf2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbg2/g;->a:Lcom/whoop/sms/common/data/SmsVerificationApi;

    .line 3
    iput-object p2, p0, Lbg2/g;->b:Lwf2/a;

    .line 4
    iput-object p3, p0, Lbg2/g;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/sms/common/data/SmsVerificationApi;Lwf2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "SmsSetupInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lbg2/g;-><init>(Lcom/whoop/sms/common/data/SmsVerificationApi;Lwf2/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lbg2/g;)Lwf2/a;
    .locals 0

    iget-object p0, p0, Lbg2/g;->b:Lwf2/a;

    return-object p0
.end method

.method public static final synthetic b(Lbg2/g;)Lcom/whoop/sms/common/data/SmsVerificationApi;
    .locals 0

    iget-object p0, p0, Lbg2/g;->a:Lcom/whoop/sms/common/data/SmsVerificationApi;

    return-object p0
.end method

.method public static final synthetic c(Lbg2/g;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lbg2/g;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lbg2/g;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lbg2/g;->k()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lbg2/g;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lbg2/g;->l(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lbg2/g;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lbg2/g;->m(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lbg2/g;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lbg2/g;->n(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lbg2/g;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lbg2/g;->o()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lbg2/g;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lbg2/g;->p()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final k()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lbg2/g$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lbg2/g$c;-><init>(Lbg2/g;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final l(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lbg2/g$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lbg2/g$d;-><init>(Lbg2/g;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final m(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lbg2/g$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lbg2/g$e;-><init>(Lbg2/g;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final n(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lbg2/g$f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lbg2/g$f;-><init>(Ljava/lang/String;Lbg2/g;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final o()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lbg2/g$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lbg2/g$g;-><init>(Lbg2/g;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final p()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lbg2/g$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lbg2/g$h;-><init>(Lbg2/g;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method


# virtual methods
.method public final j(Lec3/l;)Lec3/l;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "upstream"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lbg2/g$a;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    invoke-direct {v1, v2, v3}, Lbg2/g$a;-><init>(Lq83/d;Lbg2/g;)V

    invoke-static {v0, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v4, Lbg2/d;

    const v21, 0xffff

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v4 .. v22}, Lbg2/d;-><init>(Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lbg2/g$b;

    invoke-direct {v1, v2}, Lbg2/g$b;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v4, v0, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
