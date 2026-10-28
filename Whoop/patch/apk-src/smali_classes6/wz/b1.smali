.class public final Lwz/b1;
.super Lwz/e1;
.source "SourceFile"


# static fields
.field public static final d:Lwz/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lwz/b1;

    new-instance v1, Leb/f;

    new-instance v2, Leb/m;

    invoke-direct {v2}, Leb/m;-><init>()V

    sget-object v3, Leb/g1;->o:Leb/a1;

    invoke-virtual {v2, v3}, Leb/m;->b(Leb/g1;)V

    iget-object v2, v2, Leb/m;->a:Leb/k;

    invoke-virtual {v2}, Leb/k;->a()Leb/l;

    move-result-object v2

    const-string v4, "payment_details"

    invoke-direct {v1, v4, v2}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v2, Leb/f;

    new-instance v4, Leb/m;

    invoke-direct {v4}, Leb/m;-><init>()V

    sget-object v5, Leb/g1;->l:Leb/a1;

    invoke-virtual {v4, v5}, Leb/m;->b(Leb/g1;)V

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v5}, Leb/m;->a(Ljava/lang/Object;)V

    iget-object v4, v4, Leb/m;->a:Leb/k;

    invoke-virtual {v4}, Leb/k;->a()Leb/l;

    move-result-object v4

    const-string v5, "is_billing_update_flow"

    invoke-direct {v2, v5, v4}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v4, Leb/f;

    new-instance v5, Leb/m;

    invoke-direct {v5}, Leb/m;-><init>()V

    invoke-virtual {v5, v3}, Leb/m;->b(Leb/g1;)V

    iget-object v3, v5, Leb/m;->a:Leb/k;

    const/4 v6, 0x1

    iput-boolean v6, v3, Leb/k;->a:Z

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Leb/m;->a(Ljava/lang/Object;)V

    invoke-virtual {v3}, Leb/k;->a()Leb/l;

    move-result-object v3

    const-string v5, "billing_update_cvc"

    invoke-direct {v4, v5, v3}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    filled-new-array {v1, v2, v4}, [Leb/f;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "updateCard"

    invoke-direct {v0, v2, v1}, Lwz/e1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    sput-object v0, Lwz/b1;->d:Lwz/b1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lwz/b1;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x6dd3b260

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "UpdateCard"

    return-object v0
.end method
