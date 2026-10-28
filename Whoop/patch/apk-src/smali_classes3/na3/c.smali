.class public final Lna3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls93/b;


# static fields
.field public static final a:Lna3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lna3/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lna3/c;->a:Lna3/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No methods should be called on this descriptor. Only its presence matters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lva3/e;
    .locals 3

    invoke-static {p0}, Lcb3/e;->d(Ls93/b;)Lr93/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lnb3/l;->f(Lr93/k;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcb3/e;->c(Lr93/l;)Lva3/e;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final getSource()Lr93/s0;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No methods should be called on this descriptor. Only its presence matters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getType()Llb3/y;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No methods should be called on this descriptor. Only its presence matters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "[EnhancedType]"

    return-object v0
.end method
