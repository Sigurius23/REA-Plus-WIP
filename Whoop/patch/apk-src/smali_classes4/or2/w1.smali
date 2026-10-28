.class public final Lor2/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/c;
.implements Lof3/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf93/c;",
        "Lof3/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u0008H\u0096\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lor2/w1;",
        "Lf93/c;",
        "",
        "",
        "Lof3/a;",
        "<init>",
        "()V",
        "thisRef",
        "Lj93/z;",
        "property",
        "a",
        "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Integer;",
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

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final w:Lor2/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lor2/w1;

    invoke-direct {v0}, Lor2/w1;-><init>()V

    sput-object v0, Lor2/w1;->w:Lor2/w1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lj93/z;)Ljava/lang/Integer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            ")",
            "Ljava/lang/Integer;"
        }
    .end annotation

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const-class p2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p1, v1, p2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string p2, "new-auth-user-storage-android"

    invoke-interface {p1, p2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const-class p2, Lz92/a;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, v1, p2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz92/a;

    new-instance p2, Lor2/w1$a;

    invoke-direct {p2, p1, v1}, Lor2/w1$a;-><init>(Lz92/a;Lq83/d;)V

    sget-object p1, Lq83/k;->w:Lq83/k;

    invoke-static {p1, p2}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const-string p1, "userContext"

    new-instance p2, Lvf3/c;

    invoke-direct {p2, p1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const-class v2, Lod1/u;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v1, v0, p2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lod1/u;

    invoke-virtual {p1}, Lod1/u;->g()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lor2/w1;->a(Ljava/lang/Object;Lj93/z;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
