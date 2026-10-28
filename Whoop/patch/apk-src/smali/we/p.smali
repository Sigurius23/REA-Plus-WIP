.class public abstract Lwe/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwe/o;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwe/o;-><init>(IZ)V

    sput-object v0, Lwe/p;->a:Lwe/o;

    return-void
.end method

.method public static final a(Lwe/e;)Lb3/b;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Lwe/j0;->a:Lwe/i0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lwe/i0;->b()Lwe/g0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lwe/j0;->a:Lwe/i0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lwe/i0;->a()Lwe/e0;

    move-result-object p0

    return-object p0
.end method
