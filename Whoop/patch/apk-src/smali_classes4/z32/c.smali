.class public final Lz32/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\rJ%\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lz32/c;",
        "",
        "Lcom/whoop/pregnancy/api/PregnancyCoachingApi;",
        "api",
        "Lv32/a;",
        "pregnancyAnalytics",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/pregnancy/api/PregnancyCoachingApi;Lv32/a;Ltr2/n;)V",
        "Lec3/l;",
        "Lz32/b;",
        "i",
        "()Lec3/l;",
        "j",
        "k",
        "",
        "dueDate",
        "",
        "fromOnboarding",
        "l",
        "(Ljava/lang/String;Z)Lec3/l;",
        "Lz32/a;",
        "upstream",
        "h",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/pregnancy/api/PregnancyCoachingApi;",
        "b",
        "Lv32/a;",
        "c",
        "Ltr2/n;",
        "pregnancy_release"
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
.field private final a:Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

.field private final b:Lv32/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/pregnancy/api/PregnancyCoachingApi;Lv32/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pregnancyAnalytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz32/c;->a:Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    iput-object p2, p0, Lz32/c;->b:Lv32/a;

    iput-object p3, p0, Lz32/c;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;
    .locals 0

    iget-object p0, p0, Lz32/c;->a:Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    return-object p0
.end method

.method public static final synthetic b(Lz32/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lz32/c;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lz32/c;)Lv32/a;
    .locals 0

    iget-object p0, p0, Lz32/c;->b:Lv32/a;

    return-object p0
.end method

.method public static final synthetic d(Lz32/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lz32/c;->i()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lz32/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lz32/c;->j()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lz32/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lz32/c;->k()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lz32/c;Ljava/lang/String;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lz32/c;->l(Ljava/lang/String;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final i()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lz32/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz32/c$b;-><init>(Lz32/c;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final j()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lz32/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz32/c$c;-><init>(Lz32/c;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final k()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lz32/c$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz32/c$d;-><init>(Lz32/c;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final l(Ljava/lang/String;Z)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lz32/c$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lz32/c$e;-><init>(Lz32/c;Ljava/lang/String;ZLq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public final h(Lec3/l;)Lec3/l;
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

    new-instance v0, Lz32/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lz32/c$a;-><init>(Lq83/d;Lz32/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
