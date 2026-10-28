.class public final Lns/m;
.super Lns/t;
.source "SourceFile"


# instance fields
.field public final a:Lns/k;

.field public final b:Lns/j;

.field public final c:Lns/i;

.field public final d:Lns/l;


# direct methods
.method public constructor <init>(Lns/k;Lns/j;Lns/i;Lns/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns/m;->a:Lns/k;

    iput-object p2, p0, Lns/m;->b:Lns/j;

    iput-object p3, p0, Lns/m;->c:Lns/i;

    iput-object p4, p0, Lns/m;->d:Lns/l;

    return-void
.end method

.method public static b()Lzt/q;
    .locals 3

    new-instance v0, Lzt/q;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzt/q;-><init>(IZ)V

    const/4 v1, 0x0

    iput-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->y:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->z:Ljava/lang/Object;

    sget-object v1, Lns/l;->d:Lns/l;

    iput-object v1, v0, Lzt/q;->E:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lns/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lns/m;

    iget-object v0, p0, Lns/m;->a:Lns/k;

    iget-object v2, p1, Lns/m;->a:Lns/k;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lns/m;->b:Lns/j;

    iget-object v2, p1, Lns/m;->b:Lns/j;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lns/m;->c:Lns/i;

    iget-object v2, p1, Lns/m;->c:Lns/i;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lns/m;->d:Lns/l;

    iget-object p1, p1, Lns/m;->d:Lns/l;

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lns/m;->c:Lns/i;

    iget-object v1, p0, Lns/m;->d:Lns/l;

    const-class v2, Lns/m;

    iget-object v3, p0, Lns/m;->a:Lns/k;

    iget-object v4, p0, Lns/m;->b:Lns/j;

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
