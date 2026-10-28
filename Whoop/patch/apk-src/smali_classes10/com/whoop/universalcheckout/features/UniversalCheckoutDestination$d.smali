.class public final Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;
.super Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination<",
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;",
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;",
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;",
        "<init>",
        "()V",
        "Leb/a0;",
        "",
        "cartId",
        "source",
        "Ll83/a0;",
        "f",
        "(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V",
        "Lnp2/a$a;",
        "e",
        "(Leb/a0;Ljava/lang/String;)Lnp2/a$a;",
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
.field public static final a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;

    invoke-direct {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;-><init>()V

    sput-object v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->b(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "cartId"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->c(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "source"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lpl0/b;

    const/4 v0, 0x5

    invoke-direct {v7, v0}, Lpl0/b;-><init>(I)V

    const/4 v8, 0x0

    const-string v4, "shippingAddress"

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/q;)Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->d(Leb/q;)Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c(Leb/m;)Ll83/a0;
    .locals 2

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    sget-object v0, Lcom/whoop/universalcheckout/features/b;->a:Lcom/whoop/universalcheckout/features/b;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lmn2/b;->JOIN:Lmn2/b;

    invoke-virtual {v0}, Lmn2/b;->getValue()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Leb/q;)Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "cartId"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v1, "source"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    :cond_1
    sget-object p0, Lcom/whoop/universalcheckout/features/b;->a:Lcom/whoop/universalcheckout/features/b;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/b;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    sget-object p0, Lmn2/b;->JOIN:Lmn2/b;

    invoke-virtual {p0}, Lmn2/b;->getValue()Ljava/lang/String;

    move-result-object p0

    :cond_2
    new-instance v1, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;

    invoke-direct {v1, v0, p0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic g(Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;Leb/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p3, Lcom/whoop/universalcheckout/features/b;->a:Lcom/whoop/universalcheckout/features/b;

    invoke-virtual {p3}, Lcom/whoop/universalcheckout/features/b;->a()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-nez p4, :cond_0

    sget-object p3, Lmn2/b;->JOIN:Lmn2/b;

    invoke-virtual {p3}, Lmn2/b;->getValue()Ljava/lang/String;

    move-result-object p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->f(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e(Leb/a0;Ljava/lang/String;)Lnp2/a$a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lnp2/a$i;

    invoke-direct {p1, p2}, Lnp2/a$i;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "source"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    invoke-direct {p2, v1, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p2}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x6

    invoke-static {p1, p2, p3, v0}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void
.end method
