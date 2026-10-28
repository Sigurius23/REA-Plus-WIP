.class public final Lmc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/d;


# instance fields
.field public final a:Landroid/net/ConnectivityManager;


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc/d;->a:Landroid/net/ConnectivityManager;

    return-void
.end method


# virtual methods
.method public final a(Lic/e;)Lec3/c;
    .locals 3

    const-string v0, "constraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg20/p;

    const/4 v1, 0x0

    const/16 v2, 0x1b

    invoke-direct {v0, p1, p0, v1, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lqc/q;)Z
    .locals 1

    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqc/q;->j:Lic/e;

    invoke-virtual {p1}, Lic/e;->a()Landroid/net/NetworkRequest;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
