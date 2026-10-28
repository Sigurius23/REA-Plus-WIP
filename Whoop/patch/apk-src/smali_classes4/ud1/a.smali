.class public final Lud1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb82/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lud1/a;",
        "Lb82/a;",
        "Ltd1/b;",
        "whoopStrapProxy",
        "<init>",
        "(Ltd1/b;)V",
        "Lzj0/h;",
        "commandResponsePacket",
        "Llt0/e;",
        "commandNumber",
        "Ll83/a0;",
        "d",
        "(Lzj0/h;Llt0/e;)V",
        "",
        "patternId",
        "numberOfLoops",
        "Lak0/g;",
        "a",
        "(IILq83/d;)Ljava/lang/Object;",
        "Ltd1/b;",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "logger",
        "app_prodStandardRelease"
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
.field private final a:Ltd1/b;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Ltd1/b;)V
    .locals 1

    const-string v0, "whoopStrapProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud1/a;->a:Ltd1/b;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "HapticsFeedbackSdkImpl"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lud1/a;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic b(Lud1/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lud1/a;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lud1/a;)Ltd1/b;
    .locals 0

    iget-object p0, p0, Lud1/a;->a:Ltd1/b;

    return-object p0
.end method

.method private final d(Lzj0/h;Llt0/e;)V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "RunHaptics"

    if-nez p1, :cond_0

    iget-object p1, p0, Lud1/a;->b:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Did not receive any response packet for command "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "!"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, p2, v0}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "success"

    goto :goto_0

    :cond_1
    const-string p1, "failure"

    :goto_0
    iget-object v2, p0, Lud1/a;->b:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Command "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " resulted in "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Lqr2/a$a;

    invoke-interface {v2, v1, p1, p2}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public static synthetic e(Lud1/a;Lzj0/h;Llt0/e;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Llt0/e;->RUN_HAPTICS_PATTERN:Llt0/e;

    :cond_0
    invoke-direct {p0, p1, p2}, Lud1/a;->d(Lzj0/h;Llt0/e;)V

    return-void
.end method


# virtual methods
.method public a(IILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lak0/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lud1/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lud1/a$a;-><init>(Lud1/a;IILq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
