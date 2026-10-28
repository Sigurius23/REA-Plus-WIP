.class public final Li63/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li63/w;


# static fields
.field public static final c:Li63/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li63/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li63/g;->c:Li63/g;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final c(Lc93/m;)V
    .locals 0

    invoke-static {p0, p1}, Lo73/a;->z(Li63/g;Lc93/m;)V

    return-void
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Li63/w;

    if-eqz v0, :cond_0

    check-cast p1, Li63/w;

    invoke-interface {p1}, Lo63/m;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Parameters "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
