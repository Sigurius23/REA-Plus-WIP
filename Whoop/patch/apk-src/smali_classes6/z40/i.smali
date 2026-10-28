.class public final Lz40/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/o;
.implements Lul/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1

    sget-object v0, Lz40/l;->o:Ll83/p;

    sget-object v0, Lz40/l;->o:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public create()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lzk/y;

    invoke-direct {v0}, Lzk/y;-><init>()V

    return-object v0
.end method

.method public d(Ljava/lang/Object;Lag/d;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Luf/u;

    iget-object p2, p1, Luf/u;->a:Ldg/a;

    sget-object v0, Lcf/l;->a:Lgf/a;

    invoke-static {p2, v0}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v0, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v0, Lvf/b;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    const-string v2, "AWSCognitoIdentityProviderService."

    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "X-Amz-Target"

    invoke-virtual {v1, p2, v2}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v0, Lvf/b;->y:Lmf/c;

    const-string v1, "application/x-amz-json-1.1"

    invoke-virtual {p2, v1}, La2/a;->P(Ljava/lang/String;)V

    iget-object p2, v0, Lvf/b;->z:Lmf/l;

    instance-of p2, p2, Lmf/j;

    if-eqz p2, :cond_0

    const-string p2, "{}"

    invoke-static {p2}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p2

    new-instance v1, Lof/a;

    invoke-direct {v1, p2}, Lof/a;-><init>([B)V

    iput-object v1, v0, Lvf/b;->z:Lmf/l;

    :cond_0
    return-object p1
.end method
