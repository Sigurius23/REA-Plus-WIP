.class public final Lvc2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lvc2/a;",
        "Lvc2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lvc2/b;",
        "Lod1/g;",
        "Lvc2/a;",
        "Lvc2/c;",
        "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Ltr2/n;)V",
        "",
        "plan",
        "Lec3/l;",
        "g",
        "(Ljava/lang/String;)Lec3/l;",
        "h",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;",
        "b",
        "Ltr2/n;",
        "settings_release"
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
.field private final a:Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvc2/b;->a:Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;

    .line 3
    iput-object p2, p0, Lvc2/b;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "SwitchBillingPlanModalInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lvc2/b;-><init>(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lvc2/b;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lvc2/b;->g(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lvc2/b;)Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;
    .locals 0

    iget-object p0, p0, Lvc2/b;->a:Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;

    return-object p0
.end method

.method public static final synthetic e(Lvc2/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvc2/b;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lvc2/b;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lvc2/b;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lvc2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lvc2/b$a;-><init>(Lvc2/b;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lvc2/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lvc2/b$c;-><init>(Lvc2/b;Ljava/lang/String;Lq83/d;)V

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

    new-instance v0, Lvc2/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lvc2/b$b;-><init>(Lq83/d;Lvc2/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
