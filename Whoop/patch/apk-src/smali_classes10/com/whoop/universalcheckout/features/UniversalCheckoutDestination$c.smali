.class public final Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;
.super Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination<",
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\t\u001a\u00020\u0008*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;",
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;",
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;",
        "<init>",
        "()V",
        "Leb/a0;",
        "",
        "cartId",
        "Ll83/a0;",
        "g",
        "(Leb/a0;Ljava/lang/String;)V",
        "Lep2/a$a;",
        "f",
        "(Leb/a0;)Lep2/a$a;",
        "a",
        "universal-checkout_release"
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
.field public static final a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;

    invoke-direct {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;-><init>()V

    sput-object v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 10

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->d(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "cartId"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v7, Lpl0/b;

    const/4 v0, 0x2

    invoke-direct {v7, v0}, Lpl0/b;-><init>(I)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v4, "receiptOrder"

    const/4 v6, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->h(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Leb/k1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->i(Leb/k1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Leb/q;)Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->e(Leb/q;)Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Leb/q;)Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "cartId"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-direct {v0, p0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final h(Leb/y0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;->getRoute()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lpl0/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lpl0/b;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Leb/y0;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Leb/k1;)Ll83/a0;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/k1;->a:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final f(Leb/a0;)Lep2/a$a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lep2/a$f;

    sget-object v0, Lcom/whoop/universalcheckout/features/b;->a:Lcom/whoop/universalcheckout/features/b;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lep2/a$f;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final g(Leb/a0;Ljava/lang/String;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lpl0/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lpl0/b;-><init>(I)V

    invoke-virtual {p1, p2, v0}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
